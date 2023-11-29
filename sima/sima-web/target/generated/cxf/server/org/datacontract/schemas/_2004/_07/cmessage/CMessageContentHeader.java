
package org.datacontract.schemas._2004._07.cmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CMessageContentHeader complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CMessageContentHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentificationParty" type="{http://schemas.datacontract.org/2004/07/CMessage}IdentificationParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMessageContentHeader", propOrder = {
    "identificationParty"
})
public class CMessageContentHeader {

    @XmlElementRef(name = "IdentificationParty", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentificationParty> identificationParty;

    /**
     * Obtiene el valor de la propiedad identificationParty.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentificationParty }{@code >}
     *     
     */
    public JAXBElement<IdentificationParty> getIdentificationParty() {
        return identificationParty;
    }

    /**
     * Define el valor de la propiedad identificationParty.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentificationParty }{@code >}
     *     
     */
    public void setIdentificationParty(JAXBElement<IdentificationParty> value) {
        this.identificationParty = value;
    }

}
