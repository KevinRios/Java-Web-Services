/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.KevinRios.ws;

import ar.com.fiscalgis.solicituddatos.request.LoginRequest;
import ar.com.fiscalgis.solicituddatos.response.LoginResponse;
import ar.com.fiscalgis.solicituddatos.response.ServiceFault;
import ar.com.fiscalgis.solicituddatos.response.Usuario;
import com.fiscalgis.webservicebankingdata.MyServiceException;
import javax.jws.WebService;

/**
 *
 * @author EducaciónIT
 */
@WebService(serviceName = "WebServiceBanking", portName = "WebServiceBankingData_Port", endpointInterface = "com.fiscalgis.webservicebankingdata.WebServiceBankingData", targetNamespace = "http://fiscalgis.com/WebServiceBankingData", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/WsdlBankingData.wsdl")
public class NewWebServiceFromWSDL {

    public ar.com.fiscalgis.solicituddatos.response.LoginResponse obtenerDatos(ar.com.fiscalgis.solicituddatos.request.LoginRequest parameters) throws MyServiceException {
        LoginResponse response = new LoginResponse();
        LoginRequest request = new LoginRequest();
        LoginResponse.Body body = new LoginResponse.Body();
        Usuario usuario = new Usuario();
        usuario.setAlias("KEVIN");

        body.setUsuario(usuario);
        response.setBody(body);

        String doc = request.getNumeroDocumento();

        if (doc.equals("123456")) {
            ServiceFault sf = new ServiceFault();
            sf.setFaultCode("666");
            sf.setFaultString("Ocurrio un error el doc es 123456");
            throw new MyServiceException("MENSAJE ERROR", sf);
        }

        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
