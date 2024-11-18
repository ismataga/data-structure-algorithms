
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
 *         &amp;lt;element name="MakeDepositResult" type="{http://fortunawsc.isube.asb.com/}MakeDepositResponsee" minOccurs="0"/&amp;gt;
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
    "makeDepositResult"
})
@XmlRootElement(name = "MakeDepositResponse")
public class MakeDepositResponse {

    @XmlElement(name = "MakeDepositResult")
    protected MakeDepositResponsee makeDepositResult;

    /**
     * Gets the value of the makeDepositResult property.
     * 
     * @return
     *     possible object is
     *     {@link MakeDepositResponsee }
     *     
     */
    public MakeDepositResponsee getMakeDepositResult() {
        return makeDepositResult;
    }

    /**
     * Sets the value of the makeDepositResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeDepositResponsee }
     *     
     */
    public void setMakeDepositResult(MakeDepositResponsee value) {
        this.makeDepositResult = value;
    }

}
