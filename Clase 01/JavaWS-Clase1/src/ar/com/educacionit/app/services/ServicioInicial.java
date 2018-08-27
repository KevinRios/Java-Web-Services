package ar.com.educacionit.app.services;

import javax.jws.WebService;


@WebService
public class ServicioInicial {

    public String holaMundo() {
        return "Hola Mundo";
    }
    
    public Boolean sosMayor(int edad){
        return edad >17;
    }
    
    
}
