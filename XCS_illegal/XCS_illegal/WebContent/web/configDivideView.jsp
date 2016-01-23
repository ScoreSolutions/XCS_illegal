








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ConfigDivide&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${configDivide.id}</td>
	</tr>
	<tr>
			<td>remarks</td>
		<td>
					${configDivide.remarks}
				</td>
		</tr>
	<tr>
			<td>share_qty</td>
		<td>
					${configDivide.share_qty}
				</td>
		</tr>
	<tr>
			<td>ref_value</td>
		<td>
					${configDivide.ref_value}
				</td>
		</tr>
	<tr>
			<td>ref_table</td>
		<td>
					${configDivide.ref_table}
				</td>
		</tr>
	<tr>
			<td>duty_status05</td>
		<td>
					${configDivide.duty_status05}
				</td>
		</tr>
	<tr>
			<td>duty_status04</td>
		<td>
					${configDivide.duty_status04}
				</td>
		</tr>
	<tr>
			<td>duty_status03</td>
		<td>
					${configDivide.duty_status03}
				</td>
		</tr>
	<tr>
			<td>duty_status02</td>
		<td>
					${configDivide.duty_status02}
				</td>
		</tr>
	<tr>
			<td>duty_status01</td>
		<td>
					${configDivide.duty_status01}
				</td>
		</tr>
	<tr>
			<td>proportion</td>
		<td>
					${configDivide.proportion}
				</td>
		</tr>
	<tr>
			<td>bribe_reward</td>
		<td>
					${configDivide.bribe_reward}
				</td>
		</tr>
	<tr>
			<td>legislation_id</td>
		<td>
					${configDivide.legislation_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>