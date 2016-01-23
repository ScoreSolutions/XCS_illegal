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

		



	<form method="post" name="dataform"  action="process?action=ArrestReport&cmd=save" >
		<%@include file="ArrestReportDetail.jsp" %>
	</form>


  <script type="text/javascript" >
		
	var frmvalidator  = new Validator("dataform");

 	frmvalidator.addValidation("report_title","req","กรุณากรอกเรื่อง");
 	frmvalidator.addValidation("case_date","req","กรุณากรอกวันที่จับ");
 	frmvalidator.addValidation("accuser_name","req","กรุณากรอกชื่อและตำแหน่งผู้จับกุม");
 
 	frmvalidator.addValidation("staff_name_sue","req","กรุณากรอกลงชื่อ");
 	//frmvalidator.addValidation("ref_doc_date","req","กรุณากรอกวันที่ลงหนังสือ ");
 	//frmvalidator.addValidation("offcode","req","กรุณากรอกพื้นที่");
 	//frmvalidator.addValidation("prove_no","req","กรุณากรอกเลขที่หนังสือส่งผลการพิสูจน์");
 	//frmvalidator.addValidation("staff_id_prove_name","req","กรุณากรอกผู้พิสูจน์");
 	//frmvalidator.addValidation("prove_date","req","กรุณากรอกวันที่พิสูจน์");
 	//frmvalidator.addValidation("prove_objective","req","กรุณากรอกวัตถุประสงค์ในการตรวจพิสูจน์ ");
 	//frmvalidator.addValidation("prove_result","req","กรุณากรอกผลการตรวจพิสูจน์ ");
 	//frmvalidator.addValidation("legislation_id","req","กรุณากรอก พรบ ");
 	
 	</script>

	

