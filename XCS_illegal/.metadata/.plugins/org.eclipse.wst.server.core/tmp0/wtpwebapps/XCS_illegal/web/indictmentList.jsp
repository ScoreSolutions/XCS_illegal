








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">
	function confirmBox(str_text)
	{
  		var r = confirm(str_text);
  		return r;
	}
</script>
<table border="1">
	<tr><td><%=pageUtil.getPagination()%></td><td><%=pageUtil.getPageStatus()%></td></tr>
</table>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Indictment&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>INDICTMENT_ID</td>
				<td>GUILT_MST_ID</td>
					<td>REMARKS</td>
					<td>EXHIBIT_WILD</td>
					<td>ISIMPRISON</td>
					<td>FINE_RATE</td>
					<td>ISFINE</td>
					<td>PENALTY_DESC</td>
					<td>PENALTY_CASE_LAW_ID</td>
					<td>GUILT_BASE</td>
					<td>CASE_LAW_ID</td>
					<td>LAW_ID</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${indictments}"  var="indictment">
			<tr>
				<td><input type="checkbox" name="indictment_id" value="${user.id}"/></td>
				<td>${indictment.indictment_id}</td>
			<td>
					${indictment.guilt_mst_id}
				</td>
				<td>
					${indictment.remarks}
				</td>
				<td>
					${indictment.exhibit_wild}
				</td>
				<td>
					${indictment.isimprison}
				</td>
				<td>
					${indictment.fine_rate}
				</td>
				<td>
					${indictment.isfine}
				</td>
				<td>
					${indictment.penalty_desc}
				</td>
				<td>
					${indictment.penalty_case_law_id}
				</td>
				<td>
					${indictment.guilt_base}
				</td>
				<td>
					${indictment.case_law_id}
				</td>
				<td>
					${indictment.law_id}
				</td>
				<td>
					<fmt:formatDate value="${indictment.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${indictment.update_by}
				</td>
				<td>
					<fmt:formatDate value="${indictment.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${indictment.create_by}
				</td>
						<td><a href="<c:url value='/process2?action=Indictment&cmd=view&indictment_id='/>${indictment.indictment_id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Indictment&cmd=edit&indictment_id='/>${indictment.indictment_id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Indictment&cmd=delete&indictment_id='/>${indictment.indictment_id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Indictment&cmd=add'/>">Add New Record</a>
</form>