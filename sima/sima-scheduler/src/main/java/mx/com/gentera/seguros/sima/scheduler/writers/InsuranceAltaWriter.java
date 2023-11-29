package mx.com.gentera.seguros.sima.scheduler.writers;

import java.io.IOException;
import java.nio.file.Files;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.common.sftp.services.ISftpService;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.model.CifrasControl;
import mx.com.gentera.seguros.sima.scheduler.model.ErrorFilePE;
import mx.com.gentera.seguros.sima.scheduler.model.InsuranceAltaItem;
import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
import mx.com.gentera.seguros.sima.scheduler.services.IServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.batch.item.file.transform.PassThroughLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class InsuranceAltaWriter implements ItemWriter<InsuranceAltaItem>, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(InsuranceAltaWriter.class);

	private static String ENCODING = "Cp1252";

	FlatFileItemWriter<String> writeSuccess = new FlatFileItemWriter<String>();

	FlatFileItemWriter<String> writeError = new FlatFileItemWriter<String>();

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService serverService;

	@Autowired
	ISftpService sftpService;

	List<String> itemSucces = new ArrayList<>();

	List<String> itemsError = new ArrayList<>();

	private Timestamp startDate = null;

	private SftpSessionBean dbSftpSession;

	private SftpSessionBean filesSftpSession;

	private JobPropertiesBean jobPropertiesBean;

	private Resource resourceError;

	private Resource resourceSuccess;

	SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMdd_HHmmss");

	String fileError = "";

	private String fileName = "";

	public InsuranceAltaWriter(SftpSessionBean dbSftpSession, SftpSessionBean filesSftpSession) {
		this.dbSftpSession = dbSftpSession;
		this.filesSftpSession = filesSftpSession;
	}

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
		this.fileError = this.jobPropertiesBean.remoteErrorNameFile + "_" + this.DATE_TIME_FORMAT.format(new Date())
				+ ".txt";
		this.resourceError = (Resource) new FileSystemResource(
				this.jobPropertiesBean.localSourceFolder + "/" + this.fileError);
		this.writeError.setResource(this.resourceError);
		this.writeError.setLineAggregator((LineAggregator<String>) new PassThroughLineAggregator<String>());
		this.writeError.setEncoding(ENCODING);
		this.writeError.open(stepExecution.getExecutionContext());
		log.info("INICIA CREACION DE ARCHIVO LOCAL");
		this.resourceSuccess = (Resource) new FileSystemResource(
				this.jobPropertiesBean.localSourceFolder + "/" + this.jobPropertiesBean.remoteFileDB);
		this.writeSuccess.setResource(this.resourceSuccess);
		this.writeSuccess.setLineAggregator((LineAggregator<String>) new PassThroughLineAggregator<String>());
		this.writeSuccess.setEncoding(ENCODING);
		this.writeSuccess.open(stepExecution.getExecutionContext());
		this.startDate = (Timestamp) stepExecution.getJobExecution().getExecutionContext().get("startDate");
		this.fileName = (String) stepExecution.getJobExecution().getExecutionContext().get("fileReader");
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		this.writeSuccess.close();
		this.sftpService.uploadFile(this.filesSftpSession,
				Arrays.asList(new String[] { this.jobPropertiesBean.localSourceFolder + "/" + this.fileName }),
				this.jobPropertiesBean.remoteTargetFolderProcessed);
		executeInsuranceAlta();
		return ExitStatus.COMPLETED;
	}

	public void write(List<? extends InsuranceAltaItem> items) throws Exception {
		for (InsuranceAltaItem i : items) {
			if (i.isSuccess()) {
				this.itemSucces.add(i.convert());
				continue;
			}
			this.itemsError.add(i.convertError());
		}
		log.info("LOS ARCHIVOS PROCESADOS CON EXITO SON: {}", Integer.valueOf(this.itemSucces.size()));
		log.info("LOS ARCHIVOS PROCESADOS CON ERROR DE ARCHIVOS SON: {}", Integer.valueOf(this.itemsError.size()));
		this.writeSuccess.write(this.itemSucces);
	}

	private void executeInsuranceAlta() {
		try {
			this.serverService.uploadFiles(this.dbSftpSession,
					Arrays.asList(new String[] { this.resourceSuccess.getFile().getPath() }),
					this.jobPropertiesBean.remoteTargetDB);
			CifrasControl cfc = this.serverService.executeCifrasControl(this.jobPropertiesBean.storedProcedureName,
					null);
			cfc.setpRegReject(Integer.valueOf(cfc.getpRegReject().intValue() + this.itemsError.size()));
			cfc.setpRegLei(Integer.valueOf(cfc.getpRegLei().intValue() + this.itemsError.size()));
			mergeListError(
					this.serverService.getErrorsCancelPE(this.jobPropertiesBean.afterStepStoredProcedureName, null));
			taskError();
			insertCifrasControl(cfc);
			deleteFilesTMP();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void insertCifrasControl(CifrasControl cfc)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		List<Object> values = new ArrayList<Object>();
		values.add(this.fileName);
		values.add(cfc.getpRegLei());
		values.add(cfc.getpRegProc());
		values.add(cfc.getpRegReject());
		values.add(this.startDate);
		values.add(new Timestamp(System.currentTimeMillis()));
		for (Object o : values)
			log.info("LOS VALORES SON : {}", o + "");
		log.info("KEVIIIIN PERDI DE NUEVO");
		this.serverService.executeSP_SIMA(this.jobPropertiesBean.storedProcedureNameDetail, values);
	}

	private void mergeListError(List<ErrorFilePE> lstError) {
		for (ErrorFilePE e : lstError)
			this.itemsError.add(e.toString());
		log.info("LOS ARCHIVOS PROCESADOS CON ERROR TOTAL SON: {}", Integer.valueOf(this.itemsError.size()));
	}

	private void taskError() {
		try {
			this.writeError.write(this.itemsError);
			this.writeError.close();
			if (this.itemsError.size() > 0) {
				this.serverService.uploadFiles(this.filesSftpSession,
						Arrays.asList(new String[] { this.resourceError.getFile().getPath() }),
						this.jobPropertiesBean.remoteTargetFolderError);
				this.serverService.uploadFiles(this.filesSftpSession,
						Arrays.asList(new String[] { this.resourceError.getFile().getPath() }),
						this.jobPropertiesBean.remoteTargetFolderErrorBack);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void deleteFilesTMP() {
		try {
			Files.delete(this.resourceError.getFile().toPath());
			Files.delete(this.resourceSuccess.getFile().toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}