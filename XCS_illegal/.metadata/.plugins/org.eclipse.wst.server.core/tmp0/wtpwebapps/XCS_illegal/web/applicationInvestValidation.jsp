








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("news_value","maxlen=1","Max length for NEWS_VALUE is 1 ");

	frmvalidator.addValidation("news_value","req","Please Enter NEWS_VALUE");

	frmvalidator.addValidation("news_value","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("confidence_gauge","maxlen=1","Max length for CONFIDENCE_GAUGE is 1 ");

	frmvalidator.addValidation("confidence_gauge","req","Please Enter CONFIDENCE_GAUGE");

	frmvalidator.addValidation("confidence_gauge","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("invest_desc","maxlen=4000","Max length for INVEST_DESC is 4000 ");


	frmvalidator.addValidation("invest_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("subdistrict_code","maxlen=6","Max length for SUBDISTRICT_CODE is 6 ");


	frmvalidator.addValidation("subdistrict_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("map_desc","maxlen=2000","Max length for MAP_DESC is 2000 ");


	frmvalidator.addValidation("map_desc","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("tel","maxlen=50","Max length for TEL is 50 ");


	frmvalidator.addValidation("tel","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("zipcode","maxlen=5","Max length for ZIPCODE is 5 ");


	frmvalidator.addValidation("zipcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("district_code","maxlen=4","Max length for DISTRICT_CODE is 4 ");


	frmvalidator.addValidation("district_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("province_code","maxlen=2","Max length for PROVINCE_CODE is 2 ");


	frmvalidator.addValidation("province_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("road","maxlen=200","Max length for ROAD is 200 ");


	frmvalidator.addValidation("road","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("soi","maxlen=200","Max length for SOI is 200 ");


	frmvalidator.addValidation("soi","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("moo","maxlen=22","Max length for MOO is 22 ");


	frmvalidator.addValidation("moo","num","Please Enter number");

	
	frmvalidator.addValidation("address_no","maxlen=200","Max length for ADDRESS_NO is 200 ");


	frmvalidator.addValidation("address_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("address_name","maxlen=200","Max length for ADDRESS_NAME is 200 ");


	frmvalidator.addValidation("address_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("coordinate_y","maxlen=22","Max length for COORDINATE_Y is 22 ");


	frmvalidator.addValidation("coordinate_y","num","Please Enter number");

	
	frmvalidator.addValidation("coordinate_x","maxlen=22","Max length for COORDINATE_X is 22 ");


	frmvalidator.addValidation("coordinate_x","num","Please Enter number");

	



	

	frmvalidator.addValidation("start_date","req","Please Enter START_DATE");


	
	frmvalidator.addValidation("product_group_id","maxlen=4","Max length for PRODUCT_GROUP_ID is 4 ");


	frmvalidator.addValidation("product_group_id","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("legislation_id","maxlen=22","Max length for LEGISLATION_ID is 22 ");

	frmvalidator.addValidation("legislation_id","req","Please Enter LEGISLATION_ID");

	frmvalidator.addValidation("legislation_id","num","Please Enter number");

	
	frmvalidator.addValidation("offcode_command","maxlen=6","Max length for OFFCODE_COMMAND is 6 ");

	frmvalidator.addValidation("offcode_command","req","Please Enter OFFCODE_COMMAND");

	frmvalidator.addValidation("offcode_command","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_command","maxlen=20","Max length for POSCODE_COMMAND is 20 ");

	frmvalidator.addValidation("poscode_command","req","Please Enter POSCODE_COMMAND");

	frmvalidator.addValidation("poscode_command","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_idcardno_command","maxlen=13","Max length for STAFF_IDCARDNO_COMMAND is 13 ");

	frmvalidator.addValidation("staff_idcardno_command","req","Please Enter STAFF_IDCARDNO_COMMAND");

	frmvalidator.addValidation("staff_idcardno_command","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_invest","maxlen=6","Max length for OFFCODE_INVEST is 6 ");

	frmvalidator.addValidation("offcode_invest","req","Please Enter OFFCODE_INVEST");

	frmvalidator.addValidation("offcode_invest","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_invest","maxlen=20","Max length for POSCODE_INVEST is 20 ");

	frmvalidator.addValidation("poscode_invest","req","Please Enter POSCODE_INVEST");

	frmvalidator.addValidation("poscode_invest","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_idcardno_invest","maxlen=13","Max length for STAFF_IDCARDNO_INVEST is 13 ");

	frmvalidator.addValidation("staff_idcardno_invest","req","Please Enter STAFF_IDCARDNO_INVEST");

	frmvalidator.addValidation("staff_idcardno_invest","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("invest_no","maxlen=20","Max length for INVEST_NO is 20 ");

	frmvalidator.addValidation("invest_no","req","Please Enter INVEST_NO");

	frmvalidator.addValidation("invest_no","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("report_date","req","Please Enter REPORT_DATE");


	
	frmvalidator.addValidation("invest_qty","maxlen=22","Max length for INVEST_QTY is 22 ");

	frmvalidator.addValidation("invest_qty","req","Please Enter INVEST_QTY");

	frmvalidator.addValidation("invest_qty","num","Please Enter number");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	</script>