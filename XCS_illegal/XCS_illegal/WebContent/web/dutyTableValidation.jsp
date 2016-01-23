








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("law_duty_code","maxlen=10","Max length for LAW_DUTY_CODE is 10 ");


	frmvalidator.addValidation("law_duty_code","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("upd_userid","maxlen=10","Max length for UPD_USERID is 10 ");


	frmvalidator.addValidation("upd_userid","alnum_s","Please Enter alphabatic");

	



	



	
	frmvalidator.addValidation("duty_name","maxlen=300","Max length for DUTY_NAME is 300 ");


	frmvalidator.addValidation("duty_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_code","maxlen=4","Max length for DUTY_CODE is 4 ");

	frmvalidator.addValidation("duty_code","req","Please Enter DUTY_CODE");

	frmvalidator.addValidation("duty_code","alnum_s","Please Enter alphabatic");

	</script>