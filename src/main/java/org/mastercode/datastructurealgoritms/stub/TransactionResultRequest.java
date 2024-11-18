
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TransactionResultRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TransactionResultRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="fortuna_transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="account_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ek_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sube_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="encrypted_card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kart_tipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kurum_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="thirdparty_transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="req_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionResultRequest", propOrder = {
    "fortunaTransactionId",
    "accountNo",
    "ekNo",
    "subeNo",
    "cardNo",
    "encryptedCardNo",
    "kartTipi",
    "kurumId",
    "thirdpartyTransactionId",
    "reqDate"
})
public class TransactionResultRequest {

    @XmlElement(name = "fortuna_transaction_id")
    protected String fortunaTransactionId;
    @XmlElement(name = "account_no")
    protected String accountNo;
    @XmlElement(name = "ek_no")
    protected String ekNo;
    @XmlElement(name = "sube_no")
    protected String subeNo;
    @XmlElement(name = "card_no")
    protected String cardNo;
    @XmlElement(name = "encrypted_card_no")
    protected String encryptedCardNo;
    @XmlElement(name = "kart_tipi")
    protected String kartTipi;
    @XmlElement(name = "kurum_id")
    protected String kurumId;
    @XmlElement(name = "thirdparty_transaction_id")
    protected String thirdpartyTransactionId;
    @XmlElement(name = "req_date")
    protected String reqDate;

    /**
     * Gets the value of the fortunaTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFortunaTransactionId() {
        return fortunaTransactionId;
    }

    /**
     * Sets the value of the fortunaTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFortunaTransactionId(String value) {
        this.fortunaTransactionId = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the ekNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEkNo() {
        return ekNo;
    }

    /**
     * Sets the value of the ekNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEkNo(String value) {
        this.ekNo = value;
    }

    /**
     * Gets the value of the subeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubeNo() {
        return subeNo;
    }

    /**
     * Sets the value of the subeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubeNo(String value) {
        this.subeNo = value;
    }

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the encryptedCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedCardNo() {
        return encryptedCardNo;
    }

    /**
     * Sets the value of the encryptedCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedCardNo(String value) {
        this.encryptedCardNo = value;
    }

    /**
     * Gets the value of the kartTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartTipi() {
        return kartTipi;
    }

    /**
     * Sets the value of the kartTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartTipi(String value) {
        this.kartTipi = value;
    }

    /**
     * Gets the value of the kurumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumId() {
        return kurumId;
    }

    /**
     * Sets the value of the kurumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumId(String value) {
        this.kurumId = value;
    }

    /**
     * Gets the value of the thirdpartyTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdpartyTransactionId() {
        return thirdpartyTransactionId;
    }

    /**
     * Sets the value of the thirdpartyTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdpartyTransactionId(String value) {
        this.thirdpartyTransactionId = value;
    }

    /**
     * Gets the value of the reqDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqDate() {
        return reqDate;
    }

    /**
     * Sets the value of the reqDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqDate(String value) {
        this.reqDate = value;
    }

}
