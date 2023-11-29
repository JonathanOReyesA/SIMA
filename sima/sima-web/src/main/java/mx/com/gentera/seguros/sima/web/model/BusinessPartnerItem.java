package mx.com.gentera.seguros.sima.web.model;

public class BusinessPartnerItem {

	private String businessPartnerId;
	private String name;

	/**
	 * @return the businessPartnerId
	 */
	public String getBusinessPartnerId() {
		return businessPartnerId;
	}

	/**
	 * @param businessPartnerId the businessPartnerId to set
	 */
	public void setBusinessPartnerId(String businessPartnerId) {
		this.businessPartnerId = businessPartnerId;
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

	@Override
	public String toString() {
		return "BusinessPartnerItem [businessPartnerId=" + businessPartnerId + ", name=" + name + "]";
	}
}
