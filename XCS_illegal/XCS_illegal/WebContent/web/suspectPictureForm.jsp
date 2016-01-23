








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectPicture.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${suspectPicture.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${suspectPicture.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${suspectPicture.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${suspectPicture.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DESCRIPTION</strong></td>
		<td>
					<input type="text" name="description" value="${suspectPicture.description}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MIME_TYPE</strong></td>
		<td>
					<input type="text" name="mime_type" value="${suspectPicture.mime_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PICTURE</strong></td>
		<td>
					<input type="file" name="picture" value=""/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PICTURE_CATEGORY_ID</strong></td>
		<td>
					<input type="text" name="picture_category_id" value="${suspectPicture.picture_category_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUSPECT_NO</strong></td>
		<td>
					<input type="text" name="suspect_no" value="${suspectPicture.suspect_no}"/>
				</td>
	</tr>
	</table>