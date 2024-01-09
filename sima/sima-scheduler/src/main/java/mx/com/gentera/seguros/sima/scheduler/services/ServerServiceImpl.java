package mx.com.gentera.seguros.sima.scheduler.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.mail.MessagingException;
import mx.com.gentera.seguros.common.email.services.IEmailService;
import mx.com.gentera.seguros.common.persistence.entities.sima.JobProperty;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.model.MsgResponse;
import mx.com.gentera.seguros.common.persistence.repositories.sima.JobPropertyRepository;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.common.sftp.services.ISftpService;
import mx.com.gentera.seguros.common.zip.services.IZipService;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.exceptions.SftpSendingException;
import mx.com.gentera.seguros.sima.scheduler.mappers.GenericRowMapper;
import mx.com.gentera.seguros.sima.scheduler.model.CifrasControl;
import mx.com.gentera.seguros.sima.scheduler.model.ClaimItem;
import mx.com.gentera.seguros.sima.scheduler.model.ErrorFilePE;
import mx.com.gentera.seguros.sima.scheduler.model.FileItem;
import mx.com.gentera.seguros.sima.scheduler.model.InsuranceItem;
import mx.com.gentera.seguros.sima.scheduler.model.JobExecutionItem;
import mx.com.gentera.seguros.sima.scheduler.model.JobExecutionsHistory;
//import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
//import mx.com.gentera.seguros.sima.scheduler.services.IServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class ServerServiceImpl implements IServerService {
	private static final Logger log = LoggerFactory.getLogger(ServerServiceImpl.class);

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	private IZipService zipService;

	@Autowired
	private ISftpService sftpService;

	@Autowired
	private IEmailService emailService;

	@Autowired
	private IPersistenceService persistenceService;

	@Autowired
	JobPropertyRepository jobPropertyRepository;

	@Autowired
	JobExplorer jobExplorer;

	public List<String> getJobNames() {
		return this.jobPropertyRepository.getJobNames();
	}

	public List<JobProperty> findByIdJobName(String jobName) {
		return this.jobPropertyRepository.findByIdJobName(jobName);
	}

	@SuppressWarnings("unchecked")
	public List<FileItem> getLstFileItem(String storedProcedureName, List<Object> values, int producto)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		List<FileItem> lstFileItem = new ArrayList<>();

		CallSPResponse callSPResponse = (producto == 0)
				? this.persistenceService.executeSP_SIMA(storedProcedureName, values,
						new GenericRowMapper<FileItem>(FileItem.class))
				: this.persistenceService.executeSP_SIMA_Robo(storedProcedureName, values,
						new GenericRowMapper<FileItem>(FileItem.class));
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (!callSPResponse.getResult().isEmpty())
			lstFileItem = (List<FileItem>) callSPResponse.getResult().get("SYS_REFCURSOR");
		return lstFileItem;
	}

	@SuppressWarnings("unchecked")
	public List<ErrorFilePE> getErrorsCancelPE(String storedProcedureName, List<Object> values)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		List<ErrorFilePE> lstError = new ArrayList<>();
		CallSPResponse callSPResponse = this.persistenceService.executeSP_SIMA_Robo(storedProcedureName, values,
				new GenericRowMapper<ErrorFilePE>(ErrorFilePE.class));
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (!callSPResponse.getResult().isEmpty())
			lstError = (List<ErrorFilePE>) callSPResponse.getResult().get("SYS_REFCURSOR");
		return lstError;
	}

	@SuppressWarnings("unchecked")
	public List<ClaimItem> getLstClaimItem(String storedProcedureName, List<Object> values)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		List<ClaimItem> lstClaimItem = new ArrayList<>();
		CallSPResponse callSPResponse = this.persistenceService.executeSP_SIMA(storedProcedureName, values,
				new GenericRowMapper<ClaimItem>(ClaimItem.class));
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (!callSPResponse.getResult().isEmpty())
			lstClaimItem = (List<ClaimItem>) callSPResponse.getResult().get("SYS_REFCURSOR");
		return lstClaimItem;
	}

	@SuppressWarnings("unchecked")
	public List<InsuranceItem> getLstInsuranceItem(String storedProcedureName, List<Object> values)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		List<InsuranceItem> lstInsuranceItem = new ArrayList<>();
		CallSPResponse callSPResponse = this.persistenceService.executeSP_PSC_Robo(storedProcedureName, values,
				new GenericRowMapper<InsuranceItem>(InsuranceItem.class));
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (!callSPResponse.getResult().isEmpty())
			lstInsuranceItem = (List<InsuranceItem>) callSPResponse.getResult().get("SYS_REFCURSOR");
		return lstInsuranceItem;
	}

	@SuppressWarnings({ "unchecked" })
	public List<String> getLstInsurance(String storedProcedureName, List<Object> values)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		List<String> lstInsurance = new ArrayList<>();
		CallSPResponse callSPResponse = this.persistenceService.executeSP_PSC_Robo(storedProcedureName, values,
				new RowMapper<Object>() {

					@Override
					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
						String result = null;
						result = rs.getString(1);
						return result;
					}

				});
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (!callSPResponse.getResult().isEmpty())
			lstInsurance = (List<String>) callSPResponse.getResult().get("SYS_REFCURSOR");
		return lstInsurance;
	}

	public CifrasControl executeAltaRoboBatch(String storedProcedureName, List<Object> values)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		CifrasControl cfc = new CifrasControl();
		CallSPResponse callSPResponse = this.persistenceService.executeSP_SIMA(storedProcedureName, null,
				new GenericRowMapper<CifrasControl>(CifrasControl.class));
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (callSPResponse.getResult() != null) {
			cfc.setpRegLei(Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_REG_LEI")).intValue()));
			cfc.setpRegProc(Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_REG_PROC")).intValue()));
			cfc.setpRegReject(
					Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_REG_REJECT")).intValue()));
			cfc.setpFileId(Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_FILE_ID")).intValue()));
		}
		return cfc;
	}

	public CifrasControl executeCifrasControl(String storedProcedureName, List<Object> values)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		CifrasControl cfc = new CifrasControl();
		CallSPResponse callSPResponse = this.persistenceService.executeSP_SIMA(storedProcedureName, null,
				new GenericRowMapper<CifrasControl>(CifrasControl.class));
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (callSPResponse.getResult() != null) {
			cfc.setpRegLei(Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_REG_LEI")).intValue()));
			cfc.setpRegProc(Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_REG_PROC")).intValue()));
			cfc.setpRegReject(
					Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_REG_RECHAZA")).intValue()));
		}
		return cfc;
	}

	public CallSPResponse executeSP_SIMA(String storedProcedureName, List<Object> values)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		CallSPResponse callSPResponse = this.persistenceService.executeSP_SIMA(storedProcedureName, values, null);
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		return callSPResponse;
	}

	public CallSPResponse executeSP_PSC(String storedProcedureName, List<Object> values)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		CallSPResponse callSPResponse = this.persistenceService.executeSP_PSC(storedProcedureName, values, null);
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		return callSPResponse;
	}

	public Map<String, Map<String, String>> streamFiles(List<FileItem> lstFileItem, String extension) {
		Map<String, Map<String, String>> mapFiles = new HashMap<>();
		for (FileItem file : lstFileItem) {
			log.info("ZipName: [{}], Name: [{}]", file.getZipName(), file.getName());
			if (!mapFiles.containsKey(file.getZipName()))
				mapFiles.put(file.getZipName(), new HashMap<>());
			String extensionFile = "";
			if (extension != null) {
				extensionFile = "." + extension;
				extensionFile.replace("..", ".");
			}
			((Map<String, String>) mapFiles.get(file.getZipName())).put(String.valueOf(file.getName()) + extensionFile,
					file.getDataValue());
		}
		return mapFiles;
	}

	public List<String> createFiles(List<FileItem> lstFileItem, String extension, String localTargetFolder)
			throws IOException {
		List<String> lstFileNameToSend = new ArrayList<>();
		for (FileItem file : lstFileItem) {
			log.info("ZipName: [{}], Name: [{}]", file.getZipName(), file.getName());
			String extensionFile = "";
			if (extension != null) {
				extensionFile = "." + extension;
				extensionFile.replace("..", ".");
			}
			File fout = new File(String.valueOf(localTargetFolder) + file.getName() + extensionFile);
			FileOutputStream fos = new FileOutputStream(fout);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			osw.write(file.getDataValue());
			osw.close();
			fos.close();
		}
		return lstFileNameToSend;
	}

	public List<String> createZipFiles(Map<String, Map<String, String>> mapFiles, String dateFormat,
			String localTargetFolder) throws IOException {
		List<String> lstFileNameToSend = new ArrayList<>();
		for (Map.Entry<String, Map<String, String>> entry : mapFiles.entrySet()) {
			String zipFileName = entry.getKey();
			Map<String, String> mapDataValue = entry.getValue();
			String dateFormatValue = "";
			if (dateFormat != null) {
				SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
				dateFormatValue = sdf.format(new Date());
			}
			if (localTargetFolder == null)
				localTargetFolder = "";
			zipFileName = String.valueOf(localTargetFolder) + zipFileName + '_' + dateFormatValue + ".zip";
			this.zipService.createZip(zipFileName, mapDataValue);
			lstFileNameToSend.add(zipFileName);
		}
		return lstFileNameToSend;
	}

	public Boolean uploadFiles(SftpSessionBean sftpSession, List<String> lstFileNameToSend, String remoteTargetFolder)
			throws SftpSendingException {
		Boolean sendFail = Boolean.valueOf(false);
		Map<String, Boolean> mapUploadResult = this.sftpService.uploadFile(sftpSession, lstFileNameToSend,
				remoteTargetFolder);
		if (!mapUploadResult.isEmpty()) {
			for (String fileName : lstFileNameToSend) {
				if (!mapUploadResult.containsKey(fileName)
						|| !((Boolean) mapUploadResult.get(fileName)).booleanValue()) {
					log.error("El archivo {} no pudo ser enviado al servidor sftp {}", fileName, sftpSession.getName());
					sendFail = Boolean.valueOf(true);
				}
			}
		} else {
			throw new SftpSendingException("No fue posible completar el envde archivos por SFTP");
		}
		return Boolean.valueOf(!sendFail.booleanValue());
	}

	public Map<String, Boolean> uploadFilesMap(SftpSessionBean sftpSession, List<String> lstFileNameToSend,
			String remoteTargetFolder) throws SftpSendingException {
		return this.sftpService.uploadFile(sftpSession, lstFileNameToSend, remoteTargetFolder);
	}

	public Boolean deleteFiles(List<String> lstFileNameToDelete) {
		Boolean deleteFail = Boolean.valueOf(false);
		for (String zipFileName : lstFileNameToDelete) {
			File dir = new File(zipFileName);
			log.info("Eliminando archivo: {}", zipFileName);
			if (dir.exists()) {
				if (dir.delete()) {
					log.info("Archivo eliminado: {}", zipFileName);
					continue;
				}
				log.error("Archivo no eliminado: {}", zipFileName);
				deleteFail = Boolean.valueOf(true);
			}
		}
		return deleteFail;
	}

	public Boolean sendEmail(String to, String subject, String text,String jobName) {
		Boolean result = Boolean.valueOf(false);
		try {
			this.emailService.sendSimpleMessage(to, subject, text, jobName);
			result = Boolean.valueOf(true);
		} catch (MessagingException e) {
			log.error("Ocurrió un error al intentar enviar correo electronicó ala dirección {}", to);
			log.error("Error: {}", e);
		}
		return result;
	}

	public Boolean existsJob(String jobName, String id) {
		Boolean result = Boolean.valueOf(false);
		List<JobInstance> jobInstances = this.jobExplorer.getJobInstances(jobName, 0, 100);
		for (JobInstance jobInstance : jobInstances) {
			List<JobExecution> jobExecutions = this.jobExplorer.getJobExecutions(jobInstance);
			for (JobExecution jobExecution : jobExecutions) {
				String uuid = jobExecution.getJobParameters().getString("uuid");
				if (id != null && uuid.equals(id))
					return Boolean.valueOf(true);
			}
		}
		return result;
	}

	public JobExecutionsHistory getJobExecutionsHistory(String jobName, String id, Boolean history) {
		JobExecutionsHistory jobExecutionsHistory = new JobExecutionsHistory();
		jobExecutionsHistory.setJobName(jobName);
		jobExecutionsHistory.setCronExpression(this.schedulerTaskService.getCronExpression(jobName));
		jobExecutionsHistory.setScheduled(this.schedulerTaskService.isScheduled(jobName));
		jobExecutionsHistory.setNameCron(this.schedulerTaskService.getNombreCronDescriptivo(jobName));
		Integer chunk = Integer.valueOf(10);
		if (history == null || !history.booleanValue())
			chunk = Integer.valueOf(1);
		List<JobInstance> jobInstances = this.jobExplorer.getJobInstances(jobName, 0, chunk.intValue());
		for (JobInstance jobInstance : jobInstances) {
			List<JobExecution> jobExecutions = this.jobExplorer.getJobExecutions(jobInstance);
			String auxUUID = "";
			for (JobExecution jobExecution : jobExecutions) {
				if (!auxUUID.equals(jobExecution.getJobParameters().getString("uuid")) && (id == null
						|| (id != null && jobExecution.getJobParameters().getString("uuid").equals(id)))) {
					auxUUID = jobExecution.getJobParameters().getString("uuid");
					JobExecutionItem jobExecutionItem = new JobExecutionItem();
					jobExecutionItem.setId(jobExecution.getId());
					jobExecutionItem.setUuid(jobExecution.getJobParameters().getString("uuid"));
					jobExecutionItem.setStartDate(jobExecution.getStartTime());
					jobExecutionItem.setEndDate(jobExecution.getEndTime());
					jobExecutionItem.setStatus(jobExecution.getStatus().toString());
					for (StepExecution stepExecution : jobExecution.getStepExecutions()) {
						jobExecutionItem.setExitStatus(stepExecution.getExitStatus().getExitCode());
						jobExecutionItem.setExitDescription(stepExecution.getExitStatus().getExitDescription());
					}
					jobExecutionsHistory.getLstJobExecution().add(jobExecutionItem);
				}
			}
		}
		return jobExecutionsHistory;
	}

	public List<JobExecutionsHistory> getAllJobExecutionsHistory(String jobName) {
		List<JobExecutionsHistory> lstJobExecutionsHistory = new ArrayList<>();
		List<String> lstJobName = getJobNames();
		for (String jobNameItem : lstJobName) {
			JobPropertiesBean jobProperties = this.schedulerTaskService.getJobPropertiesByName(jobNameItem);
			if (jobProperties.type.equals("job")) {
				JobExecutionsHistory jobExecutionsHistory = getJobExecutionsHistory(jobNameItem, null,
						Boolean.valueOf(jobNameItem.equals(jobName)));
				lstJobExecutionsHistory.add(jobExecutionsHistory);
			}
		}
		return lstJobExecutionsHistory;
	}

	public MsgResponse createInsurance(String storedProcedureName, InsuranceItem insuranceItem) {
		List<Object> values = new ArrayList<Object>();
		values.add(insuranceItem.getBusinessPartnerData());
		values.add(insuranceItem.getInsuranceId());
		values.add(insuranceItem.getPartnerId());
		values.add("1");
		values.add(insuranceItem.getBusinessPartnerId());
		values.add(insuranceItem.getCertificate());
		values.add(insuranceItem.getMacroPolicy());
		values.add(insuranceItem.getInsuranceCycle());
		values.add(insuranceItem.getCycleTotal());
		values.add(insuranceItem.getProductId());
		values.add(insuranceItem.getProductName());
		values.add(insuranceItem.getProductQuote());
		values.add(insuranceItem.getProductInsuredAmount());
		values.add(insuranceItem.getProductMarket());
		values.add(insuranceItem.getProductMode());
		if (insuranceItem.getPostedDate() != null) {
			values.add(new Date(insuranceItem.getPostedDate().getTime()));
		} else {
			values.add(null);
		}
		if (insuranceItem.getStartDate() != null) {
			values.add(new Date(insuranceItem.getStartDate().getTime()));
		} else {
			values.add(null);
		}
		if (insuranceItem.getEndDate() != null) {
			values.add(new Date(insuranceItem.getEndDate().getTime()));
		} else {
			values.add(null);
		}
		if (insuranceItem.getActualEndDate() != null) {
			values.add(new Date(insuranceItem.getActualEndDate().getTime()));
		} else {
			values.add(null);
		}
		values.add(insuranceItem.getPaymentType());
		values.add(insuranceItem.getPaymentFrequency());
		values.add(insuranceItem.getTerm());
		values.add(insuranceItem.getGroupId());
		values.add(insuranceItem.getGroupName());
		values.add(insuranceItem.getStatusId());
		if (insuranceItem.getLastStatusDate() != null) {
			values.add(new Date(insuranceItem.getLastStatusDate().getTime()));
		} else {
			values.add(null);
		}
		values.add(insuranceItem.getPreviousStatusId());
		values.add(null);
		values.add(null);
		values.add(null);
		values.add(null);
		values.add(null);
		values.add(null);
		values.add(null);
		values.add(null);
		values.add(insuranceItem.getCostCenterCode());
		values.add(insuranceItem.getOriginalSalesOfficeCenterCode());
		values.add(insuranceItem.getCollaboratorId());
		values.add(insuranceItem.getCollaboratorName());
		values.add(insuranceItem.getCollaboratorJob());
		values.add(insuranceItem.getOriginalCollaboratorId());
		values.add(insuranceItem.getOriginalCollaboratorName());
		values.add(insuranceItem.getOriginalCollaboratorJob());
		values.add(insuranceItem.getServiceData());
		values.add(insuranceItem.getCountryId());
		values.add(insuranceItem.getIdentifTit());
		values.add(insuranceItem.getIdentifBen());
		values.add(insuranceItem.getIdentifFam());
		values.add(insuranceItem.getPreviousInsuranceId());
		values.add(insuranceItem.getProductFlag());
		values.add(insuranceItem.getOriginalSalesOfficeInternalId());
		values.add(insuranceItem.getSalesOfficeInternalId());
		MsgResponse msgResponse = new MsgResponse();
		try {
			CallSPResponse callSPResponse = executeSP_SIMA(storedProcedureName, values);
			msgResponse.setCode(callSPResponse.getCode());
			msgResponse.setDescription(callSPResponse.getDescription());
		} catch (StoredProcedureConfigurationNotFoundException | StoredProcedureParametersNotMatchException
				| StoredProcedureParametersTypesMismatchException | UnexpectedResponseCodeException e) {
			msgResponse.setCode(Integer.valueOf(-1));
			msgResponse.setDescription(e.getMessage());
		}
		return msgResponse;
	}

	public Boolean createTextFile(List<String> lstLines, String pathFile) {
		File file = new File(pathFile);
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file, true);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
			BufferedWriter writer = new BufferedWriter(outputStreamWriter);
			for (String line : lstLines) {
				writer.write(line);
				writer.newLine();
			}
			writer.flush();
			writer.close();
			outputStreamWriter.close();
			fileOutputStream.close();
		} catch (IOException e) {
			log.error("Error al intentar crear el archivo de texto");
		}
		return Boolean.valueOf(file.exists());
	}

	public Boolean sendComplexMessage(String to, String subject, String text, List<String> attachFiles) {
		Boolean result = Boolean.valueOf(false);
		try {
			this.emailService.sendComplexMessage(to, subject, text, attachFiles);
			result = Boolean.valueOf(true);
		} catch (MessagingException e) {
			log.error("Ocurrió un error al intentar enviar correo electra la dirección{}", to);
		}
		return result;
	}

	public JobProperty saveJobProperty(JobProperty jobProperty) {
		JobProperty newJobProperty = (JobProperty) this.jobPropertyRepository.save(jobProperty);
		return newJobProperty;
	}

	public Boolean isJobRunning(String jobName) {
		Boolean isJobRunning = Boolean.valueOf(false);
		label14: for (JobInstance jobInstance : this.jobExplorer.getJobInstances(jobName, 0, 100)) {
			for (JobExecution jobExecution : this.jobExplorer.getJobExecutions(jobInstance)) {
				if (jobExecution.isRunning()) {
					isJobRunning = Boolean.valueOf(true);
					break label14;
				}
			}
		}
		return isJobRunning;
	}

	public List<String> getLstFile(SftpSessionBean sftpSession, String remoteSourceFolder) {
		return this.sftpService.listFilesMatchPattern(sftpSession, remoteSourceFolder, "*.*");
	}

	public Boolean downloadFile(SftpSessionBean sourceSftpSession, String fileNamePath, String fileNamePathLocal) {
		return this.sftpService.downloadFile(sourceSftpSession, fileNamePath, fileNamePathLocal);
	}
}
