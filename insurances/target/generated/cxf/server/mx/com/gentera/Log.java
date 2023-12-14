
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para log complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="log"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessDocumentProcessingResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{http://gentera.com.mx/}logItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maximumLogItemSeverityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "log", propOrder = {
    "businessDocumentProcessingResultCode",
    "item",
    "maximumLogItemSeverityCode"
})
public class Log {

    protected String businessDocumentProcessingResultCode;
    @XmlElement(nillable = true)
    protected List<LogItem> item;
    protected String maximumLogItemSeverityCode;

    /**
     * Obtiene el valor de la propiedad businessDocumentProcessingResultCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDocumentProcessingResultCode() {
        return businessDocumentProcessingResultCode;
    }

    /**
     * Define el valor de la propiedad businessDocumentProcessingResultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDocumentProcessingResultCode(String value) {
        this.businessDocumentProcessingResultCode = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogItem }
     * 
     * 
     */
    public List<LogItem> getItem() {
        if (item == null) {
            item = new ArrayList<LogItem>();
        }
        return this.item;
    }

    /**
     * Obtiene el valor de la propiedad maximumLogItemSeverityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumLogItemSeverityCode() {
        return maximumLogItemSeverityCode;
    }

    /**
     * Define el valor de la propiedad maximumLogItemSeverityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumLogItemSeverityCode(String value) {
        this.maximumLogItemSeverityCode = value;
    }

}
