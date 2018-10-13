
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
 * <p>Java class for MsgStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgStatusCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MsgStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgStatus", propOrder = {
    "msgStatusCd",
    "msgStatusDescription"
})
public class MsgStatus implements Equals2, HashCode2
{

    @XmlElement(name = "MsgStatusCd", required = true)
    protected String msgStatusCd;
    @XmlElement(name = "MsgStatusDescription", required = true)
    protected String msgStatusDescription;

    /**
     * Gets the value of the msgStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgStatusCd() {
        return msgStatusCd;
    }

    /**
     * Sets the value of the msgStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgStatusCd(String value) {
        this.msgStatusCd = value;
    }

    /**
     * Gets the value of the msgStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgStatusDescription() {
        return msgStatusDescription;
    }

    /**
     * Sets the value of the msgStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgStatusDescription(String value) {
        this.msgStatusDescription = value;
    }

    public MsgStatus withMsgStatusCd(String value) {
        setMsgStatusCd(value);
        return this;
    }

    public MsgStatus withMsgStatusDescription(String value) {
        setMsgStatusDescription(value);
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
            String theMsgStatusCd;
            theMsgStatusCd = this.getMsgStatusCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgStatusCd", theMsgStatusCd), currentHashCode, theMsgStatusCd, (this.msgStatusCd!= null));
        }
        {
            String theMsgStatusDescription;
            theMsgStatusDescription = this.getMsgStatusDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgStatusDescription", theMsgStatusDescription), currentHashCode, theMsgStatusDescription, (this.msgStatusDescription!= null));
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
        final MsgStatus that = ((MsgStatus) object);
        {
            String lhsMsgStatusCd;
            lhsMsgStatusCd = this.getMsgStatusCd();
            String rhsMsgStatusCd;
            rhsMsgStatusCd = that.getMsgStatusCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgStatusCd", lhsMsgStatusCd), LocatorUtils.property(thatLocator, "msgStatusCd", rhsMsgStatusCd), lhsMsgStatusCd, rhsMsgStatusCd, (this.msgStatusCd!= null), (that.msgStatusCd!= null))) {
                return false;
            }
        }
        {
            String lhsMsgStatusDescription;
            lhsMsgStatusDescription = this.getMsgStatusDescription();
            String rhsMsgStatusDescription;
            rhsMsgStatusDescription = that.getMsgStatusDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgStatusDescription", lhsMsgStatusDescription), LocatorUtils.property(thatLocator, "msgStatusDescription", rhsMsgStatusDescription), lhsMsgStatusDescription, rhsMsgStatusDescription, (this.msgStatusDescription!= null), (that.msgStatusDescription!= null))) {
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
