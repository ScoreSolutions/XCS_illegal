








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationOutsideProve.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>REPLACE_POSITION</strong></td>
		<td>
					<input type="text" name="replace_position" value="${applicationOutsideProve.replace_position}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DEPT_TYPE</strong></td>
		<td>
					<input type="text" name="dept_type" value="${applicationOutsideProve.dept_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationOutsideProve.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationOutsideProve.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationOutsideProve.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationOutsideProve.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVE_DATE</strong></td>
		<td>
					<input id="prove_date" name="prove_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationOutsideProve.prove_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('prove_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVE_RESULT</strong></td>
		<td>
					<input type="text" name="prove_result" value="${applicationOutsideProve.prove_result}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISRETURN</strong></td>
		<td>
					<input type="text" name="isreturn" value="${applicationOutsideProve.isreturn}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVE_OBJECTIVE</strong></td>
		<td>
					<input type="text" name="prove_objective" value="${applicationOutsideProve.prove_objective}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_PROVE</strong></td>
		<td>
					<input type="text" name="offcode_prove" value="${applicationOutsideProve.offcode_prove}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_PROVE</strong></td>
		<td>
					<input type="text" name="poscode_prove" value="${applicationOutsideProve.poscode_prove}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_PROVE</strong></td>
		<td>
					<input type="text" name="staff_id_prove" value="${applicationOutsideProve.staff_id_prove}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVE_NO</strong></td>
		<td>
					<input type="text" name="prove_no" value="${applicationOutsideProve.prove_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${applicationOutsideProve.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_ID</strong></td>
		<td>
					<input type="text" name="legislation_id" value="${applicationOutsideProve.legislation_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DOC_DEPT_NAME</strong></td>
		<td>
					<input type="text" name="doc_dept_name" value="${applicationOutsideProve.doc_dept_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REF_DOC_DATE</strong></td>
		<td>
					<input id="ref_doc_date" name="ref_doc_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationOutsideProve.ref_doc_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('ref_doc_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REF_DOC_NO</strong></td>
		<td>
					<input type="text" name="ref_doc_no" value="${applicationOutsideProve.ref_doc_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>JOB_DATE</strong></td>
		<td>
					<input id="job_date" name="job_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationOutsideProve.job_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('job_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>JOB_NO</strong></td>
		<td>
					<input type="text" name="job_no" value="${applicationOutsideProve.job_no}"/>
				</td>
	</tr>
	</table>