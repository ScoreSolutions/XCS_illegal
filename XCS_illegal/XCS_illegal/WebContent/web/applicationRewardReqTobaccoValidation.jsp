








 

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

	
	frmvalidator.addValidation("arrest_opinion","maxlen=200","Max length for ARREST_OPINION is 200 ");


	frmvalidator.addValidation("arrest_opinion","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("command","maxlen=200","Max length for COMMAND is 200 ");


	frmvalidator.addValidation("command","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("law_director_opinion","maxlen=200","Max length for LAW_DIRECTOR_OPINION is 200 ");


	frmvalidator.addValidation("law_director_opinion","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("law_director_position","maxlen=200","Max length for LAW_DIRECTOR_POSITION is 200 ");

	frmvalidator.addValidation("law_director_position","req","Please Enter LAW_DIRECTOR_POSITION");

	frmvalidator.addValidation("law_director_position","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawyer_opinion","maxlen=200","Max length for LAWYER_OPINION is 200 ");


	frmvalidator.addValidation("lawyer_opinion","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_arrest","maxlen=6","Max length for OFFCODE_ARREST is 6 ");

	frmvalidator.addValidation("offcode_arrest","req","Please Enter OFFCODE_ARREST");

	frmvalidator.addValidation("offcode_arrest","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_arrest","maxlen=20","Max length for POSCODE_ARREST is 20 ");

	frmvalidator.addValidation("poscode_arrest","req","Please Enter POSCODE_ARREST");

	frmvalidator.addValidation("poscode_arrest","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_arrest","maxlen=13","Max length for STAFF_ID_ARREST is 13 ");

	frmvalidator.addValidation("staff_id_arrest","req","Please Enter STAFF_ID_ARREST");

	frmvalidator.addValidation("staff_id_arrest","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("application_reward_request_id","maxlen=22","Max length for APPLICATION_REWARD_REQUEST_ID is 22 ");

	frmvalidator.addValidation("application_reward_request_id","req","Please Enter APPLICATION_REWARD_REQUEST_ID");

	frmvalidator.addValidation("application_reward_request_id","num","Please Enter number");

	</script>