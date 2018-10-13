
package com.nsd.noa.schema;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sender complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sender"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PartyRoleCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sender", propOrder = {
    "partyId",
    "partyRoleCd",
    "partyName"
})
public class Sender implements Equals2, HashCode2
{

    @XmlElement(name = "PartyId", required = true)
    protected String partyId;
    @XmlElement(name = "PartyRoleCd", required = true)
    protected String partyRoleCd;
    @XmlElement(name = "PartyName", required = true)
    protected String partyName;

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the partyRoleCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleCd() {
        return partyRoleCd;
    }

    /**
     * Sets the value of the partyRoleCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleCd(String value) {
        this.partyRoleCd = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    public Sender withPartyId(String value) {
        setPartyId(value);
        return this;
    }

    public Sender withPartyRoleCd(String value) {
        setPartyRoleCd(value);
        return this;
    }

    public Sender withPartyName(String value) {
        setPartyName(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String thePartyId;
            thePartyId = this.getPartyId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyId", thePartyId), currentHashCode, thePartyId, (this.partyId!= null));
        }
        {
            String thePartyRoleCd;
            thePartyRoleCd = this.getPartyRoleCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyRoleCd", thePartyRoleCd), currentHashCode, thePartyRoleCd, (this.partyRoleCd!= null));
        }
        {
            String thePartyName;
            thePartyName = this.getPartyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyName", thePartyName), currentHashCode, thePartyName, (this.partyName!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Sender that = ((Sender) object);
        {
            String lhsPartyId;
            lhsPartyId = this.getPartyId();
            String rhsPartyId;
            rhsPartyId = that.getPartyId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyId", lhsPartyId), LocatorUtils.property(thatLocator, "partyId", rhsPartyId), lhsPartyId, rhsPartyId, (this.partyId!= null), (that.partyId!= null))) {
                return false;
            }
        }
        {
            String lhsPartyRoleCd;
            lhsPartyRoleCd = this.getPartyRoleCd();
            String rhsPartyRoleCd;
            rhsPartyRoleCd = that.getPartyRoleCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyRoleCd", lhsPartyRoleCd), LocatorUtils.property(thatLocator, "partyRoleCd", rhsPartyRoleCd), lhsPartyRoleCd, rhsPartyRoleCd, (this.partyRoleCd!= null), (that.partyRoleCd!= null))) {
                return false;
            }
        }
        {
            String lhsPartyName;
            lhsPartyName = this.getPartyName();
            String rhsPartyName;
            rhsPartyName = that.getPartyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyName", lhsPartyName), LocatorUtils.property(thatLocator, "partyName", rhsPartyName), lhsPartyName, rhsPartyName, (this.partyName!= null), (that.partyName!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
