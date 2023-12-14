package com.gentera.insurances.beans;

public class JobPropertiesBean {

	private String storedProcedureName;
	private String sqlQuery;
	private String byItemStoredProcedureName;
	private String afterStepStoredProcedureName;
	private String localSourceFolder;
	private String localTargetFolder;
	private String remoteSourceFolder;
	private String remoteTargetFolder;
	private String remoteTargetFolderCopy;
	private String remoteTargetFolderProcessed;
	private String remoteTargetFolderError;
	private String remoteTargetFileName;
	private String pattern;
	private String prefix;
	private String sufix;
	private String destinationEmailError;
	private String subjectEmailError;
	private String partnerId;
	private Integer chunk;
	private String productType;
	private Integer recordsPerCall;

	public String getStoredProcedureName() {
		return this.storedProcedureName;
	}

	public void setStoredProcedureName(String storedProcedureName) {
		this.storedProcedureName = storedProcedureName;
	}

	public String getSqlQuery() {
		return this.sqlQuery;
	}

	public void setSqlQuery(String sqlQuery) {
		this.sqlQuery = sqlQuery;
	}

	public String getByItemStoredProcedureName() {
		return this.byItemStoredProcedureName;
	}

	public void setByItemStoredProcedureName(String byItemStoredProcedureName) {
		this.byItemStoredProcedureName = byItemStoredProcedureName;
	}

	public String getAfterStepStoredProcedureName() {
		return this.afterStepStoredProcedureName;
	}

	public void setAfterStepStoredProcedureName(String afterStepStoredProcedureName) {
		this.afterStepStoredProcedureName = afterStepStoredProcedureName;
	}

	public String getLocalSourceFolder() {
		return this.localSourceFolder;
	}

	public void setLocalSourceFolder(String localSourceFolder) {
		this.localSourceFolder = localSourceFolder;
	}

	public String getLocalTargetFolder() {
		return this.localTargetFolder;
	}

	public void setLocalTargetFolder(String localTargetFolder) {
		this.localTargetFolder = localTargetFolder;
	}

	public String getRemoteSourceFolder() {
		return this.remoteSourceFolder;
	}

	public void setRemoteSourceFolder(String remoteSourceFolder) {
		this.remoteSourceFolder = remoteSourceFolder;
	}

	public String getRemoteTargetFolder() {
		return this.remoteTargetFolder;
	}

	public void setRemoteTargetFolder(String remoteTargetFolder) {
		this.remoteTargetFolder = remoteTargetFolder;
	}

	public String getRemoteTargetFolderCopy() {
		return this.remoteTargetFolderCopy;
	}

	public void setRemoteTargetFolderCopy(String remoteTargetFolderCopy) {
		this.remoteTargetFolderCopy = remoteTargetFolderCopy;
	}

	public String getRemoteTargetFolderProcessed() {
		return this.remoteTargetFolderProcessed;
	}

	public void setRemoteTargetFolderProcessed(String remoteTargetFolderProcessed) {
		this.remoteTargetFolderProcessed = remoteTargetFolderProcessed;
	}

	public String getRemoteTargetFolderError() {
		return this.remoteTargetFolderError;
	}

	public void setRemoteTargetFolderError(String remoteTargetFolderError) {
		this.remoteTargetFolderError = remoteTargetFolderError;
	}

	public String getRemoteTargetFileName() {
		return this.remoteTargetFileName;
	}

	public void setRemoteTargetFileName(String remoteTargetFileName) {
		this.remoteTargetFileName = remoteTargetFileName;
	}

	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSufix() {
		return this.sufix;
	}

	public void setSufix(String sufix) {
		this.sufix = sufix;
	}

	public String getDestinationEmailError() {
		return this.destinationEmailError;
	}

	public void setDestinationEmailError(String destinationEmailError) {
		this.destinationEmailError = destinationEmailError;
	}

	public String getSubjectEmailError() {
		return this.subjectEmailError;
	}

	public void setSubjectEmailError(String subjectEmailError) {
		this.subjectEmailError = subjectEmailError;
	}

	public String getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Integer getChunk() {
		return this.chunk;
	}

	public void setChunk(Integer chunk) {
		this.chunk = chunk;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Integer getRecordsPerCall() {
		return this.recordsPerCall;
	}

	public void setRecordsPerCall(Integer recordsPerCall) {
		this.recordsPerCall = recordsPerCall;
	}
}
