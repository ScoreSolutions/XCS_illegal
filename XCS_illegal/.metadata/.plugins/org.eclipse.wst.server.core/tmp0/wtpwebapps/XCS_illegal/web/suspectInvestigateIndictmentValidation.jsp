








 

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

	
	frmvalidator.addValidation("indictment_id","maxlen=22","Max length for INDICTMENT_ID is 22 ");

	frmvalidator.addValidation("indictment_id","req","Please Enter INDICTMENT_ID");

	frmvalidator.addValidation("indictment_id","num","Please Enter number");

	
	frmvalidator.addValidation("suspect_investigate_id","maxlen=22","Max length for SUSPECT_INVESTIGATE_ID is 22 ");

	frmvalidator.addValidation("suspect_investigate_id","req","Please Enter SUSPECT_INVESTIGATE_ID");

	frmvalidator.addValidation("suspect_investigate_id","num","Please Enter number");

	</script>