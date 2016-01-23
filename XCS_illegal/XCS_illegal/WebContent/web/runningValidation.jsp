








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("runningfield","maxlen=30","Max length for RUNNINGFIELD is 30 ");

	frmvalidator.addValidation("runningfield","req","Please Enter RUNNINGFIELD");

	frmvalidator.addValidation("runningfield","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("length","maxlen=22","Max length for LENGTH is 22 ");

	frmvalidator.addValidation("length","req","Please Enter LENGTH");

	frmvalidator.addValidation("length","num","Please Enter number");

	
	frmvalidator.addValidation("year","maxlen=4","Max length for YEAR is 4 ");


	frmvalidator.addValidation("year","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("month","maxlen=2","Max length for MONTH is 2 ");


	frmvalidator.addValidation("month","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("isoffcode","maxlen=1","Max length for ISOFFCODE is 1 ");

	frmvalidator.addValidation("isoffcode","req","Please Enter ISOFFCODE");

	frmvalidator.addValidation("isoffcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("code","maxlen=10","Max length for CODE is 10 ");


	frmvalidator.addValidation("code","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("fieldvalue","maxlen=100","Max length for FIELDVALUE is 100 ");


	frmvalidator.addValidation("fieldvalue","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("fieldtype","maxlen=30","Max length for FIELDTYPE is 30 ");


	frmvalidator.addValidation("fieldtype","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("tbname","maxlen=30","Max length for TBNAME is 30 ");

	frmvalidator.addValidation("tbname","req","Please Enter TBNAME");

	frmvalidator.addValidation("tbname","alnum_s","Please Enter alphabatic");

	</script>