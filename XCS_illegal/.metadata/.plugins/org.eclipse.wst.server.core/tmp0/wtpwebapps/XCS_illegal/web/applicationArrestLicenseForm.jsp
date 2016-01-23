








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationArrestLicense.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>ISWITHDRAW</strong></td>
		<td>
					<input type="text" name="iswithdraw" value="${applicationArrestLicense.iswithdraw}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestLicense.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationArrestLicense.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestLicense.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationArrestLicense.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LICENSE_NO</strong></td>
		<td>
					<input type="text" name="license_no" value="${applicationArrestLicense.license_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BOOK_NO</strong></td>
		<td>
					<input type="text" name="book_no" value="${applicationArrestLicense.book_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LICENSE_TYPE</strong></td>
		<td>
					<input type="text" name="license_type" value="${applicationArrestLicense.license_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ESTABLISHMENT_NAME</strong></td>
		<td>
					<input type="text" name="establishment_name" value="${applicationArrestLicense.establishment_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ENTREPRENEUR</strong></td>
		<td>
					<input type="text" name="entrepreneur" value="${applicationArrestLicense.entrepreneur}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${applicationArrestLicense.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${applicationArrestLicense.track_no}"/>
				</td>
	</tr>
	</table>