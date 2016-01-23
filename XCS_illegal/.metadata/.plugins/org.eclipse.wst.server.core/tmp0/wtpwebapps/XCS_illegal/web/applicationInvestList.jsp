








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationInvest&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>NEWS_VALUE</td>
					<td>CONFIDENCE_GAUGE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>INVEST_DESC</td>
					<td>SUBDISTRICT_CODE</td>
					<td>MAP_DESC</td>
					<td>MAP_PICTURE</td>
					<td>TEL</td>
					<td>ZIPCODE</td>
					<td>DISTRICT_CODE</td>
					<td>PROVINCE_CODE</td>
					<td>ROAD</td>
					<td>SOI</td>
					<td>MOO</td>
					<td>ADDRESS_NO</td>
					<td>ADDRESS_NAME</td>
					<td>COORDINATE_Y</td>
					<td>COORDINATE_X</td>
					<td>END_DATE</td>
					<td>START_DATE</td>
					<td>PRODUCT_GROUP_ID</td>
					<td>LEGISLATION_ID</td>
					<td>OFFCODE_COMMAND</td>
					<td>POSCODE_COMMAND</td>
					<td>STAFF_IDCARDNO_COMMAND</td>
					<td>OFFCODE_INVEST</td>
					<td>POSCODE_INVEST</td>
					<td>STAFF_IDCARDNO_INVEST</td>
					<td>INVEST_NO</td>
					<td>REPORT_DATE</td>
					<td>INVEST_QTY</td>
					<td>TRACK_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationInvests}"  var="applicationInvest">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationInvest.id}</td>
			<td>
					${applicationInvest.news_value}
				</td>
				<td>
					${applicationInvest.confidence_gauge}
				</td>
				<td>
					<fmt:formatDate value="${applicationInvest.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationInvest.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationInvest.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationInvest.create_by}
				</td>
				<td>
					${applicationInvest.invest_desc}
				</td>
				<td>
					${applicationInvest.subdistrict_code}
				</td>
				<td>
					${applicationInvest.map_desc}
				</td>
				<td>
					<img src="<c:url value='/process?action=GetImage'/>&table=APPLICATION_INVEST&id=${applicationInvest.id}" widht=100 height=100>
				</td>
				<td>
					${applicationInvest.tel}
				</td>
				<td>
					${applicationInvest.zipcode}
				</td>
				<td>
					${applicationInvest.district_code}
				</td>
				<td>
					${applicationInvest.province_code}
				</td>
				<td>
					${applicationInvest.road}
				</td>
				<td>
					${applicationInvest.soi}
				</td>
				<td>
					${applicationInvest.moo}
				</td>
				<td>
					${applicationInvest.address_no}
				</td>
				<td>
					${applicationInvest.address_name}
				</td>
				<td>
					${applicationInvest.coordinate_y}
				</td>
				<td>
					${applicationInvest.coordinate_x}
				</td>
				<td>
					<fmt:formatDate value="${applicationInvest.end_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${applicationInvest.start_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationInvest.product_group_id}
				</td>
				<td>
					${applicationInvest.legislation_id}
				</td>
				<td>
					${applicationInvest.offcode_command}
				</td>
				<td>
					${applicationInvest.poscode_command}
				</td>
				<td>
					${applicationInvest.staff_idcardno_command}
				</td>
				<td>
					${applicationInvest.offcode_invest}
				</td>
				<td>
					${applicationInvest.poscode_invest}
				</td>
				<td>
					${applicationInvest.staff_idcardno_invest}
				</td>
				<td>
					${applicationInvest.invest_no}
				</td>
				<td>
					<fmt:formatDate value="${applicationInvest.report_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationInvest.invest_qty}
				</td>
				<td>
					${applicationInvest.track_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationInvest&cmd=view&id='/>${applicationInvest.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationInvest&cmd=edit&id='/>${applicationInvest.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationInvest&cmd=delete&id='/>${applicationInvest.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationInvest&cmd=add'/>">Add New Record</a>
</form>