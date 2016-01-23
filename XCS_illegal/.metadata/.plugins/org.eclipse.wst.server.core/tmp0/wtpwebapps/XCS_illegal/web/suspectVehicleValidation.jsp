








 

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

	
	frmvalidator.addValidation("description","maxlen=500","Max length for DESCRIPTION is 500 ");


	frmvalidator.addValidation("description","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("car_color","maxlen=50","Max length for CAR_COLOR is 50 ");


	frmvalidator.addValidation("car_color","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("car_model","maxlen=100","Max length for CAR_MODEL is 100 ");


	frmvalidator.addValidation("car_model","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("brand_brand_code","maxlen=50","Max length for BRAND_BRAND_CODE is 50 ");


	frmvalidator.addValidation("brand_brand_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("brand_duty_code","maxlen=4","Max length for BRAND_DUTY_CODE is 4 ");


	frmvalidator.addValidation("brand_duty_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("car_no","maxlen=4","Max length for CAR_NO is 4 ");


	frmvalidator.addValidation("car_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("car_cate","maxlen=3","Max length for CAR_CATE is 3 ");


	frmvalidator.addValidation("car_cate","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("producttype_type_code","maxlen=2","Max length for PRODUCTTYPE_TYPE_CODE is 2 ");


	frmvalidator.addValidation("producttype_type_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("producttype_duty_code","maxlen=4","Max length for PRODUCTTYPE_DUTY_CODE is 4 ");


	frmvalidator.addValidation("producttype_duty_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("province_code","maxlen=2","Max length for PROVINCE_CODE is 2 ");


	frmvalidator.addValidation("province_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("suspect_investigate_id","maxlen=22","Max length for SUSPECT_INVESTIGATE_ID is 22 ");

	frmvalidator.addValidation("suspect_investigate_id","req","Please Enter SUSPECT_INVESTIGATE_ID");

	frmvalidator.addValidation("suspect_investigate_id","num","Please Enter number");

	</script>