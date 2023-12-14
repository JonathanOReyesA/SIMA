
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para acctOriginationBusinessPartnerNameV1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="acctOriginationBusinessPartnerNameV1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aditionalFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marriedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctOriginationBusinessPartnerNameV1", propOrder = {
    "aditionalFamilyName",
    "familyName",
    "givenName",
    "marriedName",
    "middleName"
})
public class AcctOriginationBusinessPartnerNameV1 {

    protected String aditionalFamilyName;
    protected String familyName;
    protected String givenName;
    protected String marriedName;
    protected String middleName;

    /**
     * Obtiene el valor de la propiedad aditionalFamilyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAditionalFamilyName() {
        return aditionalFamilyName;
    }

    /**
     * Define el valor de la propiedad aditionalFamilyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAditionalFamilyName(String value) {
        this.aditionalFamilyName = value;
    }

    /**
     * Obtiene el valor de la propiedad familyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Define el valor de la propiedad familyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Obtiene el valor de la propiedad givenName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Define el valor de la propiedad givenName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Obtiene el valor de la propiedad marriedName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriedName() {
        return marriedName;
    }

    /**
     * Define el valor de la propiedad marriedName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriedName(String value) {
        this.marriedName = value;
    }

    /**
     * Obtiene el valor de la propiedad middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Define el valor de la propiedad middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

}
