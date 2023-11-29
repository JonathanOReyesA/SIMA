package mx.com.gentera.seguros.sima.web.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JobExecutionItem {

	private Long id;
	private String uuid;
	private Date startDate;
	private Date endDate;
	private String status;
	private String exitStatus;
	private String exitDescription;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

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

	public String getStartDateStr() {
		String result = "";
		if (this.startDate != null)
			result = this.sdf.format(this.startDate);
		return result;
	}

	public String getEndDateStr() {
		String result = "";
		if (this.endDate != null)
			result = this.sdf.format(this.endDate);
		return result;
	}

	public String getUuidSlim() {
		return this.uuid.substring(this.uuid.length() - 5, this.uuid.length());
	}
}
