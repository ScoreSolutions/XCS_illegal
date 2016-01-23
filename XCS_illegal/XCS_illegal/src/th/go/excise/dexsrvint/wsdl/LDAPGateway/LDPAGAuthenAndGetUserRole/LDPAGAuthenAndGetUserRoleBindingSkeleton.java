/**
 * LDPAGAuthenAndGetUserRoleBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole;

public class LDPAGAuthenAndGetUserRoleBindingSkeleton implements th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRolePortType, org.apache.axis.wsdl.Skeleton {
    private th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRolePortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/schema/AuthenAndGetUserRole", "RequestObj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/schema/AuthenAndGetUserRole", "AuthenAndGetUserRoleRequest"), th.go.excise.dexsrvint.schema.AuthenAndGetUserRole.AuthenAndGetUserRoleRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("LDPAGAuthenAndGetUserRoleOperation", _params, new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/schema/AuthenAndGetUserRole", "ResponseObj"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/schema/AuthenAndGetUserRole", "AuthenAndGetUserRoleResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "LDPAGAuthenAndGetUserRoleOperation"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("LDPAGAuthenAndGetUserRoleOperation") == null) {
            _myOperations.put("LDPAGAuthenAndGetUserRoleOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("LDPAGAuthenAndGetUserRoleOperation")).add(_oper);
    }

    public LDPAGAuthenAndGetUserRoleBindingSkeleton() {
        this.impl = new th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRoleBindingImpl();
    }

    public LDPAGAuthenAndGetUserRoleBindingSkeleton(th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRolePortType impl) {
        this.impl = impl;
    }
    public th.go.excise.dexsrvint.schema.AuthenAndGetUserRole.AuthenAndGetUserRoleResponse LDPAGAuthenAndGetUserRoleOperation(th.go.excise.dexsrvint.schema.AuthenAndGetUserRole.AuthenAndGetUserRoleRequest requestObj) throws java.rmi.RemoteException
    {
        th.go.excise.dexsrvint.schema.AuthenAndGetUserRole.AuthenAndGetUserRoleResponse ret = impl.LDPAGAuthenAndGetUserRoleOperation(requestObj);
        return ret;
    }

}
