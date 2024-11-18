
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TransactionResultResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TransactionResultResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="mus_adi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="mus_k_isim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="mus_soyadi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="baba_adi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="account_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ek_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sube_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="balans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="encrypted_card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fortuna_transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kurum_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="thirdparty_transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="islem_referansi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="islem_saati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="accounting_Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_ack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_deger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionResultResponse", propOrder = {
    "musAdi",
    "musKIsim",
    "musSoyadi",
    "babaAdi",
    "accountNo",
    "ekNo",
    "subeNo",
    "balans",
    "cardNo",
    "encryptedCardNo",
    "fortunaTransactionId",
    "kurumId",
    "thirdpartyTransactionId",
    "islemReferansi",
    "islemSaati",
    "accountingReference",
    "sonucAck",
    "sonucDeger",
    "sonucKod"
})
public class TransactionResultResponse {

    @XmlElement(name = "mus_adi")
    protected String musAdi;
    @XmlElement(name = "mus_k_isim")
    protected String musKIsim;
    @XmlElement(name = "mus_soyadi")
    protected String musSoyadi;
    @XmlElement(name = "baba_adi")
    protected String babaAdi;
    @XmlElement(name = "account_no")
    protected String accountNo;
    @XmlElement(name = "ek_no")
    protected String ekNo;
    @XmlElement(name = "sube_no")
    protected String subeNo;
    protected String balans;
    @XmlElement(name = "card_no")
    protected String cardNo;
    @XmlElement(name = "encrypted_card_no")
    protected String encryptedCardNo;
    @XmlElement(name = "fortuna_transaction_id")
    protected String fortunaTransactionId;
    @XmlElement(name = "kurum_id")
    protected String kurumId;
    @XmlElement(name = "thirdparty_transaction_id")
    protected String thirdpartyTransactionId;
    @XmlElement(name = "islem_referansi")
    protected String islemReferansi;
    @XmlElement(name = "islem_saati")
    protected String islemSaati;
    @XmlElement(name = "accounting_Reference")
    protected String accountingReference;
    @XmlElement(name = "sonuc_ack")
    protected String sonucAck;
    @XmlElement(name = "sonuc_deger")
    protected String sonucDeger;
    @XmlElement(name = "sonuc_kod")
    protected String sonucKod;

    /**
     * Gets the value of the musAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusAdi() {
        return musAdi;
    }

    /**
     * Sets the value of the musAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusAdi(String value) {
        this.musAdi = value;
    }

    /**
     * Gets the value of the musKIsim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusKIsim() {
        return musKIsim;
    }

    /**
     * Sets the value of the musKIsim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusKIsim(String value) {
        this.musKIsim = value;
    }

    /**
     * Gets the value of the musSoyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusSoyadi() {
        return musSoyadi;
    }

    /**
     * Sets the value of the musSoyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusSoyadi(String value) {
        this.musSoyadi = value;
    }

    /**
     * Gets the value of the babaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBabaAdi() {
        return babaAdi;
    }

    /**
     * Sets the value of the babaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBabaAdi(String value) {
        this.babaAdi = value;
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
     * Gets the value of the balans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalans() {
        return balans;
    }

    /**
     * Sets the value of the balans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalans(String value) {
        this.balans = value;
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
     * Gets the value of the islemReferansi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslemReferansi() {
        return islemReferansi;
    }

    /**
     * Sets the value of the islemReferansi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslemReferansi(String value) {
        this.islemReferansi = value;
    }

    /**
     * Gets the value of the islemSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslemSaati() {
        return islemSaati;
    }

    /**
     * Sets the value of the islemSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslemSaati(String value) {
        this.islemSaati = value;
    }

    /**
     * Gets the value of the accountingReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingReference() {
        return accountingReference;
    }

    /**
     * Sets the value of the accountingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingReference(String value) {
        this.accountingReference = value;
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

}
