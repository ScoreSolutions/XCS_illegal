package com.ko.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

import com.ko.domain.EdOffice;
import com.ko.domain.V_MONTH_NAME;
import com.ko.service.*;

public class ReportitAction extends SummaryReportBaseAction{

	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//log.debug("Test:::::");
		forward("?page=/SummaryReports/report_it.jsp", request,response);
	}
	public void ILLR8501(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<Map<String,Object>> sclist =  sc.findBySql("select offcode,offname from ed_office where substr(offcode,3,4) = ? order by offcode", "0000");
		System.out.println("Ed No Webservice");
		request.setAttribute("sclist", sclist);	 

		V_MONTH_NAME mm = new V_MONTH_NAME(db);
		mm.getViewName();
		List mmlist = mm.findAll();
		//System.out.println("mmlist : "+mmlist.size());
		request.setAttribute("mmlist", mmlist); 
		
		forward("?page=/SummaryReports/ReportIT/ILLR8501.jsp", request,response);
	}
	public void ILLR8502(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		System.out.println("Ed No Webservice");
		EdOffice sc = new EdOffice(db);
		List<Map<String,Object>> sclist =  sc.findBySql("select offcode,offname from ed_office where substr(offcode,3,4) = ? order by offcode", "0000");
		List<Map<String,Object>> arList = sc.findBySql("select offcode,offname from ed_office where substr(offcode,1,2)<>'00' and substr(offcode,3,2) <> '00' and substr(offcode,5,2) = '00' order by offname");
			
		request.setAttribute("sclist", sclist);	
		request.setAttribute("arList", arList);
		
		forward("?page=/SummaryReports/ReportIT/ILLR8502.jsp", request,response);
	}
	
	public void ILLR8503(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
	
		forward("?page=/SummaryReports/ReportIT/ILLR8503.jsp", request,response);
	}
	
	public void ILLR8504(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportIT/ILLR8504.jsp", request,response);
	}
	
	public void ILLR8505(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportIT/ILLR8505.jsp", request,response);
	}
	
	public void ILLR8506(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportIT/ILLR8506.jsp", request,response);
	}
	
	public void ILLR8509(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		forward("?page=/SummaryReports/ReportIT/ILLR8509.jsp", request,response);
	}
}
