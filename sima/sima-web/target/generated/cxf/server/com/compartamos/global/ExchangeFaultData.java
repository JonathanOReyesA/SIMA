
package com.compartamos.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="standard" type="{http://compartamos.com/common/gdt}ExchangeFaultData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "standard"
})
@XmlRootElement(name = "ExchangeFaultData")
public class ExchangeFaultData {

    @XmlElement(required = true)
    protected com.compartamos.common.gdt.ExchangeFaultData standard;

    /**
     * Obtiene el valor de la propiedad standard.
     * 
     * @return
     *     possible object is
     *     {@link com.compartamos.common.gdt.ExchangeFaultData }
     *     
     */
    public com.compartamos.common.gdt.ExchangeFaultData getStandard() {
        return standard;
    }

    /**
     * Define el valor de la propiedad standard.
     * 
     * @param value
     *     allowed object is
     *     {@link com.compartamos.common.gdt.ExchangeFaultData }
     *     
     */
    public void setStandard(com.compartamos.common.gdt.ExchangeFaultData value) {
        this.standard = value;
    }

}
