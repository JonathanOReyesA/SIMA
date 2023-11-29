package mx.com.gentera.seguros.sima.web.model;

public class ModeItem {

	private String modeId;
	private String description;

	/**
	 * @return the modeId
	 */
	public String getModeId() {
		return modeId;
	}

	/**
	 * @param modeId the modeId to set
	 */
	public void setModeId(String modeId) {
		this.modeId = modeId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ModeItem [modeId=" + modeId + ", description=" + description + "]";
	}

}
