package mx.com.gentera.seguros.sima.web.model;

import mx.com.gentera.seguros.sima.web.annotations.SourceTableField;

public class CatalogoModalidad {

	@SourceTableField(name = "MODECATALOGUEID")
	public String id;

	@SourceTableField(name = "MODEID")
	public String modeId;

	@SourceTableField(name = "DESCRIPTION")
	public String description;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

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
		return "CatalogoModalidad [id=" + id + ", modeId=" + modeId + ", description=" + description + "]";
	}
}
