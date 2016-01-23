








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("report_to","maxlen=2000","Max length for REPORT_TO is 2000 ");


	frmvalidator.addValidation("report_to","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("poscode_res_director","maxlen=20","Max length for POSCODE_RES_DIRECTOR is 20 ");

	frmvalidator.addValidation("poscode_res_director","req","Please Enter POSCODE_RES_DIRECTOR");

	frmvalidator.addValidation("poscode_res_director","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_res_director","maxlen=13","Max length for STAFF_ID_RES_DIRECTOR is 13 ");

	frmvalidator.addValidation("staff_id_res_director","req","Please Enter STAFF_ID_RES_DIRECTOR");

	frmvalidator.addValidation("staff_id_res_director","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("res_director_deny_reason","maxlen=200","Max length for RES_DIRECTOR_DENY_REASON is 200 ");


	frmvalidator.addValidation("res_director_deny_reason","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("res_director_accept_reason","maxlen=200","Max length for RES_DIRECTOR_ACCEPT_REASON is 200 ");


	frmvalidator.addValidation("res_director_accept_reason","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("res_director_accept","maxlen=1","Max length for RES_DIRECTOR_ACCEPT is 1 ");

	frmvalidator.addValidation("res_director_accept","req","Please Enter RES_DIRECTOR_ACCEPT");

	frmvalidator.addValidation("res_director_accept","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_section_director","maxlen=20","Max length for POSCODE_SECTION_DIRECTOR is 20 ");

	frmvalidator.addValidation("poscode_section_director","req","Please Enter POSCODE_SECTION_DIRECTOR");

	frmvalidator.addValidation("poscode_section_director","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_section_director","maxlen=13","Max length for STAFF_ID_SECTION_DIRECTOR is 13 ");

	frmvalidator.addValidation("staff_id_section_director","req","Please Enter STAFF_ID_SECTION_DIRECTOR");

	frmvalidator.addValidation("staff_id_section_director","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("section_director_deny_reason","maxlen=200","Max length for SECTION_DIRECTOR_DENY_REASON is 200 ");


	frmvalidator.addValidation("section_director_deny_reason","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("section_director_accept_reason","maxlen=200","Max length for SECTION_DIRECTOR_ACCEPT_REASON is 200 ");


	frmvalidator.addValidation("section_director_accept_reason","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("section_director_accept","maxlen=1","Max length for SECTION_DIRECTOR_ACCEPT is 1 ");

	frmvalidator.addValidation("section_director_accept","req","Please Enter SECTION_DIRECTOR_ACCEPT");

	frmvalidator.addValidation("section_director_accept","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("section_director_lean","maxlen=200","Max length for SECTION_DIRECTOR_LEAN is 200 ");

	frmvalidator.addValidation("section_director_lean","req","Please Enter SECTION_DIRECTOR_LEAN");

	frmvalidator.addValidation("section_director_lean","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_leader","maxlen=20","Max length for POSCODE_LEADER is 20 ");

	frmvalidator.addValidation("poscode_leader","req","Please Enter POSCODE_LEADER");

	frmvalidator.addValidation("poscode_leader","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_leader","maxlen=13","Max length for STAFF_ID_LEADER is 13 ");

	frmvalidator.addValidation("staff_id_leader","req","Please Enter STAFF_ID_LEADER");

	frmvalidator.addValidation("staff_id_leader","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("leader_deny_reason","maxlen=200","Max length for LEADER_DENY_REASON is 200 ");


	frmvalidator.addValidation("leader_deny_reason","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("leader_accept_reason","maxlen=200","Max length for LEADER_ACCEPT_REASON is 200 ");


	frmvalidator.addValidation("leader_accept_reason","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("leader_accept","maxlen=1","Max length for LEADER_ACCEPT is 1 ");

	frmvalidator.addValidation("leader_accept","req","Please Enter LEADER_ACCEPT");

	frmvalidator.addValidation("leader_accept","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("leader_lean","maxlen=200","Max length for LEADER_LEAN is 200 ");

	frmvalidator.addValidation("leader_lean","req","Please Enter LEADER_LEAN");

	frmvalidator.addValidation("leader_lean","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("accept_desc","maxlen=200","Max length for ACCEPT_DESC is 200 ");

	frmvalidator.addValidation("accept_desc","req","Please Enter ACCEPT_DESC");

	frmvalidator.addValidation("accept_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("accept_lean","maxlen=200","Max length for ACCEPT_LEAN is 200 ");

	frmvalidator.addValidation("accept_lean","req","Please Enter ACCEPT_LEAN");

	frmvalidator.addValidation("accept_lean","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_arrest","maxlen=6","Max length for OFFCODE_ARREST is 6 ");

	frmvalidator.addValidation("offcode_arrest","req","Please Enter OFFCODE_ARREST");

	frmvalidator.addValidation("offcode_arrest","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_arrest","maxlen=20","Max length for POSCODE_ARREST is 20 ");

	frmvalidator.addValidation("poscode_arrest","req","Please Enter POSCODE_ARREST");

	frmvalidator.addValidation("poscode_arrest","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_arrest","maxlen=13","Max length for STAFF_ID_ARREST is 13 ");

	frmvalidator.addValidation("staff_id_arrest","req","Please Enter STAFF_ID_ARREST");

	frmvalidator.addValidation("staff_id_arrest","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("accept_date","req","Please Enter ACCEPT_DATE");


	
	frmvalidator.addValidation("application_reward_request_id","maxlen=22","Max length for APPLICATION_REWARD_REQUEST_ID is 22 ");

	frmvalidator.addValidation("application_reward_request_id","req","Please Enter APPLICATION_REWARD_REQUEST_ID");

	frmvalidator.addValidation("application_reward_request_id","num","Please Enter number");

	</script>