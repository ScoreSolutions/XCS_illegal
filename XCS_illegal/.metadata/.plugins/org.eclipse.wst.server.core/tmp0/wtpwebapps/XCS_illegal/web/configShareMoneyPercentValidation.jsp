








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("type_code","maxlen=2","Max length for TYPE_CODE is 2 ");


	frmvalidator.addValidation("type_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_code","maxlen=4","Max length for DUTY_CODE is 4 ");


	frmvalidator.addValidation("duty_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("penalty_case_law_id","maxlen=100","Max length for PENALTY_CASE_LAW_ID is 100 ");


	frmvalidator.addValidation("penalty_case_law_id","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("reward_limit","maxlen=22","Max length for REWARD_LIMIT is 22 ");

	frmvalidator.addValidation("reward_limit","req","Please Enter REWARD_LIMIT");

	frmvalidator.addValidation("reward_limit","num","Please Enter number");

	
	frmvalidator.addValidation("bribe_limit","maxlen=22","Max length for BRIBE_LIMIT is 22 ");

	frmvalidator.addValidation("bribe_limit","req","Please Enter BRIBE_LIMIT");

	frmvalidator.addValidation("bribe_limit","num","Please Enter number");

	
	frmvalidator.addValidation("treasury","maxlen=22","Max length for TREASURY is 22 ");

	frmvalidator.addValidation("treasury","req","Please Enter TREASURY");

	frmvalidator.addValidation("treasury","num","Please Enter number");

	
	frmvalidator.addValidation("reward","maxlen=22","Max length for REWARD is 22 ");

	frmvalidator.addValidation("reward","req","Please Enter REWARD");

	frmvalidator.addValidation("reward","num","Please Enter number");

	
	frmvalidator.addValidation("bribe","maxlen=22","Max length for BRIBE is 22 ");

	frmvalidator.addValidation("bribe","req","Please Enter BRIBE");

	frmvalidator.addValidation("bribe","num","Please Enter number");

	
	frmvalidator.addValidation("isnotice","maxlen=1","Max length for ISNOTICE is 1 ");

	frmvalidator.addValidation("isnotice","req","Please Enter ISNOTICE");

	frmvalidator.addValidation("isnotice","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("legislation_id","maxlen=22","Max length for LEGISLATION_ID is 22 ");

	frmvalidator.addValidation("legislation_id","req","Please Enter LEGISLATION_ID");

	frmvalidator.addValidation("legislation_id","num","Please Enter number");

	</script>