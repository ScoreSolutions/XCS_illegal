








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Product&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>SUBTYPE_CODE</td>
					<td>LAW_DUTY_CODE</td>
					<td>PRC_PARAM</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>PRODUCTTYPE_ID</td>
					<td>PRODUCT_NAME</td>
					<td>PRODUCT_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${products}"  var="product">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${product.id}</td>
			<td>
					${product.subtype_code}
				</td>
				<td>
					${product.law_duty_code}
				</td>
				<td>
					${product.prc_param}
				</td>
				<td>
					<fmt:formatDate value="${product.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${product.update_by}
				</td>
				<td>
					<fmt:formatDate value="${product.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${product.create_by}
				</td>
				<td>
					${product.producttype_id}
				</td>
				<td>
					${product.product_name}
				</td>
				<td>
					${product.product_code}
				</td>
						<td><a href="<c:url value='/process2?action=Product&cmd=view&id='/>${product.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Product&cmd=edit&id='/>${product.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Product&cmd=delete&id='/>${product.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Product&cmd=add'/>">Add New Record</a>
</form>