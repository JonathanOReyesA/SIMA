package mx.com.gentera.seguros.sima.scheduler.model;

import mx.com.gentera.seguros.sima.scheduler.annotations.SourceTableField;

public class ClaimItem {

	@SourceTableField(name = "CLAIMID")
	private String name;

	@SourceTableField(name = "CLAIMSTATUSID")
	private String status;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ClaimItem [name=" + name + ", status=" + status + "]";
	}
}
