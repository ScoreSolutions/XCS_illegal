








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=AppReqApproveCompareForm1&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>OFFCODE_APPROVE</td>
					<td>POSCODE_APPROVE</td>
					<td>STAFF_ID_APPROVE</td>
					<td>APPROVE_DATE</td>
					<td>NONEAPPROVE_DESC</td>
					<td>APPROVE_DESC</td>
					<td>ISAPPROVE</td>
					<td>OFFCODE_ACCEPT</td>
					<td>POSCODE_ACCEPT</td>
					<td>STAFF_ID_ACCEPT</td>
					<td>NONEACCEPT_DESC</td>
					<td>ACCEPT_DESC</td>
					<td>ISACCEPT</td>
					<td>OFFCODE_INFORM</td>
					<td>POSCODE_INFORM</td>
					<td>STAFF_ID_INFORM</td>
					<td>INFORM_DATE</td>
					<td>INFORM_FOR</td>
					<td>INFORM_TO</td>
					<td>APP_REQ_APPROVE_COMPARE_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${appReqApproveCompareForm1s}"  var="appReqApproveCompareForm1">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${appReqApproveCompareForm1.id}</td>
			<td>
					<fmt:formatDate value="${appReqApproveCompareForm1.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompareForm1.update_by}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompareForm1.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompareForm1.create_by}
				</td>
				<td>
					${appReqApproveCompareForm1.offcode_approve}
				</td>
				<td>
					${appReqApproveCompareForm1.poscode_approve}
				</td>
				<td>
					${appReqApproveCompareForm1.staff_id_approve}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompareForm1.approve_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompareForm1.noneapprove_desc}
				</td>
				<td>
					${appReqApproveCompareForm1.approve_desc}
				</td>
				<td>
					${appReqApproveCompareForm1.isapprove}
				</td>
				<td>
					${appReqApproveCompareForm1.offcode_accept}
				</td>
				<td>
					${appReqApproveCompareForm1.poscode_accept}
				</td>
				<td>
					${appReqApproveCompareForm1.staff_id_accept}
				</td>
				<td>
					${appReqApproveCompareForm1.noneaccept_desc}
				</td>
				<td>
					${appReqApproveCompareForm1.accept_desc}
				</td>
				<td>
					${appReqApproveCompareForm1.isaccept}
				</td>
				<td>
					${appReqApproveCompareForm1.offcode_inform}
				</td>
				<td>
					${appReqApproveCompareForm1.poscode_inform}
				</td>
				<td>
					${appReqApproveCompareForm1.staff_id_inform}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompareForm1.inform_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompareForm1.inform_for}
				</td>
				<td>
					${appReqApproveCompareForm1.inform_to}
				</td>
				<td>
					${appReqApproveCompareForm1.app_req_approve_compare_id}
				</td>
						<td><a href="<c:url value='/process2?action=AppReqApproveCompareForm1&cmd=view&id='/>${appReqApproveCompareForm1.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=AppReqApproveCompareForm1&cmd=edit&id='/>${appReqApproveCompareForm1.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=AppReqApproveCompareForm1&cmd=delete&id='/>${appReqApproveCompareForm1.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=AppReqApproveCompareForm1&cmd=add'/>">Add New Record</a>
</form>