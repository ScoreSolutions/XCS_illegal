/**
 * AuthenAndGetUserRoleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.go.excise.dexsrvint.schema.AuthenAndGetUserRole;

public class AuthenAndGetUserRoleResponse  extends th.go.excise.dexsrvint.schema.LdapUserBase.UserInfoBase  implements java.io.Serializable {
    private th.go.excise.dexsrvint.schema.LdapUserBase.MessageBase message;

    private th.go.excise.dexsrvint.schema.LdapUserBase.RoleBase[] roles;

    public AuthenAndGetUserRoleResponse() {
    }

    public AuthenAndGetUserRoleResponse(
           java.lang.String userThaiId,
           java.lang.String userThaiName,
           java.lang.String userThaiSurname,
           java.lang.String userEngName,
           java.lang.String userEngSurname,
           java.lang.String title,
           java.lang.String userId,
           java.lang.String email,
           java.lang.String cnName,
           java.lang.String telephoneNo,
           java.lang.String officeId,
           java.lang.String accessAttr,
           th.go.excise.dexsrvint.schema.LdapUserBase.MessageBase message,
           th.go.excise.dexsrvint.schema.LdapUserBase.RoleBase[] roles) {
        super(
            userThaiId,
            userThaiName,
            userThaiSurname,
            userEngName,
            userEngSurname,
            title,
            userId,
            email,
            cnName,
            telephoneNo,
            officeId,
            accessAttr);
        this.message = message;
        this.roles = roles;
    }


    /**
     * Gets the message value for this AuthenAndGetUserRoleResponse.
     * 
     * @return message
     */
    public th.go.excise.dexsrvint.schema.LdapUserBase.MessageBase getMessage() {
        return message;
    }


    /**
     * Sets the message value for this AuthenAndGetUserRoleResponse.
     * 
     * @param message
     */
    public void setMessage(th.go.excise.dexsrvint.schema.LdapUserBase.MessageBase message) {
        this.message = message;
    }


    /**
     * Gets the roles value for this AuthenAndGetUserRoleResponse.
     * 
     * @return roles
     */
    public th.go.excise.dexsrvint.schema.LdapUserBase.RoleBase[] getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this AuthenAndGetUserRoleResponse.
     * 
     * @param roles
     */
    public void setRoles(th.go.excise.dexsrvint.schema.LdapUserBase.RoleBase[] roles) {
        this.roles = roles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenAndGetUserRoleResponse)) return false;
        AuthenAndGetUserRoleResponse other = (AuthenAndGetUserRoleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              java.util.Arrays.equals(this.roles, other.getRoles())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoles(), i);
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
        new org.apache.axis.description.TypeDesc(AuthenAndGetUserRoleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/schema/AuthenAndGetUserRole", "AuthenAndGetUserRoleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/schema/AuthenAndGetUserRole", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/schema/LdapUserBase", "MessageBase"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/schema/AuthenAndGetUserRole", "roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/schema/LdapUserBase", "RoleBase"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/schema/LdapUserBase", "role"));
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
