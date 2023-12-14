
package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (com.gentera.adapters.DateAdapter.unmarshalDou(value));
    }

    public String marshal(Double value) {
        return (com.gentera.adapters.DateAdapter.marshalDou(value));
    }

}
