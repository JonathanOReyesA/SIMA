
package mx.com.gentera;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beneficiaryData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beneficiaryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beneficiaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameData" type="{http://gentera.com.mx/}acctOriginationBusinessPartnerNameV1" minOccurs="0"/&gt;
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="phoneDataItem" type="{http://gentera.com.mx/}acctOriginationBusinessPartnerPhone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relationship" type="{http://gentera.com.mx/}businessPartnerRelationshipCategoryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beneficiaryData", propOrder = {
    "beneficiaryID",
    "birthDate",
    "gender",
    "nameData",
    "percentage",
    "phoneDataItem",
    "relationship"
})
public class BeneficiaryData {

    protected String beneficiaryID;
    protected String birthDate;
    protected String gender;
    protected AcctOriginationBusinessPartnerNameV1 nameData;
    protected BigDecimal percentage;
    @XmlElement(nillable = true)
    protected List<AcctOriginationBusinessPartnerPhone> phoneDataItem;
    protected BusinessPartnerRelationshipCategoryCode relationship;

    /**
     * Obtiene el valor de la propiedad beneficiaryID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryID() {
        return beneficiaryID;
    }

    /**
     * Define el valor de la propiedad beneficiaryID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryID(String value) {
        this.beneficiaryID = value;
    }

    /**
     * Obtiene el valor de la propiedad birthDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Define el valor de la propiedad birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Obtiene el valor de la propiedad nameData.
     * 
     * @return
     *     possible object is
     *     {@link AcctOriginationBusinessPartnerNameV1 }
     *     
     */
    public AcctOriginationBusinessPartnerNameV1 getNameData() {
        return nameData;
    }

    /**
     * Define el valor de la propiedad nameData.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctOriginationBusinessPartnerNameV1 }
     *     
     */
    public void setNameData(AcctOriginationBusinessPartnerNameV1 value) {
        this.nameData = value;
    }

    /**
     * Obtiene el valor de la propiedad percentage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Define el valor de la propiedad percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the phoneDataItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneDataItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneDataItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctOriginationBusinessPartnerPhone }
     * 
     * 
     */
    public List<AcctOriginationBusinessPartnerPhone> getPhoneDataItem() {
        if (phoneDataItem == null) {
            phoneDataItem = new ArrayList<AcctOriginationBusinessPartnerPhone>();
        }
        return this.phoneDataItem;
    }

    /**
     * Obtiene el valor de la propiedad relationship.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerRelationshipCategoryCode }
     *     
     */
    public BusinessPartnerRelationshipCategoryCode getRelationship() {
        return relationship;
    }

    /**
     * Define el valor de la propiedad relationship.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerRelationshipCategoryCode }
     *     
     */
    public void setRelationship(BusinessPartnerRelationshipCategoryCode value) {
        this.relationship = value;
    }

}
