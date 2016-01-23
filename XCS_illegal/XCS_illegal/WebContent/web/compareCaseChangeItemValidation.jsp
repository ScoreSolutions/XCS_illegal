








 

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

	
	frmvalidator.addValidation("application_arrest_lawbreaker","maxlen=22","Max length for APPLICATION_ARREST_LAWBREAKER is 22 ");

	frmvalidator.addValidation("application_arrest_lawbreaker","req","Please Enter APPLICATION_ARREST_LAWBREAKER");

	frmvalidator.addValidation("application_arrest_lawbreaker","num","Please Enter number");

	
	frmvalidator.addValidation("paper_no","maxlen=20","Max length for PAPER_NO is 20 ");


	frmvalidator.addValidation("paper_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inv_no","maxlen=20","Max length for INV_NO is 20 ");


	frmvalidator.addValidation("inv_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("book_no","maxlen=20","Max length for BOOK_NO is 20 ");


	frmvalidator.addValidation("book_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("auto_inv_no","maxlen=20","Max length for AUTO_INV_NO is 20 ");


	frmvalidator.addValidation("auto_inv_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("compare_case_change_id","maxlen=22","Max length for COMPARE_CASE_CHANGE_ID is 22 ");

	frmvalidator.addValidation("compare_case_change_id","req","Please Enter COMPARE_CASE_CHANGE_ID");

	frmvalidator.addValidation("compare_case_change_id","num","Please Enter number");

	</script>