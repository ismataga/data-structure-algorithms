
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CustomerDataRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CustomerDataRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="hesap_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="pin_kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dogum_tarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="vkn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kayit_tarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kart_tipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="thirdparty_transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kurum_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="req_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="doviz_kodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sf_customerno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDataRequest", propOrder = {
    "hesapNo",
    "pinKod",
    "dogumTarihi",
    "vkn",
    "kayitTarihi",
    "kartTipi",
    "thirdpartyTransactionId",
    "kurumId",
    "reqDate",
    "dovizKodu",
    "sfCustomerno"
})
public class CustomerDataRequest {

    @XmlElement(name = "hesap_no")
    protected String hesapNo;
    @XmlElement(name = "pin_kod")
    protected String pinKod;
    @XmlElement(name = "dogum_tarihi")
    protected String dogumTarihi;
    protected String vkn;
    @XmlElement(name = "kayit_tarihi")
    protected String kayitTarihi;
    @XmlElement(name = "kart_tipi")
    protected String kartTipi;
    @XmlElement(name = "thirdparty_transaction_id")
    protected String thirdpartyTransactionId;
    @XmlElement(name = "kurum_id")
    protected String kurumId;
    @XmlElement(name = "req_date")
    protected String reqDate;
    @XmlElement(name = "doviz_kodu")
    protected String dovizKodu;
    @XmlElement(name = "sf_customerno")
    protected String sfCustomerno;

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

    /**
     * Gets the value of the pinKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinKod() {
        return pinKod;
    }

    /**
     * Sets the value of the pinKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinKod(String value) {
        this.pinKod = value;
    }

    /**
     * Gets the value of the dogumTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDogumTarihi() {
        return dogumTarihi;
    }

    /**
     * Sets the value of the dogumTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDogumTarihi(String value) {
        this.dogumTarihi = value;
    }

    /**
     * Gets the value of the vkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVkn() {
        return vkn;
    }

    /**
     * Sets the value of the vkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVkn(String value) {
        this.vkn = value;
    }

    /**
     * Gets the value of the kayitTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKayitTarihi() {
        return kayitTarihi;
    }

    /**
     * Sets the value of the kayitTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKayitTarihi(String value) {
        this.kayitTarihi = value;
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
     * Gets the value of the dovizKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDovizKodu() {
        return dovizKodu;
    }

    /**
     * Sets the value of the dovizKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDovizKodu(String value) {
        this.dovizKodu = value;
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

    @Override
    public String toString() {
        return "CustomerDataRequest{" +
                "hesapNo='" + hesapNo + '\'' +
                ", pinKod='" + pinKod + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", vkn='" + vkn + '\'' +
                ", kayitTarihi='" + kayitTarihi + '\'' +
                ", kartTipi='" + kartTipi + '\'' +
                ", thirdpartyTransactionId='" + thirdpartyTransactionId + '\'' +
                ", kurumId='" + kurumId + '\'' +
                ", reqDate='" + reqDate + '\'' +
                ", dovizKodu='" + dovizKodu + '\'' +
                ", sfCustomerno='" + sfCustomerno + '\'' +
                '}';
    }
}
