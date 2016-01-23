package com.ko.sso;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import javax.xml.rpc.ServiceException;

import org.jfree.util.Log;

import com.ko.Constants;

import th.go.excise.dexsrvint.schema.LdapUserBase.*;
import th.go.excise.dexsrvint.schema.AuthenAndGetUserRole.AuthenAndGetUserRoleRequest;
import th.go.excise.dexsrvint.schema.AuthenAndGetUserRole.AuthenAndGetUserRoleResponse;
import th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRolePortType;
import th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.LDPAGAuthenAndGetUserRoleServiceLocator;

public class AuthAndRole {
	String idcard_no;
	java.util.List<Object> roles;
	String strRole = "";
	AuthenAndGetUserRoleResponse userAndRole;
	String msgErr = "";
	
	private  LDPAGAuthenAndGetUserRolePortType getUserAndRoleService() {
		LDPAGAuthenAndGetUserRoleServiceLocator service = new LDPAGAuthenAndGetUserRoleServiceLocator();
		LDPAGAuthenAndGetUserRolePortType portType = null;
		try {
			portType = service.getLDPAGAuthenAndGetUserRolePort(new URL("http://192.168.3.92:5080/LDAPGateway/LDPAGAuthenAndGetUserRoleService"));
		} catch (MalformedURLException e) {
			System.out.println("No Connect SSO in Exception MalformedURLException");
		} catch (ServiceException e) {
			System.out.println("No Connect SSO in Exception ServiceException");
		}
		return portType;
	}
	
	public void getSSOUserAuth(String p_username,String p_password){
		try{
			AuthenAndGetUserRoleRequest req = new AuthenAndGetUserRoleRequest();
			req.setUserId(p_username);
			req.setPassword(p_password);
			req.setApplicationId("ILLEGAL");
			AuthenAndGetUserRoleResponse res = new AuthenAndGetUserRoleResponse();

			LDPAGAuthenAndGetUserRolePortType sso = getUserAndRoleService();
			res = sso.LDPAGAuthenAndGetUserRoleOperation(req);
			userAndRole = res;
			if(res.getMessage().isSuccess()==true){
				if(res.getRoles().length>0){
					idcard_no = res.getUserThaiId();
					//System.out.println("ROLENAME : " + res.getRoles()[0].getRoleName());
					roles = getRoleList(res.getRoles());
				}else{
					msgErr = "ผู้ใช้ไม่ได้รับการกำหนด Role ในระบบรักษาความปลอดภัยกลาง";
				}
			}else{
				System.out.println("res.getMessage() NO Success ###" + res.getMessage().getDescription());
				msgErr="SSO Message : " + res.getMessage().getDescription();
			}
		}catch(RemoteException e){
			//e.printStackTrace();
			System.out.println("No Network To Connect SSO");
			msgErr = "ไม่สามารถเชื่อมต่อกับระบบรักษาความปลอดภัยกลาง";
		}
	}
	
	public boolean chkUserAuth(String p_username,String p_password){
		boolean ret = false;
		try{
			AuthenAndGetUserRoleRequest req = new AuthenAndGetUserRoleRequest();
			req.setUserId(p_username);
			req.setPassword(p_password);
			req.setApplicationId("ILLEGAL");
		  
			AuthenAndGetUserRoleResponse res = new AuthenAndGetUserRoleResponse();
			LDPAGAuthenAndGetUserRolePortType sso = getUserAndRoleService();
			
			res = sso.LDPAGAuthenAndGetUserRoleOperation(req);
			ret = res.getMessage().isSuccess();
			if(ret==true){
				idcard_no = res.getUserThaiId();
				//System.out.println(idcard_no + "    HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
				roles = getRoleList(res.getRoles());
			}
		}catch(RemoteException e){
			ret = false;
			//System.out.println("false    HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		}
		
		return ret;
	}
	
	private java.util.List getRoleList(RoleBase[] listRole){
		java.util.List<Object> ret = new ArrayList();
		org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Constants.LOG_NAME);
		for(int i=0;i<listRole.length;i++){
			String roleName = listRole[i].getRoleName().replaceAll("cn=", "");
			
			log.debug("RoleName :" + listRole[i].getRoleName());
			
			ret.add(roleName);
			
			if(strRole.equals(""))
				strRole = "'" + roleName + "'"; 
			else
				strRole += ", " + "'" + roleName + "'"; 
		}
		
		log.debug("UserRole :" + strRole);
		
		return ret;
	}
	
	public String getUserIdcard(){
		return idcard_no;
	}
	public java.util.List getRole(){
		return roles;
	}
	public String getStrRole(){
		return strRole;
	}
	public AuthenAndGetUserRoleResponse getUserAndRole(){
		return userAndRole;
	}
	public String getErrMsg(){
		return msgErr;
	}
}
