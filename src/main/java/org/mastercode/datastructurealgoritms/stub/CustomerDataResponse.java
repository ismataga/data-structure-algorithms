
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CustomerDataResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CustomerDataResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="customer_info" type="{http://fortunawsc.isube.asb.com/}FindCustomerInformationResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="account_info" type="{http://fortunawsc.isube.asb.com/}ArrayOfFindAccountInformationResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="card_info" type="{http://fortunawsc.isube.asb.com/}ArrayOfFindCardInformationResponse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_ack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_deger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sales_areas" type="{http://fortunawsc.isube.asb.com/}ArrayOfSalesArea" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDataResponse", propOrder = {
    "customerInfo",
    "accountInfo",
    "cardInfo",
    "sonucAck",
    "sonucDeger",
    "sonucKod",
    "salesAreas"
})
public class CustomerDataResponse {

    @XmlElement(name = "customer_info")
    protected FindCustomerInformationResponse customerInfo;
    @XmlElement(name = "account_info")
    protected ArrayOfFindAccountInformationResponse accountInfo;
    @XmlElement(name = "card_info")
    protected ArrayOfFindCardInformationResponse cardInfo;
    @XmlElement(name = "sonuc_ack")
    protected String sonucAck;
    @XmlElement(name = "sonuc_deger")
    protected String sonucDeger;
    @XmlElement(name = "sonuc_kod")
    protected String sonucKod;
    @XmlElement(name = "sales_areas")
    protected ArrayOfSalesArea salesAreas;

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FindCustomerInformationResponse }
     *     
     */
    public FindCustomerInformationResponse getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCustomerInformationResponse }
     *     
     */
    public void setCustomerInfo(FindCustomerInformationResponse value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFindAccountInformationResponse }
     *     
     */
    public ArrayOfFindAccountInformationResponse getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFindAccountInformationResponse }
     *     
     */
    public void setAccountInfo(ArrayOfFindAccountInformationResponse value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the cardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFindCardInformationResponse }
     *     
     */
    public ArrayOfFindCardInformationResponse getCardInfo() {
        return cardInfo;
    }

    /**
     * Sets the value of the cardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFindCardInformationResponse }
     *     
     */
    public void setCardInfo(ArrayOfFindCardInformationResponse value) {
        this.cardInfo = value;
    }

    /**
     * Gets the value of the sonucAck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonucAck() {
        return sonucAck;
    }

    /**
     * Sets the value of the sonucAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonucAck(String value) {
        this.sonucAck = value;
    }

    /**
     * Gets the value of the sonucDeger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonucDeger() {
        return sonucDeger;
    }

    /**
     * Sets the value of the sonucDeger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonucDeger(String value) {
        this.sonucDeger = value;
    }

    /**
     * Gets the value of the sonucKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonucKod() {
        return sonucKod;
    }

    /**
     * Sets the value of the sonucKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonucKod(String value) {
        this.sonucKod = value;
    }

    /**
     * Gets the value of the salesAreas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesArea }
     *     
     */
    public ArrayOfSalesArea getSalesAreas() {
        return salesAreas;
    }

    /**
     * Sets the value of the salesAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesArea }
     *     
     */
    public void setSalesAreas(ArrayOfSalesArea value) {
        this.salesAreas = value;
    }

    @Override
    public String toString() {
        return "CustomerDataResponse{" +
                "customerInfo=" + customerInfo +
                ", accountInfo=" + accountInfo +
                ", cardInfo=" + cardInfo +
                ", sonucAck='" + sonucAck + '\'' +
                ", sonucDeger='" + sonucDeger + '\'' +
                ", sonucKod='" + sonucKod + '\'' +
                ", salesAreas=" + salesAreas +
                '}';
    }
}
