








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("position_type","maxlen=1","Max length for POSITION_TYPE is 1 ");

	frmvalidator.addValidation("position_type","req","Please Enter POSITION_TYPE");

	frmvalidator.addValidation("position_type","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	
	frmvalidator.addValidation("abbname","maxlen=100","Max length for ABBNAME is 100 ");


	frmvalidator.addValidation("abbname","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("posname","maxlen=100","Max length for POSNAME is 100 ");

	frmvalidator.addValidation("posname","req","Please Enter POSNAME");

	frmvalidator.addValidation("posname","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode","maxlen=20","Max length for POSCODE is 20 ");

	frmvalidator.addValidation("poscode","req","Please Enter POSCODE");

	frmvalidator.addValidation("poscode","alnum_s","Please Enter alphabatic");

	</script>