
package org.w3._2001.xmlschema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (com.gentera.adapters.DateAdapter.unmarshal(value));
    }

    public String marshal(Date value) {
        return (com.gentera.adapters.DateAdapter.marshal(value));
    }

}
