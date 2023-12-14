
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insuranceIdentifier complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insuranceIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insuranceBusinessPartnerData" type="{http://gentera.com.mx/}insuranceBusinessPartnerData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="insuranceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insurancePeriodData" type="{http://gentera.com.mx/}insurancePeriodData" minOccurs="0"/&gt;
 *         &lt;element name="insuranceProductData" type="{http://gentera.com.mx/}insuranceProductData" minOccurs="0"/&gt;
 *         &lt;element name="mode" type="{http://gentera.com.mx/}insuranceModeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceIdentifier", propOrder = {
    "insuranceBusinessPartnerData",
    "insuranceID",
    "insurancePeriodData",
    "insuranceProductData",
    "mode"
})
public class InsuranceIdentifier {

    @XmlElement(nillable = true)
    protected List<InsuranceBusinessPartnerData> insuranceBusinessPartnerData;
    protected String insuranceID;
    protected InsurancePeriodData insurancePeriodData;
    protected InsuranceProductData insuranceProductData;
    protected InsuranceModeCode mode;

    /**
     * Gets the value of the insuranceBusinessPartnerData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceBusinessPartnerData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceBusinessPartnerData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceBusinessPartnerData }
     * 
     * 
     */
    public List<InsuranceBusinessPartnerData> getInsuranceBusinessPartnerData() {
        if (insuranceBusinessPartnerData == null) {
            insuranceBusinessPartnerData = new ArrayList<InsuranceBusinessPartnerData>();
        }
        return this.insuranceBusinessPartnerData;
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

    /**
     * Obtiene el valor de la propiedad insurancePeriodData.
     * 
     * @return
     *     possible object is
     *     {@link InsurancePeriodData }
     *     
     */
    public InsurancePeriodData getInsurancePeriodData() {
        return insurancePeriodData;
    }

    /**
     * Define el valor de la propiedad insurancePeriodData.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurancePeriodData }
     *     
     */
    public void setInsurancePeriodData(InsurancePeriodData value) {
        this.insurancePeriodData = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceProductData.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceProductData }
     *     
     */
    public InsuranceProductData getInsuranceProductData() {
        return insuranceProductData;
    }

    /**
     * Define el valor de la propiedad insuranceProductData.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceProductData }
     *     
     */
    public void setInsuranceProductData(InsuranceProductData value) {
        this.insuranceProductData = value;
    }

    /**
     * Obtiene el valor de la propiedad mode.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceModeCode }
     *     
     */
    public InsuranceModeCode getMode() {
        return mode;
    }

    /**
     * Define el valor de la propiedad mode.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceModeCode }
     *     
     */
    public void setMode(InsuranceModeCode value) {
        this.mode = value;
    }

}
