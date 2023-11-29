
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Service Office Structure
 * 
 * <p>Clase Java para ServiceOffice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServiceOffice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceOfficeID" type="{http://compartamos.com/common/gdt}ServiceOfficeId" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOfficeObjectID" type="{http://compartamos.com/common/gdt}ServiceOfficeId" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOfficeDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="SalesAreaObjectID" type="{http://compartamos.com/common/gdt}NOSC_PartyID" minOccurs="0"/&gt;
 *         &lt;element name="SalesAreaDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOffice", propOrder = {
    "serviceOfficeID",
    "serviceOfficeObjectID",
    "serviceOfficeDescription",
    "salesAreaObjectID",
    "salesAreaDescription"
})
public class ServiceOffice {

    @XmlElement(name = "ServiceOfficeID")
    protected String serviceOfficeID;
    @XmlElement(name = "ServiceOfficeObjectID")
    protected String serviceOfficeObjectID;
    @XmlElement(name = "ServiceOfficeDescription")
    protected String serviceOfficeDescription;
    @XmlElement(name = "SalesAreaObjectID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesAreaObjectID;
    @XmlElement(name = "SalesAreaDescription")
    protected String salesAreaDescription;

    /**
     * Obtiene el valor de la propiedad serviceOfficeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOfficeID() {
        return serviceOfficeID;
    }

    /**
     * Define el valor de la propiedad serviceOfficeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOfficeID(String value) {
        this.serviceOfficeID = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceOfficeObjectID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOfficeObjectID() {
        return serviceOfficeObjectID;
    }

    /**
     * Define el valor de la propiedad serviceOfficeObjectID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOfficeObjectID(String value) {
        this.serviceOfficeObjectID = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceOfficeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOfficeDescription() {
        return serviceOfficeDescription;
    }

    /**
     * Define el valor de la propiedad serviceOfficeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOfficeDescription(String value) {
        this.serviceOfficeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad salesAreaObjectID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAreaObjectID() {
        return salesAreaObjectID;
    }

    /**
     * Define el valor de la propiedad salesAreaObjectID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAreaObjectID(String value) {
        this.salesAreaObjectID = value;
    }

    /**
     * Obtiene el valor de la propiedad salesAreaDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAreaDescription() {
        return salesAreaDescription;
    }

    /**
     * Define el valor de la propiedad salesAreaDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAreaDescription(String value) {
        this.salesAreaDescription = value;
    }

}
