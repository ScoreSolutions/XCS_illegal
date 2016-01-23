








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	



	
	frmvalidator.addValidation("upd_userid","maxlen=20","Max length for UPD_USERID is 20 ");


	frmvalidator.addValidation("upd_userid","alnum_s","Please Enter alphabatic");

	



	



	
	frmvalidator.addValidation("brand_main_eng","maxlen=200","Max length for BRAND_MAIN_ENG is 200 ");


	frmvalidator.addValidation("brand_main_eng","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("brand_main_thai","maxlen=200","Max length for BRAND_MAIN_THAI is 200 ");


	frmvalidator.addValidation("brand_main_thai","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("brand_main_code","maxlen=3","Max length for BRAND_MAIN_CODE is 3 ");


	frmvalidator.addValidation("brand_main_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_code","maxlen=4","Max length for DUTY_CODE is 4 ");


	frmvalidator.addValidation("duty_code","alnum_s","Please Enter alphabatic");

	</script>