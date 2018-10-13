
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
 * <p>Java class for PostRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgStatus" type="{http://www.nsd.com/noa/schema}MsgStatus"/&gt;
 *         &lt;element name="Sender" type="{http://www.nsd.com/noa/schema}Sender"/&gt;
 *         &lt;element name="Receiver" type="{http://www.nsd.com/noa/schema}Receiver"/&gt;
 *         &lt;element name="Application" type="{http://www.nsd.com/noa/schema}Application"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostRs", propOrder = {
    "msgStatus",
    "sender",
    "receiver",
    "application"
})
public class PostRs implements Equals2, HashCode2
{

    @XmlElement(name = "MsgStatus", required = true)
    protected MsgStatus msgStatus;
    @XmlElement(name = "Sender", required = true)
    protected Sender sender;
    @XmlElement(name = "Receiver", required = true)
    protected Receiver receiver;
    @XmlElement(name = "Application", required = true)
    protected Application application;

    /**
     * Gets the value of the msgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MsgStatus }
     *     
     */
    public MsgStatus getMsgStatus() {
        return msgStatus;
    }

    /**
     * Sets the value of the msgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgStatus }
     *     
     */
    public void setMsgStatus(MsgStatus value) {
        this.msgStatus = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Receiver }
     *     
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receiver }
     *     
     */
    public void setReceiver(Receiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link Application }
     *     
     */
    public Application getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application }
     *     
     */
    public void setApplication(Application value) {
        this.application = value;
    }

    public PostRs withMsgStatus(MsgStatus value) {
        setMsgStatus(value);
        return this;
    }

    public PostRs withSender(Sender value) {
        setSender(value);
        return this;
    }

    public PostRs withReceiver(Receiver value) {
        setReceiver(value);
        return this;
    }

    public PostRs withApplication(Application value) {
        setApplication(value);
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
            MsgStatus theMsgStatus;
            theMsgStatus = this.getMsgStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgStatus", theMsgStatus), currentHashCode, theMsgStatus, (this.msgStatus!= null));
        }
        {
            Sender theSender;
            theSender = this.getSender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sender", theSender), currentHashCode, theSender, (this.sender!= null));
        }
        {
            Receiver theReceiver;
            theReceiver = this.getReceiver();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receiver", theReceiver), currentHashCode, theReceiver, (this.receiver!= null));
        }
        {
            Application theApplication;
            theApplication = this.getApplication();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "application", theApplication), currentHashCode, theApplication, (this.application!= null));
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
        final PostRs that = ((PostRs) object);
        {
            MsgStatus lhsMsgStatus;
            lhsMsgStatus = this.getMsgStatus();
            MsgStatus rhsMsgStatus;
            rhsMsgStatus = that.getMsgStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgStatus", lhsMsgStatus), LocatorUtils.property(thatLocator, "msgStatus", rhsMsgStatus), lhsMsgStatus, rhsMsgStatus, (this.msgStatus!= null), (that.msgStatus!= null))) {
                return false;
            }
        }
        {
            Sender lhsSender;
            lhsSender = this.getSender();
            Sender rhsSender;
            rhsSender = that.getSender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sender", lhsSender), LocatorUtils.property(thatLocator, "sender", rhsSender), lhsSender, rhsSender, (this.sender!= null), (that.sender!= null))) {
                return false;
            }
        }
        {
            Receiver lhsReceiver;
            lhsReceiver = this.getReceiver();
            Receiver rhsReceiver;
            rhsReceiver = that.getReceiver();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receiver", lhsReceiver), LocatorUtils.property(thatLocator, "receiver", rhsReceiver), lhsReceiver, rhsReceiver, (this.receiver!= null), (that.receiver!= null))) {
                return false;
            }
        }
        {
            Application lhsApplication;
            lhsApplication = this.getApplication();
            Application rhsApplication;
            rhsApplication = that.getApplication();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "application", lhsApplication), LocatorUtils.property(thatLocator, "application", rhsApplication), lhsApplication, rhsApplication, (this.application!= null), (that.application!= null))) {
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
