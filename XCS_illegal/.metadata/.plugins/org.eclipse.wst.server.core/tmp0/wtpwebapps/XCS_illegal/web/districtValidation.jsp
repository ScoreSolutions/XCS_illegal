








 

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


	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("province_code","maxlen=2","Max length for PROVINCE_CODE is 2 ");

	frmvalidator.addValidation("province_code","req","Please Enter PROVINCE_CODE");

	frmvalidator.addValidation("province_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("district_name","maxlen=100","Max length for DISTRICT_NAME is 100 ");

	frmvalidator.addValidation("district_name","req","Please Enter DISTRICT_NAME");

	frmvalidator.addValidation("district_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("district_code","maxlen=4","Max length for DISTRICT_CODE is 4 ");

	frmvalidator.addValidation("district_code","req","Please Enter DISTRICT_CODE");

	frmvalidator.addValidation("district_code","alnum_s","Please Enter alphabatic");

	</script>