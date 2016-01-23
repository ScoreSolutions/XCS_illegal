








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("description","maxlen=500","Max length for DESCRIPTION is 500 ");


	frmvalidator.addValidation("description","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("datatype","maxlen=1","Max length for DATATYPE is 1 ");

	frmvalidator.addValidation("datatype","req","Please Enter DATATYPE");

	frmvalidator.addValidation("datatype","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("config_value","maxlen=100","Max length for CONFIG_VALUE is 100 ");

	frmvalidator.addValidation("config_value","req","Please Enter CONFIG_VALUE");

	frmvalidator.addValidation("config_value","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("config_name","maxlen=100","Max length for CONFIG_NAME is 100 ");

	frmvalidator.addValidation("config_name","req","Please Enter CONFIG_NAME");

	frmvalidator.addValidation("config_name","alnum_s","Please Enter alphabatic");

	</script>