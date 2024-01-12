/*
 * Se coloca esta parta pornuevo requerimientos mas familiares En la cual se
 * envia correo una vez finalizado el envio automatico de Mexico
*/
package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
import mx.com.gentera.seguros.sima.scheduler.services.IServerService;

@Component
@StepScope
public class SendEmailAutomationPaymentTaskletStep implements Tasklet, StepExecutionListener {

	private static final Logger log = LoggerFactory.getLogger(SendEmailAutomationPaymentTaskletStep.class);

	@Autowired
	IServerService serverService;

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	private JobPropertiesBean jobPropertiesBean;
	private List<String> lstFile = new ArrayList<>();
	private boolean sendEamil;

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

	//	log.info("{}", this.lstFile.toString());
		LocalDate currentDate = LocalDate.now();
		Month mes = currentDate.getMonth();
		String mesNombre = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		StringBuilder sb = new StringBuilder();
		String altas = "", cancelaciones = "", cancelacionesXCambio = "";
		
		for (String fileName : this.lstFile) {
			
			if (fileName.indexOf("CANC_CP") != -1) 
				cancelacionesXCambio += fileName.split("MX/files/")[1] + "<br>";

			else if (fileName.indexOf("CANC") != -1)
				cancelaciones += fileName.split("MX/files/")[1] + "<br>";

			else
				altas += fileName.split("MX/files/")[1] + "<br>";
		}
		
		sb.append("<p>Se confirma el envío de archivos de " + currentDate.getDayOfMonth() + " de " + mesNombre + "</p>")
				.append(System.lineSeparator());
		sb.append("<p><strong>Altas: </strong><br>" + altas + "<br></p>");
		sb.append("<p><strong>Cancelaciones: </strong><br>" + cancelaciones + "<br></p>");
		sb.append("<p><strong>Cancelaciones por cambio de producto: </strong><br>" + cancelacionesXCambio+ "</p><br>");
		
        this.sendEamil = this.serverService.sendEmail(jobPropertiesBean.destinationEmailInsuranceSend,
				"Envío de archivos " + currentDate.getDayOfMonth() + " de " + mesNombre + " de "
						+ currentDate.getYear(), sb.toString(), "sendFilesMX");
        
		return RepeatStatus.FINISHED;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void beforeStep(StepExecution stepExecution) {
		this.jobPropertiesBean = this.schedulerTaskService
				.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
		ExecutionContext jobContext = stepExecution.getJobExecution().getExecutionContext();
		this.lstFile = (List<String>) jobContext.get("lstFile");

	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		if (!this.sendEamil)
			return ExitStatus.FAILED;
		return ExitStatus.COMPLETED;
	}

}
