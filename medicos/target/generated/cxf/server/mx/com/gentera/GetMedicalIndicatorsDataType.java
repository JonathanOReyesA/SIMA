
package mx.com.gentera;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;
import org.w3._2001.xmlschema.Adapter4;


/**
 * <p>Clase Java para getMedicalIndicatorsDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getMedicalIndicatorsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cobertura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxDias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maxSiniestros" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dateUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMedicalIndicatorsDataType", propOrder = {
    "paramId",
    "name",
    "cobertura",
    "descripcion",
    "clave",
    "maxDias",
    "maxSiniestros",
    "dateUpdate",
    "usuario"
})
public class GetMedicalIndicatorsDataType {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer paramId;
    protected String name;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer cobertura;
    protected String descripcion;
    protected String clave;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer maxDias;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer maxSiniestros;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date dateUpdate;
    protected String usuario;

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
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad cobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getCobertura() {
        return cobertura;
    }

    /**
     * Define el valor de la propiedad cobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobertura(Integer value) {
        this.cobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad maxDias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getMaxDias() {
        return maxDias;
    }

    /**
     * Define el valor de la propiedad maxDias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDias(Integer value) {
        this.maxDias = value;
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
     * Obtiene el valor de la propiedad dateUpdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateUpdate() {
        return dateUpdate;
    }

    /**
     * Define el valor de la propiedad dateUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateUpdate(Date value) {
        this.dateUpdate = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
