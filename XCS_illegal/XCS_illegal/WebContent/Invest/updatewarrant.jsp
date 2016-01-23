<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script language="JavaScript" src="js/gen_validatorv31.js" type="text/javascript"></script>
<form method="post" name="dataform" action="<c:url value="/process?action=Warrant&cmd=update"/>">
 <input type="hidden" name="id" value="${id}">
 <%@include file="searchwarrant_request_form.jsp"%>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
  //frmvalidator.addValidation("request_no","req","กรุณากรอกเลขที่คำร้อง");
  frmvalidator.addValidation("court_id","dontselect=0","กรุณาเลือก ขอหมายค้นจากศาล");
  frmvalidator.addValidation("request_date","req","กรุณากรอกวันที่ร้องขอ");
  frmvalidator.addValidation("staff_name_request","req","กรุณากรอกชื่อผู้ร้อง");
  frmvalidator.addValidation("career_request","req","กรุณากรอกอาชีพผู้ร้อง");
  frmvalidator.addValidation("office_address","req","กรุณากรอกที่อยู่สำนักงาน");
  frmvalidator.addValidation("age_request","req","กรุณากรอกอายุผู้ร้อง");
  frmvalidator.addValidation("search_datefrom","req","กรุณากรอกวันที่เข้าตรวจค้น");
  frmvalidator.addValidation("search_timefrom","req","กรุณากรอกเวลาที่เข้าตรวจค้น");
  frmvalidator.addValidation("search_cause","req","กรุณากรอกเหตุหรือพฤติการให้ออกหมายค้น");
</script>
