








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationArrestLicense&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationArrestLicense.id}</td>
	</tr>
	<tr>
			<td>iswithdraw</td>
		<td>
					${applicationArrestLicense.iswithdraw}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationArrestLicense.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationArrestLicense.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationArrestLicense.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationArrestLicense.create_by}
				</td>
		</tr>
	<tr>
			<td>license_no</td>
		<td>
					${applicationArrestLicense.license_no}
				</td>
		</tr>
	<tr>
			<td>book_no</td>
		<td>
					${applicationArrestLicense.book_no}
				</td>
		</tr>
	<tr>
			<td>license_type</td>
		<td>
					${applicationArrestLicense.license_type}
				</td>
		</tr>
	<tr>
			<td>establishment_name</td>
		<td>
					${applicationArrestLicense.establishment_name}
				</td>
		</tr>
	<tr>
			<td>entrepreneur</td>
		<td>
					${applicationArrestLicense.entrepreneur}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${applicationArrestLicense.offcode}
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${applicationArrestLicense.track_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>