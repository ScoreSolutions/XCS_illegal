<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script language="JavaScript" src="js/gen_validatorv31.js" type="text/javascript"></script>
<form method="post" name="dataform" action="<c:url value="/process?action=Impeachment&cmd=create"/>">

 <%@include file="book_impeachment_form.jsp"%>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
  frmvalidator.addValidation("case_id_1","req","กรุณากรอกเลขที่คดี");
  frmvalidator.addValidation("case_id_2","req","กรุณากรอกเลขที่คดี");
  frmvalidator.addValidation("case_date","req","กรุณากรอกวันที่รับคดี");
  frmvalidator.addValidation("case_time","req","กรุณากรอกเวลารับคดี");
   frmvalidator.addValidation("staff_name","req","กรุณากรอกเจ้าหน้าที่ดำเนินคดี");


</script>