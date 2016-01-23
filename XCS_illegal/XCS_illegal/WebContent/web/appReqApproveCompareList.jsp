








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=AppReqApproveCompare&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>COMPARE_REASON</td>
					<td>MISTAKE_DETAIL</td>
					<td>ISLAWBREAKERRENT</td>
					<td>CONTRACT_DATE</td>
					<td>CONTRACT_NO</td>
					<td>CONTRACT</td>
					<td>RENT_NAME</td>
					<td>OWNERSHIP</td>
					<td>HOLD_SHIP</td>
					<td>BODY_NO</td>
					<td>ENGINE_NO</td>
					<td>VEHICLE_NAME</td>
					<td>COMPARE_CASE_ID</td>
					<td>OFFCODE</td>
					<td>REQ_DATE</td>
					<td>TRACK_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${appReqApproveCompares}"  var="appReqApproveCompare">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${appReqApproveCompare.id}</td>
			<td>
					<fmt:formatDate value="${appReqApproveCompare.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompare.update_by}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompare.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompare.create_by}
				</td>
				<td>
					${appReqApproveCompare.compare_reason}
				</td>
				<td>
					${appReqApproveCompare.mistake_detail}
				</td>
				<td>
					${appReqApproveCompare.islawbreakerrent}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompare.contract_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompare.contract_no}
				</td>
				<td>
					${appReqApproveCompare.contract}
				</td>
				<td>
					${appReqApproveCompare.rent_name}
				</td>
				<td>
					${appReqApproveCompare.ownership}
				</td>
				<td>
					${appReqApproveCompare.hold_ship}
				</td>
				<td>
					${appReqApproveCompare.body_no}
				</td>
				<td>
					${appReqApproveCompare.engine_no}
				</td>
				<td>
					${appReqApproveCompare.vehicle_name}
				</td>
				<td>
					${appReqApproveCompare.compare_case_id}
				</td>
				<td>
					${appReqApproveCompare.offcode}
				</td>
				<td>
					<fmt:formatDate value="${appReqApproveCompare.req_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appReqApproveCompare.track_no}
				</td>
						<td><a href="<c:url value='/process2?action=AppReqApproveCompare&cmd=view&id='/>${appReqApproveCompare.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=AppReqApproveCompare&cmd=edit&id='/>${appReqApproveCompare.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=AppReqApproveCompare&cmd=delete&id='/>${appReqApproveCompare.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=AppReqApproveCompare&cmd=add'/>">Add New Record</a>
</form>