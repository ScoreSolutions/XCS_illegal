/**
 * Body.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pccth.prcservice.types;

public class Body  implements java.io.Serializable {
    private com.pccth.prcservice.types.ServiceInfo[] serviceInfo;

    private com.pccth.prcservice.types.LiquorInfo[] liquorInfo;

    private com.pccth.prcservice.types.TobaccoInfo[] tobaccoInfo;

    private com.pccth.prcservice.types.BrandSecondInfo[] brandSecondInfo;

    private com.pccth.prcservice.types.GolfInfo[] golfInfo;

    private com.pccth.prcservice.types.CardInfo[] cardInfo;

    private java.lang.String returnCode;

    private com.pccth.prcservice.types.Product27Info[] product27Info;

    private com.pccth.prcservice.types.BrandMainInfo[] brandMainInfo;

    private java.lang.String returnDesc;

    public Body() {
    }

    public Body(
           com.pccth.prcservice.types.ServiceInfo[] serviceInfo,
           com.pccth.prcservice.types.LiquorInfo[] liquorInfo,
           com.pccth.prcservice.types.TobaccoInfo[] tobaccoInfo,
           com.pccth.prcservice.types.BrandSecondInfo[] brandSecondInfo,
           com.pccth.prcservice.types.GolfInfo[] golfInfo,
           com.pccth.prcservice.types.CardInfo[] cardInfo,
           java.lang.String returnCode,
           com.pccth.prcservice.types.Product27Info[] product27Info,
           com.pccth.prcservice.types.BrandMainInfo[] brandMainInfo,
           java.lang.String returnDesc) {
           this.serviceInfo = serviceInfo;
           this.liquorInfo = liquorInfo;
           this.tobaccoInfo = tobaccoInfo;
           this.brandSecondInfo = brandSecondInfo;
           this.golfInfo = golfInfo;
           this.cardInfo = cardInfo;
           this.returnCode = returnCode;
           this.product27Info = product27Info;
           this.brandMainInfo = brandMainInfo;
           this.returnDesc = returnDesc;
    }


    /**
     * Gets the serviceInfo value for this Body.
     * 
     * @return serviceInfo
     */
    public com.pccth.prcservice.types.ServiceInfo[] getServiceInfo() {
        return serviceInfo;
    }


    /**
     * Sets the serviceInfo value for this Body.
     * 
     * @param serviceInfo
     */
    public void setServiceInfo(com.pccth.prcservice.types.ServiceInfo[] serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public com.pccth.prcservice.types.ServiceInfo getServiceInfo(int i) {
        return this.serviceInfo[i];
    }

    public void setServiceInfo(int i, com.pccth.prcservice.types.ServiceInfo _value) {
        this.serviceInfo[i] = _value;
    }


    /**
     * Gets the liquorInfo value for this Body.
     * 
     * @return liquorInfo
     */
    public com.pccth.prcservice.types.LiquorInfo[] getLiquorInfo() {
        return liquorInfo;
    }


    /**
     * Sets the liquorInfo value for this Body.
     * 
     * @param liquorInfo
     */
    public void setLiquorInfo(com.pccth.prcservice.types.LiquorInfo[] liquorInfo) {
        this.liquorInfo = liquorInfo;
    }

    public com.pccth.prcservice.types.LiquorInfo getLiquorInfo(int i) {
        return this.liquorInfo[i];
    }

    public void setLiquorInfo(int i, com.pccth.prcservice.types.LiquorInfo _value) {
        this.liquorInfo[i] = _value;
    }


    /**
     * Gets the tobaccoInfo value for this Body.
     * 
     * @return tobaccoInfo
     */
    public com.pccth.prcservice.types.TobaccoInfo[] getTobaccoInfo() {
        return tobaccoInfo;
    }


    /**
     * Sets the tobaccoInfo value for this Body.
     * 
     * @param tobaccoInfo
     */
    public void setTobaccoInfo(com.pccth.prcservice.types.TobaccoInfo[] tobaccoInfo) {
        this.tobaccoInfo = tobaccoInfo;
    }

    public com.pccth.prcservice.types.TobaccoInfo getTobaccoInfo(int i) {
        return this.tobaccoInfo[i];
    }

    public void setTobaccoInfo(int i, com.pccth.prcservice.types.TobaccoInfo _value) {
        this.tobaccoInfo[i] = _value;
    }


    /**
     * Gets the brandSecondInfo value for this Body.
     * 
     * @return brandSecondInfo
     */
    public com.pccth.prcservice.types.BrandSecondInfo[] getBrandSecondInfo() {
        return brandSecondInfo;
    }


    /**
     * Sets the brandSecondInfo value for this Body.
     * 
     * @param brandSecondInfo
     */
    public void setBrandSecondInfo(com.pccth.prcservice.types.BrandSecondInfo[] brandSecondInfo) {
        this.brandSecondInfo = brandSecondInfo;
    }

    public com.pccth.prcservice.types.BrandSecondInfo getBrandSecondInfo(int i) {
        return this.brandSecondInfo[i];
    }

    public void setBrandSecondInfo(int i, com.pccth.prcservice.types.BrandSecondInfo _value) {
        this.brandSecondInfo[i] = _value;
    }


    /**
     * Gets the golfInfo value for this Body.
     * 
     * @return golfInfo
     */
    public com.pccth.prcservice.types.GolfInfo[] getGolfInfo() {
        return golfInfo;
    }


    /**
     * Sets the golfInfo value for this Body.
     * 
     * @param golfInfo
     */
    public void setGolfInfo(com.pccth.prcservice.types.GolfInfo[] golfInfo) {
        this.golfInfo = golfInfo;
    }

    public com.pccth.prcservice.types.GolfInfo getGolfInfo(int i) {
        return this.golfInfo[i];
    }

    public void setGolfInfo(int i, com.pccth.prcservice.types.GolfInfo _value) {
        this.golfInfo[i] = _value;
    }


    /**
     * Gets the cardInfo value for this Body.
     * 
     * @return cardInfo
     */
    public com.pccth.prcservice.types.CardInfo[] getCardInfo() {
        return cardInfo;
    }


    /**
     * Sets the cardInfo value for this Body.
     * 
     * @param cardInfo
     */
    public void setCardInfo(com.pccth.prcservice.types.CardInfo[] cardInfo) {
        this.cardInfo = cardInfo;
    }

    public com.pccth.prcservice.types.CardInfo getCardInfo(int i) {
        return this.cardInfo[i];
    }

    public void setCardInfo(int i, com.pccth.prcservice.types.CardInfo _value) {
        this.cardInfo[i] = _value;
    }


    /**
     * Gets the returnCode value for this Body.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this Body.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the product27Info value for this Body.
     * 
     * @return product27Info
     */
    public com.pccth.prcservice.types.Product27Info[] getProduct27Info() {
        return product27Info;
    }


    /**
     * Sets the product27Info value for this Body.
     * 
     * @param product27Info
     */
    public void setProduct27Info(com.pccth.prcservice.types.Product27Info[] product27Info) {
        this.product27Info = product27Info;
    }

    public com.pccth.prcservice.types.Product27Info getProduct27Info(int i) {
        return this.product27Info[i];
    }

    public void setProduct27Info(int i, com.pccth.prcservice.types.Product27Info _value) {
        this.product27Info[i] = _value;
    }


    /**
     * Gets the brandMainInfo value for this Body.
     * 
     * @return brandMainInfo
     */
    public com.pccth.prcservice.types.BrandMainInfo[] getBrandMainInfo() {
        return brandMainInfo;
    }


    /**
     * Sets the brandMainInfo value for this Body.
     * 
     * @param brandMainInfo
     */
    public void setBrandMainInfo(com.pccth.prcservice.types.BrandMainInfo[] brandMainInfo) {
        this.brandMainInfo = brandMainInfo;
    }

    public com.pccth.prcservice.types.BrandMainInfo getBrandMainInfo(int i) {
        return this.brandMainInfo[i];
    }

    public void setBrandMainInfo(int i, com.pccth.prcservice.types.BrandMainInfo _value) {
        this.brandMainInfo[i] = _value;
    }


    /**
     * Gets the returnDesc value for this Body.
     * 
     * @return returnDesc
     */
    public java.lang.String getReturnDesc() {
        return returnDesc;
    }


    /**
     * Sets the returnDesc value for this Body.
     * 
     * @param returnDesc
     */
    public void setReturnDesc(java.lang.String returnDesc) {
        this.returnDesc = returnDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Body)) return false;
        Body other = (Body) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceInfo==null && other.getServiceInfo()==null) || 
             (this.serviceInfo!=null &&
              java.util.Arrays.equals(this.serviceInfo, other.getServiceInfo()))) &&
            ((this.liquorInfo==null && other.getLiquorInfo()==null) || 
             (this.liquorInfo!=null &&
              java.util.Arrays.equals(this.liquorInfo, other.getLiquorInfo()))) &&
            ((this.tobaccoInfo==null && other.getTobaccoInfo()==null) || 
             (this.tobaccoInfo!=null &&
              java.util.Arrays.equals(this.tobaccoInfo, other.getTobaccoInfo()))) &&
            ((this.brandSecondInfo==null && other.getBrandSecondInfo()==null) || 
             (this.brandSecondInfo!=null &&
              java.util.Arrays.equals(this.brandSecondInfo, other.getBrandSecondInfo()))) &&
            ((this.golfInfo==null && other.getGolfInfo()==null) || 
             (this.golfInfo!=null &&
              java.util.Arrays.equals(this.golfInfo, other.getGolfInfo()))) &&
            ((this.cardInfo==null && other.getCardInfo()==null) || 
             (this.cardInfo!=null &&
              java.util.Arrays.equals(this.cardInfo, other.getCardInfo()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.product27Info==null && other.getProduct27Info()==null) || 
             (this.product27Info!=null &&
              java.util.Arrays.equals(this.product27Info, other.getProduct27Info()))) &&
            ((this.brandMainInfo==null && other.getBrandMainInfo()==null) || 
             (this.brandMainInfo!=null &&
              java.util.Arrays.equals(this.brandMainInfo, other.getBrandMainInfo()))) &&
            ((this.returnDesc==null && other.getReturnDesc()==null) || 
             (this.returnDesc!=null &&
              this.returnDesc.equals(other.getReturnDesc())));
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
        if (getServiceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLiquorInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLiquorInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLiquorInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTobaccoInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTobaccoInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTobaccoInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBrandSecondInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrandSecondInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrandSecondInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGolfInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGolfInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGolfInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getProduct27Info() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct27Info());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct27Info(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBrandMainInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrandMainInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrandMainInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnDesc() != null) {
            _hashCode += getReturnDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Body.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "Body"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "serviceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "ServiceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liquorInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "liquorInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "LiquorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tobaccoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "tobaccoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "TobaccoInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandSecondInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "brandSecondInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "BrandSecondInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("golfInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "golfInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "GolfInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "cardInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "CardInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product27Info");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "product27Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "Product27Info"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandMainInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "brandMainInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "BrandMainInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "returnDesc"));
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
