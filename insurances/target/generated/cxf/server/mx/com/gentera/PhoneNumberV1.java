
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para phoneNumberV1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="phoneNumberV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryDiallingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://gentera.com.mx/}mediumName" minOccurs="0"/&gt;
 *         &lt;element name="extensionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneNumberV1", propOrder = {
    "areaID",
    "countryCode",
    "countryDiallingCode",
    "countryName",
    "extensionID",
    "subscriberID"
})
public class PhoneNumberV1 {

    protected String areaID;
    protected String countryCode;
    protected String countryDiallingCode;
    protected MediumName countryName;
    protected String extensionID;
    protected String subscriberID;

    /**
     * Obtiene el valor de la propiedad areaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * Define el valor de la propiedad areaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad countryDiallingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryDiallingCode() {
        return countryDiallingCode;
    }

    /**
     * Define el valor de la propiedad countryDiallingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryDiallingCode(String value) {
        this.countryDiallingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad countryName.
     * 
     * @return
     *     possible object is
     *     {@link MediumName }
     *     
     */
    public MediumName getCountryName() {
        return countryName;
    }

    /**
     * Define el valor de la propiedad countryName.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumName }
     *     
     */
    public void setCountryName(MediumName value) {
        this.countryName = value;
    }

    /**
     * Obtiene el valor de la propiedad extensionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionID() {
        return extensionID;
    }

    /**
     * Define el valor de la propiedad extensionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionID(String value) {
        this.extensionID = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberID() {
        return subscriberID;
    }

    /**
     * Define el valor de la propiedad subscriberID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberID(String value) {
        this.subscriberID = value;
    }

}
