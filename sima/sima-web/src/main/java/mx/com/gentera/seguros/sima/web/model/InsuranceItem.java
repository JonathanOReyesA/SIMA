package mx.com.gentera.seguros.sima.web.model;

import java.text.SimpleDateFormat;
import java.util.Date;
//import mx.com.gentera.seguros.sima.web.model.BusinessPartnerItem;
//import mx.com.gentera.seguros.sima.web.model.ModeItem;
//import mx.com.gentera.seguros.sima.web.model.PartnerItem;
//import mx.com.gentera.seguros.sima.web.model.ProductItem;
//import mx.com.gentera.seguros.sima.web.model.StatusItem;

public class InsuranceItem {
	
	private PartnerItem partner;
	private ProductItem product;
	private ModeItem mode;
	private BusinessPartnerItem businessPartner;
	private String insuranceId;
	private String certificate;
	private Date startDate;
	private Date endDate;
	private StatusItem status;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	public PartnerItem getPartner() {
		return this.partner;
	}

	public void setPartner(PartnerItem partner) {
		this.partner = partner;
	}

	public ProductItem getProduct() {
		return this.product;
	}

	public void setProduct(ProductItem product) {
		this.product = product;
	}

	public ModeItem getMode() {
		return this.mode;
	}

	public void setMode(ModeItem mode) {
		this.mode = mode;
	}

	public BusinessPartnerItem getBusinessPartner() {
		return this.businessPartner;
	}

	public void setBusinessPartner(BusinessPartnerItem businessPartner) {
		this.businessPartner = businessPartner;
	}

	public String getInsuranceId() {
		return this.insuranceId;
	}

	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getCertificate() {
		return this.certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public String getStartDateFormatted() {
		return this.sdf.format(this.startDate);
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public String getEndDateFormatted() {
		return this.sdf.format(this.endDate);
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public StatusItem getStatus() {
		return this.status;
	}

	public void setStatus(StatusItem status) {
		this.status = status;
	}
}
