








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("ismistake_desc","maxlen=2000","Max length for ISMISTAKE_DESC is 2000 ");


	frmvalidator.addValidation("ismistake_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("ismistake","maxlen=1","Max length for ISMISTAKE is 1 ");

	frmvalidator.addValidation("ismistake","req","Please Enter ISMISTAKE");

	frmvalidator.addValidation("ismistake","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("paper_no","maxlen=20","Max length for PAPER_NO is 20 ");


	frmvalidator.addValidation("paper_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("company_name","maxlen=200","Max length for COMPANY_NAME is 200 ");


	frmvalidator.addValidation("company_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("company_title_code","maxlen=4","Max length for COMPANY_TITLE_CODE is 4 ");


	frmvalidator.addValidation("company_title_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("corporation_code","maxlen=20","Max length for CORPORATION_CODE is 20 ");


	frmvalidator.addValidation("corporation_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("excise_reg_no","maxlen=20","Max length for EXCISE_REG_NO is 20 ");


	frmvalidator.addValidation("excise_reg_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("other_name","maxlen=200","Max length for OTHER_NAME is 200 ");


	frmvalidator.addValidation("other_name","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("sex","maxlen=1","Max length for SEX is 1 ");

	frmvalidator.addValidation("sex","req","Please Enter SEX");

	frmvalidator.addValidation("sex","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("title_code","maxlen=4","Max length for TITLE_CODE is 4 ");


	frmvalidator.addValidation("title_code","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("cancel_by","maxlen=13","Max length for CANCEL_BY is 13 ");


	frmvalidator.addValidation("cancel_by","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("iscancel","maxlen=1","Max length for ISCANCEL is 1 ");

	frmvalidator.addValidation("iscancel","req","Please Enter ISCANCEL");

	frmvalidator.addValidation("iscancel","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("inv_no","maxlen=20","Max length for INV_NO is 20 ");


	frmvalidator.addValidation("inv_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("book_no","maxlen=20","Max length for BOOK_NO is 20 ");


	frmvalidator.addValidation("book_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("fine","maxlen=22","Max length for FINE is 22 ");


	frmvalidator.addValidation("fine","num","Please Enter number");

	
	frmvalidator.addValidation("invcode","maxlen=20","Max length for INVCODE is 20 ");


	frmvalidator.addValidation("invcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("paid_time_off","maxlen=1","Max length for PAID_TIME_OFF is 1 ");

	frmvalidator.addValidation("paid_time_off","req","Please Enter PAID_TIME_OFF");

	frmvalidator.addValidation("paid_time_off","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("mother_name","maxlen=100","Max length for MOTHER_NAME is 100 ");


	frmvalidator.addValidation("mother_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("father_name","maxlen=100","Max length for FATHER_NAME is 100 ");


	frmvalidator.addValidation("father_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("age","maxlen=22","Max length for AGE is 22 ");


	frmvalidator.addValidation("age","num","Please Enter number");

	
	frmvalidator.addValidation("career","maxlen=100","Max length for CAREER is 100 ");


	frmvalidator.addValidation("career","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("race_id","maxlen=22","Max length for RACE_ID is 22 ");


	frmvalidator.addValidation("race_id","num","Please Enter number");

	
	frmvalidator.addValidation("nationality_id","maxlen=22","Max length for NATIONALITY_ID is 22 ");


	frmvalidator.addValidation("nationality_id","num","Please Enter number");

	
	frmvalidator.addValidation("province","maxlen=2","Max length for PROVINCE is 2 ");


	frmvalidator.addValidation("province","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("district","maxlen=4","Max length for DISTRICT is 4 ");


	frmvalidator.addValidation("district","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("subdistrict","maxlen=6","Max length for SUBDISTRICT is 6 ");


	frmvalidator.addValidation("subdistrict","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("moo","maxlen=22","Max length for MOO is 22 ");


	frmvalidator.addValidation("moo","num","Please Enter number");

	
	frmvalidator.addValidation("road","maxlen=100","Max length for ROAD is 100 ");


	frmvalidator.addValidation("road","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("soi","maxlen=100","Max length for SOI is 100 ");


	frmvalidator.addValidation("soi","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("address_no","maxlen=50","Max length for ADDRESS_NO is 50 ");


	frmvalidator.addValidation("address_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("last_name","maxlen=100","Max length for LAST_NAME is 100 ");


	frmvalidator.addValidation("last_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("middle_name","maxlen=10","Max length for MIDDLE_NAME is 10 ");


	frmvalidator.addValidation("middle_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("first_name","maxlen=100","Max length for FIRST_NAME is 100 ");


	frmvalidator.addValidation("first_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_passport","maxlen=20","Max length for LAWBREAKER_PASSPORT is 20 ");


	frmvalidator.addValidation("lawbreaker_passport","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreaker_id_card","maxlen=13","Max length for LAWBREAKER_ID_CARD is 13 ");


	frmvalidator.addValidation("lawbreaker_id_card","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("culprit_type","maxlen=22","Max length for CULPRIT_TYPE is 22 ");

	frmvalidator.addValidation("culprit_type","req","Please Enter CULPRIT_TYPE");

	frmvalidator.addValidation("culprit_type","num","Please Enter number");

	
	frmvalidator.addValidation("lawbreaker_no","maxlen=22","Max length for LAWBREAKER_NO is 22 ");


	frmvalidator.addValidation("lawbreaker_no","num","Please Enter number");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	</script>