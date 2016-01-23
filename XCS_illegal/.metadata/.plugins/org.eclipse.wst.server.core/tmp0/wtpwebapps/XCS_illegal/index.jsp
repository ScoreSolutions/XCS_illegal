<%@ page language="java" errorPage="/error.jsp"  contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ include file="/Templates/header.jsp" %>


<%@page import="com.ko.webapp.bean.UserSession"%>
<%@page import="com.ko.webapp.action.LoginAction" %>

<% 
if(us == null){%>
	<jsp:include page='login.jsp' />
<%}else{ 
	String showPage = request.getParameter("page");
	if( showPage == null ||  showPage=="" ){%>
		<jsp:include page='home2.jsp'/>
<%	}else{ %>	
		<jsp:include page="<%=showPage %>" />
<%	}
}
%>

<%@ include file = "/Templates/footer.jsp"%>