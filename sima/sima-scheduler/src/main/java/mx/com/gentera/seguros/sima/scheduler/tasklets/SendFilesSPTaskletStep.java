package mx.com.gentera.seguros.sima.scheduler.tasklets;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.Iterator;
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
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class SendFilesSPTaskletStep implements Tasklet, StepExecutionListener {
  private static final Logger log = LoggerFactory.getLogger(SendFilesSPTaskletStep.class);
  
  @Autowired
  ISchedulerTaskService schedulerTaskService;
  
  @Autowired
  IServerService serverService;
  
  private JobPropertiesBean jobPropertiesBean;
  
  private List<FileItem> lstFileItem = new ArrayList<>();
  
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws IOException, StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException, StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException, NotFoundException {
    log.info("Ejecutando Stored Procedure {}", this.jobPropertiesBean.storedProcedureName);
    List<Object> values = new ArrayList<Object>();
    values.add(this.jobPropertiesBean.partnerId);
    this.lstFileItem = this.serverService.getLstFileItem(this.jobPropertiesBean.storedProcedureName, values, 0);
    log.info("Archivos encontrados: {}", Integer.valueOf(this.lstFileItem.size()));
    chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("lstFileItem", this.lstFileItem);
    return RepeatStatus.FINISHED;
  }
  
  public void beforeStep(StepExecution stepExecution) {
    this.jobPropertiesBean = this.schedulerTaskService.getJobPropertiesByName(stepExecution.getJobExecution().getJobInstance().getJobName());
  }
  
  public ExitStatus afterStep(StepExecution stepExecution) {
    if (this.lstFileItem.isEmpty())
      return ExitStatus.NOOP; 
    return ExitStatus.COMPLETED;
  }
}
