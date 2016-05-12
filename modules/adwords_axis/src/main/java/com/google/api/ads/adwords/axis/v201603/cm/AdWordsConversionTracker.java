/**
 * AdWordsConversionTracker.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.cm;


/**
 * A conversion tracker created through AdWords Conversion Tracking.
 */
public class AdWordsConversionTracker  extends com.google.api.ads.adwords.axis.v201603.cm.ConversionTracker  implements java.io.Serializable {
    /* The generated snippet for this conversion tracker. This snippet
     * is
     *                     auto-generated by the API, and will be ignored
     * in mutate operands. This
     *                     field will always be returned. If the other fields
     * are not selected, the
     *                     snippet will use default values for them.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String snippet;

    /* Text format for the site stats logo.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TextFormat".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201603.cm.AdWordsConversionTrackerTextFormat textFormat;

    /* Language used on the conversion page.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionPageLanguage".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.String conversionPageLanguage;

    /* Background color for the site stats logo as a hex triplet (e.g.
     * "99ccff").
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "BackgroundColor".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String backgroundColor;

    /* Tracking code to use for the conversion type.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TrackingCodeType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201603.cm.AdWordsConversionTrackerTrackingCodeType trackingCodeType;

    public AdWordsConversionTracker() {
    }

    public AdWordsConversionTracker(
           java.lang.Long id,
           java.lang.Long originalConversionTypeId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201603.cm.ConversionTrackerStatus status,
           com.google.api.ads.adwords.axis.v201603.cm.ConversionTrackerCategory category,
           java.lang.Long conversionTypeOwnerCustomerId,
           java.lang.Integer viewthroughLookbackWindow,
           java.lang.Integer ctcLookbackWindow,
           com.google.api.ads.adwords.axis.v201603.cm.ConversionDeduplicationMode countingType,
           java.lang.Double defaultRevenueValue,
           java.lang.String defaultRevenueCurrencyCode,
           java.lang.Boolean alwaysUseDefaultRevenueValue,
           java.lang.Boolean excludeFromBidding,
           java.lang.String mostRecentConversionDate,
           java.lang.String lastReceivedRequestTime,
           java.lang.String conversionTrackerType,
           java.lang.String snippet,
           com.google.api.ads.adwords.axis.v201603.cm.AdWordsConversionTrackerTextFormat textFormat,
           java.lang.String conversionPageLanguage,
           java.lang.String backgroundColor,
           com.google.api.ads.adwords.axis.v201603.cm.AdWordsConversionTrackerTrackingCodeType trackingCodeType) {
        super(
            id,
            originalConversionTypeId,
            name,
            status,
            category,
            conversionTypeOwnerCustomerId,
            viewthroughLookbackWindow,
            ctcLookbackWindow,
            countingType,
            defaultRevenueValue,
            defaultRevenueCurrencyCode,
            alwaysUseDefaultRevenueValue,
            excludeFromBidding,
            mostRecentConversionDate,
            lastReceivedRequestTime,
            conversionTrackerType);
        this.snippet = snippet;
        this.textFormat = textFormat;
        this.conversionPageLanguage = conversionPageLanguage;
        this.backgroundColor = backgroundColor;
        this.trackingCodeType = trackingCodeType;
    }


    /**
     * Gets the snippet value for this AdWordsConversionTracker.
     * 
     * @return snippet   * The generated snippet for this conversion tracker. This snippet
     * is
     *                     auto-generated by the API, and will be ignored
     * in mutate operands. This
     *                     field will always be returned. If the other fields
     * are not selected, the
     *                     snippet will use default values for them.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getSnippet() {
        return snippet;
    }


    /**
     * Sets the snippet value for this AdWordsConversionTracker.
     * 
     * @param snippet   * The generated snippet for this conversion tracker. This snippet
     * is
     *                     auto-generated by the API, and will be ignored
     * in mutate operands. This
     *                     field will always be returned. If the other fields
     * are not selected, the
     *                     snippet will use default values for them.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setSnippet(java.lang.String snippet) {
        this.snippet = snippet;
    }


    /**
     * Gets the textFormat value for this AdWordsConversionTracker.
     * 
     * @return textFormat   * Text format for the site stats logo.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TextFormat".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201603.cm.AdWordsConversionTrackerTextFormat getTextFormat() {
        return textFormat;
    }


    /**
     * Sets the textFormat value for this AdWordsConversionTracker.
     * 
     * @param textFormat   * Text format for the site stats logo.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TextFormat".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setTextFormat(com.google.api.ads.adwords.axis.v201603.cm.AdWordsConversionTrackerTextFormat textFormat) {
        this.textFormat = textFormat;
    }


    /**
     * Gets the conversionPageLanguage value for this AdWordsConversionTracker.
     * 
     * @return conversionPageLanguage   * Language used on the conversion page.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionPageLanguage".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getConversionPageLanguage() {
        return conversionPageLanguage;
    }


    /**
     * Sets the conversionPageLanguage value for this AdWordsConversionTracker.
     * 
     * @param conversionPageLanguage   * Language used on the conversion page.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionPageLanguage".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setConversionPageLanguage(java.lang.String conversionPageLanguage) {
        this.conversionPageLanguage = conversionPageLanguage;
    }


    /**
     * Gets the backgroundColor value for this AdWordsConversionTracker.
     * 
     * @return backgroundColor   * Background color for the site stats logo as a hex triplet (e.g.
     * "99ccff").
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "BackgroundColor".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getBackgroundColor() {
        return backgroundColor;
    }


    /**
     * Sets the backgroundColor value for this AdWordsConversionTracker.
     * 
     * @param backgroundColor   * Background color for the site stats logo as a hex triplet (e.g.
     * "99ccff").
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "BackgroundColor".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setBackgroundColor(java.lang.String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


    /**
     * Gets the trackingCodeType value for this AdWordsConversionTracker.
     * 
     * @return trackingCodeType   * Tracking code to use for the conversion type.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TrackingCodeType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201603.cm.AdWordsConversionTrackerTrackingCodeType getTrackingCodeType() {
        return trackingCodeType;
    }


    /**
     * Sets the trackingCodeType value for this AdWordsConversionTracker.
     * 
     * @param trackingCodeType   * Tracking code to use for the conversion type.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TrackingCodeType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setTrackingCodeType(com.google.api.ads.adwords.axis.v201603.cm.AdWordsConversionTrackerTrackingCodeType trackingCodeType) {
        this.trackingCodeType = trackingCodeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdWordsConversionTracker)) return false;
        AdWordsConversionTracker other = (AdWordsConversionTracker) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.snippet==null && other.getSnippet()==null) || 
             (this.snippet!=null &&
              this.snippet.equals(other.getSnippet()))) &&
            ((this.textFormat==null && other.getTextFormat()==null) || 
             (this.textFormat!=null &&
              this.textFormat.equals(other.getTextFormat()))) &&
            ((this.conversionPageLanguage==null && other.getConversionPageLanguage()==null) || 
             (this.conversionPageLanguage!=null &&
              this.conversionPageLanguage.equals(other.getConversionPageLanguage()))) &&
            ((this.backgroundColor==null && other.getBackgroundColor()==null) || 
             (this.backgroundColor!=null &&
              this.backgroundColor.equals(other.getBackgroundColor()))) &&
            ((this.trackingCodeType==null && other.getTrackingCodeType()==null) || 
             (this.trackingCodeType!=null &&
              this.trackingCodeType.equals(other.getTrackingCodeType())));
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
        if (getSnippet() != null) {
            _hashCode += getSnippet().hashCode();
        }
        if (getTextFormat() != null) {
            _hashCode += getTextFormat().hashCode();
        }
        if (getConversionPageLanguage() != null) {
            _hashCode += getConversionPageLanguage().hashCode();
        }
        if (getBackgroundColor() != null) {
            _hashCode += getBackgroundColor().hashCode();
        }
        if (getTrackingCodeType() != null) {
            _hashCode += getTrackingCodeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdWordsConversionTracker.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "AdWordsConversionTracker"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "snippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "textFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "AdWordsConversionTracker.TextFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionPageLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "conversionPageLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "backgroundColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingCodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "trackingCodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "AdWordsConversionTracker.TrackingCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
