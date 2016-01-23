








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationArrestIndictment&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationArrestIndictment.id}</td>
	</tr>
	<tr>
			<td>exhibit_wild</td>
		<td>
					${applicationArrestIndictment.exhibit_wild}
				</td>
		</tr>
	<tr>
			<td>indictment_id</td>
		<td>
					${applicationArrestIndictment.indictment_id}
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${applicationArrestIndictment.track_no}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationArrestIndictment.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationArrestIndictment.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationArrestIndictment.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationArrestIndictment.create_by}
				</td>
		</tr>
	<tr>
		</tr>
</table>