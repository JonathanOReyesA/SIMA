
package org.datacontract.schemas._2004._07.cmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Log complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Log"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessDocumentProcessingResultCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://schemas.datacontract.org/2004/07/CMessage}Item" minOccurs="0"/&gt;
 *         &lt;element name="MaximumLogItemSeverityCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Log", propOrder = {
    "businessDocumentProcessingResultCode",
    "item",
    "maximumLogItemSeverityCode"
})
public class Log {

    @XmlElement(name = "BusinessDocumentProcessingResultCode")
    protected Integer businessDocumentProcessingResultCode;
    @XmlElementRef(name = "Item", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> item;
    @XmlElement(name = "MaximumLogItemSeverityCode")
    protected Integer maximumLogItemSeverityCode;

    /**
     * Obtiene el valor de la propiedad businessDocumentProcessingResultCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusinessDocumentProcessingResultCode() {
        return businessDocumentProcessingResultCode;
    }

    /**
     * Define el valor de la propiedad businessDocumentProcessingResultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusinessDocumentProcessingResultCode(Integer value) {
        this.businessDocumentProcessingResultCode = value;
    }

    /**
     * Obtiene el valor de la propiedad item.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setItem(JAXBElement<Item> value) {
        this.item = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumLogItemSeverityCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumLogItemSeverityCode() {
        return maximumLogItemSeverityCode;
    }

    /**
     * Define el valor de la propiedad maximumLogItemSeverityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumLogItemSeverityCode(Integer value) {
        this.maximumLogItemSeverityCode = value;
    }

}
