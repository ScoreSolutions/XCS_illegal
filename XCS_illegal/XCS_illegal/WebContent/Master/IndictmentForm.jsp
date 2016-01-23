<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.ko.webapp.util.FormHandler"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%
	FormHandler formHandler = new FormHandler(request);
%>
<script type="text/JavaScript">
  function chkIsFine()
  {
	if(document.getElementById("isfine").checked==true)
	{
		document.getElementById("fine_rate").disabled=false;
		document.getElementById("fine_rate").className="textbox";

	}else
	{
		document.getElementById("fine_rate").disabled=true;
		document.getElementById("fine_rate").className="textView";
		document.getElementById("fine_rate").value="";
	}
  }
</script>
<form name="dataform" action="<c:url value="/process?action=Indectment_Master&cmd=create"/>" method="post">
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">

              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%">
					<span class="websitename">ข้อกล่าวหา</span>
				 </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="15">&nbsp;</td>
              </tr>
			  <tr>
				<td >&nbsp;</td>
				<td>
					<input name="btnSave"  type="submit" class="barButton" value="บันทึก" >
					<input name="btnCancel"  type="button" class="barButton" value="ยกเลิกการแก้ไข" onclick="javascript:location.href='<c:url value="/process?action=Indectment_Master&cmd=add"/>'">
					<input name="btnBack"  type="button" class="barButton" value="กลับหน้าค้นหา" onclick="javascript:location.href='<c:url value="/process?action=Indectment_Master&cmd=list&law_id=90"/>'">
				</td>
			  </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="25">&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="800" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td height="25" align="right">เลขที่งาน :&nbsp;</td>
                    <td colspan="3">
						<input type="text" name="guilt_mst_id" class="textView" size="25" value="${key}" readonly="readonly">
					</td>
                  </tr>
                  <tr>
                    <td height="25" align="right">พ.ร.บ. :&nbsp;</td>
                    <td colspan="3">
                        <select name="law_id" id="law_id" style="width:200" >
                          <c:forEach items="${legisList}"  var="legis" >
							  	<option value="${legis.legislation_code }" >${legis.legislation_name }</option>
						  </c:forEach>
                        </select>
                        <font style="color:red">*</font>
					</td>
                  </tr>
				  <tr>
                    <td height="25" align="right">กระทำผิดมาตรา :&nbsp;</td>
                    <td >
						<input type="text" name="case_law_id" class="textbox" size="28">
						<font style="color:red">*</font>
				    </td>
					<td colspan="2"><input type="checkbox" name="exhibit_wild" value="1" />ของกลางเถื่อน</td>
                  </tr>
				  <tr>
					<td  align="right" valign="top">ฐานความผิด :&nbsp;</td>
					<td colspan="3">
						<textarea name="guilt_base" cols="50" rows="3"  ></textarea>
						<font style="color:red">*</font>
					</td>
				  </tr>
				  <tr>
                    <td height="25" align="right">บทกำหนดโทษมาตรา :&nbsp;</td>
                    <td >
						<input type="text" name="penalty_case_law_id" class="textbox" size="28">
						<font style="color:red">*</font>
				    </td>
                    <td height="25" align="right">บทกำหนดโทษ อัตราโทษ :&nbsp;</td>
                    <td >
						<input type="text" name="penalty_desc" class="textbox" size="28">
						<font style="color:red">*</font>
				    </td>
                  </tr>
				  <tr>
                    <td height="25" align="right">มีค่าปรับหรือไม่ :&nbsp;</td>
                    <td >
						<input type="radio" id="isfine" name="isfine" onClick="chkIsFine();" value="Y" checked />มี&nbsp;&nbsp;
						<input type="radio" id="isfine" name="isfine" onClick="chkIsFine();" value="N" />ไม่มี&nbsp;&nbsp;
						<input type="radio" id="isfine" name="isfine" onClick="chkIsFine();" value="0"  />ไม่ระบุ
				    </td>
                    <td height="25" align="right">อัตราค่าปรับ :&nbsp;</td>
                    <td >
						<input type="text" name="fine_rate" class="textbox"  size="28">
				    </td>
                  </tr>
				  <tr>
                    <td height="25" align="right">มีโทษจำคุกหรือไม่ :&nbsp;</td>
                    <td colspan="3">
						<input type="radio" id="isimprison" name="isimprison"  value="Y" />มี&nbsp;&nbsp;
						<input type="radio" id="isimprison" name="isimprison"  value="N" />ไม่มี&nbsp;&nbsp;
						<input type="radio" id="isimprison" name="isimprison"  value="0" checked />ไม่ระบุ
				    </td>
                  </tr>
                  <tr>
                    <td height="25" align="right">&nbsp;</td>
                    <td colspan="3">
						<input type="checkbox" name="is_prove" id="is_prove"  checked />ต้องทำการพิสูจน์ของกลาง
				    </td>
                  </tr>
				  <tr>
					<td  align="right" valign="top">หมายเหตุ :&nbsp;</td>
					<td colspan="3">
						<textarea name="remarks" cols="50" rows="3" ></textarea>
					</td>
				  </tr>
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>


            </table></td>
		  </tr>
		</table>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
var frmvalidator  = new Validator("dataform");
	//frmvalidator.addValidation("penalty_desc","maxlen=200","Max length for PENALTY_DESC is 200 ");
	//frmvalidator.addValidation("penalty_case_law_id","maxlen=100","Max length for PENALTY_CASE_LAW_ID is 100 ");
	//frmvalidator.addValidation("guilt_base","maxlen=200","Max length for GUILT_BASE is 200 ");
	frmvalidator.addValidation("law_id","req","กรุณาเลือก พ.ร.บ.");
	frmvalidator.addValidation("case_law_id","req","กรุณาระบุกระทำผิดมตรา");
	frmvalidator.addValidation("guilt_base","req","กรุณาระบุฐานความผิด");
	frmvalidator.addValidation("penalty_case_law_id","req","กรุณาระบุบทกำหนดโทษ มาตรา");
	frmvalidator.addValidation("penalty_desc","req","กรุณาระบุบทกำหนดโทษ อัตราโทษ");
	//frmvalidator.addValidation("case_law_id","maxlen=100","Max length for CASE_LAW_ID is 100 ");
	
	//frmvalidator.addValidation("law_id","maxlen=20","Max length for LAW_ID is 20 ");
	
</script>
