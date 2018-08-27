
package ar.com.fiscalgis.solicituddatos.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://fiscalgis.com.ar/solicitudDatos/response}Usuario"/>
 *                   &lt;element ref="{http://fiscalgis.com.ar/solicitudDatos/response}Productos"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "body"
})
@XmlRootElement(name = "LoginResponse")
public class LoginResponse {

    @XmlElement(name = "Header", required = true)
    protected LoginResponse.Header header;
    @XmlElement(name = "Body", required = true)
    protected LoginResponse.Body body;

    /**
     * Obtiene el valor de la propiedad header.
     * 
     * @return
     *     possible object is
     *     {@link LoginResponse.Header }
     *     
     */
    public LoginResponse.Header getHeader() {
        return header;
    }

    /**
     * Define el valor de la propiedad header.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResponse.Header }
     *     
     */
    public void setHeader(LoginResponse.Header value) {
        this.header = value;
    }

    /**
     * Obtiene el valor de la propiedad body.
     * 
     * @return
     *     possible object is
     *     {@link LoginResponse.Body }
     *     
     */
    public LoginResponse.Body getBody() {
        return body;
    }

    /**
     * Define el valor de la propiedad body.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResponse.Body }
     *     
     */
    public void setBody(LoginResponse.Body value) {
        this.body = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://fiscalgis.com.ar/solicitudDatos/response}Usuario"/>
     *         &lt;element ref="{http://fiscalgis.com.ar/solicitudDatos/response}Productos"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usuario",
        "productos"
    })
    public static class Body {

        @XmlElement(name = "Usuario", namespace = "http://fiscalgis.com.ar/solicitudDatos/response", required = true)
        protected Usuario usuario;
        @XmlElement(name = "Productos", namespace = "http://fiscalgis.com.ar/solicitudDatos/response", required = true)
        protected Productos productos;

        /**
         * Obtiene el valor de la propiedad usuario.
         * 
         * @return
         *     possible object is
         *     {@link Usuario }
         *     
         */
        public Usuario getUsuario() {
            return usuario;
        }

        /**
         * Define el valor de la propiedad usuario.
         * 
         * @param value
         *     allowed object is
         *     {@link Usuario }
         *     
         */
        public void setUsuario(Usuario value) {
            this.usuario = value;
        }

        /**
         * Obtiene el valor de la propiedad productos.
         * 
         * @return
         *     possible object is
         *     {@link Productos }
         *     
         */
        public Productos getProductos() {
            return productos;
        }

        /**
         * Define el valor de la propiedad productos.
         * 
         * @param value
         *     allowed object is
         *     {@link Productos }
         *     
         */
        public void setProductos(Productos value) {
            this.productos = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sessionId",
        "user",
        "channel"
    })
    public static class Header {

        @XmlElement(name = "SessionId", required = true)
        protected String sessionId;
        @XmlElement(name = "User", required = true)
        protected String user;
        @XmlElement(name = "Channel", required = true)
        protected String channel;

        /**
         * Obtiene el valor de la propiedad sessionId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionId() {
            return sessionId;
        }

        /**
         * Define el valor de la propiedad sessionId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionId(String value) {
            this.sessionId = value;
        }

        /**
         * Obtiene el valor de la propiedad user.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUser() {
            return user;
        }

        /**
         * Define el valor de la propiedad user.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUser(String value) {
            this.user = value;
        }

        /**
         * Obtiene el valor de la propiedad channel.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannel() {
            return channel;
        }

        /**
         * Define el valor de la propiedad channel.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannel(String value) {
            this.channel = value;
        }

    }

}
