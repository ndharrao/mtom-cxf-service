
package com.nsd.noa.schema;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MsgFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="FileFormatCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgFile", propOrder = {
    "fileId",
    "fileFormatCd"
})
public class MsgFile implements Equals2, HashCode2
{

    @XmlElement(name = "FileId", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler fileId;
    @XmlElement(name = "FileFormatCd", required = true)
    protected String fileFormatCd;

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

    public MsgFile withFileId(DataHandler value) {
        setFileId(value);
        return this;
    }

    public MsgFile withFileFormatCd(String value) {
        setFileFormatCd(value);
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
            DataHandler theFileId;
            theFileId = this.getFileId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileId", theFileId), currentHashCode, theFileId, (this.fileId!= null));
        }
        {
            String theFileFormatCd;
            theFileFormatCd = this.getFileFormatCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileFormatCd", theFileFormatCd), currentHashCode, theFileFormatCd, (this.fileFormatCd!= null));
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
        final MsgFile that = ((MsgFile) object);
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
