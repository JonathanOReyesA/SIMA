
package org.datacontract.schemas._2004._07.cmessage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCSistema complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCSistema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CSistema" type="{http://schemas.datacontract.org/2004/07/CMessage}CSistema" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCSistema", propOrder = {
    "cSistema"
})
public class ArrayOfCSistema {

    @XmlElement(name = "CSistema", nillable = true)
    protected List<CSistema> cSistema;

    /**
     * Gets the value of the cSistema property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cSistema property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSistema().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSistema }
     * 
     * 
     */
    public List<CSistema> getCSistema() {
        if (cSistema == null) {
            cSistema = new ArrayList<CSistema>();
        }
        return this.cSistema;
    }

}
