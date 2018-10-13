
package com.nsd.noa.schema;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for AttachmentPackages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentPackages"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentPackage" type="{http://www.nsd.com/noa/schema}AttachmentPackage" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentPackages", propOrder = {
    "attachmentPackage"
})
public class AttachmentPackages implements Equals2, HashCode2
{

    @XmlElement(name = "AttachmentPackage", required = true)
    protected List<AttachmentPackage> attachmentPackage;

    /**
     * Gets the value of the attachmentPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentPackage }
     * 
     * 
     */
    public List<AttachmentPackage> getAttachmentPackage() {
        if (attachmentPackage == null) {
            attachmentPackage = new ArrayList<AttachmentPackage>();
        }
        return this.attachmentPackage;
    }

    public AttachmentPackages withAttachmentPackage(AttachmentPackage... values) {
        if (values!= null) {
            for (AttachmentPackage value: values) {
                getAttachmentPackage().add(value);
            }
        }
        return this;
    }

    public AttachmentPackages withAttachmentPackage(Collection<AttachmentPackage> values) {
        if (values!= null) {
            getAttachmentPackage().addAll(values);
        }
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
            List<AttachmentPackage> theAttachmentPackage;
            theAttachmentPackage = (((this.attachmentPackage!= null)&&(!this.attachmentPackage.isEmpty()))?this.getAttachmentPackage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachmentPackage", theAttachmentPackage), currentHashCode, theAttachmentPackage, ((this.attachmentPackage!= null)&&(!this.attachmentPackage.isEmpty())));
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
        final AttachmentPackages that = ((AttachmentPackages) object);
        {
            List<AttachmentPackage> lhsAttachmentPackage;
            lhsAttachmentPackage = (((this.attachmentPackage!= null)&&(!this.attachmentPackage.isEmpty()))?this.getAttachmentPackage():null);
            List<AttachmentPackage> rhsAttachmentPackage;
            rhsAttachmentPackage = (((that.attachmentPackage!= null)&&(!that.attachmentPackage.isEmpty()))?that.getAttachmentPackage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachmentPackage", lhsAttachmentPackage), LocatorUtils.property(thatLocator, "attachmentPackage", rhsAttachmentPackage), lhsAttachmentPackage, rhsAttachmentPackage, ((this.attachmentPackage!= null)&&(!this.attachmentPackage.isEmpty())), ((that.attachmentPackage!= null)&&(!that.attachmentPackage.isEmpty())))) {
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
