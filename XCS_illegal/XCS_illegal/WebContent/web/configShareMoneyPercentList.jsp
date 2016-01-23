








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ConfigShareMoneyPercent&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>TYPE_CODE</td>
					<td>DUTY_CODE</td>
					<td>PENALTY_CASE_LAW_ID</td>
					<td>REWARD_LIMIT</td>
					<td>BRIBE_LIMIT</td>
					<td>TREASURY</td>
					<td>REWARD</td>
					<td>BRIBE</td>
					<td>ISNOTICE</td>
					<td>LEGISLATION_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${configShareMoneyPercents}"  var="configShareMoneyPercent">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${configShareMoneyPercent.id}</td>
			<td>
					${configShareMoneyPercent.type_code}
				</td>
				<td>
					${configShareMoneyPercent.duty_code}
				</td>
				<td>
					${configShareMoneyPercent.penalty_case_law_id}
				</td>
				<td>
					${configShareMoneyPercent.reward_limit}
				</td>
				<td>
					${configShareMoneyPercent.bribe_limit}
				</td>
				<td>
					${configShareMoneyPercent.treasury}
				</td>
				<td>
					${configShareMoneyPercent.reward}
				</td>
				<td>
					${configShareMoneyPercent.bribe}
				</td>
				<td>
					${configShareMoneyPercent.isnotice}
				</td>
				<td>
					${configShareMoneyPercent.legislation_id}
				</td>
						<td><a href="<c:url value='/process2?action=ConfigShareMoneyPercent&cmd=view&id='/>${configShareMoneyPercent.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ConfigShareMoneyPercent&cmd=edit&id='/>${configShareMoneyPercent.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ConfigShareMoneyPercent&cmd=delete&id='/>${configShareMoneyPercent.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ConfigShareMoneyPercent&cmd=add'/>">Add New Record</a>
</form>