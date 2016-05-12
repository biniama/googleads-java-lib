/**
 * AdCustomizerFeedErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;

public class AdCustomizerFeedErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdCustomizerFeedErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_ADD_KEY_ATTRIBUTE = "CANNOT_ADD_KEY_ATTRIBUTE";
    public static final java.lang.String _NOT_AD_CUSTOMIZER_FEED = "NOT_AD_CUSTOMIZER_FEED";
    public static final java.lang.String _INVALID_FEED_NAME = "INVALID_FEED_NAME";
    public static final java.lang.String _TOO_MANY_FEED_ATTRIBUTES_FOR_FEED = "TOO_MANY_FEED_ATTRIBUTES_FOR_FEED";
    public static final java.lang.String _ATTRIBUTE_NAMES_NOT_UNIQUE = "ATTRIBUTE_NAMES_NOT_UNIQUE";
    public static final java.lang.String _FEED_DELETED = "FEED_DELETED";
    public static final java.lang.String _DUPLICATE_FEED_NAME = "DUPLICATE_FEED_NAME";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdCustomizerFeedErrorReason CANNOT_ADD_KEY_ATTRIBUTE = new AdCustomizerFeedErrorReason(_CANNOT_ADD_KEY_ATTRIBUTE);
    public static final AdCustomizerFeedErrorReason NOT_AD_CUSTOMIZER_FEED = new AdCustomizerFeedErrorReason(_NOT_AD_CUSTOMIZER_FEED);
    public static final AdCustomizerFeedErrorReason INVALID_FEED_NAME = new AdCustomizerFeedErrorReason(_INVALID_FEED_NAME);
    public static final AdCustomizerFeedErrorReason TOO_MANY_FEED_ATTRIBUTES_FOR_FEED = new AdCustomizerFeedErrorReason(_TOO_MANY_FEED_ATTRIBUTES_FOR_FEED);
    public static final AdCustomizerFeedErrorReason ATTRIBUTE_NAMES_NOT_UNIQUE = new AdCustomizerFeedErrorReason(_ATTRIBUTE_NAMES_NOT_UNIQUE);
    public static final AdCustomizerFeedErrorReason FEED_DELETED = new AdCustomizerFeedErrorReason(_FEED_DELETED);
    public static final AdCustomizerFeedErrorReason DUPLICATE_FEED_NAME = new AdCustomizerFeedErrorReason(_DUPLICATE_FEED_NAME);
    public static final AdCustomizerFeedErrorReason UNKNOWN = new AdCustomizerFeedErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdCustomizerFeedErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdCustomizerFeedErrorReason enumeration = (AdCustomizerFeedErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdCustomizerFeedErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdCustomizerFeedErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "AdCustomizerFeedError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
