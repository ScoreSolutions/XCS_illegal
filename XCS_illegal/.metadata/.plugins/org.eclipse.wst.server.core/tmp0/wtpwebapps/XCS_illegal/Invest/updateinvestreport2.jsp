<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script language="JavaScript" src="js/gen_validatorv31.js" type="text/javascript"></script>
<form id="dataform" name="dataform" method="post"   action="<c:url value="/process?action=Invest&cmd=saveData&id=${ai.id}"/>"  >
<!-- <input name="id" type="hidden" value="${ai.id}" >-->
 <%@include file="investReport2_form.jsp"%>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
  frmvalidator.addValidation("invest_no_1","req","กรุณากรอกเลขที่คดีสืบสวนที่");
  frmvalidator.addValidation("invest_no_2","req","กรุณากรอกเลขที่คดีสืบสวนที่");
  frmvalidator.addValidation("legislation_id","dontselect=0","กรุณาเลือกคดี พ.ร.บ.");
  frmvalidator.addValidation("invest_qty","req","กรุณากรอกแบบ สส.1 ครั้งที่ ");
 // frmvalidator.addValidation("reqDate","validedate","วันที่ร้องขอไม่ถูกต้อง");
  frmvalidator.addValidation("staff_name_invest","req","กรุณากรอกผู้สืบสวน");
  frmvalidator.addValidation("staff_command_name","req","กรุณากรอกผู้สั่งการให้สืบสวน");
  frmvalidator.addValidation("start_date","req","กรุณากรอกวันที่เริ่มทำการสืบสวน");
  frmvalidator.addValidation("start_time","req","กรุณากรอกเวลาเริ่มทำการสืบสวน");
  frmvalidator.addValidation("confidence_gauge","dontselect=0","กรุณาเลือกมาตรความเชื่อมั่นของแหล่งข่าว");
  frmvalidator.addValidation("news_value","dontselect=0","กรุณาเลือกค่าของเนื้อข่าว");
</script>