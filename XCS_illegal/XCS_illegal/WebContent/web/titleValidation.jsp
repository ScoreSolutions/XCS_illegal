








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	



	
	frmvalidator.addValidation("upd_userid","maxlen=10","Max length for UPD_USERID is 10 ");


	frmvalidator.addValidation("upd_userid","alnum_s","Please Enter alphabatic");

	



	



	
	frmvalidator.addValidation("title_seo","maxlen=22","Max length for TITLE_SEO is 22 ");


	frmvalidator.addValidation("title_seo","num","Please Enter number");

	
	frmvalidator.addValidation("short_suffix","maxlen=10","Max length for SHORT_SUFFIX is 10 ");


	frmvalidator.addValidation("short_suffix","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("suffix_name","maxlen=50","Max length for SUFFIX_NAME is 50 ");


	frmvalidator.addValidation("suffix_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("short_title","maxlen=20","Max length for SHORT_TITLE is 20 ");


	frmvalidator.addValidation("short_title","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("title_name","maxlen=50","Max length for TITLE_NAME is 50 ");


	frmvalidator.addValidation("title_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("title_type","maxlen=1","Max length for TITLE_TYPE is 1 ");


	frmvalidator.addValidation("title_type","alnum_s","Please Enter alphabatic");

	</script>