package com.ko.webapp.action;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;

import com.ko.util.DB;
import com.ko.webapp.util.ParameterUtil;

import com.ko.domain.ROLEGRP;
//import com.ko.domain.ROLEMENU;

public class Role_MasterAction extends BaseAction{
	String menuID="47";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
				
		if(uData.chkUserMenu(menuID)==true){
			ROLEGRP rolegrp = new ROLEGRP(db);
			String sql = "select st.id, st.role_name from rolegrp st ";
			sql += " order by st.role_code ";
			String countSql = "select count(*) from rolegrp";
			Integer totalRow = rolegrp.countBySql(countSql, null);
			pageUtil.setTotalRow(totalRow);
			pageUtil.setPageSize(20); 
			List rvlist = rolegrp.findBySql(sql, null, pageUtil);
			request.setAttribute("rv", rvlist);
			
			forward("?page=/Master/Role.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ROLEGRP rolegrp = new ROLEGRP(db);
		String sql = "select st.id, st.role_name from rolegrp st ";
		String sqlCount ="select count(*) from rolegrp st ";
		String order = "order by st.role_name ";
		StringBuffer where = new StringBuffer("where 1=1 ");
		String name = request.getParameter("txtname");
		int i;
		if(!name.trim().equals("")){
			where.append("and st.role_name like ?");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i, "'%"+name+"%'");
		}
		log.debug("sql="+sql+where.toString()+order.toString());
		Integer totalRow = rolegrp.countBySql(sqlCount+where.toString()+order.toString(), null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20); 
		List rvlist = rolegrp.findBySql(sql+where.toString()+order.toString(), null, pageUtil);
		log.debug(rvlist);
		request.setAttribute("rv", rvlist);
		forward("?page=/Master/Role.jsp");
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
//		String[] ids =  request.getParameterValues("id");
//		if( ids!=null && ids.length>0 ){
//			ROLEGRP na = new ROLEGRP(db);
//			List<Long> idList = new ArrayList<Long>();
//			for( int i=0;i<ids.length;i++ )
//				idList.add(new Long(ids[i]));
//			int deleteRow = na.deleteByPks(idList);
//		}
//		redirect("process?action=Role_Master");
		String RoleID = request.getParameter("id");
		
		DB db1 = new DB();
		PreparedStatement pre1 = null;
		pre1 = db1.getParameterizedStatement("delete from rolemenu where rolegrp_id='" + RoleID + "'", null);
		pre1.execute();
		
		pre1 = db1.getParameterizedStatement("delete from roleauth where rolegrp_id='" + RoleID + "'", null);
		pre1.execute();
		
		pre1.close();
		db1.closedb();
		pre1 = null;
		db1 = null;
		
		ROLEGRP rg = new ROLEGRP(db);
		rg.deleteByPk(Long.parseLong(RoleID));
		redirect("process?action=Role_Master");
		
	}
	private boolean chkConstraint(String roleID)throws Exception{
		boolean ret = true;
		String sql;
		DB db1 = new DB();
		PreparedStatement pre1 = null;
		ResultSet rs;
		
		sql = "select id from rolemenu where rolegrp_id='" + roleID + "' and rownum=1";
		pre1 = db1.getParameterizedStatement(sql, null);
		rs = pre1.executeQuery();
		if(rs.next())
			ret = false;
		else{
			sql = "select id from roleauth where rolegrp_id='" + roleID + "' and rownum=1";
			pre1 = db1.getParameterizedStatement(sql, null);
			rs = pre1.executeQuery();
			if(rs.next())
				ret = false;
		}
		
		pre1.close();
		db1.closedb();
		pre1 = null;
		db1 = null;
		
		return ret;
	}

}
