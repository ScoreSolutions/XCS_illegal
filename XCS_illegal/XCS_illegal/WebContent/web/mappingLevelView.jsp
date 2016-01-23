








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=MappingLevel&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${mappingLevel.id}</td>
	</tr>
	<tr>
			<td>remarks</td>
		<td>
					${mappingLevel.remarks}
				</td>
		</tr>
	<tr>
			<td>p_level</td>
		<td>
					${mappingLevel.p_level}
				</td>
		</tr>
	<tr>
			<td>c_level</td>
		<td>
					${mappingLevel.c_level}
				</td>
		</tr>
	<tr>
		</tr>
</table>