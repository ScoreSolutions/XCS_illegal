








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("duty_status_id","maxlen=22","Max length for DUTY_STATUS_ID is 22 ");

	frmvalidator.addValidation("duty_status_id","req","Please Enter DUTY_STATUS_ID");

	frmvalidator.addValidation("duty_status_id","num","Please Enter number");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("duty_status05_money","maxlen=22","Max length for DUTY_STATUS05_MONEY is 22 ");

	frmvalidator.addValidation("duty_status05_money","req","Please Enter DUTY_STATUS05_MONEY");

	frmvalidator.addValidation("duty_status05_money","num","Please Enter number");

	
	frmvalidator.addValidation("duty_status04_money","maxlen=22","Max length for DUTY_STATUS04_MONEY is 22 ");

	frmvalidator.addValidation("duty_status04_money","req","Please Enter DUTY_STATUS04_MONEY");

	frmvalidator.addValidation("duty_status04_money","num","Please Enter number");

	
	frmvalidator.addValidation("duty_status03_money","maxlen=22","Max length for DUTY_STATUS03_MONEY is 22 ");

	frmvalidator.addValidation("duty_status03_money","req","Please Enter DUTY_STATUS03_MONEY");

	frmvalidator.addValidation("duty_status03_money","num","Please Enter number");

	
	frmvalidator.addValidation("duty_status02_money","maxlen=22","Max length for DUTY_STATUS02_MONEY is 22 ");

	frmvalidator.addValidation("duty_status02_money","req","Please Enter DUTY_STATUS02_MONEY");

	frmvalidator.addValidation("duty_status02_money","num","Please Enter number");

	
	frmvalidator.addValidation("duty_status01_money","maxlen=22","Max length for DUTY_STATUS01_MONEY is 22 ");

	frmvalidator.addValidation("duty_status01_money","req","Please Enter DUTY_STATUS01_MONEY");

	frmvalidator.addValidation("duty_status01_money","num","Please Enter number");

	
	frmvalidator.addValidation("staff_level","maxlen=50","Max length for STAFF_LEVEL is 50 ");


	frmvalidator.addValidation("staff_level","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("position_name","maxlen=100","Max length for POSITION_NAME is 100 ");

	frmvalidator.addValidation("position_name","req","Please Enter POSITION_NAME");

	frmvalidator.addValidation("position_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("last_name","maxlen=100","Max length for LAST_NAME is 100 ");


	frmvalidator.addValidation("last_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("first_name","maxlen=100","Max length for FIRST_NAME is 100 ");

	frmvalidator.addValidation("first_name","req","Please Enter FIRST_NAME");

	frmvalidator.addValidation("first_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("title_code","maxlen=4","Max length for TITLE_CODE is 4 ");


	frmvalidator.addValidation("title_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("order_seq","maxlen=22","Max length for ORDER_SEQ is 22 ");

	frmvalidator.addValidation("order_seq","req","Please Enter ORDER_SEQ");

	frmvalidator.addValidation("order_seq","num","Please Enter number");

	
	frmvalidator.addValidation("reward_divide_id","maxlen=22","Max length for REWARD_DIVIDE_ID is 22 ");

	frmvalidator.addValidation("reward_divide_id","req","Please Enter REWARD_DIVIDE_ID");

	frmvalidator.addValidation("reward_divide_id","num","Please Enter number");

	</script>