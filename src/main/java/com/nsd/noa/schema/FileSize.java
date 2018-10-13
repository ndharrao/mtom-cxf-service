
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
 * <p>Java class for FileSize complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileSize"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UnitMeasurementCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSize", propOrder = {
    "numUnits",
    "unitMeasurementCd"
})
public class FileSize implements Equals2, HashCode2
{

    @XmlElement(name = "NumUnits")
    protected int numUnits;
    @XmlElement(name = "UnitMeasurementCd", required = true)
    protected String unitMeasurementCd;

    /**
     * Gets the value of the numUnits property.
     * 
     */
    public int getNumUnits() {
        return numUnits;
    }

    /**
     * Sets the value of the numUnits property.
     * 
     */
    public void setNumUnits(int value) {
        this.numUnits = value;
    }

    /**
     * Gets the value of the unitMeasurementCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitMeasurementCd() {
        return unitMeasurementCd;
    }

    /**
     * Sets the value of the unitMeasurementCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitMeasurementCd(String value) {
        this.unitMeasurementCd = value;
    }

    public FileSize withNumUnits(int value) {
        setNumUnits(value);
        return this;
    }

    public FileSize withUnitMeasurementCd(String value) {
        setUnitMeasurementCd(value);
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
            int theNumUnits;
            theNumUnits = this.getNumUnits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numUnits", theNumUnits), currentHashCode, theNumUnits, true);
        }
        {
            String theUnitMeasurementCd;
            theUnitMeasurementCd = this.getUnitMeasurementCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitMeasurementCd", theUnitMeasurementCd), currentHashCode, theUnitMeasurementCd, (this.unitMeasurementCd!= null));
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
        final FileSize that = ((FileSize) object);
        {
            int lhsNumUnits;
            lhsNumUnits = this.getNumUnits();
            int rhsNumUnits;
            rhsNumUnits = that.getNumUnits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numUnits", lhsNumUnits), LocatorUtils.property(thatLocator, "numUnits", rhsNumUnits), lhsNumUnits, rhsNumUnits, true, true)) {
                return false;
            }
        }
        {
            String lhsUnitMeasurementCd;
            lhsUnitMeasurementCd = this.getUnitMeasurementCd();
            String rhsUnitMeasurementCd;
            rhsUnitMeasurementCd = that.getUnitMeasurementCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitMeasurementCd", lhsUnitMeasurementCd), LocatorUtils.property(thatLocator, "unitMeasurementCd", rhsUnitMeasurementCd), lhsUnitMeasurementCd, rhsUnitMeasurementCd, (this.unitMeasurementCd!= null), (that.unitMeasurementCd!= null))) {
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
