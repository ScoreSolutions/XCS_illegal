








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>TITLE_CODE</td>
		<td>${title.title_code}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPD_DATE</strong></td>
		<td>
					<input id="upd_date" name="upd_date" type="text" class="textdate" value="<fmt:formatDate value="${title.upd_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('upd_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPD_USERID</strong></td>
		<td>
					<input type="text" name="upd_userid" value="${title.upd_userid}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>END_DATE</strong></td>
		<td>
					<input id="end_date" name="end_date" type="text" class="textdate" value="<fmt:formatDate value="${title.end_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('end_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BEGIN_DATE</strong></td>
		<td>
					<input id="begin_date" name="begin_date" type="text" class="textdate" value="<fmt:formatDate value="${title.begin_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('begin_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_SEO</strong></td>
		<td>
					<input type="text" name="title_seo" value="${title.title_seo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SHORT_SUFFIX</strong></td>
		<td>
					<input type="text" name="short_suffix" value="${title.short_suffix}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUFFIX_NAME</strong></td>
		<td>
					<input type="text" name="suffix_name" value="${title.suffix_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SHORT_TITLE</strong></td>
		<td>
					<input type="text" name="short_title" value="${title.short_title}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_NAME</strong></td>
		<td>
					<input type="text" name="title_name" value="${title.title_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_TYPE</strong></td>
		<td>
					<input type="text" name="title_type" value="${title.title_type}"/>
				</td>
	</tr>
	</table>