package mx.com.gentera;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.13
 * 2023-11-28T13:26:55.396-06:00
 * Generated source version: 3.1.13
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "getIndicators")
@XmlSeeAlso({ObjectFactory.class})
public interface GetIndicators {

    @WebMethod
    @Action(input = "http://gentera.com.mx/getIndicators/getIndicatorsRequest", output = "http://gentera.com.mx/getIndicators/getIndicatorsResponse")
    @RequestWrapper(localName = "getIndicators", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.GetIndicators_Type")
    @ResponseWrapper(localName = "getIndicatorsResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.GetIndicatorsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.IndicatorsRespMsg getIndicators(
        @WebParam(name = "certificate", targetNamespace = "")
        java.lang.String certificate,
        @WebParam(name = "coverageID", targetNamespace = "")
        java.lang.Integer coverageID,
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID
    );
}
