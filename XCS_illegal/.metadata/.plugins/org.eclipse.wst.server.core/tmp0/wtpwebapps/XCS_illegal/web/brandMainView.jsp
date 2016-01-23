








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=BrandMain&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${brandMain.id}</td>
	</tr>
	<tr>
			<td>upd_date</td>
		<td>
					<fmt:formatDate value="${brandMain.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>upd_userid</td>
		<td>
					${brandMain.upd_userid}
				</td>
		</tr>
	<tr>
			<td>end_date</td>
		<td>
					<fmt:formatDate value="${brandMain.end_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>begin_date</td>
		<td>
					<fmt:formatDate value="${brandMain.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>brand_main_eng</td>
		<td>
					${brandMain.brand_main_eng}
				</td>
		</tr>
	<tr>
			<td>brand_main_thai</td>
		<td>
					${brandMain.brand_main_thai}
				</td>
		</tr>
	<tr>
			<td>brand_main_code</td>
		<td>
					${brandMain.brand_main_code}
				</td>
		</tr>
	<tr>
			<td>duty_code</td>
		<td>
					${brandMain.duty_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>