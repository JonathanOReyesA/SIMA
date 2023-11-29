package mx.com.gentera.seguros.sima.scheduler.services;

import java.util.List;
import mx.com.gentera.seguros.common.persistence.entities.sima.JobProperty;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.exceptions.InvalidCronExpressionException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.JobConfigurationNotExistsException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.JobImplementationNotExistsException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.ScheduledJobAlreadyExistsException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.ScheduledJobNotExistsException;
import mx.com.gentera.seguros.sima.scheduler.exceptions.StopScheduledJobException;
import mx.com.gentera.seguros.sima.scheduler.model.MsgResponse;

public interface ISchedulerTaskService {
	MsgResponse startScheduledJob(String paramString)
			throws ScheduledJobAlreadyExistsException, InvalidCronExpressionException;

	MsgResponse stopScheduledJob(String paramString) throws ScheduledJobNotExistsException, StopScheduledJobException;

	MsgResponse executeJob(String paramString)
			throws JobConfigurationNotExistsException, JobImplementationNotExistsException;

	JobPropertiesBean getJobPropertiesByName(String paramString);

	MsgResponse retryJob(String paramString1, String paramString2)
			throws JobConfigurationNotExistsException, JobImplementationNotExistsException;

	Boolean isScheduled(String paramString);

	String getCronExpression(String paramString);

	List<JobProperty> getJobProperties(String paramString) throws JobConfigurationNotExistsException;

	List<JobProperty> saveJobProperties(String paramString, List<JobProperty> paramList)
			throws JobConfigurationNotExistsException;

	String getNombreCronDescriptivo(String paramString);
}
