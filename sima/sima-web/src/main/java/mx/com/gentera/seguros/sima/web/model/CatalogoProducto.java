package mx.com.gentera.seguros.sima.web.model;

import mx.com.gentera.seguros.sima.web.annotations.SourceTableField;

public class CatalogoProducto {

	@SourceTableField(name = "PRODUCTID")
	public String productId;
	@SourceTableField(name = "PRODUCTTYPE")
	public String productType;
	@SourceTableField(name = "PRODUCTNAME")
	public String productName;

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "CatalogoProducto [productId=" + productId + ", productType=" + productType + ", productName="
				+ productName + "]";
	}
}
