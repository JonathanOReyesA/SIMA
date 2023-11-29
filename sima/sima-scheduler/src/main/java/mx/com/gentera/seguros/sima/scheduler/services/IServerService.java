package mx.com.gentera.seguros.sima.scheduler.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import mx.com.gentera.seguros.common.persistence.entities.sima.JobProperty;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.model.MsgResponse;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.sima.scheduler.exceptions.SftpSendingException;
import mx.com.gentera.seguros.sima.scheduler.model.CifrasControl;
import mx.com.gentera.seguros.sima.scheduler.model.ClaimItem;
import mx.com.gentera.seguros.sima.scheduler.model.ErrorFilePE;
import mx.com.gentera.seguros.sima.scheduler.model.FileItem;
import mx.com.gentera.seguros.sima.scheduler.model.InsuranceItem;
import mx.com.gentera.seguros.sima.scheduler.model.JobExecutionsHistory;

public interface IServerService {
	List<String> getJobNames();

	List<JobProperty> findByIdJobName(String paramString);

	Map<String, Map<String, String>> streamFiles(List<FileItem> paramList, String paramString);

	List<String> createFiles(List<FileItem> paramList, String paramString1, String paramString2)
			throws FileNotFoundException, IOException;

	List<String> createZipFiles(Map<String, Map<String, String>> paramMap, String paramString1, String paramString2)
			throws IOException;

	Boolean uploadFiles(SftpSessionBean paramSftpSessionBean, List<String> paramList, String paramString)
			throws SftpSendingException;

	Boolean deleteFiles(List<String> paramList);

	List<FileItem> getLstFileItem(String paramString, List<Object> paramList, int paramInt)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	List<InsuranceItem> getLstInsuranceItem(String paramString, List<Object> paramList)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	Boolean sendEmail(String paramString1, String paramString2, String paramString3);

	CallSPResponse executeSP_SIMA(String paramString, List<Object> paramList)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	CallSPResponse executeSP_PSC(String paramString, List<Object> paramList)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	Boolean existsJob(String paramString1, String paramString2);

	JobExecutionsHistory getJobExecutionsHistory(String paramString1, String paramString2, Boolean paramBoolean);

	List<JobExecutionsHistory> getAllJobExecutionsHistory(String paramString);

	MsgResponse createInsurance(String paramString, InsuranceItem paramInsuranceItem);

	Boolean createTextFile(List<String> paramList, String paramString);

	Boolean sendComplexMessage(String paramString1, String paramString2, String paramString3, List<String> paramList);

	JobProperty saveJobProperty(JobProperty paramJobProperty);

	Boolean isJobRunning(String paramString);

	List<ClaimItem> getLstClaimItem(String paramString, List<Object> paramList)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	List<String> getLstFile(SftpSessionBean paramSftpSessionBean, String paramString);

	Map<String, Boolean> uploadFilesMap(SftpSessionBean paramSftpSessionBean, List<String> paramList,
			String paramString) throws SftpSendingException;

	Boolean downloadFile(SftpSessionBean paramSftpSessionBean, String paramString1, String paramString2);

	List<String> getLstInsurance(String paramString, List<Object> paramList)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	CifrasControl executeAltaRoboBatch(String paramString, List<Object> paramList)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	CifrasControl executeCifrasControl(String paramString, List<Object> paramList)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	List<ErrorFilePE> getErrorsCancelPE(String paramString, List<Object> paramList)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;
}
