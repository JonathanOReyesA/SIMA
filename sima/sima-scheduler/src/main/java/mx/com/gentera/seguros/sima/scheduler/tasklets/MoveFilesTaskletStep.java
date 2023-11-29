package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.sql.Timestamp;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.common.sftp.services.ISftpService;
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
public class MoveFilesTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(MoveFilesTaskletStep.class);

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService serverService;

	@Autowired
	ISftpService sftpService;

	private SftpSessionBean filesSftpSession;

	private JobPropertiesBean jobPropertiesBean;

	private boolean isSuccess = false;

	@Autowired
	public MoveFilesTaskletStep(SftpSessionBean filesSftpSession) {
		this.filesSftpSession = filesSftpSession;
	}

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
		stepExecution.getJobExecution().getExecutionContext().put("startDate",
				new Timestamp(System.currentTimeMillis()));
	}

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		if (this.sftpService.listFilesMatchPattern(this.filesSftpSession, this.jobPropertiesBean.remoteSourceFolder,
				this.jobPropertiesBean.pattern).size() == 0) {
			log.info("No se encontraron archivos para procesar");
			return RepeatStatus.FINISHED;
		}
		if (this.sftpService.moveFilesMatchPattern(this.filesSftpSession, this.jobPropertiesBean.remoteSourceFolder,
				this.jobPropertiesBean.remoteTargetFolderDes, this.jobPropertiesBean.pattern).booleanValue()) {
			log.info("El paso mover archivos ha finalizando satisfactoriamente");
			this.isSuccess = true;
		} else {
			log.error("El paso mover archivo se ejecutcon errores, consultar log de proceso");
		}
		return RepeatStatus.FINISHED;
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (!this.isSuccess)
			return ExitStatus.NOOP;
		return ExitStatus.COMPLETED;
	}
}
