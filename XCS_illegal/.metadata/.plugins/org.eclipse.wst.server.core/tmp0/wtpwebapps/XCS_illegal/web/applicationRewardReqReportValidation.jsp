








 

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

	
	frmvalidator.addValidation("command","maxlen=200","Max length for COMMAND is 200 ");


	frmvalidator.addValidation("command","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("comment_commander","maxlen=200","Max length for COMMENT_COMMANDER is 200 ");


	frmvalidator.addValidation("comment_commander","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_commander","maxlen=6","Max length for OFFCODE_COMMANDER is 6 ");

	frmvalidator.addValidation("offcode_commander","req","Please Enter OFFCODE_COMMANDER");

	frmvalidator.addValidation("offcode_commander","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_commander","maxlen=20","Max length for POSCODE_COMMANDER is 20 ");

	frmvalidator.addValidation("poscode_commander","req","Please Enter POSCODE_COMMANDER");

	frmvalidator.addValidation("poscode_commander","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_commander","maxlen=13","Max length for STAFF_ID_COMMANDER is 13 ");

	frmvalidator.addValidation("staff_id_commander","req","Please Enter STAFF_ID_COMMANDER");

	frmvalidator.addValidation("staff_id_commander","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("comment_initial","maxlen=200","Max length for COMMENT_INITIAL is 200 ");


	frmvalidator.addValidation("comment_initial","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_initial","maxlen=6","Max length for OFFCODE_INITIAL is 6 ");

	frmvalidator.addValidation("offcode_initial","req","Please Enter OFFCODE_INITIAL");

	frmvalidator.addValidation("offcode_initial","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_initial","maxlen=20","Max length for POSCODE_INITIAL is 20 ");

	frmvalidator.addValidation("poscode_initial","req","Please Enter POSCODE_INITIAL");

	frmvalidator.addValidation("poscode_initial","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_initial","maxlen=13","Max length for STAFF_ID_INITIAL is 13 ");

	frmvalidator.addValidation("staff_id_initial","req","Please Enter STAFF_ID_INITIAL");

	frmvalidator.addValidation("staff_id_initial","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("comment_control","maxlen=200","Max length for COMMENT_CONTROL is 200 ");


	frmvalidator.addValidation("comment_control","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_control","maxlen=6","Max length for OFFCODE_CONTROL is 6 ");

	frmvalidator.addValidation("offcode_control","req","Please Enter OFFCODE_CONTROL");

	frmvalidator.addValidation("offcode_control","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_control","maxlen=20","Max length for POSCODE_CONTROL is 20 ");

	frmvalidator.addValidation("poscode_control","req","Please Enter POSCODE_CONTROL");

	frmvalidator.addValidation("poscode_control","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_control","maxlen=13","Max length for STAFF_ID_CONTROL is 13 ");

	frmvalidator.addValidation("staff_id_control","req","Please Enter STAFF_ID_CONTROL");

	frmvalidator.addValidation("staff_id_control","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("abnormality","maxlen=200","Max length for ABNORMALITY is 200 ");

	frmvalidator.addValidation("abnormality","req","Please Enter ABNORMALITY");

	frmvalidator.addValidation("abnormality","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("ischkcount","maxlen=1","Max length for ISCHKCOUNT is 1 ");

	frmvalidator.addValidation("ischkcount","req","Please Enter ISCHKCOUNT");

	frmvalidator.addValidation("ischkcount","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("isinform","maxlen=1","Max length for ISINFORM is 1 ");

	frmvalidator.addValidation("isinform","req","Please Enter ISINFORM");

	frmvalidator.addValidation("isinform","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("subject","maxlen=200","Max length for SUBJECT is 200 ");

	frmvalidator.addValidation("subject","req","Please Enter SUBJECT");

	frmvalidator.addValidation("subject","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("application_reward_request_id","maxlen=22","Max length for APPLICATION_REWARD_REQUEST_ID is 22 ");

	frmvalidator.addValidation("application_reward_request_id","req","Please Enter APPLICATION_REWARD_REQUEST_ID");

	frmvalidator.addValidation("application_reward_request_id","num","Please Enter number");

	</script>