<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>


<script language="javascript" type="text/javascript">
function winPopup(theURL,winName,features, myWidth, myHeight, isCenter) {

		if(window.screen)if(isCenter)if(isCenter=="true"){
			var myLeft = (screen.width-myWidth)/2;
			var myTop = (screen.height-myHeight)/2;
			features+=(features!='')?',':'';
			features+=',left='+myLeft+',top='+myTop;
		}
		window.open(theURL,winName,features+((features!='')?',':'')+'width='+myWidth+',height='+myHeight);

}


</script>
<style type="text/css">
<!--
.style7 {
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
}
-->
</style>

		



			<form method="post" name="dataform"  action="process?action=Outsideprove&cmd=update" >
 
		<%@include file="Outside_Prove_detail.jsp" %>
	 </form>
  <script type="text/javascript" >
		
	var frmvalidator  = new Validator("dataform");

 	frmvalidator.addValidation("ref_doc_no","req","กรุณากรอกเลขที่หนังสือจากหน่วยงานภายนอก");
 	frmvalidator.addValidation("doc_dept_name","req","กรุณากรอกชื่อหน่วยงาน");
 	frmvalidator.addValidation("job_time","req","กรุณากรอกเวลารับเรื่อง");
 
 	frmvalidator.addValidation("job_date","req","กรุณากรอกวันที่รับเรื่อง");
 	frmvalidator.addValidation("ref_doc_date","req","กรุณากรอกวันที่ลงหนังสือ ");
 	frmvalidator.addValidation("offcode","req","กรุณากรอกพื้นที่");
 	frmvalidator.addValidation("prove_no","req","กรุณากรอกเลขที่หนังสือส่งผลการพิสูจน์");
 	frmvalidator.addValidation("staff_id_prove_name","req","กรุณากรอกผู้พิสูจน์");
 	frmvalidator.addValidation("prove_date","req","กรุณากรอกวันที่พิสูจน์");
 	frmvalidator.addValidation("prove_objective","req","กรุณากรอกวัตถุประสงค์ในการตรวจพิสูจน์ ");
 	frmvalidator.addValidation("prove_result","req","กรุณากรอกผลการตรวจพิสูจน์ ");
 	
 	</script>

	

