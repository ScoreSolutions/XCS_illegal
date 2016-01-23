








 

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

	
	frmvalidator.addValidation("category_name","maxlen=100","Max length for CATEGORY_NAME is 100 ");

	frmvalidator.addValidation("category_name","req","Please Enter CATEGORY_NAME");

	frmvalidator.addValidation("category_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("category_code","maxlen=20","Max length for CATEGORY_CODE is 20 ");

	frmvalidator.addValidation("category_code","req","Please Enter CATEGORY_CODE");

	frmvalidator.addValidation("category_code","alnum_s","Please Enter alphabatic");

	</script>