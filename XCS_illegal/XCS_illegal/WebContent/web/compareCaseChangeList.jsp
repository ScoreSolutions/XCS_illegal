








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=CompareCaseChange&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>CANCEL_BY</td>
					<td>CANCEL_DATE</td>
					<td>ISCANCEL</td>
					<td>TREASURY_MONEY_OLD</td>
					<td>REWARD_MONEY_OLD</td>
					<td>BRIBE_MONEY_OLD</td>
					<td>CASE_FINE_OLD</td>
					<td>CHANGE_REASON</td>
					<td>INV_TYPE</td>
					<td>CHANGE_DATE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>CHANGE_MONEY</td>
					<td>CHANGE_TYPE</td>
					<td>COMPARE_CASE_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${compareCaseChanges}"  var="compareCaseChange">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${compareCaseChange.id}</td>
			<td>
					${compareCaseChange.cancel_by}
				</td>
				<td>
					<fmt:formatDate value="${compareCaseChange.cancel_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareCaseChange.iscancel}
				</td>
				<td>
					${compareCaseChange.treasury_money_old}
				</td>
				<td>
					${compareCaseChange.reward_money_old}
				</td>
				<td>
					${compareCaseChange.bribe_money_old}
				</td>
				<td>
					${compareCaseChange.case_fine_old}
				</td>
				<td>
					${compareCaseChange.change_reason}
				</td>
				<td>
					${compareCaseChange.inv_type}
				</td>
				<td>
					<fmt:formatDate value="${compareCaseChange.change_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${compareCaseChange.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareCaseChange.update_by}
				</td>
				<td>
					<fmt:formatDate value="${compareCaseChange.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareCaseChange.create_by}
				</td>
				<td>
					${compareCaseChange.change_money}
				</td>
				<td>
					${compareCaseChange.change_type}
				</td>
				<td>
					${compareCaseChange.compare_case_id}
				</td>
						<td><a href="<c:url value='/process2?action=CompareCaseChange&cmd=view&id='/>${compareCaseChange.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=CompareCaseChange&cmd=edit&id='/>${compareCaseChange.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=CompareCaseChange&cmd=delete&id='/>${compareCaseChange.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=CompareCaseChange&cmd=add'/>">Add New Record</a>
</form>