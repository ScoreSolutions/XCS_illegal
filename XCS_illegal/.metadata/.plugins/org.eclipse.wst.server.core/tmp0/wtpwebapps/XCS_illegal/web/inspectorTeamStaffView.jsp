








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=InspectorTeamStaff&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${inspectorTeamStaff.id}</td>
	</tr>
	<tr>
			<td>staff_offcode</td>
		<td>
					${inspectorTeamStaff.staff_offcode}
				</td>
		</tr>
	<tr>
			<td>staff_poscode</td>
		<td>
					${inspectorTeamStaff.staff_poscode}
				</td>
		</tr>
	<tr>
			<td>staff_idcardno</td>
		<td>
					${inspectorTeamStaff.staff_idcardno}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${inspectorTeamStaff.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${inspectorTeamStaff.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${inspectorTeamStaff.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${inspectorTeamStaff.create_by}
				</td>
		</tr>
	<tr>
			<td>status</td>
		<td>
					${inspectorTeamStaff.status}
				</td>
		</tr>
	<tr>
			<td>last_name</td>
		<td>
					${inspectorTeamStaff.last_name}
				</td>
		</tr>
	<tr>
			<td>first_name</td>
		<td>
					${inspectorTeamStaff.first_name}
				</td>
		</tr>
	<tr>
			<td>title_id</td>
		<td>
					${inspectorTeamStaff.title_id}
				</td>
		</tr>
	<tr>
			<td>staff_code</td>
		<td>
					${inspectorTeamStaff.staff_code}
				</td>
		</tr>
	<tr>
			<td>inspector_team_id</td>
		<td>
					${inspectorTeamStaff.inspector_team_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>