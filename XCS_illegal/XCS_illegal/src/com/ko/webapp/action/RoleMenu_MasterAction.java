package com.ko.webapp.action;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ko.webapp.util.ParameterUtil;
import com.ko.util.*;
import com.ko.domain.MENU;
import com.ko.domain.MODULE;
import com.ko.domain.ROLEGRP;
import com.ko.domain.ROLEMENU;

public class RoleMenu_MasterAction extends BaseAction{

	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
//	MENU mn = new MENU(db);
//		
//		String sql=" select mn.id,mn.MENU_NAME,md.MDL_NAME,mn.UPD_DATE ";
//			sql += " from menu mn inner join module md on mn.module_id=md.id ";
//			sql += " where mn.status='1' ";
//			sql += " order by md.mdl_name, mn.menu_name";
//		//System.out.println(sql);
//		List ListMENU = mn.findBySql(sql);
//		System.out.println(sql);
//		request.setAttribute("mn", ListMENU);
//		String RoleName = ParameterUtil.getStringParam("role_name", request);
		forward("?page=/Master/RoleMenu.jsp");
//		log.debug("List dataq="+ListMENU);
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		MENU mn = new MENU(db);
		
		String sql=" select mn.id menu_id,mn.MENU_NAME,md.MDL_NAME, '0' status ";
			sql += " from menu mn inner join module md on mn.module_id=md.id ";
			sql += " where mn.status='1'";
			sql += " order by md.mdl_seq, mn.menu_seq";
			
