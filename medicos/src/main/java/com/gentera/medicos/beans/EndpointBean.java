package com.gentera.medicos.beans;

public class EndpointBean {

	/**
	 * Nombre del Stored Procedure a ejecutar dentro del endpoint
	 */
	private String storedProcedureName;
	/**
	 * Ruta de contexto para el endpoint
	 */
	private String endpointContextPath;

	/**
	 * Nombre del Stored Procedure a ejecutar dentro del endpoint terminando el
	 * primer proceso
	 */
	private String storedProcedureNameBefore;

	/**
	 * Nombre de la ruta temporal para los archivos
	 */
	private String filePathLocal;

	private String fileDBRemote;

	private String serviceName;

	public String getStoredProcedureName() {
		return storedProcedureName;
	}

	public void setStoredProcedureName(String storedProcedureName) {
		this.storedProcedureName = storedProcedureName;
	}

	public String getEndpointContextPath() {
		return endpointContextPath;
	}

	public void setEndpointContextPath(String endpointContextPath) {
		this.endpointContextPath = endpointContextPath;
	}

	public String getStoredProcedureNameBefore() {
		return storedProcedureNameBefore;
	}

	public void setStoredProcedureNameBefore(String storedProcedureNameBefore) {
		this.storedProcedureNameBefore = storedProcedureNameBefore;
	}

	public String getFilePathLocal() {
		return filePathLocal;
	}

	public void setFilePathLocal(String filePathLocal) {
		this.filePathLocal = filePathLocal;
	}

	public String getFileDBRemote() {
		return fileDBRemote;
	}

	public void setFileDBRemote(String fileDBRemote) {
		this.fileDBRemote = fileDBRemote;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}