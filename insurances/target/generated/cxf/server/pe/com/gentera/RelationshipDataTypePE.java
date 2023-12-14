
package pe.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para relationshipDataTypePE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="relationshipDataTypePE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gentera.com.pe/}relationshipDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentTypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationshipDataTypePE", propOrder = {
    "documentTypecode"
})
public class RelationshipDataTypePE
    extends RelationshipDataType
{

    protected String documentTypecode;

    /**
     * Obtiene el valor de la propiedad documentTypecode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypecode() {
        return documentTypecode;
    }

    /**
     * Define el valor de la propiedad documentTypecode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypecode(String value) {
        this.documentTypecode = value;
    }

}
