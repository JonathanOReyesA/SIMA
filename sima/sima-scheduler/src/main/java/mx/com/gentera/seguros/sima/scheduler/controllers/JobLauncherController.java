package mx.com.gentera.seguros.sima.scheduler.controllers;

import java.util.List;
import mx.com.gentera.seguros.common.persistence.entities.sima.JobProperty;
import mx.com.gentera.seguros.sima.scheduler.model.JobExecutionsHistory;
import mx.com.gentera.seguros.sima.scheduler.model.MsgResponse;
import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
import mx.com.gentera.seguros.sima.scheduler.services.IServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class JobLauncherController {
	private static final Logger log = LoggerFactory.getLogger(JobLauncherController.class);

	@Autowired
	ISchedulerTaskService schedulerTasks;

	@Autowired
	IServerService serverService;

	@RequestMapping(value = { "/history/job/{jobName}" }, method = { RequestMethod.GET })
	@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<List<JobExecutionsHistory>> getJobExecutionsHistory(@PathVariable("jobName") String jobName)
			throws Exception {

		List<JobExecutionsHistory> lstJobExecutionsHistory = this.serverService.getAllJobExecutionsHistory(jobName);
		return ResponseEntity.ok(lstJobExecutionsHistory);
	}

	@RequestMapping(value = { "/{jobName}/start" }, method = { RequestMethod.GET })
	@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<MsgResponse> startScheduledJob(@PathVariable("jobName") String jobName) throws Exception {

		log.info("Iniciando programación del job {} por peticiREST", jobName);
		MsgResponse msgResponse = this.schedulerTasks.startScheduledJob(jobName);
		return ResponseEntity.ok(msgResponse);
	}

	@RequestMapping(value = { "/{jobName}/stop" }, method = { RequestMethod.GET })
	@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<MsgResponse> stopScheduledJob(@PathVariable("jobName") String jobName) throws Exception {

		log.info("Deteniendo programación del job {} por peticiREST", jobName);
		MsgResponse msgResponse = this.schedulerTasks.stopScheduledJob(jobName);
		return ResponseEntity.ok(msgResponse);
	}

	@RequestMapping(value = { "/{jobName}/execute" }, method = { RequestMethod.GET })
	@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<MsgResponse> executeJob(@PathVariable("jobName") String jobName) throws Exception {

		log.info("Iniciando la ejecución del job {} por peticiREST", jobName);
		MsgResponse msgResponse = this.schedulerTasks.executeJob(jobName);
		return ResponseEntity.ok(msgResponse);
	}

	@RequestMapping(value = { "/{jobName}/retry/{uuid}" }, method = { RequestMethod.GET })
	@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<MsgResponse> retryJob(@PathVariable("jobName") String jobName,
			@PathVariable("uuid") String uuid) throws Exception {

		log.info("Iniciando de nueva cuenta la ejecucidel job {} con uuid {} por peticiREST", jobName, uuid);
		MsgResponse msgResponse = this.schedulerTasks.retryJob(jobName, uuid);
		return ResponseEntity.ok(msgResponse);
	}

	@RequestMapping(value = { "/{jobName}/properties" }, method = { RequestMethod.GET })
	@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<List<JobProperty>> getJobProperties(@PathVariable("jobName") String jobName)
			throws Exception {

		log.info("Obteniendo la configuracidel job {} por peticiREST", jobName);
		List<JobProperty> lstJobProperties = this.schedulerTasks.getJobProperties(jobName);
		return ResponseEntity.ok(lstJobProperties);
	}

	@RequestMapping(value = { "/{jobName}/properties" }, method = { RequestMethod.POST })
	@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<List<JobProperty>> saveJobProperties(@PathVariable("jobName") String jobName,
			@RequestBody List<JobProperty> lstJobProperties) throws Exception {

		log.info("Almacenando la configuracidel job {} por peticiREST", jobName);
		List<JobProperty> newLstJobProperties = this.schedulerTasks.saveJobProperties(jobName, lstJobProperties);
		return ResponseEntity.ok(newLstJobProperties);
	}
}
