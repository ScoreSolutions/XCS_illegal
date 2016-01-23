








 

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

	
	frmvalidator.addValidation("description","maxlen=500","Max length for DESCRIPTION is 500 ");


	frmvalidator.addValidation("description","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("suspect_role_id","maxlen=22","Max length for SUSPECT_ROLE_ID is 22 ");

	frmvalidator.addValidation("suspect_role_id","req","Please Enter SUSPECT_ROLE_ID");

	frmvalidator.addValidation("suspect_role_id","num","Please Enter number");

	
	frmvalidator.addValidation("staff_idcardno","maxlen=13","Max length for STAFF_IDCARDNO is 13 ");

	frmvalidator.addValidation("staff_idcardno","req","Please Enter STAFF_IDCARDNO");

	frmvalidator.addValidation("staff_idcardno","alnum_s","Please Enter alphabatic");

	</script>