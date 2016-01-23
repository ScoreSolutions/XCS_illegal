








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=AppArrestProveExhibit&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${appArrestProveExhibit.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${appArrestProveExhibit.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${appArrestProveExhibit.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${appArrestProveExhibit.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${appArrestProveExhibit.create_by}
				</td>
		</tr>
	<tr>
			<td>remarks</td>
		<td>
					${appArrestProveExhibit.remarks}
				</td>
		</tr>
	<tr>
			<td>app_arrest_prove_exhibit_id</td>
		<td>
					${appArrestProveExhibit.app_arrest_prove_exhibit_id}
				</td>
		</tr>
	<tr>
			<td>car_no</td>
		<td>
					${appArrestProveExhibit.car_no}
				</td>
		</tr>
	<tr>
			<td>exhibit_desc</td>
		<td>
					${appArrestProveExhibit.exhibit_desc}
				</td>
		</tr>
	<tr>
			<td>exhibit_list</td>
		<td>
					${appArrestProveExhibit.exhibit_list}
				</td>
		</tr>
	<tr>
			<td>status</td>
		<td>
					${appArrestProveExhibit.status}
				</td>
		</tr>
	<tr>
			<td>netweight_unit_code</td>
		<td>
					${appArrestProveExhibit.netweight_unit_code}
				</td>
		</tr>
	<tr>
			<td>netweight</td>
		<td>
					${appArrestProveExhibit.netweight}
				</td>
		</tr>
	<tr>
			<td>qty_unit_code</td>
		<td>
					${appArrestProveExhibit.qty_unit_code}
				</td>
		</tr>
	<tr>
			<td>qty</td>
		<td>
					${appArrestProveExhibit.qty}
				</td>
		</tr>
	<tr>
			<td>size_unit_code</td>
		<td>
					${appArrestProveExhibit.size_unit_code}
				</td>
		</tr>
	<tr>
			<td>sizes_code</td>
		<td>
					${appArrestProveExhibit.sizes_code}
				</td>
		</tr>
	<tr>
			<td>isdomestic</td>
		<td>
					${appArrestProveExhibit.isdomestic}
				</td>
		</tr>
	<tr>
			<td>brand_code</td>
		<td>
					${appArrestProveExhibit.brand_code}
				</td>
		</tr>
	<tr>
			<td>product_code</td>
		<td>
					${appArrestProveExhibit.product_code}
				</td>
		</tr>
	<tr>
			<td>duty_code</td>
		<td>
					${appArrestProveExhibit.duty_code}
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${appArrestProveExhibit.track_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>