








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("iswithdraw","maxlen=1","Max length for ISWITHDRAW is 1 ");

	frmvalidator.addValidation("iswithdraw","req","Please Enter ISWITHDRAW");

	frmvalidator.addValidation("iswithdraw","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("license_no","maxlen=20","Max length for LICENSE_NO is 20 ");


	frmvalidator.addValidation("license_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("book_no","maxlen=20","Max length for BOOK_NO is 20 ");


	frmvalidator.addValidation("book_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("license_type","maxlen=22","Max length for LICENSE_TYPE is 22 ");


	frmvalidator.addValidation("license_type","num","Please Enter number");

	
	frmvalidator.addValidation("establishment_name","maxlen=100","Max length for ESTABLISHMENT_NAME is 100 ");

	frmvalidator.addValidation("establishment_name","req","Please Enter ESTABLISHMENT_NAME");

	frmvalidator.addValidation("establishment_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("entrepreneur","maxlen=100","Max length for ENTREPRENEUR is 100 ");

	frmvalidator.addValidation("entrepreneur","req","Please Enter ENTREPRENEUR");

	frmvalidator.addValidation("entrepreneur","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	</script>