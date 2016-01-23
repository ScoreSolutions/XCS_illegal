








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("offname","maxlen=200","Max length for OFFNAME is 200 ");


	frmvalidator.addValidation("offname","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");


	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("detect_result","maxlen=4000","Max length for DETECT_RESULT is 4000 ");


	frmvalidator.addValidation("detect_result","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("store_by","maxlen=200","Max length for STORE_BY is 200 ");


	frmvalidator.addValidation("store_by","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("store_place","maxlen=200","Max length for STORE_PLACE is 200 ");


	frmvalidator.addValidation("store_place","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("owner_by","maxlen=200","Max length for OWNER_BY is 200 ");


	frmvalidator.addValidation("owner_by","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("owner_name","maxlen=200","Max length for OWNER_NAME is 200 ");


	frmvalidator.addValidation("owner_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("tel","maxlen=100","Max length for TEL is 100 ");


	frmvalidator.addValidation("tel","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("zipcode","maxlen=5","Max length for ZIPCODE is 5 ");


	frmvalidator.addValidation("zipcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("subdistrict_code","maxlen=6","Max length for SUBDISTRICT_CODE is 6 ");


	frmvalidator.addValidation("subdistrict_code","alnum_s","Please Enter alphabatic");

	
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

	
	frmvalidator.addValidation("offcode_detect","maxlen=6","Max length for OFFCODE_DETECT is 6 ");

	frmvalidator.addValidation("offcode_detect","req","Please Enter OFFCODE_DETECT");

	frmvalidator.addValidation("offcode_detect","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_detect","maxlen=20","Max length for POSCODE_DETECT is 20 ");

	frmvalidator.addValidation("poscode_detect","req","Please Enter POSCODE_DETECT");

	frmvalidator.addValidation("poscode_detect","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_idcardno_detect","maxlen=13","Max length for STAFF_IDCARDNO_DETECT is 13 ");

	frmvalidator.addValidation("staff_idcardno_detect","req","Please Enter STAFF_IDCARDNO_DETECT");

	frmvalidator.addValidation("staff_idcardno_detect","alnum_s","Please Enter alphabatic");

	



	

	frmvalidator.addValidation("detect_date","req","Please Enter DETECT_DATE");


	

	frmvalidator.addValidation("input_date","req","Please Enter INPUT_DATE");


	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	</script>