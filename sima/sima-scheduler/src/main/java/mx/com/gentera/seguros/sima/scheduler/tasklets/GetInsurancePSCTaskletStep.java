package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.seguros.common.email.services.IEmailService;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
import mx.com.gentera.seguros.sima.scheduler.services.IServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class GetInsurancePSCTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(GetInsurancePSCTaskletStep.class);

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService serverService;

	@Autowired
	IEmailService emailService;
	
	private JobPropertiesBean jobPropertiesBean;
	private List<String> lstInsurance = new ArrayList<>();
	private Boolean noop = Boolean.valueOf(true);

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (this.noop.booleanValue())
			return ExitStatus.NOOP;
		return ExitStatus.COMPLETED;
	}

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("startDate",
				new Timestamp(System.currentTimeMillis()));
		log.info("Ejecutando Stored Procedure {}", this.jobPropertiesBean.storedProcedureName);
		List<Object> values = new ArrayList<Object>();
		log.info("Records por obtener :" + this.jobPropertiesBean.recordsPerCall);
		values.add(this.jobPropertiesBean.recordsPerCall);
		this.lstInsurance = this.serverService.getLstInsurance(this.jobPropertiesBean.storedProcedureName, values);
		log.info("Registros encontrados: {}", Integer.valueOf(this.lstInsurance.size()));
		this.noop = Boolean.valueOf(!(this.lstInsurance.size() > 0));
		chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("lstInsuranceRobo",
				this.lstInsurance);
		return RepeatStatus.FINISHED;
	}
}