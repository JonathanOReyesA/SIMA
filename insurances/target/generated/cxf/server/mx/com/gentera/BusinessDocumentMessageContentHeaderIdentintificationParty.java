
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para businessDocumentMessageContentHeaderIdentintificationParty complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="businessDocumentMessageContentHeaderIdentintificationParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyID" type="{http://gentera.com.mx/}companyID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessDocumentMessageContentHeaderIdentintificationParty", propOrder = {
    "companyDescription",
    "companyID"
})
public class BusinessDocumentMessageContentHeaderIdentintificationParty {

    protected String companyDescription;
    protected CompanyID companyID;

    /**
     * Obtiene el valor de la propiedad companyDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyDescription() {
        return companyDescription;
    }

    /**
     * Define el valor de la propiedad companyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyDescription(String value) {
        this.companyDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad companyID.
     * 
     * @return
     *     possible object is
     *     {@link CompanyID }
     *     
     */
    public CompanyID getCompanyID() {
        return companyID;
    }

    /**
     * Define el valor de la propiedad companyID.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyID }
     *     
     */
    public void setCompanyID(CompanyID value) {
        this.companyID = value;
    }

}
