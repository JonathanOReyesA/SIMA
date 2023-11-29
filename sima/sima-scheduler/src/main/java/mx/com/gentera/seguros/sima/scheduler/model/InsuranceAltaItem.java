package mx.com.gentera.seguros.sima.scheduler.model;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;


public class InsuranceAltaItem {
	private String idCliente;
	private String nomAsegurado;
	private String segNomAsegurado;
	private String aPaterno;
	private String aMaterno;
	private String birthday;
	private String genero;
	private String edoCivil;
	private String pais;
	private String departamento;
	private String provincia;
	private String distrito;
	private String calle;
	private String nExterior;
	private String nInterior;
	private String cp;
	private String tipoIdentificacion;
	private String nIdentificacion;
	private String agencia;
	private String certificado;
	private String codSeguro;
	private String producto;
	private String iVigencia;
	private String fVigencia;
	private String montoPrima;
	private String tMVTO;
	private String plazo;
	private String frecuencia;
	private String tPago;
	private String idCredito;
	private String poliza;
	private String modalidad;
	private String nBeneficiario;
	private String segNomBeneficiario;
	private String aPaternoBeneficiario;
	private String aMaternoBeneficiario;
	private String birthdayBeneficiario;
	private String generoBeneficiario;
	private String eCivilBeneficiario;
	private String porcentajeBeneficiario;
	private String codParentescoBeneficiario;
	private String nBeneficiario2;
	private String segNomBeneficiario2;
	private String aPaternoBeneficiario2;
	private String aMaternoBeneficiario2;
	private String birthdayBeneficiario2;
	private String generoBeneficiario2;
	private String eCivilBeneficiario2;
	private String porcentajeBeneficiario2;
	private String codParentescoBeneficiario2;
	private String prefijo1;
	private String direccionPredio;
	private String referenciaPredio;
	private String urbanizacionPredio;
	private String predio;
	private String dptoPredio;
	private String provinciaPredio;
	private String distritoPredio;
	private String nombreAseguradoAdicional;
	private String aPaternoAseguradoAdicional;
	private String aMaternoAseguradoAdicional;
	private String birthdatAseguradoAdicional;
	private String generoAseguradoAdicional;
	private String eCivilAseguradoAdicional;
	private String parentescoAseguradoAdicional;
	private String errorDescription;

	public InsuranceAltaItem(String item) {
		String[] items = item.split("\\|", -1);
		this.idCliente = items[0];
		this.nomAsegurado = items[1];
		this.segNomAsegurado = items[2];
		this.aPaterno = items[3];
		this.aMaterno = items[4];
		this.birthday = items[5];
		this.genero = items[6];
		this.edoCivil = items[7];
		this.pais = items[8];
		this.departamento = items[9];
		this.provincia = items[10];
		this.distrito = items[11];
		this.calle = items[12];
		this.nExterior = items[13];
		this.nInterior = items[14];
		this.cp = items[15];
		this.tipoIdentificacion = items[16];
		this.nIdentificacion = items[17];
		this.agencia = items[18];
		this.certificado = items[19];
		this.codSeguro = items[20];
		this.producto = items[21];
		this.iVigencia = items[22];
		this.fVigencia = items[23];
		this.montoPrima = items[24];
		this.tMVTO = items[25];
		this.plazo = items[26];
		this.frecuencia = items[27];
		this.tPago = items[28];
		this.idCredito = items[29];
		this.poliza = items[30];
		this.modalidad = items[31];
		this.nBeneficiario = items[32];
		this.segNomBeneficiario = items[33];
		this.aPaternoBeneficiario = items[34];
		this.aMaternoBeneficiario = items[35];
		this.birthdayBeneficiario = items[36];
		this.generoBeneficiario = items[37];
		this.eCivilBeneficiario = items[38];
		this.porcentajeBeneficiario = items[39];
		this.codParentescoBeneficiario = items[40];
		this.nBeneficiario2 = items[41];
		this.segNomBeneficiario2 = items[42];
		this.aPaternoBeneficiario2 = items[43];
		this.aMaternoBeneficiario2 = items[44];
		this.birthdayBeneficiario2 = items[45];
		this.generoBeneficiario2 = items[46];
		this.eCivilBeneficiario2 = items[47];
		this.porcentajeBeneficiario2 = items[48];
		this.codParentescoBeneficiario2 = items[49];
		this.prefijo1 = items[50];
		this.direccionPredio = items[51];
		this.referenciaPredio = items[52];
		this.urbanizacionPredio = items[53];
		this.predio = items[54];
		this.dptoPredio = items[55];
		this.provinciaPredio = items[56];
		this.distritoPredio = items[57];
		this.nombreAseguradoAdicional = items[58];
		this.aPaternoAseguradoAdicional = items[59];
		this.aMaternoAseguradoAdicional = items[60];
		this.birthdatAseguradoAdicional = items[61];
		this.generoAseguradoAdicional = items[62];
		this.eCivilAseguradoAdicional = items[63];
		this.parentescoAseguradoAdicional = items[64];
		this.errorDescription = "";
		this.item = item;
	}

