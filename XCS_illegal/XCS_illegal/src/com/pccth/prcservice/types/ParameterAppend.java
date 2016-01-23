/**
 * ParameterAppend.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pccth.prcservice.types;

public class ParameterAppend  implements java.io.Serializable {
    private java.lang.String parameterValue;

    private java.lang.String parameterSearch;

    public ParameterAppend() {
    }

    public ParameterAppend(
           java.lang.String parameterValue,
           java.lang.String parameterSearch) {
           this.parameterValue = parameterValue;
           this.parameterSearch = parameterSearch;
    }


    /**
     * Gets the parameterValue value for this ParameterAppend.
     * 
     * @return parameterValue
     */
    public java.lang.String getParameterValue() {
        return parameterValue;
    }


    /**
     * Sets the parameterValue value for this ParameterAppend.
     * 
     * @param parameterValue
     */
    public void setParameterValue(java.lang.String parameterValue) {
        this.parameterValue = parameterValue;
    }


    /**
     * Gets the parameterSearch value for this ParameterAppend.
     * 
     * @return parameterSearch
     */
    public java.lang.String getParameterSearch() {
        return parameterSearch;
    }


    /**
     * Sets the parameterSearch value for this ParameterAppend.
     * 
     * @param parameterSearch
     */
    public void setParameterSearch(java.lang.String parameterSearch) {
        this.parameterSearch = parameterSearch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParameterAppend)) return false;
        ParameterAppend other = (ParameterAppend) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameterValue==null && other.getParameterValue()==null) || 
             (this.parameterValue!=null &&
              this.parameterValue.equals(other.getParameterValue()))) &&
            ((this.parameterSearch==null && other.getParameterSearch()==null) || 
             (this.parameterSearch!=null &&
              this.parameterSearch.equals(other.getParameterSearch())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getParameterValue() != null) {
            _hashCode += getParameterValue().hashCode();
        }
        if (getParameterSearch() != null) {
            _hashCode += getParameterSearch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParameterAppend.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "ParameterAppend"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "parameterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "parameterSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
