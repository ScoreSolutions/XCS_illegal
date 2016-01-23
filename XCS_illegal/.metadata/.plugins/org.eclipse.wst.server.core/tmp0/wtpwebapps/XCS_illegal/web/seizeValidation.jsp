








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("del_idcardno","maxlen=13","Max length for DEL_IDCARDNO is 13 ");


	frmvalidator.addValidation("del_idcardno","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("del_flag","maxlen=1","Max length for DEL_FLAG is 1 ");

	frmvalidator.addValidation("del_flag","req","Please Enter DEL_FLAG");

	frmvalidator.addValidation("del_flag","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	



	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("seize_location","maxlen=200","Max length for SEIZE_LOCATION is 200 ");


	frmvalidator.addValidation("seize_location","alnum_s","Please Enter alphabatic");

	



	



	

	frmvalidator.addValidation("seize_date","req","Please Enter SEIZE_DATE");


	
	frmvalidator.addValidation("order_no","maxlen=20","Max length for ORDER_NO is 20 ");

	frmvalidator.addValidation("order_no","req","Please Enter ORDER_NO");

	frmvalidator.addValidation("order_no","alnum_s","Please Enter alphabatic");

	</script>