	private String errorNumeric = "CAMPO % NO ES NUMERICO";

	private String errorTipoMov = "TIPO DE MOVIMIENTO SOLO DEBE CONTENER VALORES A Y R";

	private String[] KEYNAME = new String[] { "ID_CLIENTE", "NOM_ASEGURADO", "APELLIDO_PATERNO", "FEC_NACIMIENTO",
			"GENERO", "EDO_CIVIL", "PAIS", "DEPARTAMENTO", "PROVINCIA", "DISTRITO", "CALLE", "TIPO_IDENTIFICACION",
			"NUMERO_IDENTIFICACION", "AGENCIA", "CERTIFICADO", "COD_SEGURO", "PRODUCTO", "INICIO_VIGENCIA",
			"FIN_VIGENCIA", "MONTO_PRIMA", "PLAZO", "FRECUENCIA", "TIPO_PAGO", "ID_CREDITO", "POLIZA", "MODALIDAD",
			"NOMBRE_BENEFICIARIO", "APELLIDO_PATERNO_BENEFICIARIO", "ESTADO_CIVIL_BENEFICIARIO",
			"PORCENTAJE_BENEFICIARIO", "COD_PARENTESCO_BENEFICIARIO", "PREFIJO 1 CALLE, AV, JR DEL PREDIO",
			"DIRECCION DEL PREDIO", "REFERENCIA DEL PREDIO", "URBANIZACION DEL PREDIO", "DEPARTAMENTO DEL PREDIO",
			"PROVINCIA DEL PREDIO", "DISTRITO DEL PREDIO", "ERROR EN LOS CAMPOS DEL BENEFICIARIO 2" };

	private String ind = "INDIVIDUAL";

	private String fam = "FAMILIAR";

	private boolean success;

	private int column = 0;

	private String errorCaracter = "NO SE PERMITEN CARACTERES ESPECIALES, LETRAS MINÚSCULAS O SÍMBOLOS";

	private String errorColum = "NO CUENTA CON EL NUMERO DE CAMPOS CORRECTOS";

	private String item = "";

	int limitTrunc = 40;

	String pattern = "yyyy-MM-dd";

	public InsuranceAltaItem() {
	}

