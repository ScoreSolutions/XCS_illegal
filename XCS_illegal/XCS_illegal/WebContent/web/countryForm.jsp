








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${country.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPD_DATE</strong></td>
		<td>
					<input id="upd_date" name="upd_date" type="text" class="textdate" value="<fmt:formatDate value="${country.upd_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('upd_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPD_USERID</strong></td>
		<td>
					<input type="text" name="upd_userid" value="${country.upd_userid}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>END_DATE</strong></td>
		<td>
					<input id="end_date" name="end_date" type="text" class="textdate" value="<fmt:formatDate value="${country.end_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('end_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BEGIN_DATE</strong></td>
		<td>
					<input id="begin_date" name="begin_date" type="text" class="textdate" value="<fmt:formatDate value="${country.begin_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('begin_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COUNTRY_SEQ</strong></td>
		<td>
					<input type="text" name="country_seq" value="${country.country_seq}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RACE_NAME</strong></td>
		<td>
					<input type="text" name="race_name" value="${country.race_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INDC_AFTA</strong></td>
		<td>
					<input type="text" name="indc_afta" value="${country.indc_afta}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CONTINENT</strong></td>
		<td>
					<input type="text" name="continent" value="${country.continent}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SHORT_NAME</strong></td>
		<td>
					<input type="text" name="short_name" value="${country.short_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COUNTRY_NAME</strong></td>
		<td>
					<input type="text" name="country_name" value="${country.country_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COUNTRY_CODE</strong></td>
		<td>
					<input type="text" name="country_code" value="${country.country_code}"/>
				</td>
	</tr>
	</table>