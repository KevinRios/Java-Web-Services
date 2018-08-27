
package ar.com.fiscalgis.solicituddatos.response;

import java.math.BigDecimal;
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
 *         &lt;element name="tipoCuenta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Caja_Ahorro"/>
 *               &lt;enumeration value="Cuenta_Corriente"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idMoneda" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="admiteDepCheque" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="chequesPendienteAcreditar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cbu" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "tipoCuenta",
    "numeroCuenta",
    "sucursal",
    "estado",
    "subCuenta",
    "idMoneda",
    "admiteDepCheque",
    "saldo",
    "chequesPendienteAcreditar",
    "cbu"
})
@XmlRootElement(name = "Cuenta")
public class Cuenta {

    @XmlElement(required = true)
    protected String tipoCuenta;
    @XmlElement(required = true)
    protected String numeroCuenta;
    @XmlElement(required = true)
    protected BigInteger sucursal;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String subCuenta;
    @XmlElement(required = true)
    protected BigInteger idMoneda;
    @XmlElement(required = true)
    protected String admiteDepCheque;
    @XmlElement(required = true)
    protected BigDecimal saldo;
    @XmlElement(required = true)
    protected String chequesPendienteAcreditar;
    @XmlElement(required = true)
    protected String cbu;

    /**
     * Obtiene el valor de la propiedad tipoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Define el valor de la propiedad tipoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSucursal(BigInteger value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad subCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCuenta() {
        return subCuenta;
    }

    /**
     * Define el valor de la propiedad subCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCuenta(String value) {
        this.subCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idMoneda.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdMoneda() {
        return idMoneda;
    }

    /**
     * Define el valor de la propiedad idMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdMoneda(BigInteger value) {
        this.idMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad admiteDepCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmiteDepCheque() {
        return admiteDepCheque;
    }

    /**
     * Define el valor de la propiedad admiteDepCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmiteDepCheque(String value) {
        this.admiteDepCheque = value;
    }

    /**
     * Obtiene el valor de la propiedad saldo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * Define el valor de la propiedad saldo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldo(BigDecimal value) {
        this.saldo = value;
    }

    /**
     * Obtiene el valor de la propiedad chequesPendienteAcreditar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequesPendienteAcreditar() {
        return chequesPendienteAcreditar;
    }

    /**
     * Define el valor de la propiedad chequesPendienteAcreditar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequesPendienteAcreditar(String value) {
        this.chequesPendienteAcreditar = value;
    }

    /**
     * Obtiene el valor de la propiedad cbu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbu() {
        return cbu;
    }

    /**
     * Define el valor de la propiedad cbu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbu(String value) {
        this.cbu = value;
    }

}
