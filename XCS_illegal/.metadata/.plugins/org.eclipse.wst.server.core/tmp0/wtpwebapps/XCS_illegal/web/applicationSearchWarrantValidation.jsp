








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("application_notice_arrest_id","maxlen=22","Max length for APPLICATION_NOTICE_ARREST_ID is 22 ");


	frmvalidator.addValidation("application_notice_arrest_id","num","Please Enter number");

	
	frmvalidator.addValidation("result_qty_date","maxlen=22","Max length for RESULT_QTY_DATE is 22 ");


	frmvalidator.addValidation("result_qty_date","num","Please Enter number");

	
	frmvalidator.addValidation("court_order_familiar","maxlen=2000","Max length for COURT_ORDER_FAMILIAR is 2000 ");


	frmvalidator.addValidation("court_order_familiar","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_assign","maxlen=13","Max length for OFFCODE_ASSIGN is 13 ");


	frmvalidator.addValidation("offcode_assign","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_assign","maxlen=13","Max length for POSCODE_ASSIGN is 13 ");


	frmvalidator.addValidation("poscode_assign","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_assign","maxlen=13","Max length for STAFF_ID_ASSIGN is 13 ");


	frmvalidator.addValidation("staff_id_assign","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_req_for","maxlen=20","Max length for OFFCODE_REQ_FOR is 20 ");


	frmvalidator.addValidation("offcode_req_for","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_req_for","maxlen=20","Max length for POSCODE_REQ_FOR is 20 ");


	frmvalidator.addValidation("poscode_req_for","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_req_for","maxlen=13","Max length for STAFF_ID_REQ_FOR is 13 ");


	frmvalidator.addValidation("staff_id_req_for","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("tel_request","maxlen=100","Max length for TEL_REQUEST is 100 ");


	frmvalidator.addValidation("tel_request","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("career_request","maxlen=200","Max length for CAREER_REQUEST is 200 ");


	frmvalidator.addValidation("career_request","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");


	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("office_address","maxlen=500","Max length for OFFICE_ADDRESS is 500 ");


	frmvalidator.addValidation("office_address","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("search_result","maxlen=200","Max length for SEARCH_RESULT is 200 ");


	frmvalidator.addValidation("search_result","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("send_to_desc","maxlen=200","Max length for SEND_TO_DESC is 200 ");


	frmvalidator.addValidation("send_to_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("send_desc","maxlen=200","Max length for SEND_DESC is 200 ");


	frmvalidator.addValidation("send_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("court_id_arrest","maxlen=22","Max length for COURT_ID_ARREST is 22 ");


	frmvalidator.addValidation("court_id_arrest","num","Please Enter number");

	



	
	frmvalidator.addValidation("arrest_no","maxlen=250","Max length for ARREST_NO is 250 ");


	frmvalidator.addValidation("arrest_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("search_check2_2","maxlen=1","Max length for SEARCH_CHECK2_2 is 1 ");

	frmvalidator.addValidation("search_check2_2","req","Please Enter SEARCH_CHECK2_2");

	frmvalidator.addValidation("search_check2_2","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("search_check2_1","maxlen=1","Max length for SEARCH_CHECK2_1 is 1 ");

	frmvalidator.addValidation("search_check2_1","req","Please Enter SEARCH_CHECK2_1");

	frmvalidator.addValidation("search_check2_1","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("search_check2_desc","maxlen=200","Max length for SEARCH_CHECK2_DESC is 200 ");


	frmvalidator.addValidation("search_check2_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("search_check2","maxlen=1","Max length for SEARCH_CHECK2 is 1 ");

	frmvalidator.addValidation("search_check2","req","Please Enter SEARCH_CHECK2");

	frmvalidator.addValidation("search_check2","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("search_check1_3","maxlen=1","Max length for SEARCH_CHECK1_3 is 1 ");

	frmvalidator.addValidation("search_check1_3","req","Please Enter SEARCH_CHECK1_3");

	frmvalidator.addValidation("search_check1_3","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("search_check1_2","maxlen=1","Max length for SEARCH_CHECK1_2 is 1 ");

	frmvalidator.addValidation("search_check1_2","req","Please Enter SEARCH_CHECK1_2");

	frmvalidator.addValidation("search_check1_2","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("search_check1_1","maxlen=1","Max length for SEARCH_CHECK1_1 is 1 ");

	frmvalidator.addValidation("search_check1_1","req","Please Enter SEARCH_CHECK1_1");

	frmvalidator.addValidation("search_check1_1","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("search_check1_desc","maxlen=200","Max length for SEARCH_CHECK1_DESC is 200 ");


	frmvalidator.addValidation("search_check1_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("search_check1","maxlen=1","Max length for SEARCH_CHECK1 is 1 ");

	frmvalidator.addValidation("search_check1","req","Please Enter SEARCH_CHECK1");

	frmvalidator.addValidation("search_check1","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("jedge_name","maxlen=50","Max length for JEDGE_NAME is 50 ");


	frmvalidator.addValidation("jedge_name","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("warrant_no","maxlen=15","Max length for WARRANT_NO is 15 ");


	frmvalidator.addValidation("warrant_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("remarks_nonapprove","maxlen=200","Max length for REMARKS_NONAPPROVE is 200 ");


	frmvalidator.addValidation("remarks_nonapprove","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("isapprove","maxlen=1","Max length for ISAPPROVE is 1 ");

	frmvalidator.addValidation("isapprove","req","Please Enter ISAPPROVE");

	frmvalidator.addValidation("isapprove","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("iscopy","maxlen=200","Max length for ISCOPY is 200 ");


	frmvalidator.addValidation("iscopy","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("isallow","maxlen=1","Max length for ISALLOW is 1 ");


	frmvalidator.addValidation("isallow","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("court_order","maxlen=200","Max length for COURT_ORDER is 200 ");


	frmvalidator.addValidation("court_order","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("witness_qty","maxlen=22","Max length for WITNESS_QTY is 22 ");


	frmvalidator.addValidation("witness_qty","num","Please Enter number");

	



	
	frmvalidator.addValidation("cause_familiar","maxlen=200","Max length for CAUSE_FAMILIAR is 200 ");


	frmvalidator.addValidation("cause_familiar","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("court_id_familiar","maxlen=22","Max length for COURT_ID_FAMILIAR is 22 ");


	frmvalidator.addValidation("court_id_familiar","num","Please Enter number");

	
	frmvalidator.addValidation("request_familiar","maxlen=1","Max length for REQUEST_FAMILIAR is 1 ");

	frmvalidator.addValidation("request_familiar","req","Please Enter REQUEST_FAMILIAR");

	frmvalidator.addValidation("request_familiar","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("province_code","maxlen=2","Max length for PROVINCE_CODE is 2 ");


	frmvalidator.addValidation("province_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("district_code","maxlen=4","Max length for DISTRICT_CODE is 4 ");


	frmvalidator.addValidation("district_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("subdistrict_code","maxlen=6","Max length for SUBDISTRICT_CODE is 6 ");


	frmvalidator.addValidation("subdistrict_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("moo","maxlen=22","Max length for MOO is 22 ");


	frmvalidator.addValidation("moo","num","Please Enter number");

	
	frmvalidator.addValidation("soi","maxlen=100","Max length for SOI is 100 ");


	frmvalidator.addValidation("soi","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("address_name","maxlen=100","Max length for ADDRESS_NAME is 100 ");


	frmvalidator.addValidation("address_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("address_no","maxlen=100","Max length for ADDRESS_NO is 100 ");


	frmvalidator.addValidation("address_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("road","maxlen=100","Max length for ROAD is 100 ");


	frmvalidator.addValidation("road","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("owner_position","maxlen=100","Max length for OWNER_POSITION is 100 ");


	frmvalidator.addValidation("owner_position","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("owner_career","maxlen=100","Max length for OWNER_CAREER is 100 ");


	frmvalidator.addValidation("owner_career","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("owner_age","maxlen=22","Max length for OWNER_AGE is 22 ");


	frmvalidator.addValidation("owner_age","num","Please Enter number");

	
	frmvalidator.addValidation("owner_name","maxlen=100","Max length for OWNER_NAME is 100 ");


	frmvalidator.addValidation("owner_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("req_check5","maxlen=1","Max length for REQ_CHECK5 is 1 ");

	frmvalidator.addValidation("req_check5","req","Please Enter REQ_CHECK5");

	frmvalidator.addValidation("req_check5","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("req_check4","maxlen=1","Max length for REQ_CHECK4 is 1 ");

	frmvalidator.addValidation("req_check4","req","Please Enter REQ_CHECK4");

	frmvalidator.addValidation("req_check4","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("req_check3","maxlen=1","Max length for REQ_CHECK3 is 1 ");

	frmvalidator.addValidation("req_check3","req","Please Enter REQ_CHECK3");

	frmvalidator.addValidation("req_check3","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("req_check2","maxlen=1","Max length for REQ_CHECK2 is 1 ");

	frmvalidator.addValidation("req_check2","req","Please Enter REQ_CHECK2");

	frmvalidator.addValidation("req_check2","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("req_check1","maxlen=1","Max length for REQ_CHECK1 is 1 ");

	frmvalidator.addValidation("req_check1","req","Please Enter REQ_CHECK1");

	frmvalidator.addValidation("req_check1","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("search_cause","maxlen=200","Max length for SEARCH_CAUSE is 200 ");

	frmvalidator.addValidation("search_cause","req","Please Enter SEARCH_CAUSE");

	frmvalidator.addValidation("search_cause","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("chk_continue","maxlen=1","Max length for CHK_CONTINUE is 1 ");

	frmvalidator.addValidation("chk_continue","req","Please Enter CHK_CONTINUE");

	frmvalidator.addValidation("chk_continue","alnum_s","Please Enter alphabatic");

	



	

	frmvalidator.addValidation("search_datefrom","req","Please Enter SEARCH_DATEFROM");


	
	frmvalidator.addValidation("court_id","maxlen=22","Max length for COURT_ID is 22 ");

	frmvalidator.addValidation("court_id","req","Please Enter COURT_ID");

	frmvalidator.addValidation("court_id","num","Please Enter number");

	
	frmvalidator.addValidation("age_request","maxlen=22","Max length for AGE_REQUEST is 22 ");

	frmvalidator.addValidation("age_request","req","Please Enter AGE_REQUEST");

	frmvalidator.addValidation("age_request","num","Please Enter number");

	
	frmvalidator.addValidation("offcode_request","maxlen=6","Max length for OFFCODE_REQUEST is 6 ");

	frmvalidator.addValidation("offcode_request","req","Please Enter OFFCODE_REQUEST");

	frmvalidator.addValidation("offcode_request","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_request","maxlen=20","Max length for POSCODE_REQUEST is 20 ");

	frmvalidator.addValidation("poscode_request","req","Please Enter POSCODE_REQUEST");

	frmvalidator.addValidation("poscode_request","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_request","maxlen=13","Max length for STAFF_ID_REQUEST is 13 ");

	frmvalidator.addValidation("staff_id_request","req","Please Enter STAFF_ID_REQUEST");

	frmvalidator.addValidation("staff_id_request","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("request_date","req","Please Enter REQUEST_DATE");


	
	frmvalidator.addValidation("request_no","maxlen=20","Max length for REQUEST_NO is 20 ");


	frmvalidator.addValidation("request_no","alnum_s","Please Enter alphabatic");

	</script>