








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${rewardDivideAlcohol.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS_ID</strong></td>
		<td>
					<input type="text" name="duty_status_id" value="${rewardDivideAlcohol.duty_status_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${rewardDivideAlcohol.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${rewardDivideAlcohol.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${rewardDivideAlcohol.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${rewardDivideAlcohol.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS05_MONEY</strong></td>
		<td>
					<input type="text" name="duty_status05_money" value="${rewardDivideAlcohol.duty_status05_money}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS04_MONEY</strong></td>
		<td>
					<input type="text" name="duty_status04_money" value="${rewardDivideAlcohol.duty_status04_money}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS03_MONEY</strong></td>
		<td>
					<input type="text" name="duty_status03_money" value="${rewardDivideAlcohol.duty_status03_money}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS02_MONEY</strong></td>
		<td>
					<input type="text" name="duty_status02_money" value="${rewardDivideAlcohol.duty_status02_money}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS01_MONEY</strong></td>
		<td>
					<input type="text" name="duty_status01_money" value="${rewardDivideAlcohol.duty_status01_money}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_LEVEL</strong></td>
		<td>
					<input type="text" name="staff_level" value="${rewardDivideAlcohol.staff_level}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSITION_NAME</strong></td>
		<td>
					<input type="text" name="position_name" value="${rewardDivideAlcohol.position_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAST_NAME</strong></td>
		<td>
					<input type="text" name="last_name" value="${rewardDivideAlcohol.last_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FIRST_NAME</strong></td>
		<td>
					<input type="text" name="first_name" value="${rewardDivideAlcohol.first_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_CODE</strong></td>
		<td>
					<input type="text" name="title_code" value="${rewardDivideAlcohol.title_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ORDER_SEQ</strong></td>
		<td>
					<input type="text" name="order_seq" value="${rewardDivideAlcohol.order_seq}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REWARD_DIVIDE_ID</strong></td>
		<td>
					<input type="text" name="reward_divide_id" value="${rewardDivideAlcohol.reward_divide_id}"/>
				</td>
	</tr>
	</table>