








 

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

	



	
	frmvalidator.addValidation("issentcourt","maxlen=1","Max length for ISSENTCOURT is 1 ");

	frmvalidator.addValidation("issentcourt","req","Please Enter ISSENTCOURT");

	frmvalidator.addValidation("issentcourt","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("accuser_poscode","maxlen=20","Max length for ACCUSER_POSCODE is 20 ");


	frmvalidator.addValidation("accuser_poscode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("accuser_offcode","maxlen=6","Max length for ACCUSER_OFFCODE is 6 ");


	frmvalidator.addValidation("accuser_offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("accuser_idcardno","maxlen=13","Max length for ACCUSER_IDCARDNO is 13 ");


	frmvalidator.addValidation("accuser_idcardno","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("application_sincere_confirm_id","maxlen=22","Max length for APPLICATION_SINCERE_CONFIRM_ID is 22 ");


	frmvalidator.addValidation("application_sincere_confirm_id","num","Please Enter number");

	
	frmvalidator.addValidation("application_search_warrant_id","maxlen=22","Max length for APPLICATION_SEARCH_WARRANT_ID is 22 ");


	frmvalidator.addValidation("application_search_warrant_id","num","Please Enter number");

	
	frmvalidator.addValidation("application_notice_arrest_id","maxlen=22","Max length for APPLICATION_NOTICE_ARREST_ID is 22 ");


	frmvalidator.addValidation("application_notice_arrest_id","num","Please Enter number");

	
	frmvalidator.addValidation("police_station","maxlen=200","Max length for POLICE_STATION is 200 ");


	frmvalidator.addValidation("police_station","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("accuser_type","maxlen=1","Max length for ACCUSER_TYPE is 1 ");

	frmvalidator.addValidation("accuser_type","req","Please Enter ACCUSER_TYPE");

	frmvalidator.addValidation("accuser_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("product_group_id","maxlen=4","Max length for PRODUCT_GROUP_ID is 4 ");

	frmvalidator.addValidation("product_group_id","req","Please Enter PRODUCT_GROUP_ID");

	frmvalidator.addValidation("product_group_id","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("coordinate_y","maxlen=22","Max length for COORDINATE_Y is 22 ");


	frmvalidator.addValidation("coordinate_y","num","Please Enter number");

	
	frmvalidator.addValidation("coordinate_x","maxlen=22","Max length for COORDINATE_X is 22 ");


	frmvalidator.addValidation("coordinate_x","num","Please Enter number");

	



	
	frmvalidator.addValidation("estimate_fine","maxlen=22","Max length for ESTIMATE_FINE is 22 ");


	frmvalidator.addValidation("estimate_fine","num","Please Enter number");

	
	frmvalidator.addValidation("del_flag","maxlen=1","Max length for DEL_FLAG is 1 ");

	frmvalidator.addValidation("del_flag","req","Please Enter DEL_FLAG");

	frmvalidator.addValidation("del_flag","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("administration","maxlen=4000","Max length for ADMINISTRATION is 4000 ");


	frmvalidator.addValidation("administration","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("lawbreak_type","maxlen=1","Max length for LAWBREAK_TYPE is 1 ");

	frmvalidator.addValidation("lawbreak_type","req","Please Enter LAWBREAK_TYPE");

	frmvalidator.addValidation("lawbreak_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("department_name","maxlen=255","Max length for DEPARTMENT_NAME is 255 ");

	frmvalidator.addValidation("department_name","req","Please Enter DEPARTMENT_NAME");

	frmvalidator.addValidation("department_name","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("testimony","maxlen=4000","Max length for TESTIMONY is 4000 ");


	frmvalidator.addValidation("testimony","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("behaviour","maxlen=4000","Max length for BEHAVIOUR is 4000 ");


	frmvalidator.addValidation("behaviour","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("director_position","maxlen=100","Max length for DIRECTOR_POSITION is 100 ");


	frmvalidator.addValidation("director_position","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("leader_position","maxlen=100","Max length for LEADER_POSITION is 100 ");


	frmvalidator.addValidation("leader_position","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("order_by","maxlen=22","Max length for ORDER_BY is 22 ");


	frmvalidator.addValidation("order_by","num","Please Enter number");

	
	frmvalidator.addValidation("report_to","maxlen=22","Max length for REPORT_TO is 22 ");


	frmvalidator.addValidation("report_to","num","Please Enter number");

	
	frmvalidator.addValidation("duty","maxlen=100","Max length for DUTY is 100 ");


	frmvalidator.addValidation("duty","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("surety_name","maxlen=100","Max length for SURETY_NAME is 100 ");


	frmvalidator.addValidation("surety_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("business_name","maxlen=100","Max length for BUSINESS_NAME is 100 ");


	frmvalidator.addValidation("business_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("owner_name","maxlen=100","Max length for OWNER_NAME is 100 ");


	frmvalidator.addValidation("owner_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("guilty","maxlen=1","Max length for GUILTY is 1 ");

	frmvalidator.addValidation("guilty","req","Please Enter GUILTY");

	frmvalidator.addValidation("guilty","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("occurrence_date","req","Please Enter OCCURRENCE_DATE");


	
	frmvalidator.addValidation("alleged_co","maxlen=1","Max length for ALLEGED_CO is 1 ");

	frmvalidator.addValidation("alleged_co","req","Please Enter ALLEGED_CO");

	frmvalidator.addValidation("alleged_co","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("scene_province","maxlen=2","Max length for SCENE_PROVINCE is 2 ");

	frmvalidator.addValidation("scene_province","req","Please Enter SCENE_PROVINCE");

	frmvalidator.addValidation("scene_province","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("scene_district","maxlen=4","Max length for SCENE_DISTRICT is 4 ");

	frmvalidator.addValidation("scene_district","req","Please Enter SCENE_DISTRICT");

	frmvalidator.addValidation("scene_district","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("scene_subdistrict","maxlen=6","Max length for SCENE_SUBDISTRICT is 6 ");

	frmvalidator.addValidation("scene_subdistrict","req","Please Enter SCENE_SUBDISTRICT");

	frmvalidator.addValidation("scene_subdistrict","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("scene_road","maxlen=200","Max length for SCENE_ROAD is 200 ");


	frmvalidator.addValidation("scene_road","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("scene_soi","maxlen=200","Max length for SCENE_SOI is 200 ");


	frmvalidator.addValidation("scene_soi","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("scene_moo","maxlen=10","Max length for SCENE_MOO is 10 ");


	frmvalidator.addValidation("scene_moo","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("scene_no","maxlen=200","Max length for SCENE_NO is 200 ");


	frmvalidator.addValidation("scene_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("scene_name","maxlen=200","Max length for SCENE_NAME is 200 ");


	frmvalidator.addValidation("scene_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("have_culprit","maxlen=1","Max length for HAVE_CULPRIT is 1 ");

	frmvalidator.addValidation("have_culprit","req","Please Enter HAVE_CULPRIT");

	frmvalidator.addValidation("have_culprit","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("legislation_id","maxlen=22","Max length for LEGISLATION_ID is 22 ");

	frmvalidator.addValidation("legislation_id","req","Please Enter LEGISLATION_ID");

	frmvalidator.addValidation("legislation_id","num","Please Enter number");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("department_id","maxlen=22","Max length for DEPARTMENT_ID is 22 ");


	frmvalidator.addValidation("department_id","num","Please Enter number");

	

	frmvalidator.addValidation("application_date","req","Please Enter APPLICATION_DATE");


	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	</script>