
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
 * Document Item
 * 
 * <p>Clase Java para DocumentItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordID" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}RecordID" minOccurs="0"/&gt;
 *         &lt;element name="DocumentID" type="{http://compartamos.com/common/gdt}NOSC_DocumentID" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}StatusTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StatusDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="ReasonID" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}ReasonTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ReasonDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://compartamos.com/common/gdt}Date" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://compartamos.com/common/gdt}Date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentItem", propOrder = {
    "recordID",
    "documentID",
    "documentDescription",
    "statusCode",
    "statusDescription",
    "reasonID",
    "reasonDescription",
    "startDate",
    "endDate"
})
public class DocumentItem {

    @XmlElement(name = "RecordID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String recordID;
    @XmlElement(name = "DocumentID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String documentID;
    @XmlElement(name = "DocumentDescription")
    protected String documentDescription;
    @XmlElement(name = "StatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusCode;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "ReasonID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reasonID;
    @XmlElement(name = "ReasonDescription")
    protected String reasonDescription;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Obtiene el valor de la propiedad recordID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * Define el valor de la propiedad recordID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordID(String value) {
        this.recordID = value;
    }

    /**
     * Obtiene el valor de la propiedad documentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Define el valor de la propiedad documentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

    /**
     * Obtiene el valor de la propiedad documentDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Define el valor de la propiedad documentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDescription(String value) {
        this.documentDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad statusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Define el valor de la propiedad statusDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonID() {
        return reasonID;
    }

    /**
     * Define el valor de la propiedad reasonID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonID(String value) {
        this.reasonID = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDescription() {
        return reasonDescription;
    }

    /**
     * Define el valor de la propiedad reasonDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDescription(String value) {
        this.reasonDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
