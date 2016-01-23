/**
 * LDPAGAuthenAndGetUserRoleServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole;

public class LDPAGAuthenAndGetUserRoleServiceLocator extends org.apache.axis.client.Service implements th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRoleService {

    public LDPAGAuthenAndGetUserRoleServiceLocator() {
    }


    public LDPAGAuthenAndGetUserRoleServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LDPAGAuthenAndGetUserRoleServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LDPAGAuthenAndGetUserRolePort
    private java.lang.String LDPAGAuthenAndGetUserRolePort_address = "http://192.168.3.92:5080/LDAPGateway/LDPAGAuthenAndGetUserRoleService";

    public java.lang.String getLDPAGAuthenAndGetUserRolePortAddress() {
        return LDPAGAuthenAndGetUserRolePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LDPAGAuthenAndGetUserRolePortWSDDServiceName = "LDPAGAuthenAndGetUserRolePort";

    public java.lang.String getLDPAGAuthenAndGetUserRolePortWSDDServiceName() {
        return LDPAGAuthenAndGetUserRolePortWSDDServiceName;
    }

    public void setLDPAGAuthenAndGetUserRolePortWSDDServiceName(java.lang.String name) {
        LDPAGAuthenAndGetUserRolePortWSDDServiceName = name;
    }

    public th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRolePortType getLDPAGAuthenAndGetUserRolePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LDPAGAuthenAndGetUserRolePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLDPAGAuthenAndGetUserRolePort(endpoint);
    }

    public th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRolePortType getLDPAGAuthenAndGetUserRolePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRoleBindingStub _stub = new th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRoleBindingStub(portAddress, this);
            _stub.setPortName(getLDPAGAuthenAndGetUserRolePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLDPAGAuthenAndGetUserRolePortEndpointAddress(java.lang.String address) {
        LDPAGAuthenAndGetUserRolePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRolePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRoleBindingStub _stub = new th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRoleBindingStub(new java.net.URL(LDPAGAuthenAndGetUserRolePort_address), this);
                _stub.setPortName(getLDPAGAuthenAndGetUserRolePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LDPAGAuthenAndGetUserRolePort".equals(inputPortName)) {
            return getLDPAGAuthenAndGetUserRolePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/wsdl/LDAPGateway/LDPAGAuthenAndGetUserRole", "LDPAGAuthenAndGetUserRoleService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dexsrvint.excise.go.th/wsdl/LDAPGateway/LDPAGAuthenAndGetUserRole", "LDPAGAuthenAndGetUserRolePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LDPAGAuthenAndGetUserRolePort".equals(portName)) {
            setLDPAGAuthenAndGetUserRolePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
