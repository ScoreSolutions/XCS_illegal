








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=RewardDivide&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>REMARKS</td>
					<td>OFFCODE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>COMPARE_CASE_ID</td>
					<td>RECEIVE_DATE</td>
					<td>DIVIDE_DATE</td>
					<td>DIVIDE_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${rewardDivides}"  var="rewardDivide">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${rewardDivide.id}</td>
			<td>
					${rewardDivide.remarks}
				</td>
				<td>
					${rewardDivide.offcode}
				</td>
				<td>
					<fmt:formatDate value="${rewardDivide.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${rewardDivide.update_by}
				</td>
				<td>
					<fmt:formatDate value="${rewardDivide.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${rewardDivide.create_by}
				</td>
				<td>
					${rewardDivide.compare_case_id}
				</td>
				<td>
					<fmt:formatDate value="${rewardDivide.receive_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${rewardDivide.divide_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${rewardDivide.divide_no}
				</td>
						<td><a href="<c:url value='/process2?action=RewardDivide&cmd=view&id='/>${rewardDivide.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=RewardDivide&cmd=edit&id='/>${rewardDivide.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=RewardDivide&cmd=delete&id='/>${rewardDivide.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=RewardDivide&cmd=add'/>">Add New Record</a>
</form>