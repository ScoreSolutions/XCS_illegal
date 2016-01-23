








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("compare_request_section","maxlen=20","Max length for COMPARE_REQUEST_SECTION is 20 ");

	frmvalidator.addValidation("compare_request_section","req","Please Enter COMPARE_REQUEST_SECTION");

	frmvalidator.addValidation("compare_request_section","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("notice_default_compare","maxlen=1","Max length for NOTICE_DEFAULT_COMPARE is 1 ");

	frmvalidator.addValidation("notice_default_compare","req","Please Enter NOTICE_DEFAULT_COMPARE");

	frmvalidator.addValidation("notice_default_compare","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("legislation_name","maxlen=200","Max length for LEGISLATION_NAME is 200 ");

	frmvalidator.addValidation("legislation_name","req","Please Enter LEGISLATION_NAME");

	frmvalidator.addValidation("legislation_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("legislation_code","maxlen=2","Max length for LEGISLATION_CODE is 2 ");

	frmvalidator.addValidation("legislation_code","req","Please Enter LEGISLATION_CODE");

	frmvalidator.addValidation("legislation_code","alnum_s","Please Enter alphabatic");

	</script>