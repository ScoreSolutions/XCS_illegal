package com.ko.webapp.action;

import javax.servlet.http.*;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import com.ko.Constants;
import com.ko.domain.*;
import com.ko.domain.base.BaseView;
import com.ko.util.ConfigUtil;
import com.ko.util.DB;
import com.ko.service.MasterService;

import com.ko.sso.*;
import com.ko.webapp.bean.*;
import com.ko.webapp.util.RequestUtil;

import th.go.excise.dexsrvint.schema.AuthenAndGetUserRole.*;
import th.go.excise.dexsrvint.wsdl.LDAPGateway.LDPAGAuthenAndGetUserRole.*;

public class LoginAction extends BaseAction{
	
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	}
	
	private String sqlLoggedInMdlNoSSO(AuthAndRole auth)throws Exception{
		String mSql = "";
		//Login ไม่ผ่าน SSO
		//if (uData.chkUserRole(new Long(ConfigUtil.getConfig("AdminRoleID")))==false){  //ถ้าเป็นผู้ดูแลระบบ ก็ให้เข้าได้ทุกหน้าจอ
			mSql += "select distinct md.id,md.mdl_code,md.mdl_name,md.short_name, md.mdl_seq, md.indc_prog ";
			mSql += " from menu m ";
			mSql += " inner join module md on md.id=m.module_id";
			mSql += " inner join rolemenu rm on m.id=rm.menu_id";
			mSql += " inner join rolegrp rg on rg.id=rm.rolegrp_id";
			mSql += " inner join roleauth ra on rg.id=ra.rolegrp_id";
			mSql += " where md.indc_prog='1' and m.status='1' and rm.status='1'  and m.ref_menu_id is  null";
			mSql += " and ra.idcard_no = '" + uData.getIdCard() + "'";
			mSql += " order by md.mdl_seq";
		//}else{
			
		//}
		
		return mSql;
	}
	
	private String sqlLoggedInMnuNoSSO(String moID) throws Exception{
		String mnSql = "";
		mnSql += "select distinct m.id, m.module_id,m.menu_code,m.menu_name,m.short_name,m.menu_url,m.menu_seq ";
		mnSql += " from menu m ";
		mnSql += " inner join module md on md.id=m.module_id";
		mnSql += " inner join rolemenu rm on m.id=rm.menu_id";
		mnSql += " inner join rolegrp rg on rg.id=rm.rolegrp_id";
		mnSql += " inner join roleauth ra on rg.id=ra.rolegrp_id";
		mnSql += " where md.indc_prog='1' and m.status='1' ";
		mnSql += " and m.module_id = '" + moID + "' and rm.status='1' and m.ref_menu_id is  null";
		if (uData.chkUserRole(new Long(ConfigUtil.getConfig("AdminRoleID")))==false)  //ถ้าเป็นผู้ดูแลระบบ ก็ให้เข้าได้ทุกหน้าจอ
			mnSql += " and ra.idcard_no = '" + uData.getIdCard() + "'";
		mnSql += " order by m.menu_seq";
		
		return mnSql;
	}
	public String LoggedIn(AuthAndRole auth)throws Exception{
		String MenuCodeAdminEditCase = ConfigUtil.getConfig("MenuCodeAdminEditCase");
		String ret="";
		ret += "<ul id=\"ExciseMenu_ul\" style=\"display: none;\">\n";
		
		BaseView module = new BaseView(db);
		module.setViewName("MODULE");
		String mSql="";		
		try{
			if(uData.chkUserRole(new Long(ConfigUtil.getConfig("AdminRoleID")))==false){
				if(auth.getUserAndRole().getMessage().isSuccess()==true){			
					//Login ผ่าน SSO
					mSql += "select distinct md.id,md.mdl_code,md.mdl_name,md.short_name, md.mdl_seq, md.indc_prog ";
					mSql += " from menu m ";
					mSql += " inner join module md on md.id=m.module_id";
					mSql += " inner join rolemenu rm on m.id=rm.menu_id";
					mSql += " inner join rolegrp rg on rg.id=rm.rolegrp_id";
					mSql += " where md.indc_prog='1'  and m.ref_menu_id is  null";
					mSql += " and rg.role_code in (" + auth.getStrRole() + ") and m.status='1' and rm.status='1'";
					mSql += " order by md.mdl_seq";
					//log.debug(mSql);
				}else{
					mSql += sqlLoggedInMdlNoSSO(auth);
				}
			}else{
				mSql += " select md.id,md.mdl_code,md.mdl_name,md.short_name, md.mdl_seq, md.indc_prog";
				mSql += " from module md";
				mSql += " where md.indc_prog='1' ";
				mSql += " order by md.mdl_seq ";
			}
		}catch (Exception e){
			mSql += sqlLoggedInMdlNoSSO(auth);
		}
		//log.debug(mSql);
		
		List<Map<String,Object>> result = module.findBySql(mSql);
		//db.closedb();
		
		if (result.size()>0){
			for (Map<String, Object> mo : result) {
				ret += "	<li title='" + mo.get("mdl_name").toString() + "'>\n";
				ret += "		<a href=\"javascript:void(0)\" target=\"_self\" title='" + mo.get("mdl_name").toString() + "' >" + mo.get("short_name").toString() + "</a>\n";
				ret += "		<ul>\n";
				
				String mnSql="";
				try{
					if (uData.chkUserRole(new Long(ConfigUtil.getConfig("AdminRoleID")))==false){  //ถ้าเป็นผู้ดูแลระบบ ก็ให้เข้าได้ทุกหน้าจอ
						if(auth.getUserAndRole().getMessage().isSuccess()==true){
							mnSql += "select distinct m.id, m.module_id,m.menu_code,m.menu_name,m.short_name,m.menu_url,m.menu_seq ";
							mnSql += " from menu m ";
							mnSql += " inner join module md on md.id=m.module_id";
							mnSql += " inner join rolemenu rm on m.id=rm.menu_id";
							mnSql += " inner join rolegrp rg on rg.id=rm.rolegrp_id";
							mnSql += " where md.indc_prog='1'  ";
							mnSql += " and m.module_id = '" + mo.get("id").toString() + "' and m.ref_menu_id is  null";
							mnSql += " and rg.role_code in (" + auth.getStrRole() + ") and m.status='1' and rm.status='1'";
							mnSql += " order by m.menu_seq";
						}else{
							mnSql += sqlLoggedInMnuNoSSO(mo.get("id").toString());
						}
					}else{
						mnSql += "select m.id, m.module_id,m.menu_code,m.menu_name,m.short_name,m.menu_url,m.menu_seq ";
						mnSql += " from menu m ";
						mnSql += " where m.module_id = '" + mo.get("id").toString() + "' and m.ref_menu_id is null and m.status='1'";
						mnSql += " order by m.menu_seq";
					}
				}catch(Exception e){
					mnSql += sqlLoggedInMnuNoSSO(mo.get("id").toString());
				}
				
				
				BaseView menu = new BaseView(db);
				menu.setViewName("MENU");
				List<Map<String,Object>> me = menu.findBySql(mnSql);
				//db.closedb();
				for(Map<String, Object> mn : me) {
					ret += "			<li title='" + mn.get("menu_name").toString() + "'>\n";
					
					if(uData.getUsername().toLowerCase().equals("admin")==true){
						if(CheckAdminMenuCode(MenuCodeAdminEditCase, mn.get("menu_code").toString())==true){
							ret += "				<a href=\"" + mn.get("menu_url").toString() + "?UserName=" + uData.getUsername() + "&UserIDCard=" + uData.getIdCard() + "&time=" + System.currentTimeMillis() + "\"  target=\"_blank\" title='" + mn.get("menu_name").toString() + "' >" + mn.get("short_name").toString() + "</a>\n";
						}else{
							ret += "				<a href=\"" + mn.get("menu_url").toString() + "&time=" + System.currentTimeMillis() + "\"  target=\"_self\" title='" + mn.get("menu_name").toString() + "' >" + mn.get("short_name").toString() + "</a>\n";
						}
//						if(mn.get("menu_code").toString().equals(MenuCodeAdminEditCase)==true){
//							ret += "				<a href=\"" + mn.get("menu_url").toString() + "?UserName=" + uData.getUsername() + "&time=" + System.currentTimeMillis() + "\"  target=\"_blank\" title='" + mn.get("menu_name").toString() + "' >" + mn.get("short_name").toString() + "</a>\n";
//						}else{
//							ret += "				<a href=\"" + mn.get("menu_url").toString() + "&time=" + System.currentTimeMillis() + "\"  target=\"_self\" title='" + mn.get("menu_name").toString() + "' >" + mn.get("short_name").toString() + "</a>\n";
//						}
					}else{
						ret += "				<a href=\"" + mn.get("menu_url").toString() + "&time=" + System.currentTimeMillis() + "\"  target=\"_self\" title='" + mn.get("menu_name").toString() + "' >" + mn.get("short_name").toString() + "</a>\n";
					}
					ret += "			</li>\n";
				}
				ret += "		</ul>\n";
				ret += "	</li>\n";
	        }
		}
		ret += "</ul>\n";
		
		return ret;
	}
	
	private boolean CheckAdminMenuCode(String ConfigMenuCode, String CheckMenuCode) throws Exception{
		boolean ret=false;
		try{
			if (ConfigMenuCode.indexOf(CheckMenuCode)>-1){
				ret=true;
			}
			

//			log.debug(ConfigMenuCode);
//			String mnu[] = ConfigMenuCode.split("|"); 
//			for(int i=0;i<mnu.length-1;i++){
//				if(CheckMenuCode.equals(mnu)==true){
//					ret=true;
//					log.debug("CheckAdminMenuCode = True");
//					break;
//				}
//			}
		}
		catch(Exception e){
			log.debug("CheckAdminMenuCode = Exception ");
			ret=false;
		}
		return ret;
	}
	
	String idcard_no;
	boolean isAdmin;
	java.util.List<Object> userRole;


	  public static void main(String[] args) {
	   System.out.println("Hello from main");
	  }

	  private boolean chkUserMenu(AuthAndRole auth)throws Exception{
		  //ตรวจสอบว่าผู้ใช้มีสิทธิ์เข้าใช้เมนูแล้วหรือยัง
		  //ถ้ายังก็ไม่ต้องให้เข้าระบบเลย (จะเข้าไปทำไม ถ้าเข้าไปแล้วไม่เห็นเมนู ^o^)
		  	boolean ret = false;
			BaseView menu = new BaseView(db);
			menu.setViewName("MENU");
			String mSql="";
			try{
				if(auth.getUserAndRole().getMessage().isSuccess() == false){
					mSql += "select m.id ";
					mSql += " from menu m ";
					mSql += " inner join module md on md.id=m.module_id";
					mSql += " inner join rolemenu rm on m.id=rm.menu_id";
					mSql += " inner join rolegrp rg on rg.id=rm.rolegrp_id";
					mSql += " inner join roleauth ra on rg.id=ra.rolegrp_id";
					mSql += " where md.indc_prog='1' and m.status='1' and rm.status='1' and m.ref_menu_id is  null and rownum=1";
					if (isAdmin==false)  //ถ้าเป็นผู้ดูแลระบบ ก็ให้เข้าได้ทุกหน้าจอ
						mSql += " and ra.idcard_no = '" + uData.getIdCard() + "'";
				}else{
					mSql += sqlChkUserMenuNoSSO(auth);
				}
			}catch(Exception e){
				mSql += sqlChkUserMenuNoSSO(auth);
			}
			
			//log.debug(mSql);
			List<Map<String,Object>> result = menu.findBySql(mSql);
			if(result.size()==1)
				ret = true;
			
			db.closedb();
			return ret;
	  }
	  
	  private String sqlChkUserMenuNoSSO(AuthAndRole auth){
		  	String mSql = "";
		  	mSql += " select m.id ";
			mSql += " from menu m ";
			mSql += " inner join module md on md.id=m.module_id";
			mSql += " inner join rolemenu rm on m.id=rm.menu_id";
			mSql += " inner join rolegrp rg on rg.id=rm.rolegrp_id";
			mSql += " where rownum =1 ";
			if(isAdmin==false){
				if(!auth.getStrRole().equals(""))
					mSql += " and rg.role_code in (" + auth.getStrRole() + ")";
				else
					mSql += " and 1=1 ";
			}
			
			log.debug(mSql);
			return mSql;
	  }
	  
	  
	  public void chkLogin(HttpServletRequest request,HttpServletResponse response)throws Exception
	  {
		  	String nextPage="?page=index.jsp";
		    boolean loginStatus;
		    String _errMsg="";

		    HttpSession session = request.getSession();
		 		    
		    String userName = request.getParameter("username").trim().replace("'", "''");
			String pwd = request.getParameter("password").trim().replace("'", "''"); 
			if(userName.equals("")){
		    	_errMsg = "กรุณาระบุชื่อเข้าระบบ";
		    }else if(pwd.equals("")){
		    	_errMsg= "กรุณาระบุรหัสผ่าน";
		    }
		    	
			if(_errMsg.equals("")){
				AuthAndRole auth = new AuthAndRole();
			    auth.getSSOUserAuth(userName, pwd);
			    
				if(!userName.equals("admin")){
					if(ConfigUtil.getConfig("UseSSO").equals("Y")){
					    if(!auth.getErrMsg().equals("")){
					    	_errMsg = auth.getErrMsg();
					    }
					}else{
						if(chkUserProfile(userName,pwd, auth)==false){
							//_errMsg = "ชื่อเข้าระบบหรือรหัสผ่าน ไม่ถูกต้อง";
						}
					}
				}else{
					if(chkUserProfile(userName,pwd, auth)==false){
						_errMsg = "ชื่อเข้าระบบหรือรหัสผ่าน ไม่ถูกต้อง";
					}
				}
				
				if(_errMsg.equals("")){
			    	//ต้องเอา UserName ที่ส่งมาไป Request ที่ SSO เพื่อให้ได้ IDCard กลับมา
				    loginStatus = setLoginParms(userName,pwd, auth);
				    if (loginStatus){
				    	//กรณี Login ผ่านแล้ว
				    	if(uData.getLoginUser(idcard_no)==true){
				    		uData.setUsername(userName);
					    	create_by = Long.parseLong(uData.getIdCard());// get_from session
							update_by = Long.parseLong(uData.getIdCard());// get_from session
							offcode = uData.getOffcode();
							poscode = uData.getPoscode();
							offname = uData.getOffname();
							posname = uData.getPosname();
							create_by_name =  uData.getFullName();
							if(userRole != null){
								uData.setSSORole(userRole);
								log.debug("SSO Role");
							}else
								uData.setIllegalRole(new ArrayList());
							
							isAdmin = uData.IsAdmin();
		
							//ตรวจสอบว่าผู้ใช้มีสิทธิ์เข้าใช้เมนูหรือไม่
					    	if(chkUserMenu(auth)==true){
					    		if(db.chkConn()==false){
							    	_errMsg="ระบบฐานข้อมูลมีปัญหา ไม่สามารถติดต่อกับฐานข้อมูลได้";
							    	db.closedb();
					    		}else{
					    			SaveLoginHistory(auth,request);
					    			
					    			if( session.getAttribute(Constants.USER_SESSION) == null ){
										session.setAttribute(Constants.USER_SESSION, uData);
									}
					    			session.setAttribute("MyMenu", LoggedIn(auth));
					    			this.writeTranLog("เข้าสู่ระบบ");
					    			nextPage="?page=home2.jsp";
					    		}
					    	}else
					    		_errMsg = "ผู้ใช้ยังไม่ได้รับการกำหนดสิทธิ์การใช้งานระบบ";
				    	}else
				    		_errMsg = "ไม่พบรายชื่อผู้ใช้ในระบบ DPIS";
				    }else
				    	_errMsg = "ชื่อเข้าระบบหรือรหัสผ่านไม่ถูกต้อง";
			    }
			}

		    if(!_errMsg.equals(""))
		    	request.setAttribute("errMsg", _errMsg);
		    	
			//System.out.println("nextPage = " + nextPage);
			forward(nextPage,request,response);
	  }
	  
	  public boolean setLoginParms(String p_username,String p_password, AuthAndRole auth) throws Exception{
		  boolean ret=false;
		  try{
			  boolean SsoIsSuccess = auth.getUserAndRole().getMessage().isSuccess();
			  if(SsoIsSuccess == true){   //สมมติว่าตรวจสอบ Connection ของ SSO Webservice
				  idcard_no = auth.getUserIdcard();
				  userRole = auth.getRole();
				  ret = true;
				  log.debug("SSO Success");
			  }else{
				  log.debug("setLoginParms ");
				  ret = setLoginNoSSO(p_username, p_password);
			  }
		  }catch(Exception e){
			  //e.printStackTrace();
			  ret = setLoginNoSSO(p_username, p_password);
		  }

		  return ret;
	  }
	  
	  public void Logout (HttpServletRequest request,HttpServletResponse response)throws Exception{
		  try{
			  LoginHis lh = new LoginHis(db);
			  lh = lh.findByPk(uData.getLogin_his_id());
			  lh.setLogout_time(new Date());
			  lh.update();
			  
		  }catch(Exception e){
			  e.printStackTrace();
		  }finally{
			  db.closedb();
		  }
		  
		  HttpSession session = request.getSession();
		  session.invalidate();
		  response.sendRedirect("index.jsp?time=" + System.currentTimeMillis());
	  }
	  
	  private boolean setLoginNoSSO(String p_username, String p_password){
		  boolean ret = false;
		  String sql = "";
		  sql += " select st.empid, st.idcard_no, st.title_code, st.title_name, st.first_name, st.last_name, ";
		  sql += " st.poscode, st.posname, st.offcode, st.offname, st.staff_level, st.accuser_type, st.short_name";
		  sql += " from v_staff_list_popup st";
		  sql += " inner join user_tmp ut on ut.idcard_no=st.idcard_no ";
		  sql += " where ut.username = '" + p_username + "' and ut.pwd = '" + p_password + "'";

		  log.debug("No SSO : " + sql);
		  try{
			  Staff st = new Staff(db);
			  List<Map<String, Object>> stList = st.findBySql(sql,null);
			  if (stList.size()==1)
			  {
				  idcard_no = stList.get(0).get("idcard_no").toString();
				  ret=true;
			  }
		  }catch(Exception e){
			  ret = false;
		  }
		  return ret;
	  }
	  
	  private boolean chkUserProfile(String userName, String pwd, AuthAndRole auth){
		  boolean ret=false;
		  //AuthAndRole auth = new AuthAndRole();
		  UserSession chkUser = new UserSession();

		  if(auth.chkUserAuth(userName, pwd)==true){   //สมมติว่าตรวจสอบ Connection ของ SSO Webservice
			  ret = true;
			  //log.debug("chkUserProfile SSO Success");
		  }else{
			  ret = chkUser.chkProfile(userName, pwd);
			  //log.debug("chkUserProfile No SSO " + ret);
		  }
		  
		  return ret;
	  }
	  
	  private boolean chkWorking(String userName, HttpServletRequest request) throws Exception{
		  boolean ret = true;
		  try{
			  String ip_address = RequestUtil.getIpAddress(request);
			  LoginHis lh = new LoginHis(db);
			  String sql = "select max(id) id ";
			  sql += " from login_his ";
			  sql += " where username = '" + userName + "'";
			  
			  String maxID = lh.findBySql(sql).get(0).get("id").toString();
			  
			  String tlSql = "select case when to_char(tran_date + interval '20' minute, 'yyyy-mm-dd hh24:mi') > to_char(sysdate, 'yyyy-mm-dd hh24:mi') then '1' else '0' end chkTime ";
			  tlSql += " from tran_log ";
			  tlSql += " where login_his_id = '" + maxID + "' ";
			  tlSql += " order by id desc ";
				  
			  TranLog tl = new TranLog(db);
			  List<Map<String,Object>> tlList = tl.findBySql(tlSql);
			  if(tlList.size()>0){
				  lh = lh.findByPk(new Long(maxID));
				  
				  if(!lh.getIp_address().equals(ip_address) && tlList.get(0).get("chkTime").toString().equals("1")){
					  ret = false;
				  }
			  }
		  }catch(Exception e){
			  e.printStackTrace();
		  }finally{
			  db.closedb();
		  }
		  
		  return ret;
	  }
	  
	  private void SaveLoginHistory(AuthAndRole auth, HttpServletRequest request) throws Exception{
		  try{
			  String isSSO = "";
			  if(auth.getUserIdcard() != null)
				  isSSO = (auth.getUserAndRole().getMessage().isSuccess() == true ? "Y" : "N");
			  else
				  isSSO = "N";
			  
			  LoginHis lh = new LoginHis(db);
			  lh.setUsername(uData.getUsername());
			  lh.setIdcard_no(uData.getIdCard());
			  lh.setStaff_name(uData.getFullName());
			  lh.setStaff_posname(uData.getPosname());
			  lh.setStaff_offname(uData.getOffname());
			  lh.setLogin_time(new Date());
			  lh.setIs_sso(isSSO);
			  lh.setIp_address(RequestUtil.getIpAddress(request));
			  lh.setCreate_by(uData.getIdCard());
			  lh.setCreate_on(new Date());
			  
			  lh = lh.create();
			  if(lh != null){
				  uData.setLogin_his_id(lh.getId());
			  }
		  }catch(Exception e){
			  e.printStackTrace();
		  }finally{
			  db.closedb();
		  }
	  }
	  
	  private void SyncRDB(HttpServletRequest request,HttpServletResponse response)throws Exception{
		  SyncRDBAction sync = new SyncRDBAction();
		  MasterService service = new MasterService();
		  if(service.chkServiceConnection()==true){
			  //sync.SyncEdOffice(request, response);
			  //sync.SyncDutyGroup(request, response);
			  //sync.SyncDutyTable(request, response);
			  //sync.SyncProductType(request, response);
			  //sync.SyncUnit(request, response);
			  //sync.SyncCountry(request, response);
			  //sync.SyncTitle(request, response);
			  //sync.SyncProvince(request, response);
			  //sync.SyncDistrict(request, response);
			  //sync.SyncSubDistrict(request, response);
			  //sync.SyncDutyUnit(request,response);
		  }else
			  System.out.println("เชื่อมต่อ RDB WebService ไม่ได้");
	  }
}
