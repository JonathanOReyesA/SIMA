
package pe.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para coverageCatalogueDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="coverageCatalogueDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coverageCatalogueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coverageClaimName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flagCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flagID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coverageCatalogueDataType", propOrder = {
    "coverageCatalogueID",
    "coverageClaimName",
    "flagCoverage",
    "flagID"
})
public class CoverageCatalogueDataType {

    protected String coverageCatalogueID;
    protected String coverageClaimName;
    protected String flagCoverage;
    protected String flagID;

    /**
     * Obtiene el valor de la propiedad coverageCatalogueID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageCatalogueID() {
        return coverageCatalogueID;
    }

    /**
     * Define el valor de la propiedad coverageCatalogueID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageCatalogueID(String value) {
        this.coverageCatalogueID = value;
    }

    /**
     * Obtiene el valor de la propiedad coverageClaimName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageClaimName() {
        return coverageClaimName;
    }

    /**
     * Define el valor de la propiedad coverageClaimName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageClaimName(String value) {
        this.coverageClaimName = value;
    }

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
     * Obtiene el valor de la propiedad flagID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagID() {
        return flagID;
    }

    /**
     * Define el valor de la propiedad flagID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagID(String value) {
        this.flagID = value;
    }

}
