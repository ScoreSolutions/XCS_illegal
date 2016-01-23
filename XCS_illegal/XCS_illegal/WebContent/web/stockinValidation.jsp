








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("poscode_receive","maxlen=20","Max length for POSCODE_RECEIVE is 20 ");


	frmvalidator.addValidation("poscode_receive","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("stockout_id","maxlen=22","Max length for STOCKOUT_ID is 22 ");


	frmvalidator.addValidation("stockout_id","num","Please Enter number");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("status","maxlen=1","Max length for STATUS is 1 ");

	frmvalidator.addValidation("status","req","Please Enter STATUS");

	frmvalidator.addValidation("status","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("remarks","maxlen=200","Max length for REMARKS is 200 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("receive_by","maxlen=13","Max length for RECEIVE_BY is 13 ");

	frmvalidator.addValidation("receive_by","req","Please Enter RECEIVE_BY");

	frmvalidator.addValidation("receive_by","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("location","maxlen=100","Max length for LOCATION is 100 ");

	frmvalidator.addValidation("location","req","Please Enter LOCATION");

	frmvalidator.addValidation("location","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("delivery_exhibit_id","maxlen=22","Max length for DELIVERY_EXHIBIT_ID is 22 ");


	frmvalidator.addValidation("delivery_exhibit_id","num","Please Enter number");

	

	frmvalidator.addValidation("stockin_date","req","Please Enter STOCKIN_DATE");


	
	frmvalidator.addValidation("stockin_code","maxlen=20","Max length for STOCKIN_CODE is 20 ");

	frmvalidator.addValidation("stockin_code","req","Please Enter STOCKIN_CODE");

	frmvalidator.addValidation("stockin_code","alnum_s","Please Enter alphabatic");

	</script>