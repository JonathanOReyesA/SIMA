package mx.com.gentera.seguros.sima.web.model;

import java.util.Date;
import mx.com.gentera.seguros.sima.web.annotations.SourceTableField;

public class Insurance {
	@SourceTableField(name = "INSURANCEID")
	public String insuranceId;

	@SourceTableField(name = "CERTIFICATE")
	public String certificate;

	@SourceTableField(name = "INSURANCEPOLICY")
	public String insurancePolicy;

	@SourceTableField(name = "BUSINESSPARTNERID")
	public String businessPartnerID;

	@SourceTableField(name = "FULLNAME")
	public String fullname;

	@SourceTableField(name = "BIRTHDATE")
	public Date birthday;

	@SourceTableField(name = "PRODUCTNAME")
	public String productName;

	@SourceTableField(name = "DESCRIPTION")
	public String description;

	@SourceTableField(name = "COST")
	public String cost;

	@SourceTableField(name = "PREMIUM")
	public String premium;

	@SourceTableField(name = "STARTDATE")
	public Date startDate;

	@SourceTableField(name = "ENDDATE")
	public Date endDate;

	@SourceTableField(name = "STATUSNAME")
	public String statusName;

	@SourceTableField(name = "FEC_ALTA_MAPFRE")
	public Date fecAltaMapfre;

	@SourceTableField(name = "FEC_BAJA_MAPFRE")
	public Date fechaBajaMapfre;

	@SourceTableField(name = "SOCIO")
	public String socio;

	@SourceTableField(name = "SALES_OFFICE")
	public String salesOffice;

	@SourceTableField(name = "TIPO_PAGO")
	public String tipoPago;
	
	@SourceTableField(name = "NUM_FAMILIARES")
	public String numeroFamiliares;
	
	@SourceTableField(name = "NAME_FILE")
	public String nameFile;
}
