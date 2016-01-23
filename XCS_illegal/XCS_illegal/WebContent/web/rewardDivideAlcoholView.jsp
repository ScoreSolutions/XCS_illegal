








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=RewardDivideAlcohol&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${rewardDivideAlcohol.id}</td>
	</tr>
	<tr>
			<td>duty_status_id</td>
		<td>
					${rewardDivideAlcohol.duty_status_id}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${rewardDivideAlcohol.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${rewardDivideAlcohol.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${rewardDivideAlcohol.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${rewardDivideAlcohol.create_by}
				</td>
		</tr>
	<tr>
			<td>duty_status05_money</td>
		<td>
					${rewardDivideAlcohol.duty_status05_money}
				</td>
		</tr>
	<tr>
			<td>duty_status04_money</td>
		<td>
					${rewardDivideAlcohol.duty_status04_money}
				</td>
		</tr>
	<tr>
			<td>duty_status03_money</td>
		<td>
					${rewardDivideAlcohol.duty_status03_money}
				</td>
		</tr>
	<tr>
			<td>duty_status02_money</td>
		<td>
					${rewardDivideAlcohol.duty_status02_money}
				</td>
		</tr>
	<tr>
			<td>duty_status01_money</td>
		<td>
					${rewardDivideAlcohol.duty_status01_money}
				</td>
		</tr>
	<tr>
			<td>staff_level</td>
		<td>
					${rewardDivideAlcohol.staff_level}
				</td>
		</tr>
	<tr>
			<td>position_name</td>
		<td>
					${rewardDivideAlcohol.position_name}
				</td>
		</tr>
	<tr>
			<td>last_name</td>
		<td>
					${rewardDivideAlcohol.last_name}
				</td>
		</tr>
	<tr>
			<td>first_name</td>
		<td>
					${rewardDivideAlcohol.first_name}
				</td>
		</tr>
	<tr>
			<td>title_code</td>
		<td>
					${rewardDivideAlcohol.title_code}
				</td>
		</tr>
	<tr>
			<td>order_seq</td>
		<td>
					${rewardDivideAlcohol.order_seq}
				</td>
		</tr>
	<tr>
			<td>reward_divide_id</td>
		<td>
					${rewardDivideAlcohol.reward_divide_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>