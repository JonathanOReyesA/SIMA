package mx.com.gentera.seguros.sima.scheduler.tasklets;

import mx.com.gentera.seguros.common.email.services.IEmailService;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
import mx.com.gentera.seguros.sima.scheduler.services.IServerService;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class ValidateCancelInsuranceTasklet implements Tasklet, StepExecutionListener {
	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService serverService;

	@Autowired
	IEmailService emailService;

	private JobPropertiesBean jobPropertiesBean;

	private Boolean noop = Boolean.valueOf(true);

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
		return RepeatStatus.FINISHED;
	}

	public void beforeStep(StepExecution stepExecution) {
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		return null;
	}
}