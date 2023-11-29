package mx.com.gentera.seguros.sima.web.request;

import java.io.Serializable;

public class FormularioConciliacion implements Serializable {
	private static final long serialVersionUID = 1L;

	public int idPartner;
	public int typeCons;
	public String idProduct;
	public int idModalidad;
	public String stardatePeriodo;
	public String enddatePeriodo;
	public String startDateCierre;
	public String enddateCierre;
	public String user;

	/**
	 * @return the idPartner
	 */
	public int getIdPartner() {
		return idPartner;
	}

	/**
	 * @param idPartner the idPartner to set
	 */
	public void setIdPartner(int idPartner) {
		this.idPartner = idPartner;
	}

	/**
	 * @return the typeCons
	 */
	public int getTypeCons() {
		return typeCons;
	}

	/**
	 * @param typeCons the typeCons to set
	 */
	public void setTypeCons(int typeCons) {
		this.typeCons = typeCons;
	}

	/**
	 * @return the idProduct
	 */
	public String getIdProduct() {
		return idProduct;
	}

	/**
	 * @param idProduct the idProduct to set
	 */
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	/**
	 * @return the idModalidad
	 */
	public int getIdModalidad() {
		return idModalidad;
	}

	/**
	 * @param idModalidad the idModalidad to set
	 */
	public void setIdModalidad(int idModalidad) {
		this.idModalidad = idModalidad;
	}

	/**
	 * @return the stardatePeriodo
	 */
	public String getStardatePeriodo() {
		return stardatePeriodo;
	}

	/**
	 * @param stardatePeriodo the stardatePeriodo to set
	 */
	public void setStardatePeriodo(String stardatePeriodo) {
		this.stardatePeriodo = stardatePeriodo;
	}

	/**
	 * @return the enddatePeriodo
	 */
	public String getEnddatePeriodo() {
		return enddatePeriodo;
	}

	/**
	 * @param enddatePeriodo the enddatePeriodo to set
	 */
	public void setEnddatePeriodo(String enddatePeriodo) {
		this.enddatePeriodo = enddatePeriodo;
	}

	/**
	 * @return the startDateCierre
	 */
	public String getStartDateCierre() {
		return startDateCierre;
	}

	/**
	 * @param startDateCierre the startDateCierre to set
	 */
	public void setStartDateCierre(String startDateCierre) {
		this.startDateCierre = startDateCierre;
	}

	/**
	 * @return the enddateCierre
	 */
	public String getEnddateCierre() {
		return enddateCierre;
	}

	/**
	 * @param enddateCierre the enddateCierre to set
	 */
	public void setEnddateCierre(String enddateCierre) {
		this.enddateCierre = enddateCierre;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "FormularioConciliacion [idPartner=" + idPartner + ", typeCons=" + typeCons + ", idProduct=" + idProduct
				+ ", idModalidad=" + idModalidad + ", stardatePeriodo=" + stardatePeriodo + ", enddatePeriodo="
				+ enddatePeriodo + ", startDateCierre=" + startDateCierre + ", enddateCierre=" + enddateCierre
				+ ", user=" + user + "]";
	}

}
