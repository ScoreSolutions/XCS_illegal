package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.InspectorTeam;
import com.ko.domain.base.BaseEdOffice;

public class Ed_office_popAction extends BaseAction{

	public void pre(HttpServletRequest request,HttpServletResponse response)throws Exception{
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("formcode",request.getParameter("formcode"));
		request.setAttribute("formpos", request.getParameter("formpos")); // add by mu
		forward("/Popup/division_pop.jsp", request, response);

	}

	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		BaseEdOffice office_pop = new BaseEdOffice(db);
		String sql ="";
		String slsql  ;
		String countsql;


		ArrayList<String> alcon= new ArrayList();
		ArrayList<String> alin = new ArrayList();
		slsql = "select OFFCODE,SHORT_NAME from ED_OFFICE where 1 = 1";
		countsql = "select count(*) from ED_OFFICE where 1 = 1";
		alcon.add(" AND OFFCODE like '%");
		alin.add(request.getParameter("txt_offcode")+"%'");
		alcon.add(" AND OFFNAME like '%");
		alin.add(request.getParameter("txt_offname")+"%'");
		for(int i = 0; i < alin.size();i++){
			if(alin.get(i).equals("%'")){alcon.set(i, "");
			alin.set(i,"");}
			sql += alcon.get(i) + alin.get(i);
		}
		String sqlOrder = " order by offcode ";



		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("formcode",request.getParameter("formcode"));
		request.setAttribute("formpos", request.getParameter("formpos")); //add by mu
		Integer totalRow = office_pop.countBySql(countsql+sql, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		List office_list = office_pop.findBySql(slsql+sql+sqlOrder, null,pageUtil);
		//log.debug(office_list);
		request.setAttribute("Ed_officeList", office_list);
		forward("/Popup/division_pop.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		pre(request,response);
	}
	
	public void listSub(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BaseEdOffice office_pop = new BaseEdOffice(db);
		String slsql  ;
		String countsql;


		ArrayList<String> alcon= new ArrayList();
		ArrayList<String> alin = new ArrayList();
		slsql = "select OFFCODE,SHORT_NAME from ED_OFFICE where 1 = 1";
		countsql = "select count(*) from ED_OFFICE where 1 = 1";
		String subOffcode = request.getParameter("sub_offcode"); 
		if(subOffcode.endsWith("0000")){
			//กรณีสังกัดเป็นภาค ให้แสดงรายการเฉพาะชื่อจังหวัดที่อยู่ในภาคนั้น
			slsql += " and substr(offcode,1,2) = '" + subOffcode.substring(0,2) + "' and substr(offcode,5,6) = '00'";
			countsql += " and substr(offcode,1,2) = '" + subOffcode.substring(0,2) + "' and substr(offcode,5,6) = '00'";
		}else if(subOffcode.endsWith("00")){
			//กรณีสังกัดเป็นจังหวัด ให้แสดงเฉพาะรายชื่อสาขาของจังหวัดนั้น
			slsql += " and substr(offcode,1,4) = '" + subOffcode.substring(0,4) + "' and substr(offcode,5,6) <> '00'";
			countsql += " and substr(offcode,1,4) = '" + subOffcode.substring(0,4) + "' and substr(offcode,5,6) <> '00'";
		}
		slsql += " order by offcode ";
		log.debug(subOffcode + " #### " + slsql);
		log.debug(subOffcode + " #### " + countsql);
		//alcon.add(" AND OFFCODE like '%");
		//alin.add(subOffcode+"%'");
		//alcon.add(" AND OFFNAME like '%");
		//alin.add(request.getParameter("txt_offname")+"%'");
		//for(int i = 0; i < alin.size();i++){
		//	if(alin.get(i).equals("%'")){alcon.set(i, "");
		//	alin.set(i,"");}
		//	sql += alcon.get(i) + alin.get(i);
		//}

		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("formcode",request.getParameter("formcode"));
		request.setAttribute("sub_offcode", request.getParameter("sub_offcode")); //add by mu
		Integer totalRow = office_pop.countBySql(countsql, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		List office_list = office_pop.findBySql(slsql, null,pageUtil);
		//log.debug(office_list);
		request.setAttribute("Ed_officeList", office_list);
		forward("/Popup/division_pop.jsp", request, response);
	}

}
