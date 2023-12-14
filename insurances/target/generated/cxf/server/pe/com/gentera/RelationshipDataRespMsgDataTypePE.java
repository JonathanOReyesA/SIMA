
package pe.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para relationshipDataRespMsgDataTypePE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="relationshipDataRespMsgDataTypePE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relationshipSearchList" type="{http://gentera.com.pe/}relationshipDataTypePE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationshipDataRespMsgDataTypePE", propOrder = {
    "relationshipSearchList"
})
public class RelationshipDataRespMsgDataTypePE {

    @XmlElement(nillable = true)
    protected List<RelationshipDataTypePE> relationshipSearchList;

    /**
     * Gets the value of the relationshipSearchList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipSearchList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipSearchList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipDataTypePE }
     * 
     * 
     */
    public List<RelationshipDataTypePE> getRelationshipSearchList() {
        if (relationshipSearchList == null) {
            relationshipSearchList = new ArrayList<RelationshipDataTypePE>();
        }
        return this.relationshipSearchList;
    }

}
