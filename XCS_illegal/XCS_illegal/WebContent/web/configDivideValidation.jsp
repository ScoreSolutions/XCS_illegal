








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("remarks","maxlen=200","Max length for REMARKS is 200 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("share_qty","maxlen=22","Max length for SHARE_QTY is 22 ");

	frmvalidator.addValidation("share_qty","req","Please Enter SHARE_QTY");

	frmvalidator.addValidation("share_qty","num","Please Enter number");

	
	frmvalidator.addValidation("ref_value","maxlen=100","Max length for REF_VALUE is 100 ");


	frmvalidator.addValidation("ref_value","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("ref_table","maxlen=30","Max length for REF_TABLE is 30 ");


	frmvalidator.addValidation("ref_table","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_status05","maxlen=1","Max length for DUTY_STATUS05 is 1 ");

	frmvalidator.addValidation("duty_status05","req","Please Enter DUTY_STATUS05");

	frmvalidator.addValidation("duty_status05","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_status04","maxlen=1","Max length for DUTY_STATUS04 is 1 ");

	frmvalidator.addValidation("duty_status04","req","Please Enter DUTY_STATUS04");

	frmvalidator.addValidation("duty_status04","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_status03","maxlen=1","Max length for DUTY_STATUS03 is 1 ");

	frmvalidator.addValidation("duty_status03","req","Please Enter DUTY_STATUS03");

	frmvalidator.addValidation("duty_status03","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_status02","maxlen=1","Max length for DUTY_STATUS02 is 1 ");

	frmvalidator.addValidation("duty_status02","req","Please Enter DUTY_STATUS02");

	frmvalidator.addValidation("duty_status02","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_status01","maxlen=1","Max length for DUTY_STATUS01 is 1 ");

	frmvalidator.addValidation("duty_status01","req","Please Enter DUTY_STATUS01");

	frmvalidator.addValidation("duty_status01","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("proportion","maxlen=20","Max length for PROPORTION is 20 ");

	frmvalidator.addValidation("proportion","req","Please Enter PROPORTION");

	frmvalidator.addValidation("proportion","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("bribe_reward","maxlen=1","Max length for BRIBE_REWARD is 1 ");

	frmvalidator.addValidation("bribe_reward","req","Please Enter BRIBE_REWARD");

	frmvalidator.addValidation("bribe_reward","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("legislation_id","maxlen=22","Max length for LEGISLATION_ID is 22 ");

	frmvalidator.addValidation("legislation_id","req","Please Enter LEGISLATION_ID");

	frmvalidator.addValidation("legislation_id","num","Please Enter number");

	</script>