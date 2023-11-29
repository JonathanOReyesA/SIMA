package mx.com.gentera.seguros.sima.scheduler.model;

import java.util.Date;

public class JobExecutionItem {
	
	private Long id;
	private String uuid;
	private Date startDate;
	private Date endDate;
	private String status;
	private String exitStatus;
	private String exitDescription;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getExitStatus() {
		return this.exitStatus;
	}

	public void setExitStatus(String exitStatus) {
		this.exitStatus = exitStatus;
	}

	public String getExitDescription() {
		return this.exitDescription;
	}

	public void setExitDescription(String exitDescription) {
		this.exitDescription = exitDescription;
	}

	@Override
	public String toString() {
		return "JobExecutionItem [id=" + id + ", uuid=" + uuid + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", status=" + status + ", exitStatus=" + exitStatus + ", exitDescription=" + exitDescription + "]";
	}

}