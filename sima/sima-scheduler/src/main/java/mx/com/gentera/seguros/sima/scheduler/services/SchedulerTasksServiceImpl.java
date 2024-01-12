package mx.com.gentera.seguros.sima.scheduler.services;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import javax.annotation.PostConstruct;
import mx.com.gentera.seguros.common.persistence.entities.sima.JobProperty;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.exceptions.InvalidCronExpressionException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.JobConfigurationNotExistsException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.JobImplementationNotExistsException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.ScheduledJobAlreadyExistsException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.ScheduledJobNotExistsException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.StopScheduledJobException;
import mx.com.gentera.seguros.sima.scheduler.model.MsgResponse;
//import mx.com.gentera.seguros.sima.scheduler.services.IJobLauncherService;
//import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
//import mx.com.gentera.seguros.sima.scheduler.services.IServerService;
import mx.com.gentera.seguros.sima.scheduler.tasks.RunnableTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTasksServiceImpl implements ISchedulerTaskService {
	private static final Logger log = LoggerFactory.getLogger(SchedulerTasksServiceImpl.class);

	@SuppressWarnings("rawtypes")
	private Map<String, ScheduledFuture> mapScheduledJobs = new HashMap<>();

	private Map<String, JobPropertiesBean> mapJobProperties = new HashMap<>();

	@Autowired
	ThreadPoolTaskScheduler threadPoolTaskScheduler;

	@Autowired
	IServerService serverService;

	@Autowired
	IJobLauncherService jobLaunchService;

	@Autowired
	Job sendFilesMX;

	@Autowired
	Job sendFilesGT;

	@Autowired
	Job sendFilesPE;

	@PostConstruct
	private void init() {
		log.info("Obteniendo configuracide Jobs a programar");
		List<String> lstJobNames = this.serverService.getJobNames();
		Collections.sort(lstJobNames, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
			
		});
		for (String jobName : lstJobNames) {
			JobPropertiesBean jobPropertiesBean = getJobPropertiesByName(jobName);
			this.mapJobProperties.put(jobName, jobPropertiesBean);
			if (jobPropertiesBean.scheduleOnStartup != null && jobPropertiesBean.scheduleOnStartup.booleanValue())
				try {
					scheduleJob(jobName, jobPropertiesBean.cronExpression);
				} catch (ScheduledJobAlreadyExistsException | InvalidCronExpressionException e) {
					log.error("No fue posible programar el job: {} - {}", jobName, e.getLocalizedMessage());
				}
		}
	}

	private void scheduleJob(String jobName, String cronExpression)
			throws ScheduledJobAlreadyExistsException, InvalidCronExpressionException {
		log.info("Registrando programación automática del job {}. Cron Expression: {}", jobName, cronExpression);
		if (this.mapScheduledJobs.containsKey(jobName))
			throw new ScheduledJobAlreadyExistsException("Ya existe una programaciactiva para el job: " + jobName);
		if (cronExpression == null)
			throw new InvalidCronExpressionException(
					"Debe especificar una expresicron para programar la ejecucidel job " + jobName);
		CronTrigger cronTrigger = new CronTrigger(cronExpression);
		this.mapScheduledJobs.put(jobName, this.threadPoolTaskScheduler
				.schedule((Runnable) new RunnableTask(jobName, this), (Trigger) cronTrigger));
	}

	public MsgResponse startScheduledJob(String jobName)
			throws ScheduledJobAlreadyExistsException, InvalidCronExpressionException {
		MsgResponse msgResponse = new MsgResponse();
		JobPropertiesBean jobPropertiesBean = getJobPropertiesByName(jobName);
		this.mapJobProperties.put(jobName, jobPropertiesBean);
		scheduleJob(jobName, jobPropertiesBean.cronExpression);
		msgResponse.setCode(Integer.valueOf(0));
		msgResponse.setDescription("El job " + jobName + " se programó correctamente");
		return msgResponse;
	}

	public MsgResponse stopScheduledJob(String jobName)
			throws ScheduledJobNotExistsException, StopScheduledJobException {
		MsgResponse msgResponse = new MsgResponse();
		if (!this.mapScheduledJobs.containsKey(jobName))
			throw new ScheduledJobNotExistsException("No existe una programación activa para el job: " + jobName);
		log.info("Deteniendo programación del job: {}", jobName);
		if (!this.mapScheduledJobs.get(jobName).cancel(false))
			throw new StopScheduledJobException("No fue posible detener la programación del job: " + jobName);
		this.mapScheduledJobs.remove(jobName);
		msgResponse.setCode(Integer.valueOf(0));
		msgResponse.setDescription("Se detuvo la programación del job " + jobName);
		return msgResponse;
	}


	@Async
	public MsgResponse executeJob(String jobName) throws JobConfigurationNotExistsException, JobImplementationNotExistsException {
		JobPropertiesBean jobPropertiesBean = getJobPropertiesByName(jobName);
		log.info("Execute Job: {}",jobName);
		if (jobPropertiesBean == null)
			throw new JobConfigurationNotExistsException("No se encontró la configuración para el job: " + jobName);
		
		return this.jobLaunchService.launchJobExecution(jobName, jobPropertiesBean, null, Boolean.valueOf(true));
	}

	public MsgResponse retryJob(String jobName, String uuid)
			throws JobConfigurationNotExistsException, JobImplementationNotExistsException {
		JobPropertiesBean jobPropertiesBean = getJobPropertiesByName(jobName);
		if (jobPropertiesBean == null)
			throw new JobConfigurationNotExistsException("No se encontró la configuracipara el job: " + jobName);
		return this.jobLaunchService.launchJobExecution(jobName, jobPropertiesBean, uuid, Boolean.valueOf(false));
	}

	@SuppressWarnings({ "unchecked" })
	public JobPropertiesBean getJobPropertiesByName(String jobName) {
		JobPropertiesBean jobPropertiesBean = null;
		List<JobProperty> lstJobProperties = this.serverService.findByIdJobName(jobName);
		if (!lstJobProperties.isEmpty())
			jobPropertiesBean = new JobPropertiesBean();
		for (JobProperty jobProperty : lstJobProperties) {
			try {
				Boolean result;
				Class<?> c = jobPropertiesBean.getClass();
				String fieldName = "";
				String subFieldName = "";
				if (jobProperty.getId().getPropertyName().contains(".")) {
					fieldName = jobProperty.getId().getPropertyName().substring(0,
							jobProperty.getId().getPropertyName().indexOf("."));
					subFieldName = jobProperty.getId().getPropertyName()
							.substring(jobProperty.getId().getPropertyName().indexOf(".") + 1);
				} else {
					fieldName = jobProperty.getId().getPropertyName();
				}
				Field campo = c.getDeclaredField(fieldName);
				switch (campo.getType().getName()) {
				case "java.lang.String":
					campo.set(jobPropertiesBean, jobProperty.getPropertyValue());
					continue;
				case "java.lang.Integer":
					campo.set(jobPropertiesBean, Integer.valueOf(Integer.parseInt(jobProperty.getPropertyValue())));
					continue;
				case "java.lang.Boolean":
					result = Boolean.valueOf(jobProperty.getPropertyValue().equalsIgnoreCase("true"));
					campo.set(jobPropertiesBean, result);
					continue;
				case "java.util.Map":
					((Map<String, String>) campo.get(jobPropertiesBean)).put(subFieldName,
							jobProperty.getPropertyValue());
					continue;
				}
				log.info("Tipo de dato no manejado: {}", campo.getType().getName());
			} catch (NoSuchFieldException x) {
				x.printStackTrace();
			} catch (IllegalAccessException x) {
				x.printStackTrace();
			}
		}
		return jobPropertiesBean;
	}

	public Boolean isScheduled(String jobName) {
		return Boolean.valueOf(this.mapScheduledJobs.containsKey(jobName));
	}

	public String getCronExpression(String jobName) {
		String cronExpression = null;
		JobPropertiesBean jobProperties = this.mapJobProperties.get(jobName);
		if (jobProperties != null)
			cronExpression = jobProperties.cronExpression;
		return cronExpression;
	}

	public String getNombreCronDescriptivo(String jobName) {
		String cronName = "";
		JobPropertiesBean jobProperties = this.mapJobProperties.get(jobName);
		if (jobProperties != null)
			cronName = jobProperties.nameCron;
		return cronName;
	}

	public List<JobProperty> getJobProperties(String jobName) throws JobConfigurationNotExistsException {
		List<JobProperty> lstJobProperties = this.serverService.findByIdJobName(jobName);
		if (lstJobProperties.isEmpty())
			throw new JobConfigurationNotExistsException("No se encontró la configuracipara el job: " + jobName);
		return lstJobProperties;
	}

	public List<JobProperty> saveJobProperties(String jobName, List<JobProperty> lstJobProperties)
			throws JobConfigurationNotExistsException {
		List<JobProperty> oldLstJobProperties = this.serverService.findByIdJobName(jobName);
		if (oldLstJobProperties.isEmpty())
			throw new JobConfigurationNotExistsException("No se encontró la configuracipara el job: " + jobName);
		for (JobProperty jobProperty : lstJobProperties)
			this.serverService.saveJobProperty(jobProperty);
		List<JobProperty> newLstJobProperties = this.serverService.findByIdJobName(jobName);
		return newLstJobProperties;
	}
}