
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter4;


/**
 * <p>Clase Java para HospitalesDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HospitalesDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idHospital" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="hospitalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeHospital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HospitalesDataType", propOrder = {
    "idHospital",
    "hospitalName",
    "rfc",
    "description",
    "address",
    "typeHospital"
})
public class HospitalesDataType {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer idHospital;
    protected String hospitalName;
    protected String rfc;
    protected String description;
    protected String address;
    protected String typeHospital;

    /**
     * Obtiene el valor de la propiedad idHospital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getIdHospital() {
        return idHospital;
    }

    /**
     * Define el valor de la propiedad idHospital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdHospital(Integer value) {
        this.idHospital = value;
    }

    /**
     * Obtiene el valor de la propiedad hospitalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * Define el valor de la propiedad hospitalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalName(String value) {
        this.hospitalName = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Obtiene el valor de la propiedad typeHospital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeHospital() {
        return typeHospital;
    }

    /**
     * Define el valor de la propiedad typeHospital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeHospital(String value) {
        this.typeHospital = value;
    }

}
