








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=AppReqApproveCompareForm1&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${appReqApproveCompareForm1.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompareForm1.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${appReqApproveCompareForm1.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompareForm1.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${appReqApproveCompareForm1.create_by}
				</td>
		</tr>
	<tr>
			<td>offcode_approve</td>
		<td>
					${appReqApproveCompareForm1.offcode_approve}
				</td>
		</tr>
	<tr>
			<td>poscode_approve</td>
		<td>
					${appReqApproveCompareForm1.poscode_approve}
				</td>
		</tr>
	<tr>
			<td>staff_id_approve</td>
		<td>
					${appReqApproveCompareForm1.staff_id_approve}
				</td>
		</tr>
	<tr>
			<td>approve_date</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompareForm1.approve_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>noneapprove_desc</td>
		<td>
					${appReqApproveCompareForm1.noneapprove_desc}
				</td>
		</tr>
	<tr>
			<td>approve_desc</td>
		<td>
					${appReqApproveCompareForm1.approve_desc}
				</td>
		</tr>
	<tr>
			<td>isapprove</td>
		<td>
					${appReqApproveCompareForm1.isapprove}
				</td>
		</tr>
	<tr>
			<td>offcode_accept</td>
		<td>
					${appReqApproveCompareForm1.offcode_accept}
				</td>
		</tr>
	<tr>
			<td>poscode_accept</td>
		<td>
					${appReqApproveCompareForm1.poscode_accept}
				</td>
		</tr>
	<tr>
			<td>staff_id_accept</td>
		<td>
					${appReqApproveCompareForm1.staff_id_accept}
				</td>
		</tr>
	<tr>
			<td>noneaccept_desc</td>
		<td>
					${appReqApproveCompareForm1.noneaccept_desc}
				</td>
		</tr>
	<tr>
			<td>accept_desc</td>
		<td>
					${appReqApproveCompareForm1.accept_desc}
				</td>
		</tr>
	<tr>
			<td>isaccept</td>
		<td>
					${appReqApproveCompareForm1.isaccept}
				</td>
		</tr>
	<tr>
			<td>offcode_inform</td>
		<td>
					${appReqApproveCompareForm1.offcode_inform}
				</td>
		</tr>
	<tr>
			<td>poscode_inform</td>
		<td>
					${appReqApproveCompareForm1.poscode_inform}
				</td>
		</tr>
	<tr>
			<td>staff_id_inform</td>
		<td>
					${appReqApproveCompareForm1.staff_id_inform}
				</td>
		</tr>
	<tr>
			<td>inform_date</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompareForm1.inform_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>inform_for</td>
		<td>
					${appReqApproveCompareForm1.inform_for}
				</td>
		</tr>
	<tr>
			<td>inform_to</td>
		<td>
					${appReqApproveCompareForm1.inform_to}
				</td>
		</tr>
	<tr>
			<td>app_req_approve_compare_id</td>
		<td>
					${appReqApproveCompareForm1.app_req_approve_compare_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>