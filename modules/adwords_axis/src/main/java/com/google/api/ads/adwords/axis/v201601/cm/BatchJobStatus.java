/**
 * BatchJobStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

public class BatchJobStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BatchJobStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _AWAITING_FILE = "AWAITING_FILE";
    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _CANCELING = "CANCELING";
    public static final java.lang.String _CANCELED = "CANCELED";
    public static final java.lang.String _DONE = "DONE";
    public static final BatchJobStatus UNKNOWN = new BatchJobStatus(_UNKNOWN);
    public static final BatchJobStatus AWAITING_FILE = new BatchJobStatus(_AWAITING_FILE);
    public static final BatchJobStatus ACTIVE = new BatchJobStatus(_ACTIVE);
    public static final BatchJobStatus CANCELING = new BatchJobStatus(_CANCELING);
    public static final BatchJobStatus CANCELED = new BatchJobStatus(_CANCELED);
    public static final BatchJobStatus DONE = new BatchJobStatus(_DONE);
    public java.lang.String getValue() { return _value_;}
    public static BatchJobStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BatchJobStatus enumeration = (BatchJobStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BatchJobStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BatchJobStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BatchJobStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
