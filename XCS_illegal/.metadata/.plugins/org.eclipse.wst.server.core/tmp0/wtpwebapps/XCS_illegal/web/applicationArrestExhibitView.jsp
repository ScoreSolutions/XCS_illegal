








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationArrestExhibit&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationArrestExhibit.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationArrestExhibit.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationArrestExhibit.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationArrestExhibit.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationArrestExhibit.create_by}
				</td>
		</tr>
	<tr>
			<td>remarks</td>
		<td>
					${applicationArrestExhibit.remarks}
				</td>
		</tr>
	<tr>
			<td>duty_code</td>
		<td>
					${applicationArrestExhibit.duty_code}
				</td>
		</tr>
	<tr>
			<td>application_arrest_exhibit_id</td>
		<td>
					${applicationArrestExhibit.application_arrest_exhibit_id}
				</td>
		</tr>
	<tr>
			<td>car_no</td>
		<td>
					${applicationArrestExhibit.car_no}
				</td>
		</tr>
	<tr>
			<td>exhibit_desc</td>
		<td>
					${applicationArrestExhibit.exhibit_desc}
				</td>
		</tr>
	<tr>
			<td>exhibit_list</td>
		<td>
					${applicationArrestExhibit.exhibit_list}
				</td>
		</tr>
	<tr>
			<td>status</td>
		<td>
					${applicationArrestExhibit.status}
				</td>
		</tr>
	<tr>
			<td>netweight_unit_code</td>
		<td>
					${applicationArrestExhibit.netweight_unit_code}
				</td>
		</tr>
	<tr>
			<td>netweight</td>
		<td>
					${applicationArrestExhibit.netweight}
				</td>
		</tr>
	<tr>
			<td>qty_unit_code</td>
		<td>
					${applicationArrestExhibit.qty_unit_code}
				</td>
		</tr>
	<tr>
			<td>qty</td>
		<td>
					${applicationArrestExhibit.qty}
				</td>
		</tr>
	<tr>
			<td>size_unit_code</td>
		<td>
					${applicationArrestExhibit.size_unit_code}
				</td>
		</tr>
	<tr>
			<td>sizes_code</td>
		<td>
					${applicationArrestExhibit.sizes_code}
				</td>
		</tr>
	<tr>
			<td>isdomestic</td>
		<td>
					${applicationArrestExhibit.isdomestic}
				</td>
		</tr>
	<tr>
			<td>brand_code</td>
		<td>
					${applicationArrestExhibit.brand_code}
				</td>
		</tr>
	<tr>
			<td>product_code</td>
		<td>
					${applicationArrestExhibit.product_code}
				</td>
		</tr>
	<tr>
			<td>isexhibitco</td>
		<td>
					${applicationArrestExhibit.isexhibitco}
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${applicationArrestExhibit.track_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>