








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("stockin_qty","maxlen=22","Max length for STOCKIN_QTY is 22 ");


	frmvalidator.addValidation("stockin_qty","num","Please Enter number");

	
	frmvalidator.addValidation("isdomestic","maxlen=1","Max length for ISDOMESTIC is 1 ");

	frmvalidator.addValidation("isdomestic","req","Please Enter ISDOMESTIC");

	frmvalidator.addValidation("isdomestic","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("stockout_id","maxlen=22","Max length for STOCKOUT_ID is 22 ");


	frmvalidator.addValidation("stockout_id","num","Please Enter number");

	
	frmvalidator.addValidation("sizes_unit_code","maxlen=15","Max length for SIZES_UNIT_CODE is 15 ");

	frmvalidator.addValidation("sizes_unit_code","req","Please Enter SIZES_UNIT_CODE");

	frmvalidator.addValidation("sizes_unit_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("sizes_code","maxlen=3","Max length for SIZES_CODE is 3 ");

	frmvalidator.addValidation("sizes_code","req","Please Enter SIZES_CODE");

	frmvalidator.addValidation("sizes_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("delivery_exhibit_id","maxlen=22","Max length for DELIVERY_EXHIBIT_ID is 22 ");


	frmvalidator.addValidation("delivery_exhibit_id","num","Please Enter number");

	



	
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

	
	frmvalidator.addValidation("brand_code","maxlen=20","Max length for BRAND_CODE is 20 ");


	frmvalidator.addValidation("brand_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("product_code","maxlen=8","Max length for PRODUCT_CODE is 8 ");

	frmvalidator.addValidation("product_code","req","Please Enter PRODUCT_CODE");

	frmvalidator.addValidation("product_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("legislation_id","maxlen=22","Max length for LEGISLATION_ID is 22 ");

	frmvalidator.addValidation("legislation_id","req","Please Enter LEGISLATION_ID");

	frmvalidator.addValidation("legislation_id","num","Please Enter number");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	</script>