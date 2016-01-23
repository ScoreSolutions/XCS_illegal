








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=SuspectVehicle&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectVehicle.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${suspectVehicle.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${suspectVehicle.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${suspectVehicle.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${suspectVehicle.create_by}
				</td>
		</tr>
	<tr>
			<td>description</td>
		<td>
					${suspectVehicle.description}
				</td>
		</tr>
	<tr>
			<td>car_color</td>
		<td>
					${suspectVehicle.car_color}
				</td>
		</tr>
	<tr>
			<td>car_model</td>
		<td>
					${suspectVehicle.car_model}
				</td>
		</tr>
	<tr>
			<td>brand_brand_code</td>
		<td>
					${suspectVehicle.brand_brand_code}
				</td>
		</tr>
	<tr>
			<td>brand_duty_code</td>
		<td>
					${suspectVehicle.brand_duty_code}
				</td>
		</tr>
	<tr>
			<td>car_no</td>
		<td>
					${suspectVehicle.car_no}
				</td>
		</tr>
	<tr>
			<td>car_cate</td>
		<td>
					${suspectVehicle.car_cate}
				</td>
		</tr>
	<tr>
			<td>producttype_type_code</td>
		<td>
					${suspectVehicle.producttype_type_code}
				</td>
		</tr>
	<tr>
			<td>producttype_duty_code</td>
		<td>
					${suspectVehicle.producttype_duty_code}
				</td>
		</tr>
	<tr>
			<td>province_code</td>
		<td>
					${suspectVehicle.province_code}
				</td>
		</tr>
	<tr>
			<td>suspect_investigate_id</td>
		<td>
					${suspectVehicle.suspect_investigate_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>