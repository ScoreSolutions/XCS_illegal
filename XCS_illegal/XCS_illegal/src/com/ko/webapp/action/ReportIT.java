package com.ko.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import com.ko.domain.EdOffice;
import org.jfree.util.Log;
import com.ko.domain.ApplicationNoticeArrest;
import com.ko.domain.Court;
import com.ko.domain.DutyTable;
import com.ko.domain.EdOffice;
import com.ko.domain.Legislation;
import com.ko.domain.Province; 
import com.ko.domain.V_MONTH_NAME;



	
public class ReportIT extends BaseAction{

	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("Test:::::");
		forward("?page=/SummaryReports/report_it.jsp", request,response);
	}
	public void ILLR8501(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	 
		
		V_MONTH_NAME mm = new V_MONTH_NAME(db);
		mm.getViewName();
		List mmlist = mm.findAll();
		System.out.println("mmlist : "+mmlist.size());
		request.setAttribute("mmlist", mmlist); 
		
		forward("?page=/SummaryReports/ReportIT/ILLR8501.jsp", request,response);
	}
	public void ILLR8502(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
	
		forward("?page=/SummaryReports/ReportIT/ILLR8502.jsp", request,response);
	}
	public void ILLR8503(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
	
		forward("?page=/SummaryReports/ReportIT/ILLR8503.jsp", request,response);
	}
	public void ILLR8509(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		forward("?page=/SummaryReports/ReportIT/ILLR8509.jsp", request,response);
	}
}
