








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("exhibit_wild","maxlen=1","Max length for EXHIBIT_WILD is 1 ");

	frmvalidator.addValidation("exhibit_wild","req","Please Enter EXHIBIT_WILD");

	frmvalidator.addValidation("exhibit_wild","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("indictment_id","maxlen=22","Max length for INDICTMENT_ID is 22 ");

	frmvalidator.addValidation("indictment_id","req","Please Enter INDICTMENT_ID");

	frmvalidator.addValidation("indictment_id","num","Please Enter number");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alphanumeric","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	</script>