<table><tr><td><%=formHandler.getFormMessage()%></td></tr></table>
<table border="1">
	<tr>
		<td>login_name:</td>
		<td><input type="text" name="user_login" value="${user.user_login}"/></td>
	</tr>
	<tr>
		<td>password:</td>
		<td><input type="text" name="user_pass" value="${user.user_pass}"/></td>
	</tr>
	<td><input name="photo" type="file"/></td>
	<td><input id="create_on" name="create_on" type="text" class="textdate" value="" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a></td>
</table>