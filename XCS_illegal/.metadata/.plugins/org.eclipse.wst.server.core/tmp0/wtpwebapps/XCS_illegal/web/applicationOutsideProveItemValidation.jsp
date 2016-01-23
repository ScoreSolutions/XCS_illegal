








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("isdomestic","maxlen=1","Max length for ISDOMESTIC is 1 ");

	frmvalidator.addValidation("isdomestic","req","Please Enter ISDOMESTIC");

	frmvalidator.addValidation("isdomestic","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("remarks","maxlen=200","Max length for REMARKS is 200 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("description","maxlen=200","Max length for DESCRIPTION is 200 ");


	frmvalidator.addValidation("description","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("unit_netweight","maxlen=15","Max length for UNIT_NETWEIGHT is 15 ");


	frmvalidator.addValidation("unit_netweight","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("netweight","maxlen=22","Max length for NETWEIGHT is 22 ");


	frmvalidator.addValidation("netweight","num","Please Enter number");

	
	frmvalidator.addValidation("unit_size","maxlen=15","Max length for UNIT_SIZE is 15 ");


	frmvalidator.addValidation("unit_size","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("sizes_code","maxlen=3","Max length for SIZES_CODE is 3 ");


	frmvalidator.addValidation("sizes_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("unit_qty","maxlen=15","Max length for UNIT_QTY is 15 ");


	frmvalidator.addValidation("unit_qty","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("qty","maxlen=22","Max length for QTY is 22 ");


	frmvalidator.addValidation("qty","num","Please Enter number");

	
	frmvalidator.addValidation("brand_name","maxlen=200","Max length for BRAND_NAME is 200 ");


	frmvalidator.addValidation("brand_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("brand_code","maxlen=3","Max length for BRAND_CODE is 3 ");


	frmvalidator.addValidation("brand_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("product_name","maxlen=200","Max length for PRODUCT_NAME is 200 ");

	frmvalidator.addValidation("product_name","req","Please Enter PRODUCT_NAME");

	frmvalidator.addValidation("product_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("product_code","maxlen=8","Max length for PRODUCT_CODE is 8 ");


	frmvalidator.addValidation("product_code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("application_outside_prove_id","maxlen=22","Max length for APPLICATION_OUTSIDE_PROVE_ID is 22 ");

	frmvalidator.addValidation("application_outside_prove_id","req","Please Enter APPLICATION_OUTSIDE_PROVE_ID");

	frmvalidator.addValidation("application_outside_prove_id","num","Please Enter number");

	</script>