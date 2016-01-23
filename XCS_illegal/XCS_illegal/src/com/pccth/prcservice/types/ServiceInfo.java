/**
 * ServiceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pccth.prcservice.types;

public class ServiceInfo  implements java.io.Serializable {
    private java.lang.String upd_date;

    private java.lang.String upd_userid;

    private java.lang.String begin_date;

    private java.lang.String seq_no;

    private java.lang.String end_date;

    private java.lang.String product_name;

    private java.lang.String brand_main_code;

    private java.lang.String service_desc;

    private java.lang.String brand_main_name;

    private java.lang.String product_code;

    public ServiceInfo() {
    }

    public ServiceInfo(
           java.lang.String upd_date,
           java.lang.String upd_userid,
           java.lang.String begin_date,
           java.lang.String seq_no,
           java.lang.String end_date,
           java.lang.String product_name,
           java.lang.String brand_main_code,
           java.lang.String service_desc,
           java.lang.String brand_main_name,
           java.lang.String product_code) {
           this.upd_date = upd_date;
           this.upd_userid = upd_userid;
           this.begin_date = begin_date;
           this.seq_no = seq_no;
           this.end_date = end_date;
           this.product_name = product_name;
           this.brand_main_code = brand_main_code;
           this.service_desc = service_desc;
           this.brand_main_name = brand_main_name;
           this.product_code = product_code;
    }


    /**
     * Gets the upd_date value for this ServiceInfo.
     * 
     * @return upd_date
     */
    public java.lang.String getUpd_date() {
        return upd_date;
    }


    /**
     * Sets the upd_date value for this ServiceInfo.
     * 
     * @param upd_date
     */
    public void setUpd_date(java.lang.String upd_date) {
        this.upd_date = upd_date;
    }


    /**
     * Gets the upd_userid value for this ServiceInfo.
     * 
     * @return upd_userid
     */
    public java.lang.String getUpd_userid() {
        return upd_userid;
    }


    /**
     * Sets the upd_userid value for this ServiceInfo.
     * 
     * @param upd_userid
     */
    public void setUpd_userid(java.lang.String upd_userid) {
        this.upd_userid = upd_userid;
    }


    /**
     * Gets the begin_date value for this ServiceInfo.
     * 
     * @return begin_date
     */
    public java.lang.String getBegin_date() {
        return begin_date;
    }


    /**
     * Sets the begin_date value for this ServiceInfo.
     * 
     * @param begin_date
     */
    public void setBegin_date(java.lang.String begin_date) {
        this.begin_date = begin_date;
    }


    /**
     * Gets the seq_no value for this ServiceInfo.
     * 
     * @return seq_no
     */
    public java.lang.String getSeq_no() {
        return seq_no;
    }


    /**
     * Sets the seq_no value for this ServiceInfo.
     * 
     * @param seq_no
     */
    public void setSeq_no(java.lang.String seq_no) {
        this.seq_no = seq_no;
    }


    /**
     * Gets the end_date value for this ServiceInfo.
     * 
     * @return end_date
     */
    public java.lang.String getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this ServiceInfo.
     * 
     * @param end_date
     */
    public void setEnd_date(java.lang.String end_date) {
        this.end_date = end_date;
    }


    /**
     * Gets the product_name value for this ServiceInfo.
     * 
     * @return product_name
     */
    public java.lang.String getProduct_name() {
        return product_name;
    }


    /**
     * Sets the product_name value for this ServiceInfo.
     * 
     * @param product_name
     */
    public void setProduct_name(java.lang.String product_name) {
        this.product_name = product_name;
    }


    /**
     * Gets the brand_main_code value for this ServiceInfo.
     * 
     * @return brand_main_code
     */
    public java.lang.String getBrand_main_code() {
        return brand_main_code;
    }


    /**
     * Sets the brand_main_code value for this ServiceInfo.
     * 
     * @param brand_main_code
     */
    public void setBrand_main_code(java.lang.String brand_main_code) {
        this.brand_main_code = brand_main_code;
    }


    /**
     * Gets the service_desc value for this ServiceInfo.
     * 
     * @return service_desc
     */
    public java.lang.String getService_desc() {
        return service_desc;
    }


    /**
     * Sets the service_desc value for this ServiceInfo.
     * 
     * @param service_desc
     */
    public void setService_desc(java.lang.String service_desc) {
        this.service_desc = service_desc;
    }


    /**
     * Gets the brand_main_name value for this ServiceInfo.
     * 
     * @return brand_main_name
     */
    public java.lang.String getBrand_main_name() {
        return brand_main_name;
    }


    /**
     * Sets the brand_main_name value for this ServiceInfo.
     * 
     * @param brand_main_name
     */
    public void setBrand_main_name(java.lang.String brand_main_name) {
        this.brand_main_name = brand_main_name;
    }


    /**
     * Gets the product_code value for this ServiceInfo.
     * 
     * @return product_code
     */
    public java.lang.String getProduct_code() {
        return product_code;
    }


    /**
     * Sets the product_code value for this ServiceInfo.
     * 
     * @param product_code
     */
    public void setProduct_code(java.lang.String product_code) {
        this.product_code = product_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceInfo)) return false;
        ServiceInfo other = (ServiceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.upd_date==null && other.getUpd_date()==null) || 
             (this.upd_date!=null &&
              this.upd_date.equals(other.getUpd_date()))) &&
            ((this.upd_userid==null && other.getUpd_userid()==null) || 
             (this.upd_userid!=null &&
              this.upd_userid.equals(other.getUpd_userid()))) &&
            ((this.begin_date==null && other.getBegin_date()==null) || 
             (this.begin_date!=null &&
              this.begin_date.equals(other.getBegin_date()))) &&
            ((this.seq_no==null && other.getSeq_no()==null) || 
             (this.seq_no!=null &&
              this.seq_no.equals(other.getSeq_no()))) &&
            ((this.end_date==null && other.getEnd_date()==null) || 
             (this.end_date!=null &&
              this.end_date.equals(other.getEnd_date()))) &&
            ((this.product_name==null && other.getProduct_name()==null) || 
             (this.product_name!=null &&
              this.product_name.equals(other.getProduct_name()))) &&
            ((this.brand_main_code==null && other.getBrand_main_code()==null) || 
             (this.brand_main_code!=null &&
              this.brand_main_code.equals(other.getBrand_main_code()))) &&
            ((this.service_desc==null && other.getService_desc()==null) || 
             (this.service_desc!=null &&
              this.service_desc.equals(other.getService_desc()))) &&
            ((this.brand_main_name==null && other.getBrand_main_name()==null) || 
             (this.brand_main_name!=null &&
              this.brand_main_name.equals(other.getBrand_main_name()))) &&
            ((this.product_code==null && other.getProduct_code()==null) || 
             (this.product_code!=null &&
              this.product_code.equals(other.getProduct_code())));
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
        if (getUpd_date() != null) {
            _hashCode += getUpd_date().hashCode();
        }
        if (getUpd_userid() != null) {
            _hashCode += getUpd_userid().hashCode();
        }
        if (getBegin_date() != null) {
            _hashCode += getBegin_date().hashCode();
        }
        if (getSeq_no() != null) {
            _hashCode += getSeq_no().hashCode();
        }
        if (getEnd_date() != null) {
            _hashCode += getEnd_date().hashCode();
        }
        if (getProduct_name() != null) {
            _hashCode += getProduct_name().hashCode();
        }
        if (getBrand_main_code() != null) {
            _hashCode += getBrand_main_code().hashCode();
        }
        if (getService_desc() != null) {
            _hashCode += getService_desc().hashCode();
        }
        if (getBrand_main_name() != null) {
            _hashCode += getBrand_main_name().hashCode();
        }
        if (getProduct_code() != null) {
            _hashCode += getProduct_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "ServiceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upd_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "upd_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upd_userid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "upd_userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("begin_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "begin_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seq_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "seq_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "product_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_main_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "brand_main_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "service_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_main_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "brand_main_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "product_code"));
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
