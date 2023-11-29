package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.util.List;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.common.sftp.services.ISftpService;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.model.FileName;
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
import org.springframework.core.io.FileSystemResource;

public class ValidFormatFilePETasklet implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(ValidFormatFilePETasklet.class);

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService serverService;

	@Autowired
	ISftpService sftpService;

	private SftpSessionBean filesSftpSession;

	private JobPropertiesBean jobPropertiesBean;

	private boolean isSuccess = true;

	@Autowired
	public ValidFormatFilePETasklet(SftpSessionBean filesSftpSession) {
		this.filesSftpSession = filesSftpSession;
	}

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (!this.isSuccess)
			return ExitStatus.NOOP;
		return ExitStatus.COMPLETED;
	}

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		List<String> lstFiles = this.sftpService.listFilesMatchPattern(this.filesSftpSession,
				this.jobPropertiesBean.remoteSourceFolder, this.jobPropertiesBean.pattern);
		for (String f : lstFiles) {
			FileSystemResource fileSystemResource = new FileSystemResource(f);
			log.info("El archivo es " + fileSystemResource.getFilename());
			if (!isValidFile(fileSystemResource.getFilename())) {
				log.info("Error en el nombre del archivo.. se mueve a carpeta de errores");
				this.sftpService.moveFilesMatchPattern(this.filesSftpSession, this.jobPropertiesBean.remoteSourceFolder,
						this.jobPropertiesBean.remoteTargetFolderError, f);
				this.isSuccess = false;
			}
		}
		return RepeatStatus.FINISHED;
	}

	private boolean isValidFile(String f) {
		try {
			FileName fn = new FileName(f.split("_"), this.jobPropertiesBean.sufix);
			return fn.validaFormat();
		} catch (Exception e) {
			log.error("Error en la validacion de archivo. " + e.getMessage());
			return false;
		}
	}
}