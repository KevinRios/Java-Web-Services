
package ar.com.fiscalgis.solicituddatos.response;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.fiscalgis.solicituddatos.response package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.fiscalgis.solicituddatos.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Productos }
     * 
     */
    public Productos createProductos() {
        return new Productos();
    }

    /**
     * Create an instance of {@link LoginResponse.Header }
     * 
     */
    public LoginResponse.Header createLoginResponseHeader() {
        return new LoginResponse.Header();
    }

    /**
     * Create an instance of {@link LoginResponse.Body }
     * 
     */
    public LoginResponse.Body createLoginResponseBody() {
        return new LoginResponse.Body();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Domicilio }
     * 
     */
    public Domicilio createDomicilio() {
        return new Domicilio();
    }

    /**
     * Create an instance of {@link Productos.Cuentas }
     * 
     */
    public Productos.Cuentas createProductosCuentas() {
        return new Productos.Cuentas();
    }

    /**
     * Create an instance of {@link Productos.Tarjetas }
     * 
     */
    public Productos.Tarjetas createProductosTarjetas() {
        return new Productos.Tarjetas();
    }

    /**
     * Create an instance of {@link Tarjeta }
     * 
     */
    public Tarjeta createTarjeta() {
        return new Tarjeta();
    }

    /**
     * Create an instance of {@link ServiceFault }
     * 
     */
    public ServiceFault createServiceFault() {
        return new ServiceFault();
    }

    /**
     * Create an instance of {@link Cuenta }
     * 
     */
    public Cuenta createCuenta() {
        return new Cuenta();
    }

}
