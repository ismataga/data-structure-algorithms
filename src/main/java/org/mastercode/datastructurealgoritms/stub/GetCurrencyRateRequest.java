
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GetCurrencyRateRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GetCurrencyRateRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="dov_iso_kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
@XmlType(name = "GetCurrencyRateRequest", propOrder = {
    "dovIsoKod",
    "tarih"
})
public class GetCurrencyRateRequest {

    @XmlElement(name = "dov_iso_kod")
    protected String dovIsoKod;
    protected String tarih;

    /**
     * Gets the value of the dovIsoKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDovIsoKod() {
        return dovIsoKod;
    }

    /**
     * Sets the value of the dovIsoKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDovIsoKod(String value) {
        this.dovIsoKod = value;
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
