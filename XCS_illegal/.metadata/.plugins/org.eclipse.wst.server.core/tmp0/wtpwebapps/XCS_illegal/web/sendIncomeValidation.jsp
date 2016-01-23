








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("status","maxlen=1","Max length for STATUS is 1 ");

	frmvalidator.addValidation("status","req","Please Enter STATUS");

	frmvalidator.addValidation("status","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("inv_no","maxlen=20","Max length for INV_NO is 20 ");


	frmvalidator.addValidation("inv_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_approve","maxlen=20","Max length for POSCODE_APPROVE is 20 ");

	frmvalidator.addValidation("poscode_approve","req","Please Enter POSCODE_APPROVE");

	frmvalidator.addValidation("poscode_approve","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_approve","maxlen=13","Max length for STAFF_ID_APPROVE is 13 ");

	frmvalidator.addValidation("staff_id_approve","req","Please Enter STAFF_ID_APPROVE");

	frmvalidator.addValidation("staff_id_approve","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_send","maxlen=20","Max length for POSCODE_SEND is 20 ");

	frmvalidator.addValidation("poscode_send","req","Please Enter POSCODE_SEND");

	frmvalidator.addValidation("poscode_send","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_send","maxlen=13","Max length for STAFF_ID_SEND is 13 ");

	frmvalidator.addValidation("staff_id_send","req","Please Enter STAFF_ID_SEND");

	frmvalidator.addValidation("staff_id_send","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("fine_date_to","req","Please Enter FINE_DATE_TO");


	

	frmvalidator.addValidation("fine_date_from","req","Please Enter FINE_DATE_FROM");


	
	frmvalidator.addValidation("legislation_id","maxlen=22","Max length for LEGISLATION_ID is 22 ");

	frmvalidator.addValidation("legislation_id","req","Please Enter LEGISLATION_ID");

	frmvalidator.addValidation("legislation_id","num","Please Enter number");

	
	frmvalidator.addValidation("offcode_area","maxlen=6","Max length for OFFCODE_AREA is 6 ");

	frmvalidator.addValidation("offcode_area","req","Please Enter OFFCODE_AREA");

	frmvalidator.addValidation("offcode_area","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offname_write","maxlen=100","Max length for OFFNAME_WRITE is 100 ");

	frmvalidator.addValidation("offname_write","req","Please Enter OFFNAME_WRITE");

	frmvalidator.addValidation("offname_write","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_write","maxlen=6","Max length for OFFCODE_WRITE is 6 ");


	frmvalidator.addValidation("offcode_write","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("send_doc_no","maxlen=20","Max length for SEND_DOC_NO is 20 ");

	frmvalidator.addValidation("send_doc_no","req","Please Enter SEND_DOC_NO");

	frmvalidator.addValidation("send_doc_no","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("send_date","req","Please Enter SEND_DATE");


	
	frmvalidator.addValidation("send_no","maxlen=20","Max length for SEND_NO is 20 ");

	frmvalidator.addValidation("send_no","req","Please Enter SEND_NO");

	frmvalidator.addValidation("send_no","alnum_s","Please Enter alphabatic");

	</script>