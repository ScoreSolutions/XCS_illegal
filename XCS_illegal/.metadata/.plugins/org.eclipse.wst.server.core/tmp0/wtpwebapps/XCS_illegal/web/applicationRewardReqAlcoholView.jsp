








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationRewardReqAlcohol&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardReqAlcohol.id}</td>
	</tr>
	<tr>
			<td>report_to</td>
		<td>
					${applicationRewardReqAlcohol.report_to}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqAlcohol.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationRewardReqAlcohol.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqAlcohol.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationRewardReqAlcohol.create_by}
				</td>
		</tr>
	<tr>
			<td>poscode_res_director</td>
		<td>
					${applicationRewardReqAlcohol.poscode_res_director}
				</td>
		</tr>
	<tr>
			<td>staff_id_res_director</td>
		<td>
					${applicationRewardReqAlcohol.staff_id_res_director}
				</td>
		</tr>
	<tr>
			<td>res_director_deny_reason</td>
		<td>
					${applicationRewardReqAlcohol.res_director_deny_reason}
				</td>
		</tr>
	<tr>
			<td>res_director_accept_reason</td>
		<td>
					${applicationRewardReqAlcohol.res_director_accept_reason}
				</td>
		</tr>
	<tr>
			<td>res_director_accept</td>
		<td>
					${applicationRewardReqAlcohol.res_director_accept}
				</td>
		</tr>
	<tr>
			<td>poscode_section_director</td>
		<td>
					${applicationRewardReqAlcohol.poscode_section_director}
				</td>
		</tr>
	<tr>
			<td>staff_id_section_director</td>
		<td>
					${applicationRewardReqAlcohol.staff_id_section_director}
				</td>
		</tr>
	<tr>
			<td>section_director_deny_reason</td>
		<td>
					${applicationRewardReqAlcohol.section_director_deny_reason}
				</td>
		</tr>
	<tr>
			<td>section_director_accept_reason</td>
		<td>
					${applicationRewardReqAlcohol.section_director_accept_reason}
				</td>
		</tr>
	<tr>
			<td>section_director_accept</td>
		<td>
					${applicationRewardReqAlcohol.section_director_accept}
				</td>
		</tr>
	<tr>
			<td>section_director_lean</td>
		<td>
					${applicationRewardReqAlcohol.section_director_lean}
				</td>
		</tr>
	<tr>
			<td>poscode_leader</td>
		<td>
					${applicationRewardReqAlcohol.poscode_leader}
				</td>
		</tr>
	<tr>
			<td>staff_id_leader</td>
		<td>
					${applicationRewardReqAlcohol.staff_id_leader}
				</td>
		</tr>
	<tr>
			<td>leader_deny_reason</td>
		<td>
					${applicationRewardReqAlcohol.leader_deny_reason}
				</td>
		</tr>
	<tr>
			<td>leader_accept_reason</td>
		<td>
					${applicationRewardReqAlcohol.leader_accept_reason}
				</td>
		</tr>
	<tr>
			<td>leader_accept</td>
		<td>
					${applicationRewardReqAlcohol.leader_accept}
				</td>
		</tr>
	<tr>
			<td>leader_lean</td>
		<td>
					${applicationRewardReqAlcohol.leader_lean}
				</td>
		</tr>
	<tr>
			<td>accept_desc</td>
		<td>
					${applicationRewardReqAlcohol.accept_desc}
				</td>
		</tr>
	<tr>
			<td>accept_lean</td>
		<td>
					${applicationRewardReqAlcohol.accept_lean}
				</td>
		</tr>
	<tr>
			<td>offcode_arrest</td>
		<td>
					${applicationRewardReqAlcohol.offcode_arrest}
				</td>
		</tr>
	<tr>
			<td>poscode_arrest</td>
		<td>
					${applicationRewardReqAlcohol.poscode_arrest}
				</td>
		</tr>
	<tr>
			<td>staff_id_arrest</td>
		<td>
					${applicationRewardReqAlcohol.staff_id_arrest}
				</td>
		</tr>
	<tr>
			<td>accept_date</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqAlcohol.accept_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>application_reward_request_id</td>
		<td>
					${applicationRewardReqAlcohol.application_reward_request_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>