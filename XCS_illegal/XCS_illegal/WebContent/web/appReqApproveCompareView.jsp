








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=AppReqApproveCompare&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${appReqApproveCompare.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompare.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${appReqApproveCompare.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompare.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${appReqApproveCompare.create_by}
				</td>
		</tr>
	<tr>
			<td>compare_reason</td>
		<td>
					${appReqApproveCompare.compare_reason}
				</td>
		</tr>
	<tr>
			<td>mistake_detail</td>
		<td>
					${appReqApproveCompare.mistake_detail}
				</td>
		</tr>
	<tr>
			<td>islawbreakerrent</td>
		<td>
					${appReqApproveCompare.islawbreakerrent}
				</td>
		</tr>
	<tr>
			<td>contract_date</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompare.contract_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>contract_no</td>
		<td>
					${appReqApproveCompare.contract_no}
				</td>
		</tr>
	<tr>
			<td>contract</td>
		<td>
					${appReqApproveCompare.contract}
				</td>
		</tr>
	<tr>
			<td>rent_name</td>
		<td>
					${appReqApproveCompare.rent_name}
				</td>
		</tr>
	<tr>
			<td>ownership</td>
		<td>
					${appReqApproveCompare.ownership}
				</td>
		</tr>
	<tr>
			<td>hold_ship</td>
		<td>
					${appReqApproveCompare.hold_ship}
				</td>
		</tr>
	<tr>
			<td>body_no</td>
		<td>
					${appReqApproveCompare.body_no}
				</td>
		</tr>
	<tr>
			<td>engine_no</td>
		<td>
					${appReqApproveCompare.engine_no}
				</td>
		</tr>
	<tr>
			<td>vehicle_name</td>
		<td>
					${appReqApproveCompare.vehicle_name}
				</td>
		</tr>
	<tr>
			<td>compare_case_id</td>
		<td>
					${appReqApproveCompare.compare_case_id}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${appReqApproveCompare.offcode}
				</td>
		</tr>
	<tr>
			<td>req_date</td>
		<td>
					<fmt:formatDate value="${appReqApproveCompare.req_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${appReqApproveCompare.track_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>