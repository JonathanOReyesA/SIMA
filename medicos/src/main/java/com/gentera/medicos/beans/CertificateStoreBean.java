package com.gentera.medicos.beans;

public class CertificateStoreBean {

	/**
	 * Ubicacion del archivo de almacen de certificados
	 */
	private String file;
	/**
	 * Tipo del almacen de certificados
	 */
	private String type;
	/**
	 * Password del almacen de certificados
	 */
	private String storePassword;
	/**
	 * Password de la llave del almacen de ertificados
	 */
	private String keyPassword;

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStorePassword() {
		return storePassword;
	}

	public void setStorePassword(String storePassword) {
		this.storePassword = storePassword;
	}

	public String getKeyPassword() {
		return keyPassword;
	}

	public void setKeyPassword(String keyPassword) {
		this.keyPassword = keyPassword;
	}

}