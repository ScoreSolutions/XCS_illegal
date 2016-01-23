








 

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

	
	frmvalidator.addValidation("fine_09","maxlen=22","Max length for FINE_09 is 22 ");

	frmvalidator.addValidation("fine_09","req","Please Enter FINE_09");

	frmvalidator.addValidation("fine_09","num","Please Enter number");

	
	frmvalidator.addValidation("qty_09","maxlen=22","Max length for QTY_09 is 22 ");

	frmvalidator.addValidation("qty_09","req","Please Enter QTY_09");

	frmvalidator.addValidation("qty_09","num","Please Enter number");

	
	frmvalidator.addValidation("fine_08","maxlen=22","Max length for FINE_08 is 22 ");

	frmvalidator.addValidation("fine_08","req","Please Enter FINE_08");

	frmvalidator.addValidation("fine_08","num","Please Enter number");

	
	frmvalidator.addValidation("qty_08","maxlen=22","Max length for QTY_08 is 22 ");

	frmvalidator.addValidation("qty_08","req","Please Enter QTY_08");

	frmvalidator.addValidation("qty_08","num","Please Enter number");

	
	frmvalidator.addValidation("fine_07","maxlen=22","Max length for FINE_07 is 22 ");

	frmvalidator.addValidation("fine_07","req","Please Enter FINE_07");

	frmvalidator.addValidation("fine_07","num","Please Enter number");

	
	frmvalidator.addValidation("qty_07","maxlen=22","Max length for QTY_07 is 22 ");

	frmvalidator.addValidation("qty_07","req","Please Enter QTY_07");

	frmvalidator.addValidation("qty_07","num","Please Enter number");

	
	frmvalidator.addValidation("fine_06","maxlen=22","Max length for FINE_06 is 22 ");

	frmvalidator.addValidation("fine_06","req","Please Enter FINE_06");

	frmvalidator.addValidation("fine_06","num","Please Enter number");

	
	frmvalidator.addValidation("qty_06","maxlen=22","Max length for QTY_06 is 22 ");

	frmvalidator.addValidation("qty_06","req","Please Enter QTY_06");

	frmvalidator.addValidation("qty_06","num","Please Enter number");

	
	frmvalidator.addValidation("fine_05","maxlen=22","Max length for FINE_05 is 22 ");

	frmvalidator.addValidation("fine_05","req","Please Enter FINE_05");

	frmvalidator.addValidation("fine_05","num","Please Enter number");

	
	frmvalidator.addValidation("qty_05","maxlen=22","Max length for QTY_05 is 22 ");

	frmvalidator.addValidation("qty_05","req","Please Enter QTY_05");

	frmvalidator.addValidation("qty_05","num","Please Enter number");

	
	frmvalidator.addValidation("fine_04","maxlen=22","Max length for FINE_04 is 22 ");

	frmvalidator.addValidation("fine_04","req","Please Enter FINE_04");

	frmvalidator.addValidation("fine_04","num","Please Enter number");

	
	frmvalidator.addValidation("qty_04","maxlen=22","Max length for QTY_04 is 22 ");

	frmvalidator.addValidation("qty_04","req","Please Enter QTY_04");

	frmvalidator.addValidation("qty_04","num","Please Enter number");

	
	frmvalidator.addValidation("fine_03","maxlen=22","Max length for FINE_03 is 22 ");

	frmvalidator.addValidation("fine_03","req","Please Enter FINE_03");

	frmvalidator.addValidation("fine_03","num","Please Enter number");

	
	frmvalidator.addValidation("qty_03","maxlen=22","Max length for QTY_03 is 22 ");

	frmvalidator.addValidation("qty_03","req","Please Enter QTY_03");

	frmvalidator.addValidation("qty_03","num","Please Enter number");

	
	frmvalidator.addValidation("fine_02","maxlen=22","Max length for FINE_02 is 22 ");

	frmvalidator.addValidation("fine_02","req","Please Enter FINE_02");

	frmvalidator.addValidation("fine_02","num","Please Enter number");

	
	frmvalidator.addValidation("qty_02","maxlen=22","Max length for QTY_02 is 22 ");

	frmvalidator.addValidation("qty_02","req","Please Enter QTY_02");

	frmvalidator.addValidation("qty_02","num","Please Enter number");

	
	frmvalidator.addValidation("fine_01","maxlen=22","Max length for FINE_01 is 22 ");

	frmvalidator.addValidation("fine_01","req","Please Enter FINE_01");

	frmvalidator.addValidation("fine_01","num","Please Enter number");

	
	frmvalidator.addValidation("qty_01","maxlen=22","Max length for QTY_01 is 22 ");

	frmvalidator.addValidation("qty_01","req","Please Enter QTY_01");

	frmvalidator.addValidation("qty_01","num","Please Enter number");

	
	frmvalidator.addValidation("fine_12","maxlen=22","Max length for FINE_12 is 22 ");

	frmvalidator.addValidation("fine_12","req","Please Enter FINE_12");

	frmvalidator.addValidation("fine_12","num","Please Enter number");

	
	frmvalidator.addValidation("qty_12","maxlen=22","Max length for QTY_12 is 22 ");

	frmvalidator.addValidation("qty_12","req","Please Enter QTY_12");

	frmvalidator.addValidation("qty_12","num","Please Enter number");

	
	frmvalidator.addValidation("fine_11","maxlen=22","Max length for FINE_11 is 22 ");

	frmvalidator.addValidation("fine_11","req","Please Enter FINE_11");

	frmvalidator.addValidation("fine_11","num","Please Enter number");

	
	frmvalidator.addValidation("qty_11","maxlen=22","Max length for QTY_11 is 22 ");

	frmvalidator.addValidation("qty_11","req","Please Enter QTY_11");

	frmvalidator.addValidation("qty_11","num","Please Enter number");

	
	frmvalidator.addValidation("fine_10","maxlen=22","Max length for FINE_10 is 22 ");

	frmvalidator.addValidation("fine_10","req","Please Enter FINE_10");

	frmvalidator.addValidation("fine_10","num","Please Enter number");

	
	frmvalidator.addValidation("qty_10","maxlen=22","Max length for QTY_10 is 22 ");

	frmvalidator.addValidation("qty_10","req","Please Enter QTY_10");

	frmvalidator.addValidation("qty_10","num","Please Enter number");

	
	frmvalidator.addValidation("target_type","maxlen=1","Max length for TARGET_TYPE is 1 ");

	frmvalidator.addValidation("target_type","req","Please Enter TARGET_TYPE");

	frmvalidator.addValidation("target_type","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("suppress_target_id","maxlen=22","Max length for SUPPRESS_TARGET_ID is 22 ");

	frmvalidator.addValidation("suppress_target_id","req","Please Enter SUPPRESS_TARGET_ID");

	frmvalidator.addValidation("suppress_target_id","num","Please Enter number");

	</script>