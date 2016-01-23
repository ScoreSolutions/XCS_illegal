








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("active","maxlen=1","Max length for ACTIVE is 1 ");


	frmvalidator.addValidation("active","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("religion_name","maxlen=100","Max length for RELIGION_NAME is 100 ");

	frmvalidator.addValidation("religion_name","req","Please Enter RELIGION_NAME");

	frmvalidator.addValidation("religion_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("religion_code","maxlen=20","Max length for RELIGION_CODE is 20 ");

	frmvalidator.addValidation("religion_code","req","Please Enter RELIGION_CODE");

	frmvalidator.addValidation("religion_code","alnum_s","Please Enter alphabatic");

	</script>