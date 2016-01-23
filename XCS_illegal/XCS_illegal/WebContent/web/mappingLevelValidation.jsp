








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("remarks","maxlen=500","Max length for REMARKS is 500 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("p_level","maxlen=2","Max length for P_LEVEL is 2 ");

	frmvalidator.addValidation("p_level","req","Please Enter P_LEVEL");

	frmvalidator.addValidation("p_level","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("c_level","maxlen=2","Max length for C_LEVEL is 2 ");

	frmvalidator.addValidation("c_level","req","Please Enter C_LEVEL");

	frmvalidator.addValidation("c_level","alnum_s","Please Enter alphabatic");

	</script>