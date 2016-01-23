








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("description","maxlen=500","Max length for DESCRIPTION is 500 ");


	frmvalidator.addValidation("description","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("fax_no","maxlen=50","Max length for FAX_NO is 50 ");


	frmvalidator.addValidation("fax_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("tel_no","maxlen=50","Max length for TEL_NO is 50 ");


	frmvalidator.addValidation("tel_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("zipcode","maxlen=5","Max length for ZIPCODE is 5 ");


	frmvalidator.addValidation("zipcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("province_code","maxlen=2","Max length for PROVINCE_CODE is 2 ");


	frmvalidator.addValidation("province_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("distric_code","maxlen=4","Max length for DISTRIC_CODE is 4 ");


	frmvalidator.addValidation("distric_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("subdistric_code","maxlen=6","Max length for SUBDISTRIC_CODE is 6 ");


	frmvalidator.addValidation("subdistric_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("moo","maxlen=22","Max length for MOO is 22 ");


	frmvalidator.addValidation("moo","num","Please Enter number");

	
	frmvalidator.addValidation("road","maxlen=200","Max length for ROAD is 200 ");


	frmvalidator.addValidation("road","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("soi","maxlen=200","Max length for SOI is 200 ");


	frmvalidator.addValidation("soi","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("address_name","maxlen=200","Max length for ADDRESS_NAME is 200 ");


	frmvalidator.addValidation("address_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("address","maxlen=100","Max length for ADDRESS is 100 ");


	frmvalidator.addValidation("address","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_no","maxlen=22","Max length for LAWBREAKER_NO is 22 ");

	frmvalidator.addValidation("lawbreaker_no","req","Please Enter LAWBREAKER_NO");

	frmvalidator.addValidation("lawbreaker_no","num","Please Enter number");

	
	frmvalidator.addValidation("address_no","maxlen=22","Max length for ADDRESS_NO is 22 ");

	frmvalidator.addValidation("address_no","req","Please Enter ADDRESS_NO");

	frmvalidator.addValidation("address_no","num","Please Enter number");

	</script>