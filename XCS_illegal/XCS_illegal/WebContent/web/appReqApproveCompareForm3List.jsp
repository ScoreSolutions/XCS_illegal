








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=AppReqApproveCompareForm3&cmd=delete"/>">
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
					<td>OFFCODE_DIRECTOR</td>
					<td>POSCODE_DIRECTOR</td>
					<td>STAFF_ID_DIRECTOR</td>
					<td>DIRECTOR_INFORM_DATE</td>
					<td>DIRECTOR_INFORM_FOR</td>
					<td>DIRECTOR_INFORM_TO</td>
					<td>OFFCODE_LAWYER8</td>
					<td>POSCODE_LAWYER8</td>
					<td>STAFF_ID_LAWYER8</td>
					<td>LAWYER8_INFORM_DATE</td>
					<td>LAWYER8_INFORM_FOR</td>
					<td>LAWYER8_INFORM_TO</td>
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
		<c:forEach items="${appReqApproveCompareForm3s}"  var="appReqApproveCompareForm3">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${appReqApproveCompareForm3.id}</td>
			<td>
					<fmt:formatDate value="${appReqApproveCompareForm3.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompareForm3.update_by}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompareForm3.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompareForm3.create_by}
				</td>
				<td>
					${appReqApproveCompareForm3.offcode_approve}
				</td>
				<td>
					${appReqApproveCompareForm3.poscode_approve}
				</td>
				<td>
					${appReqApproveCompareForm3.staff_id_approve}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompareForm3.approve_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompareForm3.noneapprove_desc}
				</td>
				<td>
					${appReqApproveCompareForm3.approve_desc}
				</td>
				<td>
					${appReqApproveCompareForm3.isapprove}
				</td>
				<td>
					${appReqApproveCompareForm3.offcode_accept}
				</td>
				<td>
					${appReqApproveCompareForm3.poscode_accept}
				</td>
				<td>
					${appReqApproveCompareForm3.staff_id_accept}
				</td>
				<td>
					${appReqApproveCompareForm3.noneaccept_desc}
				</td>
				<td>
					${appReqApproveCompareForm3.accept_desc}
				</td>
				<td>
					${appReqApproveCompareForm3.isaccept}
				</td>
				<td>
					${appReqApproveCompareForm3.offcode_director}
				</td>
				<td>
					${appReqApproveCompareForm3.poscode_director}
				</td>
				<td>
					${appReqApproveCompareForm3.staff_id_director}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompareForm3.director_inform_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompareForm3.director_inform_for}
				</td>
				<td>
					${appReqApproveCompareForm3.director_inform_to}
				</td>
				<td>
					${appReqApproveCompareForm3.offcode_lawyer8}
				</td>
				<td>
					${appReqApproveCompareForm3.poscode_lawyer8}
				</td>
				<td>
					${appReqApproveCompareForm3.staff_id_lawyer8}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompareForm3.lawyer8_inform_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompareForm3.lawyer8_inform_for}
				</td>
				<td>
					${appReqApproveCompareForm3.lawyer8_inform_to}
				</td>
				<td>
					${appReqApproveCompareForm3.offcode_inform}
				</td>
				<td>
					${appReqApproveCompareForm3.poscode_inform}
				</td>
				<td>
					${appReqApproveCompareForm3.staff_id_inform}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompareForm3.inform_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompareForm3.inform_for}
				</td>
				<td>
					${appReqApproveCompareForm3.inform_to}
				</td>
				<td>
					${appReqApproveCompareForm3.app_req_approve_compare_id}
				</td>
						<td><a href="<c:url value='/process2?action=AppReqApproveCompareForm3&cmd=view&id='/>${appReqApproveCompareForm3.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=AppReqApproveCompareForm3&cmd=edit&id='/>${appReqApproveCompareForm3.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=AppReqApproveCompareForm3&cmd=delete&id='/>${appReqApproveCompareForm3.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=AppReqApproveCompareForm3&cmd=add'/>">Add New Record</a>
</form>