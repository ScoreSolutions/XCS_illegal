package com.ko.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeAction extends BaseAction{
	public HomeAction(){

	}

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		forward("index.jsp", request, response);
	}

}
