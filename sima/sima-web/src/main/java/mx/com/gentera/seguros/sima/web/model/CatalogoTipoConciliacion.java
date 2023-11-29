package mx.com.gentera.seguros.sima.web.model;

import mx.com.gentera.seguros.sima.web.annotations.SourceTableField;

public class CatalogoTipoConciliacion {

	@SourceTableField(name = "CONCILIATIONTYPEID")
	public String id;
	@SourceTableField(name = "CONCILIATIONNAME")
	public String name;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CatalogoTipoConciliacion [id=" + id + ", name=" + name + "]";
	}
}
