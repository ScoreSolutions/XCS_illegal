package com.ko.webapp.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.EdOffice;
import org.jfree.util.Log;
import com.ko.domain.ApplicationNoticeArrest;
import com.ko.domain.Court;
import com.ko.domain.DutyTable;
import com.ko.domain.EdOffice;
import com.ko.domain.Legislation;
import com.ko.domain.Province;
import com.ko.domain.V_MONTH_NAME;


public class ReportEnquireAction extends SummaryReportBaseAction{

	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//ReportAction rp = new ReportAction();
		//rp.compile(request, response);
		
		forward("?page=/SummaryReports/report_enquire.jsp", request,response);
	}
	public void reportenquire(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("Test:::::");
		forward("?page=SummaryReport/report_enquire.jsp", request,response);
	}
	public void ILLR8101(HttpServletRequest request,HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportEnquire/ILLR8101.jsp", request,response);
	}
	public void ILLR8102(HttpServletRequest request,HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportEnquire/ILLR8102.jsp", request,response);
	}
	public void ILLR8103(HttpServletRequest request,HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportEnquire/ILLR8103.jsp", request,response);
	}
	public void ILLR8104(HttpServletRequest request,HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportEnquire/ILLR8104.jsp", request,response);
	}
	public void ILLR8105(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setDutyGroup(request,response,"dglist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8105.jsp", request,response);
	}
	public void ILLR8106(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8106.jsp", request,response);
	}
	public void ILLR8107(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setDutyGroup(request,response,"dglist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8107.jsp", request,response);
	}
	public void ILLR8108(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setDutyGroup(request,response,"dglist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8108.jsp", request,response);
	}
	public void ILLR8109(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8109.jsp", request,response);
	}
	public void ILLR8110(HttpServletRequest request,	HttpServletResponse response) throws Exception {
			setMonthList(request, response, "mmlist");
			setSectionList(request,response,"sclist");
			
			forward("?page=/SummaryReports/ReportEnquire/ILLR8110.jsp", request,response);
		}
	public void ILLR8111(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8111.jsp", request,response);
	}
	public void ILLR8112(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8112.jsp", request,response);
	}
	public void ILLR8113(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8113.jsp", request,response);
	}
	public void ILLR8114(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8114.jsp", request,response);
	}
	public void ILLR8115(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8115.jsp", request,response);
	}

	public void ILLR8116(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		EdOffice sc = new EdOffice(db);
		List<Map<String,Object>> sclist =  sc.findBySql("select offcode,offname from ed_office where substr(offcode,3,4) = ? order by offcode", "0000");
		System.out.println("Ed No Webservice");
		request.setAttribute("sclist", sclist);	 
		
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8116.jsp", request,response);
	}
	
	public void ILLR8117(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		EdOffice sc = new EdOffice(db);
		List<Map<String,Object>> sclist =  sc.findBySql("select offcode,offname from ed_office where substr(offcode,3,4) = ? order by offcode", "0000");
		System.out.println("Ed No Webservice");
		request.setAttribute("sclist", sclist);	 
		
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8117.jsp", request,response);
	}
	
	public void ILLR8118(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		EdOffice sc = new EdOffice(db);
		List<Map<String,Object>> sclist =  sc.findBySql("select offcode,offname from ed_office where substr(offcode,3,4) = ? order by offcode", "0000");
		System.out.println("Ed No Webservice");
		request.setAttribute("sclist", sclist);	 
		
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8118.jsp", request,response);
	}
	
	public void ILLR8119(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		EdOffice sc = new EdOffice(db);
		List<Map<String,Object>> sclist =  sc.findBySql("select offcode,offname from ed_office where substr(offcode,3,4) = ? order by offcode", "0000");
		System.out.println("Ed No Webservice");
		request.setAttribute("sclist", sclist);	 
		
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8119.jsp", request,response);
	}
	
	public void ILLR8120(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		EdOffice sc = new EdOffice(db);
		List<Map<String,Object>> sclist =  sc.findBySql("select offcode,offname from ed_office where substr(offcode,3,4) = ? order by offcode", "0000");
		System.out.println("Ed No Webservice");
		request.setAttribute("sclist", sclist);	 
		
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8120.jsp", request,response);
	}
	
	public void ILLR8121(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8121.jsp", request,response);
	}
	
	public void ILLR8122(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8122.jsp", request,response);
	}
	public void ILLR8123(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8123.jsp", request,response);
	}
	
	public void ILLR8124(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8124.jsp", request,response);
	}
	public void ILLR8125(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		forward("?page=/SummaryReports/ReportEnquire/ILLR8125.jsp", request,response);
	}
	public void ILLR8126(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		forward("?page=/SummaryReports/ReportEnquire/ILLR8126.jsp", request,response);
	}
	public void ILLR8127(HttpServletRequest request,HttpServletResponse response) throws Exception {	
		forward("?page=/SummaryReports/ReportEnquire/ILLR8127.jsp", request,response);
	}
	public void ILLR8128(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8128.jsp", request,response);
	}
	public void ILLR8129(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8129.jsp", request,response);
	}
	public void ILLR8130(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8130.jsp", request,response);
	}
	public void ILLR8131(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8131.jsp", request,response);
	}
	public void ILLR8132(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8132.jsp", request,response);
	}
	public void ILLR8133(HttpServletRequest request,HttpServletResponse response) throws Exception {
		setMonthList(request, response, "mmlist");
		forward("?page=/SummaryReports/ReportEnquire/ILLR8133.jsp", request,response);
	}
}