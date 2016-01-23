








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("upd_userid","maxlen=20","Max length for UPD_USERID is 20 ");


	frmvalidator.addValidation("upd_userid","alnum_s","Please Enter alphabatic");

	



	



	



	
	frmvalidator.addValidation("unit_code","maxlen=15","Max length for UNIT_CODE is 15 ");


	frmvalidator.addValidation("unit_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("size_desc","maxlen=100","Max length for SIZE_DESC is 100 ");


	frmvalidator.addValidation("size_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("size_code","maxlen=3","Max length for SIZE_CODE is 3 ");


	frmvalidator.addValidation("size_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_code","maxlen=4","Max length for DUTY_CODE is 4 ");


	frmvalidator.addValidation("duty_code","alnum_s","Please Enter alphabatic");

	</script>