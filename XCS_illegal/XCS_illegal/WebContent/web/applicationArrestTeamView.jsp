








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationArrestTeam&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationArrestTeam.id}</td>
	</tr>
	<tr>
			<td>staff_offcode</td>
		<td>
					${applicationArrestTeam.staff_offcode}
				</td>
		</tr>
	<tr>
			<td>staff_poscode</td>
		<td>
					${applicationArrestTeam.staff_poscode}
				</td>
		</tr>
	<tr>
			<td>staff_idcardno</td>
		<td>
					${applicationArrestTeam.staff_idcardno}
				</td>
		</tr>
	<tr>
			<td>duty_status_id</td>
		<td>
					${applicationArrestTeam.duty_status_id}
				</td>
		</tr>
	<tr>
			<td>staff_position</td>
		<td>
					${applicationArrestTeam.staff_position}
				</td>
		</tr>
	<tr>
			<td>inspector_code</td>
		<td>
					${applicationArrestTeam.inspector_code}
				</td>
		</tr>
	<tr>
			<td>staff_no</td>
		<td>
					${applicationArrestTeam.staff_no}
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${applicationArrestTeam.track_no}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationArrestTeam.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationArrestTeam.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationArrestTeam.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationArrestTeam.create_by}
				</td>
		</tr>
	<tr>
		</tr>
</table>