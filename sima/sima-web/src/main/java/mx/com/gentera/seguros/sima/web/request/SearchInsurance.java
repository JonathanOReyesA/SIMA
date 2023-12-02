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

	public String getCertificado() {
		return this.certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	public String getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdSolicitud() {
		return this.idSolicitud;
	}

	public void setIdSolicitud(String idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getsNombre() {
		return this.sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getaPaterno() {
		return this.aPaterno;
	}

	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	public String getaMaterno() {
		return this.aMaterno;
	}

	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public SearchInsurance(String partnerId, String certificado, String idCliente, String idSolicitud, String nombre,
			String sNombre, String aPaterno, String aMaterno, String fechaNacimiento) {
		this.certificado = certificado;
		this.partnerId = partnerId;
		this.idCliente = idCliente;
		this.idSolicitud = idSolicitud;
		this.nombre = nombre;
		this.sNombre = sNombre;
		this.aPaterno = aPaterno;
		this.aMaterno = aMaterno;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "SearchInsurance [certificado=" + certificado + ", idCliente=" + idCliente + ", idSolicitud="
				+ idSolicitud + ", nombre=" + nombre + ", sNombre=" + sNombre + ", aPaterno=" + aPaterno + ", aMaterno="
				+ aMaterno + ", fechaNacimiento=" + fechaNacimiento + ", partnerId=" + partnerId + "]";
	}

}
