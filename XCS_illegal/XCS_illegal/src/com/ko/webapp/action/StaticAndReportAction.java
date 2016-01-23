package com.ko.webapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.*;
import com.ko.domain.EdOffice;
import org.jfree.util.Log;
import com.ko.domain.ApplicationNoticeArrest;
import com.ko.domain.Court;
import com.ko.domain.DutyTable;
import com.ko.domain.EdOffice;
import com.ko.domain.Legislation;
import com.ko.domain.Province;
import com.ko.domain.V_MONTH_NAME;

import com.ko.webapp.bean.UserSession;
import com.ko.webapp.util.RequestUtil;
import com.ko.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class StaticAndReportAction extends BaseAction{
	
	
	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("Test:::::");
		forward("?page=/TestReport/report_case.jsp", request,response);
	}
	public void reportcase(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("Test:::::");
		forward("?page=/TestReport/report_case.jsp", request,response);
	}
	public void reportit(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("Test:::::");
		forward("?page=/TestReport/report_it.jsp", request,response);
	}
	public void reportrepress(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("Test:::::");
		forward("?page=/TestReport/report_repress.jsp", request,response);
	}
	public void reportenquire(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("Test:::::");
		forward("?page=/WebContent/SummaryReport/report_enquire.jsp", request,response);
	}
	
	

	
	
	public String getReportMenu(HttpServletRequest request, String refMenu)  throws Exception{
		String ret="";
		UserSession uData = new UserSession();
      	uData =  (UserSession)RequestUtil.getUserSession(request);
      	if(uData != null){
      		DB db = new DB();
      		PreparedStatement pre = null;
      		
      		String sql = "";
    		sql += " select distinct m.menu_seq, m.short_name, m.menu_name, nvl(m.menu_url,'#') menu_url, nvl(rm.menu_id,0) menu_id, m.status";
    		sql += " from menu m";
    		sql += " left join rolemenu rm on m.id=rm.menu_id";
    		sql += " left join roleauth ra on ra.rolegrp_id=rm.rolegrp_id";
    		sql += " where m.ref_menu_id='" + refMenu + "' ";
    		//sql += " and (ra.idcard_no='" + uData.getIdCard() + "' or ra.idcard_no is null)";
    		sql += " order by m.menu_seq";
    		
      		pre = db.getParameterizedStatement(sql,null);
      		ResultSet rs = pre.executeQuery();
      		
      		while(rs.next()){
      			ret += "<tr>";
      			ret += "	<td width='5%' align='center' valign='middle'>" + rs.getObject("menu_seq").toString() + ".</td>";
      			if(rs.getObject("menu_id").toString().equals("0") || rs.getObject("menu_url").toString().equals("#") || rs.getObject("status").toString().equals("0"))
      				ret += "	<td width='95%' height='25' >" + rs.getObject("short_name") + "</td>";
      			else
      				ret += "	<td width='95%' height='25' ><a href='" + rs.getObject("menu_url") + "' onClick=\"writeTranLog('แสดงรายงาน " + rs.getObject("menu_name").toString() + "');\" >" + rs.getObject("short_name") + "</a></td>";
      			ret += "</tr>";
      		}
      	}
      	
      	return ret;
	}
	public void ILLR8109(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		
		V_MONTH_NAME mm = new V_MONTH_NAME(db);
		mm.getViewName();
		List mmlist = mm.findAll();
		System.out.println("mmlist : "+mmlist.size());
		request.setAttribute("mmlist", mmlist); 
		
		
		forward("?page=/SummaryReports/ReportEnquire/ILLR8109.jsp", request,response);
	}
public void ILLR8110(HttpServletRequest request,	HttpServletResponse response) throws Exception {
	
	V_MONTH_NAME mm = new V_MONTH_NAME(db);
	mm.getViewName();
	List mmlist = mm.findAll();
	System.out.println("mmlist : "+mmlist.size());
	request.setAttribute("mmlist", mmlist); 
		
		forward("?page=/SummaryReports/ReportEnquire/ILLR8110.jsp", request,response);
	}
