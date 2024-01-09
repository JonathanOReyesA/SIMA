package mx.com.gentera.seguros.sima.web.services;

import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.seguros.common.persistence.entities.sima.JobProperty;
import mx.com.gentera.seguros.sima.web.beans.ApiPropertiesBean;
//import mx.com.gentera.seguros.sima.web.controllers.SimaWebController;
import mx.com.gentera.seguros.sima.web.exceptions.ExecuteScheduledJobException;
import mx.com.gentera.seguros.sima.web.exceptions.JobConfigurationNotExistsException;
import mx.com.gentera.seguros.sima.web.exceptions.RetryScheduledJobException;
import mx.com.gentera.seguros.sima.web.exceptions.StartScheduledJobException;
import mx.com.gentera.seguros.sima.web.exceptions.StopScheduledJobException;
import mx.com.gentera.seguros.sima.web.model.JobExecutionsHistory;
import mx.com.gentera.seguros.sima.web.model.MsgResponse;
//import mx.com.gentera.seguros.sima.web.services.ISchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import java.nio.charset.Charset;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;

@Service
public class SchedulerServiceImpl implements ISchedulerService {

	//private static final Logger log = LoggerFactory.getLogger(SchedulerServiceImpl.class);

	@Autowired
	ApiPropertiesBean apiSchedulerBean;

	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	@Override
	public List<JobExecutionsHistory> findAllJobExecutionsHistory(String jobName) {
		List<JobExecutionsHistory> lstJobExecutionsHistory = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders() {
			{
				String auth = String.valueOf(SchedulerServiceImpl.this.apiSchedulerBean.getUser()) + ":"
						+ SchedulerServiceImpl.this.apiSchedulerBean.getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};

		
		ResponseEntity<List<JobExecutionsHistory>> response = restTemplate.exchange(
				String.valueOf(this.apiSchedulerBean.getUrl()) + "/history/job/" + jobName, HttpMethod.GET,
				new HttpEntity(headers), new ParameterizedTypeReference<List<JobExecutionsHistory>>() {
				}, new Object[0]);
		lstJobExecutionsHistory = (List<JobExecutionsHistory>) response.getBody();
		return lstJobExecutionsHistory;
	}

	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	@Override
	public MsgResponse stop(String jobName) throws StopScheduledJobException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders() {
			{
				String auth = String.valueOf(SchedulerServiceImpl.this.apiSchedulerBean.getUser()) + ":"
						+ SchedulerServiceImpl.this.apiSchedulerBean.getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
		ResponseEntity<MsgResponse> response = restTemplate.exchange(
				String.valueOf(this.apiSchedulerBean.getUrl()) + "/" + jobName + "/stop", HttpMethod.GET,
				new HttpEntity(httpHeaders), new ParameterizedTypeReference<MsgResponse>() {
				}, new Object[0]);
		if ((response.getBody()).getCode().compareTo(Integer.valueOf(0)) != 0)
			throw new StopScheduledJobException(( response.getBody()).getDescription());
		return  response.getBody();
	}

	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	@Override
	public MsgResponse start(String jobName) throws StartScheduledJobException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders() {
			{
				String auth = String.valueOf(SchedulerServiceImpl.this.apiSchedulerBean.getUser()) + ":"
						+ SchedulerServiceImpl.this.apiSchedulerBean.getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
		ResponseEntity<MsgResponse> response = restTemplate.exchange(
				String.valueOf(this.apiSchedulerBean.getUrl()) + "/" + jobName + "/start", HttpMethod.GET,
				new HttpEntity(httpHeaders), new ParameterizedTypeReference<MsgResponse>() {
				}, new Object[0]);
		if (( response.getBody()).getCode().compareTo(Integer.valueOf(0)) != 0)
			throw new StartScheduledJobException(( response.getBody()).getDescription());
		return  response.getBody();
	}

	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	@Override
	public MsgResponse execute(String jobName) throws ExecuteScheduledJobException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders() {
			{
				String auth = String.valueOf(SchedulerServiceImpl.this.apiSchedulerBean.getUser()) + ":"
						+ SchedulerServiceImpl.this.apiSchedulerBean.getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
		ResponseEntity<MsgResponse> response = restTemplate.exchange(
				String.valueOf(this.apiSchedulerBean.getUrl()) + "/" + jobName + "/execute", HttpMethod.GET,
				new HttpEntity(httpHeaders), new ParameterizedTypeReference<MsgResponse>() {
				}, new Object[0]);
		if (( response.getBody()).getCode().compareTo(Integer.valueOf(0)) != 0)
			throw new ExecuteScheduledJobException(( response.getBody()).getDescription());
		return  response.getBody();
	}

	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	@Override
	public MsgResponse retry(String jobName, String uuid) throws RetryScheduledJobException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders() {
			{
				String auth = String.valueOf(SchedulerServiceImpl.this.apiSchedulerBean.getUser()) + ":"
						+ SchedulerServiceImpl.this.apiSchedulerBean.getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
		ResponseEntity<MsgResponse> response = restTemplate.exchange(
				String.valueOf(this.apiSchedulerBean.getUrl()) + "/" + jobName + "/retry/" + uuid, HttpMethod.GET,
				new HttpEntity(httpHeaders), new ParameterizedTypeReference<MsgResponse>() {
				}, new Object[0]);
		if (( response.getBody()).getCode().compareTo(Integer.valueOf(0)) != 0)
			throw new RetryScheduledJobException(( response.getBody()).getDescription());
		return  response.getBody();
	}

	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	@Override
	public List<JobProperty> getJobProperties(String jobName) throws JobConfigurationNotExistsException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders() {
			{
				String auth = String.valueOf(SchedulerServiceImpl.this.apiSchedulerBean.getUser()) + ":"
						+ SchedulerServiceImpl.this.apiSchedulerBean.getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
		ResponseEntity<List<JobProperty>> response = restTemplate.exchange(
				String.valueOf(this.apiSchedulerBean.getUrl()) + "/" + jobName + "/properties", HttpMethod.GET,
				new HttpEntity(httpHeaders), new ParameterizedTypeReference<List<JobProperty>>() {
				}, new Object[0]);
		if (response.getBody() == null || (response.getBody() != null && (response.getBody()).isEmpty()))
			throw new JobConfigurationNotExistsException("No existe configuración para el Job " + jobName);
		return  response.getBody();
	}

	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	@Override
	public List<JobProperty> saveJobProperties(String jobName, List<JobProperty> lstJobProperties)
			throws JobConfigurationNotExistsException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders() {
			{
				String auth = String.valueOf(SchedulerServiceImpl.this.apiSchedulerBean.getUser()) + ":"
						+ SchedulerServiceImpl.this.apiSchedulerBean.getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
		ResponseEntity<List<JobProperty>> response = restTemplate.exchange(
				String.valueOf(this.apiSchedulerBean.getUrl()) + "/" + jobName + "/properties", HttpMethod.POST,
				new HttpEntity(lstJobProperties, httpHeaders), new ParameterizedTypeReference<List<JobProperty>>() {
				}, new Object[0]);
		if (response.getBody() == null || (response.getBody() != null && (response.getBody()).isEmpty()))
			throw new JobConfigurationNotExistsException("No existe configuración para el Job " + jobName);
		return response.getBody();
	}
}
