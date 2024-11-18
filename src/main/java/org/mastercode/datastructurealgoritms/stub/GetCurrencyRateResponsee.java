
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GetCurrencyRateResponsee complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GetCurrencyRateResponsee"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="bolen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="capraz_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="capraz_eff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dov_alis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dov_cins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dov_kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dov_satis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eff_alis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eff_satis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kur_cins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tarih" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrencyRateResponsee", propOrder = {
    "bolen",
    "caprazD",
    "caprazEff",
    "dovAlis",
    "dovCins",
    "dovKod",
    "dovSatis",
    "effAlis",
    "effSatis",
    "kurCins",
    "tarih"
})
public class GetCurrencyRateResponsee {

    protected String bolen;
    @XmlElement(name = "capraz_d")
    protected String caprazD;
    @XmlElement(name = "capraz_eff")
    protected String caprazEff;
    @XmlElement(name = "dov_alis")
    protected String dovAlis;
    @XmlElement(name = "dov_cins")
    protected String dovCins;
    @XmlElement(name = "dov_kod")
    protected String dovKod;
    @XmlElement(name = "dov_satis")
    protected String dovSatis;
    @XmlElement(name = "eff_alis")
    protected String effAlis;
    @XmlElement(name = "eff_satis")
    protected String effSatis;
    @XmlElement(name = "kur_cins")
    protected String kurCins;
    protected String tarih;

    /**
     * Gets the value of the bolen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBolen() {
        return bolen;
    }

    /**
     * Sets the value of the bolen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBolen(String value) {
        this.bolen = value;
    }

    /**
     * Gets the value of the caprazD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaprazD() {
        return caprazD;
    }

    /**
     * Sets the value of the caprazD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaprazD(String value) {
        this.caprazD = value;
    }

    /**
     * Gets the value of the caprazEff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaprazEff() {
        return caprazEff;
    }

    /**
     * Sets the value of the caprazEff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaprazEff(String value) {
        this.caprazEff = value;
    }

    /**
     * Gets the value of the dovAlis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDovAlis() {
        return dovAlis;
    }

    /**
     * Sets the value of the dovAlis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDovAlis(String value) {
        this.dovAlis = value;
    }

    /**
     * Gets the value of the dovCins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDovCins() {
        return dovCins;
    }

    /**
     * Sets the value of the dovCins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDovCins(String value) {
        this.dovCins = value;
    }

    /**
     * Gets the value of the dovKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDovKod() {
        return dovKod;
    }

    /**
     * Sets the value of the dovKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDovKod(String value) {
        this.dovKod = value;
    }

    /**
     * Gets the value of the dovSatis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDovSatis() {
        return dovSatis;
    }

    /**
     * Sets the value of the dovSatis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDovSatis(String value) {
        this.dovSatis = value;
    }

    /**
     * Gets the value of the effAlis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffAlis() {
        return effAlis;
    }

    /**
     * Sets the value of the effAlis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffAlis(String value) {
        this.effAlis = value;
    }

    /**
     * Gets the value of the effSatis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffSatis() {
        return effSatis;
    }

    /**
     * Sets the value of the effSatis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffSatis(String value) {
        this.effSatis = value;
    }

    /**
     * Gets the value of the kurCins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurCins() {
        return kurCins;
    }

    /**
     * Sets the value of the kurCins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurCins(String value) {
        this.kurCins = value;
    }

    /**
     * Gets the value of the tarih property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarih() {
        return tarih;
    }

    /**
     * Sets the value of the tarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarih(String value) {
        this.tarih = value;
    }

}
