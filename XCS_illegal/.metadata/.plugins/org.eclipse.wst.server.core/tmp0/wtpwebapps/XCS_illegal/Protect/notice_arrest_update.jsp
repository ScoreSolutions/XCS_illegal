<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<form method="post" name="dataform" action="<c:url value="/process?action=NoticeArrest&cmd=update"/>">
<input name="id" type="hidden" value="${ana.id }">
<%@include file="notice_arrest_insert.jsp"%>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
  frmvalidator.addValidation("offcode","req","กรุณาเลือกหน่วยงาน");
  frmvalidator.addValidation("legislation_id","dontselect=0","กรุณาระบุความผิดตาม พ.ร.บ.");
  frmvalidator.addValidation("duty_code","dontselect=0","กรุณาระบุเลือกชนิดสินค้า.");
  frmvalidator.addValidation("notice_date","req","กรุณากรอกวันที่ร้องขอ");
  frmvalidator.addValidation("notice_time","req","กรุณากรอกเวลาที่ร้องขอ");
  frmvalidator.addValidation("lawbreaker_name","req","กรุณากรอกชื่อผู้กระทำผิด");
  //frmvalidator.addValidation("staff_name_accept","req","กรุณาระบุชื่อผู้รับมอบฉันทะ");
  //frmvalidator.addValidation("staff_name_commander","req","กรุณาระบุผู้บังคับบัญชา");
  //frmvalidator.addValidation("next_step","req","กรุณาระบุแนวทางการดำเนินการ");
  frmvalidator.addValidation("inform_type","req","กรุณาเลือกประเภทผู้แจ้งความ");
  frmvalidator.addValidation("inform_name","req","กรุณากรอกชื่อผู้แจ้งหรือนามแฝง");
  frmvalidator.addValidation("staff_name_receive","req","กรุณาระบุชื่อผู้รับแจ้งความนำจับ");
  frmvalidator.addValidation("inform_lean","req","กรุณาระบุตำแหน่งของผู้มีอำนาจสั่งจ่าย");
  

</script>
