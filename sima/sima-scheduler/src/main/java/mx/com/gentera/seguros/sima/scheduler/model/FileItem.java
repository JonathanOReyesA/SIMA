package mx.com.gentera.seguros.sima.scheduler.model;

import mx.com.gentera.seguros.sima.scheduler.annotations.SourceTableField;

public class FileItem {

	@SourceTableField(name = "ZIPNAME")
	private String zipName;

	@SourceTableField(name = "NAME")
	private String name;

	@SourceTableField(name = "DATA_VALUE")
	private String dataValue;

	/**
	 * @return the zipName
	 */
	public String getZipName() {
		return zipName;
	}

	/**
	 * @param zipName the zipName to set
	 */
	public void setZipName(String zipName) {
		this.zipName = zipName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dataValue
	 */
	public String getDataValue() {
		return dataValue;
	}

	/**
	 * @param dataValue the dataValue to set
	 */
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

	@Override
	public String toString() {
		return "FileItem [zipName=" + zipName + ", name=" + name + ", dataValue=" + dataValue + "]";
	}
}