	public String getErrorDescription() {
		return this.errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public boolean isSuccess() {
		return this.success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean validCamposObligatorios() {
		return (validRequired(this.idCliente, 0) && validRequired(this.nomAsegurado, 1)
				&& validRequired(this.aPaterno, 2) && validRequired(this.birthday, 3) && validRequired(this.genero, 4)
				&& validRequired(this.edoCivil, 5) && validRequired(this.pais, 6) && validRequired(this.departamento, 7)
				&& validRequired(this.provincia, 8) && validRequired(this.distrito, 9) && validRequired(this.calle, 10)
				&& validRequired(this.tipoIdentificacion, 11) && validRequired(this.nIdentificacion, 12)
				&& validRequired(this.agencia, 13) && validRequired(this.certificado, 14)
				&& validRequired(this.codSeguro, 15) && validRequired(this.producto, 16)
				&& validRequired(this.iVigencia, 17) && validRequired(this.fVigencia, 18)
				&& validRequired(this.montoPrima, 19) && validRequired(this.plazo, 20)
				&& validRequired(this.frecuencia, 21) && validRequired(this.tPago, 22)
				&& validRequired(this.idCredito, 23) && validRequired(this.poliza, 24)
				&& validRequired(this.modalidad, 25) && validRequired(this.nBeneficiario, 26)
				&& validRequired(this.aPaternoBeneficiario, 27) && validRequired(this.porcentajeBeneficiario, 29)
				&& validRequired(this.codParentescoBeneficiario, 30));
	}

	public boolean validRequired(String val, int i) {
		if (val.equals("") || val == null) {
			this.errorDescription += "NO EXISTE CAMPO " + this.KEYNAME[i];
			return false;
		}
		return true;
	}

	private boolean validNumeric(String value) {
		if (!Pattern.matches("^[0-9]*$", value))
			return true;
		return false;
	}

	private boolean validMonto() {
		try {
			Double.parseDouble(this.montoPrima);
			return false;
		} catch (Exception e) {
			return true;
		}
	}

	private boolean validCamposNumericos() {
		if (validNumeric(this.porcentajeBeneficiario2)) {
			this.errorDescription = this.errorNumeric.replace("%", "PORCENTAJE_BENEFICIARIO2");
			return true;
		}
		if (validNumeric(this.porcentajeBeneficiario)) {
			this.errorDescription = this.errorNumeric.replace("%", "PORCENTAJE_BENEFICIARIO");
			return true;
		}
		if (validNumeric(this.plazo)) {
			this.errorDescription = this.errorNumeric.replace("%", "PLAZO");
			return true;
		}
		if (validMonto()) {
			this.errorDescription = this.errorNumeric.replace("%", "MONTO_PRIMA");
			return true;
		}
		return false;
	}

	private boolean validCampos(String value) {
		if (!Pattern.matches("^[A-Z0-9.|]*$", value)) {
			this.errorDescription = this.errorCaracter;
			return true;
		}
		return false;
	}

	private boolean longitudValues(int size) {
		if (size <= this.column) {
			this.errorDescription = this.errorColum;
			return true;
		}
		return false;
	}

	public boolean validaciones(String item) {
		if (longitudValues((item.split("\\|")).length) || validCampos(item) || validCamposNumericos()
				|| !validCamposObligatorios() || validBeneficiarios() || validModalidad() || validTipoMovimiento()
				|| validEdoCivil() || validGenero())
			return false;
		truncate();
		return true;
	}

	public String convertError() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.pattern);
		return this.certificado + "|" + simpleDateFormat.format(new Date()) + "|" + this.errorDescription;
	}

	public String convert() {
		return this.item;
	}

	private boolean validBeneficiarios() {
		if (Integer.parseInt(this.porcentajeBeneficiario) == 100 && camposNoObligatoriosBeneficiario2())
			return false;
		if (camposObligatoriosBeneficiario2() && validPorcentajeBeneficiarios()) {
			if (validProductoEmprendedor()) {
				this.errorDescription = validCamposNoObligatorios(this.porcentajeBeneficiario2)
						? "DEBE EXISTIR AL MENOS UN BENEFICIARIO PARA EL PRODUCTO 'SEGURO EMPRENDEDOR'"
						: "DEBE EXISTIR SOLO UN BENEFICIARIO PARA EL PRODUCTO 'SEGURO EMPRENDEDOR'";
				return true;
			}
			return false;
		}
		this.errorDescription = validCamposNoObligatorios(this.porcentajeBeneficiario2)
				? "EL PORCERTAJE DEL BENEFICIARIO NO ES EL 100%"
				: "EL PORCERTAJE DE LOS BENEFICIARIOS NO ES EL 100%";
		return true;
	}

