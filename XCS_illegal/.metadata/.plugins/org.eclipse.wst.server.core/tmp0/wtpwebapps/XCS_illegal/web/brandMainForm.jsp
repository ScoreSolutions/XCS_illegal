








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${brandMain.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPD_DATE</strong></td>
		<td>
					<input id="upd_date" name="upd_date" type="text" class="textdate" value="<fmt:formatDate value="${brandMain.upd_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('upd_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPD_USERID</strong></td>
		<td>
					<input type="text" name="upd_userid" value="${brandMain.upd_userid}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>END_DATE</strong></td>
		<td>
					<input id="end_date" name="end_date" type="text" class="textdate" value="<fmt:formatDate value="${brandMain.end_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('end_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BEGIN_DATE</strong></td>
		<td>
					<input id="begin_date" name="begin_date" type="text" class="textdate" value="<fmt:formatDate value="${brandMain.begin_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('begin_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_MAIN_ENG</strong></td>
		<td>
					<input type="text" name="brand_main_eng" value="${brandMain.brand_main_eng}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_MAIN_THAI</strong></td>
		<td>
					<input type="text" name="brand_main_thai" value="${brandMain.brand_main_thai}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_MAIN_CODE</strong></td>
		<td>
					<input type="text" name="brand_main_code" value="${brandMain.brand_main_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_CODE</strong></td>
		<td>
					<input type="text" name="duty_code" value="${brandMain.duty_code}"/>
				</td>
	</tr>
	</table>