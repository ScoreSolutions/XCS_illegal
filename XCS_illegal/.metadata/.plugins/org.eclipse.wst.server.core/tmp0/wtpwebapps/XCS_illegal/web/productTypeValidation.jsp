








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("active","maxlen=1","Max length for ACTIVE is 1 ");


	frmvalidator.addValidation("active","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("group_id","maxlen=4","Max length for GROUP_ID is 4 ");

	frmvalidator.addValidation("group_id","req","Please Enter GROUP_ID");

	frmvalidator.addValidation("group_id","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("type_name","maxlen=200","Max length for TYPE_NAME is 200 ");


	frmvalidator.addValidation("type_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("type_code","maxlen=2","Max length for TYPE_CODE is 2 ");

	frmvalidator.addValidation("type_code","req","Please Enter TYPE_CODE");

	frmvalidator.addValidation("type_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_code","maxlen=4","Max length for DUTY_CODE is 4 ");

	frmvalidator.addValidation("duty_code","req","Please Enter DUTY_CODE");

	frmvalidator.addValidation("duty_code","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	</script>