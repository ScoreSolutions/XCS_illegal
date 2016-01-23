








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${seize.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>DEL_IDCARDNO</strong></td>
		<td>
					<input type="text" name="del_idcardno" value="${seize.del_idcardno}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DEL_DATE</strong></td>
		<td>
					<input id="del_date" name="del_date" type="text" class="textdate" value="<fmt:formatDate value="${seize.del_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('del_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DEL_FLAG</strong></td>
		<td>
					<input type="text" name="del_flag" value="${seize.del_flag}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${seize.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${seize.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${seize.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${seize.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${seize.track_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEIZE_LOCATION</strong></td>
		<td>
					<input type="text" name="seize_location" value="${seize.seize_location}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LIMIT_DATE</strong></td>
		<td>
					<input id="limit_date" name="limit_date" type="text" class="textdate" value="<fmt:formatDate value="${seize.limit_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('limit_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CANCEL_DATE</strong></td>
		<td>
					<input id="cancel_date" name="cancel_date" type="text" class="textdate" value="<fmt:formatDate value="${seize.cancel_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('cancel_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEIZE_DATE</strong></td>
		<td>
					<input id="seize_date" name="seize_date" type="text" class="textdate" value="<fmt:formatDate value="${seize.seize_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('seize_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ORDER_NO</strong></td>
		<td>
					<input type="text" name="order_no" value="${seize.order_no}"/>
				</td>
	</tr>
	</table>