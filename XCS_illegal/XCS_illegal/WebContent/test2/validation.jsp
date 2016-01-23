<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
  frmvalidator.addValidation("user_login","req","กรุณากรอก user_login");
  frmvalidator.addValidation("user_pass","req","กรุณากรอก user_pass");
</script>