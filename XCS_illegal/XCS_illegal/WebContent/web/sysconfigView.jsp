








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Sysconfig&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${sysconfig.id}</td>
	</tr>
	<tr>
			<td>description</td>
		<td>
					${sysconfig.description}
				</td>
		</tr>
	<tr>
			<td>datatype</td>
		<td>
					${sysconfig.datatype}
				</td>
		</tr>
	<tr>
			<td>config_value</td>
		<td>
					${sysconfig.config_value}
				</td>
		</tr>
	<tr>
			<td>config_name</td>
		<td>
					${sysconfig.config_name}
				</td>
		</tr>
	<tr>
		</tr>
</table>