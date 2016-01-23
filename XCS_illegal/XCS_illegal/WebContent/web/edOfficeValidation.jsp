








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	



	
	frmvalidator.addValidation("upd_userid","maxlen=10","Max length for UPD_USERID is 10 ");


	frmvalidator.addValidation("upd_userid","alnum_s","Please Enter alphabatic");

	



	



	
	frmvalidator.addValidation("supoffcode","maxlen=6","Max length for SUPOFFCODE is 6 ");


	frmvalidator.addValidation("supoffcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("tambol_code","maxlen=6","Max length for TAMBOL_CODE is 6 ");


	frmvalidator.addValidation("tambol_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("indc_off","maxlen=1","Max length for INDC_OFF is 1 ");


	frmvalidator.addValidation("indc_off","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("short_name","maxlen=50","Max length for SHORT_NAME is 50 ");


	frmvalidator.addValidation("short_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offname","maxlen=100","Max length for OFFNAME is 100 ");


	frmvalidator.addValidation("offname","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	</script>