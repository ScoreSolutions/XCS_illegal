








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("description","maxlen=2000","Max length for DESCRIPTION is 2000 ");


	frmvalidator.addValidation("description","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("mobile","maxlen=50","Max length for MOBILE is 50 ");


	frmvalidator.addValidation("mobile","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("license_no","maxlen=20","Max length for LICENSE_NO is 20 ");


	frmvalidator.addValidation("license_no","alnum_s","Please Enter alphabatic");

	



	



	
	frmvalidator.addValidation("photo_desc","maxlen=200","Max length for PHOTO_DESC is 200 ");


	frmvalidator.addValidation("photo_desc","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("company_name","maxlen=200","Max length for COMPANY_NAME is 200 ");


	frmvalidator.addValidation("company_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("title_code_company","maxlen=4","Max length for TITLE_CODE_COMPANY is 4 ");


	frmvalidator.addValidation("title_code_company","alnum_s","Please Enter alphabatic");

	



	



	
	frmvalidator.addValidation("visa_type","maxlen=1","Max length for VISA_TYPE is 1 ");


	frmvalidator.addValidation("visa_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("passport_country","maxlen=4","Max length for PASSPORT_COUNTRY is 4 ");


	frmvalidator.addValidation("passport_country","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("country_code","maxlen=4","Max length for COUNTRY_CODE is 4 ");


	frmvalidator.addValidation("country_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("del_flag","maxlen=1","Max length for DEL_FLAG is 1 ");

	frmvalidator.addValidation("del_flag","req","Please Enter DEL_FLAG");

	frmvalidator.addValidation("del_flag","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("coordinate_y","maxlen=22","Max length for COORDINATE_Y is 22 ");


	frmvalidator.addValidation("coordinate_y","num","Please Enter number");

	
	frmvalidator.addValidation("coordinate_x","maxlen=22","Max length for COORDINATE_X is 22 ");


	frmvalidator.addValidation("coordinate_x","num","Please Enter number");

	
	frmvalidator.addValidation("address_name","maxlen=300","Max length for ADDRESS_NAME is 300 ");


	frmvalidator.addValidation("address_name","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("modify_id","maxlen=22","Max length for MODIFY_ID is 22 ");


	frmvalidator.addValidation("modify_id","num","Please Enter number");

	

	frmvalidator.addValidation("create_date","req","Please Enter CREATE_DATE");


	
	frmvalidator.addValidation("create_id","maxlen=22","Max length for CREATE_ID is 22 ");

	frmvalidator.addValidation("create_id","req","Please Enter CREATE_ID");

	frmvalidator.addValidation("create_id","num","Please Enter number");

	
	frmvalidator.addValidation("remarks","maxlen=800","Max length for REMARKS is 800 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("corporation_code","maxlen=20","Max length for CORPORATION_CODE is 20 ");


	frmvalidator.addValidation("corporation_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("excise_reg_no","maxlen=20","Max length for EXCISE_REG_NO is 20 ");


	frmvalidator.addValidation("excise_reg_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("tax_id_no","maxlen=20","Max length for TAX_ID_NO is 20 ");


	frmvalidator.addValidation("tax_id_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("email","maxlen=100","Max length for EMAIL is 100 ");


	frmvalidator.addValidation("email","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("tel","maxlen=100","Max length for TEL is 100 ");


	frmvalidator.addValidation("tel","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("post_code","maxlen=5","Max length for POST_CODE is 5 ");


	frmvalidator.addValidation("post_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("province_code","maxlen=2","Max length for PROVINCE_CODE is 2 ");


	frmvalidator.addValidation("province_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("district_code","maxlen=4","Max length for DISTRICT_CODE is 4 ");


	frmvalidator.addValidation("district_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("subdistrict_code","maxlen=6","Max length for SUBDISTRICT_CODE is 6 ");


	frmvalidator.addValidation("subdistrict_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("road","maxlen=100","Max length for ROAD is 100 ");


	frmvalidator.addValidation("road","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("soi","maxlen=100","Max length for SOI is 100 ");


	frmvalidator.addValidation("soi","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("moo","maxlen=22","Max length for MOO is 22 ");


	frmvalidator.addValidation("moo","num","Please Enter number");

	
	frmvalidator.addValidation("address_no","maxlen=300","Max length for ADDRESS_NO is 300 ");


	frmvalidator.addValidation("address_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("career","maxlen=100","Max length for CAREER is 100 ");


	frmvalidator.addValidation("career","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("nation_id","maxlen=22","Max length for NATION_ID is 22 ");


	frmvalidator.addValidation("nation_id","num","Please Enter number");

	
	frmvalidator.addValidation("race_id","maxlen=22","Max length for RACE_ID is 22 ");


	frmvalidator.addValidation("race_id","num","Please Enter number");

	
	frmvalidator.addValidation("religion_id","maxlen=22","Max length for RELIGION_ID is 22 ");


	frmvalidator.addValidation("religion_id","num","Please Enter number");

	
	frmvalidator.addValidation("blood_type","maxlen=2","Max length for BLOOD_TYPE is 2 ");


	frmvalidator.addValidation("blood_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("marital_status","maxlen=1","Max length for MARITAL_STATUS is 1 ");


	frmvalidator.addValidation("marital_status","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("sex","maxlen=1","Max length for SEX is 1 ");


	frmvalidator.addValidation("sex","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("height","maxlen=6","Max length for HEIGHT is 6 ");


	frmvalidator.addValidation("height","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("other_name","maxlen=100","Max length for OTHER_NAME is 100 ");


	frmvalidator.addValidation("other_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("last_name","maxlen=100","Max length for LAST_NAME is 100 ");


	frmvalidator.addValidation("last_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("middle_name","maxlen=100","Max length for MIDDLE_NAME is 100 ");


	frmvalidator.addValidation("middle_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("first_name","maxlen=100","Max length for FIRST_NAME is 100 ");


	frmvalidator.addValidation("first_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("title_code","maxlen=4","Max length for TITLE_CODE is 4 ");


	frmvalidator.addValidation("title_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_passport","maxlen=20","Max length for LAWBREAKER_PASSPORT is 20 ");


	frmvalidator.addValidation("lawbreaker_passport","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_id_card","maxlen=20","Max length for LAWBREAKER_ID_CARD is 20 ");


	frmvalidator.addValidation("lawbreaker_id_card","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_type","maxlen=1","Max length for LAWBREAKER_TYPE is 1 ");

	frmvalidator.addValidation("lawbreaker_type","req","Please Enter LAWBREAKER_TYPE");

	frmvalidator.addValidation("lawbreaker_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_no","maxlen=22","Max length for LAWBREAKER_NO is 22 ");

	frmvalidator.addValidation("lawbreaker_no","req","Please Enter LAWBREAKER_NO");

	frmvalidator.addValidation("lawbreaker_no","num","Please Enter number");

	</script>