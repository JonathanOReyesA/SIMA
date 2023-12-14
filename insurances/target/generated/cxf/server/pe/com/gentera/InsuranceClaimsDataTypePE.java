
package pe.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insuranceClaimsDataTypePE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insuranceClaimsDataTypePE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gentera.com.pe/}insuranceClaimsDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insuranceCompanyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceClaimsDataTypePE", propOrder = {
    "insuranceCompanyID"
})
public class InsuranceClaimsDataTypePE
    extends InsuranceClaimsDataType
{

    protected String insuranceCompanyID;

    /**
     * Obtiene el valor de la propiedad insuranceCompanyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompanyID() {
        return insuranceCompanyID;
    }

    /**
     * Define el valor de la propiedad insuranceCompanyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompanyID(String value) {
        this.insuranceCompanyID = value;
    }

}
