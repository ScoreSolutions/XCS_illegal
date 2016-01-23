








 

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

	
	frmvalidator.addValidation("compare_case_id","maxlen=22","Max length for COMPARE_CASE_ID is 22 ");

	frmvalidator.addValidation("compare_case_id","req","Please Enter COMPARE_CASE_ID");

	frmvalidator.addValidation("compare_case_id","num","Please Enter number");

	



	
	frmvalidator.addValidation("inform_position","maxlen=200","Max length for INFORM_POSITION is 200 ");


	frmvalidator.addValidation("inform_position","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_name","maxlen=200","Max length for INFORM_NAME is 200 ");


	frmvalidator.addValidation("inform_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_receive","maxlen=20","Max length for POSCODE_RECEIVE is 20 ");


	frmvalidator.addValidation("poscode_receive","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_receive","maxlen=13","Max length for STAFF_ID_RECEIVE is 13 ");


	frmvalidator.addValidation("staff_id_receive","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_request","maxlen=20","Max length for POSCODE_REQUEST is 20 ");

	frmvalidator.addValidation("poscode_request","req","Please Enter POSCODE_REQUEST");

	frmvalidator.addValidation("poscode_request","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_request","maxlen=13","Max length for STAFF_ID_REQUEST is 13 ");

	frmvalidator.addValidation("staff_id_request","req","Please Enter STAFF_ID_REQUEST");

	frmvalidator.addValidation("staff_id_request","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("request_date","req","Please Enter REQUEST_DATE");


	
	frmvalidator.addValidation("request_no","maxlen=20","Max length for REQUEST_NO is 20 ");

	frmvalidator.addValidation("request_no","req","Please Enter REQUEST_NO");

	frmvalidator.addValidation("request_no","alnum_s","Please Enter alphabatic");

	</script>