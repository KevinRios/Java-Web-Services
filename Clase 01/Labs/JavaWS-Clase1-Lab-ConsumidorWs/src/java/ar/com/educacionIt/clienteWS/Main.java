
package ar.com.educacionIt.clienteWS;

import ar.com.educacionit.productor.MiPrimerWS_Service;

public class Main {

   
    public static void main(String[] args) {
        String respuesta = new MiPrimerWS_Service().getMiPrimerWSPort().hola("Hola mundo! ");
        System.out.println(respuesta);
    }
    
}
