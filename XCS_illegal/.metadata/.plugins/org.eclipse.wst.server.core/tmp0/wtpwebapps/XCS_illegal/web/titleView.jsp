








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Title&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>TITLE_CODE</td>
		<td>${title.title_code}</td>
	</tr>
	<tr>
			<td>upd_date</td>
		<td>
					<fmt:formatDate value="${title.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>upd_userid</td>
		<td>
					${title.upd_userid}
				</td>
		</tr>
	<tr>
			<td>end_date</td>
		<td>
					<fmt:formatDate value="${title.end_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>begin_date</td>
		<td>
					<fmt:formatDate value="${title.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>title_seo</td>
		<td>
					${title.title_seo}
				</td>
		</tr>
	<tr>
			<td>short_suffix</td>
		<td>
					${title.short_suffix}
				</td>
		</tr>
	<tr>
			<td>suffix_name</td>
		<td>
					${title.suffix_name}
				</td>
		</tr>
	<tr>
			<td>short_title</td>
		<td>
					${title.short_title}
				</td>
		</tr>
	<tr>
			<td>title_name</td>
		<td>
					${title.title_name}
				</td>
		</tr>
	<tr>
			<td>title_type</td>
		<td>
					${title.title_type}
				</td>
		</tr>
	<tr>
		</tr>
</table>