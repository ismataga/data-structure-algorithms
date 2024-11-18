
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MakeDepositResponsee complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MakeDepositResponsee"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="balans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="islem_referansi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="islem_saati" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="islem_sube" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="islem_tarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fortuna_transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="thirdparty_transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="referans_kodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_ack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_deger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ad_soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="hesap_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MakeDepositResponsee", propOrder = {
    "balans",
    "islemReferansi",
    "islemSaati",
    "islemSube",
    "islemTarihi",
    "fortunaTransactionId",
    "amount",
    "thirdpartyTransactionId",
    "referansKodu",
    "sonucAck",
    "sonucDeger",
    "sonucKod",
    "adSoyad",
    "hesapNo"
})
public class MakeDepositResponsee {

    protected String balans;
    @XmlElement(name = "islem_referansi")
    protected String islemReferansi;
    @XmlElement(name = "islem_saati")
    protected String islemSaati;
    @XmlElement(name = "islem_sube")
    protected String islemSube;
    @XmlElement(name = "islem_tarihi")
    protected String islemTarihi;
    @XmlElement(name = "fortuna_transaction_id")
    protected String fortunaTransactionId;
    protected String amount;
    @XmlElement(name = "thirdparty_transaction_id")
    protected String thirdpartyTransactionId;
    @XmlElement(name = "referans_kodu")
    protected String referansKodu;
    @XmlElement(name = "sonuc_ack")
    protected String sonucAck;
    @XmlElement(name = "sonuc_deger")
    protected String sonucDeger;
    @XmlElement(name = "sonuc_kod")
    protected String sonucKod;
    @XmlElement(name = "ad_soyad")
    protected String adSoyad;
    @XmlElement(name = "hesap_no")
    protected String hesapNo;

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
     * Gets the value of the islemSube property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslemSube() {
        return islemSube;
    }

    /**
     * Sets the value of the islemSube property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslemSube(String value) {
        this.islemSube = value;
    }

    /**
     * Gets the value of the islemTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslemTarihi() {
        return islemTarihi;
    }

    /**
     * Sets the value of the islemTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslemTarihi(String value) {
        this.islemTarihi = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
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
     * Gets the value of the referansKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferansKodu() {
        return referansKodu;
    }

    /**
     * Sets the value of the referansKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferansKodu(String value) {
        this.referansKodu = value;
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
     * Gets the value of the adSoyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdSoyad() {
        return adSoyad;
    }

    /**
     * Sets the value of the adSoyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdSoyad(String value) {
        this.adSoyad = value;
    }

    /**
     * Gets the value of the hesapNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * Sets the value of the hesapNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHesapNo(String value) {
        this.hesapNo = value;
    }

}
