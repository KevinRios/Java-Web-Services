
package ar.com.fiscalgis.solicituddatos.response;

import java.math.BigInteger;
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
 *         &lt;element name="domicilioCalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domicilioNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domicilioPiso" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="domicilioProvincia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domicilioLocalidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domicilioCodigoPostal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "domicilioCalle",
    "domicilioNumero",
    "domicilioPiso",
    "domicilioProvincia",
    "domicilioLocalidad",
    "domicilioCodigoPostal"
})
@XmlRootElement(name = "Domicilio")
public class Domicilio {

    @XmlElement(required = true)
    protected String domicilioCalle;
    @XmlElement(required = true)
    protected String domicilioNumero;
    @XmlElement(required = true)
    protected BigInteger domicilioPiso;
    @XmlElement(required = true)
    protected String domicilioProvincia;
    @XmlElement(required = true)
    protected String domicilioLocalidad;
    @XmlElement(required = true)
    protected BigInteger domicilioCodigoPostal;

    /**
     * Obtiene el valor de la propiedad domicilioCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioCalle() {
        return domicilioCalle;
    }

    /**
     * Define el valor de la propiedad domicilioCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioCalle(String value) {
        this.domicilioCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioNumero() {
        return domicilioNumero;
    }

    /**
     * Define el valor de la propiedad domicilioNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioNumero(String value) {
        this.domicilioNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioPiso.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDomicilioPiso() {
        return domicilioPiso;
    }

    /**
     * Define el valor de la propiedad domicilioPiso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDomicilioPiso(BigInteger value) {
        this.domicilioPiso = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioProvincia() {
        return domicilioProvincia;
    }

    /**
     * Define el valor de la propiedad domicilioProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioProvincia(String value) {
        this.domicilioProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioLocalidad() {
        return domicilioLocalidad;
    }

    /**
     * Define el valor de la propiedad domicilioLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioLocalidad(String value) {
        this.domicilioLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioCodigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDomicilioCodigoPostal() {
        return domicilioCodigoPostal;
    }

    /**
     * Define el valor de la propiedad domicilioCodigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDomicilioCodigoPostal(BigInteger value) {
        this.domicilioCodigoPostal = value;
    }

}
