








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${unit.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>ABBNAME</strong></td>
		<td>
					<input type="text" name="abbname" value="${unit.abbname}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ENNAME</strong></td>
		<td>
					<input type="text" name="enname" value="${unit.enname}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>THNAME</strong></td>
		<td>
					<input type="text" name="thname" value="${unit.thname}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UNIT_CODE</strong></td>
		<td>
					<input type="text" name="unit_code" value="${unit.unit_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${unit.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${unit.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${unit.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${unit.create_by}"/>
				</td>
	</tr>
	</table>