package com.pccth.prcservice;

public class PrcserviceEdProxy implements com.pccth.prcservice.PrcserviceEd_PortType {
  private String _endpoint = null;
  private com.pccth.prcservice.PrcserviceEd_PortType prcserviceEd_PortType = null;
  
  public PrcserviceEdProxy() {
    _initPrcserviceEdProxy();
  }
  
  public PrcserviceEdProxy(String endpoint) {
    _endpoint = endpoint;
    _initPrcserviceEdProxy();
  }
  
  private void _initPrcserviceEdProxy() {
    try {
      prcserviceEd_PortType = (new com.pccth.prcservice.PrcserviceEd_ServiceLocator()).getprcserviceEdSoapHttpPort();
      if (prcserviceEd_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)prcserviceEd_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)prcserviceEd_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (prcserviceEd_PortType != null)
      ((javax.xml.rpc.Stub)prcserviceEd_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pccth.prcservice.PrcserviceEd_PortType getPrcserviceEd_PortType() {
    if (prcserviceEd_PortType == null)
      _initPrcserviceEdProxy();
    return prcserviceEd_PortType;
  }
  
  public com.pccth.prcservice.types.InquiryPrcResHeader inquiryBrandMainOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException{
    if (prcserviceEd_PortType == null)
      _initPrcserviceEdProxy();
    return prcserviceEd_PortType.inquiryBrandMainOperation(parameters);
  }
  
  public com.pccth.prcservice.types.InquiryPrcResHeader inquiryBrandSecondOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException{
    if (prcserviceEd_PortType == null)
      _initPrcserviceEdProxy();
    return prcserviceEd_PortType.inquiryBrandSecondOperation(parameters);
  }
  
  public com.pccth.prcservice.types.InquiryPrcResHeader inquiryCardOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException{
    if (prcserviceEd_PortType == null)
      _initPrcserviceEdProxy();
    return prcserviceEd_PortType.inquiryCardOperation(parameters);
  }
  
  public com.pccth.prcservice.types.InquiryPrcResHeader inquiryGolfOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException{
    if (prcserviceEd_PortType == null)
      _initPrcserviceEdProxy();
    return prcserviceEd_PortType.inquiryGolfOperation(parameters);
  }
  
  public com.pccth.prcservice.types.InquiryPrcResHeader inquiryLiquorOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException{
    if (prcserviceEd_PortType == null)
      _initPrcserviceEdProxy();
    return prcserviceEd_PortType.inquiryLiquorOperation(parameters);
  }
  
  public com.pccth.prcservice.types.InquiryPrcResHeader inquiryProduct27Operation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException{
    if (prcserviceEd_PortType == null)
      _initPrcserviceEdProxy();
    return prcserviceEd_PortType.inquiryProduct27Operation(parameters);
  }
  
  public com.pccth.prcservice.types.InquiryPrcResHeader inquiryServiceOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException{
    if (prcserviceEd_PortType == null)
      _initPrcserviceEdProxy();
    return prcserviceEd_PortType.inquiryServiceOperation(parameters);
  }
  
  public com.pccth.prcservice.types.InquiryPrcResHeader inquiryTobaccoOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException{
    if (prcserviceEd_PortType == null)
      _initPrcserviceEdProxy();
    return prcserviceEd_PortType.inquiryTobaccoOperation(parameters);
  }
  
  
}