package com.gentera.insurances.beans;

public class ClientPropertiesBean {

	private String address;
	private String wsdlUrl;
	private String wsdlUser;
	private String wsdlPassword;
	private Boolean loggingFeature;

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWsdlUrl() {
		return this.wsdlUrl;
	}

	public void setWsdlUrl(String wsdlUrl) {
		this.wsdlUrl = wsdlUrl;
	}

	public String getWsdlUser() {
		return this.wsdlUser;
	}

	public void setWsdlUser(String wsdlUser) {
		this.wsdlUser = wsdlUser;
	}

	public String getWsdlPassword() {
		return this.wsdlPassword;
	}

	public void setWsdlPassword(String wsdlPassword) {
		this.wsdlPassword = wsdlPassword;
	}

	public Boolean getLoggingFeature() {
		return this.loggingFeature;
	}

	public void setLoggingFeature(Boolean loggingFeature) {
		this.loggingFeature = loggingFeature;
	}
}