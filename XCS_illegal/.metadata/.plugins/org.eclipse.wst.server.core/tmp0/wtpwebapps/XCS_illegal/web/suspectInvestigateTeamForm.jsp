








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectInvestigateTeam.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${suspectInvestigateTeam.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${suspectInvestigateTeam.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${suspectInvestigateTeam.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${suspectInvestigateTeam.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${suspectInvestigateTeam.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE</strong></td>
		<td>
					<input type="text" name="poscode" value="${suspectInvestigateTeam.poscode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUSPECT_INVESTIGATE_ID</strong></td>
		<td>
					<input type="text" name="suspect_investigate_id" value="${suspectInvestigateTeam.suspect_investigate_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>IDCARD_NO</strong></td>
		<td>
					<input type="text" name="idcard_no" value="${suspectInvestigateTeam.idcard_no}"/>
				</td>
	</tr>
	</table>