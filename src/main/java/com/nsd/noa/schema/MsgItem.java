
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
 * <p>Java class for MsgItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MsgTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgItem", propOrder = {
    "msgId",
    "msgTypeCd"
})
public class MsgItem implements Equals2, HashCode2
{

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "MsgTypeCd", required = true)
    protected String msgTypeCd;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the msgTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgTypeCd() {
        return msgTypeCd;
    }

    /**
     * Sets the value of the msgTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgTypeCd(String value) {
        this.msgTypeCd = value;
    }

    public MsgItem withMsgId(String value) {
        setMsgId(value);
        return this;
    }

    public MsgItem withMsgTypeCd(String value) {
        setMsgTypeCd(value);
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
            String theMsgId;
            theMsgId = this.getMsgId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgId", theMsgId), currentHashCode, theMsgId, (this.msgId!= null));
        }
        {
            String theMsgTypeCd;
            theMsgTypeCd = this.getMsgTypeCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgTypeCd", theMsgTypeCd), currentHashCode, theMsgTypeCd, (this.msgTypeCd!= null));
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
        final MsgItem that = ((MsgItem) object);
        {
            String lhsMsgId;
            lhsMsgId = this.getMsgId();
            String rhsMsgId;
            rhsMsgId = that.getMsgId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgId", lhsMsgId), LocatorUtils.property(thatLocator, "msgId", rhsMsgId), lhsMsgId, rhsMsgId, (this.msgId!= null), (that.msgId!= null))) {
                return false;
            }
        }
        {
            String lhsMsgTypeCd;
            lhsMsgTypeCd = this.getMsgTypeCd();
            String rhsMsgTypeCd;
            rhsMsgTypeCd = that.getMsgTypeCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgTypeCd", lhsMsgTypeCd), LocatorUtils.property(thatLocator, "msgTypeCd", rhsMsgTypeCd), lhsMsgTypeCd, rhsMsgTypeCd, (this.msgTypeCd!= null), (that.msgTypeCd!= null))) {
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
