








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${rewardDivideTax.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${rewardDivideTax.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${rewardDivideTax.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${rewardDivideTax.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${rewardDivideTax.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MONEY2</strong></td>
		<td>
					<input type="text" name="money2" value="${rewardDivideTax.money2}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MONEY1</strong></td>
		<td>
					<input type="text" name="money1" value="${rewardDivideTax.money1}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SHARE2</strong></td>
		<td>
					<input type="text" name="share2" value="${rewardDivideTax.share2}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SHARE1</strong></td>
		<td>
					<input type="text" name="share1" value="${rewardDivideTax.share1}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS_ID</strong></td>
		<td>
					<input type="text" name="duty_status_id" value="${rewardDivideTax.duty_status_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_LEVEL</strong></td>
		<td>
					<input type="text" name="staff_level" value="${rewardDivideTax.staff_level}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSITION_NAME</strong></td>
		<td>
					<input type="text" name="position_name" value="${rewardDivideTax.position_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE</strong></td>
		<td>
					<input type="text" name="poscode" value="${rewardDivideTax.poscode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAST_NAME</strong></td>
		<td>
					<input type="text" name="last_name" value="${rewardDivideTax.last_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FIRST_NAME</strong></td>
		<td>
					<input type="text" name="first_name" value="${rewardDivideTax.first_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_CODE</strong></td>
		<td>
					<input type="text" name="title_code" value="${rewardDivideTax.title_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ORDER_SEQ</strong></td>
		<td>
					<input type="text" name="order_seq" value="${rewardDivideTax.order_seq}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REWARD_DIVIDE_ID</strong></td>
		<td>
					<input type="text" name="reward_divide_id" value="${rewardDivideTax.reward_divide_id}"/>
				</td>
	</tr>
	</table>