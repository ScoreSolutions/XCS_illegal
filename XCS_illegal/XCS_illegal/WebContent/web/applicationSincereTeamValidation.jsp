








 

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

	
	frmvalidator.addValidation("offcode_staff","maxlen=6","Max length for OFFCODE_STAFF is 6 ");

	frmvalidator.addValidation("offcode_staff","req","Please Enter OFFCODE_STAFF");

	frmvalidator.addValidation("offcode_staff","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_staff","maxlen=20","Max length for POSCODE_STAFF is 20 ");

	frmvalidator.addValidation("poscode_staff","req","Please Enter POSCODE_STAFF");

	frmvalidator.addValidation("poscode_staff","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_idcard_no","maxlen=13","Max length for STAFF_IDCARD_NO is 13 ");

	frmvalidator.addValidation("staff_idcard_no","req","Please Enter STAFF_IDCARD_NO");

	frmvalidator.addValidation("staff_idcard_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("application_sincere_confirm_id","maxlen=22","Max length for APPLICATION_SINCERE_CONFIRM_ID is 22 ");

	frmvalidator.addValidation("application_sincere_confirm_id","req","Please Enter APPLICATION_SINCERE_CONFIRM_ID");

	frmvalidator.addValidation("application_sincere_confirm_id","num","Please Enter number");

	</script>