		List ListMENU = mn.findBySql(sql);
		request.setAttribute("rg", ListMENU);
		String RoleName = ParameterUtil.getStringParam("role_name", request);
		forward("?page=/Master/RoleMenu.jsp");

	}

	public void save(HttpServletRequest request,HttpServletResponse response)throws Exception {	
		DB db1 = new DB();
		PreparedStatement pre1 = null;

		String RoleID = request.getParameter("RoleID").toString();
		String roleCode = request.getParameter("RoleCode").toString().trim().replace("'", "''");
		String roleName = request.getParameter("RoleName").toString().trim().replace("'", "''");
		String roleDesc = request.getParameter("RoleDesc").toString().trim().replace("'", "''");

		if(chkDupData(roleName, roleCode, RoleID)==false){
			String[] checkbox = request.getParameterValues("rgStatus");
			
			if(checkbox!=null){
				//set value
				String sql;
				if(RoleID.equals("")){
					pre1 = db1.getParameterizedStatement("select rolegrp_seq.nextval roleID from dual", null);
					ResultSet rs = pre1.executeQuery();
					
					while(rs.next())
						RoleID = rs.getObject("roleID").toString();
					
					sql = "INSERT INTO ROLEGRP (ID, ROLE_CODE, ROLE_NAME, ROLE_DESC, UPD_USERID, UPD_DATE) ";
					sql += "VALUES ('" + RoleID + "','" + roleCode + "','"+roleName+"','" + roleDesc+"','" + create_by + "',SYSDATE)";
				}else{
					sql = "update rolegrp ";
					sql += " set role_code='" + roleCode + "',";
					sql += " role_name='" + roleName + "',";
					sql += " role_desc='" + roleDesc + "',";
					sql += " upd_userid='" + update_by + "',";
					sql += " upd_date=sysdate ";
					sql += " where id = '" + RoleID + "'";
				}
	
				pre1 = db1.getParameterizedStatement(sql, null);
				pre1.execute();
				
				
				//Delete before insert ROLEMENU
				pre1 = db1.getParameterizedStatement("delete from rolemenu where rolegrp_id = '" + RoleID + "'", null);
				pre1.execute();
				
				pre1.close();
				db1.closedb();
				pre1 = null;
				db1 = null;
				
				//Set Item
				String[] mns =  request.getParameterValues("menu_id");
				
				int j = 0;
				for(int i = 0 ;i<mns.length;i++){
					String vStatus = "0";
					if(j < checkbox.length){
						if (checkbox[j].equals(mns[i])){
							vStatus = "1";
							j++;
							System.out.println(j);
						}
					}
					String Rolemenu = "INSERT INTO ROLEMENU (ID, ROLEGRP_ID, MENU_ID, STATUS, CREATE_BY, CREATE_ON) ";
					Rolemenu += "VALUES (rolemenu_seq.nextval,'"+ RoleID +"','"+ mns[i].toString() +"','" + vStatus + "','0',SYSDATE)";
					DB db2 = new DB();
					PreparedStatement pre2 = null;
					pre2 = db2.getParameterizedStatement(Rolemenu, null);
					pre2.execute();
					//request.setAttribute("txtMsg", "<font color='green'><b>บันทึกข้อมูลเรียบร้อย</b></font>");
					
					pre2.close();
					db2.closedb();
					pre2 = null;
					db2 = null;
					request.setAttribute("txtMsg", "บันทึกข้อมูลเรียบร้อย");
				}
			}else{
				request.setAttribute("txtMsg", "<font color='red'><b>กรุณาเลือกเมนูที่ต้องการกำหนดสิทธิ์</b></font>");
			}
		}else{
			request.setAttribute("txtMsg", "<font color='red'><b>รหัสหรือชื่อ Role ซ้ำ</b></font>");
		}

		getRoleMenuData(RoleID,request,response);
	}
	
	private boolean chkDupData(String roleName, String roleCode, String roleID) throws Exception{
		boolean ret=false;
		String sql;
		sql = "select id from rolegrp where upper(role_code)=upper('" + roleCode + "') and id<>nvl('" + roleID + "',0)";
		DB db1 = new DB();
		PreparedStatement pre1 = null;
		pre1 = db1.getParameterizedStatement(sql, null);
		if(pre1.executeQuery().next())
			ret = true;
		else{
			sql = "select id from rolegrp where upper(role_name)=upper('" + roleName + "') and id<>nvl('" + roleID + "',0)";
			pre1 = db1.getParameterizedStatement(sql, null);
			if(pre1.executeQuery().next())
				ret = true;
		}
		pre1.close();
		db1.closedb();
		pre1 = null;
		db1 = null;
		
		return ret;
	}
	
	private void getRoleMenuData(String RoleID, HttpServletRequest request,HttpServletResponse response) throws Exception {

		ROLEMENU Rme = new ROLEMENU(db);

		DB db1 = new DB();
		PreparedStatement pre = null;
		ResultSet rs;
		String sql = "";
		sql += "select Rg.id, Rg.role_code, Rg.role_name, Rg.role_desc ";
		sql += " from rolegrp Rg";
		sql += " where Rg.id = '" + RoleID + "'";
		
		pre = db1.getParameterizedStatement(sql, null);
		rs = pre.executeQuery();
		
		if(rs.next()){
			request.setAttribute("roleID", RoleID);
			request.setAttribute("roleName", rs.getObject("role_name").toString());
			request.setAttribute("roleCode", rs.getObject("role_code").toString());
			request.setAttribute("roleDesc", rs.getObject("role_desc").toString());
		}
		
		String sqlLt = "";
	 	sqlLt += " select rg.id, mn.id menu_id,mo.mdl_name,mn.menu_name, nvl(rg.status,'0') status";
	 	sqlLt += " from menu mn";
	 	sqlLt += " inner join module mo on mo.id=mn.module_id";
	 	sqlLt += " left join rolemenu rg on rg.menu_id=mn.id and rg.rolegrp_id='" + RoleID + "'";
	 	sqlLt += " where mn.status='1'";
	 	sqlLt += " order by mo.mdl_seq, mn.menu_seq";

		List<Map<String,Object>> ListMENU = Rme.findBySql(sqlLt);

		request.setAttribute("rg",  ListMENU);
		forward("?page=/Master/RoleMenu.jsp");
	}
	
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String RoleID = request.getParameter("id");
		getRoleMenuData(RoleID,request,response);
	}
}