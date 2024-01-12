package mx.com.gentera.seguros.sima.scheduler.services;

import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.exceptions.JobImplementationNotExistsException;
import mx.com.gentera.seguros.sima.scheduler.model.JobExecutionItem;
import mx.com.gentera.seguros.sima.scheduler.model.JobExecutionsHistory;
import mx.com.gentera.seguros.sima.scheduler.model.MsgResponse;
//import mx.com.gentera.seguros.sima.scheduler.services.IJobLauncherService;
//import mx.com.gentera.seguros.sima.scheduler.services.IServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobLauncherServiceImpl implements IJobLauncherService {
	private static final Logger log = LoggerFactory.getLogger(JobLauncherServiceImpl.class);

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	IServerService serverService;

	@Autowired
	Job sendFilesMX;

	@Autowired
	Job sendFilesGT;

	@Autowired
	Job sendFilesPE;

	@Autowired
	Job insuranceExpiration;

	@Autowired
	Job sendFilesRoboMX;

	@Autowired
	Job debugErrors;

	@Autowired
	Job createInsurance;

	@Autowired
	Job sendFilesClaimMX;

	@Autowired
	Job createInsuranceRobo;

	@Autowired
	Job createInsuranceRoboBatch;

	@Autowired
	Job updateBPMX;

	@Autowired
	Job updateBPGT;

	@Autowired
	Job transferMXCartera;

	@Autowired
	Job transferGTCartera;

	@Autowired
	Job cancelInsurancePE;

	@Autowired
	Job createInsurancePE;

	@Autowired
	Job createInsuranceVoluntarioBatch;

	@Autowired
	Job createInsuranceBasicoBatch;

	public MsgResponse launchJobExecution(String jobName, JobPropertiesBean jobPropertiesBean, String uuid,
			Boolean allowRetry) throws JobImplementationNotExistsException {
		
		Job job;
		MsgResponse msgResponse = new MsgResponse();
		String uuidStr = "";
		String status = "";
		JobParameters jobParameters = new JobParameters();
		switch (jobName) {
		case "sendFilesMX":
			job = this.sendFilesMX;
			break;
		case "sendFilesGT":
			job = this.sendFilesGT;
			break;
		case "sendFilesPE":
			job = this.sendFilesPE;
			break;
		case "insuranceExpiration":
			job = this.insuranceExpiration;
			break;
		case "debugErrors":
			job = this.debugErrors;
			break;
		case "createInsurance":
			job = this.createInsurance;
			break;
		case "sendFilesClaimMX":
			job = this.sendFilesClaimMX;
			break;
		case "createInsuranceRobo":
			job = this.createInsuranceRobo;
			break;
		case "sendFilesRoboMX":
			job = this.sendFilesRoboMX;
			break;
		case "createInsuranceRoboBatch":
			job = this.createInsuranceRoboBatch;
			break;
		case "updateBPMX":
			job = this.updateBPMX;
			break;
		case "updateBPGT":
			job = this.updateBPGT;
			break;
		case "transferMXCartera":
			job = this.transferMXCartera;
			break;
		case "transferGTCartera":
			job = this.transferGTCartera;
			break;
		case "cancelInsurancePE":
			job = this.cancelInsurancePE;
			break;
		case "createInsurancePE":
			job = this.createInsurancePE;
			break;
		case "createInsuranceVoluntarioBatch":
			job = this.createInsuranceVoluntarioBatch;
			break;
		case "createInsuranceBasicoBatch":
			job = this.createInsuranceBasicoBatch;
			break;
		default:
			throw new JobImplementationNotExistsException("No se encontró la implementación para el Job: " + jobName);
		}
		try {
			int retries = 0;
			int secondsBeforeRetry = 60;
			int attempts = 0;
			if (this.serverService.isJobRunning(jobName).booleanValue()) {
				msgResponse.setCode(Integer.valueOf(-1));
				msgResponse.setDescription(
						"No es posible la ejecución del Job puesto que actualmente existe una ejecuciactiva");
				return msgResponse;
			}
			if (jobPropertiesBean.retries != null)
				retries = jobPropertiesBean.retries.intValue();
			if (jobPropertiesBean.secondsBeforeRetry != null)
				secondsBeforeRetry = jobPropertiesBean.secondsBeforeRetry.intValue();
			JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
			if (uuid == null) {
				UUID newUuid = UUID.randomUUID();
				uuidStr = newUuid.toString().toUpperCase();
			} else {
				uuidStr = uuid.toUpperCase();
				if (!this.serverService.existsJob(jobName, uuidStr).booleanValue()) {
					msgResponse.setCode(Integer.valueOf(-1));
					msgResponse.setDescription("Error: No existe un Job con id " + uuidStr + " de tipo " + jobName);
					return msgResponse;
				}
			}
			
			jobParametersBuilder.addString("uuid", uuidStr);
			jobParameters = jobParametersBuilder.toJobParameters();
			do {
				if (attempts > 0)
					TimeUnit.SECONDS.sleep(secondsBeforeRetry);
				attempts++;
				JobExecution jobExecution = this.jobLauncher.run(job, jobParameters);
				status = jobExecution.getStatus().getBatchStatus().toString();
				
				if (jobExecution.getStatus().compareTo(BatchStatus.COMPLETED) == 0) {
					msgResponse.setCode(Integer.valueOf(0));
				} else {
					msgResponse.setCode(Integer.valueOf(-1));
				}
				msgResponse.setDescription(
						jobExecution.getExitStatus().getExitCode() + jobExecution.getExitStatus().getExitDescription());
				
				log.info("response : {}", msgResponse.toString());
				
			} while (msgResponse.getCode().compareTo(Integer.valueOf(0)) != 0 && attempts <= retries
					&& allowRetry.booleanValue());
			
		} catch (JobExecutionAlreadyRunningException | org.springframework.batch.core.repository.JobRestartException
				| org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException
				| org.springframework.batch.core.JobParametersInvalidException | InterruptedException e) {
			msgResponse.setCode(Integer.valueOf(-1));
			msgResponse.setDescription(e.toString());
		}

		if (msgResponse.getCode().compareTo(Integer.valueOf(0)) != 0) {
			StringBuilder sb = new StringBuilder();
			sb.append("<p>Ocurrió un error durante la ejecució del Job <strong>[" + jobName + "]</strong></p>")
					.append(System.lineSeparator());
			sb.append("<p>Id: <strong>[" + uuidStr + "]</strong><br>");
			sb.append("<br>Properties: [" + jobPropertiesBean.toString() + "]<br>");
			sb.append("<br>Status: <strong>[" + status + "]</strong></p><br>");
			sb.append("<br><strong>Historial de ejecuciones</strong><br>");
			JobExecutionsHistory jobExecutionsHistory = this.serverService.getJobExecutionsHistory(jobName, uuidStr,
					Boolean.valueOf(true));
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
			for (JobExecutionItem jobExecutionItem : jobExecutionsHistory.getLstJobExecution()) {
				sb.append("<br>Inicio: " + sdf.format(jobExecutionItem.getStartDate()) + "; Fin: "
						+ sdf.format(jobExecutionItem.getEndDate()) + "; Status: " + jobExecutionItem.getStatus()
						+ "<br>");
				sb.append("<br>" + jobExecutionItem.getExitDescription() + "<br>");
			}
			this.serverService.sendEmail(jobPropertiesBean.destinationEmailError,
					"Error en la ejecucidel Job [" + jobName + "] con id: [" + uuidStr + "]", sb.toString(), null);
		}
		
		log.info("El job {} ha finalizado", jobName);
		return msgResponse;
	}
}
