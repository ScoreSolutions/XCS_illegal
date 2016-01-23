








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("offcode_approve","maxlen=6","Max length for OFFCODE_APPROVE is 6 ");

	frmvalidator.addValidation("offcode_approve","req","Please Enter OFFCODE_APPROVE");

	frmvalidator.addValidation("offcode_approve","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_approve","maxlen=20","Max length for POSCODE_APPROVE is 20 ");

	frmvalidator.addValidation("poscode_approve","req","Please Enter POSCODE_APPROVE");

	frmvalidator.addValidation("poscode_approve","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_approve","maxlen=13","Max length for STAFF_ID_APPROVE is 13 ");

	frmvalidator.addValidation("staff_id_approve","req","Please Enter STAFF_ID_APPROVE");

	frmvalidator.addValidation("staff_id_approve","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("approve_lean","maxlen=200","Max length for APPROVE_LEAN is 200 ");

	frmvalidator.addValidation("approve_lean","req","Please Enter APPROVE_LEAN");

	frmvalidator.addValidation("approve_lean","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_ask","maxlen=6","Max length for OFFCODE_ASK is 6 ");

	frmvalidator.addValidation("offcode_ask","req","Please Enter OFFCODE_ASK");

	frmvalidator.addValidation("offcode_ask","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_ask","maxlen=20","Max length for POSCODE_ASK is 20 ");

	frmvalidator.addValidation("poscode_ask","req","Please Enter POSCODE_ASK");

	frmvalidator.addValidation("poscode_ask","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_ask","maxlen=13","Max length for STAFF_ID_ASK is 13 ");

	frmvalidator.addValidation("staff_id_ask","req","Please Enter STAFF_ID_ASK");

	frmvalidator.addValidation("staff_id_ask","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("department_name_send","maxlen=200","Max length for DEPARTMENT_NAME_SEND is 200 ");

	frmvalidator.addValidation("department_name_send","req","Please Enter DEPARTMENT_NAME_SEND");

	frmvalidator.addValidation("department_name_send","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("ask_lean","maxlen=200","Max length for ASK_LEAN is 200 ");

	frmvalidator.addValidation("ask_lean","req","Please Enter ASK_LEAN");

	frmvalidator.addValidation("ask_lean","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_confirm","maxlen=6","Max length for OFFCODE_CONFIRM is 6 ");

	frmvalidator.addValidation("offcode_confirm","req","Please Enter OFFCODE_CONFIRM");

	frmvalidator.addValidation("offcode_confirm","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_confirm","maxlen=20","Max length for POSCODE_CONFIRM is 20 ");

	frmvalidator.addValidation("poscode_confirm","req","Please Enter POSCODE_CONFIRM");

	frmvalidator.addValidation("poscode_confirm","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_confirm","maxlen=13","Max length for STAFF_ID_CONFIRM is 13 ");

	frmvalidator.addValidation("staff_id_confirm","req","Please Enter STAFF_ID_CONFIRM");

	frmvalidator.addValidation("staff_id_confirm","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("application_reward_request_id","maxlen=22","Max length for APPLICATION_REWARD_REQUEST_ID is 22 ");

	frmvalidator.addValidation("application_reward_request_id","req","Please Enter APPLICATION_REWARD_REQUEST_ID");

	frmvalidator.addValidation("application_reward_request_id","num","Please Enter number");

	</script>