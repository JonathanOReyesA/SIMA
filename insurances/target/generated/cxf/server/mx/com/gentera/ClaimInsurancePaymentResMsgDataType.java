
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter4;


/**
 * <p>Clase Java para claimInsurancePaymentResMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimInsurancePaymentResMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimInsurancePaymentArray" type="{http://gentera.com.mx/}claimInsuranceDetailDataTypePNE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "claimInsurancePaymentResMsgDataType", propOrder = {
    "claimInsurancePaymentArray",
    "paymentsFileTotal"
})
public class ClaimInsurancePaymentResMsgDataType {

    @XmlElement(nillable = true)
    protected List<ClaimInsuranceDetailDataTypePNE> claimInsurancePaymentArray;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer paymentsFileTotal;

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
     * {@link ClaimInsuranceDetailDataTypePNE }
     * 
     * 
     */
    public List<ClaimInsuranceDetailDataTypePNE> getClaimInsurancePaymentArray() {
        if (claimInsurancePaymentArray == null) {
            claimInsurancePaymentArray = new ArrayList<ClaimInsuranceDetailDataTypePNE>();
        }
        return this.claimInsurancePaymentArray;
    }

    /**
     * Obtiene el valor de la propiedad paymentsFileTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getPaymentsFileTotal() {
        return paymentsFileTotal;
    }

    /**
     * Define el valor de la propiedad paymentsFileTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentsFileTotal(Integer value) {
        this.paymentsFileTotal = value;
    }

}
