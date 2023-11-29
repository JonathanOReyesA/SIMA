
package org.datacontract.schemas._2004._07.cmessage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCComponente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCComponente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CComponente" type="{http://schemas.datacontract.org/2004/07/CMessage}CComponente" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCComponente", propOrder = {
    "cComponente"
})
public class ArrayOfCComponente {

    @XmlElement(name = "CComponente", nillable = true)
    protected List<CComponente> cComponente;

    /**
     * Gets the value of the cComponente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cComponente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCComponente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CComponente }
     * 
     * 
     */
    public List<CComponente> getCComponente() {
        if (cComponente == null) {
            cComponente = new ArrayList<CComponente>();
        }
        return this.cComponente;
    }

}
