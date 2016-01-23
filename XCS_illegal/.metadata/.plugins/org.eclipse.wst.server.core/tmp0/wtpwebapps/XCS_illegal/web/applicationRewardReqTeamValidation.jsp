








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("duty_status_id","maxlen=22","Max length for DUTY_STATUS_ID is 22 ");

	frmvalidator.addValidation("duty_status_id","req","Please Enter DUTY_STATUS_ID");

	frmvalidator.addValidation("duty_status_id","num","Please Enter number");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("staff_level","maxlen=20","Max length for STAFF_LEVEL is 20 ");

	frmvalidator.addValidation("staff_level","req","Please Enter STAFF_LEVEL");

	frmvalidator.addValidation("staff_level","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode","maxlen=20","Max length for POSCODE is 20 ");

	frmvalidator.addValidation("poscode","req","Please Enter POSCODE");

	frmvalidator.addValidation("poscode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_idcardno","maxlen=13","Max length for STAFF_IDCARDNO is 13 ");

	frmvalidator.addValidation("staff_idcardno","req","Please Enter STAFF_IDCARDNO");

	frmvalidator.addValidation("staff_idcardno","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("application_reward_request_id","maxlen=22","Max length for APPLICATION_REWARD_REQUEST_ID is 22 ");

	frmvalidator.addValidation("application_reward_request_id","req","Please Enter APPLICATION_REWARD_REQUEST_ID");

	frmvalidator.addValidation("application_reward_request_id","num","Please Enter number");

	</script>