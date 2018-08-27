package ar.com.educacionit.principal;

import ar.com.educacionit.productor.MiPrimerWS_Service;


public class Cliente {
    public static void main(String[] args) {
                
        // con esto simulo el SoapUI, con el hola, le paso el param name 
        String respuesta = new MiPrimerWS_Service().getMiPrimerWSPort().hola("holaaa");
        System.out.println(respuesta);
        
    }    // end main
} // end class
