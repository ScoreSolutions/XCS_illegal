








 

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

	
	frmvalidator.addValidation("mime_type","maxlen=100","Max length for MIME_TYPE is 100 ");


	frmvalidator.addValidation("mime_type","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("picture","req","Please Enter PICTURE");


	
	frmvalidator.addValidation("picture_category_id","maxlen=22","Max length for PICTURE_CATEGORY_ID is 22 ");

	frmvalidator.addValidation("picture_category_id","req","Please Enter PICTURE_CATEGORY_ID");

	frmvalidator.addValidation("picture_category_id","num","Please Enter number");

	
	frmvalidator.addValidation("suspect_no","maxlen=22","Max length for SUSPECT_NO is 22 ");

	frmvalidator.addValidation("suspect_no","req","Please Enter SUSPECT_NO");

	frmvalidator.addValidation("suspect_no","num","Please Enter number");

	</script>