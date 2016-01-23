








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Indictment&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>INDICTMENT_ID</td>
		<td>${indictment.indictment_id}</td>
	</tr>
	<tr>
			<td>guilt_mst_id</td>
		<td>
					${indictment.guilt_mst_id}
				</td>
		</tr>
	<tr>
			<td>remarks</td>
		<td>
					${indictment.remarks}
				</td>
		</tr>
	<tr>
			<td>exhibit_wild</td>
		<td>
					${indictment.exhibit_wild}
				</td>
		</tr>
	<tr>
			<td>isimprison</td>
		<td>
					${indictment.isimprison}
				</td>
		</tr>
	<tr>
			<td>fine_rate</td>
		<td>
					${indictment.fine_rate}
				</td>
		</tr>
	<tr>
			<td>isfine</td>
		<td>
					${indictment.isfine}
				</td>
		</tr>
	<tr>
			<td>penalty_desc</td>
		<td>
					${indictment.penalty_desc}
				</td>
		</tr>
	<tr>
			<td>penalty_case_law_id</td>
		<td>
					${indictment.penalty_case_law_id}
				</td>
		</tr>
	<tr>
			<td>guilt_base</td>
		<td>
					${indictment.guilt_base}
				</td>
		</tr>
	<tr>
			<td>case_law_id</td>
		<td>
					${indictment.case_law_id}
				</td>
		</tr>
	<tr>
			<td>law_id</td>
		<td>
					${indictment.law_id}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${indictment.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${indictment.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${indictment.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${indictment.create_by}
				</td>
		</tr>
	<tr>
		</tr>
</table>