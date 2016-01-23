package com.ko.webapp.action;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.ParameterParser;
import org.apache.commons.lang.time.DateUtils;
import org.omg.Dynamic.Parameter;

import com.ko.service.ProductUnitService;
import com.ko.util.DateUtil;
import com.ko.webapp.util.ParameterUtil;
import com.ko.domain.*;
import com.sun.corba.se.impl.javax.rmi.CORBA.Util;



public class Arrest_licenseAction extends BaseAction {

	public void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		 LicenseType lt = new LicenseType(db);
		 String ltSql = "select id, licensetype_code, licensetype_name from license_type order by licensetype_name";
		 List<Map<String,Object>> ltlist = lt.findBySql(ltSql); //lt.findByWhere(" 1=1", null);
		//System.out.println("ltlist : "+ltlist.size());
		 request.setAttribute("ltlist", ltlist);
		
		 EdOffice ed = new EdOffice(db);
		 String edSql = "select offcode, short_name from ed_office order by short_name";
		 List<Map<String,Object>> edlist = ed.findBySql(edSql);  //ed.findByWhere(" 1=1 order by offname", null);
		 request.setAttribute("edlist", edlist);
	}

	public void update(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		pre(request,response);
		ApplicationArrestLicense send =new ApplicationArrestLicense(db);

		send.setId(ParameterUtil.getLongParam("id", request));
		send.setBook_no(request.getParameter("book_no"));
		send.setEntrepreneur(request.getParameter("entrepreneur") );
		send.setEstablishment_name(request.getParameter("establishment_name"));
		send.setIswithdraw(request.getParameter("iswithdraw"));
		send.setLicense_no(request.getParameter("license_no"));
		send.setLicense_type(ParameterUtil.getLongParam("license_type", request));
		send.setOffcode(request.getParameter("offcode"));
		request.setAttribute("send", send);
		log.debug("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		log.debug(send);
		log.debug("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		forward("Popup/arrest_license_form.jsp", request, response);

	}

	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
           pre(request,response);
           forward("Popup/arrest_license_form.jsp", request, response);
	}
}
