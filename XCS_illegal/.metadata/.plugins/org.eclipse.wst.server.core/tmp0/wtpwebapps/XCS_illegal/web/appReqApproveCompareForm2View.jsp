








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=AppReqApproveCompareForm2&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${appReqApproveCompareForm2.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompareForm2.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${appReqApproveCompareForm2.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompareForm2.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${appReqApproveCompareForm2.create_by}
				</td>
		</tr>
	<tr>
			<td>offcode_approve</td>
		<td>
					${appReqApproveCompareForm2.offcode_approve}
				</td>
		</tr>
	<tr>
			<td>poscode_approve</td>
		<td>
					${appReqApproveCompareForm2.poscode_approve}
				</td>
		</tr>
	<tr>
			<td>staff_id_approve</td>
		<td>
					${appReqApproveCompareForm2.staff_id_approve}
				</td>
		</tr>
	<tr>
			<td>approve_date</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompareForm2.approve_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>noneapprove_desc</td>
		<td>
					${appReqApproveCompareForm2.noneapprove_desc}
				</td>
		</tr>
	<tr>
			<td>approve_desc</td>
		<td>
					${appReqApproveCompareForm2.approve_desc}
				</td>
		</tr>
	<tr>
			<td>isapprove</td>
		<td>
					${appReqApproveCompareForm2.isapprove}
				</td>
		</tr>
	<tr>
			<td>offcode_accept</td>
		<td>
					${appReqApproveCompareForm2.offcode_accept}
				</td>
		</tr>
	<tr>
			<td>poscode_accept</td>
		<td>
					${appReqApproveCompareForm2.poscode_accept}
				</td>
		</tr>
	<tr>
			<td>staff_id_accept</td>
		<td>
					${appReqApproveCompareForm2.staff_id_accept}
				</td>
		</tr>
	<tr>
			<td>noneaccept_desc</td>
		<td>
					${appReqApproveCompareForm2.noneaccept_desc}
				</td>
		</tr>
	<tr>
			<td>accept_desc</td>
		<td>
					${appReqApproveCompareForm2.accept_desc}
				</td>
		</tr>
	<tr>
			<td>isaccept</td>
		<td>
					${appReqApproveCompareForm2.isaccept}
				</td>
		</tr>
	<tr>
			<td>offcode_director</td>
		<td>
					${appReqApproveCompareForm2.offcode_director}
				</td>
		</tr>
	<tr>
			<td>poscode_director</td>
		<td>
					${appReqApproveCompareForm2.poscode_director}
				</td>
		</tr>
	<tr>
			<td>staff_id_director</td>
		<td>
					${appReqApproveCompareForm2.staff_id_director}
				</td>
		</tr>
	<tr>
			<td>director_inform_date</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompareForm2.director_inform_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>director_inform_for</td>
		<td>
					${appReqApproveCompareForm2.director_inform_for}
				</td>
		</tr>
	<tr>
			<td>director_inform_to</td>
		<td>
					${appReqApproveCompareForm2.director_inform_to}
				</td>
		</tr>
	<tr>
			<td>offcode_inform</td>
		<td>
					${appReqApproveCompareForm2.offcode_inform}
				</td>
		</tr>
	<tr>
			<td>poscode_inform</td>
		<td>
					${appReqApproveCompareForm2.poscode_inform}
				</td>
		</tr>
	<tr>
			<td>staff_id_inform</td>
		<td>
					${appReqApproveCompareForm2.staff_id_inform}
				</td>
		</tr>
	<tr>
			<td>inform_date</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompareForm2.inform_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>inform_for</td>
		<td>
					${appReqApproveCompareForm2.inform_for}
				</td>
		</tr>
	<tr>
			<td>inform_to</td>
		<td>
					${appReqApproveCompareForm2.inform_to}
				</td>
		</tr>
	<tr>
			<td>app_req_approve_compare_id</td>
		<td>
					${appReqApproveCompareForm2.app_req_approve_compare_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>