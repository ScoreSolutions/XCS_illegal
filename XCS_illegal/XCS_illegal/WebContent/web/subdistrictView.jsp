








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Subdistrict&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${subdistrict.id}</td>
	</tr>
	<tr>
			<td>rdb_code</td>
		<td>
					${subdistrict.rdb_code}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${subdistrict.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${subdistrict.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${subdistrict.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${subdistrict.create_by}
				</td>
		</tr>
	<tr>
			<td>active</td>
		<td>
					${subdistrict.active}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${subdistrict.offcode}
				</td>
		</tr>
	<tr>
			<td>district_code</td>
		<td>
					${subdistrict.district_code}
				</td>
		</tr>
	<tr>
			<td>subdistrict_name</td>
		<td>
					${subdistrict.subdistrict_name}
				</td>
		</tr>
	<tr>
			<td>subdistrict_code</td>
		<td>
					${subdistrict.subdistrict_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>