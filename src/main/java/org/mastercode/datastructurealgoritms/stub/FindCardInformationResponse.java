
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FindCardInformationResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FindCardInformationResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="kart_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="encrypted_kart_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kart_tipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kart_statu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kart_alt_statu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kart_hesap_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kart_ek_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kart_sube_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="doviz_kodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kart_hesap_kull_bakiye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_ack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_deger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonuc_kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="min_borc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="borc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCardInformationResponse", propOrder = {
    "kartNo",
    "encryptedKartNo",
    "kartTipi",
    "kartStatu",
    "kartAltStatu",
    "kartHesapNo",
    "kartEkNo",
    "kartSubeNo",
    "dovizKodu",
    "kartHesapKullBakiye",
    "sonucAck",
    "sonucDeger",
    "sonucKod",
    "minBorc",
    "borc"
})
public class FindCardInformationResponse {

    @XmlElement(name = "kart_no")
    protected String kartNo;
    @XmlElement(name = "encrypted_kart_no")
    protected String encryptedKartNo;
    @XmlElement(name = "kart_tipi")
    protected String kartTipi;
    @XmlElement(name = "kart_statu")
    protected String kartStatu;
    @XmlElement(name = "kart_alt_statu")
    protected String kartAltStatu;
    @XmlElement(name = "kart_hesap_no")
    protected String kartHesapNo;
    @XmlElement(name = "kart_ek_no")
    protected String kartEkNo;
    @XmlElement(name = "kart_sube_no")
    protected String kartSubeNo;
    @XmlElement(name = "doviz_kodu")
    protected String dovizKodu;
    @XmlElement(name = "kart_hesap_kull_bakiye")
    protected String kartHesapKullBakiye;
    @XmlElement(name = "sonuc_ack")
    protected String sonucAck;
    @XmlElement(name = "sonuc_deger")
    protected String sonucDeger;
    @XmlElement(name = "sonuc_kod")
    protected String sonucKod;
    @XmlElement(name = "min_borc")
    protected String minBorc;
    protected String borc;

    /**
     * Gets the value of the kartNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartNo() {
        return kartNo;
    }

    /**
     * Sets the value of the kartNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartNo(String value) {
        this.kartNo = value;
    }

    /**
     * Gets the value of the encryptedKartNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedKartNo() {
        return encryptedKartNo;
    }

    /**
     * Sets the value of the encryptedKartNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedKartNo(String value) {
        this.encryptedKartNo = value;
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
     * Gets the value of the kartStatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartStatu() {
        return kartStatu;
    }

    /**
     * Sets the value of the kartStatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartStatu(String value) {
        this.kartStatu = value;
    }

    /**
     * Gets the value of the kartAltStatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartAltStatu() {
        return kartAltStatu;
    }

    /**
     * Sets the value of the kartAltStatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartAltStatu(String value) {
        this.kartAltStatu = value;
    }

    /**
     * Gets the value of the kartHesapNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartHesapNo() {
        return kartHesapNo;
    }

    /**
     * Sets the value of the kartHesapNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartHesapNo(String value) {
        this.kartHesapNo = value;
    }

    /**
     * Gets the value of the kartEkNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartEkNo() {
        return kartEkNo;
    }

    /**
     * Sets the value of the kartEkNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartEkNo(String value) {
        this.kartEkNo = value;
    }

    /**
     * Gets the value of the kartSubeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartSubeNo() {
        return kartSubeNo;
    }

    /**
     * Sets the value of the kartSubeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartSubeNo(String value) {
        this.kartSubeNo = value;
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
     * Gets the value of the kartHesapKullBakiye property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartHesapKullBakiye() {
        return kartHesapKullBakiye;
    }

    /**
     * Sets the value of the kartHesapKullBakiye property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartHesapKullBakiye(String value) {
        this.kartHesapKullBakiye = value;
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
     * Gets the value of the minBorc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinBorc() {
        return minBorc;
    }

    /**
     * Sets the value of the minBorc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinBorc(String value) {
        this.minBorc = value;
    }

    /**
     * Gets the value of the borc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorc() {
        return borc;
    }

    /**
     * Sets the value of the borc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorc(String value) {
        this.borc = value;
    }

}
