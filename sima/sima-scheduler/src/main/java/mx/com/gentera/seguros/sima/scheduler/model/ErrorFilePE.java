package mx.com.gentera.seguros.sima.scheduler.model;

import mx.com.gentera.seguros.sima.scheduler.annotations.SourceTableField;

public class ErrorFilePE {

	@SourceTableField(name = "CERTIFICATE")
	public String certificate;

	@SourceTableField(name = "ERROR_DATE")
	public String errorDate;

	@SourceTableField(name = "ERROR_DESCRIPTION")
	public String errorDescription;

	/**
	 * @return the certificate
	 */
	public String getCertificate() {
		return certificate;
	}

	/**
	 * @param certificate the certificate to set
	 */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	/**
	 * @return the errorDate
	 */
	public String getErrorDate() {
		return errorDate;
	}

	/**
	 * @param errorDate the errorDate to set
	 */
	public void setErrorDate(String errorDate) {
		this.errorDate = errorDate;
	}

	/**
	 * @return the errorDescription
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * @param errorDescription the errorDescription to set
	 */
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	@Override
	public String toString() {
		return "ErrorFilePE [certificate=" + certificate + ", errorDate=" + errorDate + ", errorDescription="
				+ errorDescription + "]";
	}
}
