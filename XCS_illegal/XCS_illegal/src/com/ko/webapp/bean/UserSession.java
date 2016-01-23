package com.ko.webapp.bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.util.Log;

import com.ko.Constants;
import com.ko.sso.*;

import com.ko.domain.Staff;
import com.ko.domain.MENU;
import com.ko.domain.ROLEGRP;
import com.ko.util.ConfigUtil;
import com.ko.util.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
public class UserSession  {
	
	private Long userId;
	private String username="";
	private String IdCard="";
	private String titleCode="";
	private String titleName="";
	private String firstName="";
	private String lastName="";
	private String poscode="";
	private String posname="";
	private String offcode="";
	private String offname="";
	private String shortname="";
	private String INDCOff = "";
	private String staffLevel="";
	private String accuserType = "";
	private String isAdmin="";
	private java.util.List userRole = new ArrayList<Object>();
	private Long login_his_id;
	org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Constants.LOG_NAME);
	
	private String _err="";
	
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	//private List<String> userRights=new ArrayList<String>();
	public String getUsername() {
		return username;
	}
	public void setUsername(String value){
		username = value;
	}
	
	public String getIdCard()
	{
		return IdCard;
	}
	
	public String getTitleCode()
	{
		return titleCode;
	}
	
	public String getTitleName()
	{
		return titleName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getFullName()
	{
		return titleName + firstName + " " + lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getPoscode()
	{
		return poscode;
	}
	
	public String getPosname()
	{
		return posname;
	}
	
	public String getOffcode()
	{
		return offcode;
	}
	
	public String getOffname()
	{
		return offname;
	}
	
	public String getShortName()
	{
		return shortname;
	}
	
	public String getINDCOff(){
		return INDCOff;
	}
	
	public String getStaffLevel()
	{
		return staffLevel;
	}
	
	public String getAccuserType(){
		return accuserType;
	}
	
	public boolean IsAdmin() throws Exception {
		return chkUserRole(new Long(ConfigUtil.getConfig("AdminRoleID")));
	}
	
	public java.util.List getUserRole(){
		return userRole;
	}
	
	
	
	public Long getLogin_his_id(){
		return login_his_id;
	}
	public void setLogin_his_id(Long value){
		login_his_id = value;
	}
	
	public void setSSORole(java.util.List value) throws Exception{
		userRole = value;
		//ใช้กรณีผู้ใช้ Login ด้วย SSO
	}
	
	public void setIllegalRole(java.util.List value) throws Exception
	{
		//ใช้กรณีที่ผู้ใช้ไม่ได้ Login ด้วย SSO
		DB db1 = new DB();
		PreparedStatement pre = null;
		String sql = "";
		sql += " select distinct rg.role_code ";
		sql += " from roleauth ra ";
		sql += " inner join rolegrp rg on ra.rolegrp_id=rg.id ";
		sql += " where ra.idcard_no = '" + IdCard + "'";
		pre = db1.getParameterizedStatement(sql, null);
		ResultSet rs = pre.executeQuery();
		
		while(rs.next()){
			value.add(rs.getObject("role_code").toString());
		}

		pre.close();
		db1.closedb();
		pre = null;
		db1 = null;
		
		userRole = value;
	}
	public boolean chkUserRole(Long roleID)
	{
		boolean ret = false;
		if(userRole != null && userRole.size()>0){
			//log.debug("UserRoleSize = " + userRole.size());
			try{
				com.ko.util.DB db = new com.ko.util.DB();
				ROLEGRP rg = new ROLEGRP(db);
				
				List<Map<String,Object>> lGroup = rg.findBySql("select role_code from rolegrp where id=" + roleID);
				if(lGroup.size()>0){
					for(int i=0;i<userRole.size();i++){
						//System.out.println("ChkuserRole : " + userRole.get(i) + "  #### " + rs.getObject("role_code").toString());
						if(userRole.get(i).equals(lGroup.get(0).get("role_code").toString())){
							return true;
						}
					}
				}
				db.closedb();
				db = null;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return ret;
	}
	public boolean chkUserMenu(String menuID) throws Exception{
		boolean ret = false;
		if(IsAdmin()==false){
			try{
				DB db = new DB();
				String sql="";
				sql += "select rm.rolegrp_id, rm.menu_id, rg.role_code "; 
				sql += " from rolemenu rm ";
				sql += " inner join rolegrp rg on rg.id=rm.rolegrp_id";
				sql += " where rm.status='1' and rm.menu_id = '" + menuID + "' ";
				//log.debug(sql + " GGGGGGGGGGGGGGGGG");
				MENU m = new MENU(db);
				List<Map<String,Object>> mList = m.findBySql(sql);
				if(mList.size()>0){
					for(int i=0;i<mList.size();i++){
						for(int j=0;j<userRole.size();j++){
							//System.out.println("chkUserMenu : " + userRole.get(i) + "  #### " + mList.get(i).get("role_code").toString());
							if(userRole.get(j).equals(mList.get(i).get("role_code").toString())){
								return true;
							}
						}
					}
				}
				
				db.closedb();
			}
			catch(Exception e){
				ret = false;
			}
		}else{
			ret = true;
		}
		//log.debug(ret + "  $$$$$$$$$$$$$$$$");
		return ret;
	}
	
	public String getSqlSubOrdinate(String userIDCard,String menuID){
		String ret = "";
		ret += " select ra.idcard_no ";
		ret += " from roleauth ra ";
		ret += " inner join rolemenu rm on ra.rolegrp_id=rm.rolegrp_id ";
		ret += " where ra.idcard_leader='" + userIDCard + "' and rm.menu_id='" + menuID + "'";
		ret += " union ";
		ret += " select  ra.idcard_no";
		ret += " from roleauth ra";
		ret += " inner join rolemenu rm on ra.rolegrp_id=rm.rolegrp_id ";
		ret += " where ra.idcard_leader in (select idcard_no from roleauth where idcard_leader = '" + userIDCard + "') ";
		ret += " and rm.menu_id='" + menuID + "'";
		ret += " union ";
		ret += " select  ra.idcard_no";
		ret += " from roleauth ra";
		ret += " inner join rolemenu rm on ra.rolegrp_id=rm.rolegrp_id ";
		ret += " where ra.idcard_leader in (select idcard_no from roleauth where idcard_leader in ";
		ret += " (select idcard_no from roleauth where idcard_leader = '" + userIDCard + "')) ";
		ret += " and rm.menu_id='" + menuID + "'";
		
		return ret;
	}
	
	public boolean getLoginUser(String idCardNo) throws Exception
	{
		boolean ret = true;
		if(!idCardNo.equals("") && idCardNo != null){
	
			DB db = new DB();
			Staff st = new Staff(db);
			
			String sql = "";
			sql += " select st.empid, st.idcard_no, st.title_code, st.title_name, st.first_name, st.last_name, ";
			sql += " st.poscode, st.posname, st.offcode, st.offname, st.staff_level, st.accuser_type, st.short_name, st.indc_off";
			sql += " from v_staff_list_popup st";
			//sql += " inner join user_tmp ut on ut.idcard_no=st.idcard_no ";
			sql += " where st.idcard_no = '" + idCardNo + "'";
			List<Map<String, Object>> stList = st.findBySql(sql,null);
			//log.debug(sql);
			if (stList.size()==1)
			{
				userId = (stList.get(0).get("id")!=null ? ((BigDecimal)stList.get(0).get("id")).longValue() : 0);
				//username = userName; //stList.get(0).get("username").toString();
				IdCard = (stList.get(0).get("idcard_no") != null ? stList.get(0).get("idcard_no").toString() : "");
				titleCode = (stList.get(0).get("title_code") != null ? stList.get(0).get("title_code").toString() : "");
				titleName = (stList.get(0).get("title_name") != null ? stList.get(0).get("title_name").toString() : "");
				firstName = (stList.get(0).get("first_name") != null ? stList.get(0).get("first_name").toString() : "");
				lastName = (stList.get(0).get("last_name") != null ? stList.get(0).get("last_name").toString() : "");
				poscode = (stList.get(0).get("poscode") != null ? stList.get(0).get("poscode").toString() : "");
				posname = (stList.get(0).get("posname") != null ? stList.get(0).get("posname").toString() : "");
				offcode = (stList.get(0).get("offcode") != null ? stList.get(0).get("offcode").toString() : "");
				offname = (stList.get(0).get("offname") != null ? stList.get(0).get("offname").toString() : "");
				shortname = (stList.get(0).get("short_name") != null ? stList.get(0).get("short_name").toString() : "");
				INDCOff = (stList.get(0).get("indc_off") != null ? stList.get(0).get("indc_off").toString() : "");
				staffLevel = (stList.get(0).get("staff_level") != null ? stList.get(0).get("staff_level").toString() : "");
				accuserType = (stList.get(0).get("accuser_type") != null ? stList.get(0).get("accuser_type").toString() : "");
				//isAdmin = 
			}else{
				ret = false;
			}
			
			db.closedb();
		}else{
			ret = false;
		}

		return ret;
	}
	
	public boolean chkProfile(String userName, String pwd){
		boolean ret = false;
		try{
			DB db = new DB();
			Staff st = new Staff(db);
			String sql = "";
			sql += " select st.idcard_no";
			sql += " from v_staff_list_popup st";
			sql += " inner join user_tmp ut on ut.idcard_no=st.idcard_no ";
			sql += " where ut.username = '" + userName + "' and ut.pwd = '" + pwd + "'";
		
			log.debug(sql);
			List<Map<String, Object>> stList = st.findBySql(sql,null);
			if (stList.size()==1)
				ret = true;
			
			db.closedb();
			db = null;
		}catch (Exception e){
			ret = false;
			//_err
		}
		return ret;
	}
}
