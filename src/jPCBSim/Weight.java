//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.14 at 10:55:23 AM PDT 
//


package jPCBSim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Epsilon" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Mue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Kappa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Sigma" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Density" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="X" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Y" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Z" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Weight")
public class Weight {

    @XmlAttribute(name = "Epsilon")
    protected String epsilon;
    @XmlAttribute(name = "Mue")
    protected String mue;
    @XmlAttribute(name = "Kappa")
    protected String kappa;
    @XmlAttribute(name = "Sigma")
    protected String sigma;
    @XmlAttribute(name = "Density")
    protected String density;
    @XmlAttribute(name = "X")
    protected String x;
    @XmlAttribute(name = "Y")
    protected String y;
    @XmlAttribute(name = "Z")
    protected String z;

    /**
     * Gets the value of the epsilon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpsilon() {
        return epsilon;
    }

    /**
     * Sets the value of the epsilon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpsilon(String value) {
        this.epsilon = value;
    }

    /**
     * Gets the value of the mue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMue() {
        return mue;
    }

    /**
     * Sets the value of the mue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMue(String value) {
        this.mue = value;
    }

    /**
     * Gets the value of the kappa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKappa() {
        return kappa;
    }

    /**
     * Sets the value of the kappa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKappa(String value) {
        this.kappa = value;
    }

    /**
     * Gets the value of the sigma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigma() {
        return sigma;
    }

    /**
     * Sets the value of the sigma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigma(String value) {
        this.sigma = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDensity(String value) {
        this.density = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZ(String value) {
        this.z = value;
    }

}
