
package mx.com.gentera;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Clase Java para clientesDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clientesDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessPartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessPartnerNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientesDataType", propOrder = {
    "businessPartnerID",
    "businessPartnerNam",
    "birthday"
})
public class ClientesDataType {

    protected String businessPartnerID;
    protected String businessPartnerNam;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date birthday;

    /**
     * Obtiene el valor de la propiedad businessPartnerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerID() {
        return businessPartnerID;
    }

    /**
     * Define el valor de la propiedad businessPartnerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerID(String value) {
        this.businessPartnerID = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerNam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerNam() {
        return businessPartnerNam;
    }

    /**
     * Define el valor de la propiedad businessPartnerNam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerNam(String value) {
        this.businessPartnerNam = value;
    }

    /**
     * Obtiene el valor de la propiedad birthday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Define el valor de la propiedad birthday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(Date value) {
        this.birthday = value;
    }

}
