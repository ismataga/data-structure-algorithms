
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for ArrayOfFindAccountInformationResponse complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfFindAccountInformationResponse"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="FindAccountInformationResponse" type="{http://fortunawsc.isube.asb.com/}FindAccountInformationResponse" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFindAccountInformationResponse", propOrder = {
        "findAccountInformationResponse"
})
public class ArrayOfFindAccountInformationResponse {

    @XmlElement(name = "FindAccountInformationResponse", nillable = true)
    protected List<FindAccountInformationResponse> findAccountInformationResponse;

    /**
     * Gets the value of the findAccountInformationResponse property.
     * <p>
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the findAccountInformationResponse property.
     * <p>
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     * getFindAccountInformationResponse().add(newItem);
     * &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link FindAccountInformationResponse }
     */
    public List<FindAccountInformationResponse> getFindAccountInformationResponse() {
        if (findAccountInformationResponse == null) {
            findAccountInformationResponse = new ArrayList<FindAccountInformationResponse>();
        }
        return this.findAccountInformationResponse;
    }

    @Override
    public String toString() {
        return "ArrayOfFindAccountInformationResponse{" +
                "findAccountInformationResponse=" + findAccountInformationResponse +
                '}';
    }
}
