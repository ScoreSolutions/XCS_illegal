package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.ApplicationSincereConfirm;
import com.ko.webapp.util.ParameterUtil;

public class sincere_confirmAction extends BaseAction{
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("/Popup/sincere_confirm_pop.jsp", request, response);
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String sql1="select count(*) from application_sincere_confirm asi where 1=1 ";
		String sql2="select asi.id application_sincere_confirm_id,asi.track_no, asi.input_date,"+
		" to_char(asi.input_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') input_date2, "+
		"asi.detect_result "+
		"from application_sincere_confirm asi where 1=1 ";

		String order="order by asi.track_no desc";
		ApplicationSincereConfirm asi = new ApplicationSincereConfirm(db);
		StringBuffer where =new StringBuffer("");
		//get input
		Date dateStart = ParameterUtil.getDateParam("DateStart", request);
		Date dateEnd = ParameterUtil.getDateParam("DateEnd", request);
		String SearchT = ParameterUtil.getStringParam("textSearch", request);
		String Start227 = ParameterUtil.getStringParam("Start227", request);
		String end227 = ParameterUtil.getStringParam("End227", request);
		String start =request.getParameter("DateStart");
		String end =request.getParameter("DateEnd");
		System.out.println(start);
		int a;
		if( dateStart != null && dateEnd != null ){

			where.append(" and add_months(to_date(asi.input_date),6516) between to_date(?)");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a,"'"+start+"','dd/mm/yyyy'");
			where.append(" and to_date(?) ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a,"'"+end+"','dd/mm/yyyy'");
		}
		if( !SearchT.trim().equals("") ){
			where.append("and asi.detect_result like ? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a,"'%"+SearchT+"%'");
		}
		if (!Start227.trim().equals("")){
			where.append("and asi.track_no between ? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a,"'"+Start227+"'");
			where.append("and ? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a,"'"+end227+"'");
		}


		//page
		System.out.println("sql1="+sql1+where.toString());
		System.out.println("sql2="+sql2+where.toString()+order);
		sql1+=where.toString();
		Integer totalRow = asi.countBySql(sql1,null);
		System.out.println(totalRow);
		pageUtil.setTotalRow(totalRow);

		//query
		List sc_list = asi.findBySql(sql2+where.toString()+order, null,pageUtil);
		System.out.println(sc_list);
		request.setAttribute("scList", sc_list);
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("empid",request.getParameter("id"));
		request.setAttribute("posname",request.getParameter("posname"));
		request.setAttribute("poscode",request.getParameter("poscode"));
		request.setAttribute("offname",request.getParameter("offname"));
		request.setAttribute("offcode",request.getParameter("offcode"));
		forward("/Popup/sincere_confirm_pop.jsp", request, response);
	}

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("empid",request.getParameter("id"));
		request.setAttribute("posname",request.getParameter("posname"));
		request.setAttribute("poscode",request.getParameter("poscode"));
		request.setAttribute("offname",request.getParameter("offname"));
		request.setAttribute("offcode",request.getParameter("offcode"));
		forward("/Popup/sincere_confirm_pop.jsp", request, response);

	}

}
