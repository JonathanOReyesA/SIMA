
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para coverageDocumentsSearch complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="coverageDocumentsSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coverageCatalogueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coverageDocumentsSearch", propOrder = {
    "coverageCatalogueID"
})
public class CoverageDocumentsSearch_Type {

    protected String coverageCatalogueID;

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

}
