
package org.mastercode.datastructurealgoritms.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FindAccountInformationResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FindAccountInformationResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="acil_tar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="blk_tutar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ek_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="h_turu_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="hesap_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="hesap_turu_adi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="kul_bakiye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sube_kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="doviz_kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindAccountInformationResponse", propOrder = {
    "acilTar",
    "blkTutar",
    "ekNo",
    "hTuruNo",
    "hesapNo",
    "hesapTuruAdi",
    "kulBakiye",
    "subeKod",
    "dovizKod"
})
public class FindAccountInformationResponse {

    @XmlElement(name = "acil_tar")
    protected String acilTar;
    @XmlElement(name = "blk_tutar")
    protected String blkTutar;
    @XmlElement(name = "ek_no")
    protected String ekNo;
    @XmlElement(name = "h_turu_no")
    protected String hTuruNo;
    @XmlElement(name = "hesap_no")
    protected String hesapNo;
    @XmlElement(name = "hesap_turu_adi")
    protected String hesapTuruAdi;
    @XmlElement(name = "kul_bakiye")
    protected String kulBakiye;
    @XmlElement(name = "sube_kod")
    protected String subeKod;
    @XmlElement(name = "doviz_kod")
    protected String dovizKod;

    /**
     * Gets the value of the acilTar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcilTar() {
        return acilTar;
    }

    /**
     * Sets the value of the acilTar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcilTar(String value) {
        this.acilTar = value;
    }

    /**
     * Gets the value of the blkTutar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlkTutar() {
        return blkTutar;
    }

    /**
     * Sets the value of the blkTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlkTutar(String value) {
        this.blkTutar = value;
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
     * Gets the value of the hTuruNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTuruNo() {
        return hTuruNo;
    }

    /**
     * Sets the value of the hTuruNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTuruNo(String value) {
        this.hTuruNo = value;
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

    /**
     * Gets the value of the hesapTuruAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHesapTuruAdi() {
        return hesapTuruAdi;
    }

    /**
     * Sets the value of the hesapTuruAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHesapTuruAdi(String value) {
        this.hesapTuruAdi = value;
    }

    /**
     * Gets the value of the kulBakiye property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKulBakiye() {
        return kulBakiye;
    }

    /**
     * Sets the value of the kulBakiye property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKulBakiye(String value) {
        this.kulBakiye = value;
    }

    /**
     * Gets the value of the subeKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubeKod() {
        return subeKod;
    }

    /**
     * Sets the value of the subeKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubeKod(String value) {
        this.subeKod = value;
    }

    /**
     * Gets the value of the dovizKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDovizKod() {
        return dovizKod;
    }

    /**
     * Sets the value of the dovizKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDovizKod(String value) {
        this.dovizKod = value;
    }

}
