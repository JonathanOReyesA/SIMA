package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javassist.NotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.model.ClaimItem;
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
public class SendFilesClaimSPTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(SendFilesClaimSPTaskletStep.class);

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService serverService;

	private JobPropertiesBean jobPropertiesBean;
	private List<ClaimItem> lstClaimItem = new ArrayList<>();

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws IOException,
			StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException, NotFoundException {
		log.info("Ejecutando Stored Procedure {}", this.jobPropertiesBean.storedProcedureName);
		List<Object> values = new ArrayList<Object>();
		values.add(this.jobPropertiesBean.partnerId);
		this.lstClaimItem = this.serverService.getLstClaimItem(this.jobPropertiesBean.storedProcedureName, values);
		log.info("Archivos encontrados: {}", Integer.valueOf(this.lstClaimItem.size()));
		log.info("Ejecutando Stored Procedure {}", this.jobPropertiesBean.storedProcedureNameHeader);
		List<Object> valuesHeader = new ArrayList<Object>();
		valuesHeader.add(chunkContext.getStepContext().getStepExecution().getJobExecution().getJobParameters()
				.getString("uuid"));
		valuesHeader.add(new Date());
		valuesHeader.add(this.jobPropertiesBean.partnerId);
		valuesHeader.add(Integer.valueOf(this.lstClaimItem.size()));
		this.serverService.executeSP_SIMA(this.jobPropertiesBean.storedProcedureNameHeader, valuesHeader);
		for (ClaimItem claimItem : this.lstClaimItem) {
			log.info("Ejecutando Stored Procedure {}", this.jobPropertiesBean.storedProcedureNameDetail);
			List<Object> valuesDetail = new ArrayList<Object>();
			valuesDetail.add(chunkContext.getStepContext().getStepExecution().getJobExecution().getJobParameters()
					.getString("uuid"));
			valuesDetail.add(claimItem.getName());
			valuesDetail.add(null);
			valuesDetail.add(null);
			valuesDetail.add(null);
			valuesDetail.add(null);
			this.serverService.executeSP_SIMA(this.jobPropertiesBean.storedProcedureNameDetail, valuesDetail);
		}
		chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("lstClaimItem",
				this.lstClaimItem);
		return RepeatStatus.FINISHED;
	}

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (this.lstClaimItem.isEmpty())
			return ExitStatus.NOOP;
		return ExitStatus.COMPLETED;
	}
}