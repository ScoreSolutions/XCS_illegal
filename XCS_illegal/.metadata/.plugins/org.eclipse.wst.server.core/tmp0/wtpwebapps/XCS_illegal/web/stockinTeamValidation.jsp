








 

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

	
	frmvalidator.addValidation("staff_offcode","maxlen=6","Max length for STAFF_OFFCODE is 6 ");

	frmvalidator.addValidation("staff_offcode","req","Please Enter STAFF_OFFCODE");

	frmvalidator.addValidation("staff_offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_poscode","maxlen=20","Max length for STAFF_POSCODE is 20 ");

	frmvalidator.addValidation("staff_poscode","req","Please Enter STAFF_POSCODE");

	frmvalidator.addValidation("staff_poscode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_idcardno","maxlen=13","Max length for STAFF_IDCARDNO is 13 ");

	frmvalidator.addValidation("staff_idcardno","req","Please Enter STAFF_IDCARDNO");

	frmvalidator.addValidation("staff_idcardno","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("stockin_id","maxlen=22","Max length for STOCKIN_ID is 22 ");

	frmvalidator.addValidation("stockin_id","req","Please Enter STOCKIN_ID");

	frmvalidator.addValidation("stockin_id","num","Please Enter number");

	</script>