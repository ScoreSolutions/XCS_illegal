








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${staff.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>DEPT_NAME</strong></td>
		<td>
					<input type="text" name="dept_name" value="${staff.dept_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POS_NAME</strong></td>
		<td>
					<input type="text" name="pos_name" value="${staff.pos_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_ADMIN</strong></td>
		<td>
					<input type="text" name="poscode_admin" value="${staff.poscode_admin}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE</strong></td>
		<td>
					<input type="text" name="poscode" value="${staff.poscode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${staff.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${staff.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${staff.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${staff.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PER_ID_REF</strong></td>
		<td>
					<input type="text" name="per_id_ref" value="${staff.per_id_ref}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${staff.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_LEVEL</strong></td>
		<td>
					<input type="text" name="staff_level" value="${staff.staff_level}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BIRTHDATE</strong></td>
		<td>
					<input id="birthdate" name="birthdate" type="text" class="textdate" value="<fmt:formatDate value="${staff.birthdate}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('birthdate','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEX</strong></td>
		<td>
					<input type="text" name="sex" value="${staff.sex}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAST_NAME</strong></td>
		<td>
					<input type="text" name="last_name" value="${staff.last_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FIRST_NAME</strong></td>
		<td>
					<input type="text" name="first_name" value="${staff.first_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_CODE</strong></td>
		<td>
					<input type="text" name="title_code" value="${staff.title_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PER_TYPE</strong></td>
		<td>
					<input type="text" name="per_type" value="${staff.per_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>IDCARD_NO</strong></td>
		<td>
					<input type="text" name="idcard_no" value="${staff.idcard_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EMPID</strong></td>
		<td>
					<input type="text" name="empid" value="${staff.empid}"/>
				</td>
	</tr>
	</table>