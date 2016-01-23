








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Running&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${running.id}</td>
	</tr>
	<tr>
			<td>runningfield</td>
		<td>
					${running.runningfield}
				</td>
		</tr>
	<tr>
			<td>length</td>
		<td>
					${running.length}
				</td>
		</tr>
	<tr>
			<td>year</td>
		<td>
					${running.year}
				</td>
		</tr>
	<tr>
			<td>month</td>
		<td>
					${running.month}
				</td>
		</tr>
	<tr>
			<td>isoffcode</td>
		<td>
					${running.isoffcode}
				</td>
		</tr>
	<tr>
			<td>code</td>
		<td>
					${running.code}
				</td>
		</tr>
	<tr>
			<td>fieldvalue</td>
		<td>
					${running.fieldvalue}
				</td>
		</tr>
	<tr>
			<td>fieldtype</td>
		<td>
					${running.fieldtype}
				</td>
		</tr>
	<tr>
			<td>tbname</td>
		<td>
					${running.tbname}
				</td>
		</tr>
	<tr>
		</tr>
</table>