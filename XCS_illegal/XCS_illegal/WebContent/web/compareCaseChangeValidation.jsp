








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("cancel_by","maxlen=13","Max length for CANCEL_BY is 13 ");


	frmvalidator.addValidation("cancel_by","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("iscancel","maxlen=1","Max length for ISCANCEL is 1 ");

	frmvalidator.addValidation("iscancel","req","Please Enter ISCANCEL");

	frmvalidator.addValidation("iscancel","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("treasury_money_old","maxlen=22","Max length for TREASURY_MONEY_OLD is 22 ");

	frmvalidator.addValidation("treasury_money_old","req","Please Enter TREASURY_MONEY_OLD");

	frmvalidator.addValidation("treasury_money_old","num","Please Enter number");

	
	frmvalidator.addValidation("reward_money_old","maxlen=22","Max length for REWARD_MONEY_OLD is 22 ");

	frmvalidator.addValidation("reward_money_old","req","Please Enter REWARD_MONEY_OLD");

	frmvalidator.addValidation("reward_money_old","num","Please Enter number");

	
	frmvalidator.addValidation("bribe_money_old","maxlen=22","Max length for BRIBE_MONEY_OLD is 22 ");

	frmvalidator.addValidation("bribe_money_old","req","Please Enter BRIBE_MONEY_OLD");

	frmvalidator.addValidation("bribe_money_old","num","Please Enter number");

	
	frmvalidator.addValidation("case_fine_old","maxlen=22","Max length for CASE_FINE_OLD is 22 ");

	frmvalidator.addValidation("case_fine_old","req","Please Enter CASE_FINE_OLD");

	frmvalidator.addValidation("case_fine_old","num","Please Enter number");

	
	frmvalidator.addValidation("change_reason","maxlen=2000","Max length for CHANGE_REASON is 2000 ");


	frmvalidator.addValidation("change_reason","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inv_type","maxlen=1","Max length for INV_TYPE is 1 ");

	frmvalidator.addValidation("inv_type","req","Please Enter INV_TYPE");

	frmvalidator.addValidation("inv_type","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("change_date","req","Please Enter CHANGE_DATE");


	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("change_money","maxlen=22","Max length for CHANGE_MONEY is 22 ");

	frmvalidator.addValidation("change_money","req","Please Enter CHANGE_MONEY");

	frmvalidator.addValidation("change_money","num","Please Enter number");

	
	frmvalidator.addValidation("change_type","maxlen=1","Max length for CHANGE_TYPE is 1 ");

	frmvalidator.addValidation("change_type","req","Please Enter CHANGE_TYPE");

	frmvalidator.addValidation("change_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("compare_case_id","maxlen=22","Max length for COMPARE_CASE_ID is 22 ");

	frmvalidator.addValidation("compare_case_id","req","Please Enter COMPARE_CASE_ID");

	frmvalidator.addValidation("compare_case_id","num","Please Enter number");

	</script>