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


public class ReportCaseAction extends SummaryReportBaseAction{
	
	
	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("Test:::::");
		forward("?page=/SummaryReports/report_case.jsp", request,response);
	}
	public void ILLR8301(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setSectionList(request,response,"sclist");
		
		String IsSection="N";
		String IsArea="N";
		String IsBranch="N";
		String IsCenter="N";
		//uData.getAccuserType() 
		//3= ภาค
		//1= พื้นที่
		//4= สาขา
		//2= กรม
		//5= อื่นๆ
		if (uData.getAccuserType().equals("3"))
			IsSection = "Y";
		
		if (uData.getAccuserType().equals("1"))
			IsArea = "Y";
		
		if (uData.getAccuserType().equals("4"))
			IsBranch = "Y";
		
		if (uData.getAccuserType().equals("2"))
			IsCenter = "Y";
		
		request.setAttribute("IsSection", IsSection);
		request.setAttribute("IsArea", IsArea);
		request.setAttribute("IsBranch", IsBranch);
		request.setAttribute("IsCenter", IsCenter);
		request.setAttribute("vOffcode", uData.getOffcode());
		forward("?page=/SummaryReports/ReportCase/ILLR8301.jsp", request,response);
	}
	public void ILLR8302(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportCase/ILLR8302.jsp", request,response);
	}
	public void ILLR8303(HttpServletRequest request,	HttpServletResponse response) throws Exception {	
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportCase/ILLR8303.jsp", request,response);
	}
	public void ILLR8304(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportCase/ILLR8304.jsp", request,response);
	}
	public void ILLR8305(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportCase/ILLR8305.jsp", request,response);
	}
	public void ILLR8306(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setSectionList(request,response,"sclist");
		
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		forward("?page=/SummaryReports/ReportCase/ILLR8306.jsp", request,response);
	}
	public void ILLR8307(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportCase/ILLR8307.jsp", request,response);
	}
	public void ILLR8308(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportCase/ILLR8308.jsp", request,response);
	}
	public void ILLR8309(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		setMonthList(request,response,"mmlist");
		forward("?page=/SummaryReports/ReportCase/ILLR8309.jsp", request,response);
	}
	public void ILLR8310(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		forward("?page=/SummaryReports/ReportCase/ILLR8310.jsp", request,response);
	}
	public void ILLR8311(HttpServletRequest request,	HttpServletResponse response) throws Exception {	
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportCase/ILLR8311.jsp", request,response);
	}
	public void ILLR8312(HttpServletRequest request,	HttpServletResponse response) throws Exception {	
		setSectionList(request,response,"sclist");
		forward("?page=/SummaryReports/ReportCase/ILLR8312.jsp", request,response);
	}
	public void ILLR8313(HttpServletRequest request,	HttpServletResponse response) throws Exception {	
		if (uData.IsAdmin()==true){
			request.setAttribute("IsAdmin", "1");
		}
		forward("?page=/SummaryReports/ReportCase/ILLR8313.jsp", request,response);
	}
	public void ILLR8314(HttpServletRequest request,	HttpServletResponse response) throws Exception {	
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		if(uData.IsAdmin()==true)
			request.setAttribute("IsAdmin", "1");
		
		request.setAttribute("offcode", uData.getOffcode());
		request.setAttribute("offname", uData.getOffname());
		request.setAttribute("ShowPrintButton", "Y");
		forward("?page=/SummaryReports/ReportCase/ILLR8314.jsp", request,response);
	}
}