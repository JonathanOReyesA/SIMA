package mx.com.gentera.seguros.sima.scheduler.model;

import java.util.Date;
import mx.com.gentera.seguros.sima.scheduler.annotations.SourceTableField;

public class InsuranceItem {

	@SourceTableField(name = "INSURANCEID")
	private String insuranceId;

	@SourceTableField(name = "BUSINESSPARTNERID")
	private String businessPartnerId;

	@SourceTableField(name = "CERTIFICATE")
	private String certificate;

	@SourceTableField(name = "MACROPOLICY")
	private String macroPolicy;

	@SourceTableField(name = "INSURANCECYCLE")
	private String insuranceCycle;

	@SourceTableField(name = "CYCLETOTAL")
	private String cycleTotal;

	@SourceTableField(name = "PRODUCTID")
	private String productId;

	@SourceTableField(name = "PRODUCTNAME")
	private String productName;

	@SourceTableField(name = "PRODUCTQUOTE")
	private Long productQuote;

	@SourceTableField(name = "PRODUCTINSUREDAMOUNT")
	private Long productInsuredAmount;

	@SourceTableField(name = "PRODUCTMARKET")
	private String productMarket;

	@SourceTableField(name = "PRODUCTMODE")
	private String productMode;

	@SourceTableField(name = "POSTEDDATE")
	private Date postedDate;

	@SourceTableField(name = "STARTDATE")
	private Date startDate;

	@SourceTableField(name = "ENDDATE")
	private Date endDate;

	@SourceTableField(name = "ACTUALENDDATE")
	private Date actualEndDate;

	@SourceTableField(name = "PAYMENTTYPE")
	private String paymentType;

	@SourceTableField(name = "PAYMENTFREQUENCY")
	private String paymentFrequency;

	@SourceTableField(name = "TERM")
	private Long term;

	@SourceTableField(name = "GROUPID")
	private String groupId;

	@SourceTableField(name = "GROUPNAME")
	private String groupName;

	@SourceTableField(name = "STATUSID")
	private Long statusId;

	@SourceTableField(name = "LASTSTATUSDATE")
	private Date lastStatusDate;

	@SourceTableField(name = "PREVIOUSSTATUSID")
	private Integer previousStatusId;

	@SourceTableField(name = "COSTCENTERCODE")
	private String costCenterCode;

	@SourceTableField(name = "ORIGINALSALESOFFICECENTERCODE")
	private String originalSalesOfficeCenterCode;

	@SourceTableField(name = "COLLABORATORID")
	private String collaboratorId;

	@SourceTableField(name = "COLLABORATORNAME")
	private String collaboratorName;

	@SourceTableField(name = "COLLABORATORJOB")
	private String collaboratorJob;

	@SourceTableField(name = "ORIGINALCOLLABORATORID")
	private String originalCollaboratorId;

	@SourceTableField(name = "ORIGINALCOLLABORATORNAME")
	private String originalCollaboratorName;

	@SourceTableField(name = "ORIGINALCOLLABORATORJOB")
	private String originalCollaboratorJob;

	@SourceTableField(name = "BUSINESSPARTNERDATA")
	private String businessPartnerData;

	@SourceTableField(name = "SERVICEDATA")
	private String serviceData;

	@SourceTableField(name = "PARTNERID")
	private Long partnerId;

	@SourceTableField(name = "COUNTRYID")
	private Long countryId;

	@SourceTableField(name = "IDENTIFTIT")
	private String identifTit;

	@SourceTableField(name = "IDENTIFBEN")
	private String identifBen;

	@SourceTableField(name = "IDENTIFFAM")
	private String identifFam;

	@SourceTableField(name = "PREVIOUSINSURANCEID")
	private String previousInsuranceId;

	@SourceTableField(name = "PRODUCTFLAG")
	private String productFlag;

	@SourceTableField(name = "ORIGINALSALESOFFICEINTERNALID")
	private String originalSalesOfficeInternalId;

	@SourceTableField(name = "SALESOFFICEINTERNALID")
	private String salesOfficeInternalId;

