








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("case_fine","maxlen=22","Max length for CASE_FINE is 22 ");


	frmvalidator.addValidation("case_fine","num","Please Enter number");

	



	
	frmvalidator.addValidation("case_result","maxlen=2000","Max length for CASE_RESULT is 2000 ");


	frmvalidator.addValidation("case_result","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("case_last","maxlen=1","Max length for CASE_LAST is 1 ");


	frmvalidator.addValidation("case_last","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("case_quality","maxlen=1","Max length for CASE_QUALITY is 1 ");


	frmvalidator.addValidation("case_quality","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_sue","maxlen=22","Max length for STAFF_ID_SUE is 22 ");

	frmvalidator.addValidation("staff_id_sue","req","Please Enter STAFF_ID_SUE");

	frmvalidator.addValidation("staff_id_sue","num","Please Enter number");

	

	frmvalidator.addValidation("case_date","req","Please Enter CASE_DATE");


	
	frmvalidator.addValidation("case_id","maxlen=20","Max length for CASE_ID is 20 ");

	frmvalidator.addValidation("case_id","req","Please Enter CASE_ID");

	frmvalidator.addValidation("case_id","alnum_s","Please Enter alphabatic");

	</script>