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
 * 2023-11-28T13:26:54.174-06:00
 * Generated source version: 3.1.13
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "getClientes")
@XmlSeeAlso({ObjectFactory.class})
public interface GetClientes {

    @WebMethod
    @Action(input = "http://gentera.com.mx/getClientes/getClientesRequest", output = "http://gentera.com.mx/getClientes/getClientesResponse")
    @RequestWrapper(localName = "getClientes", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.GetClientes_Type")
    @ResponseWrapper(localName = "clientesResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.ClientesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.ClientesRespMsgDataType getClientes(
        @WebParam(name = "businessPartnerID", targetNamespace = "")
        java.lang.String businessPartnerID,
        @WebParam(name = "businessPartnerName", targetNamespace = "")
        java.lang.String businessPartnerName,
        @WebParam(name = "birthday", targetNamespace = "")
        java.util.Date birthday,
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID
    );
}
