








 

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

	
	frmvalidator.addValidation("race_name","maxlen=100","Max length for RACE_NAME is 100 ");

	frmvalidator.addValidation("race_name","req","Please Enter RACE_NAME");

	frmvalidator.addValidation("race_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("race_code","maxlen=20","Max length for RACE_CODE is 20 ");

	frmvalidator.addValidation("race_code","req","Please Enter RACE_CODE");

	frmvalidator.addValidation("race_code","alnum_s","Please Enter alphabatic");

	</script>