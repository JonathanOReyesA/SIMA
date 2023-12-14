package pe.com.gentera;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2023-12-13T23:09:25.080-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.pe/", name = "beneficiariesSearchPE")
@XmlSeeAlso({ObjectFactory.class})
public interface BeneficiariesSearchPE {

    @WebMethod
    @Action(input = "http://gentera.com.pe/beneficiariesSearchPE/beneficiariesSearchRequest", output = "http://gentera.com.pe/beneficiariesSearchPE/beneficiariesSearchResponse")
    @RequestWrapper(localName = "beneficiariesSearch", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.BeneficiariesSearch")
    @ResponseWrapper(localName = "beneficiariesSearchResponse", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.BeneficiariesSearchResponse")
    @WebResult(name = "return", targetNamespace = "")
    public pe.com.gentera.BeneficiariesSeachRespMsgDataTypePE beneficiariesSearch(
        @WebParam(name = "insuranceID", targetNamespace = "")
        java.lang.String insuranceID,
        @WebParam(name = "mode", targetNamespace = "")
        java.lang.String mode,
        @WebParam(name = "coverageID", targetNamespace = "")
        java.lang.String coverageID,
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID
    );
}
