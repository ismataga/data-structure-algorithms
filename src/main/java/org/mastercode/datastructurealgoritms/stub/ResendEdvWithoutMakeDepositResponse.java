
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
 *         &amp;lt;element name="ResendEdvWithoutMakeDepositResult" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
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
    "resendEdvWithoutMakeDepositResult"
})
@XmlRootElement(name = "ResendEdvWithoutMakeDepositResponse")
public class ResendEdvWithoutMakeDepositResponse {

    @XmlElement(name = "ResendEdvWithoutMakeDepositResult")
    protected int resendEdvWithoutMakeDepositResult;

    /**
     * Gets the value of the resendEdvWithoutMakeDepositResult property.
     * 
     */
    public int getResendEdvWithoutMakeDepositResult() {
        return resendEdvWithoutMakeDepositResult;
    }

    /**
     * Sets the value of the resendEdvWithoutMakeDepositResult property.
     * 
     */
    public void setResendEdvWithoutMakeDepositResult(int value) {
        this.resendEdvWithoutMakeDepositResult = value;
    }

}
