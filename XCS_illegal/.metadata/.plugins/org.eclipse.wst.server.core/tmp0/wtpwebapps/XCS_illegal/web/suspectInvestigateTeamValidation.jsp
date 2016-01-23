








 

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

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode","maxlen=20","Max length for POSCODE is 20 ");

	frmvalidator.addValidation("poscode","req","Please Enter POSCODE");

	frmvalidator.addValidation("poscode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("suspect_investigate_id","maxlen=22","Max length for SUSPECT_INVESTIGATE_ID is 22 ");

	frmvalidator.addValidation("suspect_investigate_id","req","Please Enter SUSPECT_INVESTIGATE_ID");

	frmvalidator.addValidation("suspect_investigate_id","num","Please Enter number");

	
	frmvalidator.addValidation("idcard_no","maxlen=13","Max length for IDCARD_NO is 13 ");

	frmvalidator.addValidation("idcard_no","req","Please Enter IDCARD_NO");

	frmvalidator.addValidation("idcard_no","alnum_s","Please Enter alphabatic");

	</script>