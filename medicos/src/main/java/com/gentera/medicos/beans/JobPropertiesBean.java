package com.gentera.medicos.beans;

public class JobPropertiesBean {

	/**
	 * Nombre del Stored Procedure ejecutado dentro del proceso
	 */
	private String storedProcedureName;
	/**
	 * Sentencia SQL ejecutada dentro del proceso
	 */
	private String sqlQuery;
	/**
	 * Nombre del Stored Procedure ejecutado dentro del proceso por cada unos de los
	 * registros obtenidos
	 */
	private String byItemStoredProcedureName;
	/**
	 * Nombre del Stored Procedure ejecutado dentro del proceso despues del
	 * procesamiento de los registros obtenidos
	 */
	private String afterStepStoredProcedureName;

	/**
	 * Ubicacion en el servidor local de los archivos que contienen el origen de los
	 * datos a procesar
	 */
	private String localSourceFolder;
	/**
	 * Ubicacion donde se copian los los archivos para si procesamiento
	 */
	private String localTargetFolder;

	/**
	 * Ubicacion en el servidor remoto de los archivos que contienen el origen de
	 * los datos a procesar
	 */
	private String remoteSourceFolder;
	/**
	 * Ubicacion en el servidor remoto donde se depositan los archivos una vez que
	 * han sido procesados
	 */
	private String remoteTargetFolder;
	/**
	 * Ubicacion en el servidor remoto donde se copian los archivos una vez que han
	 * sido procesados
	 */
	private String remoteTargetFolderCopy;
	/**
	 * Ubicacion en el servidor remoto donde se copian los archivos una vez que han
	 * sido procesados
	 */
	private String remoteTargetFolderProcessed;
	/**
	 * Ubicacion en el servidor remoto donde se copian los archivos cuando se
	 * obtiene una excepcion durante el proceso
	 */
	private String remoteTargetFolderError;
	/**
	 * Nombre del archivo con el que se renombrara el archivo origen una vez que ha
	 * sido procesado
	 */
	private String remoteTargetFileName;

	/**
	 * Patron de busqueda de archivos a procesar
	 */
	private String pattern;
	/**
	 * Prefijo de los archivos con el que se deberan renombrar una vez que han sido
	 * procesados
	 */
	private String prefix;
	/**
	 * Sufijo de los archivos con el que se deberan renombrar una vez que han sido
	 * procesados
	 */
	private String sufix;

	/**
	 * Direccion electronica del destinatario de correo que se envia cuando ocurre
	 * una excepcion durante el proceso
	 */
	private String destinationEmailError;
	/**
	 * Asunto del correo electronico que se envia cuando ocurre una excepcion
	 * durante el proceso
	 */
	private String subjectEmailError;

	/**
	 * Parametro que indica el partner Id para el proceso
	 */
	private String partnerId;

	/**
	 * Cantidad de registros procesados en cada iteracion del proceso
	 */
	private Integer chunk;
	/**
	 * Tipo del producto para el proceso
	 * 
	 */
	private String productType;

	/**
	 * Numero de registros que deberan ser leidos desde un origen de base de datos
	 */
	private Integer recordsPerCall;

	public String getStoredProcedureName() {
		return storedProcedureName;
	}

	public void setStoredProcedureName(String storedProcedureName) {
		this.storedProcedureName = storedProcedureName;
	}

	public String getSqlQuery() {
		return sqlQuery;
	}

	public void setSqlQuery(String sqlQuery) {
		this.sqlQuery = sqlQuery;
	}

	public String getByItemStoredProcedureName() {
		return byItemStoredProcedureName;
	}

	public void setByItemStoredProcedureName(String byItemStoredProcedureName) {
		this.byItemStoredProcedureName = byItemStoredProcedureName;
	}

	public String getAfterStepStoredProcedureName() {
		return afterStepStoredProcedureName;
	}

	public void setAfterStepStoredProcedureName(String afterStepStoredProcedureName) {
		this.afterStepStoredProcedureName = afterStepStoredProcedureName;
	}

	public String getLocalSourceFolder() {
		return localSourceFolder;
	}

	public void setLocalSourceFolder(String localSourceFolder) {
		this.localSourceFolder = localSourceFolder;
	}

	public String getLocalTargetFolder() {
		return localTargetFolder;
	}

	public void setLocalTargetFolder(String localTargetFolder) {
		this.localTargetFolder = localTargetFolder;
	}

	public String getRemoteSourceFolder() {
		return remoteSourceFolder;
	}

	public void setRemoteSourceFolder(String remoteSourceFolder) {
		this.remoteSourceFolder = remoteSourceFolder;
	}

	public String getRemoteTargetFolder() {
		return remoteTargetFolder;
	}

	public void setRemoteTargetFolder(String remoteTargetFolder) {
		this.remoteTargetFolder = remoteTargetFolder;
	}

	public String getRemoteTargetFolderCopy() {
		return remoteTargetFolderCopy;
	}

	public void setRemoteTargetFolderCopy(String remoteTargetFolderCopy) {
		this.remoteTargetFolderCopy = remoteTargetFolderCopy;
	}

	public String getRemoteTargetFolderProcessed() {
		return remoteTargetFolderProcessed;
	}

	public void setRemoteTargetFolderProcessed(String remoteTargetFolderProcessed) {
		this.remoteTargetFolderProcessed = remoteTargetFolderProcessed;
	}

	public String getRemoteTargetFolderError() {
		return remoteTargetFolderError;
	}

	public void setRemoteTargetFolderError(String remoteTargetFolderError) {
		this.remoteTargetFolderError = remoteTargetFolderError;
	}

	public String getRemoteTargetFileName() {
		return remoteTargetFileName;
	}

	public void setRemoteTargetFileName(String remoteTargetFileName) {
		this.remoteTargetFileName = remoteTargetFileName;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSufix() {
		return sufix;
	}

	public void setSufix(String sufix) {
		this.sufix = sufix;
	}

	public String getDestinationEmailError() {
		return destinationEmailError;
	}

	public void setDestinationEmailError(String destinationEmailError) {
		this.destinationEmailError = destinationEmailError;
	}

	public String getSubjectEmailError() {
		return subjectEmailError;
	}

	public void setSubjectEmailError(String subjectEmailError) {
		this.subjectEmailError = subjectEmailError;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Integer getChunk() {
		return chunk;
	}

	public void setChunk(Integer chunk) {
		this.chunk = chunk;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Integer getRecordsPerCall() {
		return recordsPerCall;
	}

	public void setRecordsPerCall(Integer recordsPerCall) {
		this.recordsPerCall = recordsPerCall;
	}
}