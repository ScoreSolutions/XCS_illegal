








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationArrestProve&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>TAX_VALUE</td>
					<td>STAFF_PROVE_OFFCODE</td>
					<td>STAFF_PROVE_POSCODE</td>
					<td>STATUS</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>ORDER_DESC</td>
					<td>REPORT_DESC</td>
					<td>REPLACE_POSITION</td>
					<td>TAKEN_DATE</td>
					<td>STAFF_IDCARDNO_PROVE</td>
					<td>CASE_ID</td>
					<td>EXHIBIT_REPORT_NO</td>
					<td>TRACK_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationArrestProves}"  var="applicationArrestProve">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationArrestProve.id}</td>
			<td>
					${applicationArrestProve.tax_value}
				</td>
				<td>
					${applicationArrestProve.staff_prove_offcode}
				</td>
				<td>
					${applicationArrestProve.staff_prove_poscode}
				</td>
				<td>
					${applicationArrestProve.status}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestProve.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestProve.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestProve.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestProve.create_by}
				</td>
				<td>
					${applicationArrestProve.order_desc}
				</td>
				<td>
					${applicationArrestProve.report_desc}
				</td>
				<td>
					${applicationArrestProve.replace_position}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestProve.taken_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestProve.staff_idcardno_prove}
				</td>
				<td>
					${applicationArrestProve.case_id}
				</td>
				<td>
					${applicationArrestProve.exhibit_report_no}
				</td>
				<td>
					${applicationArrestProve.track_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationArrestProve&cmd=view&id='/>${applicationArrestProve.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrestProve&cmd=edit&id='/>${applicationArrestProve.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrestProve&cmd=delete&id='/>${applicationArrestProve.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationArrestProve&cmd=add'/>">Add New Record</a>
</form>