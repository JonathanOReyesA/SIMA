package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.model.CifrasControl;
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

public class WriteInsurancePSCBatchTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(WriteInsurancePSCBatchTaskletStep.class);

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService sftpService;

	SftpSessionBean dbSftpSession;

	@Autowired
	IServerService serverService;

	private JobPropertiesBean jobPropertiesBean;
	private List<String> lstInsurance = new ArrayList<>();
	private Boolean noop = Boolean.valueOf(true);
	private Timestamp startDate = null;

	@Autowired
	public WriteInsurancePSCBatchTaskletStep(SftpSessionBean dbSftpSession) {
		this.dbSftpSession = dbSftpSession;
	}

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (this.noop.booleanValue())
			return ExitStatus.NOOP;
		return ExitStatus.COMPLETED;
	}

	@SuppressWarnings("unchecked")
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		log.info("Ejecutando Stored Procedure {}", this.jobPropertiesBean.storedProcedureName);
		this.startDate = (Timestamp) chunkContext.getStepContext().getStepExecution().getJobExecution()
				.getExecutionContext().get("startDate");
		this.lstInsurance = (List<String>) chunkContext.getStepContext().getStepExecution().getJobExecution()
				.getExecutionContext().get("lstInsuranceRobo");
		chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext()
				.remove("lstInsuranceRobo");
		int registros = uploadFile(this.lstInsurance);
		log.info("Registros procesados... {}", Integer.valueOf(registros));
		this.lstInsurance = null;
		this.sftpService.uploadFilesMap(this.dbSftpSession,
				Arrays.asList(new String[] {
						this.jobPropertiesBean.localSourceFolder + this.jobPropertiesBean.remoteTargetFileName }),
				this.jobPropertiesBean.remoteSourceFolder);
		this.noop = Boolean.valueOf(false);
		log.info("INICIA EJECUCION DE ALTA  SIMA");
		insertCifrasControl(
				this.serverService.executeAltaRoboBatch(this.jobPropertiesBean.afterStepStoredProcedureName, null));
		return RepeatStatus.FINISHED;
	}

	private void insertCifrasControl(CifrasControl cfc)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		List<Object> values = new ArrayList<Object>();
		values.add(cfc.getpFileId());
		values.add(cfc.getpRegLei());
		values.add(cfc.getpRegProc());
		values.add(cfc.getpRegReject());
		values.add(this.startDate);
		values.add(new Timestamp(System.currentTimeMillis()));
		values.add(this.jobPropertiesBean.productType);
		log.info("INICIA EJECUCION DE CIFRAS CONTROL");
		this.serverService.executeSP_SIMA(this.jobPropertiesBean.storedProcedureNameDetail, values);
	}

	private int uploadFile(List<String> lstInsurance) throws IOException {
		int registros = 0;
		Writer write = null;
		try {
			write = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(
							this.jobPropertiesBean.localSourceFolder + this.jobPropertiesBean.remoteTargetFileName),
					"Cp1252"), 102400);
			for (String insurance : lstInsurance) {
				write.write(insurance + "\n");
				registros++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			write.close();
		}
		return registros;
	}
}
