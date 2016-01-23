








 

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

	
	frmvalidator.addValidation("authority_name","maxlen=100","Max length for AUTHORITY_NAME is 100 ");

	frmvalidator.addValidation("authority_name","req","Please Enter AUTHORITY_NAME");

	frmvalidator.addValidation("authority_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("authority_code","maxlen=20","Max length for AUTHORITY_CODE is 20 ");

	frmvalidator.addValidation("authority_code","req","Please Enter AUTHORITY_CODE");

	frmvalidator.addValidation("authority_code","alnum_s","Please Enter alphabatic");

	</script>