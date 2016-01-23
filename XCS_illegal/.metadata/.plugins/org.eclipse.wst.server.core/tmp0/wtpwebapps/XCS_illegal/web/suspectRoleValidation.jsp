








 

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

	
	frmvalidator.addValidation("role_status","maxlen=1","Max length for ROLE_STATUS is 1 ");

	frmvalidator.addValidation("role_status","req","Please Enter ROLE_STATUS");

	frmvalidator.addValidation("role_status","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("role_desc","maxlen=500","Max length for ROLE_DESC is 500 ");


	frmvalidator.addValidation("role_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("role_level","maxlen=1","Max length for ROLE_LEVEL is 1 ");

	frmvalidator.addValidation("role_level","req","Please Enter ROLE_LEVEL");

	frmvalidator.addValidation("role_level","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("role_name","maxlen=200","Max length for ROLE_NAME is 200 ");

	frmvalidator.addValidation("role_name","req","Please Enter ROLE_NAME");

	frmvalidator.addValidation("role_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("role_code","maxlen=20","Max length for ROLE_CODE is 20 ");

	frmvalidator.addValidation("role_code","req","Please Enter ROLE_CODE");

	frmvalidator.addValidation("role_code","alnum_s","Please Enter alphabatic");

	</script>