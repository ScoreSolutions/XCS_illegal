








 

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

	
	frmvalidator.addValidation("remarks","maxlen=200","Max length for REMARKS is 200 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("app_arrest_prove_exhibit_id","maxlen=22","Max length for APP_ARREST_PROVE_EXHIBIT_ID is 22 ");


	frmvalidator.addValidation("app_arrest_prove_exhibit_id","num","Please Enter number");

	
	frmvalidator.addValidation("car_no","maxlen=50","Max length for CAR_NO is 50 ");


	frmvalidator.addValidation("car_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("exhibit_desc","maxlen=200","Max length for EXHIBIT_DESC is 200 ");


	frmvalidator.addValidation("exhibit_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("exhibit_list","maxlen=200","Max length for EXHIBIT_LIST is 200 ");


	frmvalidator.addValidation("exhibit_list","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("status","maxlen=22","Max length for STATUS is 22 ");


	frmvalidator.addValidation("status","num","Please Enter number");

	
	frmvalidator.addValidation("netweight_unit_code","maxlen=15","Max length for NETWEIGHT_UNIT_CODE is 15 ");


	frmvalidator.addValidation("netweight_unit_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("netweight","maxlen=22","Max length for NETWEIGHT is 22 ");


	frmvalidator.addValidation("netweight","num","Please Enter number");

	
	frmvalidator.addValidation("qty_unit_code","maxlen=15","Max length for QTY_UNIT_CODE is 15 ");


	frmvalidator.addValidation("qty_unit_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("qty","maxlen=22","Max length for QTY is 22 ");


	frmvalidator.addValidation("qty","num","Please Enter number");

	
	frmvalidator.addValidation("size_unit_code","maxlen=15","Max length for SIZE_UNIT_CODE is 15 ");


	frmvalidator.addValidation("size_unit_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("sizes_code","maxlen=20","Max length for SIZES_CODE is 20 ");


	frmvalidator.addValidation("sizes_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("isdomestic","maxlen=1","Max length for ISDOMESTIC is 1 ");

	frmvalidator.addValidation("isdomestic","req","Please Enter ISDOMESTIC");

	frmvalidator.addValidation("isdomestic","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("brand_code","maxlen=20","Max length for BRAND_CODE is 20 ");


	frmvalidator.addValidation("brand_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("product_code","maxlen=8","Max length for PRODUCT_CODE is 8 ");

	frmvalidator.addValidation("product_code","req","Please Enter PRODUCT_CODE");

	frmvalidator.addValidation("product_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("duty_code","maxlen=4","Max length for DUTY_CODE is 4 ");

	frmvalidator.addValidation("duty_code","req","Please Enter DUTY_CODE");

	frmvalidator.addValidation("duty_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("track_no","maxlen=20","Max length for TRACK_NO is 20 ");

	frmvalidator.addValidation("track_no","req","Please Enter TRACK_NO");

	frmvalidator.addValidation("track_no","alnum_s","Please Enter alphabatic");

	</script>