








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("lic_order","maxlen=22","Max length for LIC_ORDER is 22 ");


	frmvalidator.addValidation("lic_order","num","Please Enter number");

	
	frmvalidator.addValidation("lic_from","maxlen=3","Max length for LIC_FROM is 3 ");


	frmvalidator.addValidation("lic_from","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("issue_by","maxlen=1","Max length for ISSUE_BY is 1 ");


	frmvalidator.addValidation("issue_by","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("period","maxlen=22","Max length for PERIOD is 22 ");


	frmvalidator.addValidation("period","num","Please Enter number");

	
	frmvalidator.addValidation("lic_type","maxlen=14","Max length for LIC_TYPE is 14 ");


	frmvalidator.addValidation("lic_type","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("active_status","maxlen=1","Max length for ACTIVE_STATUS is 1 ");

	frmvalidator.addValidation("active_status","req","Please Enter ACTIVE_STATUS");

	frmvalidator.addValidation("active_status","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("licensetype_name","maxlen=200","Max length for LICENSETYPE_NAME is 200 ");

	frmvalidator.addValidation("licensetype_name","req","Please Enter LICENSETYPE_NAME");

	frmvalidator.addValidation("licensetype_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("licensetype_code","maxlen=20","Max length for LICENSETYPE_CODE is 20 ");

	frmvalidator.addValidation("licensetype_code","req","Please Enter LICENSETYPE_CODE");

	frmvalidator.addValidation("licensetype_code","alnum_s","Please Enter alphabatic");

	</script>