<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>


	

     <form method="post" name="dataform"  action="process?action=Sendexhibit&cmd=update" >
 
		<%@include file="send_exhibit_detail.jsp" %>
	 </form>


<script type="text/javascript" >
		
	var frmvalidator  = new Validator("dataform");

 	frmvalidator.addValidation("delivery_no1","req","กรุณากรอกเลขที่หนังสือส่ง");
 	frmvalidator.addValidation("delivery_no2","req","กรุณากรอกเลขที่หนังสือส่ง");
 	frmvalidator.addValidation("subject","req","กรุณากรอกเรื่อง");
 
 	frmvalidator.addValidation("legislation_id","req","กรุณากรอก พ.ร.บ.");
 	frmvalidator.addValidation("offcode_inform","req","กรุณากรอก เรียน ");
 	frmvalidator.addValidation("offcode_to","req","กรุณากรอกหน่วยงาน");
 	frmvalidator.addValidation("delivery_by_name","req","กรุณากรอกผู้นำส่ง");
 	frmvalidator.addValidation("delivery_date","req","กรุณากรอกวันที่");
 	</script>
  	
