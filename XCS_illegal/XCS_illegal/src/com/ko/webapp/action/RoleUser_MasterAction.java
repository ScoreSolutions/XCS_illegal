package com.ko.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.PreparedStatement;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.ko.util.DB;
import java.sql.ResultSet;
import com.ko.domain.*;
import com.ko.webapp.bean.UserSession;
import com.ko.util.ConfigUtil;

public class RoleUser_MasterAction extends BaseAction{

	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	}
	
	public void AddRoleAuth(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		DB db1 = new DB();
		PreparedStatement pre = null;
		String sql = "";
		sql += "select id, role_code, role_name, role_desc ";
		sql += " from rolegrp ";
		sql += " where id = '" + request.getParameter("id").toString() + "'";

		pre = db1.getParameterizedStatement(sql, null);
	 	ResultSet rs = pre.executeQuery();
	 	if (rs.next()){
	 		request.setAttribute("txtRoleID", rs.getObject("id").toString());
	 		request.setAttribute("txtRoleName", rs.getObject("role_name").toString());
	 	}
	 	
	 	EdOffice ed = new EdOffice(db);
	 	List<EdOffice> edList = ed.findAll();
	 	if(edList.size()>0)
	 		request.setAttribute("cmdOffcode", edList);
	 	
	 	HttpSession session = request.getSession();
	 	UserSession us = new UserSession();
	 	us = (UserSession)session.getAttribute("MYUSER");
	 	request.setAttribute("UserOffcode", us.getOffcode());
	 	
	 	pre.close();
	 	db1.closedb();
	 	pre = null;
	 	db1 = null;
	 	
		forward("?page=/Master/RoleUser.jsp");
	}
	
	public void SaveData(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		UserSession us = (UserSession)session.getAttribute("MYUSER");
		String roleID = request.getParameter("RoleID").toString();
		DB db1 = new DB();
		PreparedStatement pre1 = null;
		String sql1 = "delete from roleauth where rolegrp_id='" + roleID + "'";
		pre1 = db1.getParameterizedStatement(sql1, null);
		pre1.execute(sql1);
			String[] stIDCard = request.getParameterValues("aii_idcard_no");
			if(stIDCard != null){
				for(int i=0;i<stIDCard.length;i++){
					DB db2 = new DB();
					PreparedStatement pre2 = null;
					String createBy;
					if (us != null)
						createBy = us.getIdCard() + 0;
					else
						createBy = "0";
					
					String idCardLeader = request.getParameter("leader_idcardno" + (i+1));
					
					String Sql2 = "";
					Sql2 += "insert into roleauth ";
					Sql2 += " values(roleauth_seq.nextval,'" + roleID + "', '" + stIDCard[i] + "',";
					Sql2 += " '" + createBy + "', sysdate, '" + idCardLeader + "')";
					
					pre2 = db2.getParameterizedStatement(Sql2, null);
					pre2.execute();
					
					pre2.close();
					db2.closedb();
					pre2 = null;
					db2 = null;
				}
			}
		pre1.close();
		pre1=null;
		db1.closedb();
		db1 = null;

		request.setAttribute("completeMsg", "บันทึกข้อมูลเรียบร้อย");
		forward("process?action=RoleUser_Master&cmd=UpdateRoleAuth&id=" + roleID);
	}
	
	public void UpdateRoleAuth(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		String RoleID = request.getParameter("id").toString();
		DB db1 = new DB();
		PreparedStatement pre = null;
		String sql = "";
		sql += "select id, role_code, role_name, role_desc ";
		sql += " from rolegrp ";
		sql += " where id = '" + RoleID + "'";

		pre = db1.getParameterizedStatement(sql, null);
	 	ResultSet rs = pre.executeQuery();
	 	if (rs.next()){
	 		request.setAttribute("txtRoleID", rs.getObject("id").toString());
	 		request.setAttribute("txtRoleName", rs.getObject("role_name").toString());
	 	}
	 	
	 	EdOffice ed = new EdOffice(db);
	 	List<EdOffice> edList = ed.findAll();
	 	if(edList.size()>0)
	 		request.setAttribute("cmdOffcode", edList);
	 	
	 	HttpSession session = request.getSession();
	 	UserSession us = new UserSession();
	 	us = (UserSession)session.getAttribute("MYUSER");
	 	request.setAttribute("UserOffcode", us.getOffcode());
	 	
	 	String sqlLt = "";
	 	sqlLt += " select ra.id cc_id, ra.idcard_leader, ra.idcard_no staff_idcard_no,";
	 	sqlLt += " tiu.title_name, stu.first_name, stu.last_name,";
	 	sqlLt += " stu.poscode, psu.posname || ' ' || stu.staff_level posname, stu.offcode, edu.offname,";
	 	sqlLt += " til.title_name ltitle_name, stl.first_name lfirst_name, stl.last_name llast_name,";
	 	sqlLt += " stl.poscode lposcode, psl.posname || ' ' || stl.staff_level lposname, stl.offcode loffcode, edl.offname loffname";
	 	sqlLt += " from roleauth ra";
	 	sqlLt += " inner join staff stu on ra.idcard_no=stu.idcard_no";
	 	sqlLt += " left join title tiu on tiu.title_code=stu.title_code";
	 	sqlLt += " left join position psu on trim(psu.poscode)=trim(stu.poscode)";
	 	sqlLt += " left join ed_office edu on edu.offcode=stu.offcode";
	 	sqlLt += " left join staff stl on ra.idcard_leader=stl.idcard_no";
	 	sqlLt += " left join title til on til.title_code=stl.title_code";
	 	sqlLt += " left join position psl on trim(psl.poscode)=trim(stl.poscode)";
	 	sqlLt += " left join ed_office edl on edl.offcode=stl.offcode";
	 	sqlLt += " where ra.rolegrp_id= '" + RoleID + "'";
	 	
	 	List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
	 	pre = db1.getParameterizedStatement(sqlLt, null);
	 	rs = pre.executeQuery();
	 	result = db1.toArray(rs);
	 	request.setAttribute("aatlist", result);
	 	
	 	pre.close();
	 	db1.closedb();
	 	pre = null;
	 	db1 = null;
	 	
		forward("?page=/Master/RoleUser.jsp");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//ConfigUtil cu = new ConfigUtil();
		//System.out.println(cu.getConfig("report_path"));
		
		Date dd1 = new Date();
		
		System.out.println(dd1);

	}

}
