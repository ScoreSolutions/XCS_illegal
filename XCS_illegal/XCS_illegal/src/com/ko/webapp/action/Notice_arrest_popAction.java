package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.ApplicationNoticeArrest;
import com.ko.domain.InspectorTeam;
import com.ko.domain.Lawbreaker;
import com.ko.domain.Title;
import com.ko.webapp.util.ParameterUtil;

public class Notice_arrest_popAction extends BaseAction{
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("empid",request.getParameter("id"));
		request.setAttribute("posname",request.getParameter("posname"));
		request.setAttribute("poscode",request.getParameter("poscode"));
		request.setAttribute("offname",request.getParameter("offname"));
		request.setAttribute("offcode",request.getParameter("offcode"));
		forward("/Popup/notice_arrest_pop.jsp", request, response);
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
		Lawbreaker lb = new Lawbreaker(db);
		InspectorTeam ti = new InspectorTeam(db);

		String sql1="select count(*) from application_notice_arrest ana left join lawbreaker lb on lb.lawbreaker_no=ana.lawbreaker_no " +
				" left join title ti on lb.TITLE_CODE = ti.title_code " +
				" where ana.del_flag='N' ";
	String sql2="select ana.id application_notice_arrest_id, ana.notice_no, ana.notice_date,to_char(ana.notice_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') notice_date2,ana.inform_name, nvl(ana.lawbreaker_name, lb.title_code|| lb.first_name || ' ' || lb.middle_name || ' ' || lb.last_name) lawbreaker_name from application_notice_arrest ana left join lawbreaker lb on lb.lawbreaker_no=ana.lawbreaker_no " +
			" left join title ti on lb.TITLE_CODE = ti.title_code  " +
			" where ana.del_flag='N' ";

		//System.out.println(request.getParameter("date_start"));
		//System.out.println(request.getParameter("date_end"));
		//System.out.println(request.getParameter("notice_start"));
		//System.out.println(request.getParameter("notice_end"));

		StringBuffer where = new StringBuffer("");
		String order="order by ana.notice_no desc";

		Date date_start = ParameterUtil.getDateParam("date_start", request);
		Date date_end = ParameterUtil.getDateParam("date_end", request);
		String INFORM_Name = ParameterUtil.getStringParam("INFORM_Name", request);
		String no_start = ParameterUtil.getStringParam("notice_start", request);
		String no_end = ParameterUtil.getStringParam("notice_end", request);
		
		String GuiltBase = ParameterUtil.getStringParam("GuiltBase",request);
		String StartDate = request.getParameter("date_start");
		String EndDate = request.getParameter("date_end");
		int a;
		// genereate where
		if( !no_start.equals("") && !no_end.equals("")){
			where.append(" AND ana.notice_no between ? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+no_start+"'");
			where.append(" AND ? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+no_end+"'");
			System.out.println(where.toString());
		}
		if( date_start != null && date_end != null ){
			where.append(" AND add_months(to_date(ana.notice_date),6516) between to_date(?) ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+StartDate+"','dd/mm/yyyy'");
			where.append(" AND to_date(?)");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+EndDate+"','dd/mm/yyyy'");
			System.out.println(where.toString());
		}
		if( !INFORM_Name.trim().equals("") ){
			where.append(" AND ana.inform_name like ? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'%"+INFORM_Name+"%'");
		}
		if( !GuiltBase.trim().equals("") ){
			where.append(" AND ana.lawbreaker_name like ? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'%"+GuiltBase+"%'");
		}


		System.out.println(sql2+where.toString());
		//ana.findBySql(sql1+where.toString(), null, pageUtil);
		Integer totalRow = ana.countBySql(sql1+where.toString(), null);
		pageUtil.setTotalRow(totalRow);

		
		List notice_list = ana.findBySql(sql2+where.toString()+order, null,pageUtil);
		//System.out.println(notice_list);
		request.setAttribute("ntList", notice_list);
		request.setAttribute("noticeno",request.getParameter("noticeno"));
		request.setAttribute("id",request.getParameter("id"));
		request.setAttribute("informname",request.getParameter("informname"));

		forward("/Popup/notice_arrest_pop.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute("noticeno",request.getParameter("noticeno"));
		request.setAttribute("id",request.getParameter("id"));
		request.setAttribute("informname",request.getParameter("informname"));
		//request.setAttribute("poscode",request.getParameter("poscode"));
		//request.setAttribute("offname",request.getParameter("offname"));
		//request.setAttribute("offcode",request.getParameter("offcode"));
		forward("/Popup/notice_arrest_pop.jsp", request, response);

	}

}
