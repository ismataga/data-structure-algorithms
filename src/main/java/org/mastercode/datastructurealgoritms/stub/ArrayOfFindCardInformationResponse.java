
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for ArrayOfFindCardInformationResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfFindCardInformationResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="FindCardInformationResponse" type="{http://fortunawsc.isube.asb.com/}FindCardInformationResponse" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFindCardInformationResponse", propOrder = {
    "findCardInformationResponse"
})
public class ArrayOfFindCardInformationResponse {

    @XmlElement(name = "FindCardInformationResponse", nillable = true)
    protected List<FindCardInformationResponse> findCardInformationResponse;

    /**
     * Gets the value of the findCardInformationResponse property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the findCardInformationResponse property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFindCardInformationResponse().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link FindCardInformationResponse }
     * 
     * 
     */
    public List<FindCardInformationResponse> getFindCardInformationResponse() {
        if (findCardInformationResponse == null) {
            findCardInformationResponse = new ArrayList<FindCardInformationResponse>();
        }
        return this.findCardInformationResponse;
    }

}
