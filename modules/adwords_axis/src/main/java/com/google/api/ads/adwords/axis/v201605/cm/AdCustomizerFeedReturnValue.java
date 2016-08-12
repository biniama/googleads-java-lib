/**
 * AdCustomizerFeedReturnValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;


/**
 * The result of a call to AdCustomizerFeedService#mutate.
 */
public class AdCustomizerFeedReturnValue  extends com.google.api.ads.adwords.axis.v201605.cm.ListReturnValue  implements java.io.Serializable {
    /* The resulting AdCustomizerFeeds. */
    private com.google.api.ads.adwords.axis.v201605.cm.AdCustomizerFeed[] value;

    public AdCustomizerFeedReturnValue() {
    }

    public AdCustomizerFeedReturnValue(
           java.lang.String listReturnValueType,
           com.google.api.ads.adwords.axis.v201605.cm.AdCustomizerFeed[] value) {
        super(
            listReturnValueType);
        this.value = value;
    }


    /**
     * Gets the value value for this AdCustomizerFeedReturnValue.
     * 
     * @return value   * The resulting AdCustomizerFeeds.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.AdCustomizerFeed[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this AdCustomizerFeedReturnValue.
     * 
     * @param value   * The resulting AdCustomizerFeeds.
     */
    public void setValue(com.google.api.ads.adwords.axis.v201605.cm.AdCustomizerFeed[] value) {
        this.value = value;
    }

    public com.google.api.ads.adwords.axis.v201605.cm.AdCustomizerFeed getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.google.api.ads.adwords.axis.v201605.cm.AdCustomizerFeed _value) {
        this.value[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdCustomizerFeedReturnValue)) return false;
        AdCustomizerFeedReturnValue other = (AdCustomizerFeedReturnValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdCustomizerFeedReturnValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "AdCustomizerFeedReturnValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "AdCustomizerFeed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
