package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.Staff;
import com.ko.domain.Title;
import com.ko.domain.InspectorTeam;
import com.ko.domain.V_STAFF_LIST_POPUP;

import com.ko.domain.Legislation;
import com.ko.domain.base.BaseIndictment;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.ParameterUtil;

public class Divide_staff_poplistAction extends BaseAction{


	public void pre(HttpServletRequest request,HttpServletResponse response)throws Exception{
		InspectorTeam team= new InspectorTeam(db);
		String tSql = "select * from inspector_team where status='1' order by inspector_code";
		List<Map<String,Object>> teamlist=team.findBySql(tSql);
		//log.debug(teamlist);

		request.setAttribute("teamlist", teamlist);
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("empid",request.getParameter("id"));
		request.setAttribute("posname",request.getParameter("posname"));
		request.setAttribute("poscode",request.getParameter("poscode"));
		request.setAttribute("offname",request.getParameter("offname"));
		request.setAttribute("offcode",request.getParameter("offcode"));
		request.setAttribute("showOther", request.getParameter("showOther"));



	}



	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		V_STAFF_LIST_POPUP v = new V_STAFF_LIST_POPUP(db);
		V_STAFF_LIST_POPUP cv = new V_STAFF_LIST_POPUP(db);
		String sql="" ;
		String sql0="";
		String sql2="";

		pre(request,response);

		if(request.getParameter("showOther").equals("")){
			sql0 = "select IDCARD_NO,TITLE_NAME,FIRST_NAME,LAST_NAME,POSNAME,OFFNAME, ";
			sql0 += " poscode,offcode, staff_level, team_code, per_type_name, title_code ";
			sql0 += " from V_STAFF_LIST_POPUP ";
			sql0 += " where 1 = 1 ";
			
			sql2 = "select count(*) from V_STAFF_LIST_POPUP where 1 = 1 ";
		}else{
			sql0 = "select IDCARD_NO,TITLE_NAME,FIRST_NAME,LAST_NAME,POSNAME,OFFNAME, ";
			sql0 += " poscode,offcode, staff_level, team_code, per_type_name, title_code ";
			sql0 += " from V_ACCUSER_LIST_POPUP ";
			sql0 += " where 1 = 1 ";
			
			sql2 = "select count(*) from V_ACCUSER_LIST_POPUP where 1 = 1 ";
			request.setAttribute("showOther", request.getParameter("showOther"));
		}
		
		String sqlWh="";
		if(!request.getParameter("txtfname").equals(""))
			sqlWh += " and first_name like '%" + request.getParameter("txtfname") + "%'";
		if(!request.getParameter("txtlname").equals(""))
			sqlWh += " and last_name like '%" + request.getParameter("txtlname") + "%'";
		if(!request.getParameter("txtposname").equals(""))
			sqlWh += " and posname || staff_level like '%" + request.getParameter("txtposname") + "%'";
		if(!request.getParameter("txtoffname").equals(""))
			sqlWh += " and (offname like '%" + request.getParameter("txtoffname") + "%' or short_name like '%" + request.getParameter("txtoffname") + "%') ";
		if(!request.getParameter("teamname").equals(""))
			sqlWh += " and team_code = '" + request.getParameter("teamname") + "'";


		Integer totalRow = cv.countBySql(sql2+sqlWh, null);
		pageUtil.setTotalRow(totalRow);
		log.debug(sql0+sqlWh+" order by offcode, first_name, last_name");
		List divide_staff = v.findBySql(sql0+sqlWh+" order by offcode, first_name, last_name", null,pageUtil);

		//log.debug("list staff="+divide_staff);
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("empid",request.getParameter("id"));
		request.setAttribute("posname",request.getParameter("posname"));
		request.setAttribute("poscode",request.getParameter("poscode"));
		request.setAttribute("offname",request.getParameter("offname"));
		request.setAttribute("offcode",request.getParameter("offcode"));
		request.setAttribute("divide_staffList", divide_staff);

		forward("/Popup/divide_staff_poplist.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		pre(request,response);
		forward("/Popup/divide_staff_poplist.jsp", request, response);
	}


	public void findStaff(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Staff staff = new Staff(db);
		Title title = new Title(db);

		Object[] q = {"%"+request.getParameter("FIRST_NAME")+"%","%"+request.getParameter("LAST_NAME")+"%"};
		log.debug("title_code "+ staff.getTitle_code());
		title= title.findByPk(staff.getTitle_code());
		try {
			List<Staff> stafflist = staff.findByWhere("FIRST_NAME like ? and LAST_NAME like ? ",q);
			request.setAttribute("stafflist", stafflist);
			log.debug(stafflist);
			request.setAttribute("title", title);
			request.setAttribute("formname",request.getParameter("formname"));
			request.setAttribute("empid",request.getParameter("id"));
			forward("Popup/arrest_accuser_pop.jsp", request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug("error : StaffAction : findStaff ");
			e.printStackTrace();
		}

	}
}
