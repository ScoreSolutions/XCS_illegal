<%@ page language="java" buffer="8kb" pageEncoding="UTF-8"  %>
<%@ page import="java.io.*"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%@ page contentType = "application/vnd.ms-excel" %>


<% 
	//ServletOutputStream servletOutputStream = response.getOutputStream();
	response.reset();
	response.setContentType("application/vnd.ms-excel;charset=TIS-620");
	response.setHeader("Content-Disposition","inline; filename = myFilename.xls");
	
	PrintWriter op = response.getWriter();
	//op.println("aaaaaaaa\tBBBBB");
	//op.println("cccccc");
	if(request.getParameter("tabPage").toString().equals("1"))
		op.println(session.getValue("ExportExcelSum"));
	else
		op.println(session.getValue("ExportExcelUnit"));
	op.flush();
	op.close();
	
%>
