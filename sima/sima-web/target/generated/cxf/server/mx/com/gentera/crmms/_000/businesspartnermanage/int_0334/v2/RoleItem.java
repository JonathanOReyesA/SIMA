
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Role Item
 * 
 * <p>Clase Java para RoleItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoleItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoleID" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}RoleID" minOccurs="0"/&gt;
 *         &lt;element name="RoleDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="ValidFrom" type="{http://compartamos.com/common/gdt}Date" minOccurs="0"/&gt;
 *         &lt;element name="ValidTo" type="{http://compartamos.com/common/gdt}Date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleItem", propOrder = {
    "roleID",
    "roleDescription",
    "validFrom",
    "validTo"
})
public class RoleItem {

    @XmlElement(name = "RoleID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roleID;
    @XmlElement(name = "RoleDescription")
    protected String roleDescription;
    @XmlElement(name = "ValidFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "ValidTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validTo;

    /**
     * Obtiene el valor de la propiedad roleID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleID() {
        return roleID;
    }

    /**
     * Define el valor de la propiedad roleID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleID(String value) {
        this.roleID = value;
    }

    /**
     * Obtiene el valor de la propiedad roleDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * Define el valor de la propiedad roleDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleDescription(String value) {
        this.roleDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad validFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Define el valor de la propiedad validFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad validTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Define el valor de la propiedad validTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

}
