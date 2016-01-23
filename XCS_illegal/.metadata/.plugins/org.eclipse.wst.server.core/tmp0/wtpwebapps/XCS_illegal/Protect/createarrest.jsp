<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@include file="/Templates/taglibs.jsp"%>
<script language="JavaScript" src="js/gen_validatorv31.js" type="text/javascript"></script>
<form method="post" name="dataform" >
 <%@include file="/Protect/arrest_form.jsp" %>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
  frmvalidator.addValidation("department_code","req","กรุณากรอกรหัสหน่วยงาน");
  frmvalidator.addValidation("department_name","req","กรุณากรอกชื่อหน่วยงาน");
  frmvalidator.addValidation("occurrence_date","req","กรุณากรอกวันที่เกิดเหตุ");
  frmvalidator.addValidation("reqDate","req","กรุณากรอกเวลาที่เกิดเหตุ");
  frmvalidator.addValidation("lawbreakertype","req","กรุณากรอกประเภทผู้ทำผิด");
  frmvalidator.addValidation("have_culpri","req","มีตัวผู้กระทำผิดหรือไม่");
  frmvalidator.addValidation("accuser","req","กรุณากรอกผู้กล่าวหา");
  frmvalidator.addValidation("scene_name","req","กรุณากรอกสถานที่เกิดเหตุ");
  frmvalidator.addValidation("province_code","dontselect=0","กรุณากรอกจังหวัดที่เกิดเหตุ");
</script>
