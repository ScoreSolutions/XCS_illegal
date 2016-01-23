








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationRewardRequest&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardRequest.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardRequest.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationRewardRequest.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardRequest.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationRewardRequest.create_by}
				</td>
		</tr>
	<tr>
			<td>compare_case_id</td>
		<td>
					${applicationRewardRequest.compare_case_id}
				</td>
		</tr>
	<tr>
			<td>receive_date</td>
		<td>
					<fmt:formatDate value="${applicationRewardRequest.receive_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>inform_position</td>
		<td>
					${applicationRewardRequest.inform_position}
				</td>
		</tr>
	<tr>
			<td>inform_name</td>
		<td>
					${applicationRewardRequest.inform_name}
				</td>
		</tr>
	<tr>
			<td>poscode_receive</td>
		<td>
					${applicationRewardRequest.poscode_receive}
				</td>
		</tr>
	<tr>
			<td>staff_id_receive</td>
		<td>
					${applicationRewardRequest.staff_id_receive}
				</td>
		</tr>
	<tr>
			<td>poscode_request</td>
		<td>
					${applicationRewardRequest.poscode_request}
				</td>
		</tr>
	<tr>
			<td>staff_id_request</td>
		<td>
					${applicationRewardRequest.staff_id_request}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${applicationRewardRequest.offcode}
				</td>
		</tr>
	<tr>
			<td>request_date</td>
		<td>
					<fmt:formatDate value="${applicationRewardRequest.request_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>request_no</td>
		<td>
					${applicationRewardRequest.request_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>