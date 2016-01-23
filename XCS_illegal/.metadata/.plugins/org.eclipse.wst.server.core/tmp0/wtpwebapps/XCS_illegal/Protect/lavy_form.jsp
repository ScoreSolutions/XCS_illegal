<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>

<%@ include file="/Templates/taglibs.jsp"%>


     <form method="post" name="dataform"  action="process?action=Lavy&cmd=create" >
 
		<%@include file="lavy_detail.jsp" %>
	 </form>
<script type="text/javascript" >
		
	var frmvalidator  = new Validator("dataform");

	frmvalidator.addValidation("order_no","req","กรุณากรอกเลขที่คำสั่งอายัด ");
 	frmvalidator.addValidation("seize_date","req","กรุณากรอกวันที่อายัด ");
 	frmvalidator.addValidation("track_no","req","กรุณากรอกเลขที่บันทึกการจับกุม ");
	

 </script>
  	