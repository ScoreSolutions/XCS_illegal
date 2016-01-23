








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=SuppressTargetItem&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suppressTargetItem.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${suppressTargetItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${suppressTargetItem.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${suppressTargetItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${suppressTargetItem.create_by}
				</td>
		</tr>
	<tr>
			<td>fine_09</td>
		<td>
					${suppressTargetItem.fine_09}
				</td>
		</tr>
	<tr>
			<td>qty_09</td>
		<td>
					${suppressTargetItem.qty_09}
				</td>
		</tr>
	<tr>
			<td>fine_08</td>
		<td>
					${suppressTargetItem.fine_08}
				</td>
		</tr>
	<tr>
			<td>qty_08</td>
		<td>
					${suppressTargetItem.qty_08}
				</td>
		</tr>
	<tr>
			<td>fine_07</td>
		<td>
					${suppressTargetItem.fine_07}
				</td>
		</tr>
	<tr>
			<td>qty_07</td>
		<td>
					${suppressTargetItem.qty_07}
				</td>
		</tr>
	<tr>
			<td>fine_06</td>
		<td>
					${suppressTargetItem.fine_06}
				</td>
		</tr>
	<tr>
			<td>qty_06</td>
		<td>
					${suppressTargetItem.qty_06}
				</td>
		</tr>
	<tr>
			<td>fine_05</td>
		<td>
					${suppressTargetItem.fine_05}
				</td>
		</tr>
	<tr>
			<td>qty_05</td>
		<td>
					${suppressTargetItem.qty_05}
				</td>
		</tr>
	<tr>
			<td>fine_04</td>
		<td>
					${suppressTargetItem.fine_04}
				</td>
		</tr>
	<tr>
			<td>qty_04</td>
		<td>
					${suppressTargetItem.qty_04}
				</td>
		</tr>
	<tr>
			<td>fine_03</td>
		<td>
					${suppressTargetItem.fine_03}
				</td>
		</tr>
	<tr>
			<td>qty_03</td>
		<td>
					${suppressTargetItem.qty_03}
				</td>
		</tr>
	<tr>
			<td>fine_02</td>
		<td>
					${suppressTargetItem.fine_02}
				</td>
		</tr>
	<tr>
			<td>qty_02</td>
		<td>
					${suppressTargetItem.qty_02}
				</td>
		</tr>
	<tr>
			<td>fine_01</td>
		<td>
					${suppressTargetItem.fine_01}
				</td>
		</tr>
	<tr>
			<td>qty_01</td>
		<td>
					${suppressTargetItem.qty_01}
				</td>
		</tr>
	<tr>
			<td>fine_12</td>
		<td>
					${suppressTargetItem.fine_12}
				</td>
		</tr>
	<tr>
			<td>qty_12</td>
		<td>
					${suppressTargetItem.qty_12}
				</td>
		</tr>
	<tr>
			<td>fine_11</td>
		<td>
					${suppressTargetItem.fine_11}
				</td>
		</tr>
	<tr>
			<td>qty_11</td>
		<td>
					${suppressTargetItem.qty_11}
				</td>
		</tr>
	<tr>
			<td>fine_10</td>
		<td>
					${suppressTargetItem.fine_10}
				</td>
		</tr>
	<tr>
			<td>qty_10</td>
		<td>
					${suppressTargetItem.qty_10}
				</td>
		</tr>
	<tr>
			<td>target_type</td>
		<td>
					${suppressTargetItem.target_type}
				</td>
		</tr>
	<tr>
			<td>suppress_target_id</td>
		<td>
					${suppressTargetItem.suppress_target_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>