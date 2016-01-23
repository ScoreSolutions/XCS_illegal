








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	



	
	frmvalidator.addValidation("upd_userid","maxlen=10","Max length for UPD_USERID is 10 ");


	frmvalidator.addValidation("upd_userid","alnum_s","Please Enter alphabatic");

	



	



	
	frmvalidator.addValidation("country_seq","maxlen=22","Max length for COUNTRY_SEQ is 22 ");


	frmvalidator.addValidation("country_seq","num","Please Enter number");

	
	frmvalidator.addValidation("race_name","maxlen=50","Max length for RACE_NAME is 50 ");


	frmvalidator.addValidation("race_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("indc_afta","maxlen=1","Max length for INDC_AFTA is 1 ");


	frmvalidator.addValidation("indc_afta","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("continent","maxlen=1","Max length for CONTINENT is 1 ");


	frmvalidator.addValidation("continent","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("short_name","maxlen=25","Max length for SHORT_NAME is 25 ");


	frmvalidator.addValidation("short_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("country_name","maxlen=50","Max length for COUNTRY_NAME is 50 ");


	frmvalidator.addValidation("country_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("country_code","maxlen=4","Max length for COUNTRY_CODE is 4 ");


	frmvalidator.addValidation("country_code","alnum_s","Please Enter alphabatic");

	</script>