	private boolean validProductoEmprendedor() {
		return (Integer.parseInt(this.codSeguro) == 21);
	}

	private boolean validPorcentajeBeneficiarios() {
		return (Integer.parseInt(this.porcentajeBeneficiario) + Integer.parseInt(this.porcentajeBeneficiario2) == 100);
	}

	private boolean camposNoObligatoriosBeneficiario2() {
		return (validCamposNoObligatorios(this.nBeneficiario2) && validCamposNoObligatorios(this.aPaternoBeneficiario2)
				&& validCamposNoObligatorios(this.aMaternoBeneficiario2)
				&& validCamposNoObligatorios(this.birthdayBeneficiario2)
				&& validCamposNoObligatorios(this.codParentescoBeneficiario2)
				&& validCamposNoObligatorios(this.eCivilBeneficiario2)
				&& validCamposNoObligatorios(this.generoBeneficiario2)
				&& validCamposNoObligatorios(this.porcentajeBeneficiario2)
				&& validCamposNoObligatorios(this.segNomBeneficiario2));
	}

	private boolean camposObligatoriosBeneficiario2() {
		return (validRequired(this.nBeneficiario2, 38) && validRequired(this.aPaternoBeneficiario2, 38)
				&& validRequired(this.eCivilBeneficiario2, 38) && validRequired(this.porcentajeBeneficiario2, 38)
				&& validRequired(this.codParentescoBeneficiario2, 38));
	}

	private boolean validCamposNoObligatorios(String value) {
		return (value == null || value.equals(""));
	}

	private boolean validModalidadIndividual() {
		return (validCamposNoObligatorios(this.nombreAseguradoAdicional)
				&& validCamposNoObligatorios(this.aPaternoAseguradoAdicional)
				&& validCamposNoObligatorios(this.aMaternoAseguradoAdicional)
				&& validCamposNoObligatorios(this.birthdatAseguradoAdicional)
				&& validCamposNoObligatorios(this.generoAseguradoAdicional)
				&& validCamposNoObligatorios(this.eCivilAseguradoAdicional)
				&& validCamposNoObligatorios(this.parentescoAseguradoAdicional));
	}

	private boolean validModalidadFamiliar() {
		return (validRequired(this.nombreAseguradoAdicional, 38) && validRequired(this.aPaternoAseguradoAdicional, 38)
				&& validRequired(this.birthdatAseguradoAdicional, 38));
	}

	private boolean validModalidad() {
		if (this.modalidad.equals(this.ind) && validModalidadIndividual())
			return false;
		if (this.modalidad.equals(this.fam) && validModalidadFamiliar())
			return false;
		this.errorDescription = this.modalidad.equals(this.ind)
				? "NO DEBE HABER INFORMACION DE FAMILIARES EN MODALIDAD INDIVIDUAL"
				: "EN MODALIDAD FAMILIAR DEBEN ESTAR LLENOS LOS CAMPOS OBLIGATORIOS DE FAMILIAR (NOMBRE,APELLIDO PATERNO,FECHA DE NACIMIENTO)";
		return true;
	}

	private boolean validTipoMovimiento() {
		if (!this.tMVTO.equals("A") && !this.tMVTO.equals("R")) {
			this.errorDescription = this.errorTipoMov;
			return true;
		}
		return false;
	}

