








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ConfigDivide&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>REMARKS</td>
					<td>SHARE_QTY</td>
					<td>REF_VALUE</td>
					<td>REF_TABLE</td>
					<td>DUTY_STATUS05</td>
					<td>DUTY_STATUS04</td>
					<td>DUTY_STATUS03</td>
					<td>DUTY_STATUS02</td>
					<td>DUTY_STATUS01</td>
					<td>PROPORTION</td>
					<td>BRIBE_REWARD</td>
					<td>LEGISLATION_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${configDivides}"  var="configDivide">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${configDivide.id}</td>
			<td>
					${configDivide.remarks}
				</td>
				<td>
					${configDivide.share_qty}
				</td>
				<td>
					${configDivide.ref_value}
				</td>
				<td>
					${configDivide.ref_table}
				</td>
				<td>
					${configDivide.duty_status05}
				</td>
				<td>
					${configDivide.duty_status04}
				</td>
				<td>
					${configDivide.duty_status03}
				</td>
				<td>
					${configDivide.duty_status02}
				</td>
				<td>
					${configDivide.duty_status01}
				</td>
				<td>
					${configDivide.proportion}
				</td>
				<td>
					${configDivide.bribe_reward}
				</td>
				<td>
					${configDivide.legislation_id}
				</td>
						<td><a href="<c:url value='/process2?action=ConfigDivide&cmd=view&id='/>${configDivide.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ConfigDivide&cmd=edit&id='/>${configDivide.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ConfigDivide&cmd=delete&id='/>${configDivide.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ConfigDivide&cmd=add'/>">Add New Record</a>
</form>