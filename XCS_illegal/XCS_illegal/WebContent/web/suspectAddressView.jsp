








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=SuspectAddress&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectAddress.id}</td>
	</tr>
	<tr>
			<td>coordinate_y</td>
		<td>
					${suspectAddress.coordinate_y}
				</td>
		</tr>
	<tr>
			<td>coordinate_x</td>
		<td>
					${suspectAddress.coordinate_x}
				</td>
		</tr>
	<tr>
			<td>description</td>
		<td>
					${suspectAddress.description}
				</td>
		</tr>
	<tr>
			<td>fax_no</td>
		<td>
					${suspectAddress.fax_no}
				</td>
		</tr>
	<tr>
			<td>tel_no</td>
		<td>
					${suspectAddress.tel_no}
				</td>
		</tr>
	<tr>
			<td>zipcode</td>
		<td>
					${suspectAddress.zipcode}
				</td>
		</tr>
	<tr>
			<td>province_code</td>
		<td>
					${suspectAddress.province_code}
				</td>
		</tr>
	<tr>
			<td>district_code</td>
		<td>
					${suspectAddress.district_code}
				</td>
		</tr>
	<tr>
			<td>subdistrict_code</td>
		<td>
					${suspectAddress.subdistrict_code}
				</td>
		</tr>
	<tr>
			<td>moo</td>
		<td>
					${suspectAddress.moo}
				</td>
		</tr>
	<tr>
			<td>road</td>
		<td>
					${suspectAddress.road}
				</td>
		</tr>
	<tr>
			<td>soi</td>
		<td>
					${suspectAddress.soi}
				</td>
		</tr>
	<tr>
			<td>address_name</td>
		<td>
					${suspectAddress.address_name}
				</td>
		</tr>
	<tr>
			<td>address</td>
		<td>
					${suspectAddress.address}
				</td>
		</tr>
	<tr>
			<td>suspect_no</td>
		<td>
					${suspectAddress.suspect_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>