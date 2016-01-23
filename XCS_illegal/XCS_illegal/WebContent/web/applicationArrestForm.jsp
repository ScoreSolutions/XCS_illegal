








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationArrest.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrest.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationArrest.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrest.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationArrest.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ARREST_REPORT_DATE</strong></td>
		<td>
					<input id="arrest_report_date" name="arrest_report_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrest.arrest_report_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('arrest_report_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISSENTCOURT</strong></td>
		<td>
					<input type="text" name="issentcourt" value="${applicationArrest.issentcourt}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCUSER_POSCODE</strong></td>
		<td>
					<input type="text" name="accuser_poscode" value="${applicationArrest.accuser_poscode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCUSER_OFFCODE</strong></td>
		<td>
					<input type="text" name="accuser_offcode" value="${applicationArrest.accuser_offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCUSER_IDCARDNO</strong></td>
		<td>
					<input type="text" name="accuser_idcardno" value="${applicationArrest.accuser_idcardno}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_SINCERE_CONFIRM_ID</strong></td>
		<td>
					<input type="text" name="application_sincere_confirm_id" value="${applicationArrest.application_sincere_confirm_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_SEARCH_WARRANT_ID</strong></td>
		<td>
					<input type="text" name="application_search_warrant_id" value="${applicationArrest.application_search_warrant_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_NOTICE_ARREST_ID</strong></td>
		<td>
					<input type="text" name="application_notice_arrest_id" value="${applicationArrest.application_notice_arrest_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POLICE_STATION</strong></td>
		<td>
					<input type="text" name="police_station" value="${applicationArrest.police_station}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCUSER_TYPE</strong></td>
		<td>
					<input type="text" name="accuser_type" value="${applicationArrest.accuser_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCT_GROUP_ID</strong></td>
		<td>
					<input type="text" name="product_group_id" value="${applicationArrest.product_group_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_Y</strong></td>
		<td>
					<input type="text" name="coordinate_y" value="${applicationArrest.coordinate_y}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_X</strong></td>
		<td>
					<input type="text" name="coordinate_x" value="${applicationArrest.coordinate_x}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ESTIMATE_FINE_DATE</strong></td>
		<td>
					<input id="estimate_fine_date" name="estimate_fine_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrest.estimate_fine_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('estimate_fine_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ESTIMATE_FINE</strong></td>
		<td>
					<input type="text" name="estimate_fine" value="${applicationArrest.estimate_fine}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DEL_FLAG</strong></td>
		<td>
					<input type="text" name="del_flag" value="${applicationArrest.del_flag}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADMINISTRATION</strong></td>
		<td>
					<input type="text" name="administration" value="${applicationArrest.administration}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAK_TYPE</strong></td>
		<td>
					<input type="text" name="lawbreak_type" value="${applicationArrest.lawbreak_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DEPARTMENT_NAME</strong></td>
		<td>
					<input type="text" name="department_name" value="${applicationArrest.department_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINISHED_TIME</strong></td>
		<td>
					<input id="finished_time" name="finished_time" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrest.finished_time}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('finished_time','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TESTIMONY</strong></td>
		<td>
					<input type="text" name="testimony" value="${applicationArrest.testimony}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BEHAVIOUR</strong></td>
		<td>
					<input type="text" name="behaviour" value="${applicationArrest.behaviour}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DIRECTOR_POSITION</strong></td>
		<td>
					<input type="text" name="director_position" value="${applicationArrest.director_position}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEADER_POSITION</strong></td>
		<td>
					<input type="text" name="leader_position" value="${applicationArrest.leader_position}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ORDER_BY</strong></td>
		<td>
					<input type="text" name="order_by" value="${applicationArrest.order_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REPORT_TO</strong></td>
		<td>
					<input type="text" name="report_to" value="${applicationArrest.report_to}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY</strong></td>
		<td>
					<input type="text" name="duty" value="${applicationArrest.duty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SURETY_NAME</strong></td>
		<td>
					<input type="text" name="surety_name" value="${applicationArrest.surety_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BUSINESS_NAME</strong></td>
		<td>
					<input type="text" name="business_name" value="${applicationArrest.business_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OWNER_NAME</strong></td>
		<td>
					<input type="text" name="owner_name" value="${applicationArrest.owner_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>GUILTY</strong></td>
		<td>
					<input type="text" name="guilty" value="${applicationArrest.guilty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OCCURRENCE_DATE</strong></td>
		<td>
					<input id="occurrence_date" name="occurrence_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrest.occurrence_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('occurrence_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ALLEGED_CO</strong></td>
		<td>
					<input type="text" name="alleged_co" value="${applicationArrest.alleged_co}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SCENE_PROVINCE</strong></td>
		<td>
					<input type="text" name="scene_province" value="${applicationArrest.scene_province}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SCENE_DISTRICT</strong></td>
		<td>
					<input type="text" name="scene_district" value="${applicationArrest.scene_district}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SCENE_SUBDISTRICT</strong></td>
		<td>
					<input type="text" name="scene_subdistrict" value="${applicationArrest.scene_subdistrict}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SCENE_ROAD</strong></td>
		<td>
					<input type="text" name="scene_road" value="${applicationArrest.scene_road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SCENE_SOI</strong></td>
		<td>
					<input type="text" name="scene_soi" value="${applicationArrest.scene_soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SCENE_MOO</strong></td>
		<td>
					<input type="text" name="scene_moo" value="${applicationArrest.scene_moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SCENE_NO</strong></td>
		<td>
					<input type="text" name="scene_no" value="${applicationArrest.scene_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SCENE_NAME</strong></td>
		<td>
					<input type="text" name="scene_name" value="${applicationArrest.scene_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HAVE_CULPRIT</strong></td>
		<td>
					<input type="text" name="have_culprit" value="${applicationArrest.have_culprit}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_ID</strong></td>
		<td>
					<input type="text" name="legislation_id" value="${applicationArrest.legislation_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${applicationArrest.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DEPARTMENT_ID</strong></td>
		<td>
					<input type="text" name="department_id" value="${applicationArrest.department_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_DATE</strong></td>
		<td>
					<input id="application_date" name="application_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrest.application_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('application_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${applicationArrest.track_no}"/>
				</td>
	</tr>
	</table>