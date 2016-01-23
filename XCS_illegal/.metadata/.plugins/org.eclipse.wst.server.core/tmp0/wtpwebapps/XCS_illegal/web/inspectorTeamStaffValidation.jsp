








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("staff_offcode","maxlen=6","Max length for STAFF_OFFCODE is 6 ");


	frmvalidator.addValidation("staff_offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_poscode","maxlen=20","Max length for STAFF_POSCODE is 20 ");


	frmvalidator.addValidation("staff_poscode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_idcardno","maxlen=13","Max length for STAFF_IDCARDNO is 13 ");


	frmvalidator.addValidation("staff_idcardno","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("status","maxlen=1","Max length for STATUS is 1 ");

	frmvalidator.addValidation("status","req","Please Enter STATUS");

	frmvalidator.addValidation("status","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("last_name","maxlen=100","Max length for LAST_NAME is 100 ");

	frmvalidator.addValidation("last_name","req","Please Enter LAST_NAME");

	frmvalidator.addValidation("last_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("first_name","maxlen=100","Max length for FIRST_NAME is 100 ");

	frmvalidator.addValidation("first_name","req","Please Enter FIRST_NAME");

	frmvalidator.addValidation("first_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("title_id","maxlen=4","Max length for TITLE_ID is 4 ");


	frmvalidator.addValidation("title_id","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_code","maxlen=20","Max length for STAFF_CODE is 20 ");

	frmvalidator.addValidation("staff_code","req","Please Enter STAFF_CODE");

	frmvalidator.addValidation("staff_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inspector_team_id","maxlen=22","Max length for INSPECTOR_TEAM_ID is 22 ");

	frmvalidator.addValidation("inspector_team_id","req","Please Enter INSPECTOR_TEAM_ID");

	frmvalidator.addValidation("inspector_team_id","num","Please Enter number");

	</script>