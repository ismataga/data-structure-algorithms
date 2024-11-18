
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FindCustomerInformationResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FindCustomerInformationResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="hesap_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="mus_adi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="mus_k_isim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="mus_soyadi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="baba_adi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tuzel_hesap_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tuzel_firma_adi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
@XmlType(name = "FindCustomerInformationResponse", propOrder = {
    "hesapNo",
    "musAdi",
    "musKIsim",
    "musSoyadi",
    "babaAdi",
    "tuzelHesapNo",
    "tuzelFirmaAdi",
    "sonucAck",
    "sonucDeger",
    "sonucKod"
})
public class FindCustomerInformationResponse {

    @XmlElement(name = "hesap_no")
    protected String hesapNo;
    @XmlElement(name = "mus_adi")
    protected String musAdi;
    @XmlElement(name = "mus_k_isim")
    protected String musKIsim;
    @XmlElement(name = "mus_soyadi")
    protected String musSoyadi;
    @XmlElement(name = "baba_adi")
    protected String babaAdi;
    @XmlElement(name = "tuzel_hesap_no")
    protected String tuzelHesapNo;
    @XmlElement(name = "tuzel_firma_adi")
    protected String tuzelFirmaAdi;
    @XmlElement(name = "sonuc_ack")
    protected String sonucAck;
    @XmlElement(name = "sonuc_deger")
    protected String sonucDeger;
    @XmlElement(name = "sonuc_kod")
    protected String sonucKod;

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
     * Gets the value of the tuzelHesapNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuzelHesapNo() {
        return tuzelHesapNo;
    }

    /**
     * Sets the value of the tuzelHesapNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuzelHesapNo(String value) {
        this.tuzelHesapNo = value;
    }

    /**
     * Gets the value of the tuzelFirmaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuzelFirmaAdi() {
        return tuzelFirmaAdi;
    }

    /**
     * Sets the value of the tuzelFirmaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuzelFirmaAdi(String value) {
        this.tuzelFirmaAdi = value;
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

    @Override
    public String toString() {
        return "FindCustomerInformationResponse{" +
                "hesapNo='" + hesapNo + '\'' +
                ", musAdi='" + musAdi + '\'' +
                ", musKIsim='" + musKIsim + '\'' +
                ", musSoyadi='" + musSoyadi + '\'' +
                ", babaAdi='" + babaAdi + '\'' +
                ", tuzelHesapNo='" + tuzelHesapNo + '\'' +
                ", tuzelFirmaAdi='" + tuzelFirmaAdi + '\'' +
                ", sonucAck='" + sonucAck + '\'' +
                ", sonucDeger='" + sonucDeger + '\'' +
                ", sonucKod='" + sonucKod + '\'' +
                '}';
    }
}
