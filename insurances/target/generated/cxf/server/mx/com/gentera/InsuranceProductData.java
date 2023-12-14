
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insuranceProductData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insuranceProductData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insuranceCoverageData" type="{http://gentera.com.mx/}insuranceCoverageList" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceProductData", propOrder = {
    "insuranceCoverageData",
    "name"
})
public class InsuranceProductData {

    protected InsuranceCoverageList insuranceCoverageData;
    protected String name;

    /**
     * Obtiene el valor de la propiedad insuranceCoverageData.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCoverageList }
     *     
     */
    public InsuranceCoverageList getInsuranceCoverageData() {
        return insuranceCoverageData;
    }

    /**
     * Define el valor de la propiedad insuranceCoverageData.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCoverageList }
     *     
     */
    public void setInsuranceCoverageData(InsuranceCoverageList value) {
        this.insuranceCoverageData = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
