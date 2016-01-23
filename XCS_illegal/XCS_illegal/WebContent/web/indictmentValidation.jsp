








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("guilt_mst_id","maxlen=20","Max length for GUILT_MST_ID is 20 ");

	frmvalidator.addValidation("guilt_mst_id","req","Please Enter GUILT_MST_ID");

	frmvalidator.addValidation("guilt_mst_id","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("remarks","maxlen=200","Max length for REMARKS is 200 ");


	frmvalidator.addValidation("remarks","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("exhibit_wild","maxlen=1","Max length for EXHIBIT_WILD is 1 ");

	frmvalidator.addValidation("exhibit_wild","req","Please Enter EXHIBIT_WILD");

	frmvalidator.addValidation("exhibit_wild","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("isimprison","maxlen=1","Max length for ISIMPRISON is 1 ");

	frmvalidator.addValidation("isimprison","req","Please Enter ISIMPRISON");

	frmvalidator.addValidation("isimprison","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("fine_rate","maxlen=200","Max length for FINE_RATE is 200 ");


	frmvalidator.addValidation("fine_rate","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("isfine","maxlen=1","Max length for ISFINE is 1 ");

	frmvalidator.addValidation("isfine","req","Please Enter ISFINE");

	frmvalidator.addValidation("isfine","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("penalty_desc","maxlen=200","Max length for PENALTY_DESC is 200 ");


	frmvalidator.addValidation("penalty_desc","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("penalty_case_law_id","maxlen=100","Max length for PENALTY_CASE_LAW_ID is 100 ");


	frmvalidator.addValidation("penalty_case_law_id","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("guilt_base","maxlen=200","Max length for GUILT_BASE is 200 ");


	frmvalidator.addValidation("guilt_base","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("case_law_id","maxlen=100","Max length for CASE_LAW_ID is 100 ");

	frmvalidator.addValidation("case_law_id","req","Please Enter CASE_LAW_ID");

	frmvalidator.addValidation("case_law_id","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("law_id","maxlen=20","Max length for LAW_ID is 20 ");

	frmvalidator.addValidation("law_id","req","Please Enter LAW_ID");

	frmvalidator.addValidation("law_id","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	</script>