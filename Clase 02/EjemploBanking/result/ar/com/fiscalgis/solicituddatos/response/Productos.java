
package ar.com.fiscalgis.solicituddatos.response;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Cuentas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://fiscalgis.com.ar/solicitudDatos/response}Cuenta" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Tarjetas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://fiscalgis.com.ar/solicitudDatos/response}Tarjeta" maxOccurs="unbounded" minOccurs="0"/>
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
    "cuentas",
    "tarjetas"
})
@XmlRootElement(name = "Productos")
public class Productos {

    @XmlElement(name = "Cuentas", required = true)
    protected Productos.Cuentas cuentas;
    @XmlElement(name = "Tarjetas", required = true)
    protected Productos.Tarjetas tarjetas;

    /**
     * Obtiene el valor de la propiedad cuentas.
     * 
     * @return
     *     possible object is
     *     {@link Productos.Cuentas }
     *     
     */
    public Productos.Cuentas getCuentas() {
        return cuentas;
    }

    /**
     * Define el valor de la propiedad cuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link Productos.Cuentas }
     *     
     */
    public void setCuentas(Productos.Cuentas value) {
        this.cuentas = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjetas.
     * 
     * @return
     *     possible object is
     *     {@link Productos.Tarjetas }
     *     
     */
    public Productos.Tarjetas getTarjetas() {
        return tarjetas;
    }

    /**
     * Define el valor de la propiedad tarjetas.
     * 
     * @param value
     *     allowed object is
     *     {@link Productos.Tarjetas }
     *     
     */
    public void setTarjetas(Productos.Tarjetas value) {
        this.tarjetas = value;
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
     *         &lt;element ref="{http://fiscalgis.com.ar/solicitudDatos/response}Cuenta" maxOccurs="unbounded" minOccurs="0"/>
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
        "cuenta"
    })
    public static class Cuentas {

        @XmlElement(name = "Cuenta", namespace = "http://fiscalgis.com.ar/solicitudDatos/response")
        protected List<Cuenta> cuenta;

        /**
         * Gets the value of the cuenta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cuenta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCuenta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cuenta }
         * 
         * 
         */
        public List<Cuenta> getCuenta() {
            if (cuenta == null) {
                cuenta = new ArrayList<Cuenta>();
            }
            return this.cuenta;
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
     *         &lt;element ref="{http://fiscalgis.com.ar/solicitudDatos/response}Tarjeta" maxOccurs="unbounded" minOccurs="0"/>
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
        "tarjeta"
    })
    public static class Tarjetas {

        @XmlElement(name = "Tarjeta", namespace = "http://fiscalgis.com.ar/solicitudDatos/response")
        protected List<Tarjeta> tarjeta;

        /**
         * Gets the value of the tarjeta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tarjeta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTarjeta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tarjeta }
         * 
         * 
         */
        public List<Tarjeta> getTarjeta() {
            if (tarjeta == null) {
                tarjeta = new ArrayList<Tarjeta>();
            }
            return this.tarjeta;
        }

    }

}
