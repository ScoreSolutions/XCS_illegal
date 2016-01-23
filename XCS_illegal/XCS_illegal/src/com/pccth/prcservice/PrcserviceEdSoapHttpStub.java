/**
 * PrcserviceEdSoapHttpStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pccth.prcservice;

public class PrcserviceEdSoapHttpStub extends org.apache.axis.client.Stub implements com.pccth.prcservice.PrcserviceEd_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inquiryBrandMainOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryBrandMainOperationElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcReqHeader"), com.pccth.prcservice.types.InquiryPrcReqHeader.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcResHeader"));
        oper.setReturnClass(com.pccth.prcservice.types.InquiryPrcResHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryBrandMainOperationResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inquiryBrandSecondOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryBrandSecondOperationElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcReqHeader"), com.pccth.prcservice.types.InquiryPrcReqHeader.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcResHeader"));
        oper.setReturnClass(com.pccth.prcservice.types.InquiryPrcResHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryBrandSecondOperationResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inquiryCardOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryCardOperationElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcReqHeader"), com.pccth.prcservice.types.InquiryPrcReqHeader.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcResHeader"));
        oper.setReturnClass(com.pccth.prcservice.types.InquiryPrcResHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryCardOperationResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inquiryGolfOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryGolfOperationElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcReqHeader"), com.pccth.prcservice.types.InquiryPrcReqHeader.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcResHeader"));
        oper.setReturnClass(com.pccth.prcservice.types.InquiryPrcResHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryGolfOperationResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inquiryLiquorOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryLiquorOperationElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcReqHeader"), com.pccth.prcservice.types.InquiryPrcReqHeader.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcResHeader"));
        oper.setReturnClass(com.pccth.prcservice.types.InquiryPrcResHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryLiquorOperationResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inquiryProduct27Operation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryProduct27OperationElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcReqHeader"), com.pccth.prcservice.types.InquiryPrcReqHeader.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcResHeader"));
        oper.setReturnClass(com.pccth.prcservice.types.InquiryPrcResHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryProduct27OperationResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inquiryServiceOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryServiceOperationElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcReqHeader"), com.pccth.prcservice.types.InquiryPrcReqHeader.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcResHeader"));
        oper.setReturnClass(com.pccth.prcservice.types.InquiryPrcResHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryServiceOperationResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inquiryTobaccoOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryTobaccoOperationElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcReqHeader"), com.pccth.prcservice.types.InquiryPrcReqHeader.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcResHeader"));
        oper.setReturnClass(com.pccth.prcservice.types.InquiryPrcResHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "inquiryTobaccoOperationResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

    }

    public PrcserviceEdSoapHttpStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PrcserviceEdSoapHttpStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PrcserviceEdSoapHttpStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "Body");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.Body.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "BodyGen1");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.BodyGen1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "BrandMainInfo");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.BrandMainInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "BrandSecondInfo");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.BrandSecondInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "CardInfo");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.CardInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "GolfInfo");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.GolfInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "Header");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.Header.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcReqHeader");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.InquiryPrcReqHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "InquiryPrcResHeader");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.InquiryPrcResHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "LiquorInfo");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.LiquorInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "ParameterAppend");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.ParameterAppend.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "Product27Info");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.Product27Info.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "ServiceInfo");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.ServiceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://prcservice.pccth.com/types/", "TobaccoInfo");
            cachedSerQNames.add(qName);
            cls = com.pccth.prcservice.types.TobaccoInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryBrandMainOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://prcservice.pccth.com//inquiryBrandMainOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inquiryBrandMainOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) org.apache.axis.utils.JavaUtils.convert(_resp, com.pccth.prcservice.types.InquiryPrcResHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryBrandSecondOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://prcservice.pccth.com//inquiryBrandSecondOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inquiryBrandSecondOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) org.apache.axis.utils.JavaUtils.convert(_resp, com.pccth.prcservice.types.InquiryPrcResHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryCardOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://prcservice.pccth.com//inquiryCardOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inquiryCardOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) org.apache.axis.utils.JavaUtils.convert(_resp, com.pccth.prcservice.types.InquiryPrcResHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryGolfOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://prcservice.pccth.com//inquiryGolfOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inquiryGolfOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) org.apache.axis.utils.JavaUtils.convert(_resp, com.pccth.prcservice.types.InquiryPrcResHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryLiquorOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://prcservice.pccth.com//inquiryLiquorOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inquiryLiquorOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) org.apache.axis.utils.JavaUtils.convert(_resp, com.pccth.prcservice.types.InquiryPrcResHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryProduct27Operation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://prcservice.pccth.com//inquiryProduct27Operation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inquiryProduct27Operation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) org.apache.axis.utils.JavaUtils.convert(_resp, com.pccth.prcservice.types.InquiryPrcResHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryServiceOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://prcservice.pccth.com//inquiryServiceOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inquiryServiceOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) org.apache.axis.utils.JavaUtils.convert(_resp, com.pccth.prcservice.types.InquiryPrcResHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryTobaccoOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://prcservice.pccth.com//inquiryTobaccoOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inquiryTobaccoOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pccth.prcservice.types.InquiryPrcResHeader) org.apache.axis.utils.JavaUtils.convert(_resp, com.pccth.prcservice.types.InquiryPrcResHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
