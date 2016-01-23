








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=RewardDivideAlcohol&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>DUTY_STATUS_ID</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>DUTY_STATUS05_MONEY</td>
					<td>DUTY_STATUS04_MONEY</td>
					<td>DUTY_STATUS03_MONEY</td>
					<td>DUTY_STATUS02_MONEY</td>
					<td>DUTY_STATUS01_MONEY</td>
					<td>STAFF_LEVEL</td>
					<td>POSITION_NAME</td>
					<td>LAST_NAME</td>
					<td>FIRST_NAME</td>
					<td>TITLE_CODE</td>
					<td>ORDER_SEQ</td>
					<td>REWARD_DIVIDE_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${rewardDivideAlcohols}"  var="rewardDivideAlcohol">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${rewardDivideAlcohol.id}</td>
			<td>
					${rewardDivideAlcohol.duty_status_id}
				</td>
				<td>
					<fmt:formatDate value="${rewardDivideAlcohol.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${rewardDivideAlcohol.update_by}
				</td>
				<td>
					<fmt:formatDate value="${rewardDivideAlcohol.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${rewardDivideAlcohol.create_by}
				</td>
				<td>
					${rewardDivideAlcohol.duty_status05_money}
				</td>
				<td>
					${rewardDivideAlcohol.duty_status04_money}
				</td>
				<td>
					${rewardDivideAlcohol.duty_status03_money}
				</td>
				<td>
					${rewardDivideAlcohol.duty_status02_money}
				</td>
				<td>
					${rewardDivideAlcohol.duty_status01_money}
				</td>
				<td>
					${rewardDivideAlcohol.staff_level}
				</td>
				<td>
					${rewardDivideAlcohol.position_name}
				</td>
				<td>
					${rewardDivideAlcohol.last_name}
				</td>
				<td>
					${rewardDivideAlcohol.first_name}
				</td>
				<td>
					${rewardDivideAlcohol.title_code}
				</td>
				<td>
					${rewardDivideAlcohol.order_seq}
				</td>
				<td>
					${rewardDivideAlcohol.reward_divide_id}
				</td>
						<td><a href="<c:url value='/process2?action=RewardDivideAlcohol&cmd=view&id='/>${rewardDivideAlcohol.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=RewardDivideAlcohol&cmd=edit&id='/>${rewardDivideAlcohol.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=RewardDivideAlcohol&cmd=delete&id='/>${rewardDivideAlcohol.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=RewardDivideAlcohol&cmd=add'/>">Add New Record</a>
</form>