	public String getInsuranceId() {
		return this.insuranceId;
	}

	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getBusinessPartnerId() {
		return this.businessPartnerId;
	}

	public void setBusinessPartnerId(String businessPartnerId) {
		this.businessPartnerId = businessPartnerId;
	}

	public String getCertificate() {
		return this.certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getMacroPolicy() {
		return this.macroPolicy;
	}

	public void setMacroPolicy(String macroPolicy) {
		this.macroPolicy = macroPolicy;
	}

	public String getInsuranceCycle() {
		return this.insuranceCycle;
	}

	public void setInsuranceCycle(String insuranceCycle) {
		this.insuranceCycle = insuranceCycle;
	}

	public String getCycleTotal() {
		return this.cycleTotal;
	}

	public void setCycleTotal(String cycleTotal) {
		this.cycleTotal = cycleTotal;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getProductQuote() {
		return this.productQuote;
	}

	public void setProductQuote(Long productQuote) {
		this.productQuote = productQuote;
	}

	public Long getProductInsuredAmount() {
		return this.productInsuredAmount;
	}

	public void setProductInsuredAmount(Long productInsuredAmount) {
		this.productInsuredAmount = productInsuredAmount;
	}

	public String getProductMarket() {
		return this.productMarket;
	}

	public void setProductMarket(String productMarket) {
		this.productMarket = productMarket;
	}

	public String getProductMode() {
		return this.productMode;
	}

	public void setProductMode(String productMode) {
		this.productMode = productMode;
	}

	public Date getPostedDate() {
		return this.postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getActualEndDate() {
		return this.actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentFrequency() {
		return this.paymentFrequency;
	}

	public void setPaymentFrequency(String paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public Long getTerm() {
		return this.term;
	}

	public void setTerm(Long term) {
		this.term = term;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Date getLastStatusDate() {
		return this.lastStatusDate;
	}

	public void setLastStatusDate(Date lastStatusDate) {
		this.lastStatusDate = lastStatusDate;
	}

	public Integer getPreviousStatusId() {
		return this.previousStatusId;
	}

	public void setPreviousStatusId(Integer previousStatusId) {
		this.previousStatusId = previousStatusId;
	}

	public String getCostCenterCode() {
		return this.costCenterCode;
	}

	public void setCostCenterCode(String costCenterCode) {
		this.costCenterCode = costCenterCode;
	}

	public String getOriginalSalesOfficeCenterCode() {
		return this.originalSalesOfficeCenterCode;
	}

	public void setOriginalSalesOfficeCenterCode(String originalSalesOfficeCenterCode) {
		this.originalSalesOfficeCenterCode = originalSalesOfficeCenterCode;
	}

	public String getCollaboratorId() {
		return this.collaboratorId;
	}

	public void setCollaboratorId(String collaboratorId) {
		this.collaboratorId = collaboratorId;
	}

	public String getCollaboratorName() {
		return this.collaboratorName;
	}

	public void setCollaboratorName(String collaboratorName) {
		this.collaboratorName = collaboratorName;
	}

	public String getCollaboratorJob() {
		return this.collaboratorJob;
	}

	public void setCollaboratorJob(String collaboratorJob) {
		this.collaboratorJob = collaboratorJob;
	}

	public String getOriginalCollaboratorId() {
		return this.originalCollaboratorId;
	}

	public void setOriginalCollaboratorId(String originalCollaboratorId) {
		this.originalCollaboratorId = originalCollaboratorId;
	}

	public String getOriginalCollaboratorName() {
		return this.originalCollaboratorName;
	}

	public void setOriginalCollaboratorName(String originalCollaboratorName) {
		this.originalCollaboratorName = originalCollaboratorName;
	}

	public String getOriginalCollaboratorJob() {
		return this.originalCollaboratorJob;
	}

	public void setOriginalCollaboratorJob(String originalCollaboratorJob) {
		this.originalCollaboratorJob = originalCollaboratorJob;
	}

	public String getBusinessPartnerData() {
		return this.businessPartnerData;
	}

	public void setBusinessPartnerData(String businessPartnerData) {
		this.businessPartnerData = businessPartnerData;
	}

	public String getServiceData() {
		return this.serviceData;
	}

	public void setServiceData(String serviceData) {
		this.serviceData = serviceData;
	}

	public Long getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}

	public Long getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getIdentifTit() {
		return this.identifTit;
	}

	public void setIdentifTit(String identifTit) {
		this.identifTit = identifTit;
	}

	public String getIdentifBen() {
		return this.identifBen;
	}

	public void setIdentifBen(String identifBen) {
		this.identifBen = identifBen;
	}

	public String getIdentifFam() {
		return this.identifFam;
	}

	public void setIdentifFam(String identifFam) {
		this.identifFam = identifFam;
	}

	public String getPreviousInsuranceId() {
		return this.previousInsuranceId;
	}

	public void setPreviousInsuranceId(String previousInsuranceId) {
		this.previousInsuranceId = previousInsuranceId;
	}

	public String getProductFlag() {
		return this.productFlag;
	}

	public void setProductFlag(String productFlag) {
		this.productFlag = productFlag;
	}

	public String getOriginalSalesOfficeInternalId() {
		return this.originalSalesOfficeInternalId;
	}

	public void setOriginalSalesOfficeInternalId(String originalSalesOfficeInternalId) {
		this.originalSalesOfficeInternalId = originalSalesOfficeInternalId;
	}

	public String getSalesOfficeInternalId() {
		return this.salesOfficeInternalId;
	}

	public void setSalesOfficeInternalId(String salesOfficeInternalId) {
		this.salesOfficeInternalId = salesOfficeInternalId;
	}

	public String toString() {
		return "InsuranceItem [insuranceId=" + this.insuranceId + ", businessPartnerId=" + this.businessPartnerId
				+ ", certificate=" + this.certificate + ", macroPolicy=" + this.macroPolicy + ", insuranceCycle="
				+ this.insuranceCycle + ", cycleTotal=" + this.cycleTotal + ", productId=" + this.productId
				+ ", productName=" + this.productName + ", productQuote=" + this.productQuote
				+ ", productInsuredAmount=" + this.productInsuredAmount + ", productMarket=" + this.productMarket
				+ ", productMode=" + this.productMode + ", postedDate=" + this.postedDate + ", startDate="
				+ this.startDate + ", endDate=" + this.endDate + ", actualEndDate=" + this.actualEndDate
				+ ", paymentType=" + this.paymentType + ", paymentFrequency=" + this.paymentFrequency + ", term="
				+ this.term + ", groupId=" + this.groupId + ", groupName=" + this.groupName + ", statusId="
				+ this.statusId + ", lastStatusDate=" + this.lastStatusDate + ", previousStatusId="
				+ this.previousStatusId + ", costCenterCode=" + this.costCenterCode + ", originalSalesOfficeCenterCode="
				+ this.originalSalesOfficeCenterCode + ", collaboratorId=" + this.collaboratorId + ", collaboratorName="
				+ this.collaboratorName + ", collaboratorJob=" + this.collaboratorJob + ", originalCollaboratorId="
				+ this.originalCollaboratorId + ", originalCollaboratorName=" + this.originalCollaboratorName
				+ ", originalCollaboratorJob=" + this.originalCollaboratorJob + ", businessPartnerData="
				+ this.businessPartnerData + ", serviceData=" + this.serviceData + ", partnerId=" + this.partnerId
				+ ", countryId=" + this.countryId + ", identifTit=" + this.identifTit + ", identifBen="
				+ this.identifBen + ", identifFam=" + this.identifFam + ", previousInsuranceId="
				+ this.previousInsuranceId + ", productFlag=" + this.productFlag + ", originalSalesOfficeInternalId="
				+ this.originalSalesOfficeInternalId + ", salesOfficeInternalId=" + this.salesOfficeInternalId + "]";
	}
}
