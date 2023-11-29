package mx.com.gentera.seguros.sima.web.services;

import java.util.List;
import mx.com.gentera.seguros.common.persistence.entities.sima.JobProperty;
import mx.com.gentera.seguros.sima.web.exceptions.ExecuteScheduledJobException;
import mx.com.gentera.seguros.sima.web.exceptions.JobConfigurationNotExistsException;
import mx.com.gentera.seguros.sima.web.exceptions.RetryScheduledJobException;
import mx.com.gentera.seguros.sima.web.exceptions.StartScheduledJobException;
import mx.com.gentera.seguros.sima.web.exceptions.StopScheduledJobException;
import mx.com.gentera.seguros.sima.web.model.JobExecutionsHistory;
import mx.com.gentera.seguros.sima.web.model.MsgResponse;

public interface ISchedulerService {
	List<JobExecutionsHistory> findAllJobExecutionsHistory(String paramString);

	MsgResponse stop(String jobName) throws StopScheduledJobException;

	MsgResponse start(String jobName) throws StartScheduledJobException;

	MsgResponse execute(String jobName) throws ExecuteScheduledJobException;

	MsgResponse retry(String jobName, String uuid) throws RetryScheduledJobException;

	List<JobProperty> getJobProperties(String jobName) throws JobConfigurationNotExistsException;

	List<JobProperty> saveJobProperties(String jobName, List<JobProperty> lstJobProperties)
			throws JobConfigurationNotExistsException;
}
