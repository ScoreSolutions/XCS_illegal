/**
 * Header.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pccth.prcservice.types;

public class Header  implements java.io.Serializable {
    private java.lang.String serviceID;

    private java.lang.String systemID;

    private com.pccth.prcservice.types.ParameterAppend[] parameterAppend;

    private java.lang.String IPAddress;

    public Header() {
    }

    public Header(
           java.lang.String serviceID,
           java.lang.String systemID,
           com.pccth.prcservice.types.ParameterAppend[] parameterAppend,
           java.lang.String IPAddress) {
           this.serviceID = serviceID;
           this.systemID = systemID;
           this.parameterAppend = parameterAppend;
           this.IPAddress = IPAddress;
    }


    /**
     * Gets the serviceID value for this Header.
     * 
     * @return serviceID
     */
    public java.lang.String getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this Header.
     * 
     * @param serviceID
     */
    public void setServiceID(java.lang.String serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the systemID value for this Header.
     * 
     * @return systemID
     */
    public java.lang.String getSystemID() {
        return systemID;
    }


    /**
     * Sets the systemID value for this Header.
     * 
     * @param systemID
     */
    public void setSystemID(java.lang.String systemID) {
        this.systemID = systemID;
    }


    /**
     * Gets the parameterAppend value for this Header.
     * 
     * @return parameterAppend
     */
    public com.pccth.prcservice.types.ParameterAppend[] getParameterAppend() {
        return parameterAppend;
    }


    /**
     * Sets the parameterAppend value for this Header.
     * 
     * @param parameterAppend
     */
    public void setParameterAppend(com.pccth.prcservice.types.ParameterAppend[] parameterAppend) {
        this.parameterAppend = parameterAppend;
    }

    public com.pccth.prcservice.types.ParameterAppend getParameterAppend(int i) {
        return this.parameterAppend[i];
    }

    public void setParameterAppend(int i, com.pccth.prcservice.types.ParameterAppend _value) {
        this.parameterAppend[i] = _value;
    }


    /**
     * Gets the IPAddress value for this Header.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this Header.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Header)) return false;
        Header other = (Header) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.systemID==null && other.getSystemID()==null) || 
             (this.systemID!=null &&
              this.systemID.equals(other.getSystemID()))) &&
            ((this.parameterAppend==null && other.getParameterAppend()==null) || 
             (this.parameterAppend!=null &&
              java.util.Arrays.equals(this.parameterAppend, other.getParameterAppend()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress())));
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
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getSystemID() != null) {
            _hashCode += getSystemID().hashCode();
        }
        if (getParameterAppend() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameterAppend());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameterAppend(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Header.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "Header"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "serviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "systemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterAppend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "parameterAppend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "ParameterAppend"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "IPAddress"));
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
