








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>INDICTMENT_ID</td>
		<td>${indictment.indictment_id}</td>
	</tr>
	<tr>
		<td width="172"><strong>GUILT_MST_ID</strong></td>
		<td>
					<input type="text" name="guilt_mst_id" value="${indictment.guilt_mst_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${indictment.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EXHIBIT_WILD</strong></td>
		<td>
					<input type="text" name="exhibit_wild" value="${indictment.exhibit_wild}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISIMPRISON</strong></td>
		<td>
					<input type="text" name="isimprison" value="${indictment.isimprison}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_RATE</strong></td>
		<td>
					<input type="text" name="fine_rate" value="${indictment.fine_rate}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISFINE</strong></td>
		<td>
					<input type="text" name="isfine" value="${indictment.isfine}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PENALTY_DESC</strong></td>
		<td>
					<input type="text" name="penalty_desc" value="${indictment.penalty_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PENALTY_CASE_LAW_ID</strong></td>
		<td>
					<input type="text" name="penalty_case_law_id" value="${indictment.penalty_case_law_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>GUILT_BASE</strong></td>
		<td>
					<input type="text" name="guilt_base" value="${indictment.guilt_base}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_LAW_ID</strong></td>
		<td>
					<input type="text" name="case_law_id" value="${indictment.case_law_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAW_ID</strong></td>
		<td>
					<input type="text" name="law_id" value="${indictment.law_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${indictment.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${indictment.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${indictment.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${indictment.create_by}"/>
				</td>
	</tr>
	</table>