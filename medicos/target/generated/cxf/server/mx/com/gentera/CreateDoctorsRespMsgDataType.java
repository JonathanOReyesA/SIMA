
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createDoctorsRespMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createDoctorsRespMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageList" type="{http://gentera.com.mx/}messageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDoctorsRespMsgDataType", propOrder = {
    "messageList"
})
public class CreateDoctorsRespMsgDataType {

    @XmlElement(nillable = true)
    protected List<MessageDataType> messageList;

    /**
     * Gets the value of the messageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDataType }
     * 
     * 
     */
    public List<MessageDataType> getMessageList() {
        if (messageList == null) {
            messageList = new ArrayList<MessageDataType>();
        }
        return this.messageList;
    }

}
