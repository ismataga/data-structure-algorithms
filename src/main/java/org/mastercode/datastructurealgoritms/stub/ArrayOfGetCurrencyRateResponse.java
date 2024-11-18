
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for ArrayOfGetCurrencyRateResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfGetCurrencyRateResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="GetCurrencyRateResponse" type="{http://fortunawsc.isube.asb.com/}GetCurrencyRateResponsee" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetCurrencyRateResponse", propOrder = {
    "getCurrencyRateResponse"
})
public class ArrayOfGetCurrencyRateResponse {

    @XmlElement(name = "GetCurrencyRateResponse", nillable = true)
    protected List<GetCurrencyRateResponsee> getCurrencyRateResponse;

    /**
     * Gets the value of the getCurrencyRateResponse property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the getCurrencyRateResponse property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getGetCurrencyRateResponse().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link GetCurrencyRateResponsee }
     * 
     * 
     */
    public List<GetCurrencyRateResponsee> getGetCurrencyRateResponse() {
        if (getCurrencyRateResponse == null) {
            getCurrencyRateResponse = new ArrayList<GetCurrencyRateResponsee>();
        }
        return this.getCurrencyRateResponse;
    }

}
