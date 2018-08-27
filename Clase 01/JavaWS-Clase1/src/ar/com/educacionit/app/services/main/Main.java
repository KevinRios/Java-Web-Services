package ar.com.educacionit.app.services.main;

import ar.com.educacionit.app.services.ServicioInicial;
import javax.xml.ws.Endpoint;


public class Main {    
    public static void main(String[] args) {
        
        System.out.println("Iniciando servicio");
        Endpoint.publish("http://127.0.0.1:9001/ws/MiServicio", new ServicioInicial());
        System.out.println("Servicio Iniciado");        
        
    }    
}
