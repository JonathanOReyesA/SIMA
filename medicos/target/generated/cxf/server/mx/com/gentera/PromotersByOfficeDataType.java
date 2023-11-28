
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para promotersByOfficeDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promotersByOfficeDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collaboratorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collaboratorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subdirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotersByOfficeDataType", propOrder = {
    "collaboratorID",
    "collaboratorName",
    "salesOfficeName",
    "subdirection"
})
public class PromotersByOfficeDataType {

    protected String collaboratorID;
    protected String collaboratorName;
    protected String salesOfficeName;
    protected String subdirection;

    /**
     * Obtiene el valor de la propiedad collaboratorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollaboratorID() {
        return collaboratorID;
    }

    /**
     * Define el valor de la propiedad collaboratorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollaboratorID(String value) {
        this.collaboratorID = value;
    }

    /**
     * Obtiene el valor de la propiedad collaboratorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollaboratorName() {
        return collaboratorName;
    }

    /**
     * Define el valor de la propiedad collaboratorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollaboratorName(String value) {
        this.collaboratorName = value;
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
     * Obtiene el valor de la propiedad subdirection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdirection() {
        return subdirection;
    }

    /**
     * Define el valor de la propiedad subdirection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdirection(String value) {
        this.subdirection = value;
    }

}
