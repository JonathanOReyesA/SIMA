package mx.com.gentera.seguros.sima.web.request;

public class FormularioFacturacion {

	public int idPartner;
	public String idProduct;
	public String idRegistro;
	public String idModalidad;
	public String stardate;
	public String enddate;
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
	 * @return the idRegistro
	 */
	public String getIdRegistro() {
		return idRegistro;
	}

	/**
	 * @param idRegistro the idRegistro to set
	 */
	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}

	/**
	 * @return the idModalidad
	 */
	public String getIdModalidad() {
		return idModalidad;
	}

	/**
	 * @param idModalidad the idModalidad to set
	 */
	public void setIdModalidad(String idModalidad) {
		this.idModalidad = idModalidad;
	}

	/**
	 * @return the stardate
	 */
	public String getStardate() {
		return stardate;
	}

	/**
	 * @param stardate the stardate to set
	 */
	public void setStardate(String stardate) {
		this.stardate = stardate;
	}

	/**
	 * @return the enddate
	 */
	public String getEnddate() {
		return enddate;
	}

	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(String enddate) {
		this.enddate = enddate;
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

	@Override
	public String toString() {
		return "FormularioFacturacion [idPartner=" + idPartner + ", idProduct=" + idProduct + ", idRegistro="
				+ idRegistro + ", idModalidad=" + idModalidad + ", stardate=" + stardate + ", enddate=" + enddate
				+ ", user=" + user + "]";
	}

}
