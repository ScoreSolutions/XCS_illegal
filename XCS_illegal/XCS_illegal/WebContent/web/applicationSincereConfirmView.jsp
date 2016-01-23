








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationSincereConfirm&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationSincereConfirm.id}</td>
	</tr>
	<tr>
			<td>offname</td>
		<td>
					${applicationSincereConfirm.offname}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${applicationSincereConfirm.offcode}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationSincereConfirm.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationSincereConfirm.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationSincereConfirm.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationSincereConfirm.create_by}
				</td>
		</tr>
	<tr>
			<td>detect_result</td>
		<td>
					${applicationSincereConfirm.detect_result}
				</td>
		</tr>
	<tr>
			<td>store_by</td>
		<td>
					${applicationSincereConfirm.store_by}
				</td>
		</tr>
	<tr>
			<td>store_place</td>
		<td>
					${applicationSincereConfirm.store_place}
				</td>
		</tr>
	<tr>
			<td>owner_by</td>
		<td>
					${applicationSincereConfirm.owner_by}
				</td>
		</tr>
	<tr>
			<td>owner_name</td>
		<td>
					${applicationSincereConfirm.owner_name}
				</td>
		</tr>
	<tr>
			<td>tel</td>
		<td>
					${applicationSincereConfirm.tel}
				</td>
		</tr>
	<tr>
			<td>zipcode</td>
		<td>
					${applicationSincereConfirm.zipcode}
				</td>
		</tr>
	<tr>
			<td>subdistrict_code</td>
		<td>
					${applicationSincereConfirm.subdistrict_code}
				</td>
		</tr>
	<tr>
			<td>district_code</td>
		<td>
					${applicationSincereConfirm.district_code}
				</td>
		</tr>
	<tr>
			<td>province_code</td>
		<td>
					${applicationSincereConfirm.province_code}
				</td>
		</tr>
	<tr>
			<td>road</td>
		<td>
					${applicationSincereConfirm.road}
				</td>
		</tr>
	<tr>
			<td>soi</td>
		<td>
					${applicationSincereConfirm.soi}
				</td>
		</tr>
	<tr>
			<td>moo</td>
		<td>
					${applicationSincereConfirm.moo}
				</td>
		</tr>
	<tr>
			<td>address_no</td>
		<td>
					${applicationSincereConfirm.address_no}
				</td>
		</tr>
	<tr>
			<td>address_name</td>
		<td>
					${applicationSincereConfirm.address_name}
				</td>
		</tr>
	<tr>
			<td>coordinate_y</td>
		<td>
					${applicationSincereConfirm.coordinate_y}
				</td>
		</tr>
	<tr>
			<td>coordinate_x</td>
		<td>
					${applicationSincereConfirm.coordinate_x}
				</td>
		</tr>
	<tr>
			<td>offcode_detect</td>
		<td>
					${applicationSincereConfirm.offcode_detect}
				</td>
		</tr>
	<tr>
			<td>poscode_detect</td>
		<td>
					${applicationSincereConfirm.poscode_detect}
				</td>
		</tr>
	<tr>
			<td>staff_idcardno_detect</td>
		<td>
					${applicationSincereConfirm.staff_idcardno_detect}
				</td>
		</tr>
	<tr>
			<td>notice_date</td>
		<td>
					<fmt:formatDate value="${applicationSincereConfirm.notice_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>detect_date</td>
		<td>
					<fmt:formatDate value="${applicationSincereConfirm.detect_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>input_date</td>
		<td>
					<fmt:formatDate value="${applicationSincereConfirm.input_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${applicationSincereConfirm.track_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>