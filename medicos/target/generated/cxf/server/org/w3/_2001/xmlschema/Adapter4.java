
package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (com.gentera.adapters.DateAdapter.unmarshalInt(value));
    }

    public String marshal(Integer value) {
        return (com.gentera.adapters.DateAdapter.marshalInt(value));
    }

}
