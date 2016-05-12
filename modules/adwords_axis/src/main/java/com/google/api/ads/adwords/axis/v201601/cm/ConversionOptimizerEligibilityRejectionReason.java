/**
 * ConversionOptimizerEligibilityRejectionReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

public class ConversionOptimizerEligibilityRejectionReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConversionOptimizerEligibilityRejectionReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CAMPAIGN_IS_NOT_ACTIVE = "CAMPAIGN_IS_NOT_ACTIVE";
    public static final java.lang.String _NOT_CPC_CAMPAIGN = "NOT_CPC_CAMPAIGN";
    public static final java.lang.String _CONVERSION_TRACKING_NOT_ENABLED = "CONVERSION_TRACKING_NOT_ENABLED";
    public static final java.lang.String _NOT_ENOUGH_CONVERSIONS = "NOT_ENOUGH_CONVERSIONS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ConversionOptimizerEligibilityRejectionReason CAMPAIGN_IS_NOT_ACTIVE = new ConversionOptimizerEligibilityRejectionReason(_CAMPAIGN_IS_NOT_ACTIVE);
    public static final ConversionOptimizerEligibilityRejectionReason NOT_CPC_CAMPAIGN = new ConversionOptimizerEligibilityRejectionReason(_NOT_CPC_CAMPAIGN);
    public static final ConversionOptimizerEligibilityRejectionReason CONVERSION_TRACKING_NOT_ENABLED = new ConversionOptimizerEligibilityRejectionReason(_CONVERSION_TRACKING_NOT_ENABLED);
    public static final ConversionOptimizerEligibilityRejectionReason NOT_ENOUGH_CONVERSIONS = new ConversionOptimizerEligibilityRejectionReason(_NOT_ENOUGH_CONVERSIONS);
    public static final ConversionOptimizerEligibilityRejectionReason UNKNOWN = new ConversionOptimizerEligibilityRejectionReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ConversionOptimizerEligibilityRejectionReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConversionOptimizerEligibilityRejectionReason enumeration = (ConversionOptimizerEligibilityRejectionReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConversionOptimizerEligibilityRejectionReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionOptimizerEligibilityRejectionReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ConversionOptimizerEligibility.RejectionReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
