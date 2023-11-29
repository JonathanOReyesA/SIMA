package mx.com.gentera.seguros.sima.scheduler.model;

import java.util.ArrayList;
import java.util.List;

public class JobExecutionsHistory {

	private String jobName;
	private String cronExpression;
	private Boolean scheduled;
	private String nameCron;
	private List<JobExecutionItem> lstJobExecution = new ArrayList<>();

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

	public String getNameCron() {
		return this.nameCron;
	}

	public void setNameCron(String nameCron) {
		this.nameCron = nameCron;
	}

	@Override
	public String toString() {
		return "JobExecutionsHistory [jobName=" + jobName + ", cronExpression=" + cronExpression + ", scheduled="
				+ scheduled + ", nameCron=" + nameCron + ", lstJobExecution=" + lstJobExecution + "]";
	}
}
