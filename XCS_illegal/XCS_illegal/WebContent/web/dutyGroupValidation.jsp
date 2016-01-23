








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
	



	
	frmvalidator.addValidation("upd_userid","maxlen=10","Max length for UPD_USERID is 10 ");


	frmvalidator.addValidation("upd_userid","alnum_s","Please Enter alphabatic");

	



	



	
	frmvalidator.addValidation("sub_group_id","maxlen=4","Max length for SUB_GROUP_ID is 4 ");


	frmvalidator.addValidation("sub_group_id","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("group_status","maxlen=1","Max length for GROUP_STATUS is 1 ");


	frmvalidator.addValidation("group_status","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("group_name","maxlen=50","Max length for GROUP_NAME is 50 ");


	frmvalidator.addValidation("group_name","alnum_s","Please Enter alphabatic");

	
	frmvalidator.addValidation("group_id","maxlen=4","Max length for GROUP_ID is 4 ");


	frmvalidator.addValidation("group_id","alnum_s","Please Enter alphabatic");

	</script>