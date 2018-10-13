
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
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentReference" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DocumentVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FileSize" type="{http://www.nsd.com/noa/schema}FileSize"/&gt;
 *         &lt;element name="DocumentTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "documentReference",
    "documentVersion",
    "fileId",
    "fileSize",
    "documentTypeCd",
    "description"
})
public class Document implements Equals2, HashCode2
{

    @XmlElement(name = "DocumentReference")
    protected int documentReference;
    @XmlElement(name = "DocumentVersion", required = true)
    protected String documentVersion;
    @XmlElement(name = "FileId", required = true)
    protected String fileId;
    @XmlElement(name = "FileSize", required = true)
    protected FileSize fileSize;
    @XmlElement(name = "DocumentTypeCd", required = true)
    protected String documentTypeCd;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Gets the value of the documentReference property.
     * 
     */
    public int getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     */
    public void setDocumentReference(int value) {
        this.documentReference = value;
    }

    /**
     * Gets the value of the documentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * Sets the value of the documentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentVersion(String value) {
        this.documentVersion = value;
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileId(String value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link FileSize }
     *     
     */
    public FileSize getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSize }
     *     
     */
    public void setFileSize(FileSize value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the documentTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeCd() {
        return documentTypeCd;
    }

    /**
     * Sets the value of the documentTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeCd(String value) {
        this.documentTypeCd = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public Document withDocumentReference(int value) {
        setDocumentReference(value);
        return this;
    }

    public Document withDocumentVersion(String value) {
        setDocumentVersion(value);
        return this;
    }

    public Document withFileId(String value) {
        setFileId(value);
        return this;
    }

    public Document withFileSize(FileSize value) {
        setFileSize(value);
        return this;
    }

    public Document withDocumentTypeCd(String value) {
        setDocumentTypeCd(value);
        return this;
    }

    public Document withDescription(String value) {
        setDescription(value);
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
            int theDocumentReference;
            theDocumentReference = this.getDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, true);
        }
        {
            String theDocumentVersion;
            theDocumentVersion = this.getDocumentVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentVersion", theDocumentVersion), currentHashCode, theDocumentVersion, (this.documentVersion!= null));
        }
        {
            String theFileId;
            theFileId = this.getFileId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileId", theFileId), currentHashCode, theFileId, (this.fileId!= null));
        }
        {
            FileSize theFileSize;
            theFileSize = this.getFileSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileSize", theFileSize), currentHashCode, theFileSize, (this.fileSize!= null));
        }
        {
            String theDocumentTypeCd;
            theDocumentTypeCd = this.getDocumentTypeCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentTypeCd", theDocumentTypeCd), currentHashCode, theDocumentTypeCd, (this.documentTypeCd!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
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
        final Document that = ((Document) object);
        {
            int lhsDocumentReference;
            lhsDocumentReference = this.getDocumentReference();
            int rhsDocumentReference;
            rhsDocumentReference = that.getDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentReference", lhsDocumentReference), LocatorUtils.property(thatLocator, "documentReference", rhsDocumentReference), lhsDocumentReference, rhsDocumentReference, true, true)) {
                return false;
            }
        }
        {
            String lhsDocumentVersion;
            lhsDocumentVersion = this.getDocumentVersion();
            String rhsDocumentVersion;
            rhsDocumentVersion = that.getDocumentVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentVersion", lhsDocumentVersion), LocatorUtils.property(thatLocator, "documentVersion", rhsDocumentVersion), lhsDocumentVersion, rhsDocumentVersion, (this.documentVersion!= null), (that.documentVersion!= null))) {
                return false;
            }
        }
        {
            String lhsFileId;
            lhsFileId = this.getFileId();
            String rhsFileId;
            rhsFileId = that.getFileId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileId", lhsFileId), LocatorUtils.property(thatLocator, "fileId", rhsFileId), lhsFileId, rhsFileId, (this.fileId!= null), (that.fileId!= null))) {
                return false;
            }
        }
        {
            FileSize lhsFileSize;
            lhsFileSize = this.getFileSize();
            FileSize rhsFileSize;
            rhsFileSize = that.getFileSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileSize", lhsFileSize), LocatorUtils.property(thatLocator, "fileSize", rhsFileSize), lhsFileSize, rhsFileSize, (this.fileSize!= null), (that.fileSize!= null))) {
                return false;
            }
        }
        {
            String lhsDocumentTypeCd;
            lhsDocumentTypeCd = this.getDocumentTypeCd();
            String rhsDocumentTypeCd;
            rhsDocumentTypeCd = that.getDocumentTypeCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentTypeCd", lhsDocumentTypeCd), LocatorUtils.property(thatLocator, "documentTypeCd", rhsDocumentTypeCd), lhsDocumentTypeCd, rhsDocumentTypeCd, (this.documentTypeCd!= null), (that.documentTypeCd!= null))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
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
