








 

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


	frmvalidator.addValidation("offcode_approve","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_approve","maxlen=20","Max length for POSCODE_APPROVE is 20 ");


	frmvalidator.addValidation("poscode_approve","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_approve","maxlen=13","Max length for STAFF_ID_APPROVE is 13 ");


	frmvalidator.addValidation("staff_id_approve","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("noneapprove_desc","maxlen=200","Max length for NONEAPPROVE_DESC is 200 ");


	frmvalidator.addValidation("noneapprove_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("approve_desc","maxlen=200","Max length for APPROVE_DESC is 200 ");


	frmvalidator.addValidation("approve_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("isapprove","maxlen=1","Max length for ISAPPROVE is 1 ");


	frmvalidator.addValidation("isapprove","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_accept","maxlen=6","Max length for OFFCODE_ACCEPT is 6 ");


	frmvalidator.addValidation("offcode_accept","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_accept","maxlen=20","Max length for POSCODE_ACCEPT is 20 ");


	frmvalidator.addValidation("poscode_accept","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_accept","maxlen=13","Max length for STAFF_ID_ACCEPT is 13 ");


	frmvalidator.addValidation("staff_id_accept","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("noneaccept_desc","maxlen=200","Max length for NONEACCEPT_DESC is 200 ");


	frmvalidator.addValidation("noneaccept_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("accept_desc","maxlen=200","Max length for ACCEPT_DESC is 200 ");


	frmvalidator.addValidation("accept_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("isaccept","maxlen=1","Max length for ISACCEPT is 1 ");


	frmvalidator.addValidation("isaccept","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_inform","maxlen=6","Max length for OFFCODE_INFORM is 6 ");

	frmvalidator.addValidation("offcode_inform","req","Please Enter OFFCODE_INFORM");

	frmvalidator.addValidation("offcode_inform","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_inform","maxlen=20","Max length for POSCODE_INFORM is 20 ");

	frmvalidator.addValidation("poscode_inform","req","Please Enter POSCODE_INFORM");

	frmvalidator.addValidation("poscode_inform","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_inform","maxlen=13","Max length for STAFF_ID_INFORM is 13 ");

	frmvalidator.addValidation("staff_id_inform","req","Please Enter STAFF_ID_INFORM");

	frmvalidator.addValidation("staff_id_inform","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("inform_date","req","Please Enter INFORM_DATE");


	
	frmvalidator.addValidation("inform_for","maxlen=200","Max length for INFORM_FOR is 200 ");

	frmvalidator.addValidation("inform_for","req","Please Enter INFORM_FOR");

	frmvalidator.addValidation("inform_for","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_to","maxlen=200","Max length for INFORM_TO is 200 ");

	frmvalidator.addValidation("inform_to","req","Please Enter INFORM_TO");

	frmvalidator.addValidation("inform_to","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("app_req_approve_compare_id","maxlen=22","Max length for APP_REQ_APPROVE_COMPARE_ID is 22 ");

	frmvalidator.addValidation("app_req_approve_compare_id","req","Please Enter APP_REQ_APPROVE_COMPARE_ID");

	frmvalidator.addValidation("app_req_approve_compare_id","num","Please Enter number");

	</script>