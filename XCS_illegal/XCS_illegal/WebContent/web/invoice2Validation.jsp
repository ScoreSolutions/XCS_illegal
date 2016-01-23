








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("offcode_cancel","maxlen=6","Max length for OFFCODE_CANCEL is 6 ");


	frmvalidator.addValidation("offcode_cancel","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("poscode_cancel","maxlen=20","Max length for POSCODE_CANCEL is 20 ");


	frmvalidator.addValidation("poscode_cancel","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_cancel","maxlen=13","Max length for STAFF_CANCEL is 13 ");


	frmvalidator.addValidation("staff_cancel","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("status","maxlen=1","Max length for STATUS is 1 ");

	frmvalidator.addValidation("status","req","Please Enter STATUS");

	frmvalidator.addValidation("status","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("interior_remarks","maxlen=200","Max length for INTERIOR_REMARKS is 200 ");


	frmvalidator.addValidation("interior_remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("tax_remarks","maxlen=200","Max length for TAX_REMARKS is 200 ");


	frmvalidator.addValidation("tax_remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("interior_fine","maxlen=22","Max length for INTERIOR_FINE is 22 ");

	frmvalidator.addValidation("interior_fine","req","Please Enter INTERIOR_FINE");

	frmvalidator.addValidation("interior_fine","num","Please Enter number");

	
	frmvalidator.addValidation("tax_fine","maxlen=22","Max length for TAX_FINE is 22 ");

	frmvalidator.addValidation("tax_fine","req","Please Enter TAX_FINE");

	frmvalidator.addValidation("tax_fine","num","Please Enter number");

	
	frmvalidator.addValidation("offcode_receive","maxlen=6","Max length for OFFCODE_RECEIVE is 6 ");


	frmvalidator.addValidation("offcode_receive","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_receive","maxlen=20","Max length for POSCODE_RECEIVE is 20 ");


	frmvalidator.addValidation("poscode_receive","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_receive","maxlen=13","Max length for STAFF_RECEIVE is 13 ");


	frmvalidator.addValidation("staff_receive","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("send_no","maxlen=20","Max length for SEND_NO is 20 ");


	frmvalidator.addValidation("send_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("send_bookno","maxlen=20","Max length for SEND_BOOKNO is 20 ");


	frmvalidator.addValidation("send_bookno","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("compare_case_id","maxlen=22","Max length for COMPARE_CASE_ID is 22 ");

	frmvalidator.addValidation("compare_case_id","req","Please Enter COMPARE_CASE_ID");

	frmvalidator.addValidation("compare_case_id","num","Please Enter number");

	

	frmvalidator.addValidation("inv_date","req","Please Enter INV_DATE");


	
	frmvalidator.addValidation("inv_no","maxlen=20","Max length for INV_NO is 20 ");

	frmvalidator.addValidation("inv_no","req","Please Enter INV_NO");

	frmvalidator.addValidation("inv_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inv_bookno","maxlen=20","Max length for INV_BOOKNO is 20 ");

	frmvalidator.addValidation("inv_bookno","req","Please Enter INV_BOOKNO");

	frmvalidator.addValidation("inv_bookno","alnum_s","Please Enter alphabatic");

	</script>