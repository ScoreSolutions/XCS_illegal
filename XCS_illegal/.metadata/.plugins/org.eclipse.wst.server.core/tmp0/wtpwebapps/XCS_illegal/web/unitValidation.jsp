








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("abbname","maxlen=50","Max length for ABBNAME is 50 ");


	frmvalidator.addValidation("abbname","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("enname","maxlen=50","Max length for ENNAME is 50 ");


	frmvalidator.addValidation("enname","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("thname","maxlen=50","Max length for THNAME is 50 ");

	frmvalidator.addValidation("thname","req","Please Enter THNAME");

	frmvalidator.addValidation("thname","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("unit_code","maxlen=15","Max length for UNIT_CODE is 15 ");

	frmvalidator.addValidation("unit_code","req","Please Enter UNIT_CODE");

	frmvalidator.addValidation("unit_code","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	</script>