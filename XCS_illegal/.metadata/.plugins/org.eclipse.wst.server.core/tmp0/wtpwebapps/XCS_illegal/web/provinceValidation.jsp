








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("rdb_code","maxlen=20","Max length for RDB_CODE is 20 ");


	frmvalidator.addValidation("rdb_code","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("province_name","maxlen=100","Max length for PROVINCE_NAME is 100 ");

	frmvalidator.addValidation("province_name","req","Please Enter PROVINCE_NAME");

	frmvalidator.addValidation("province_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("province_code","maxlen=2","Max length for PROVINCE_CODE is 2 ");

	frmvalidator.addValidation("province_code","req","Please Enter PROVINCE_CODE");

	frmvalidator.addValidation("province_code","alnum_s","Please Enter alphabatic");

	</script>