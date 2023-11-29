
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Business Partner Data Item
 * 
 * <p>Clase Java para BusinessPartnerItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessPartnerItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerID" type="{http://compartamos.com/common/gdt}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerGUID" type="{http://compartamos.com/common/gdt}GUID" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://compartamos.com/common/gdt}BusinessPartnerType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerGroupCode" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}GroupTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerGroupDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerDetail" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}BusinessPartnerDetail" minOccurs="0"/&gt;
 *         &lt;element name="GroupDetail" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}GroupDetail" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOffice" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}ServiceOffice" minOccurs="0"/&gt;
 *         &lt;element name="EconomicActivity" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}EconomicActivity" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}Role" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}Address" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}Phone" minOccurs="0"/&gt;
 *         &lt;element name="MarketingAttribute" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}MarketingAttribute" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="Relation" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}Relation" minOccurs="0"/&gt;
 *         &lt;element name="Document" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}Document" minOccurs="0"/&gt;
 *         &lt;element name="Rating" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}Rating" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPartnerItem", propOrder = {
    "businessPartnerID",
    "businessPartnerGUID",
    "type",
    "businessPartnerGroupCode",
    "businessPartnerGroupDescription",
    "businessPartnerDetail",
    "groupDetail",
    "serviceOffice",
    "economicActivity",
    "role",
    "address",
    "phone",
    "marketingAttribute",
    "identifier",
    "relation",
    "document",
    "rating"
})
public class BusinessPartnerItem {

    @XmlElement(name = "BusinessPartnerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerID;
    @XmlElement(name = "BusinessPartnerGUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerGUID;
    @XmlElement(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String type;
    @XmlElement(name = "BusinessPartnerGroupCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerGroupCode;
    @XmlElement(name = "BusinessPartnerGroupDescription")
    protected String businessPartnerGroupDescription;
    @XmlElement(name = "BusinessPartnerDetail")
    protected BusinessPartnerDetail businessPartnerDetail;
    @XmlElement(name = "GroupDetail")
    protected GroupDetail groupDetail;
    @XmlElement(name = "ServiceOffice")
    protected ServiceOffice serviceOffice;
    @XmlElement(name = "EconomicActivity")
    protected EconomicActivity economicActivity;
    @XmlElement(name = "Role")
    protected Role role;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "Phone")
    protected Phone phone;
    @XmlElement(name = "MarketingAttribute")
    protected MarketingAttribute marketingAttribute;
    @XmlElement(name = "Identifier")
    protected Identifier identifier;
    @XmlElement(name = "Relation")
    protected Relation relation;
    @XmlElement(name = "Document")
    protected Document document;
    @XmlElement(name = "Rating")
    protected Rating rating;

    /**
     * Obtiene el valor de la propiedad businessPartnerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerID() {
        return businessPartnerID;
    }

    /**
     * Define el valor de la propiedad businessPartnerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerID(String value) {
        this.businessPartnerID = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerGUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerGUID() {
        return businessPartnerGUID;
    }

    /**
     * Define el valor de la propiedad businessPartnerGUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerGUID(String value) {
        this.businessPartnerGUID = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerGroupCode() {
        return businessPartnerGroupCode;
    }

    /**
     * Define el valor de la propiedad businessPartnerGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerGroupCode(String value) {
        this.businessPartnerGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerGroupDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerGroupDescription() {
        return businessPartnerGroupDescription;
    }

    /**
     * Define el valor de la propiedad businessPartnerGroupDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerGroupDescription(String value) {
        this.businessPartnerGroupDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerDetail.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerDetail }
     *     
     */
    public BusinessPartnerDetail getBusinessPartnerDetail() {
        return businessPartnerDetail;
    }

    /**
     * Define el valor de la propiedad businessPartnerDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerDetail }
     *     
     */
    public void setBusinessPartnerDetail(BusinessPartnerDetail value) {
        this.businessPartnerDetail = value;
    }

    /**
     * Obtiene el valor de la propiedad groupDetail.
     * 
     * @return
     *     possible object is
     *     {@link GroupDetail }
     *     
     */
    public GroupDetail getGroupDetail() {
        return groupDetail;
    }

    /**
     * Define el valor de la propiedad groupDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupDetail }
     *     
     */
    public void setGroupDetail(GroupDetail value) {
        this.groupDetail = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceOffice.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOffice }
     *     
     */
    public ServiceOffice getServiceOffice() {
        return serviceOffice;
    }

    /**
     * Define el valor de la propiedad serviceOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOffice }
     *     
     */
    public void setServiceOffice(ServiceOffice value) {
        this.serviceOffice = value;
    }

    /**
     * Obtiene el valor de la propiedad economicActivity.
     * 
     * @return
     *     possible object is
     *     {@link EconomicActivity }
     *     
     */
    public EconomicActivity getEconomicActivity() {
        return economicActivity;
    }

    /**
     * Define el valor de la propiedad economicActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicActivity }
     *     
     */
    public void setEconomicActivity(EconomicActivity value) {
        this.economicActivity = value;
    }

    /**
     * Obtiene el valor de la propiedad role.
     * 
     * @return
     *     possible object is
     *     {@link Role }
     *     
     */
    public Role getRole() {
        return role;
    }

    /**
     * Define el valor de la propiedad role.
     * 
     * @param value
     *     allowed object is
     *     {@link Role }
     *     
     */
    public void setRole(Role value) {
        this.role = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad phone.
     * 
     * @return
     *     possible object is
     *     {@link Phone }
     *     
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Define el valor de la propiedad phone.
     * 
     * @param value
     *     allowed object is
     *     {@link Phone }
     *     
     */
    public void setPhone(Phone value) {
        this.phone = value;
    }

    /**
     * Obtiene el valor de la propiedad marketingAttribute.
     * 
     * @return
     *     possible object is
     *     {@link MarketingAttribute }
     *     
     */
    public MarketingAttribute getMarketingAttribute() {
        return marketingAttribute;
    }

    /**
     * Define el valor de la propiedad marketingAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingAttribute }
     *     
     */
    public void setMarketingAttribute(MarketingAttribute value) {
        this.marketingAttribute = value;
    }

    /**
     * Obtiene el valor de la propiedad identifier.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Define el valor de la propiedad identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Obtiene el valor de la propiedad relation.
     * 
     * @return
     *     possible object is
     *     {@link Relation }
     *     
     */
    public Relation getRelation() {
        return relation;
    }

    /**
     * Define el valor de la propiedad relation.
     * 
     * @param value
     *     allowed object is
     *     {@link Relation }
     *     
     */
    public void setRelation(Relation value) {
        this.relation = value;
    }

    /**
     * Obtiene el valor de la propiedad document.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Define el valor de la propiedad document.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Obtiene el valor de la propiedad rating.
     * 
     * @return
     *     possible object is
     *     {@link Rating }
     *     
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * Define el valor de la propiedad rating.
     * 
     * @param value
     *     allowed object is
     *     {@link Rating }
     *     
     */
    public void setRating(Rating value) {
        this.rating = value;
    }

}
