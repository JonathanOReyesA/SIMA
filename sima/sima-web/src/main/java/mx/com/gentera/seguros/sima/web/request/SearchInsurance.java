package mx.com.gentera.seguros.sima.web.request;

public class SearchInsurance {

	public String certificado;
	public String idCliente;
	public String idSolicitud;
	public String nombre;
	public String sNombre;
	public String aPaterno;
	public String aMaterno;
	public String fechaNacimiento;
	public String partnerId;

	public SearchInsurance(String certificado, String idCliente, String idSolicitud, String nombre, String sNombre,
			String aPaterno, String aMaterno, String fechaNacimiento, String partnerId) {
		super();
		this.certificado = certificado;
		this.idCliente = idCliente;
		this.idSolicitud = idSolicitud;
		this.nombre = nombre;
		this.sNombre = sNombre;
		this.aPaterno = aPaterno;
		this.aMaterno = aMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.partnerId = partnerId;
	}

	/**
	 * @return the certificado
	 */
	public String getCertificado() {
		return certificado;
	}

	/**
	 * @param certificado the certificado to set
	 */
	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	/**
	 * @return the idCliente
	 */
	public String getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the idSolicitud
	 */
	public String getIdSolicitud() {
		return idSolicitud;
	}

	/**
	 * @param idSolicitud the idSolicitud to set
	 */
	public void setIdSolicitud(String idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the sNombre
	 */
	public String getsNombre() {
		return sNombre;
	}

	/**
	 * @param sNombre the sNombre to set
	 */
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	/**
	 * @return the aPaterno
	 */
	public String getaPaterno() {
		return aPaterno;
	}

	/**
	 * @param aPaterno the aPaterno to set
	 */
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	/**
	 * @return the aMaterno
	 */
	public String getaMaterno() {
		return aMaterno;
	}

	/**
	 * @param aMaterno the aMaterno to set
	 */
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the partnerId
	 */
	public String getPartnerId() {
		return partnerId;
	}

	/**
	 * @param partnerId the partnerId to set
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	@Override
	public String toString() {
		return "SearchInsurance [certificado=" + certificado + ", idCliente=" + idCliente + ", idSolicitud="
				+ idSolicitud + ", nombre=" + nombre + ", sNombre=" + sNombre + ", aPaterno=" + aPaterno + ", aMaterno="
				+ aMaterno + ", fechaNacimiento=" + fechaNacimiento + ", partnerId=" + partnerId + "]";
	}

}
