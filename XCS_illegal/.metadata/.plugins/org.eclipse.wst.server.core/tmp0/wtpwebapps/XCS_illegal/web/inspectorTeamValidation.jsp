








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("offcode_div","maxlen=6","Max length for OFFCODE_DIV is 6 ");


	frmvalidator.addValidation("offcode_div","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_dept","maxlen=6","Max length for OFFCODE_DEPT is 6 ");


	frmvalidator.addValidation("offcode_dept","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_leader","maxlen=6","Max length for OFFCODE_LEADER is 6 ");


	frmvalidator.addValidation("offcode_leader","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_leader","maxlen=20","Max length for POSCODE_LEADER is 20 ");


	frmvalidator.addValidation("poscode_leader","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_idcardno_leader","maxlen=13","Max length for STAFF_IDCARDNO_LEADER is 13 ");


	frmvalidator.addValidation("staff_idcardno_leader","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("inspector_name","maxlen=100","Max length for INSPECTOR_NAME is 100 ");

	frmvalidator.addValidation("inspector_name","req","Please Enter INSPECTOR_NAME");

	frmvalidator.addValidation("inspector_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inspector_code","maxlen=20","Max length for INSPECTOR_CODE is 20 ");

	frmvalidator.addValidation("inspector_code","req","Please Enter INSPECTOR_CODE");

	frmvalidator.addValidation("inspector_code","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("appoint_date","req","Please Enter APPOINT_DATE");


	
	frmvalidator.addValidation("appoint_no","maxlen=20","Max length for APPOINT_NO is 20 ");

	frmvalidator.addValidation("appoint_no","req","Please Enter APPOINT_NO");

	frmvalidator.addValidation("appoint_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("job_no","maxlen=20","Max length for JOB_NO is 20 ");

	frmvalidator.addValidation("job_no","req","Please Enter JOB_NO");

	frmvalidator.addValidation("job_no","alnum_s","Please Enter alphabatic");

	</script>