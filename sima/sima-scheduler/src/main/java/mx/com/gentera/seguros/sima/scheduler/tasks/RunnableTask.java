package mx.com.gentera.seguros.sima.scheduler.tasks;

import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnableTask implements Runnable {
	private static final Logger log = LoggerFactory.getLogger(RunnableTask.class);

	private String jobName;

	private ISchedulerTaskService schedulerTaskService;

	public RunnableTask(String jobName, ISchedulerTaskService schedulerTaskService) {
		this.jobName = jobName;
		this.schedulerTaskService = schedulerTaskService;
	}

	public void run() {
		log.info("Iniciando la ejecucidel Job {}", this.jobName);
		try {
			this.schedulerTaskService.executeJob(this.jobName);
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}
}
