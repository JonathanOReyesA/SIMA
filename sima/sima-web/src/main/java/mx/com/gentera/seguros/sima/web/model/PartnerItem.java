package mx.com.gentera.seguros.sima.web.model;

public class PartnerItem {

	private Integer partnerId;
	private String name;

	/**
	 * @return the partnerId
	 */
	public Integer getPartnerId() {
		return partnerId;
	}

	/**
	 * @param partnerId the partnerId to set
	 */
	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
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
		return "PartnerItem [partnerId=" + partnerId + ", name=" + name + "]";
	}

}
