package mx.com.gentera.seguros.sima.scheduler.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class InsuranceCancelItem {

	private String nomAsegurado;
	private String segNomAsegurado;
	private String paternoAsegurado;
	private String maternoAsegurado;
	private String certificado;
	private String fechaCancelacion;
	private String montoPrima;
	private String tipoMvto;
	private String plazo;
	private boolean issuccess;
	private String errorDescription;
	private String[] KEYNAME = new String[] { "NOM_ASEGURADO", "APELLIDO_PATERNO", "CERTIFICADO", "FECHA_CANCELACION",
			"MONTO_PRIMA_NO_DEVENGADA", "TIPO_MOVTO", "PLAZO" };
	private String errorColum = "NO CUENTA CON EL NUMERO DE CAMPOS CORRECTOS";
	private String errorCaracter = "NO SE PERMITEN CARACTERES ESPECIALES, LETRAS MINÚSCULAS O SÍMBOLOS";
	private String errorNumeric = "CAMPO PLAZO NO ES NUMERICO";
	private String errorMVTO = "CAMPO TIPO_MOVTO NO ES VALIDO";
	private String errorMonto = "CAMPO MONTO NO ES NUMERICO";
	private int column = 8;

	public String getNomAsegurado() {
		return this.nomAsegurado;
	}

	public void setNomAsegurado(String nomAsegurado) {
		this.nomAsegurado = nomAsegurado;
	}

	public String getSegNomAsegurado() {
		return this.segNomAsegurado;
	}

	public void setSegNomAsegurado(String segNomAsegurado) {
		this.segNomAsegurado = segNomAsegurado;
	}

	public String getPaternoAsegurado() {
		return this.paternoAsegurado;
	}

	public void setPaternoAsegurado(String paternoAsegurado) {
		this.paternoAsegurado = paternoAsegurado;
	}

	public String getMaternoAsegurado() {
		return this.maternoAsegurado;
	}

	public void setMaternoAsegurado(String maternoAsegurado) {
		this.maternoAsegurado = maternoAsegurado;
	}

	public String getCertificado() {
		return this.certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	public String getFechaCancelacion() {
		return this.fechaCancelacion;
	}

	public void setFechaCancelacion(String fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}

	public String getMontoPrima() {
		return this.montoPrima;
	}

	public void setMontoPrima(String montoPrima) {
		this.montoPrima = montoPrima;
	}

	public String getTipoMvto() {
		return this.tipoMvto;
	}

	public void setTipoMvto(String tipoMvto) {
		this.tipoMvto = tipoMvto;
	}

	public String getPlazo() {
		return this.plazo;
	}

	public void setPlazo(String plazo) {
		this.plazo = plazo;
	}

	public boolean isIssuccess() {
		return this.issuccess;
	}

	public void setIssuccess(boolean issuccess) {
		this.issuccess = issuccess;
	}

	public String getErrorDescription() {
		return this.errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public InsuranceCancelItem(String[] item) {
		this.nomAsegurado = item[0];
		this.segNomAsegurado = item[1];
		this.paternoAsegurado = item[2];
		this.maternoAsegurado = item[3];
		this.certificado = item[4];
		this.fechaCancelacion = item[5];
		this.montoPrima = item[6];
		this.tipoMvto = item[7];
		this.plazo = item[8];
		this.errorDescription = "";
		setIssuccess(true);
	}

	public InsuranceCancelItem() {
		setIssuccess(false);
		this.errorDescription = this.errorColum;
	}

	private boolean isValidateRequired(String value, int i) {
		if (value == null || value.equals("")) {
			this.errorDescription += "EL CAMPO " + this.KEYNAME[i] + " VIENE VACI/n";
			return false;
		}
		return true;
	}

	private boolean longitudValues(int size) {
		if (size <= this.column) {
			this.errorDescription = this.errorColum;
			return true;
		}
		return false;
	}

	public boolean validaciones(String item) {
		if (longitudValues((item.split("\\|")).length) || validateValues() || validCampos(item))
			return false;
		if (validPlazo() || validMvo() || validMonto())
			return false;
		return true;
	}

	private boolean validateValues() {
		return (!isValidateRequired(this.nomAsegurado, 0) || !isValidateRequired(this.paternoAsegurado, 1)
				|| !isValidateRequired(this.certificado, 2) || !isValidateRequired(this.fechaCancelacion, 3)
				|| !isValidateRequired(this.montoPrima, 4) || !isValidateRequired(this.tipoMvto, 5)
				|| !isValidateRequired(this.plazo, 6));
	}

	private boolean validCampos(String value) {
		if (!Pattern.matches("^[A-Z0-9|.]*$", value)) {
			this.errorDescription = this.errorCaracter;
			return true;
		}
		return false;
	}

	private boolean validPlazo() {
		if (!Pattern.matches("^[0-9]*$", this.plazo)) {
			this.errorDescription = this.errorNumeric;
			return true;
		}
		return false;
	}

	private boolean validMonto() {
		try {
			Double.parseDouble(this.montoPrima);
			return false;
		} catch (Exception e) {
			this.errorDescription = this.errorMonto;
			return true;
		}
	}

	private boolean validMvo() {
		if (!this.tipoMvto.equals("C")) {
			this.errorDescription = this.errorMVTO;
			return true;
		}
		return false;
	}

	public String convert() {
		return this.nomAsegurado + "|" + this.segNomAsegurado + "|" + this.paternoAsegurado + "|"
				+ this.maternoAsegurado + "|" + this.certificado + "|" + this.fechaCancelacion + "|" + this.montoPrima
				+ "|" + this.tipoMvto + "|" + this.plazo;
	}

	public String convertError() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return this.certificado + "|" + simpleDateFormat.format(new Date()) + "|" + this.errorDescription;
	}
}
