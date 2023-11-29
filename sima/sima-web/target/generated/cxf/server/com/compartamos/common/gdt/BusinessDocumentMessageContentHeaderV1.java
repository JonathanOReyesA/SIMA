
package com.compartamos.common.gdt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BusinessDocumentMessageContentHeader_V1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessDocumentMessageContentHeader_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentificationParty" type="{http://compartamos.com/common/gdt}BusinessDocumentMessageContentHeaderIdentintificationParty_V1"/&gt;
 *         &lt;element name="AdditionalIdentifiers" type="{http://compartamos.com/common/gdt}BusinessDocumentMessageContentHeaderAdditionalIdentifiers_V1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDocumentMessageContentHeader_V1", propOrder = {
    "identificationParty",
    "additionalIdentifiers"
})
public class BusinessDocumentMessageContentHeaderV1 {

    @XmlElement(name = "IdentificationParty", required = true)
    protected BusinessDocumentMessageContentHeaderIdentintificationPartyV1 identificationParty;
    @XmlElement(name = "AdditionalIdentifiers")
    protected List<BusinessDocumentMessageContentHeaderAdditionalIdentifiersV1> additionalIdentifiers;

    /**
     * Obtiene el valor de la propiedad identificationParty.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageContentHeaderIdentintificationPartyV1 }
     *     
     */
    public BusinessDocumentMessageContentHeaderIdentintificationPartyV1 getIdentificationParty() {
        return identificationParty;
    }

    /**
     * Define el valor de la propiedad identificationParty.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageContentHeaderIdentintificationPartyV1 }
     *     
     */
    public void setIdentificationParty(BusinessDocumentMessageContentHeaderIdentintificationPartyV1 value) {
        this.identificationParty = value;
    }

    /**
     * Gets the value of the additionalIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentMessageContentHeaderAdditionalIdentifiersV1 }
     * 
     * 
     */
    public List<BusinessDocumentMessageContentHeaderAdditionalIdentifiersV1> getAdditionalIdentifiers() {
        if (additionalIdentifiers == null) {
            additionalIdentifiers = new ArrayList<BusinessDocumentMessageContentHeaderAdditionalIdentifiersV1>();
        }
        return this.additionalIdentifiers;
    }

}
