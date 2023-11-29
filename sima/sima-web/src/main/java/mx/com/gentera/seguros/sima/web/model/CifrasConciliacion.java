package mx.com.gentera.seguros.sima.web.model;

import mx.com.gentera.seguros.sima.web.annotations.SourceTableField;

public class CifrasConciliacion {

	@SourceTableField(name = "TOT_REG")
	public String tot;
	@SourceTableField(name = "TYPE")
	public String type;
	@SourceTableField(name = "TYPE_DESCRIPTION")
	public String description;

	/**
	 * @return the tot
	 */
	public String getTot() {
		return tot;
	}

	/**
	 * @param tot the tot to set
	 */
	public void setTot(String tot) {
		this.tot = tot;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
		return "CifrasConciliacion [tot=" + tot + ", type=" + type + ", description=" + description + "]";
	}
}
