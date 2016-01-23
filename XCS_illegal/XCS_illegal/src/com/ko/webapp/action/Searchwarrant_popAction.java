package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.ApplicationSearchWarrant;
import com.ko.util.DateUtil;
import com.ko.webapp.util.ParameterUtil;

public class Searchwarrant_popAction extends BaseAction{
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("/Popup/searchwarrant_pop.jsp", request, response);
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSearchWarrant asw =new ApplicationSearchWarrant(db);
		String sql1="";
		String sql2="";
		sql1="select asw.id application_search_warrant_id, nvl(asw.warrant_no,'-') warrant_no, asw.warrant_date, "+
			"to_char(asw.warrant_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') warrant_date2,"+
			"asw.owner_name, asw.jedge_name "+
			"from application_search_warrant asw where asw.warrant_date is not null and asw.offcode_request = '" + uData.getOffcode() + "' ";

		sql2="select count(*) from application_search_warrant asw where asw.warrant_date is not null and asw.offcode_request = '" + uData.getOffcode() + "' ";
		//StringBuffer where = new StringBuffer("");
		String whText = "";
		
		if(!request.getParameter("warrant_start").equals(""))
			whText += " and asw.warrant_no >= '" + request.getParameter("warrant_start") + "'";
		if(!request.getParameter("warrant_end").equals(""))
			whText += " and asw.warrant_no <= '" + request.getParameter("warrant_end") + "'";
		if(!request.getParameter("date_start").equals(""))
			whText += " and to_char(asw.warrant_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("date_start")) + "'";
		if(!request.getParameter("date_end").equals(""))
			whText += " and to_char(asw.warrant_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("date_end")) + "'";
		if(!request.getParameter("OWNER_name").equals(""))
			whText += " and asw.owner_name like '%" + request.getParameter("OWNER_name") + "%'";
		if(!request.getParameter("JEDGE_name").equals(""))
			whText += " and asw.jedge_name like '%" + request.getParameter("JEDGE_name") + "%'";
		
		String order="order by asw.warrant_no desc";

		Integer totalRow = asw.countBySql(sql2+whText, null);
		pageUtil.setTotalRow(totalRow);

		List warrant_list = asw.findBySql(sql1+whText+order, null, pageUtil);
		System.out.println(warrant_list);
		request.setAttribute("wrList", warrant_list);
		request.setAttribute("warrantno",request.getParameter("warrantno"));
		request.setAttribute("id",request.getParameter("id"));
		forward("/Popup/searchwarrant_pop.jsp", request, response);

	}

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		request.setAttribute("warrantno",request.getParameter("warrantno"));
		request.setAttribute("id",request.getParameter("id"));

		forward("/Popup/searchwarrant_pop.jsp", request, response);
	}

}
