








 

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

	
	frmvalidator.addValidation("compare_reason","maxlen=4000","Max length for COMPARE_REASON is 4000 ");


	frmvalidator.addValidation("compare_reason","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("mistake_detail","maxlen=4000","Max length for MISTAKE_DETAIL is 4000 ");


	frmvalidator.addValidation("mistake_detail","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("islawbreakerrent","maxlen=1","Max length for ISLAWBREAKERRENT is 1 ");

	frmvalidator.addValidation("islawbreakerrent","req","Please Enter ISLAWBREAKERRENT");

	frmvalidator.addValidation("islawbreakerrent","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("contract_no","maxlen=100","Max length for CONTRACT_NO is 100 ");


	frmvalidator.addValidation("contract_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("contract","maxlen=100","Max length for CONTRACT is 100 ");


	frmvalidator.addValidation("contract","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("rent_name","maxlen=200","Max length for RENT_NAME is 200 ");


	frmvalidator.addValidation("rent_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("ownership","maxlen=200","Max length for OWNERSHIP is 200 ");


	frmvalidator.addValidation("ownership","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("hold_ship","maxlen=22","Max length for HOLD_SHIP is 22 ");


	frmvalidator.addValidation("hold_ship","num","Please Enter number");

	
	frmvalidator.addValidation("body_no","maxlen=100","Max length for BODY_NO is 100 ");


	frmvalidator.addValidation("body_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("engine_no","maxlen=100","Max length for ENGINE_NO is 100 ");


	frmvalidator.addValidation("engine_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("vehicle_name","maxlen=100","Max length for VEHICLE_NAME is 100 ");


	frmvalidator.addValidation("vehicle_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("compare_case_id","maxlen=22","Max length for COMPARE_CASE_ID is 22 ");

	frmvalidator.addValidation("compare_case_id","req","Please Enter COMPARE_CASE_ID");

	frmvalidator.addValidation("compare_case_id","num","Please Enter number");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("req_date","req","Please Enter REQ_DATE");


	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	</script>