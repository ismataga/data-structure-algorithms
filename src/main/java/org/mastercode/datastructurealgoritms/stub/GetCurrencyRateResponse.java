
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="GetCurrencyRateResult" type="{http://fortunawsc.isube.asb.com/}ArrayOfGetCurrencyRateResponse" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCurrencyRateResult"
})
@XmlRootElement(name = "GetCurrencyRateResponse")
public class GetCurrencyRateResponse {

    @XmlElement(name = "GetCurrencyRateResult")
    protected ArrayOfGetCurrencyRateResponse getCurrencyRateResult;

    /**
     * Gets the value of the getCurrencyRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetCurrencyRateResponse }
     *     
     */
    public ArrayOfGetCurrencyRateResponse getGetCurrencyRateResult() {
        return getCurrencyRateResult;
    }

    /**
     * Sets the value of the getCurrencyRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetCurrencyRateResponse }
     *     
     */
    public void setGetCurrencyRateResult(ArrayOfGetCurrencyRateResponse value) {
        this.getCurrencyRateResult = value;
    }

}
