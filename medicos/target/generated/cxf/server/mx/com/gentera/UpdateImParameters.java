
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter4;


/**
 * <p>Clase Java para updateImParameters complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateImParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maxDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maxSiniestros" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateImParameters", propOrder = {
    "paramId",
    "maxDays",
    "maxSiniestros",
    "user",
    "partnerId"
})
public class UpdateImParameters {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer paramId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer maxDays;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer maxSiniestros;
    protected String user;
    protected String partnerId;

    /**
     * Obtiene el valor de la propiedad paramId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getParamId() {
        return paramId;
    }

    /**
     * Define el valor de la propiedad paramId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamId(Integer value) {
        this.paramId = value;
    }

    /**
     * Obtiene el valor de la propiedad maxDays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getMaxDays() {
        return maxDays;
    }

    /**
     * Define el valor de la propiedad maxDays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDays(Integer value) {
        this.maxDays = value;
    }

    /**
     * Obtiene el valor de la propiedad maxSiniestros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getMaxSiniestros() {
        return maxSiniestros;
    }

    /**
     * Define el valor de la propiedad maxSiniestros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSiniestros(Integer value) {
        this.maxSiniestros = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad partnerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Define el valor de la propiedad partnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

}
