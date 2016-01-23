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

public class Divide_staff_popForArrestAction extends BaseAction{


	public void pre(HttpServletRequest request,HttpServletResponse response)throws Exception{
		InspectorTeam team= new InspectorTeam(db);
		String tSql = "select * from inspector_team order by inspector_code";
		List<Map<String,Object>> teamlist=team.findBySql(tSql);
		//System.out.println(teamlist);

		request.setAttribute("teamlist", teamlist);
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("empid",request.getParameter("id"));
		request.setAttribute("posname",request.getParameter("posname"));
		request.setAttribute("poscode",request.getParameter("poscode"));
		request.setAttribute("offname",request.getParameter("offname"));
		request.setAttribute("offcode",request.getParameter("offcode"));
		request.setAttribute("actype",request.getParameter("actype"));
		//log.debug("pre -->actype="+request.getParameter("actype"));
		//System.out.println("/Popup/divide_staff_pop.jsp");


	}



	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		V_STAFF_LIST_POPUP v = new V_STAFF_LIST_POPUP(db);
		V_STAFF_LIST_POPUP cv = new V_STAFF_LIST_POPUP(db);
		String sql="" ;
		String sql0 ;
		String sql2;

		pre(request,response);
		String actype1 = request.getParameter("actype");
		
		//log.debug("actype="+actype1);
		ArrayList<String> alcon= new ArrayList();
		ArrayList<String> alin = new ArrayList();
		sql0 = " select IDCARD_NO,TITLE_NAME,FIRST_NAME,LAST_NAME,POSNAME,OFFNAME,poscode,offcode, per_type_name ";
		sql0 += " from V_ACCUSER_LIST_POPUP ";
		sql0 += " where 1 = 1 ";
		if (!actype1.equals(""))
			sql0 += " and ACCUSER_TYPE ='"+actype1+"' ";
		
		sql2 = "select count(*) from V_ACCUSER_LIST_POPUP ";
		sql2 += "where 1 = 1 ";
		if (!actype1.equals(""))
			sql2 += " and ACCUSER_TYPE ='"+actype1+"' ";
		
		alcon.add(" AND FIRST_NAME like '%");
		alin.add(request.getParameter("txtfname")+"%'");
		alcon.add(" AND LAST_NAME like '%");
		alin.add(request.getParameter("txtlname")+"%'");
		alcon.add(" AND POSNAME like '%");
		alin.add(request.getParameter("txtposname")+"%'");
		alcon.add(" AND OFFNAME like '%");
		alin.add(request.getParameter("txtoffname")+"%'");
		alcon.add(" AND team_code like '%");
		alin.add(request.getParameter("teamname")+"%'");
		
		for(int i = 0; i < alin.size();i++){
			if(alin.get(i).equals("%'")){alcon.set(i, "");
			alin.set(i,"");}
			sql += alcon.get(i) + alin.get(i);
		}

		Integer totalRow = cv.countBySql(sql2+sql, null);
		pageUtil.setTotalRow(totalRow);
		log.debug(totalRow);
		log.debug(sql);
		//List leList = cv.findBySql(sql, null);


		//request.setAttribute("lePList", leList);
		//List divide_staff = cv.findByWhere("where TITLE_CODE = '0001' ", null);
		log.debug("V_ACCUSER_LIST_POPUP="+sql0);
		List divide_staff = v.findBySql(sql0+sql, null,pageUtil);

		log.debug(divide_staff);
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("empid",request.getParameter("id"));
		request.setAttribute("posname",request.getParameter("posname"));
		request.setAttribute("poscode",request.getParameter("poscode"));
		request.setAttribute("offname",request.getParameter("offname"));
		request.setAttribute("offcode",request.getParameter("offcode"));
		request.setAttribute("actype",request.getParameter("actype"));
		request.setAttribute("divide_staffList", divide_staff);

		forward("/Popup/staff_popForArrest.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		pre(request,response);
		forward("/Popup/staff_popForArrest.jsp", request, response);
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
			request.setAttribute("title", title);
			request.setAttribute("formname",request.getParameter("formname"));
			request.setAttribute("empid",request.getParameter("id"));
			//request.setAttribute("actype",request.getParameter("actype"));
			forward("Popup/arrest_accuser_pop.jsp", request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug("error : StaffAction : findStaff ");
			e.printStackTrace();
		}

	}
}
