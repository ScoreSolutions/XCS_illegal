/**
 * PrcserviceEd_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pccth.prcservice;

public class PrcserviceEd_ServiceLocator extends org.apache.axis.client.Service implements com.pccth.prcservice.PrcserviceEd_Service {

    public PrcserviceEd_ServiceLocator() {
    }


    public PrcserviceEd_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PrcserviceEd_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for prcserviceEdSoapHttpPort
    private java.lang.String prcserviceEdSoapHttpPort_address = "http://web.excise.go.th/WebServices/prcserviceEdSoapHttpPort";

    public java.lang.String getprcserviceEdSoapHttpPortAddress() {
        return prcserviceEdSoapHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String prcserviceEdSoapHttpPortWSDDServiceName = "prcserviceEdSoapHttpPort";

    public java.lang.String getprcserviceEdSoapHttpPortWSDDServiceName() {
        return prcserviceEdSoapHttpPortWSDDServiceName;
    }

    public void setprcserviceEdSoapHttpPortWSDDServiceName(java.lang.String name) {
        prcserviceEdSoapHttpPortWSDDServiceName = name;
    }

    public com.pccth.prcservice.PrcserviceEd_PortType getprcserviceEdSoapHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(prcserviceEdSoapHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getprcserviceEdSoapHttpPort(endpoint);
    }

    public com.pccth.prcservice.PrcserviceEd_PortType getprcserviceEdSoapHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.pccth.prcservice.PrcserviceEdSoapHttpStub _stub = new com.pccth.prcservice.PrcserviceEdSoapHttpStub(portAddress, this);
            _stub.setPortName(getprcserviceEdSoapHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setprcserviceEdSoapHttpPortEndpointAddress(java.lang.String address) {
        prcserviceEdSoapHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pccth.prcservice.PrcserviceEd_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pccth.prcservice.PrcserviceEdSoapHttpStub _stub = new com.pccth.prcservice.PrcserviceEdSoapHttpStub(new java.net.URL(prcserviceEdSoapHttpPort_address), this);
                _stub.setPortName(getprcserviceEdSoapHttpPortWSDDServiceName());
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
        if ("prcserviceEdSoapHttpPort".equals(inputPortName)) {
            return getprcserviceEdSoapHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://prcservice.pccth.com/", "prcserviceEd");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://prcservice.pccth.com/", "prcserviceEdSoapHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("prcserviceEdSoapHttpPort".equals(portName)) {
            setprcserviceEdSoapHttpPortEndpointAddress(address);
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
