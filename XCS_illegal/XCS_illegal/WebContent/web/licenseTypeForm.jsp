








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${licenseType.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>LIC_ORDER</strong></td>
		<td>
					<input type="text" name="lic_order" value="${licenseType.lic_order}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LIC_FROM</strong></td>
		<td>
					<input type="text" name="lic_from" value="${licenseType.lic_from}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISSUE_BY</strong></td>
		<td>
					<input type="text" name="issue_by" value="${licenseType.issue_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PERIOD</strong></td>
		<td>
					<input type="text" name="period" value="${licenseType.period}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LIC_TYPE</strong></td>
		<td>
					<input type="text" name="lic_type" value="${licenseType.lic_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${licenseType.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${licenseType.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${licenseType.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${licenseType.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACTIVE_STATUS</strong></td>
		<td>
					<input type="text" name="active_status" value="${licenseType.active_status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LICENSETYPE_NAME</strong></td>
		<td>
					<input type="text" name="licensetype_name" value="${licenseType.licensetype_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LICENSETYPE_CODE</strong></td>
		<td>
					<input type="text" name="licensetype_code" value="${licenseType.licensetype_code}"/>
				</td>
	</tr>
	</table>