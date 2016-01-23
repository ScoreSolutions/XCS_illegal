package com.ko.webapp.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.EdOffice;
import com.ko.domain.V_MONTH_NAME;
import com.ko.domain.Legislation;
import com.ko.domain.DutyGroup;

public class SummaryReportBaseAction extends BaseAction {
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
	}
	
	protected void setSectionList(HttpServletRequest request, HttpServletResponse response, String attrName) throws Exception {
		EdOffice sc = new EdOffice(db);
		String sql= "select offcode, offname, short_name ";
		sql += " from ed_office ";
		sql += " where substr(offcode,3,4)='0000' ";
		sql += " order by offcode";
		List<Map<String,Object>> sclist =  sc.findBySql(sql);
		request.setAttribute(attrName, sclist);	
	}
	protected void SetOffnameList(HttpServletRequest request, HttpServletResponse response, String attrName) throws Exception {
		EdOffice sc = new EdOffice(db);
		String sql= "select offcode, offname, short_name ";
		sql += " from ed_office ";
		sql += " order by offname";
		List<Map<String,Object>> sclist =  sc.findBySql(sql);
		request.setAttribute(attrName, sclist);	
	}
	protected void setMonthList(HttpServletRequest request, HttpServletResponse response, String attrName) throws Exception {
		V_MONTH_NAME mm = new V_MONTH_NAME(db);
		List mmlist = mm.findAll();
		request.setAttribute(attrName, mmlist); 		
	}
	protected void setLegislationList(HttpServletRequest request, HttpServletResponse response, String attrName) throws Exception {
		Legislation lg = new Legislation(db);
		List<Map<String,Object>> lgList = lg.findBySql("select id, legislation_code, legislation_name from legislation order by id");
		request.setAttribute(attrName, lgList);
	}
	protected void setDutyGroup(HttpServletRequest request, HttpServletResponse response, String attrName) throws Exception {
		DutyGroup dg = new DutyGroup(db);
		String sql = "";
		sql += "select dg.group_id, dg.group_name ";
		sql += " from duty_group dg  ";
		sql += " where dg.group_status='N' ";
		sql += " order by  NLSSORT(UPPER(dg.group_name), 'NLS_SORT = THAI_DICTIONARY')";
        List<Map<String,Object>> dgList = dg.findBySql(sql);
        request.setAttribute(attrName, dgList);
	}
}
