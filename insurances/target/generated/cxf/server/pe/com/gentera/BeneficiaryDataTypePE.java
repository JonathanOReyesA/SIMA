
package pe.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Clase Java para beneficiaryDataTypePE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beneficiaryDataTypePE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gentera.com.pe/}beneficiaryDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amountToPay" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beneficiaryDataTypePE", propOrder = {
    "amountToPay",
    "documentType"
})
public class BeneficiaryDataTypePE
    extends BeneficiaryDataType
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double amountToPay;
    protected String documentType;

    /**
     * Obtiene el valor de la propiedad amountToPay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAmountToPay() {
        return amountToPay;
    }

    /**
     * Define el valor de la propiedad amountToPay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountToPay(Double value) {
        this.amountToPay = value;
    }

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

}
