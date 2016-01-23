








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("tax_value","maxlen=22","Max length for TAX_VALUE is 22 ");


	frmvalidator.addValidation("tax_value","num","Please Enter number");

	
	frmvalidator.addValidation("staff_prove_offcode","maxlen=6","Max length for STAFF_PROVE_OFFCODE is 6 ");


	frmvalidator.addValidation("staff_prove_offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_prove_poscode","maxlen=20","Max length for STAFF_PROVE_POSCODE is 20 ");


	frmvalidator.addValidation("staff_prove_poscode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("status","maxlen=1","Max length for STATUS is 1 ");


	frmvalidator.addValidation("status","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("order_desc","maxlen=500","Max length for ORDER_DESC is 500 ");


	frmvalidator.addValidation("order_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("report_desc","maxlen=4000","Max length for REPORT_DESC is 4000 ");


	frmvalidator.addValidation("report_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("replace_position","maxlen=200","Max length for REPLACE_POSITION is 200 ");


	frmvalidator.addValidation("replace_position","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("staff_idcardno_prove","maxlen=13","Max length for STAFF_IDCARDNO_PROVE is 13 ");


	frmvalidator.addValidation("staff_idcardno_prove","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("case_id","maxlen=22","Max length for CASE_ID is 22 ");


	frmvalidator.addValidation("case_id","num","Please Enter number");

	
	frmvalidator.addValidation("exhibit_report_no","maxlen=20","Max length for EXHIBIT_REPORT_NO is 20 ");


	frmvalidator.addValidation("exhibit_report_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	</script>