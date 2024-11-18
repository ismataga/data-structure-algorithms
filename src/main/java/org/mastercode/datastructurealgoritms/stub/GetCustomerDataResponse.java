
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
 *         &amp;lt;element name="GetCustomerDataResult" type="{http://fortunawsc.isube.asb.com/}CustomerDataResponse" minOccurs="0"/&amp;gt;
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
    "getCustomerDataResult"
})
@XmlRootElement(name = "GetCustomerDataResponse")
public class GetCustomerDataResponse {

    @XmlElement(name = "GetCustomerDataResult")
    protected CustomerDataResponse getCustomerDataResult;

    /**
     * Gets the value of the getCustomerDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDataResponse }
     *     
     */
    public CustomerDataResponse getGetCustomerDataResult() {
        return getCustomerDataResult;
    }

    /**
     * Sets the value of the getCustomerDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDataResponse }
     *     
     */
    public void setGetCustomerDataResult(CustomerDataResponse value) {
        this.getCustomerDataResult = value;
    }

}
