package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javassist.NotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.exceptions.SftpSendingException;
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
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class FolderClaimTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(FolderClaimTaskletStep.class);

	@Autowired
	IServerService serverService;

	@Autowired
	private ISchedulerTaskService schedulerTaskService;

	private JobPropertiesBean jobPropertiesBean;

	private List<ClaimItem> lstClaimItem = new ArrayList<>();

	private List<String> lstFile = new ArrayList<>();

	private List<String> lstFolder = new ArrayList<>();

	private SftpSessionBean sourceSftpSession;

	private SftpSessionBean targetSftpSession;

	@Autowired
	public FolderClaimTaskletStep(SftpSessionBean sourceSftpSession, SftpSessionBean targetSftpSession) {
		this.sourceSftpSession = sourceSftpSession;
		this.targetSftpSession = targetSftpSession;
	}

	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext)
			throws IOException, StoredProcedureConfigurationNotFoundException,
			StoredProcedureParametersNotMatchException, StoredProcedureParametersTypesMismatchException,
			UnexpectedResponseCodeException, NotFoundException, SftpSendingException {
		log.info("Iniciando envde carpetas");
		Map<String, Map<String, Boolean>> mapResultSend = new HashMap<>();
		for (ClaimItem claimItem : this.lstClaimItem) {
			List<String> lstFile = new ArrayList<>();
			List<String> lstFileLocal = new ArrayList<>();
			Map<String, Boolean> mapFolderSend = new HashMap<>();
			File folderClaim = new File(
					this.jobPropertiesBean.localTargetFolder.concat(claimItem.getName()).concat("/"));
			if (!folderClaim.exists())
				folderClaim.mkdirs();
			lstFile = this.serverService.getLstFile(this.sourceSftpSession,
					this.jobPropertiesBean.remoteSourceFolder.concat("/").concat(claimItem.getName()));
			for (String fileNamePath : lstFile) {
				String fileName = fileNamePath.substring(fileNamePath.lastIndexOf("/"));
				String fileNamePathLocal = this.jobPropertiesBean.localTargetFolder.concat(claimItem.getName())
						.concat(fileName);
				if (this.serverService.downloadFile(this.sourceSftpSession, fileNamePath, fileNamePathLocal)
						.booleanValue())
					lstFileLocal.add(fileNamePathLocal);
			}
			String filesSend = "";
			String filesSent = "";
			for (String fileName : lstFile) {
				if (filesSend.length() > 0)
					filesSend = filesSend.concat(", ");
				filesSend = filesSend.concat(fileName.substring(fileName.lastIndexOf("/") + 1));
			}
			mapFolderSend = this.serverService.uploadFilesMap(this.targetSftpSession, lstFileLocal,
					((String) this.jobPropertiesBean.remoteTargetFolder.get("MAPFRE")).concat(claimItem.getName()));
			Boolean resultClaimSend = Boolean.valueOf(true);
			String descError = "";
			for (Map.Entry<String, Boolean> entry : mapFolderSend.entrySet()) {
				if (((Boolean) entry.getValue()).booleanValue()) {
					if (filesSent.length() > 0)
						filesSent = filesSent.concat(", ");
					filesSent = filesSent.concat(
							((String) entry.getKey()).substring(((String) entry.getKey()).lastIndexOf("/") + 1));
					continue;
				}
				resultClaimSend = Boolean.valueOf(false);
				descError = entry.getKey();
			}
			mapResultSend.put(claimItem.getName(), mapFolderSend);
			log.info("Ejecutando Stored Procedure {}", this.jobPropertiesBean.storedProcedureNameDetail);
			List<Object> valuesDetail = new ArrayList<Object>();
			valuesDetail.add(chunkContext.getStepContext().getStepExecution().getJobExecution().getJobParameters()
					.getString("uuid"));
			valuesDetail.add(claimItem.getName());
			valuesDetail.add(filesSend);
			valuesDetail.add(filesSent);
			valuesDetail.add(Integer.valueOf(resultClaimSend.booleanValue() ? 0 : 1));
			valuesDetail.add(resultClaimSend.booleanValue() ? "Exito"
					: ((descError.length() < 200) ? descError : "Error en al subir archivos"));
			this.serverService.executeSP_SIMA(this.jobPropertiesBean.storedProcedureNameDetail, valuesDetail);
			if (resultClaimSend.booleanValue()) {
				log.info("Ejecutando Stored Procedure {}", this.jobPropertiesBean.byItemStoredProcedureName);
				List<Object> valuesClaim = new ArrayList<Object>();
				valuesClaim.add(claimItem.getName());
				valuesClaim.add(this.jobPropertiesBean.partnerId);
				this.serverService.executeSP_SIMA(this.jobPropertiesBean.byItemStoredProcedureName, valuesClaim);
			}
		}
		for (Map.Entry<String, Map<String, Boolean>> entry : mapResultSend.entrySet()) {
			for (Map.Entry<String, Boolean> entryDetail : (Iterable<Map.Entry<String, Boolean>>) (entry.getValue())
					.entrySet()) {
				if (((Boolean) entryDetail.getValue()).booleanValue())
					this.lstFile.add(entryDetail.getKey());
			}
			this.lstFolder.add(this.jobPropertiesBean.localTargetFolder.concat(entry.getKey()));
		}
		chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("lstFile",
				this.lstFile);
		chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("lstFolder",
				this.lstFolder);
		return RepeatStatus.FINISHED;
	}

	@SuppressWarnings("unchecked")
	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
		ExecutionContext jobContext = stepExecution.getJobExecution().getExecutionContext();
		this.lstClaimItem = (List<ClaimItem>) jobContext.get("lstClaimItem");
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (this.lstFile.isEmpty())
			return ExitStatus.FAILED;
		return ExitStatus.COMPLETED;
	}
}
