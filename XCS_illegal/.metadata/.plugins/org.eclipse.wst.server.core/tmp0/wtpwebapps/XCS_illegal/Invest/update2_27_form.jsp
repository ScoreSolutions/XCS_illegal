<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script language="JavaScript" src="js/gen_validatorv31.js" type="text/javascript"></script>
<form method="post" name="dataform" action="<c:url value="/process?action=Guarantee&cmd=update"/>">
 <input type="hidden" name="id" value="${asf.id}" >
 <%@include file="2_27_form.jsp"%>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
  frmvalidator.addValidation("offcode","req","กรุณากรอกเขียนที่");
  frmvalidator.addValidation("track_no","req","กรุณากรอกเลขที่งาน");
  frmvalidator.addValidation("detect_date","req","กรุณากรอกวันที่ตรวจค้น ");
  frmvalidator.addValidation("staff_name_detect","req","กรุณากรอกผู้ตรวจค้น");
  frmvalidator.addValidation("detect_time","req","กรุณากรอกเวลาที่ตรวจค้น");

</script>