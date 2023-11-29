package mx.com.gentera.seguros.sima.web.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
//import mx.com.gentera.seguros.sima.web.model.JobExecutionItem;
import org.springframework.scheduling.support.CronSequenceGenerator;

public class JobExecutionsHistory {

	private String jobName;
	private String cronExpression;
	private Boolean scheduled;
	private String nameCron;
	private List<JobExecutionItem> lstJobExecution = new ArrayList<>();
	private SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MMM HH:mm", new Locale("es", "MX"));

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public Boolean getScheduled() {
		return this.scheduled;
	}

	public void setScheduled(Boolean scheduled) {
		this.scheduled = scheduled;
	}

	public List<JobExecutionItem> getLstJobExecution() {
		return this.lstJobExecution;
	}

	public void setLstJobExecution(List<JobExecutionItem> lstJobExecution) {
		this.lstJobExecution = lstJobExecution;
	}

	public JobExecutionItem getLastJobExecution() {
		JobExecutionItem lastJobExecution = null;
		if (!this.lstJobExecution.isEmpty())
			lastJobExecution = this.lstJobExecution.get(0);
		return lastJobExecution;
	}

	public String getNextStartDate() {
		String nextStartDate = null;
		if (this.cronExpression != null) {
			CronSequenceGenerator cronTrigger = new CronSequenceGenerator(this.cronExpression);
			nextStartDate = this.sdf.format(cronTrigger.next(new Date()));
		}
		return nextStartDate;
	}

	public String getNameCron() {
		return this.nameCron;
	}

	public void setNameCron(String nameCron) {
		this.nameCron = nameCron;
	}
}
