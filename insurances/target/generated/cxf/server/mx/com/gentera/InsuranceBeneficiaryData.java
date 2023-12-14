
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insuranceBeneficiaryData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insuranceBeneficiaryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessPartnerInsuranceBenficiaryData" type="{http://gentera.com.mx/}businessPartnerInsuranceBenficiaryData" minOccurs="0"/&gt;
 *         &lt;element name="insuranceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceBeneficiaryData", propOrder = {
    "businessPartnerInsuranceBenficiaryData",
    "insuranceID"
})
public class InsuranceBeneficiaryData {

    protected BusinessPartnerInsuranceBenficiaryData businessPartnerInsuranceBenficiaryData;
    protected String insuranceID;

    /**
     * Obtiene el valor de la propiedad businessPartnerInsuranceBenficiaryData.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerInsuranceBenficiaryData }
     *     
     */
    public BusinessPartnerInsuranceBenficiaryData getBusinessPartnerInsuranceBenficiaryData() {
        return businessPartnerInsuranceBenficiaryData;
    }

    /**
     * Define el valor de la propiedad businessPartnerInsuranceBenficiaryData.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerInsuranceBenficiaryData }
     *     
     */
    public void setBusinessPartnerInsuranceBenficiaryData(BusinessPartnerInsuranceBenficiaryData value) {
        this.businessPartnerInsuranceBenficiaryData = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceID() {
        return insuranceID;
    }

    /**
     * Define el valor de la propiedad insuranceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceID(String value) {
        this.insuranceID = value;
    }

}
