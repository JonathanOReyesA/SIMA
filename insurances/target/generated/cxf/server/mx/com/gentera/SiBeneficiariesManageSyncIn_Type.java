
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para siBeneficiariesManageSyncIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="siBeneficiariesManageSyncIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://gentera.com.mx/}dtInsuranceBeneficiariesUpdateReqSync" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siBeneficiariesManageSyncIn", propOrder = {
    "request"
})
public class SiBeneficiariesManageSyncIn_Type {

    protected DtInsuranceBeneficiariesUpdateReqSync request;

    /**
     * Obtiene el valor de la propiedad request.
     * 
     * @return
     *     possible object is
     *     {@link DtInsuranceBeneficiariesUpdateReqSync }
     *     
     */
    public DtInsuranceBeneficiariesUpdateReqSync getRequest() {
        return request;
    }

    /**
     * Define el valor de la propiedad request.
     * 
     * @param value
     *     allowed object is
     *     {@link DtInsuranceBeneficiariesUpdateReqSync }
     *     
     */
    public void setRequest(DtInsuranceBeneficiariesUpdateReqSync value) {
        this.request = value;
    }

}
