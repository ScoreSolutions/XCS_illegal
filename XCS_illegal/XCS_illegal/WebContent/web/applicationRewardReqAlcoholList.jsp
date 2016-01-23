








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">
	function confirmBox(str_text)
	{
  		var r = confirm(str_text);
  		return r;
	}
</script>
<table border="1">
	<tr><td><%=pageUtil.getPagination()%></td><td><%=pageUtil.getPageStatus()%></td></tr>
</table>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationRewardReqAlcohol&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>REPORT_TO</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>POSCODE_RES_DIRECTOR</td>
					<td>STAFF_ID_RES_DIRECTOR</td>
					<td>RES_DIRECTOR_DENY_REASON</td>
					<td>RES_DIRECTOR_ACCEPT_REASON</td>
					<td>RES_DIRECTOR_ACCEPT</td>
					<td>POSCODE_SECTION_DIRECTOR</td>
					<td>STAFF_ID_SECTION_DIRECTOR</td>
					<td>SECTION_DIRECTOR_DENY_REASON</td>
					<td>SECTION_DIRECTOR_ACCEPT_REASON</td>
					<td>SECTION_DIRECTOR_ACCEPT</td>
					<td>SECTION_DIRECTOR_LEAN</td>
					<td>POSCODE_LEADER</td>
					<td>STAFF_ID_LEADER</td>
					<td>LEADER_DENY_REASON</td>
					<td>LEADER_ACCEPT_REASON</td>
					<td>LEADER_ACCEPT</td>
					<td>LEADER_LEAN</td>
					<td>ACCEPT_DESC</td>
					<td>ACCEPT_LEAN</td>
					<td>OFFCODE_ARREST</td>
					<td>POSCODE_ARREST</td>
					<td>STAFF_ID_ARREST</td>
					<td>ACCEPT_DATE</td>
					<td>APPLICATION_REWARD_REQUEST_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationRewardReqAlcohols}"  var="applicationRewardReqAlcohol">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationRewardReqAlcohol.id}</td>
			<td>
					${applicationRewardReqAlcohol.report_to}
				</td>
				<td>
					<fmt:formatDate value="${applicationRewardReqAlcohol.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardReqAlcohol.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationRewardReqAlcohol.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardReqAlcohol.create_by}
				</td>
				<td>
					${applicationRewardReqAlcohol.poscode_res_director}
				</td>
				<td>
					${applicationRewardReqAlcohol.staff_id_res_director}
				</td>
				<td>
					${applicationRewardReqAlcohol.res_director_deny_reason}
				</td>
				<td>
					${applicationRewardReqAlcohol.res_director_accept_reason}
				</td>
				<td>
					${applicationRewardReqAlcohol.res_director_accept}
				</td>
				<td>
					${applicationRewardReqAlcohol.poscode_section_director}
				</td>
				<td>
					${applicationRewardReqAlcohol.staff_id_section_director}
				</td>
				<td>
					${applicationRewardReqAlcohol.section_director_deny_reason}
				</td>
				<td>
					${applicationRewardReqAlcohol.section_director_accept_reason}
				</td>
				<td>
					${applicationRewardReqAlcohol.section_director_accept}
				</td>
				<td>
					${applicationRewardReqAlcohol.section_director_lean}
				</td>
				<td>
					${applicationRewardReqAlcohol.poscode_leader}
				</td>
				<td>
					${applicationRewardReqAlcohol.staff_id_leader}
				</td>
				<td>
					${applicationRewardReqAlcohol.leader_deny_reason}
				</td>
				<td>
					${applicationRewardReqAlcohol.leader_accept_reason}
				</td>
				<td>
					${applicationRewardReqAlcohol.leader_accept}
				</td>
				<td>
					${applicationRewardReqAlcohol.leader_lean}
				</td>
				<td>
					${applicationRewardReqAlcohol.accept_desc}
				</td>
				<td>
					${applicationRewardReqAlcohol.accept_lean}
				</td>
				<td>
					${applicationRewardReqAlcohol.offcode_arrest}
				</td>
				<td>
					${applicationRewardReqAlcohol.poscode_arrest}
				</td>
				<td>
					${applicationRewardReqAlcohol.staff_id_arrest}
				</td>
				<td>
					<fmt:formatDate value="${applicationRewardReqAlcohol.accept_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardReqAlcohol.application_reward_request_id}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationRewardReqAlcohol&cmd=view&id='/>${applicationRewardReqAlcohol.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationRewardReqAlcohol&cmd=edit&id='/>${applicationRewardReqAlcohol.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationRewardReqAlcohol&cmd=delete&id='/>${applicationRewardReqAlcohol.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationRewardReqAlcohol&cmd=add'/>">Add New Record</a>
</form>