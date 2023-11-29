package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javassist.NotFoundException;
import mx.com.gentera.seguros.common.email.services.IEmailService;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.persistence.model.MsgResponse;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.model.InsuranceItem;
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
public class CreateInsuranceTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(CreateInsuranceTaskletStep.class);

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	@Autowired
	IServerService serverService;

	@Autowired
	IEmailService emailService;

	private JobPropertiesBean jobPropertiesBean;

	private List<InsuranceItem> lstInsuranceItem = new ArrayList<>();

	private List<String> lstCreateInsuranceErrors = new ArrayList<>();

	private Boolean noop = Boolean.valueOf(true);

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws IOException,
			StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException, NotFoundException {
		log.info("Ejecutando Stored Procedure {}", this.jobPropertiesBean.storedProcedureName);
		List<Object> values = new ArrayList<Object>();
		values.add(this.jobPropertiesBean.recordsPerCall);
		this.lstInsuranceItem = this.serverService.getLstInsuranceItem(this.jobPropertiesBean.storedProcedureName,
				values);
		log.info("Registros encontrados: {}", Integer.valueOf(this.lstInsuranceItem.size()));
		for (InsuranceItem insuranceItem : this.lstInsuranceItem) {
			this.noop = Boolean.valueOf(false);
			MsgResponse msgResponse = this.serverService
					.createInsurance(this.jobPropertiesBean.byItemStoredProcedureName, insuranceItem);
			if (msgResponse.getCode().compareTo(Integer.valueOf(0)) != 0) {
				this.lstCreateInsuranceErrors.add(
						"InsuranceId: " + insuranceItem.getInsuranceId() + "; Error: " + msgResponse.getDescription());
				log.error("Error durante el alta del seguro con Id: {}; error: {}; data:[{}]", new Object[] {
						insuranceItem.getInsuranceId(), msgResponse.getDescription(), insuranceItem.toString() });
			}
		}
		return RepeatStatus.FINISHED;
	}

	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (this.noop.booleanValue())
			return ExitStatus.NOOP;
		if (!this.lstCreateInsuranceErrors.isEmpty()) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			String pathFile = this.jobPropertiesBean.localTargetErrorFolder + "/CreateInsuranceErrors_"
					+ sdf.format(new Date()) + ".log";
			if (this.serverService.createTextFile(this.lstCreateInsuranceErrors, pathFile).booleanValue()) {
				List<String> attachFiles = new ArrayList<>();
				attachFiles.add(pathFile);
				StringBuilder sb = new StringBuilder();
				sb.append("<p>No fue posible realizar el alta de " + this.lstCreateInsuranceErrors.size()
						+ " seguros.</p>").append(System.lineSeparator());
				sb.append("<p>Consultar el archivo adjunto para mas detalles.</p>").append(System.lineSeparator());
				if (!this.serverService
						.sendComplexMessage(this.jobPropertiesBean.destinationEmailError,
								"Errores durante el proceso: Alta de Seguros SIMA", sb.toString(), attachFiles)
						.booleanValue())
					log.error(
							"No fue posible realizar el envdel correo con los errores obtenidos a la siguiente direcci{}",
							this.jobPropertiesBean.destinationEmailError);
			}
		}
		return ExitStatus.COMPLETED;
	}
}
