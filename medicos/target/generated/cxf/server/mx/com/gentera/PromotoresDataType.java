
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para promotoresDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promotoresDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroNomina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotoresDataType", propOrder = {
    "numeroNomina",
    "nombrePromotor",
    "nombreOficina"
})
public class PromotoresDataType {

    protected String numeroNomina;
    protected String nombrePromotor;
    protected String nombreOficina;

    /**
     * Obtiene el valor de la propiedad numeroNomina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroNomina() {
        return numeroNomina;
    }

    /**
     * Define el valor de la propiedad numeroNomina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroNomina(String value) {
        this.numeroNomina = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePromotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePromotor() {
        return nombrePromotor;
    }

    /**
     * Define el valor de la propiedad nombrePromotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePromotor(String value) {
        this.nombrePromotor = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreOficina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreOficina() {
        return nombreOficina;
    }

    /**
     * Define el valor de la propiedad nombreOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreOficina(String value) {
        this.nombreOficina = value;
    }

}
