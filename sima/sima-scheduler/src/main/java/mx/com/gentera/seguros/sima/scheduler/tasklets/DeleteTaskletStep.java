package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.SftpSendingException;
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
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class DeleteTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(DeleteTaskletStep.class);

	@Autowired
	IServerService serverService;

	private List<String> lstFile = new ArrayList<>();

	private List<String> lstFolder = new ArrayList<>();

	private boolean deleteFail;

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws IOException,
			StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException, SftpSendingException {
		log.info("Eliminando archivos temporales del servidor local");
		this.deleteFail = (this.serverService.deleteFiles(this.lstFile).booleanValue()
				|| this.serverService.deleteFiles(this.lstFolder).booleanValue());
		return RepeatStatus.FINISHED;
	}

	@SuppressWarnings("unchecked")
	public void beforeStep(StepExecution stepExecution) {
		ExecutionContext jobContext = stepExecution.getJobExecution().getExecutionContext();
		this.lstFile = (List<String>) jobContext.get("lstFile");
		this.lstFolder = ((List<?>) jobContext.get("lstFolder") != null) ? (List<String>) jobContext.get("lstFolder")
				: this.lstFolder;
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (this.deleteFail)
			return ExitStatus.FAILED;
		return ExitStatus.COMPLETED;
	}
}