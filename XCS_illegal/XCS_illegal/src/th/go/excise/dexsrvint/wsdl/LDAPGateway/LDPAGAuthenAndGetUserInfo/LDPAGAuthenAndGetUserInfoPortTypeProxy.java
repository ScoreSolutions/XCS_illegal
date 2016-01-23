package th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserInfo;

public class LDPAGAuthenAndGetUserInfoPortTypeProxy implements th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserInfo.LDPAGAuthenAndGetUserInfoPortType {
  private String _endpoint = null;
  private th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserInfo.LDPAGAuthenAndGetUserInfoPortType lDPAGAuthenAndGetUserInfoPortType = null;
  
  public LDPAGAuthenAndGetUserInfoPortTypeProxy() {
    _initLDPAGAuthenAndGetUserInfoPortTypeProxy();
  }
  
  public LDPAGAuthenAndGetUserInfoPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initLDPAGAuthenAndGetUserInfoPortTypeProxy();
  }
  
  private void _initLDPAGAuthenAndGetUserInfoPortTypeProxy() {
    try {
      lDPAGAuthenAndGetUserInfoPortType = (new th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserInfo.LDPAGAuthenAndGetUserInfoServiceLocator()).getLDPAGAuthenAndGetUserInfoPort();
      if (lDPAGAuthenAndGetUserInfoPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lDPAGAuthenAndGetUserInfoPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lDPAGAuthenAndGetUserInfoPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lDPAGAuthenAndGetUserInfoPortType != null)
      ((javax.xml.rpc.Stub)lDPAGAuthenAndGetUserInfoPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserInfo.LDPAGAuthenAndGetUserInfoPortType getLDPAGAuthenAndGetUserInfoPortType() {
    if (lDPAGAuthenAndGetUserInfoPortType == null)
      _initLDPAGAuthenAndGetUserInfoPortTypeProxy();
    return lDPAGAuthenAndGetUserInfoPortType;
  }
  
  public th.go.excise.dexsrvint.schema.AuthenAndGetUserInfo.AuthenAndGetUserInfoResponse LDPAGAuthenAndGetUserInfoOperation(th.go.excise.dexsrvint.schema.AuthenAndGetUserInfo.AuthenAndGetUserInfoRequest requestObj) throws java.rmi.RemoteException{
    if (lDPAGAuthenAndGetUserInfoPortType == null)
      _initLDPAGAuthenAndGetUserInfoPortTypeProxy();
    return lDPAGAuthenAndGetUserInfoPortType.LDPAGAuthenAndGetUserInfoOperation(requestObj);
  }
  
  
}