package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.model.CifrasControl;
import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
import mx.com.gentera.seguros.sima.scheduler.services.IServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateInsuranceDBLKTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(CreateInsuranceDBLKTaskletStep.class);

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService serverService;

	private JobPropertiesBean jobPropertiesBean;

	private Boolean noop = Boolean.valueOf(true);

	private Timestamp startDate = null;

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
		this.startDate = new Timestamp(System.currentTimeMillis());
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (this.noop.booleanValue())
			return ExitStatus.NOOP;
		return ExitStatus.COMPLETED;
	}

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		log.info("Ejecutando Stored Procedure {}", this.jobPropertiesBean.storedProcedureName);
		insertCifrasControl(this.serverService.executeAltaRoboBatch(this.jobPropertiesBean.storedProcedureName, null));
		this.noop = Boolean.valueOf(false);
		return RepeatStatus.FINISHED;
	}

	private void insertCifrasControl(CifrasControl cfc)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		List<Object> values = new ArrayList<Object>();
		values.add(cfc.getpFileId());
		values.add(cfc.getpRegLei());
		values.add(cfc.getpRegProc());
		values.add(cfc.getpRegReject());
		values.add(this.startDate);
		values.add(new Timestamp(System.currentTimeMillis()));
		this.serverService.executeSP_SIMA(this.jobPropertiesBean.afterStepStoredProcedureName, values);
	}
}
