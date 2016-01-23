








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("dept_name","maxlen=500","Max length for DEPT_NAME is 500 ");


	frmvalidator.addValidation("dept_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("pos_name","maxlen=500","Max length for POS_NAME is 500 ");


	frmvalidator.addValidation("pos_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_admin","maxlen=20","Max length for POSCODE_ADMIN is 20 ");


	frmvalidator.addValidation("poscode_admin","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode","maxlen=20","Max length for POSCODE is 20 ");


	frmvalidator.addValidation("poscode","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("per_id_ref","maxlen=22","Max length for PER_ID_REF is 22 ");


	frmvalidator.addValidation("per_id_ref","num","Please Enter number");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");


	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_level","maxlen=20","Max length for STAFF_LEVEL is 20 ");


	frmvalidator.addValidation("staff_level","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("sex","maxlen=1","Max length for SEX is 1 ");

	frmvalidator.addValidation("sex","req","Please Enter SEX");

	frmvalidator.addValidation("sex","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("last_name","maxlen=100","Max length for LAST_NAME is 100 ");


	frmvalidator.addValidation("last_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("first_name","maxlen=100","Max length for FIRST_NAME is 100 ");

	frmvalidator.addValidation("first_name","req","Please Enter FIRST_NAME");

	frmvalidator.addValidation("first_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("title_code","maxlen=4","Max length for TITLE_CODE is 4 ");


	frmvalidator.addValidation("title_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("per_type","maxlen=1","Max length for PER_TYPE is 1 ");

	frmvalidator.addValidation("per_type","req","Please Enter PER_TYPE");

	frmvalidator.addValidation("per_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("idcard_no","maxlen=13","Max length for IDCARD_NO is 13 ");

	frmvalidator.addValidation("idcard_no","req","Please Enter IDCARD_NO");

	frmvalidator.addValidation("idcard_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("empid","maxlen=22","Max length for EMPID is 22 ");


	frmvalidator.addValidation("empid","num","Please Enter number");

	</script>