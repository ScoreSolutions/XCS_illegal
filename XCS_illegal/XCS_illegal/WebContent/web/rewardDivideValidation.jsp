








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("remarks","maxlen=2000","Max length for REMARKS is 2000 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("compare_case_id","maxlen=22","Max length for COMPARE_CASE_ID is 22 ");

	frmvalidator.addValidation("compare_case_id","req","Please Enter COMPARE_CASE_ID");

	frmvalidator.addValidation("compare_case_id","num","Please Enter number");

	



	

	frmvalidator.addValidation("divide_date","req","Please Enter DIVIDE_DATE");


	
	frmvalidator.addValidation("divide_no","maxlen=20","Max length for DIVIDE_NO is 20 ");

	frmvalidator.addValidation("divide_no","req","Please Enter DIVIDE_NO");

	frmvalidator.addValidation("divide_no","alnum_s","Please Enter alphabatic");

	</script>