








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Country&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${country.id}</td>
	</tr>
	<tr>
			<td>upd_date</td>
		<td>
					<fmt:formatDate value="${country.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>upd_userid</td>
		<td>
					${country.upd_userid}
				</td>
		</tr>
	<tr>
			<td>end_date</td>
		<td>
					<fmt:formatDate value="${country.end_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>begin_date</td>
		<td>
					<fmt:formatDate value="${country.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>country_seq</td>
		<td>
					${country.country_seq}
				</td>
		</tr>
	<tr>
			<td>race_name</td>
		<td>
					${country.race_name}
				</td>
		</tr>
	<tr>
			<td>indc_afta</td>
		<td>
					${country.indc_afta}
				</td>
		</tr>
	<tr>
			<td>continent</td>
		<td>
					${country.continent}
				</td>
		</tr>
	<tr>
			<td>short_name</td>
		<td>
					${country.short_name}
				</td>
		</tr>
	<tr>
			<td>country_name</td>
		<td>
					${country.country_name}
				</td>
		</tr>
	<tr>
			<td>country_code</td>
		<td>
					${country.country_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>