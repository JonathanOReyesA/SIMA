package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.exceptions.SftpSendingException;
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
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class SFTPTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(SFTPTaskletStep.class);

	@Autowired
	private IServerService serverService;

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	private SftpSessionBean sftpSession;
	private JobPropertiesBean jobPropertiesBean;
	private List<String> lstFile = new ArrayList<>();
	private boolean sendFail;

	@Autowired
	public SFTPTaskletStep(SftpSessionBean sftpSession) {
		this.sftpSession = sftpSession;
	}

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws IOException,
			StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException, SftpSendingException {
		log.info("Enviando archivos al servidor sftp {}", this.sftpSession.getName());
		this.sendFail = !this.serverService
				.uploadFiles(this.sftpSession, this.lstFile,
						(String) this.jobPropertiesBean.remoteTargetFolder.get(this.sftpSession.getName()))
				.booleanValue();
		return RepeatStatus.FINISHED;
	}

	@SuppressWarnings("unchecked")
	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
		ExecutionContext jobContext = stepExecution.getJobExecution().getExecutionContext();
		this.lstFile = (List<String>) jobContext.get("lstFile");
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (this.sendFail)
			return ExitStatus.FAILED;
		return ExitStatus.COMPLETED;
	}
}