public void ILLR8113(HttpServletRequest request,HttpServletResponse response) throws Exception {
	
	
	V_MONTH_NAME mm = new V_MONTH_NAME(db);
	mm.getViewName();
	List mmlist = mm.findAll();
	System.out.println("mmlist : "+mmlist.size());
	request.setAttribute("mmlist", mmlist); 
	
	
	forward("?page=/WebContent/SummaryReports/ReportEnquire/ILLR8113.jsp", request,response);
}
public void ILLR8114(HttpServletRequest request,HttpServletResponse response) throws Exception {
	
	
	V_MONTH_NAME mm = new V_MONTH_NAME(db);
	mm.getViewName();
	List mmlist = mm.findAll();
	System.out.println("mmlist : "+mmlist.size());
	request.setAttribute("mmlist", mmlist); 
	
	
	forward("?page=/WebContent/SummaryReports/ReportEnquire/ILLR8114.jsp", request,response);
}
	public void ILLR8301(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
		
		forward("?page=/TestReport/ILLR8301.jsp", request,response);
	}
	public void ILLR8302(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
		
		forward("?page=/TestReport/ILLR8302.jsp", request,response);
	}
	public void ILLR8303(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
		
		forward("?page=/TestReport/ILLR8303.jsp", request,response);
	}
	public void ILLR8304(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
		
		forward("?page=/TestReport/ILLR8304.jsp", request,response);
	}
	public void ILLR8305(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
		
		forward("?page=/TestReport/ILLR8305.jsp", request,response);
	}
	public void ILLR8306(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);
		
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		forward("?page=/TestReport/ILLR8306.jsp", request,response);
	}
	public void ILLR8311(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
		
		forward("?page=/TestReport/ILLR8311.jsp", request,response);
	}
	public void ILLR8312(HttpServletRequest request,	HttpServletResponse response) throws Exception {
	
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
	
		forward("?page=/TestReport/ILLR8312.jsp", request,response);
	}
	public void ILLR8501(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
	
		forward("?page=/TestReport/ILLR8501.jsp", request,response);
	}
	public void ILLR8502(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
	
		forward("?page=/TestReport/ILLR8502.jsp", request,response);
	}
	public void ILLR8503(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);	
	
		forward("?page=/TestReport/ILLR8503.jsp", request,response);
	}
	public void ILLR8509(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		forward("?page=/TestReport/ILLR8509.jsp", request,response);
	}
	public void ILLR8201(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);
		
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		forward("?page=/TestReport/ILLR8201.jsp", request,response);
	}
	public void ILLR8203(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		
		EdOffice sc = new EdOffice(db);
		List<EdOffice> sclist =  sc.findAll();
		request.setAttribute("sclist", sclist);
		
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		forward("?page=/TestReport/ILLR8203.jsp", request,response);
	}
	
}
//p'pat
/*
	public void _default(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	log.debug("Test:::::");
	forward("?page=/TestReport/report_enquire.jsp", request,response);
}
	public void ILLR8109(HttpServletRequest request,HttpServletResponse response) throws Exception {
	
	Province pv = new Province(db);
	List<Province> pvlist =  pv.findAll();
	request.setAttribute("pvlist", pvlist);
		 
	DutyTable dt = new DutyTable(db);
	List<DutyTable> dtlist = dt.findAll();
	System.out.println("dtlist : "+dtlist.size());
	request.setAttribute("dtlist", dtlist);
	
	forward("?page=/TestReport/ILLR8109.jsp", request,response);
}
public void ILLR8110(HttpServletRequest request,	HttpServletResponse response) throws Exception {
	
	
	forward("?page=/TestReport/ILLR8110.jsp", request,response);
}
public void ILLR8113(HttpServletRequest request,HttpServletResponse response) throws Exception {


EdOffice sc = new EdOffice(db);
List<EdOffice> sclist =  sc.findAll();
request.setAttribute("sclist", sclist);


forward("?page=/TestReport/ILLR8113.jsp", request,response);
}
}
*/