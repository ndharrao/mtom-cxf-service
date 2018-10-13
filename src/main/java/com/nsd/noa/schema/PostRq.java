
package com.nsd.noa.schema;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sender" type="{http://www.nsd.com/noa/schema}Sender"/&gt;
 *         &lt;element name="Receiver" type="{http://www.nsd.com/noa/schema}Receiver"/&gt;
 *         &lt;element name="Application" type="{http://www.nsd.com/noa/schema}Application"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MsgItem" type="{http://www.nsd.com/noa/schema}MsgItem"/&gt;
 *         &lt;element name="SecurityProfileCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkFolder"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MsgFile" type="{http://www.nsd.com/noa/schema}MsgFile"/&gt;
 *                   &lt;element name="AttachmentPackages" type="{http://www.nsd.com/noa/schema}AttachmentPackages"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sender",
    "receiver",
    "application",
    "timeStamp",
    "msgItem",
    "securityProfileCd",
    "workFolder"
})
@XmlRootElement(name = "PostRq")
public class PostRq implements Equals2, HashCode2
{

    @XmlElement(name = "Sender", required = true)
    protected Sender sender;
    @XmlElement(name = "Receiver", required = true)
    protected Receiver receiver;
    @XmlElement(name = "Application", required = true)
    protected Application application;
    @XmlElement(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(name = "MsgItem", required = true)
    protected MsgItem msgItem;
    @XmlElement(name = "SecurityProfileCd", required = true)
    protected String securityProfileCd;
    @XmlElement(name = "WorkFolder", required = true)
    protected WorkFolder workFolder;

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

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the msgItem property.
     * 
     * @return
     *     possible object is
     *     {@link MsgItem }
     *     
     */
    public MsgItem getMsgItem() {
        return msgItem;
    }

    /**
     * Sets the value of the msgItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgItem }
     *     
     */
    public void setMsgItem(MsgItem value) {
        this.msgItem = value;
    }

    /**
     * Gets the value of the securityProfileCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityProfileCd() {
        return securityProfileCd;
    }

    /**
     * Sets the value of the securityProfileCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityProfileCd(String value) {
        this.securityProfileCd = value;
    }

    /**
     * Gets the value of the workFolder property.
     * 
     * @return
     *     possible object is
     *     {@link WorkFolder }
     *     
     */
    public WorkFolder getWorkFolder() {
        return workFolder;
    }

    /**
     * Sets the value of the workFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkFolder }
     *     
     */
    public void setWorkFolder(WorkFolder value) {
        this.workFolder = value;
    }

    public PostRq withSender(Sender value) {
        setSender(value);
        return this;
    }

    public PostRq withReceiver(Receiver value) {
        setReceiver(value);
        return this;
    }

    public PostRq withApplication(Application value) {
        setApplication(value);
        return this;
    }

    public PostRq withTimeStamp(XMLGregorianCalendar value) {
        setTimeStamp(value);
        return this;
    }

    public PostRq withMsgItem(MsgItem value) {
        setMsgItem(value);
        return this;
    }

    public PostRq withSecurityProfileCd(String value) {
        setSecurityProfileCd(value);
        return this;
    }

    public PostRq withWorkFolder(WorkFolder value) {
        setWorkFolder(value);
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
        {
            XMLGregorianCalendar theTimeStamp;
            theTimeStamp = this.getTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeStamp", theTimeStamp), currentHashCode, theTimeStamp, (this.timeStamp!= null));
        }
        {
            MsgItem theMsgItem;
            theMsgItem = this.getMsgItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgItem", theMsgItem), currentHashCode, theMsgItem, (this.msgItem!= null));
        }
        {
            String theSecurityProfileCd;
            theSecurityProfileCd = this.getSecurityProfileCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "securityProfileCd", theSecurityProfileCd), currentHashCode, theSecurityProfileCd, (this.securityProfileCd!= null));
        }
        {
            WorkFolder theWorkFolder;
            theWorkFolder = this.getWorkFolder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workFolder", theWorkFolder), currentHashCode, theWorkFolder, (this.workFolder!= null));
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
        final PostRq that = ((PostRq) object);
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
        {
            XMLGregorianCalendar lhsTimeStamp;
            lhsTimeStamp = this.getTimeStamp();
            XMLGregorianCalendar rhsTimeStamp;
            rhsTimeStamp = that.getTimeStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeStamp", lhsTimeStamp), LocatorUtils.property(thatLocator, "timeStamp", rhsTimeStamp), lhsTimeStamp, rhsTimeStamp, (this.timeStamp!= null), (that.timeStamp!= null))) {
                return false;
            }
        }
        {
            MsgItem lhsMsgItem;
            lhsMsgItem = this.getMsgItem();
            MsgItem rhsMsgItem;
            rhsMsgItem = that.getMsgItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgItem", lhsMsgItem), LocatorUtils.property(thatLocator, "msgItem", rhsMsgItem), lhsMsgItem, rhsMsgItem, (this.msgItem!= null), (that.msgItem!= null))) {
                return false;
            }
        }
        {
            String lhsSecurityProfileCd;
            lhsSecurityProfileCd = this.getSecurityProfileCd();
            String rhsSecurityProfileCd;
            rhsSecurityProfileCd = that.getSecurityProfileCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securityProfileCd", lhsSecurityProfileCd), LocatorUtils.property(thatLocator, "securityProfileCd", rhsSecurityProfileCd), lhsSecurityProfileCd, rhsSecurityProfileCd, (this.securityProfileCd!= null), (that.securityProfileCd!= null))) {
                return false;
            }
        }
        {
            WorkFolder lhsWorkFolder;
            lhsWorkFolder = this.getWorkFolder();
            WorkFolder rhsWorkFolder;
            rhsWorkFolder = that.getWorkFolder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workFolder", lhsWorkFolder), LocatorUtils.property(thatLocator, "workFolder", rhsWorkFolder), lhsWorkFolder, rhsWorkFolder, (this.workFolder!= null), (that.workFolder!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="MsgFile" type="{http://www.nsd.com/noa/schema}MsgFile"/&gt;
     *         &lt;element name="AttachmentPackages" type="{http://www.nsd.com/noa/schema}AttachmentPackages"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "msgFile",
        "attachmentPackages"
    })
    public static class WorkFolder implements Equals2, HashCode2
    {

        @XmlElement(name = "MsgFile", required = true)
        protected MsgFile msgFile;
        @XmlElement(name = "AttachmentPackages", required = true)
        protected AttachmentPackages attachmentPackages;

        /**
         * Gets the value of the msgFile property.
         * 
         * @return
         *     possible object is
         *     {@link MsgFile }
         *     
         */
        public MsgFile getMsgFile() {
            return msgFile;
        }

        /**
         * Sets the value of the msgFile property.
         * 
         * @param value
         *     allowed object is
         *     {@link MsgFile }
         *     
         */
        public void setMsgFile(MsgFile value) {
            this.msgFile = value;
        }

        /**
         * Gets the value of the attachmentPackages property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentPackages }
         *     
         */
        public AttachmentPackages getAttachmentPackages() {
            return attachmentPackages;
        }

        /**
         * Sets the value of the attachmentPackages property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentPackages }
         *     
         */
        public void setAttachmentPackages(AttachmentPackages value) {
            this.attachmentPackages = value;
        }

        public WorkFolder withMsgFile(MsgFile value) {
            setMsgFile(value);
            return this;
        }

        public WorkFolder withAttachmentPackages(AttachmentPackages value) {
            setAttachmentPackages(value);
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
                MsgFile theMsgFile;
                theMsgFile = this.getMsgFile();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgFile", theMsgFile), currentHashCode, theMsgFile, (this.msgFile!= null));
            }
            {
                AttachmentPackages theAttachmentPackages;
                theAttachmentPackages = this.getAttachmentPackages();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachmentPackages", theAttachmentPackages), currentHashCode, theAttachmentPackages, (this.attachmentPackages!= null));
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
            final WorkFolder that = ((WorkFolder) object);
            {
                MsgFile lhsMsgFile;
                lhsMsgFile = this.getMsgFile();
                MsgFile rhsMsgFile;
                rhsMsgFile = that.getMsgFile();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "msgFile", lhsMsgFile), LocatorUtils.property(thatLocator, "msgFile", rhsMsgFile), lhsMsgFile, rhsMsgFile, (this.msgFile!= null), (that.msgFile!= null))) {
                    return false;
                }
            }
            {
                AttachmentPackages lhsAttachmentPackages;
                lhsAttachmentPackages = this.getAttachmentPackages();
                AttachmentPackages rhsAttachmentPackages;
                rhsAttachmentPackages = that.getAttachmentPackages();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "attachmentPackages", lhsAttachmentPackages), LocatorUtils.property(thatLocator, "attachmentPackages", rhsAttachmentPackages), lhsAttachmentPackages, rhsAttachmentPackages, (this.attachmentPackages!= null), (that.attachmentPackages!= null))) {
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

}
