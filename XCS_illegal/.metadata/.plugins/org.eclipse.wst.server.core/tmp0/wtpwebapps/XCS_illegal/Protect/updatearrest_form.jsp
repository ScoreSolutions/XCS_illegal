<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>

<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<script language="JavaScript" src="js/gen_validatorv31.js" type="text/javascript"></script>
<%@ page import="com.ko.util.DateUtil" %>

<script type="text/javascript" src="js/sigslot_core.js"></script>
<script src="js/base.js" type="text/javascript"></script>
<script src="js/utility.js" type="text/javascript"></script>

<script type="text/javascript" src="js/MXWidgets.js"></script>
<script type="text/javascript" src="js/JSRecordset.js"></script>
<script type="text/javascript" src="js/DependentDropdown.js"></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>

<script type="text/javascript" language="JavaScript">

function printReports()
{
	var repName = document.getElementById("cmbPrintReports").value;
	var tn = document.dataform.track_no.value;
  	Reports.ReportUrl(function(data){
		if(data != ""){
			window.open(data + 'ReportName=' + repName + '&getTrackNo='+tn+'&vReportType=PDF&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}else{
			if (repName != ""){
				window.open('process?action=Report&__report=' + repName + '&__formatt=pdf&getTrackNo='+ tn + '&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}
		}
	});
}

function validateData(){
	var doc = document.dataform;   
   if(doc.have_culpri.checked==true && doc.laws_qty.value == 0){
		alert("คดีมีตัว กรุณาเพิ่มรายชื่อผู้กระทำผิด");
	  }
   else if(doc.onsubmit()!=false)
	   document.dataform.submit()
}

	
</script>

<style type="text/css">
	.frmBorder{position:absolute;width:200px; height:150px; border:#CCCCCC solid 1px;background:#CCCCCC;}
	.innerPosition{position:relative; top:10px;left:10px;right:5px;height:500px;}
</style>

<form method="post" name="dataform"  action="process?action=Arrest&cmd=update" >
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">บันทึกการจับกุม</span></td>
              </tr>
              <tr>
                <td colspan="2"><hr/></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>
					<input name="btnSave"  type="button"  class="barButton" value="บันทึก" onclick="validateData();" >
					<input name="btnCancel"  type="reset" class="barButton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขบันทึกการจับกุม');window.location.href='<c:url value="${action}" />'; ">
					<input name="btnBack"  type="button" class="barButton" value="กลับหน้าค้นหา" onclick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Arrest" />'; " >
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                    พิมพ์รายงาน :&nbsp;
                   <select name="cmbPrintReports" id="cmbPrintReports"  style="width:200px;">
                        <option value="" selected>เลือก</option>
                        <c:if test="${db.warrant_no == null}">
                        <option value="ILL2010">บันทึกการจับ ส.ส.2/39</option>
                        </c:if>
                        <c:if test="${db.warrant_no != null}">
                        <option value="ILL2011">บันทึกการค้นสิ่งของ ส.ส. 2/39ก</option>
                        <option value="ILL2012">บันทึกการตรวจค้นและจับ ส.ส. 2/39ข</option>
                        </c:if>
						<option value="ILL2009">รายงานการจับกุม ส.ส.2/6ก</option>
                   </select>
                   <input type="button" id="btnPrint" name="btnPrint" value="พิมพ์" onClick="printReports();" >
                </td>
              </tr>
              <tr>
                <td colspan="2"><hr/></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>

              <tr>
                <td> &nbsp;
                	<input name="chkcaselast" type="hidden" value="${db.chkcaselast}"></input>
                </td>
                <td >
                  <c:if test="${db.chkcaselast == 'Y'}">
                  	<%@include file="arrest_detailshow.jsp" %> <!-- รายละเอียดบันทึกการจับกุม-->
                  	
                  	<c:if test="${IsEditIndictment == 'Y'}">
                  		<%@include file="indictment.jsp" %>  <!-- ข้อกล่าวหา-->
                  	</c:if>
                  	<c:if test="${IsEditIndictment != 'Y'}">
                  		<%@include file="showindictment.jsp" %>  <!-- ข้อกล่าวหา-->
                  	</c:if>
                  </c:if>
                  <c:if test="${db.chkcaselast == 'N'}">
                  	<c:if test="${IsEdit == 'Y'}" >
	                  	<%@include file="arrest_detail.jsp" %>  <!-- รายละเอียดบันทึกการจับกุม-->
	                  	<%@include file="indictment.jsp" %>  <!-- ข้อกล่าวหา-->
                  	</c:if>
                  	<c:if test="${IsEdit == 'N'}" >
                  		<%@include file="arrest_detailshow.jsp" %> <!-- รายละเอียดบันทึกการจับกุม-->
                  		<%@include file="showindictment.jsp" %>  <!-- ข้อกล่าวหา-->
                  	</c:if>
                  </c:if>
                </td>
              </tr>
              <tr>
                 <td>&nbsp;</td>
                 <td colspan="2"> <hr /></td>
              </tr>
            </table>
                  <!-- รายละเอียดแท็บต่างๆ-->
                  <c:if test="${db.chkcaselast == 'Y'}">
                  	<%@include file="showarrest_tab.jsp" %>
                  </c:if>
                  <c:if test="${db.chkcaselast == 'N'}">
                  	<c:if test="${IsEdit == 'Y'}" >
                  		<%@include file="arrest_tab.jsp" %>
                  	</c:if>
                  	<c:if test="${IsEdit == 'N'}" >
                  		<%@include file="showarrest_tab.jsp" %>
                  	</c:if>
                  </c:if>
            </td>
         </tr>
     </table>
</form>
<c:if test="${SaveMSG == '1'}">
	<script>
		alert("บันทึกข้อมูลเรียบร้อย");
	</script>
</c:if>
<script language="JavaScript" type="text/javascript">

//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");

  frmvalidator.addValidation("department_name","req","กรุณากรอกชื่อหน่วยงาน");
  frmvalidator.addValidation("occurrence_date","req","กรุณากรอกวันที่เกิดเหตุ");
  frmvalidator.addValidation("occurrence_time","req","กรุณากรอกเวลาที่เกิดเหตุ");
  frmvalidator.addValidation("lawbreakertype","req","กรุณากรอกประเภทผู้ทำผิด");
   frmvalidator.addValidation("application_date","req","กรุณากรอกวันที่เขียนบันทึก");
  frmvalidator.addValidation("have_culpri","req","มีตัวผู้กระทำผิดหรือไม่");
  frmvalidator.addValidation("accuser","req","กรุณากรอกผู้กล่าวหา");
  frmvalidator.addValidation("scene_name","req","กรุณากรอกสถานที่เกิดเหตุ");
  frmvalidator.addValidation("scene_province","req","กรุณากรอกจังหวัดที่เกิดเหตุ");
  frmvalidator.addValidation("coordinate_y","dec","กรอกเป็นตัวเลข");
   frmvalidator.addValidation("coordinate_x","dec","กรอกเป็นตัวเลข");
   frmvalidator.addValidation("district","req","กรุณากรอกอำเภอที่เกิดเหตุ");
   frmvalidator.addValidation("tambol","req","กรุณากรอกตำบลที่เกิดเหตุ");
   frmvalidator.addValidation("accuserType","req","กรุณากรอกชนิดผู้กล่าวหา");
   frmvalidator.addValidation("offcode","dontselect=0","กรุณากรอกพี้นที่");
   frmvalidator.addValidation("legislation_id","dontselect=0","กรุณากรอก พ.ร.บ.");
	//frmvalidator.addValidation("product_group_id","dontselect=0","กรุณากรอกสินค้า.");
</script>

