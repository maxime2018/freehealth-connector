//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.05.29 at 05:57:25 PM CEST
//


package org.taktik.icure.cin.saml.oasis.names.tc.saml._2_0.assertion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2001._04.xmlenc_.EncryptedData;
import org.w3._2001._04.xmlenc_.EncryptedKey;


/**
 * <p>Java class for EncryptedElementType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EncryptedElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}EncryptedData"/&gt;
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}EncryptedKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedElementType", propOrder = {
    "encryptedData",
    "encryptedKeies"
})
public class EncryptedElementType implements Serializable
{

    private final static long serialVersionUID = 2L;
    @XmlElement(name = "EncryptedData", namespace = "http://www.w3.org/2001/04/xmlenc#", required = true)
    protected EncryptedData encryptedData;
    @XmlElement(name = "EncryptedKey", namespace = "http://www.w3.org/2001/04/xmlenc#")
    protected List<EncryptedKey> encryptedKeies;

    /**
     * Gets the value of the encryptedData property.
     *
     * @return
     *     possible object is
     *     {@link EncryptedData }
     *
     */
    public EncryptedData getEncryptedData() {
        return encryptedData;
    }

    /**
     * Sets the value of the encryptedData property.
     *
     * @param value
     *     allowed object is
     *     {@link EncryptedData }
     *
     */
    public void setEncryptedData(EncryptedData value) {
        this.encryptedData = value;
    }

    /**
     * Gets the value of the encryptedKeies property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptedKeies property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptedKeies().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptedKey }
     *
     *
     */
    public List<EncryptedKey> getEncryptedKeies() {
        if (encryptedKeies == null) {
            encryptedKeies = new ArrayList<EncryptedKey>();
        }
        return this.encryptedKeies;
    }

}
