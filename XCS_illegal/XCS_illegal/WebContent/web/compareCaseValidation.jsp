








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("inv_type","maxlen=1","Max length for INV_TYPE is 1 ");

	frmvalidator.addValidation("inv_type","req","Please Enter INV_TYPE");

	frmvalidator.addValidation("inv_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("sue_offcode","maxlen=6","Max length for SUE_OFFCODE is 6 ");


	frmvalidator.addValidation("sue_offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("sue_poscode","maxlen=20","Max length for SUE_POSCODE is 20 ");


	frmvalidator.addValidation("sue_poscode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("sue_staff_idcardno","maxlen=13","Max length for SUE_STAFF_IDCARDNO is 13 ");

	frmvalidator.addValidation("sue_staff_idcardno","req","Please Enter SUE_STAFF_IDCARDNO");

	frmvalidator.addValidation("sue_staff_idcardno","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("case_fine","maxlen=22","Max length for CASE_FINE is 22 ");


	frmvalidator.addValidation("case_fine","num","Please Enter number");

	
	frmvalidator.addValidation("case_status","maxlen=1","Max length for CASE_STATUS is 1 ");

	frmvalidator.addValidation("case_status","req","Please Enter CASE_STATUS");

	frmvalidator.addValidation("case_status","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("manage_type","maxlen=1","Max length for MANAGE_TYPE is 1 ");


	frmvalidator.addValidation("manage_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("compare_authority_id","maxlen=22","Max length for COMPARE_AUTHORITY_ID is 22 ");


	frmvalidator.addValidation("compare_authority_id","num","Please Enter number");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("reward_money","maxlen=22","Max length for REWARD_MONEY is 22 ");


	frmvalidator.addValidation("reward_money","num","Please Enter number");

	
	frmvalidator.addValidation("birbe_money","maxlen=22","Max length for BIRBE_MONEY is 22 ");


	frmvalidator.addValidation("birbe_money","num","Please Enter number");

	
	frmvalidator.addValidation("treasury_money","maxlen=22","Max length for TREASURY_MONEY is 22 ");


	frmvalidator.addValidation("treasury_money","num","Please Enter number");

	
	frmvalidator.addValidation("reward_money_p","maxlen=22","Max length for REWARD_MONEY_P is 22 ");


	frmvalidator.addValidation("reward_money_p","num","Please Enter number");

	
	frmvalidator.addValidation("bribe_money_p","maxlen=22","Max length for BRIBE_MONEY_P is 22 ");


	frmvalidator.addValidation("bribe_money_p","num","Please Enter number");

	
	frmvalidator.addValidation("treasury_money_p","maxlen=22","Max length for TREASURY_MONEY_P is 22 ");


	frmvalidator.addValidation("treasury_money_p","num","Please Enter number");

	



	



	
	frmvalidator.addValidation("court_fine","maxlen=22","Max length for COURT_FINE is 22 ");


	frmvalidator.addValidation("court_fine","num","Please Enter number");

	
	frmvalidator.addValidation("case_id","maxlen=22","Max length for CASE_ID is 22 ");

	frmvalidator.addValidation("case_id","req","Please Enter CASE_ID");

	frmvalidator.addValidation("case_id","num","Please Enter number");

	
	frmvalidator.addValidation("accuser_testimony","maxlen=4000","Max length for ACCUSER_TESTIMONY is 4000 ");

	frmvalidator.addValidation("accuser_testimony","req","Please Enter ACCUSER_TESTIMONY");

	frmvalidator.addValidation("accuser_testimony","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("indictment_id","maxlen=22","Max length for INDICTMENT_ID is 22 ");

	frmvalidator.addValidation("indictment_id","req","Please Enter INDICTMENT_ID");

	frmvalidator.addValidation("indictment_id","num","Please Enter number");

	
	frmvalidator.addValidation("accuser_province","maxlen=2","Max length for ACCUSER_PROVINCE is 2 ");


	frmvalidator.addValidation("accuser_province","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("accuser_district","maxlen=4","Max length for ACCUSER_DISTRICT is 4 ");


	frmvalidator.addValidation("accuser_district","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("accuser_subdistrict","maxlen=6","Max length for ACCUSER_SUBDISTRICT is 6 ");


	frmvalidator.addValidation("accuser_subdistrict","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("compare_province","maxlen=2","Max length for COMPARE_PROVINCE is 2 ");

	frmvalidator.addValidation("compare_province","req","Please Enter COMPARE_PROVINCE");

	frmvalidator.addValidation("compare_province","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("compare_district","maxlen=4","Max length for COMPARE_DISTRICT is 4 ");

	frmvalidator.addValidation("compare_district","req","Please Enter COMPARE_DISTRICT");

	frmvalidator.addValidation("compare_district","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("compare_subdistrict","maxlen=6","Max length for COMPARE_SUBDISTRICT is 6 ");

	frmvalidator.addValidation("compare_subdistrict","req","Please Enter COMPARE_SUBDISTRICT");

	frmvalidator.addValidation("compare_subdistrict","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("compare_office","maxlen=6","Max length for COMPARE_OFFICE is 6 ");

	frmvalidator.addValidation("compare_office","req","Please Enter COMPARE_OFFICE");

	frmvalidator.addValidation("compare_office","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("compare_case_date","req","Please Enter COMPARE_CASE_DATE");


	
	frmvalidator.addValidation("compare_case_no","maxlen=20","Max length for COMPARE_CASE_NO is 20 ");

	frmvalidator.addValidation("compare_case_no","req","Please Enter COMPARE_CASE_NO");

	frmvalidator.addValidation("compare_case_no","alnum_s","Please Enter alphabatic");

	</script>