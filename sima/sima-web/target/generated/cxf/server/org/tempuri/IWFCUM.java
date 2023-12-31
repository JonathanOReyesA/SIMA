package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 3.1.13
 * 2023-12-05T17:34:56.994-06:00
 * Generated source version: 3.1.13
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IWFCUM")
@XmlSeeAlso({com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, ObjectFactory.class, generated.ObjectFactory.class, org.datacontract.schemas._2004._07.cmessage.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IWFCUM {

    @WebMethod(action = "http://tempuri.org/IWFCUM/validaUsuario")
    @Action(input = "http://tempuri.org/IWFCUM/validaUsuario", output = "http://tempuri.org/IWFCUM/validaUsuarioResponse")
    @WebResult(name = "ResponseUm", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public ResponseUm validaUsuario(
        @WebParam(partName = "MessageContent", name = "MessageContent", targetNamespace = "")
        org.datacontract.schemas._2004._07.cmessage.CAutenticacion messageContent
    );

    @WebMethod(operationName = "GetUsuariosEmpresa", action = "http://tempuri.org/IWFCUM/GetUsuariosEmpresa")
    @Action(input = "http://tempuri.org/IWFCUM/GetUsuariosEmpresa", output = "http://tempuri.org/IWFCUM/GetUsuariosEmpresaResponse")
    @WebResult(name = "ResponseGetUsuarios", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public ResponseGetUsuarios getUsuariosEmpresa(
        @WebParam(partName = "MessageUsuarios", name = "MessageUsuarios", targetNamespace = "")
        org.datacontract.schemas._2004._07.cmessage.CRPerfiles messageUsuarios
    );

    @WebMethod(operationName = "AdminSistema", action = "http://tempuri.org/IWFCUM/AdminSistema")
    @Action(input = "http://tempuri.org/IWFCUM/AdminSistema", output = "http://tempuri.org/IWFCUM/AdminSistemaResponse")
    @WebResult(name = "AdminSistema", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public AdminSistema adminSistema(
        @WebParam(partName = "MessaheSistemas", name = "MessaheSistemas", targetNamespace = "")
        org.datacontract.schemas._2004._07.cmessage.CRSistema messaheSistemas
    );

    @WebMethod(operationName = "AdministracionUsuario", action = "http://tempuri.org/IWFCUM/AdministracionUsuario")
    @Action(input = "http://tempuri.org/IWFCUM/AdministracionUsuario", output = "http://tempuri.org/IWFCUM/AdministracionUsuarioResponse")
    @WebResult(name = "ResponseAdmUsuario", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public ResponseAdmUsuario administracionUsuario(
        @WebParam(partName = "AdmUsuario", name = "AdmUsuario", targetNamespace = "")
        org.datacontract.schemas._2004._07.cmessage.CRUsuario admUsuario
    );

    @WebMethod(action = "http://tempuri.org/IWFCUM/listadoPerfiles")
    @Action(input = "http://tempuri.org/IWFCUM/listadoPerfiles", output = "http://tempuri.org/IWFCUM/listadoPerfilesResponse")
    @WebResult(name = "ResponsePerfiles", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public ResponsePerfiles listadoPerfiles(
        @WebParam(partName = "MessagePerfiles", name = "MessagePerfiles", targetNamespace = "")
        org.datacontract.schemas._2004._07.cmessage.CRPerfiles messagePerfiles
    );

    @WebMethod(action = "http://tempuri.org/IWFCUM/listadoEmpresas")
    @Action(input = "http://tempuri.org/IWFCUM/listadoEmpresas", output = "http://tempuri.org/IWFCUM/listadoEmpresasResponse")
    @WebResult(name = "ResponseEmpresas", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public ResponseEmpresas listadoEmpresas(
        @WebParam(partName = "MessageEmpresa", name = "MessageEmpresa", targetNamespace = "")
        org.datacontract.schemas._2004._07.cmessage.CREmpresas messageEmpresa
    );
}
