
package pe.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para claimInsurancePaymentResMsgDataTypePE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimInsurancePaymentResMsgDataTypePE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimInsurancePaymentArray" type="{http://gentera.com.pe/}claimInsuranceDetailDataTypePNEPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentsFileTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimInsurancePaymentResMsgDataTypePE", propOrder = {
    "claimInsurancePaymentArray",
    "paymentsFileTotal"
})
public class ClaimInsurancePaymentResMsgDataTypePE {

    @XmlElement(nillable = true)
    protected List<ClaimInsuranceDetailDataTypePNEPE> claimInsurancePaymentArray;
    protected int paymentsFileTotal;

    /**
     * Gets the value of the claimInsurancePaymentArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimInsurancePaymentArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimInsurancePaymentArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimInsuranceDetailDataTypePNEPE }
     * 
     * 
     */
    public List<ClaimInsuranceDetailDataTypePNEPE> getClaimInsurancePaymentArray() {
        if (claimInsurancePaymentArray == null) {
            claimInsurancePaymentArray = new ArrayList<ClaimInsuranceDetailDataTypePNEPE>();
        }
        return this.claimInsurancePaymentArray;
    }

    /**
     * Obtiene el valor de la propiedad paymentsFileTotal.
     * 
     */
    public int getPaymentsFileTotal() {
        return paymentsFileTotal;
    }

    /**
     * Define el valor de la propiedad paymentsFileTotal.
     * 
     */
    public void setPaymentsFileTotal(int value) {
        this.paymentsFileTotal = value;
    }

}
