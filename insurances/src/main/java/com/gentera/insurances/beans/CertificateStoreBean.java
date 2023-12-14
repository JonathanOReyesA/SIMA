package com.gentera.insurances.beans;

public class CertificateStoreBean {
	
	private String file;
	private String type;
	private String storePassword;
	private String keyPassword;

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStorePassword() {
		return this.storePassword;
	}

	public void setStorePassword(String storePassword) {
		this.storePassword = storePassword;
	}

	public String getKeyPassword() {
		return this.keyPassword;
	}

	public void setKeyPassword(String keyPassword) {
		this.keyPassword = keyPassword;
	}
}
