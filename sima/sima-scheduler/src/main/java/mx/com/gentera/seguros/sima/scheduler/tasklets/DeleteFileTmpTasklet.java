package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class DeleteFileTmpTasklet implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(DeleteFileTmpTasklet.class);

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService serverService;

	@Autowired
	ISftpService sftpService;

	private JobPropertiesBean jobPropertiesBean;

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		return ExitStatus.COMPLETED;
	}

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		File file = new File(this.jobPropertiesBean.localSourceFolder);
		for (String f : file.list()) {
			FileSystemResource fileSystemResource = new FileSystemResource(
					this.jobPropertiesBean.localSourceFolder + "/" + f);
			try {
				Files.delete(fileSystemResource.getFile().toPath());
				log.info("Archivo {} temporal eliminado", f);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return RepeatStatus.FINISHED;
	}
}