








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${dutyGroup.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPD_DATE</strong></td>
		<td>
					<input id="upd_date" name="upd_date" type="text" class="textdate" value="<fmt:formatDate value="${dutyGroup.upd_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('upd_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPD_USERID</strong></td>
		<td>
					<input type="text" name="upd_userid" value="${dutyGroup.upd_userid}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>END_DATE</strong></td>
		<td>
					<input id="end_date" name="end_date" type="text" class="textdate" value="<fmt:formatDate value="${dutyGroup.end_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('end_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BEGIN_DATE</strong></td>
		<td>
					<input id="begin_date" name="begin_date" type="text" class="textdate" value="<fmt:formatDate value="${dutyGroup.begin_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('begin_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUB_GROUP_ID</strong></td>
		<td>
					<input type="text" name="sub_group_id" value="${dutyGroup.sub_group_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>GROUP_STATUS</strong></td>
		<td>
					<input type="text" name="group_status" value="${dutyGroup.group_status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>GROUP_NAME</strong></td>
		<td>
					<input type="text" name="group_name" value="${dutyGroup.group_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>GROUP_ID</strong></td>
		<td>
					<input type="text" name="group_id" value="${dutyGroup.group_id}"/>
				</td>
	</tr>
	</table>