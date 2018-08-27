package ar.com.educacionIt.productor;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "MiPrimerWS")
public class MiPrimerWS {

   
    // el wsdl se encuentra en http://localhost:8080/JavaWS-Clase1-Lab-ProductorWS/MiPrimerWS?WSDL
    @WebMethod(operationName = "hola")
    public String hello(@WebParam(name = "name") String txt) {
        return txt + " Saludos desde Educacion It!";
    }
}
