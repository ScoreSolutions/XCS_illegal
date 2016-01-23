package com.ko.webapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.SizePackage;

public class SizePackageAction extends BaseAction{
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String pa = request.getParameter("duty");
		String sql;
		sql="select SIZE_DESC from SIZE_PACKAGE where DUTY_CODE = "+pa+"";
		SizePackage size = new SizePackage(db);
		List sizeList = size.findBySql(sql, null);
		System.out.println(sizeList);
		request.setAttribute("SizePackList", sizeList);
		forward("/Popup/arrest_exhibit_form.jsp", request, response);
	}

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	}



}
