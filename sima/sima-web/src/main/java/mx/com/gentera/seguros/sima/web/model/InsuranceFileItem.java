package mx.com.gentera.seguros.sima.web.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InsuranceFileItem {

	private String insuranceId;
	private Integer partnerId;
	private String name;
	private String absolutePath;
	private Long size;
	private String type;
	private Date creationDate;
	private String status;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");

	public String getInsuranceId() {
		return this.insuranceId;
	}

	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}

	public Integer getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbsolutePath() {
		return this.absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public Long getSize() {
		return this.size;
	}

	public String getSizeFormatted() {
		String measure = "Bytes";
		Long auxSize = this.size;
		if (this.size.compareTo(Long.valueOf(1024L)) > 1) {
			auxSize = Long.valueOf(this.size.longValue() / 1024L);
			measure = "KB";
		}
		return String.valueOf(auxSize.toString()) + " " + measure;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public String getCreationDateFormatted() {
		return this.sdf.format(this.creationDate);
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
