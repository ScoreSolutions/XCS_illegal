








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("isfingerapprove","maxlen=1","Max length for ISFINGERAPPROVE is 1 ");


	frmvalidator.addValidation("isfingerapprove","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_type","maxlen=1","Max length for INFORM_TYPE is 1 ");


	frmvalidator.addValidation("inform_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("del_flag","maxlen=1","Max length for DEL_FLAG is 1 ");


	frmvalidator.addValidation("del_flag","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("isreward_pay","maxlen=1","Max length for ISREWARD_PAY is 1 ");

	frmvalidator.addValidation("isreward_pay","req","Please Enter ISREWARD_PAY");

	frmvalidator.addValidation("isreward_pay","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("ismanage","maxlen=1","Max length for ISMANAGE is 1 ");

	frmvalidator.addValidation("ismanage","req","Please Enter ISMANAGE");

	frmvalidator.addValidation("ismanage","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("notice_result","maxlen=1","Max length for NOTICE_RESULT is 1 ");


	frmvalidator.addValidation("notice_result","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("remarks","maxlen=500","Max length for REMARKS is 500 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("next_step","maxlen=100","Max length for NEXT_STEP is 100 ");

	frmvalidator.addValidation("next_step","req","Please Enter NEXT_STEP");

	frmvalidator.addValidation("next_step","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_commander","maxlen=6","Max length for OFFCODE_COMMANDER is 6 ");

	frmvalidator.addValidation("offcode_commander","req","Please Enter OFFCODE_COMMANDER");

	frmvalidator.addValidation("offcode_commander","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_commander","maxlen=20","Max length for POSCODE_COMMANDER is 20 ");

	frmvalidator.addValidation("poscode_commander","req","Please Enter POSCODE_COMMANDER");

	frmvalidator.addValidation("poscode_commander","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_commander","maxlen=13","Max length for STAFF_ID_COMMANDER is 13 ");

	frmvalidator.addValidation("staff_id_commander","req","Please Enter STAFF_ID_COMMANDER");

	frmvalidator.addValidation("staff_id_commander","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_accept","maxlen=13","Max length for STAFF_ID_ACCEPT is 13 ");

	frmvalidator.addValidation("staff_id_accept","req","Please Enter STAFF_ID_ACCEPT");

	frmvalidator.addValidation("staff_id_accept","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_surety","maxlen=6","Max length for OFFCODE_SURETY is 6 ");


	frmvalidator.addValidation("offcode_surety","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_surety","maxlen=20","Max length for POSCODE_SURETY is 20 ");


	frmvalidator.addValidation("poscode_surety","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_surety","maxlen=13","Max length for STAFF_ID_SURETY is 13 ");


	frmvalidator.addValidation("staff_id_surety","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_receive","maxlen=6","Max length for OFFCODE_RECEIVE is 6 ");

	frmvalidator.addValidation("offcode_receive","req","Please Enter OFFCODE_RECEIVE");

	frmvalidator.addValidation("offcode_receive","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_receive","maxlen=20","Max length for POSCODE_RECEIVE is 20 ");

	frmvalidator.addValidation("poscode_receive","req","Please Enter POSCODE_RECEIVE");

	frmvalidator.addValidation("poscode_receive","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_receive","maxlen=13","Max length for STAFF_ID_RECEIVE is 13 ");

	frmvalidator.addValidation("staff_id_receive","req","Please Enter STAFF_ID_RECEIVE");

	frmvalidator.addValidation("staff_id_receive","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("hiding_place","maxlen=100","Max length for HIDING_PLACE is 100 ");


	frmvalidator.addValidation("hiding_place","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("vehicle_particular","maxlen=100","Max length for VEHICLE_PARTICULAR is 100 ");


	frmvalidator.addValidation("vehicle_particular","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_province_code","maxlen=2","Max length for LAWBREAKER_PROVINCE_CODE is 2 ");


	frmvalidator.addValidation("lawbreaker_province_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_district_code","maxlen=4","Max length for LAWBREAKER_DISTRICT_CODE is 4 ");


	frmvalidator.addValidation("lawbreaker_district_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_subdistrict_code","maxlen=6","Max length for LAWBREAKER_SUBDISTRICT_CODE is 6 ");


	frmvalidator.addValidation("lawbreaker_subdistrict_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_moo","maxlen=50","Max length for LAWBREAKER_MOO is 50 ");


	frmvalidator.addValidation("lawbreaker_moo","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_road","maxlen=200","Max length for LAWBREAKER_ROAD is 200 ");


	frmvalidator.addValidation("lawbreaker_road","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_soi","maxlen=200","Max length for LAWBREAKER_SOI is 200 ");


	frmvalidator.addValidation("lawbreaker_soi","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_address_name","maxlen=200","Max length for LAWBREAKER_ADDRESS_NAME is 200 ");


	frmvalidator.addValidation("lawbreaker_address_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_address","maxlen=100","Max length for LAWBREAKER_ADDRESS is 100 ");


	frmvalidator.addValidation("lawbreaker_address","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("secret_level","maxlen=1","Max length for SECRET_LEVEL is 1 ");


	frmvalidator.addValidation("secret_level","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("arrest_desc","maxlen=200","Max length for ARREST_DESC is 200 ");


	frmvalidator.addValidation("arrest_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_province_code","maxlen=2","Max length for INFORM_PROVINCE_CODE is 2 ");


	frmvalidator.addValidation("inform_province_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_district_code","maxlen=4","Max length for INFORM_DISTRICT_CODE is 4 ");


	frmvalidator.addValidation("inform_district_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_subdistrict_code","maxlen=6","Max length for INFORM_SUBDISTRICT_CODE is 6 ");


	frmvalidator.addValidation("inform_subdistrict_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_moo","maxlen=50","Max length for INFORM_MOO is 50 ");


	frmvalidator.addValidation("inform_moo","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_road","maxlen=200","Max length for INFORM_ROAD is 200 ");


	frmvalidator.addValidation("inform_road","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_soi","maxlen=200","Max length for INFORM_SOI is 200 ");


	frmvalidator.addValidation("inform_soi","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_address_name","maxlen=200","Max length for INFORM_ADDRESS_NAME is 200 ");


	frmvalidator.addValidation("inform_address_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_address","maxlen=100","Max length for INFORM_ADDRESS is 100 ");


	frmvalidator.addValidation("inform_address","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inform_age","maxlen=22","Max length for INFORM_AGE is 22 ");


	frmvalidator.addValidation("inform_age","num","Please Enter number");

	
	frmvalidator.addValidation("inform_name","maxlen=200","Max length for INFORM_NAME is 200 ");

	frmvalidator.addValidation("inform_name","req","Please Enter INFORM_NAME");

	frmvalidator.addValidation("inform_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_no","maxlen=22","Max length for LAWBREAKER_NO is 22 ");


	frmvalidator.addValidation("lawbreaker_no","num","Please Enter number");

	



	
	frmvalidator.addValidation("duty_code","maxlen=4","Max length for DUTY_CODE is 4 ");


	frmvalidator.addValidation("duty_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("legislation_id","maxlen=22","Max length for LEGISLATION_ID is 22 ");

	frmvalidator.addValidation("legislation_id","req","Please Enter LEGISLATION_ID");

	frmvalidator.addValidation("legislation_id","num","Please Enter number");

	
	frmvalidator.addValidation("offname","maxlen=100","Max length for OFFNAME is 100 ");

	frmvalidator.addValidation("offname","req","Please Enter OFFNAME");

	frmvalidator.addValidation("offname","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("notice_date","req","Please Enter NOTICE_DATE");


	
	frmvalidator.addValidation("notice_no","maxlen=20","Max length for NOTICE_NO is 20 ");

	frmvalidator.addValidation("notice_no","req","Please Enter NOTICE_NO");

	frmvalidator.addValidation("notice_no","alnum_s","Please Enter alphabatic");

	</script>