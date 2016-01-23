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


public class ReportRepress extends SummaryReportBaseAction{
	
	
	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("Test:::::");
		forward("?page=/SummaryReports/report_repress.jsp", request,response);
	}
public void ILLR8201(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);
		
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		forward("?page=/SummaryReports/ReportRepress/ILLR8201.jsp", request,response);
	}
	public void ILLR8203(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);
		
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		forward("?page=/SummaryReports/ReportRepress/ILLR8203.jsp", request,response);
	}
}