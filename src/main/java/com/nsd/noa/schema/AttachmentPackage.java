
package com.nsd.noa.schema;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for AttachmentPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentPackage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Owner" type="{http://www.nsd.com/noa/schema}Owner"/&gt;
 *         &lt;element name="CommunicationChannelCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="FileFormatCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Attachments" type="{http://www.nsd.com/noa/schema}Attachments"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentPackage", propOrder = {
    "owner",
    "communicationChannelCd",
    "fileId",
    "fileFormatCd",
    "attachments"
})
public class AttachmentPackage implements Equals2, HashCode2
{

    @XmlElement(name = "Owner", required = true)
    protected Owner owner;
    @XmlElement(name = "CommunicationChannelCd", required = true)
    protected String communicationChannelCd;
    @XmlElement(name = "FileId", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler fileId;
    @XmlElement(name = "FileFormatCd", required = true)
    protected String fileFormatCd;
    @XmlElement(name = "Attachments", required = true)
    protected Attachments attachments;

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Owner }
     *     
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Owner }
     *     
     */
    public void setOwner(Owner value) {
        this.owner = value;
    }

    /**
     * Gets the value of the communicationChannelCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationChannelCd() {
        return communicationChannelCd;
    }

    /**
     * Sets the value of the communicationChannelCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationChannelCd(String value) {
        this.communicationChannelCd = value;
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFileId(DataHandler value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the fileFormatCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileFormatCd() {
        return fileFormatCd;
    }

    /**
     * Sets the value of the fileFormatCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileFormatCd(String value) {
        this.fileFormatCd = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

    public AttachmentPackage withOwner(Owner value) {
        setOwner(value);
        return this;
    }

    public AttachmentPackage withCommunicationChannelCd(String value) {
        setCommunicationChannelCd(value);
        return this;
    }

    public AttachmentPackage withFileId(DataHandler value) {
        setFileId(value);
        return this;
    }

    public AttachmentPackage withFileFormatCd(String value) {
        setFileFormatCd(value);
        return this;
    }

    public AttachmentPackage withAttachments(Attachments value) {
        setAttachments(value);
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
            Owner theOwner;
            theOwner = this.getOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owner", theOwner), currentHashCode, theOwner, (this.owner!= null));
        }
        {
            String theCommunicationChannelCd;
            theCommunicationChannelCd = this.getCommunicationChannelCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "communicationChannelCd", theCommunicationChannelCd), currentHashCode, theCommunicationChannelCd, (this.communicationChannelCd!= null));
        }
        {
            DataHandler theFileId;
            theFileId = this.getFileId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileId", theFileId), currentHashCode, theFileId, (this.fileId!= null));
        }
        {
            String theFileFormatCd;
            theFileFormatCd = this.getFileFormatCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileFormatCd", theFileFormatCd), currentHashCode, theFileFormatCd, (this.fileFormatCd!= null));
        }
        {
            Attachments theAttachments;
            theAttachments = this.getAttachments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachments", theAttachments), currentHashCode, theAttachments, (this.attachments!= null));
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
        final AttachmentPackage that = ((AttachmentPackage) object);
        {
            Owner lhsOwner;
            lhsOwner = this.getOwner();
            Owner rhsOwner;
            rhsOwner = that.getOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owner", lhsOwner), LocatorUtils.property(thatLocator, "owner", rhsOwner), lhsOwner, rhsOwner, (this.owner!= null), (that.owner!= null))) {
                return false;
            }
        }
        {
            String lhsCommunicationChannelCd;
            lhsCommunicationChannelCd = this.getCommunicationChannelCd();
            String rhsCommunicationChannelCd;
            rhsCommunicationChannelCd = that.getCommunicationChannelCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "communicationChannelCd", lhsCommunicationChannelCd), LocatorUtils.property(thatLocator, "communicationChannelCd", rhsCommunicationChannelCd), lhsCommunicationChannelCd, rhsCommunicationChannelCd, (this.communicationChannelCd!= null), (that.communicationChannelCd!= null))) {
                return false;
            }
        }
        {
            DataHandler lhsFileId;
            lhsFileId = this.getFileId();
            DataHandler rhsFileId;
            rhsFileId = that.getFileId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileId", lhsFileId), LocatorUtils.property(thatLocator, "fileId", rhsFileId), lhsFileId, rhsFileId, (this.fileId!= null), (that.fileId!= null))) {
                return false;
            }
        }
        {
            String lhsFileFormatCd;
            lhsFileFormatCd = this.getFileFormatCd();
            String rhsFileFormatCd;
            rhsFileFormatCd = that.getFileFormatCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileFormatCd", lhsFileFormatCd), LocatorUtils.property(thatLocator, "fileFormatCd", rhsFileFormatCd), lhsFileFormatCd, rhsFileFormatCd, (this.fileFormatCd!= null), (that.fileFormatCd!= null))) {
                return false;
            }
        }
        {
            Attachments lhsAttachments;
            lhsAttachments = this.getAttachments();
            Attachments rhsAttachments;
            rhsAttachments = that.getAttachments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachments", lhsAttachments), LocatorUtils.property(thatLocator, "attachments", rhsAttachments), lhsAttachments, rhsAttachments, (this.attachments!= null), (that.attachments!= null))) {
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
