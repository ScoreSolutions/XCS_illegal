








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=RewardDivideTax&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${rewardDivideTax.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${rewardDivideTax.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${rewardDivideTax.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${rewardDivideTax.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${rewardDivideTax.create_by}
				</td>
		</tr>
	<tr>
			<td>money2</td>
		<td>
					${rewardDivideTax.money2}
				</td>
		</tr>
	<tr>
			<td>money1</td>
		<td>
					${rewardDivideTax.money1}
				</td>
		</tr>
	<tr>
			<td>share2</td>
		<td>
					${rewardDivideTax.share2}
				</td>
		</tr>
	<tr>
			<td>share1</td>
		<td>
					${rewardDivideTax.share1}
				</td>
		</tr>
	<tr>
			<td>duty_status_id</td>
		<td>
					${rewardDivideTax.duty_status_id}
				</td>
		</tr>
	<tr>
			<td>staff_level</td>
		<td>
					${rewardDivideTax.staff_level}
				</td>
		</tr>
	<tr>
			<td>position_name</td>
		<td>
					${rewardDivideTax.position_name}
				</td>
		</tr>
	<tr>
			<td>poscode</td>
		<td>
					${rewardDivideTax.poscode}
				</td>
		</tr>
	<tr>
			<td>last_name</td>
		<td>
					${rewardDivideTax.last_name}
				</td>
		</tr>
	<tr>
			<td>first_name</td>
		<td>
					${rewardDivideTax.first_name}
				</td>
		</tr>
	<tr>
			<td>title_code</td>
		<td>
					${rewardDivideTax.title_code}
				</td>
		</tr>
	<tr>
			<td>order_seq</td>
		<td>
					${rewardDivideTax.order_seq}
				</td>
		</tr>
	<tr>
			<td>reward_divide_id</td>
		<td>
					${rewardDivideTax.reward_divide_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>