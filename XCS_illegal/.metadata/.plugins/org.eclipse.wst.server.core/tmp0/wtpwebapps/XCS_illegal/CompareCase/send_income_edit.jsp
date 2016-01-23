

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript" language="JavaScript">
<!--
function toggle() {
 if( document.getElementById("a").checked ==false ){
  document.getElementById("hidethis").style.display = '';
  document.getElementById("hidethis2").style.display = '';
 }else{
  document.getElementById("hidethis").style.display = 'none';
  document.getElementById("hidethis2").style.display = 'none';
 }
}

function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}
//-->
</script>

	

     <form method="post" name="dataform"  action="process?action=Sendincome&cmd=update" >
 
		<%@include file="send_income_detail.jsp" %>
	 </form>
	
<script type="text/javascript" >

	var frmvalidator  = new Validator("dataform");

 	frmvalidator.addValidation("send_doc_no","req","กรุณากรอกเลขที่หนังสือส่ง");
 	frmvalidator.addValidation("posname_lean","req","กรุณากรอกเรียน");
 	frmvalidator.addValidation("staff_id_send_name","req","กรุณาเลือกชื่อผู้นำส่งเงิน");
 	frmvalidator.addValidation("send_date","req","กรุณากรอกเรื่อง");
 
 	frmvalidator.addValidation("offname_write","req","กรุณากรอก หน่วยงาน");
 	frmvalidator.addValidation("staff_id_approve_name","req","กรุณาเลือกผู้มีอำนาจลงนาม ");
 	frmvalidator.addValidation("offcode_area","req","กรุณากรอกหน่วยงาน");
 	
</script>

<c:if test="${SaveMSG == '1'}">
	<script>
		alert("บันทึกข้อมูลเรียบร้อย");
	</script>
</c:if>
  	