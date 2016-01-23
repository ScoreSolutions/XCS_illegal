








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("status","maxlen=1","Max length for STATUS is 1 ");


	frmvalidator.addValidation("status","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("product_group_id","maxlen=4","Max length for PRODUCT_GROUP_ID is 4 ");


	frmvalidator.addValidation("product_group_id","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("legislation_id","maxlen=22","Max length for LEGISLATION_ID is 22 ");

	frmvalidator.addValidation("legislation_id","req","Please Enter LEGISLATION_ID");

	frmvalidator.addValidation("legislation_id","num","Please Enter number");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("qty","maxlen=22","Max length for QTY is 22 ");

	frmvalidator.addValidation("qty","req","Please Enter QTY");

	frmvalidator.addValidation("qty","num","Please Enter number");

	
	frmvalidator.addValidation("budget_year","maxlen=22","Max length for BUDGET_YEAR is 22 ");

	frmvalidator.addValidation("budget_year","req","Please Enter BUDGET_YEAR");

	frmvalidator.addValidation("budget_year","num","Please Enter number");

	
	frmvalidator.addValidation("job_no","maxlen=20","Max length for JOB_NO is 20 ");

	frmvalidator.addValidation("job_no","req","Please Enter JOB_NO");

	frmvalidator.addValidation("job_no","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("job_date","req","Please Enter JOB_DATE");


	</script>