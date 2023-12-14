package com.gentera.insurances.beans;

public class EndpointBean {

	private String storedProcedureName;
	private String endpointContextPath;
	private String storedProcedureNameBefore;
	private String filePathLocal;
	private String fileDBRemote;
	private String serviceName;

	public String getStoredProcedureName() {
		return this.storedProcedureName;
	}

	public void setStoredProcedureName(String storedProcedureName) {
		this.storedProcedureName = storedProcedureName;
	}

	public String getEndpointContextPath() {
		return this.endpointContextPath;
	}

	public void setEndpointContextPath(String endpointContextPath) {
		this.endpointContextPath = endpointContextPath;
	}

	public String getStoredProcedureNameBefore() {
		return this.storedProcedureNameBefore;
	}

	public void setStoredProcedureNameBefore(String storedProcedureNameBefore) {
		this.storedProcedureNameBefore = storedProcedureNameBefore;
	}

	public String getFilePathLocal() {
		return this.filePathLocal;
	}

	public void setFilePathLocal(String filePathLocal) {
		this.filePathLocal = filePathLocal;
	}

	public String getFileDBRemote() {
		return this.fileDBRemote;
	}

	public void setFileDBRemote(String fileDBRemote) {
		this.fileDBRemote = fileDBRemote;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
