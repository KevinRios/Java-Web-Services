
package ar.com.fiscalgis.solicituddatos.response;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="tipoTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoTarjetaNombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saldoPesos" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="saldoDolares" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pagoMinimo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="textoFormaPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adicional" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "tipoTarjeta",
    "tipoTarjetaNombre",
    "numeroTarjeta",
    "saldoPesos",
    "saldoDolares",
    "pagoMinimo",
    "fechaVencimiento",
    "textoFormaPago",
    "adicional"
})
@XmlRootElement(name = "Tarjeta")
public class Tarjeta {

    @XmlElement(required = true)
    protected String tipoTarjeta;
    @XmlElement(required = true)
    protected String tipoTarjetaNombre;
    @XmlElement(required = true)
    protected String numeroTarjeta;
    @XmlElement(required = true)
    protected BigDecimal saldoPesos;
    @XmlElement(required = true)
    protected BigDecimal saldoDolares;
    @XmlElement(required = true)
    protected BigDecimal pagoMinimo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimiento;
    @XmlElement(required = true)
    protected String textoFormaPago;
    @XmlElement(required = true)
    protected String adicional;

    /**
     * Obtiene el valor de la propiedad tipoTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Define el valor de la propiedad tipoTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTarjeta(String value) {
        this.tipoTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTarjetaNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTarjetaNombre() {
        return tipoTarjetaNombre;
    }

    /**
     * Define el valor de la propiedad tipoTarjetaNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTarjetaNombre(String value) {
        this.tipoTarjetaNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Define el valor de la propiedad numeroTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoPesos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoPesos() {
        return saldoPesos;
    }

    /**
     * Define el valor de la propiedad saldoPesos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoPesos(BigDecimal value) {
        this.saldoPesos = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoDolares.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoDolares() {
        return saldoDolares;
    }

    /**
     * Define el valor de la propiedad saldoDolares.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoDolares(BigDecimal value) {
        this.saldoDolares = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoMinimo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPagoMinimo() {
        return pagoMinimo;
    }

    /**
     * Define el valor de la propiedad pagoMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPagoMinimo(BigDecimal value) {
        this.pagoMinimo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimiento(XMLGregorianCalendar value) {
        this.fechaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad textoFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoFormaPago() {
        return textoFormaPago;
    }

    /**
     * Define el valor de la propiedad textoFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoFormaPago(String value) {
        this.textoFormaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad adicional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdicional() {
        return adicional;
    }

    /**
     * Define el valor de la propiedad adicional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdicional(String value) {
        this.adicional = value;
    }

}
