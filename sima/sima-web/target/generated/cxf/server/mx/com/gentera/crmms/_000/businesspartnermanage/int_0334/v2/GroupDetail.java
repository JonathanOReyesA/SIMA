
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Group Detail
 * 
 * <p>Clase Java para GroupDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GroupDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupName" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="GroupingCharacter" type="{http://compartamos.com/common/gdt}GroupID" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionOfGroupingCharacteristic" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupDetail", propOrder = {
    "groupName",
    "groupingCharacter",
    "descriptionOfGroupingCharacteristic"
})
public class GroupDetail {

    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "GroupingCharacter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupingCharacter;
    @XmlElement(name = "DescriptionOfGroupingCharacteristic")
    protected String descriptionOfGroupingCharacteristic;

    /**
     * Obtiene el valor de la propiedad groupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Define el valor de la propiedad groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Obtiene el valor de la propiedad groupingCharacter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupingCharacter() {
        return groupingCharacter;
    }

    /**
     * Define el valor de la propiedad groupingCharacter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupingCharacter(String value) {
        this.groupingCharacter = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionOfGroupingCharacteristic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOfGroupingCharacteristic() {
        return descriptionOfGroupingCharacteristic;
    }

    /**
     * Define el valor de la propiedad descriptionOfGroupingCharacteristic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOfGroupingCharacteristic(String value) {
        this.descriptionOfGroupingCharacteristic = value;
    }

}
