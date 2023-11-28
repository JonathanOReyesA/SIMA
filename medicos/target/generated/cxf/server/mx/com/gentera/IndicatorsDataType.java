
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para indicatorsDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="indicatorsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indicadorCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indicadorPromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="os" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indicadorOs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subdireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indicadorSudireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicatorsDataType", propOrder = {
    "cliente",
    "indicadorCliente",
    "promotor",
    "indicadorPromotor",
    "os",
    "indicadorOs",
    "subdireccion",
    "indicadorSudireccion"
})
public class IndicatorsDataType {

    protected String cliente;
    protected String indicadorCliente;
    protected String promotor;
    protected String indicadorPromotor;
    protected String os;
    protected String indicadorOs;
    protected String subdireccion;
    protected String indicadorSudireccion;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorCliente() {
        return indicadorCliente;
    }

    /**
     * Define el valor de la propiedad indicadorCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorCliente(String value) {
        this.indicadorCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad promotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotor() {
        return promotor;
    }

    /**
     * Define el valor de la propiedad promotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotor(String value) {
        this.promotor = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorPromotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorPromotor() {
        return indicadorPromotor;
    }

    /**
     * Define el valor de la propiedad indicadorPromotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorPromotor(String value) {
        this.indicadorPromotor = value;
    }

    /**
     * Obtiene el valor de la propiedad os.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Define el valor de la propiedad os.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorOs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorOs() {
        return indicadorOs;
    }

    /**
     * Define el valor de la propiedad indicadorOs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorOs(String value) {
        this.indicadorOs = value;
    }

    /**
     * Obtiene el valor de la propiedad subdireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdireccion() {
        return subdireccion;
    }

    /**
     * Define el valor de la propiedad subdireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdireccion(String value) {
        this.subdireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorSudireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorSudireccion() {
        return indicadorSudireccion;
    }

    /**
     * Define el valor de la propiedad indicadorSudireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorSudireccion(String value) {
        this.indicadorSudireccion = value;
    }

}
