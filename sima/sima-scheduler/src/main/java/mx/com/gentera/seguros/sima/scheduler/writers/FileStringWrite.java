package mx.com.gentera.seguros.sima.scheduler.writers;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.common.sftp.services.ISftpService;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
import mx.com.gentera.seguros.sima.scheduler.services.IServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.batch.item.file.transform.PassThroughLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class FileStringWrite implements ItemWriter<String>, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(FileStringWrite.class);

	private static final String ENCODING = "Cp1252";

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService serverService;

	@Autowired
	ISftpService sftpService;

	private SftpSessionBean dbSftpSession;
	private SftpSessionBean filesSftpSession;
	List<String> lstFileLocal = new ArrayList<>();
	List<String> itemReader = new ArrayList<>();
	private JobPropertiesBean jobPropertiesBean;
	private Resource resource;
	private String fileOrigin = "";

	FlatFileItemWriter<String> fileWrite = new FlatFileItemWriter<String>();

	public FileStringWrite(SftpSessionBean dbSftpSession, SftpSessionBean filesSftpSession) {
		this.dbSftpSession = dbSftpSession;
		this.filesSftpSession = filesSftpSession;
	}

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
		this.resource = (Resource) new FileSystemResource(
				this.jobPropertiesBean.localSourceFolder + "/" + this.jobPropertiesBean.remoteFileDB);
		this.fileWrite.setEncoding("Cp1252");
		this.fileWrite.setResource(this.resource);
		this.fileWrite.setLineAggregator((LineAggregator<String>) new PassThroughLineAggregator<String>());
		this.fileWrite.open(stepExecution.getExecutionContext());
		this.fileOrigin = (String) stepExecution.getJobExecution().getExecutionContext().get("fileToWrite");
	}

	public void write(List<? extends String> items) throws Exception {
		this.fileWrite.write(items);
		log.info("Registros procesados : {}", Integer.valueOf(items.size()));
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		boolean isSuccess = true;
		this.fileWrite.close();
		try {
			this.serverService.uploadFiles(this.dbSftpSession,
					Arrays.asList(new String[] { this.resource.getFile().getPath() }),
					this.jobPropertiesBean.remoteTargetDB);
			this.serverService.executeSP_SIMA(this.jobPropertiesBean.storedProcedureName, null);
			this.sftpService.moveFilesMatchPattern(this.filesSftpSession, this.jobPropertiesBean.remoteTargetFolderDes,
					this.jobPropertiesBean.remoteTargetFolderProcessed, this.fileOrigin);
		} catch (Exception e) {
			log.error(e.getMessage());
			isSuccess = false;
			this.sftpService.moveFilesMatchPattern(this.filesSftpSession, this.jobPropertiesBean.remoteTargetFolderDes,
					this.jobPropertiesBean.remoteTargetFolderError, this.fileOrigin);
		} finally {
			deleteFile();
		}
		return isSuccess ? ExitStatus.COMPLETED : ExitStatus.FAILED;
	}

	private void deleteFile() {
		try {
			log.info("Eliminando el archivo {}", this.resource.getFilename());
			Files.delete(this.resource.getFile().toPath());
		} catch (IOException e) {
			log.error("No se pudo eliminar el archivo {}", this.resource.getFilename());
		}
	}
}
