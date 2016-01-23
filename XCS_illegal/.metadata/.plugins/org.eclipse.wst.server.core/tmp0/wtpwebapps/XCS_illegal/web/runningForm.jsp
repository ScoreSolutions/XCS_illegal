








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${running.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>RUNNINGFIELD</strong></td>
		<td>
					<input type="text" name="runningfield" value="${running.runningfield}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LENGTH</strong></td>
		<td>
					<input type="text" name="length" value="${running.length}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>YEAR</strong></td>
		<td>
					<input type="text" name="year" value="${running.year}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MONTH</strong></td>
		<td>
					<input type="text" name="month" value="${running.month}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISOFFCODE</strong></td>
		<td>
					<input type="text" name="isoffcode" value="${running.isoffcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CODE</strong></td>
		<td>
					<input type="text" name="code" value="${running.code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FIELDVALUE</strong></td>
		<td>
					<input type="text" name="fieldvalue" value="${running.fieldvalue}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FIELDTYPE</strong></td>
		<td>
					<input type="text" name="fieldtype" value="${running.fieldtype}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TBNAME</strong></td>
		<td>
					<input type="text" name="tbname" value="${running.tbname}"/>
				</td>
	</tr>
	</table>