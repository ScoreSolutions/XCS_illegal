








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("subtype_code","maxlen=20","Max length for SUBTYPE_CODE is 20 ");


	frmvalidator.addValidation("subtype_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("law_duty_code","maxlen=100","Max length for LAW_DUTY_CODE is 100 ");


	frmvalidator.addValidation("law_duty_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("prc_param","maxlen=100","Max length for PRC_PARAM is 100 ");


	frmvalidator.addValidation("prc_param","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("producttype_id","maxlen=22","Max length for PRODUCTTYPE_ID is 22 ");

	frmvalidator.addValidation("producttype_id","req","Please Enter PRODUCTTYPE_ID");

	frmvalidator.addValidation("producttype_id","num","Please Enter number");

	
	frmvalidator.addValidation("product_name","maxlen=200","Max length for PRODUCT_NAME is 200 ");

	frmvalidator.addValidation("product_name","req","Please Enter PRODUCT_NAME");

	frmvalidator.addValidation("product_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("product_code","maxlen=8","Max length for PRODUCT_CODE is 8 ");

	frmvalidator.addValidation("product_code","req","Please Enter PRODUCT_CODE");

	frmvalidator.addValidation("product_code","alnum_s","Please Enter alphabatic");

	</script>