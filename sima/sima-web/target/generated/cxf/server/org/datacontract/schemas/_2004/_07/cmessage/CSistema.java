
package org.datacontract.schemas._2004._07.cmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CSistema complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CSistema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autenticacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="diasAviso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="expirapassword" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fechaBaja" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="historiapassword" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intenitosRegistro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSistema", propOrder = {
    "autenticacion",
    "diasAviso",
    "estado",
    "expirapassword",
    "fechaBaja",
    "fechaCreacion",
    "historiapassword",
    "idSistema",
    "intenitosRegistro",
    "nombre"
})
public class CSistema {

    protected Integer autenticacion;
    protected Integer diasAviso;
    protected Integer estado;
    protected Integer expirapassword;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaBaja;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    protected Integer historiapassword;
    @XmlElementRef(name = "idSistema", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idSistema;
    protected Integer intenitosRegistro;
    @XmlElementRef(name = "nombre", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;

    /**
     * Obtiene el valor de la propiedad autenticacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutenticacion() {
        return autenticacion;
    }

    /**
     * Define el valor de la propiedad autenticacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutenticacion(Integer value) {
        this.autenticacion = value;
    }

    /**
     * Obtiene el valor de la propiedad diasAviso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiasAviso() {
        return diasAviso;
    }

    /**
     * Define el valor de la propiedad diasAviso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiasAviso(Integer value) {
        this.diasAviso = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstado(Integer value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad expirapassword.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpirapassword() {
        return expirapassword;
    }

    /**
     * Define el valor de la propiedad expirapassword.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpirapassword(Integer value) {
        this.expirapassword = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaBaja.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaBaja() {
        return fechaBaja;
    }

    /**
     * Define el valor de la propiedad fechaBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaBaja(XMLGregorianCalendar value) {
        this.fechaBaja = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad historiapassword.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHistoriapassword() {
        return historiapassword;
    }

    /**
     * Define el valor de la propiedad historiapassword.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHistoriapassword(Integer value) {
        this.historiapassword = value;
    }

    /**
     * Obtiene el valor de la propiedad idSistema.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdSistema() {
        return idSistema;
    }

    /**
     * Define el valor de la propiedad idSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdSistema(JAXBElement<String> value) {
        this.idSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad intenitosRegistro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntenitosRegistro() {
        return intenitosRegistro;
    }

    /**
     * Define el valor de la propiedad intenitosRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntenitosRegistro(Integer value) {
        this.intenitosRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

}
