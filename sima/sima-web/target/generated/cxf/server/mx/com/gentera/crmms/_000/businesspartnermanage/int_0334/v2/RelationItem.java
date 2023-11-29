
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
 * Relation Item
 * 
 * <p>Clase Java para RelationItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RelationItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartner1" type="{http://compartamos.com/common/gdt}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartner2" type="{http://compartamos.com/common/gdt}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://compartamos.com/common/gdt}ZBusinessPartnerRelationshipCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="CategoryDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="TypeID" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}TypeID" minOccurs="0"/&gt;
 *         &lt;element name="TypeDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="DateFrom" type="{http://compartamos.com/common/gdt}Date" minOccurs="0"/&gt;
 *         &lt;element name="DateTo" type="{http://compartamos.com/common/gdt}Date" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityData" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}OpportunityData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationItem", propOrder = {
    "businessPartner1",
    "businessPartner2",
    "categoryCode",
    "categoryDescription",
    "typeID",
    "typeDescription",
    "dateFrom",
    "dateTo",
    "opportunityData"
})
public class RelationItem {

    @XmlElement(name = "BusinessPartner1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartner1;
    @XmlElement(name = "BusinessPartner2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartner2;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryCode;
    @XmlElement(name = "CategoryDescription")
    protected String categoryDescription;
    @XmlElement(name = "TypeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeID;
    @XmlElement(name = "TypeDescription")
    protected String typeDescription;
    @XmlElement(name = "DateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(name = "DateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;
    @XmlElement(name = "OpportunityData")
    protected OpportunityData opportunityData;

    /**
     * Obtiene el valor de la propiedad businessPartner1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartner1() {
        return businessPartner1;
    }

    /**
     * Define el valor de la propiedad businessPartner1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartner1(String value) {
        this.businessPartner1 = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartner2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartner2() {
        return businessPartner2;
    }

    /**
     * Define el valor de la propiedad businessPartner2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartner2(String value) {
        this.businessPartner2 = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Define el valor de la propiedad categoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * Define el valor de la propiedad categoryDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryDescription(String value) {
        this.categoryDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad typeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * Define el valor de la propiedad typeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
    }

    /**
     * Obtiene el valor de la propiedad typeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Define el valor de la propiedad typeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad dateFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Define el valor de la propiedad dateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Define el valor de la propiedad dateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Obtiene el valor de la propiedad opportunityData.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityData }
     *     
     */
    public OpportunityData getOpportunityData() {
        return opportunityData;
    }

    /**
     * Define el valor de la propiedad opportunityData.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityData }
     *     
     */
    public void setOpportunityData(OpportunityData value) {
        this.opportunityData = value;
    }

}
