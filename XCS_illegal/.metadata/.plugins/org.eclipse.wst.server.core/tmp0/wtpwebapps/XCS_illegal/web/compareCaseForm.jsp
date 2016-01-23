








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${compareCase.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>INV_TYPE</strong></td>
		<td>
					<input type="text" name="inv_type" value="${compareCase.inv_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUE_OFFCODE</strong></td>
		<td>
					<input type="text" name="sue_offcode" value="${compareCase.sue_offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUE_POSCODE</strong></td>
		<td>
					<input type="text" name="sue_poscode" value="${compareCase.sue_poscode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUE_STAFF_IDCARDNO</strong></td>
		<td>
					<input type="text" name="sue_staff_idcardno" value="${compareCase.sue_staff_idcardno}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_FINE</strong></td>
		<td>
					<input type="text" name="case_fine" value="${compareCase.case_fine}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_STATUS</strong></td>
		<td>
					<input type="text" name="case_status" value="${compareCase.case_status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MANAGE_TYPE</strong></td>
		<td>
					<input type="text" name="manage_type" value="${compareCase.manage_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_AUTHORITY_ID</strong></td>
		<td>
					<input type="text" name="compare_authority_id" value="${compareCase.compare_authority_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${compareCase.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${compareCase.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${compareCase.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${compareCase.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REWARD_MONEY</strong></td>
		<td>
					<input type="text" name="reward_money" value="${compareCase.reward_money}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BIRBE_MONEY</strong></td>
		<td>
					<input type="text" name="birbe_money" value="${compareCase.birbe_money}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TREASURY_MONEY</strong></td>
		<td>
					<input type="text" name="treasury_money" value="${compareCase.treasury_money}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REWARD_MONEY_P</strong></td>
		<td>
					<input type="text" name="reward_money_p" value="${compareCase.reward_money_p}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRIBE_MONEY_P</strong></td>
		<td>
					<input type="text" name="bribe_money_p" value="${compareCase.bribe_money_p}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TREASURY_MONEY_P</strong></td>
		<td>
					<input type="text" name="treasury_money_p" value="${compareCase.treasury_money_p}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PAY_DATE</strong></td>
		<td>
					<input id="pay_date" name="pay_date" type="text" class="textdate" value="<fmt:formatDate value="${compareCase.pay_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('pay_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COURT_FINE_DATE</strong></td>
		<td>
					<input id="court_fine_date" name="court_fine_date" type="text" class="textdate" value="<fmt:formatDate value="${compareCase.court_fine_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('court_fine_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COURT_FINE</strong></td>
		<td>
					<input type="text" name="court_fine" value="${compareCase.court_fine}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_ID</strong></td>
		<td>
					<input type="text" name="case_id" value="${compareCase.case_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCUSER_TESTIMONY</strong></td>
		<td>
					<input type="text" name="accuser_testimony" value="${compareCase.accuser_testimony}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INDICTMENT_ID</strong></td>
		<td>
					<input type="text" name="indictment_id" value="${compareCase.indictment_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCUSER_PROVINCE</strong></td>
		<td>
					<input type="text" name="accuser_province" value="${compareCase.accuser_province}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCUSER_DISTRICT</strong></td>
		<td>
					<input type="text" name="accuser_district" value="${compareCase.accuser_district}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCUSER_SUBDISTRICT</strong></td>
		<td>
					<input type="text" name="accuser_subdistrict" value="${compareCase.accuser_subdistrict}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_PROVINCE</strong></td>
		<td>
					<input type="text" name="compare_province" value="${compareCase.compare_province}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_DISTRICT</strong></td>
		<td>
					<input type="text" name="compare_district" value="${compareCase.compare_district}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_SUBDISTRICT</strong></td>
		<td>
					<input type="text" name="compare_subdistrict" value="${compareCase.compare_subdistrict}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_OFFICE</strong></td>
		<td>
					<input type="text" name="compare_office" value="${compareCase.compare_office}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${compareCase.track_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_CASE_DATE</strong></td>
		<td>
					<input id="compare_case_date" name="compare_case_date" type="text" class="textdate" value="<fmt:formatDate value="${compareCase.compare_case_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('compare_case_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_CASE_NO</strong></td>
		<td>
					<input type="text" name="compare_case_no" value="${compareCase.compare_case_no}"/>
				</td>
	</tr>
	</table>