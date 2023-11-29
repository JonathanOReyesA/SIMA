package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
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
public class GetDataFromFileTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory
			.getLogger(GetDataFromFileTaskletStep.class);

	@Autowired
	IServerService serverService;

	List<String> lstFiles = new ArrayList<>();

	List<String> lstFileLocal = new ArrayList<>();

	private JobPropertiesBean jobPropertiesBean;

	private SftpSessionBean filesSftpSession;

	boolean isSucces = false;

	ChunkContext chunkContext = null;

	@Autowired
	private ISchedulerTaskService schedulerTaskService;

	public GetDataFromFileTaskletStep(SftpSessionBean filesSftpSession) {
		this.filesSftpSession = filesSftpSession;
	}

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
		this.lstFiles = this.serverService.getLstFile(this.filesSftpSession,
				this.jobPropertiesBean.remoteTargetFolderDes);
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (this.isSucces) {
			this.chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("lstFile",
					this.lstFileLocal);
			this.chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext()
					.put("existData", Boolean.valueOf(true));
			log.info("Paso terminado con exito, se colocan los archivos en la carpeta temporal local");
			return ExitStatus.COMPLETED;
		}
		this.chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("existData",
				Boolean.valueOf(false));
		log.error("El proceso para obtener la informacidel servidor ha fallado");
		return ExitStatus.NOOP;
	}

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		this.chunkContext = chunkContext;
		log.info("Ejecuccidel paso para obtener los archivos del servidor remoto al local");
		for (String fileNamePath : this.lstFiles) {
			String fileName = fileNamePath.substring(fileNamePath.lastIndexOf("/"));
			if (this.serverService.downloadFile(this.filesSftpSession, fileNamePath,
					this.jobPropertiesBean.localSourceFolder + fileName).booleanValue()) {
				this.lstFileLocal.add(this.jobPropertiesBean.localSourceFolder + fileName);
				this.isSucces = true;
				continue;
			}
			log.error("El archivo {} no se puedo descargar, favor de revisar el log", fileNamePath);
		}
		return RepeatStatus.FINISHED;
	}
}