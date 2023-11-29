
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
 * Rating Item
 * 
 * <p>Clase Java para RatingItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RatingItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GradeMethodID" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}GradeMethodID" minOccurs="0"/&gt;
 *         &lt;element name="GradeMethodDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="GradeID" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}GradeID" minOccurs="0"/&gt;
 *         &lt;element name="GradeDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="DateFrom" type="{http://compartamos.com/common/gdt}Date" minOccurs="0"/&gt;
 *         &lt;element name="DateTo" type="{http://compartamos.com/common/gdt}Date" minOccurs="0"/&gt;
 *         &lt;element name="DateWhen" type="{http://compartamos.com/common/gdt}Date" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingItem", propOrder = {
    "gradeMethodID",
    "gradeMethodDescription",
    "gradeID",
    "gradeDescription",
    "dateFrom",
    "dateTo",
    "dateWhen",
    "text"
})
public class RatingItem {

    @XmlElement(name = "GradeMethodID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String gradeMethodID;
    @XmlElement(name = "GradeMethodDescription")
    protected String gradeMethodDescription;
    @XmlElement(name = "GradeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String gradeID;
    @XmlElement(name = "GradeDescription")
    protected String gradeDescription;
    @XmlElement(name = "DateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(name = "DateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;
    @XmlElement(name = "DateWhen")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateWhen;
    @XmlElement(name = "Text")
    protected String text;

    /**
     * Obtiene el valor de la propiedad gradeMethodID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeMethodID() {
        return gradeMethodID;
    }

    /**
     * Define el valor de la propiedad gradeMethodID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeMethodID(String value) {
        this.gradeMethodID = value;
    }

    /**
     * Obtiene el valor de la propiedad gradeMethodDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeMethodDescription() {
        return gradeMethodDescription;
    }

    /**
     * Define el valor de la propiedad gradeMethodDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeMethodDescription(String value) {
        this.gradeMethodDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad gradeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeID() {
        return gradeID;
    }

    /**
     * Define el valor de la propiedad gradeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeID(String value) {
        this.gradeID = value;
    }

    /**
     * Obtiene el valor de la propiedad gradeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeDescription() {
        return gradeDescription;
    }

    /**
     * Define el valor de la propiedad gradeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeDescription(String value) {
        this.gradeDescription = value;
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
     * Obtiene el valor de la propiedad dateWhen.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateWhen() {
        return dateWhen;
    }

    /**
     * Define el valor de la propiedad dateWhen.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateWhen(XMLGregorianCalendar value) {
        this.dateWhen = value;
    }

    /**
     * Obtiene el valor de la propiedad text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Define el valor de la propiedad text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
