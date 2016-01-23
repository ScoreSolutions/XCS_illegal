








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("salary","maxlen=7","Max length for SALARY is 7 ");



	
	frmvalidator.addValidation("parent_id","maxlen=22","Max length for PARENT_ID is 22 ");


	frmvalidator.addValidation("parent_id","num","Please Enter number");

	



	
	frmvalidator.addValidation("sex","maxlen=1","Max length for SEX is 1 ");


	frmvalidator.addValidation("sex","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");


	frmvalidator.addValidation("create_by","num","Please Enter number");

	



	



	
	frmvalidator.addValidation("user_pass","maxlen=255","Max length for USER_PASS is 255 ");


	frmvalidator.addValidation("user_pass","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("user_login","maxlen=255","Max length for USER_LOGIN is 255 ");


	frmvalidator.addValidation("user_login","alnum_s","Please Enter alphabatic");

	</script>