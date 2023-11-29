
package org.datacontract.schemas._2004._07.cmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CComponente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CComponente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nombrecomponente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descComponente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idComponente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idModulo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idParent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idPosicion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imagenComponente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePagina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoComponente" type="{http://schemas.datacontract.org/2004/07/CMessage}TipoComponente" minOccurs="0"/&gt;
 *         &lt;element name="urlDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CComponente", propOrder = {
    "nombrecomponente",
    "descComponente",
    "idComponente",
    "idModulo",
    "idParent",
    "idPosicion",
    "imagenComponente",
    "nombrePagina",
    "tipoComponente",
    "urlDestino"
})
public class CComponente {

    @XmlElementRef(name = "Nombrecomponente", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrecomponente;
    @XmlElementRef(name = "descComponente", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descComponente;
    protected Integer idComponente;
    protected Integer idModulo;
    protected Integer idParent;
    protected Integer idPosicion;
    @XmlElementRef(name = "imagenComponente", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imagenComponente;
    @XmlElementRef(name = "nombrePagina", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePagina;
    @XmlSchemaType(name = "string")
    protected TipoComponente tipoComponente;
    @XmlElementRef(name = "urlDestino", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urlDestino;

    /**
     * Obtiene el valor de la propiedad nombrecomponente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrecomponente() {
        return nombrecomponente;
    }

    /**
     * Define el valor de la propiedad nombrecomponente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrecomponente(JAXBElement<String> value) {
        this.nombrecomponente = value;
    }

    /**
     * Obtiene el valor de la propiedad descComponente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescComponente() {
        return descComponente;
    }

    /**
     * Define el valor de la propiedad descComponente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescComponente(JAXBElement<String> value) {
        this.descComponente = value;
    }

    /**
     * Obtiene el valor de la propiedad idComponente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdComponente() {
        return idComponente;
    }

    /**
     * Define el valor de la propiedad idComponente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdComponente(Integer value) {
        this.idComponente = value;
    }

    /**
     * Obtiene el valor de la propiedad idModulo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdModulo() {
        return idModulo;
    }

    /**
     * Define el valor de la propiedad idModulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdModulo(Integer value) {
        this.idModulo = value;
    }

    /**
     * Obtiene el valor de la propiedad idParent.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdParent() {
        return idParent;
    }

    /**
     * Define el valor de la propiedad idParent.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdParent(Integer value) {
        this.idParent = value;
    }

    /**
     * Obtiene el valor de la propiedad idPosicion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPosicion() {
        return idPosicion;
    }

    /**
     * Define el valor de la propiedad idPosicion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPosicion(Integer value) {
        this.idPosicion = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenComponente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImagenComponente() {
        return imagenComponente;
    }

    /**
     * Define el valor de la propiedad imagenComponente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImagenComponente(JAXBElement<String> value) {
        this.imagenComponente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePagina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePagina() {
        return nombrePagina;
    }

    /**
     * Define el valor de la propiedad nombrePagina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePagina(JAXBElement<String> value) {
        this.nombrePagina = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComponente.
     * 
     * @return
     *     possible object is
     *     {@link TipoComponente }
     *     
     */
    public TipoComponente getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Define el valor de la propiedad tipoComponente.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoComponente }
     *     
     */
    public void setTipoComponente(TipoComponente value) {
        this.tipoComponente = value;
    }

    /**
     * Obtiene el valor de la propiedad urlDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrlDestino() {
        return urlDestino;
    }

    /**
     * Define el valor de la propiedad urlDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrlDestino(JAXBElement<String> value) {
        this.urlDestino = value;
    }

}
