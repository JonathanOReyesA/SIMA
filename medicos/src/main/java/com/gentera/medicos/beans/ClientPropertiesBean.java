package com.gentera.medicos.beans;

public class ClientPropertiesBean {

	/**
	 * URL del endpoint del servicio a consumir
	 */
	private String address;
	/**
	 * URL del WSDL del servicio a consumir
	 */
	private String wsdlUrl;
	/**
	 * Usuario para acceder al servicio a consumir
	 */
	private String wsdlUser;
	/**
	 * Password para acceder al servicio a consumir
	 */
	private String wsdlPassword;
	/**
	 * Logging Feature para mostrar mensajes de entrada y salida
	 */
	private Boolean loggingFeature;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWsdlUrl() {
		return wsdlUrl;
	}

	public void setWsdlUrl(String wsdlUrl) {
		this.wsdlUrl = wsdlUrl;
	}

	public String getWsdlUser() {
		return wsdlUser;
	}

	public void setWsdlUser(String wsdlUser) {
		this.wsdlUser = wsdlUser;
	}

	public String getWsdlPassword() {
		return wsdlPassword;
	}

	public void setWsdlPassword(String wsdlPassword) {
		this.wsdlPassword = wsdlPassword;
	}

	public Boolean getLoggingFeature() {
		return loggingFeature;
	}

	public void setLoggingFeature(Boolean loggingFeature) {
		this.loggingFeature = loggingFeature;
	}
}