package ar.com.KevinRios.manejadores;

import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class Manejador implements SOAPHandler<SOAPMessageContext> {

    public boolean handleMessage(SOAPMessageContext messageContext) {

        SOAPMessage msg = messageContext.getMessage();
        Boolean esDeSalida = (boolean) messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (esDeSalida) {
            System.out.println("Estoy en el handler01");
        } else {
            System.out.println("Estoy en el handler02");

            SOAPEnvelope se;
            SOAPHeader sh = null;

            try {
                se = msg.getSOAPPart().getEnvelope();
                sh = se.getHeader();
            } catch (SOAPException ex) {
                Logger.getLogger(Manejador.class.getName()).log(Level.SEVERE, null, ex);
            }

            String contenido
                    = sh.getElementsByTagNameNS("http://fiscalgis.com.ar/solicitudDatos/response", "elemento").item(0).getTextContent();
            System.out.println("El elemento contiene la siguiente informacion: " + contenido);
        }
        return true;
    }

    public Set<QName> getHeaders() {
        return Collections.EMPTY_SET;
    }

    public boolean handleFault(SOAPMessageContext messageContext) {
        return true;
    }

    public void close(MessageContext context) {
    }

}
