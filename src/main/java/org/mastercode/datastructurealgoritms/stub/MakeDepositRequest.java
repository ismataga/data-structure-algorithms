
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MakeDepositRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MakeDepositRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="account_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ek_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sube_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="encrypted_card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="local_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="local_currencycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="merchantno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="req_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="req_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="req_source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="transact_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="thirdparty_transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kurum_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sf_customerno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sales_area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MakeDepositRequest", propOrder = {
    "accountNo",
    "ekNo",
    "subeNo",
    "cardNo",
    "encryptedCardNo",
    "currencyCode",
    "localAmount",
    "localCurrencycode",
    "merchantno",
    "reqDate",
    "reqType",
    "reqSource",
    "rrn",
    "transactCode",
    "thirdpartyTransactionId",
    "kurumId",
    "explanation",
    "sfCustomerno",
    "salesArea"
})
public class MakeDepositRequest {

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
    @XmlElement(name = "currency_code")
    protected String currencyCode;
    @XmlElement(name = "local_amount")
    protected String localAmount;
    @XmlElement(name = "local_currencycode")
    protected String localCurrencycode;
    protected String merchantno;
    @XmlElement(name = "req_date")
    protected String reqDate;
    @XmlElement(name = "req_type")
    protected String reqType;
    @XmlElement(name = "req_source")
    protected String reqSource;
    protected String rrn;
    @XmlElement(name = "transact_code")
    protected String transactCode;
    @XmlElement(name = "thirdparty_transaction_id")
    protected String thirdpartyTransactionId;
    @XmlElement(name = "kurum_id")
    protected String kurumId;
    protected String explanation;
    @XmlElement(name = "sf_customerno")
    protected String sfCustomerno;
    @XmlElement(name = "sales_area")
    protected String salesArea;

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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the localAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAmount() {
        return localAmount;
    }

    /**
     * Sets the value of the localAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAmount(String value) {
        this.localAmount = value;
    }

    /**
     * Gets the value of the localCurrencycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCurrencycode() {
        return localCurrencycode;
    }

    /**
     * Sets the value of the localCurrencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCurrencycode(String value) {
        this.localCurrencycode = value;
    }

    /**
     * Gets the value of the merchantno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantno() {
        return merchantno;
    }

    /**
     * Sets the value of the merchantno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantno(String value) {
        this.merchantno = value;
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

    /**
     * Gets the value of the reqType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqType() {
        return reqType;
    }

    /**
     * Sets the value of the reqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqType(String value) {
        this.reqType = value;
    }

    /**
     * Gets the value of the reqSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqSource() {
        return reqSource;
    }

    /**
     * Sets the value of the reqSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqSource(String value) {
        this.reqSource = value;
    }

    /**
     * Gets the value of the rrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrn() {
        return rrn;
    }

    /**
     * Sets the value of the rrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrn(String value) {
        this.rrn = value;
    }

    /**
     * Gets the value of the transactCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactCode() {
        return transactCode;
    }

    /**
     * Sets the value of the transactCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactCode(String value) {
        this.transactCode = value;
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
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the sfCustomerno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfCustomerno() {
        return sfCustomerno;
    }

    /**
     * Sets the value of the sfCustomerno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfCustomerno(String value) {
        this.sfCustomerno = value;
    }

    /**
     * Gets the value of the salesArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesArea() {
        return salesArea;
    }

    /**
     * Sets the value of the salesArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesArea(String value) {
        this.salesArea = value;
    }

}
