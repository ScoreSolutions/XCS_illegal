








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${mappingLevel.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${mappingLevel.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>P_LEVEL</strong></td>
		<td>
					<input type="text" name="p_level" value="${mappingLevel.p_level}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>C_LEVEL</strong></td>
		<td>
					<input type="text" name="c_level" value="${mappingLevel.c_level}"/>
				</td>
	</tr>
	</table>