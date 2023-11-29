package mx.com.gentera.seguros.sima.scheduler.model;

public class CifrasControl {

	private Integer pRegLei;
	private Integer pRegProc;
	private Integer pRegReject;
	private Integer pFileId;
	private Integer pError;
	private String pErrorDesc;

	/**
	 * @return the pRegLei
	 */
	public Integer getpRegLei() {
		return pRegLei;
	}

	/**
	 * @param pRegLei the pRegLei to set
	 */
	public void setpRegLei(Integer pRegLei) {
		this.pRegLei = pRegLei;
	}

	/**
	 * @return the pRegProc
	 */
	public Integer getpRegProc() {
		return pRegProc;
	}

	/**
	 * @param pRegProc the pRegProc to set
	 */
	public void setpRegProc(Integer pRegProc) {
		this.pRegProc = pRegProc;
	}

	/**
	 * @return the pRegReject
	 */
	public Integer getpRegReject() {
		return pRegReject;
	}

	/**
	 * @param pRegReject the pRegReject to set
	 */
	public void setpRegReject(Integer pRegReject) {
		this.pRegReject = pRegReject;
	}

	/**
	 * @return the pFileId
	 */
	public Integer getpFileId() {
		return pFileId;
	}

	/**
	 * @param pFileId the pFileId to set
	 */
	public void setpFileId(Integer pFileId) {
		this.pFileId = pFileId;
	}

	/**
	 * @return the pError
	 */
	public Integer getpError() {
		return pError;
	}

	/**
	 * @param pError the pError to set
	 */
	public void setpError(Integer pError) {
		this.pError = pError;
	}

	/**
	 * @return the pErrorDesc
	 */
	public String getpErrorDesc() {
		return pErrorDesc;
	}

	/**
	 * @param pErrorDesc the pErrorDesc to set
	 */
	public void setpErrorDesc(String pErrorDesc) {
		this.pErrorDesc = pErrorDesc;
	}
	

	@Override
	public String toString() {
		return "CifrasControl [pRegLei=" + pRegLei + ", pRegProc=" + pRegProc + ", pRegReject=" + pRegReject
				+ ", pFileId=" + pFileId + ", pError=" + pError + ", pErrorDesc=" + pErrorDesc + "]";
	}

}
