package mx.com.gentera.seguros.sima.scheduler.services;

import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.exceptions.JobImplementationNotExistsException;
import mx.com.gentera.seguros.sima.scheduler.model.MsgResponse;

public interface IJobLauncherService {
	MsgResponse launchJobExecution(String paramString1, JobPropertiesBean paramJobPropertiesBean, String paramString2,
			Boolean paramBoolean) throws JobImplementationNotExistsException;
}
