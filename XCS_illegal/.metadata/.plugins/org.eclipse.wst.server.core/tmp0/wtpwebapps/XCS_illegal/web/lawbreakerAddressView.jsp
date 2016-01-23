








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=LawbreakerAddress&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${lawbreakerAddress.id}</td>
	</tr>
	<tr>
			<td>description</td>
		<td>
					${lawbreakerAddress.description}
				</td>
		</tr>
	<tr>
			<td>fax_no</td>
		<td>
					${lawbreakerAddress.fax_no}
				</td>
		</tr>
	<tr>
			<td>tel_no</td>
		<td>
					${lawbreakerAddress.tel_no}
				</td>
		</tr>
	<tr>
			<td>zipcode</td>
		<td>
					${lawbreakerAddress.zipcode}
				</td>
		</tr>
	<tr>
			<td>province_code</td>
		<td>
					${lawbreakerAddress.province_code}
				</td>
		</tr>
	<tr>
			<td>distric_code</td>
		<td>
					${lawbreakerAddress.distric_code}
				</td>
		</tr>
	<tr>
			<td>subdistric_code</td>
		<td>
					${lawbreakerAddress.subdistric_code}
				</td>
		</tr>
	<tr>
			<td>moo</td>
		<td>
					${lawbreakerAddress.moo}
				</td>
		</tr>
	<tr>
			<td>road</td>
		<td>
					${lawbreakerAddress.road}
				</td>
		</tr>
	<tr>
			<td>soi</td>
		<td>
					${lawbreakerAddress.soi}
				</td>
		</tr>
	<tr>
			<td>address_name</td>
		<td>
					${lawbreakerAddress.address_name}
				</td>
		</tr>
	<tr>
			<td>address</td>
		<td>
					${lawbreakerAddress.address}
				</td>
		</tr>
	<tr>
			<td>lawbreaker_no</td>
		<td>
					${lawbreakerAddress.lawbreaker_no}
				</td>
		</tr>
	<tr>
			<td>address_no</td>
		<td>
					${lawbreakerAddress.address_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>