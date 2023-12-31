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
 * 2023-11-28T13:26:55.472-06:00
 * Generated source version: 3.1.13
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "medicalIndicators")
@XmlSeeAlso({ObjectFactory.class})
public interface MedicalIndicators {

    @WebMethod
    @Action(input = "http://gentera.com.mx/medicalIndicators/getMedicalIndicatorsRequest", output = "http://gentera.com.mx/medicalIndicators/getMedicalIndicatorsResponse")
    @RequestWrapper(localName = "getMedicalIndicators", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.GetMedicalIndicators")
    @ResponseWrapper(localName = "getMedicalIndicatorsResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.GetMedicalIndicatorsResponse")
    @WebResult(name = "response", targetNamespace = "")
    public mx.com.gentera.GetMedicalIndicatorsRespMsgDataType getMedicalIndicators(
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID
    );

    @WebMethod
    @Action(input = "http://gentera.com.mx/medicalIndicators/updateImParametersRequest", output = "http://gentera.com.mx/medicalIndicators/updateImParametersResponse")
    @RequestWrapper(localName = "updateImParameters", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.UpdateImParameters")
    @ResponseWrapper(localName = "updateImParametersResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.UpdateImParametersResponse")
    @WebResult(name = "response", targetNamespace = "")
    public mx.com.gentera.UpdateImRespMsgDataType updateImParameters(
        @WebParam(name = "paramId", targetNamespace = "")
        java.lang.Integer paramId,
        @WebParam(name = "maxDays", targetNamespace = "")
        java.lang.Integer maxDays,
        @WebParam(name = "maxSiniestros", targetNamespace = "")
        java.lang.Integer maxSiniestros,
        @WebParam(name = "user", targetNamespace = "")
        java.lang.String user,
        @WebParam(name = "partnerId", targetNamespace = "")
        java.lang.String partnerId
    );
}
