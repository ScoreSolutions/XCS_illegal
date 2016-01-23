








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("browser","maxlen=200","Max length for BROWSER is 200 ");


	frmvalidator.addValidation("browser","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("sessionid","maxlen=200","Max length for SESSIONID is 200 ");


	frmvalidator.addValidation("sessionid","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("ip_address","maxlen=20","Max length for IP_ADDRESS is 20 ");

	frmvalidator.addValidation("ip_address","req","Please Enter IP_ADDRESS");

	frmvalidator.addValidation("ip_address","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("error_desc","maxlen=500","Max length for ERROR_DESC is 500 ");

	frmvalidator.addValidation("error_desc","req","Please Enter ERROR_DESC");

	frmvalidator.addValidation("error_desc","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("error_date","req","Please Enter ERROR_DATE");


	
	frmvalidator.addValidation("userid","maxlen=13","Max length for USERID is 13 ");

	frmvalidator.addValidation("userid","req","Please Enter USERID");

	frmvalidator.addValidation("userid","alnum_s","Please Enter alphabatic");

	</script>