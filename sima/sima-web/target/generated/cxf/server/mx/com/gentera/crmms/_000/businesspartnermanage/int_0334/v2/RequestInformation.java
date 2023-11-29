
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request Information flags
 * 
 * <p>Clase Java para RequestInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RequestInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Detail" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOffice" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="EconomicActivity" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="Relation" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="MarketingAttribute" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="Document" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="Rating" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestInformation", propOrder = {
    "detail",
    "serviceOffice",
    "role",
    "address",
    "phone",
    "identifier",
    "economicActivity",
    "relation",
    "marketingAttribute",
    "document",
    "rating",
    "email"
})
public class RequestInformation {

    @XmlElement(name = "Detail")
    protected String detail;
    @XmlElement(name = "ServiceOffice")
    protected String serviceOffice;
    @XmlElement(name = "Role")
    protected String role;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "EconomicActivity")
    protected String economicActivity;
    @XmlElement(name = "Relation")
    protected String relation;
    @XmlElement(name = "MarketingAttribute")
    protected String marketingAttribute;
    @XmlElement(name = "Document")
    protected String document;
    @XmlElement(name = "Rating")
    protected String rating;
    @XmlElement(name = "Email")
    protected String email;

    /**
     * Obtiene el valor de la propiedad detail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Define el valor de la propiedad detail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceOffice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOffice() {
        return serviceOffice;
    }

    /**
     * Define el valor de la propiedad serviceOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOffice(String value) {
        this.serviceOffice = value;
    }

    /**
     * Obtiene el valor de la propiedad role.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Define el valor de la propiedad role.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Define el valor de la propiedad phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Obtiene el valor de la propiedad identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Define el valor de la propiedad identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Obtiene el valor de la propiedad economicActivity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicActivity() {
        return economicActivity;
    }

    /**
     * Define el valor de la propiedad economicActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicActivity(String value) {
        this.economicActivity = value;
    }

    /**
     * Obtiene el valor de la propiedad relation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Define el valor de la propiedad relation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

    /**
     * Obtiene el valor de la propiedad marketingAttribute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingAttribute() {
        return marketingAttribute;
    }

    /**
     * Define el valor de la propiedad marketingAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingAttribute(String value) {
        this.marketingAttribute = value;
    }

    /**
     * Obtiene el valor de la propiedad document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocument() {
        return document;
    }

    /**
     * Define el valor de la propiedad document.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocument(String value) {
        this.document = value;
    }

    /**
     * Obtiene el valor de la propiedad rating.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Define el valor de la propiedad rating.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
