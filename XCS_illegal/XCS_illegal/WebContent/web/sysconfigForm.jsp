








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${sysconfig.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>DESCRIPTION</strong></td>
		<td>
					<input type="text" name="description" value="${sysconfig.description}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DATATYPE</strong></td>
		<td>
					<input type="text" name="datatype" value="${sysconfig.datatype}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CONFIG_VALUE</strong></td>
		<td>
					<input type="text" name="config_value" value="${sysconfig.config_value}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CONFIG_NAME</strong></td>
		<td>
					<input type="text" name="config_name" value="${sysconfig.config_name}"/>
				</td>
	</tr>
	</table>