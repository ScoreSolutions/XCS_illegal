








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=EdOffice&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${edOffice.id}</td>
	</tr>
	<tr>
			<td>upd_date</td>
		<td>
					<fmt:formatDate value="${edOffice.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>upd_userid</td>
		<td>
					${edOffice.upd_userid}
				</td>
		</tr>
	<tr>
			<td>end_date</td>
		<td>
					<fmt:formatDate value="${edOffice.end_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>begin_date</td>
		<td>
					<fmt:formatDate value="${edOffice.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>supoffcode</td>
		<td>
					${edOffice.supoffcode}
				</td>
		</tr>
	<tr>
			<td>tambol_code</td>
		<td>
					${edOffice.tambol_code}
				</td>
		</tr>
	<tr>
			<td>indc_off</td>
		<td>
					${edOffice.indc_off}
				</td>
		</tr>
	<tr>
			<td>short_name</td>
		<td>
					${edOffice.short_name}
				</td>
		</tr>
	<tr>
			<td>offname</td>
		<td>
					${edOffice.offname}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${edOffice.offcode}
				</td>
		</tr>
	<tr>
		</tr>
</table>