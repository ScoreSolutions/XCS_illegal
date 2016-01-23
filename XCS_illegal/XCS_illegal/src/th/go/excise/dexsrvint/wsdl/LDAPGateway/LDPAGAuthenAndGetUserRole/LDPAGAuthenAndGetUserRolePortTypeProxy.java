package th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole;

public class LDPAGAuthenAndGetUserRolePortTypeProxy implements th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRolePortType {
  private String _endpoint = null;
  private th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRolePortType lDPAGAuthenAndGetUserRolePortType = null;
  
  public LDPAGAuthenAndGetUserRolePortTypeProxy() {
    _initLDPAGAuthenAndGetUserRolePortTypeProxy();
  }
  
  public LDPAGAuthenAndGetUserRolePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initLDPAGAuthenAndGetUserRolePortTypeProxy();
  }
  
  private void _initLDPAGAuthenAndGetUserRolePortTypeProxy() {
    try {
      lDPAGAuthenAndGetUserRolePortType = (new th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRoleServiceLocator()).getLDPAGAuthenAndGetUserRolePort();
      if (lDPAGAuthenAndGetUserRolePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lDPAGAuthenAndGetUserRolePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lDPAGAuthenAndGetUserRolePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lDPAGAuthenAndGetUserRolePortType != null)
      ((javax.xml.rpc.Stub)lDPAGAuthenAndGetUserRolePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRolePortType getLDPAGAuthenAndGetUserRolePortType() {
    if (lDPAGAuthenAndGetUserRolePortType == null)
      _initLDPAGAuthenAndGetUserRolePortTypeProxy();
    return lDPAGAuthenAndGetUserRolePortType;
  }
  
  public th.go.excise.dexsrvint.schema.AuthenAndGetUserRole.AuthenAndGetUserRoleResponse LDPAGAuthenAndGetUserRoleOperation(th.go.excise.dexsrvint.schema.AuthenAndGetUserRole.AuthenAndGetUserRoleRequest requestObj) throws java.rmi.RemoteException{
    if (lDPAGAuthenAndGetUserRolePortType == null)
      _initLDPAGAuthenAndGetUserRolePortTypeProxy();
    return lDPAGAuthenAndGetUserRolePortType.LDPAGAuthenAndGetUserRoleOperation(requestObj);
  }
  
  
}