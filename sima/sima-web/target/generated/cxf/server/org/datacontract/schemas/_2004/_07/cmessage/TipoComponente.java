
package org.datacontract.schemas._2004._07.cmessage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoComponente.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoComponente"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="desconocido"/&gt;
 *     &lt;enumeration value="Menu"/&gt;
 *     &lt;enumeration value="SubMenu"/&gt;
 *     &lt;enumeration value="Boton"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoComponente")
@XmlEnum
public enum TipoComponente {

    @XmlEnumValue("desconocido")
    DESCONOCIDO("desconocido"),
    @XmlEnumValue("Menu")
    MENU("Menu"),
    @XmlEnumValue("SubMenu")
    SUB_MENU("SubMenu"),
    @XmlEnumValue("Boton")
    BOTON("Boton");
    private final String value;

    TipoComponente(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoComponente fromValue(String v) {
        for (TipoComponente c: TipoComponente.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
