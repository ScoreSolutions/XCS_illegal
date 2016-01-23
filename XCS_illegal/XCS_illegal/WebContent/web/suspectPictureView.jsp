








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=SuspectPicture&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectPicture.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${suspectPicture.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${suspectPicture.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${suspectPicture.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${suspectPicture.create_by}
				</td>
		</tr>
	<tr>
			<td>description</td>
		<td>
					${suspectPicture.description}
				</td>
		</tr>
	<tr>
			<td>mime_type</td>
		<td>
					${suspectPicture.mime_type}
				</td>
		</tr>
	<tr>
			<td>picture</td>
		<td>
					<img src="<c:url value='/process?action=GetImage'/>&table=SUSPECT_PICTURE&id=${suspectPicture.id}" widht=100 height=100>
				</td>
		</tr>
	<tr>
			<td>picture_category_id</td>
		<td>
					${suspectPicture.picture_category_id}
				</td>
		</tr>
	<tr>
			<td>suspect_no</td>
		<td>
					${suspectPicture.suspect_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>