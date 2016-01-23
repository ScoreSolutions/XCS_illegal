<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>


<script type="text/javascript" src="js/sigslot_core.js"></script>
<script src="js/base.js" type="text/javascript"></script>
<script src="js/utility.js" type="text/javascript"></script>

<script type="text/javascript" src="js/MXWidgets.js"></script>
<script type="text/javascript" src="js/JSRecordset.js"></script>
<script type="text/javascript" src="js/DependentDropdown.js"></script>

   <%@ include file="/js/listtambon.jsp"%>

<script language="JavaScript" src="js/gen_validatorv31.js" type="text/javascript"></script>
<script type="text/javascript" language="JavaScript">

function printReports()
{
  alert("ยังไม่ได้บันทึก");
}

function validateData(){
	var doc = document.dataform;   
   if(doc.have_culpri.checked==true && doc.laws_qty.value == 0){
		alert("กรุณาเพิ่มรายชื่อผู้กระทำผิด");
	  }
   else if(doc.onsubmit()!=false)
	   document.dataform.submit()
}
</script>



<style type="text/css">
	.frmBorder{position:absolute;width:200px; height:150px; border:#CCCCCC solid 1px;background:#CCCCCC;}
	.innerPosition{position:relative; top:10px;left:10px;right:5px;height:500px;}
</style>

<form method="post" name="dataform"  action="process?action=Arrest&cmd=create" >
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">

              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%">
            <span class="websitename">บันทึกการจับกุม</span></td>
              </tr>
              <tr>
                <td colspan="2"><hr/></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>
					<input name="btnSave"  type="button" class="barButton"  value="บันทึก" onclick="validateData();">
					<input name="btnCancel"  type="reset" class="barButton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขบันทึกการจับกุม');window.location.href='<c:url value="${action}" />'; ">
					<input name="btnBack"  type="button" class="barButton" value="กลับหน้าค้นหา" onclick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Arrest" />'; " >
				</td>
              </tr>
              <tr <c:if test="${track_gen == 'NEW'}">style='display:none;'</c:if> >
                <td>&nbsp;</td>
                <td>
                    พิมพ์รายงาน :&nbsp;
                   <select name="cmbPrintReports" id="cmbPrintReports"  style="width:200px;" >
                        <option value="" selected>เลือก</option>
                        <option value="ApplicationArrest">บันทึกการจับ ส.ส.2/39</option>
                        <option value="ApplicationArrestSearch">บันทึกการค้นสิ่งของ ส.ส. 2/39ก</option>
                        <option value="ApplicationArrestSearchCatch">บันทึกการตรวจค้นและจับ ส.ส. 2/39ข</option>
						<option value="ApplicationArrestReport">รายงานการจับกุม ส.ส.2/6ก</option>
                        <option value="ReceiveExhibitNote">บันทึกการตรวจรับของกลาง</option>
                   </select>
                   <input type="button" id="btnPrint" name="btnPrint" value="พิมพ์" onClick="printReports();" class="barButton" >
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
                <td>&nbsp;</td>
                <td >
                  <!-- รายละเอียดบันทึกการจับกุม-->
                  <%@include file="arrest_detail.jsp" %>

                  <!-- ข้อกล่าวหา-->
                  <%@include file="indictment.jsp" %>
                </td>
              </tr>
              <tr>
                 <td>&nbsp;</td>
                 <td colspan="2"> <hr /></td>
              </tr>
            </table>
                  <!-- รายละเอียดแท็บต่างๆ-->
                  <%@include file="arrest_tab.jsp" %>
            </td>
          </tr>
          </table>
</form>
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
   frmvalidator.addValidation("offcode","req","กรุณากรอกพี้นที่");
   frmvalidator.addValidation("legislation_id","req","กรุณากรอกพ.ร.บ.");
frmvalidator.addValidation("product_group_id","req","กรุณากรอกสินค้า.");
</script>