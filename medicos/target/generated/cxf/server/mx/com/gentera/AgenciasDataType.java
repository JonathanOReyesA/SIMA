
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agenciasDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agenciasDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agenciasDataType", propOrder = {
    "certerCode",
    "salesOfficeName",
    "address",
    "internalId"
})
public class AgenciasDataType {

    protected String certerCode;
    protected String salesOfficeName;
    protected String address;
    protected String internalId;

    /**
     * Obtiene el valor de la propiedad certerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCerterCode() {
        return certerCode;
    }

    /**
     * Define el valor de la propiedad certerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCerterCode(String value) {
        this.certerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOfficeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOfficeName() {
        return salesOfficeName;
    }

    /**
     * Define el valor de la propiedad salesOfficeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOfficeName(String value) {
        this.salesOfficeName = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad internalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Define el valor de la propiedad internalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

}
