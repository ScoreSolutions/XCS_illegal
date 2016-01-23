








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=SuppressTargetItem&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>FINE_09</td>
					<td>QTY_09</td>
					<td>FINE_08</td>
					<td>QTY_08</td>
					<td>FINE_07</td>
					<td>QTY_07</td>
					<td>FINE_06</td>
					<td>QTY_06</td>
					<td>FINE_05</td>
					<td>QTY_05</td>
					<td>FINE_04</td>
					<td>QTY_04</td>
					<td>FINE_03</td>
					<td>QTY_03</td>
					<td>FINE_02</td>
					<td>QTY_02</td>
					<td>FINE_01</td>
					<td>QTY_01</td>
					<td>FINE_12</td>
					<td>QTY_12</td>
					<td>FINE_11</td>
					<td>QTY_11</td>
					<td>FINE_10</td>
					<td>QTY_10</td>
					<td>TARGET_TYPE</td>
					<td>SUPPRESS_TARGET_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${suppressTargetItems}"  var="suppressTargetItem">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${suppressTargetItem.id}</td>
			<td>
					<fmt:formatDate value="${suppressTargetItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suppressTargetItem.update_by}
				</td>
				<td>
					<fmt:formatDate value="${suppressTargetItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suppressTargetItem.create_by}
				</td>
				<td>
					${suppressTargetItem.fine_09}
				</td>
				<td>
					${suppressTargetItem.qty_09}
				</td>
				<td>
					${suppressTargetItem.fine_08}
				</td>
				<td>
					${suppressTargetItem.qty_08}
				</td>
				<td>
					${suppressTargetItem.fine_07}
				</td>
				<td>
					${suppressTargetItem.qty_07}
				</td>
				<td>
					${suppressTargetItem.fine_06}
				</td>
				<td>
					${suppressTargetItem.qty_06}
				</td>
				<td>
					${suppressTargetItem.fine_05}
				</td>
				<td>
					${suppressTargetItem.qty_05}
				</td>
				<td>
					${suppressTargetItem.fine_04}
				</td>
				<td>
					${suppressTargetItem.qty_04}
				</td>
				<td>
					${suppressTargetItem.fine_03}
				</td>
				<td>
					${suppressTargetItem.qty_03}
				</td>
				<td>
					${suppressTargetItem.fine_02}
				</td>
				<td>
					${suppressTargetItem.qty_02}
				</td>
				<td>
					${suppressTargetItem.fine_01}
				</td>
				<td>
					${suppressTargetItem.qty_01}
				</td>
				<td>
					${suppressTargetItem.fine_12}
				</td>
				<td>
					${suppressTargetItem.qty_12}
				</td>
				<td>
					${suppressTargetItem.fine_11}
				</td>
				<td>
					${suppressTargetItem.qty_11}
				</td>
				<td>
					${suppressTargetItem.fine_10}
				</td>
				<td>
					${suppressTargetItem.qty_10}
				</td>
				<td>
					${suppressTargetItem.target_type}
				</td>
				<td>
					${suppressTargetItem.suppress_target_id}
				</td>
						<td><a href="<c:url value='/process2?action=SuppressTargetItem&cmd=view&id='/>${suppressTargetItem.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=SuppressTargetItem&cmd=edit&id='/>${suppressTargetItem.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=SuppressTargetItem&cmd=delete&id='/>${suppressTargetItem.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=SuppressTargetItem&cmd=add'/>">Add New Record</a>
</form>