








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("netweight_unit","maxlen=15","Max length for NETWEIGHT_UNIT is 15 ");

	frmvalidator.addValidation("netweight_unit","req","Please Enter NETWEIGHT_UNIT");

	frmvalidator.addValidation("netweight_unit","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("netweight","maxlen=22","Max length for NETWEIGHT is 22 ");

	frmvalidator.addValidation("netweight","req","Please Enter NETWEIGHT");

	frmvalidator.addValidation("netweight","num","Please Enter number");

	
	frmvalidator.addValidation("sizes_unit_code","maxlen=15","Max length for SIZES_UNIT_CODE is 15 ");

	frmvalidator.addValidation("sizes_unit_code","req","Please Enter SIZES_UNIT_CODE");

	frmvalidator.addValidation("sizes_unit_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("sizes_code","maxlen=3","Max length for SIZES_CODE is 3 ");

	frmvalidator.addValidation("sizes_code","req","Please Enter SIZES_CODE");

	frmvalidator.addValidation("sizes_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("remarks","maxlen=200","Max length for REMARKS is 200 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("prove_qty","maxlen=22","Max length for PROVE_QTY is 22 ");

	frmvalidator.addValidation("prove_qty","req","Please Enter PROVE_QTY");

	frmvalidator.addValidation("prove_qty","num","Please Enter number");

	
	frmvalidator.addValidation("application_outside_prove_item","maxlen=22","Max length for APPLICATION_OUTSIDE_PROVE_ITEM is 22 ");


	frmvalidator.addValidation("application_outside_prove_item","num","Please Enter number");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("unit_code","maxlen=15","Max length for UNIT_CODE is 15 ");

	frmvalidator.addValidation("unit_code","req","Please Enter UNIT_CODE");

	frmvalidator.addValidation("unit_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("qty","maxlen=22","Max length for QTY is 22 ");

	frmvalidator.addValidation("qty","req","Please Enter QTY");

	frmvalidator.addValidation("qty","num","Please Enter number");

	
	frmvalidator.addValidation("brand_code","maxlen=50","Max length for BRAND_CODE is 50 ");


	frmvalidator.addValidation("brand_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("product_code","maxlen=8","Max length for PRODUCT_CODE is 8 ");

	frmvalidator.addValidation("product_code","req","Please Enter PRODUCT_CODE");

	frmvalidator.addValidation("product_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("app_arrest_prove_exhibit_id","maxlen=22","Max length for APP_ARREST_PROVE_EXHIBIT_ID is 22 ");


	frmvalidator.addValidation("app_arrest_prove_exhibit_id","num","Please Enter number");

	
	frmvalidator.addValidation("delivery_exhibit_id","maxlen=22","Max length for DELIVERY_EXHIBIT_ID is 22 ");

	frmvalidator.addValidation("delivery_exhibit_id","req","Please Enter DELIVERY_EXHIBIT_ID");

	frmvalidator.addValidation("delivery_exhibit_id","num","Please Enter number");

	</script>