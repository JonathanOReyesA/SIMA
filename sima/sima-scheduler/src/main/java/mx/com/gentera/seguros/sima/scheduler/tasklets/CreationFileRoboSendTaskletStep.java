package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javassist.NotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.model.FileItem;
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
public class CreationFileRoboSendTaskletStep implements Tasklet, StepExecutionListener {
	private static final Logger log = LoggerFactory.getLogger(CreationFileRoboSendTaskletStep.class);

	@Autowired
	IServerService serverService;

	@Autowired
	private ISchedulerTaskService schedulerTaskService;

	private JobPropertiesBean jobPropertiesBean;

	private List<FileItem> lstFileItem = new ArrayList<>();

	private List<String> lstFile = new ArrayList<>();

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws IOException,
			StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException, NotFoundException {
		log.info("Iniciando creacion de archivos");
		for (FileItem file : this.lstFileItem) {
			String fileName = file.getName() + "." + this.jobPropertiesBean.extension;
			File archivo = new File(fileName);
			FileOutputStream Out = new FileOutputStream(archivo);
			byte[] bytes = file.getDataValue().getBytes();
			int length = bytes.length;
			String aux = this.jobPropertiesBean.sufix + "\n";
			byte[] bytesEncabezado = aux.getBytes();
			int length2 = bytesEncabezado.length;
			Out.write(bytesEncabezado, 0, length2);
			Out.write(bytes, 0, length);
			Out.close();
			this.lstFile.add(fileName);
		}
		chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("lstFile",
				this.lstFile);
		return RepeatStatus.FINISHED;
	}

	@SuppressWarnings("unchecked")
	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
		ExecutionContext jobContext = stepExecution.getJobExecution().getExecutionContext();
		this.lstFileItem = (List<FileItem>) jobContext.get("lstFile");
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		if (this.lstFile.isEmpty())
			return ExitStatus.FAILED;
		return ExitStatus.COMPLETED;
	}
}