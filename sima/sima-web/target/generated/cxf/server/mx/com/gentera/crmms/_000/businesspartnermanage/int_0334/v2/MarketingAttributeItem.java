
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Marketing Attribute Item
 * 
 * <p>Clase Java para MarketingAttributeItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MarketingAttributeItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileID" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}ProfileID" minOccurs="0"/&gt;
 *         &lt;element name="ProfileDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="AttributeID" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}AttributeID" minOccurs="0"/&gt;
 *         &lt;element name="AttributeDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="ValueID" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}ValueID" minOccurs="0"/&gt;
 *         &lt;element name="ValueDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingAttributeItem", propOrder = {
    "profileID",
    "profileDescription",
    "attributeID",
    "attributeDescription",
    "valueID",
    "valueDescription"
})
public class MarketingAttributeItem {

    @XmlElement(name = "ProfileID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String profileID;
    @XmlElement(name = "ProfileDescription")
    protected String profileDescription;
    @XmlElement(name = "AttributeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String attributeID;
    @XmlElement(name = "AttributeDescription")
    protected String attributeDescription;
    @XmlElement(name = "ValueID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String valueID;
    @XmlElement(name = "ValueDescription")
    protected String valueDescription;

    /**
     * Obtiene el valor de la propiedad profileID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Define el valor de la propiedad profileID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * Obtiene el valor de la propiedad profileDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileDescription() {
        return profileDescription;
    }

    /**
     * Define el valor de la propiedad profileDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileDescription(String value) {
        this.profileDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeID() {
        return attributeID;
    }

    /**
     * Define el valor de la propiedad attributeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeID(String value) {
        this.attributeID = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /**
     * Define el valor de la propiedad attributeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeDescription(String value) {
        this.attributeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad valueID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueID() {
        return valueID;
    }

    /**
     * Define el valor de la propiedad valueID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueID(String value) {
        this.valueID = value;
    }

    /**
     * Obtiene el valor de la propiedad valueDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDescription() {
        return valueDescription;
    }

    /**
     * Define el valor de la propiedad valueDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDescription(String value) {
        this.valueDescription = value;
    }

}
