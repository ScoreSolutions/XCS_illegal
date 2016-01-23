








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ConfigShareMoneyPercent&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${configShareMoneyPercent.id}</td>
	</tr>
	<tr>
			<td>type_code</td>
		<td>
					${configShareMoneyPercent.type_code}
				</td>
		</tr>
	<tr>
			<td>duty_code</td>
		<td>
					${configShareMoneyPercent.duty_code}
				</td>
		</tr>
	<tr>
			<td>penalty_case_law_id</td>
		<td>
					${configShareMoneyPercent.penalty_case_law_id}
				</td>
		</tr>
	<tr>
			<td>reward_limit</td>
		<td>
					${configShareMoneyPercent.reward_limit}
				</td>
		</tr>
	<tr>
			<td>bribe_limit</td>
		<td>
					${configShareMoneyPercent.bribe_limit}
				</td>
		</tr>
	<tr>
			<td>treasury</td>
		<td>
					${configShareMoneyPercent.treasury}
				</td>
		</tr>
	<tr>
			<td>reward</td>
		<td>
					${configShareMoneyPercent.reward}
				</td>
		</tr>
	<tr>
			<td>bribe</td>
		<td>
					${configShareMoneyPercent.bribe}
				</td>
		</tr>
	<tr>
			<td>isnotice</td>
		<td>
					${configShareMoneyPercent.isnotice}
				</td>
		</tr>
	<tr>
			<td>legislation_id</td>
		<td>
					${configShareMoneyPercent.legislation_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>