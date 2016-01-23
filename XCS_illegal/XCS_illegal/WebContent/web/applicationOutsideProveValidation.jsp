








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("replace_position","maxlen=200","Max length for REPLACE_POSITION is 200 ");


	frmvalidator.addValidation("replace_position","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("dept_type","maxlen=1","Max length for DEPT_TYPE is 1 ");

	frmvalidator.addValidation("dept_type","req","Please Enter DEPT_TYPE");

	frmvalidator.addValidation("dept_type","alnum_s","Please Enter alphabatic");

	



	
	frmvalidator.addValidation("update_by","maxlen=22","Max length for UPDATE_BY is 22 ");


	frmvalidator.addValidation("update_by","num","Please Enter number");

	

	frmvalidator.addValidation("create_on","req","Please Enter CREATE_ON");


	
	frmvalidator.addValidation("create_by","maxlen=22","Max length for CREATE_BY is 22 ");

	frmvalidator.addValidation("create_by","req","Please Enter CREATE_BY");

	frmvalidator.addValidation("create_by","num","Please Enter number");

	

	frmvalidator.addValidation("prove_date","req","Please Enter PROVE_DATE");


	
	frmvalidator.addValidation("prove_result","maxlen=2000","Max length for PROVE_RESULT is 2000 ");

	frmvalidator.addValidation("prove_result","req","Please Enter PROVE_RESULT");

	frmvalidator.addValidation("prove_result","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("isreturn","maxlen=1","Max length for ISRETURN is 1 ");

	frmvalidator.addValidation("isreturn","req","Please Enter ISRETURN");

	frmvalidator.addValidation("isreturn","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("prove_objective","maxlen=200","Max length for PROVE_OBJECTIVE is 200 ");

	frmvalidator.addValidation("prove_objective","req","Please Enter PROVE_OBJECTIVE");

	frmvalidator.addValidation("prove_objective","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode_prove","maxlen=6","Max length for OFFCODE_PROVE is 6 ");

	frmvalidator.addValidation("offcode_prove","req","Please Enter OFFCODE_PROVE");

	frmvalidator.addValidation("offcode_prove","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("poscode_prove","maxlen=20","Max length for POSCODE_PROVE is 20 ");

	frmvalidator.addValidation("poscode_prove","req","Please Enter POSCODE_PROVE");

	frmvalidator.addValidation("poscode_prove","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("staff_id_prove","maxlen=13","Max length for STAFF_ID_PROVE is 13 ");

	frmvalidator.addValidation("staff_id_prove","req","Please Enter STAFF_ID_PROVE");

	frmvalidator.addValidation("staff_id_prove","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("prove_no","maxlen=20","Max length for PROVE_NO is 20 ");

	frmvalidator.addValidation("prove_no","req","Please Enter PROVE_NO");

	frmvalidator.addValidation("prove_no","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("offcode","maxlen=6","Max length for OFFCODE is 6 ");

	frmvalidator.addValidation("offcode","req","Please Enter OFFCODE");

	frmvalidator.addValidation("offcode","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("legislation_id","maxlen=22","Max length for LEGISLATION_ID is 22 ");

	frmvalidator.addValidation("legislation_id","req","Please Enter LEGISLATION_ID");

	frmvalidator.addValidation("legislation_id","num","Please Enter number");

	
	frmvalidator.addValidation("doc_dept_name","maxlen=100","Max length for DOC_DEPT_NAME is 100 ");

	frmvalidator.addValidation("doc_dept_name","req","Please Enter DOC_DEPT_NAME");

	frmvalidator.addValidation("doc_dept_name","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("ref_doc_date","req","Please Enter REF_DOC_DATE");


	
	frmvalidator.addValidation("ref_doc_no","maxlen=20","Max length for REF_DOC_NO is 20 ");

	frmvalidator.addValidation("ref_doc_no","req","Please Enter REF_DOC_NO");

	frmvalidator.addValidation("ref_doc_no","alnum_s","Please Enter alphabatic");

	

	frmvalidator.addValidation("job_date","req","Please Enter JOB_DATE");


	
	frmvalidator.addValidation("job_no","maxlen=20","Max length for JOB_NO is 20 ");

	frmvalidator.addValidation("job_no","req","Please Enter JOB_NO");

	frmvalidator.addValidation("job_no","alnum_s","Please Enter alphabatic");

	</script>