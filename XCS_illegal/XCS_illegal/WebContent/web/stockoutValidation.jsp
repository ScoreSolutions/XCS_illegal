








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("subject_type","maxlen=1","Max length for SUBJECT_TYPE is 1 ");


	frmvalidator.addValidation("subject_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("transfer_by","maxlen=13","Max length for TRANSFER_BY is 13 ");


	frmvalidator.addValidation("transfer_by","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("job_no","maxlen=20","Max length for JOB_NO is 20 ");


	frmvalidator.addValidation("job_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_to","maxlen=6","Max length for OFFCODE_TO is 6 ");


	frmvalidator.addValidation("offcode_to","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("status","maxlen=1","Max length for STATUS is 1 ");

	frmvalidator.addValidation("status","req","Please Enter STATUS");

	frmvalidator.addValidation("status","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("remarks","maxlen=500","Max length for REMARKS is 500 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("legislation_id","maxlen=22","Max length for LEGISLATION_ID is 22 ");

	frmvalidator.addValidation("legislation_id","req","Please Enter LEGISLATION_ID");

	frmvalidator.addValidation("legislation_id","num","Please Enter number");

	
	frmvalidator.addValidation("report_to_staff","maxlen=13","Max length for REPORT_TO_STAFF is 13 ");

	frmvalidator.addValidation("report_to_staff","req","Please Enter REPORT_TO_STAFF");

	frmvalidator.addValidation("report_to_staff","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("subject","maxlen=300","Max length for SUBJECT is 300 ");

	frmvalidator.addValidation("subject","req","Please Enter SUBJECT");

	frmvalidator.addValidation("subject","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("stockout_date","req","Please Enter STOCKOUT_DATE");


	
	frmvalidator.addValidation("stockout_code","maxlen=20","Max length for STOCKOUT_CODE is 20 ");

	frmvalidator.addValidation("stockout_code","req","Please Enter STOCKOUT_CODE");

	frmvalidator.addValidation("stockout_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("stockout_type","maxlen=1","Max length for STOCKOUT_TYPE is 1 ");

	frmvalidator.addValidation("stockout_type","req","Please Enter STOCKOUT_TYPE");

	frmvalidator.addValidation("stockout_type","alnum_s","Please Enter alphabatic");

	</script>