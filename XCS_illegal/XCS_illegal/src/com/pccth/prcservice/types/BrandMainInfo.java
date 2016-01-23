/**
 * BrandMainInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pccth.prcservice.types;

public class BrandMainInfo  implements java.io.Serializable {
    private java.lang.String upd_date;

    private java.lang.String upd_userid;

    private java.lang.String brand_main_eng;

    private java.lang.String begin_date;

    private java.lang.String brand_main_thai;

    private java.lang.String group_name;

    private java.lang.String end_date;

    private java.lang.String brand_main_code;

    private java.lang.String group_id;

    public BrandMainInfo() {
    }

    public BrandMainInfo(
           java.lang.String upd_date,
           java.lang.String upd_userid,
           java.lang.String brand_main_eng,
           java.lang.String begin_date,
           java.lang.String brand_main_thai,
           java.lang.String group_name,
           java.lang.String end_date,
           java.lang.String brand_main_code,
           java.lang.String group_id) {
           this.upd_date = upd_date;
           this.upd_userid = upd_userid;
           this.brand_main_eng = brand_main_eng;
           this.begin_date = begin_date;
           this.brand_main_thai = brand_main_thai;
           this.group_name = group_name;
           this.end_date = end_date;
           this.brand_main_code = brand_main_code;
           this.group_id = group_id;
    }


    /**
     * Gets the upd_date value for this BrandMainInfo.
     * 
     * @return upd_date
     */
    public java.lang.String getUpd_date() {
        return upd_date;
    }


    /**
     * Sets the upd_date value for this BrandMainInfo.
     * 
     * @param upd_date
     */
    public void setUpd_date(java.lang.String upd_date) {
        this.upd_date = upd_date;
    }


    /**
     * Gets the upd_userid value for this BrandMainInfo.
     * 
     * @return upd_userid
     */
    public java.lang.String getUpd_userid() {
        return upd_userid;
    }


    /**
     * Sets the upd_userid value for this BrandMainInfo.
     * 
     * @param upd_userid
     */
    public void setUpd_userid(java.lang.String upd_userid) {
        this.upd_userid = upd_userid;
    }


    /**
     * Gets the brand_main_eng value for this BrandMainInfo.
     * 
     * @return brand_main_eng
     */
    public java.lang.String getBrand_main_eng() {
        return brand_main_eng;
    }


    /**
     * Sets the brand_main_eng value for this BrandMainInfo.
     * 
     * @param brand_main_eng
     */
    public void setBrand_main_eng(java.lang.String brand_main_eng) {
        this.brand_main_eng = brand_main_eng;
    }


    /**
     * Gets the begin_date value for this BrandMainInfo.
     * 
     * @return begin_date
     */
    public java.lang.String getBegin_date() {
        return begin_date;
    }


    /**
     * Sets the begin_date value for this BrandMainInfo.
     * 
     * @param begin_date
     */
    public void setBegin_date(java.lang.String begin_date) {
        this.begin_date = begin_date;
    }


    /**
     * Gets the brand_main_thai value for this BrandMainInfo.
     * 
     * @return brand_main_thai
     */
    public java.lang.String getBrand_main_thai() {
        return brand_main_thai;
    }


    /**
     * Sets the brand_main_thai value for this BrandMainInfo.
     * 
     * @param brand_main_thai
     */
    public void setBrand_main_thai(java.lang.String brand_main_thai) {
        this.brand_main_thai = brand_main_thai;
    }


    /**
     * Gets the group_name value for this BrandMainInfo.
     * 
     * @return group_name
     */
    public java.lang.String getGroup_name() {
        return group_name;
    }


    /**
     * Sets the group_name value for this BrandMainInfo.
     * 
     * @param group_name
     */
    public void setGroup_name(java.lang.String group_name) {
        this.group_name = group_name;
    }


    /**
     * Gets the end_date value for this BrandMainInfo.
     * 
     * @return end_date
     */
    public java.lang.String getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this BrandMainInfo.
     * 
     * @param end_date
     */
    public void setEnd_date(java.lang.String end_date) {
        this.end_date = end_date;
    }


    /**
     * Gets the brand_main_code value for this BrandMainInfo.
     * 
     * @return brand_main_code
     */
    public java.lang.String getBrand_main_code() {
        return brand_main_code;
    }


    /**
     * Sets the brand_main_code value for this BrandMainInfo.
     * 
     * @param brand_main_code
     */
    public void setBrand_main_code(java.lang.String brand_main_code) {
        this.brand_main_code = brand_main_code;
    }


    /**
     * Gets the group_id value for this BrandMainInfo.
     * 
     * @return group_id
     */
    public java.lang.String getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this BrandMainInfo.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.String group_id) {
        this.group_id = group_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrandMainInfo)) return false;
        BrandMainInfo other = (BrandMainInfo) obj;
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
            ((this.brand_main_eng==null && other.getBrand_main_eng()==null) || 
             (this.brand_main_eng!=null &&
              this.brand_main_eng.equals(other.getBrand_main_eng()))) &&
            ((this.begin_date==null && other.getBegin_date()==null) || 
             (this.begin_date!=null &&
              this.begin_date.equals(other.getBegin_date()))) &&
            ((this.brand_main_thai==null && other.getBrand_main_thai()==null) || 
             (this.brand_main_thai!=null &&
              this.brand_main_thai.equals(other.getBrand_main_thai()))) &&
            ((this.group_name==null && other.getGroup_name()==null) || 
             (this.group_name!=null &&
              this.group_name.equals(other.getGroup_name()))) &&
            ((this.end_date==null && other.getEnd_date()==null) || 
             (this.end_date!=null &&
              this.end_date.equals(other.getEnd_date()))) &&
            ((this.brand_main_code==null && other.getBrand_main_code()==null) || 
             (this.brand_main_code!=null &&
              this.brand_main_code.equals(other.getBrand_main_code()))) &&
            ((this.group_id==null && other.getGroup_id()==null) || 
             (this.group_id!=null &&
              this.group_id.equals(other.getGroup_id())));
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
        if (getBrand_main_eng() != null) {
            _hashCode += getBrand_main_eng().hashCode();
        }
        if (getBegin_date() != null) {
            _hashCode += getBegin_date().hashCode();
        }
        if (getBrand_main_thai() != null) {
            _hashCode += getBrand_main_thai().hashCode();
        }
        if (getGroup_name() != null) {
            _hashCode += getGroup_name().hashCode();
        }
        if (getEnd_date() != null) {
            _hashCode += getEnd_date().hashCode();
        }
        if (getBrand_main_code() != null) {
            _hashCode += getBrand_main_code().hashCode();
        }
        if (getGroup_id() != null) {
            _hashCode += getGroup_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrandMainInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "BrandMainInfo"));
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
        elemField.setFieldName("brand_main_eng");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "brand_main_eng"));
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
        elemField.setFieldName("brand_main_thai");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "brand_main_thai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "group_name"));
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
        elemField.setFieldName("brand_main_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "brand_main_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "group_id"));
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
