








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=RewardDivideTax&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>MONEY2</td>
					<td>MONEY1</td>
					<td>SHARE2</td>
					<td>SHARE1</td>
					<td>DUTY_STATUS_ID</td>
					<td>STAFF_LEVEL</td>
					<td>POSITION_NAME</td>
					<td>POSCODE</td>
					<td>LAST_NAME</td>
					<td>FIRST_NAME</td>
					<td>TITLE_CODE</td>
					<td>ORDER_SEQ</td>
					<td>REWARD_DIVIDE_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${rewardDivideTaxs}"  var="rewardDivideTax">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${rewardDivideTax.id}</td>
			<td>
					<fmt:formatDate value="${rewardDivideTax.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${rewardDivideTax.update_by}
				</td>
				<td>
					<fmt:formatDate value="${rewardDivideTax.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${rewardDivideTax.create_by}
				</td>
				<td>
					${rewardDivideTax.money2}
				</td>
				<td>
					${rewardDivideTax.money1}
				</td>
				<td>
					${rewardDivideTax.share2}
				</td>
				<td>
					${rewardDivideTax.share1}
				</td>
				<td>
					${rewardDivideTax.duty_status_id}
				</td>
				<td>
					${rewardDivideTax.staff_level}
				</td>
				<td>
					${rewardDivideTax.position_name}
				</td>
				<td>
					${rewardDivideTax.poscode}
				</td>
				<td>
					${rewardDivideTax.last_name}
				</td>
				<td>
					${rewardDivideTax.first_name}
				</td>
				<td>
					${rewardDivideTax.title_code}
				</td>
				<td>
					${rewardDivideTax.order_seq}
				</td>
				<td>
					${rewardDivideTax.reward_divide_id}
				</td>
						<td><a href="<c:url value='/process2?action=RewardDivideTax&cmd=view&id='/>${rewardDivideTax.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=RewardDivideTax&cmd=edit&id='/>${rewardDivideTax.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=RewardDivideTax&cmd=delete&id='/>${rewardDivideTax.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=RewardDivideTax&cmd=add'/>">Add New Record</a>
</form>