








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("idcardno","maxlen=13","Max length for IDCARDNO is 13 ");


	frmvalidator.addValidation("idcardno","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("email","maxlen=100","Max length for EMAIL is 100 ");


	frmvalidator.addValidation("email","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("tel","maxlen=100","Max length for TEL is 100 ");


	frmvalidator.addValidation("tel","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("hometown_post_code","maxlen=5","Max length for HOMETOWN_POST_CODE is 5 ");


	frmvalidator.addValidation("hometown_post_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("hometown_province_code","maxlen=2","Max length for HOMETOWN_PROVINCE_CODE is 2 ");


	frmvalidator.addValidation("hometown_province_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("hometown_district_code","maxlen=4","Max length for HOMETOWN_DISTRICT_CODE is 4 ");


	frmvalidator.addValidation("hometown_district_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("hometown_subdistrict_code","maxlen=6","Max length for HOMETOWN_SUBDISTRICT_CODE is 6 ");


	frmvalidator.addValidation("hometown_subdistrict_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("hometown_road","maxlen=100","Max length for HOMETOWN_ROAD is 100 ");


	frmvalidator.addValidation("hometown_road","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("hometown_soi","maxlen=100","Max length for HOMETOWN_SOI is 100 ");


	frmvalidator.addValidation("hometown_soi","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("hometown_moo","maxlen=22","Max length for HOMETOWN_MOO is 22 ");


	frmvalidator.addValidation("hometown_moo","num","Please Enter number");

	
	frmvalidator.addValidation("hometown_address_no","maxlen=100","Max length for HOMETOWN_ADDRESS_NO is 100 ");


	frmvalidator.addValidation("hometown_address_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("current_post_code","maxlen=5","Max length for CURRENT_POST_CODE is 5 ");


	frmvalidator.addValidation("current_post_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("current_province_code","maxlen=2","Max length for CURRENT_PROVINCE_CODE is 2 ");


	frmvalidator.addValidation("current_province_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("current_district_code","maxlen=4","Max length for CURRENT_DISTRICT_CODE is 4 ");


	frmvalidator.addValidation("current_district_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("current_subdistrict_code","maxlen=6","Max length for CURRENT_SUBDISTRICT_CODE is 6 ");


	frmvalidator.addValidation("current_subdistrict_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("current_road","maxlen=100","Max length for CURRENT_ROAD is 100 ");


	frmvalidator.addValidation("current_road","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("current_soi","maxlen=100","Max length for CURRENT_SOI is 100 ");


	frmvalidator.addValidation("current_soi","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("current_moo","maxlen=22","Max length for CURRENT_MOO is 22 ");


	frmvalidator.addValidation("current_moo","num","Please Enter number");

	
	frmvalidator.addValidation("current_address_no","maxlen=100","Max length for CURRENT_ADDRESS_NO is 100 ");


	frmvalidator.addValidation("current_address_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("relation","maxlen=22","Max length for RELATION is 22 ");

	frmvalidator.addValidation("relation","req","Please Enter RELATION");

	frmvalidator.addValidation("relation","num","Please Enter number");

	
	frmvalidator.addValidation("last_name","maxlen=100","Max length for LAST_NAME is 100 ");


	frmvalidator.addValidation("last_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("first_name","maxlen=100","Max length for FIRST_NAME is 100 ");

	frmvalidator.addValidation("first_name","req","Please Enter FIRST_NAME");

	frmvalidator.addValidation("first_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("title_code","maxlen=4","Max length for TITLE_CODE is 4 ");


	frmvalidator.addValidation("title_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_no","maxlen=22","Max length for LAWBREAKER_NO is 22 ");


	frmvalidator.addValidation("lawbreaker_no","num","Please Enter number");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	</script>