	private void truncate() {
		if (this.nomAsegurado.length() > this.limitTrunc)
			this.nomAsegurado = this.nomAsegurado.substring(0, this.limitTrunc);
		if (this.segNomAsegurado.length() > this.limitTrunc)
			this.segNomAsegurado = this.segNomAsegurado.substring(0, this.limitTrunc);
		if (this.aPaterno.length() > this.limitTrunc)
			this.aPaterno = this.aPaterno.substring(0, this.limitTrunc);
		if (this.aMaterno.length() > this.limitTrunc)
			this.aMaterno = this.aMaterno.substring(0, this.limitTrunc);
		if (this.aPaternoAseguradoAdicional.length() > this.limitTrunc)
			this.aPaternoAseguradoAdicional = this.aPaternoAseguradoAdicional.substring(0, this.limitTrunc);
		if (this.aMaternoAseguradoAdicional.length() > this.limitTrunc)
			this.aMaternoAseguradoAdicional = this.aMaternoAseguradoAdicional.substring(0, this.limitTrunc);
		if (this.aPaternoBeneficiario.length() > this.limitTrunc)
			this.aPaternoBeneficiario = this.aPaternoBeneficiario.substring(0, this.limitTrunc);
		if (this.aMaternoBeneficiario.length() > this.limitTrunc)
			this.aMaternoBeneficiario = this.aMaternoBeneficiario.substring(0, this.limitTrunc);
	}

	private boolean validMultiriesgo() {
		if (Integer.parseInt(this.codSeguro) == 22 || Integer.parseInt(this.codSeguro) == 23) {
			if (validCamposObligatoriosMultiriesgo()) {
				this.errorDescription = (Integer.parseInt(this.codSeguro) == 22)
						? "EL PRODUCTO SEGURO PROTECCIGRUPAL EMPRENDEDOR DEBE CONTAR CON LOS CAMPOS DEL INMUEBLE"
						: "EL PRODUCTO SEGURO PROTECCIINDIVIDUAL EMPRENDEDOR DEBE CONTAR CON LOS CAMPOS DEL INMUEBLE";
				return true;
			}
			return false;
		}
		if (!validCamposNoObligatoriosMultiriesgo()) {
			this.errorDescription = validProductoEmprendedor()
					? "NO DEBEN EXISTIR DATOS DE BIENES PARA PRODUCTO 'SEGURO EMPRENDEDOR' "
					: "NO DEBEN EXISTIR DATOS DE BIENES PARA PRODUCTO 'SEGURO PROTECCION COMPARTAMOS' ";
			return true;
		}
		return false;
	}

	private boolean validCamposObligatoriosMultiriesgo() {
		return (validRequired(this.prefijo1, 38) && validRequired(this.direccionPredio, 38)
				&& validRequired(this.referenciaPredio, 38) && validRequired(this.urbanizacionPredio, 38)
				&& validRequired(this.departamento, 38) && validRequired(this.provincia, 38)
				&& validRequired(this.distritoPredio, 38));
	}

	private boolean validCamposNoObligatoriosMultiriesgo() {
		return (validCamposNoObligatorios(this.prefijo1) && validCamposNoObligatorios(this.direccionPredio)
				&& validCamposNoObligatorios(this.referenciaPredio)
				&& validCamposNoObligatorios(this.urbanizacionPredio) && validCamposNoObligatorios(this.departamento)
				&& validCamposNoObligatorios(this.provincia) && validCamposNoObligatorios(this.distritoPredio));
	}

	private boolean validEdoCivil() {
		List<String> permitido = Arrays.asList(new String[] { "C", "D", "S", "V", "U" });
		if (permitido.contains(this.edoCivil))
			return false;
		this.errorDescription = "EL ESTADO CIVIL SOLO PUEDE SER C, D, S, V Y U.";
		return true;
	}

	private boolean validGenero() {
		if (this.genero.equals("M") || this.genero.equals("F"))
			return false;
		this.errorDescription = "VALIDAR QUE LA COLUMNA GENERO CONTENGA SOLO LAS LETRAS M O F";
		return true;
	}
}
