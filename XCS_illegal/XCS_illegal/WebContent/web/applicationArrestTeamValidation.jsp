








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("staff_offcode","maxlen=6","Max length for STAFF_OFFCODE is 6 ");


	frmvalidator.addValidation("staff_offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_poscode","maxlen=20","Max length for STAFF_POSCODE is 20 ");


	frmvalidator.addValidation("staff_poscode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_idcardno","maxlen=13","Max length for STAFF_IDCARDNO is 13 ");


	frmvalidator.addValidation("staff_idcardno","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_status_id","maxlen=22","Max length for DUTY_STATUS_ID is 22 ");

	frmvalidator.addValidation("duty_status_id","req","Please Enter DUTY_STATUS_ID");

	frmvalidator.addValidation("duty_status_id","num","Please Enter number");

	
	frmvalidator.addValidation("staff_position","maxlen=100","Max length for STAFF_POSITION is 100 ");

	frmvalidator.addValidation("staff_position","req","Please Enter STAFF_POSITION");

	frmvalidator.addValidation("staff_position","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inspector_code","maxlen=20","Max length for INSPECTOR_CODE is 20 ");


	frmvalidator.addValidation("inspector_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_no","maxlen=20","Max length for STAFF_NO is 20 ");


	frmvalidator.addValidation("staff_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	</script>