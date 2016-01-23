
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>


     <form method="post" name="dataform"  action="process?action=Invoice2&cmd=update" >
 
		<%@include file="invoice2_detail.jsp" %>
	 </form>
	 
<script type="text/javascript" >
		
	var frmvalidator  = new Validator("dataform");

 	frmvalidator.addValidation("inv_bookno","req","กรุณากรอกใบเสร็จเล่มที่");
 	frmvalidator.addValidation("inv_no","req","กรุณากรอกใบเสร็จเล่มที่");
 	frmvalidator.addValidation("compare_case_no","req","กรุณาเลือกเล่นที่เปรียบเทียบปรับ");
 
 	frmvalidator.addValidation("staff_receive_name","req","กรุณาเลือกผู้รับเงิน");
 	frmvalidator.addValidation("inv_date","req","กรุณากรอกวันที่ออกใบเสร็๗");
 	
 	</script>
  	