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


public class ReportRepressAction extends SummaryReportBaseAction{
	
	
	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("Test:::::");
		forward("?page=/SummaryReports/report_repress.jsp", request,response);
	}
	public void ILLR8201(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		forward("?page=/SummaryReports/ReportRepress/ILLR8201.jsp", request,response);
	}
	
	public void ILLR8202(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportRepress/ILLR8202.jsp", request,response);
	}
	
	public void ILLR8203(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		forward("?page=/SummaryReports/ReportRepress/ILLR8203.jsp", request,response);
	}
	public void ILLR8204(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		forward("?page=/SummaryReports/ReportRepress/ILLR8204.jsp", request,response);
	}
	public void ILLR8205(HttpServletRequest request,HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportRepress/ILLR8205.jsp", request,response);
	}
	public void ILLR8206(HttpServletRequest request,HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportRepress/ILLR8206.jsp", request,response);
	}
	public void ILLR8207(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportRepress/ILLR8207.jsp", request,response);
	}
	public void ILLR8208(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportRepress/ILLR8208.jsp", request,response);
	}
	public void ILLR8209(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportRepress/ILLR8209.jsp", request,response);
	}
	public void ILLR8210(HttpServletRequest request,HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportRepress/ILLR8210.jsp", request,response);
	}
	public void ILLR8211(HttpServletRequest request,HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportRepress/ILLR8211.jsp", request,response);
	}
	//SetOffnameList
	public void ILLR8212(HttpServletRequest request,HttpServletResponse response) throws Exception {
		SetOffnameList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportRepress/ILLR8212.jsp", request,response);
	}
	public void ILLR8213(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportRepress/ILLR8213.jsp", request,response);
	}
	public void ILLR8214(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportRepress/ILLR8214.jsp", request,response);
	}
	public void ILLR8215(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportRepress/ILLR8215.jsp", request,response);
	}
	public void ILLR8216(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setMonthList(request,response,"mmlist");
		forward("?page=/SummaryReports/ReportRepress/ILLR8216.jsp", request,response);
	}
	public void ILLR8217(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setMonthList(request,response,"mmlist");
		forward("?page=/SummaryReports/ReportRepress/ILLR8217.jsp", request,response);
	}
}