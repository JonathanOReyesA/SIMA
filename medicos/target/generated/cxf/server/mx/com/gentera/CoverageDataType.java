
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para coverageDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="coverageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flagCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coverageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coverageDataType", propOrder = {
    "flagCoverage",
    "coverageName"
})
public class CoverageDataType {

    protected String flagCoverage;
    protected String coverageName;

    /**
     * Obtiene el valor de la propiedad flagCoverage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagCoverage() {
        return flagCoverage;
    }

    /**
     * Define el valor de la propiedad flagCoverage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagCoverage(String value) {
        this.flagCoverage = value;
    }

    /**
     * Obtiene el valor de la propiedad coverageName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageName() {
        return coverageName;
    }

    /**
     * Define el valor de la propiedad coverageName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageName(String value) {
        this.coverageName = value;
    }

}
