package com.ko.webapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.ApplicationArrestExhibit;
import com.ko.domain.DutyTable;
import com.ko.domain.Unit;

public class Duty_table_listAction extends BaseAction{
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		request.setAttribute("group_id", request.getParameter("group_id"));
		request.setAttribute("legislation_id", request.getParameter("legislation_id"));
		forward("/Popup/arrest_exhibit_form.jsp", request, response);
	}

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	}

}
