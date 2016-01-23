








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ConfigDivideStaff&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${configDivideStaff.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${configDivideStaff.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${configDivideStaff.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${configDivideStaff.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${configDivideStaff.create_by}
				</td>
		</tr>
	<tr>
			<td>share2</td>
		<td>
					${configDivideStaff.share2}
				</td>
		</tr>
	<tr>
			<td>staff_level</td>
		<td>
					${configDivideStaff.staff_level}
				</td>
		</tr>
	<tr>
			<td>staff_offcode</td>
		<td>
					${configDivideStaff.staff_offcode}
				</td>
		</tr>
	<tr>
			<td>staff_poscode</td>
		<td>
					${configDivideStaff.staff_poscode}
				</td>
		</tr>
	<tr>
			<td>staff_idcardno</td>
		<td>
					${configDivideStaff.staff_idcardno}
				</td>
		</tr>
	<tr>
		</tr>
</table>