package clase03cliente;

import ar.com.fiscalgis.solicituddatos.request.LoginRequest;
import ar.com.fiscalgis.solicituddatos.response.LoginResponse;
import com.fiscalgis.webservicebankingdata.MyServiceException;
import com.fiscalgis.webservicebankingdata.WebServiceBanking;
import java.net.MalformedURLException;
import java.net.URL;

public class Clase03Cliente {

       public static void main(String[] args) throws MalformedURLException, MyServiceException {
       
           LoginRequest request = new LoginRequest();
           LoginResponse response = new LoginResponse();

           URL url = new URL("http://alumno-801-05:8088/mockWebServiceBDBinding?wsdl");           
           WebServiceBanking ws =  new WebServiceBanking(url);
           
           response = ws.getWebServiceBankingDataPort().obtenerDatos(request);
           System.out.println("Datos --> " + response.getBody().getUsuario().getNombre());
           
           
    }   //end main
} // end class
