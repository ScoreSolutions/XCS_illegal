<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/ConfigShareMoney.js'></script>
<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>
<script type="text/JavaScript">
  function chkIsFine()
  {
	if(document.getElementById("rdiIsFineY").checked==true)
	{
		document.getElementById("txtFineRate").disabled=false;
		document.getElementById("txtFineRate").className="textbox";

	}else
	{
		document.getElementById("txtFineRate").disabled=true;
		document.getElementById("txtFineRate").className="textView";
		document.getElementById("txtFineRate").value="";
	}
  }
  function mu1(){
	  alert(document.getElementById("duty_code").value);
  }
  function mu2(){
	  alert(document.getElementById("type_code").value);
  }
  function checkPercent(){
	  var treasury =document.dataform.treasury.value;
	  var bribe = document.dataform.bribe.value;
	  var reward = document.dataform.reward.value;

	  if((parseInt(treasury)+parseInt(bribe)+parseInt(reward)) != 100){
		  alert("เงินส่งคลัง เงินสินบน เงินรางวัล ไม่เท่ากับ 100%");
		  document.getElementById("treasury").select();
	  }else{
		  //updateCourt('<c:url value="/process?action=ConfigShareMoneyPercent&cmd=create"/>');
		  updateCourt('<c:url value="/process?action=ConfigShareMoneyPercent&cmd=save"/>');
	  }
  }
  function updateCourt(url){
		if(document.dataform.onsubmit()){
			document.dataform.action=url;
		    document.dataform.submit();
		}
	}
</script>
<script type="text/JavaScript">
	function backpage(){
		window.location.href='<c:url value="/process?action=ConfigShareMoneyPercent" />';
	}
	function legislation()
	{
		var selValue = document.getElementById("legislation_id_temp").value;
		ConfigShareMoney.getIndictmentID(selValue,  function(data){
			dwr.util.removeAllOptions("indictment_id");
			dwr.util.addOptions( "indictment_id",[{id:"",name:"เลือก"}] , "id" , "name" );
			dwr.util.addOptions( "indictment_id", data , "id" , "name" );
			dwr.util.setValue("indictment_id", "${configMoneyEdit.indictment_id}");
		});
	}

function getDutyTable(vDutyCode){
		
		LegislationProduct.getDutyTable(document.getElementById("legislation_id_temp").value, function(data){
			dwr.util.removeAllOptions("duty_code");
			dwr.util.addOptions("duty_code",[{duty_code:"",duty_name:"เลือก"}], "duty_code", "duty_name");
			dwr.util.addOptions("duty_code",data,"duty_code", "duty_name");

			if(vDutyCode != "" && vDutyCode != null)
				dwr.util.setValue("duty_code", vDutyCode);

			dwr.util.removeAllOptions("type_code");
			dwr.util.addOptions("type_code",[{type_code:"",type_name:"เลือก"}], "type_code", "type_name");
		})
	}
	
	function producttype(selProduct,vTypeCode)
	{
		ConfigShareMoney.getProductTtpe(selProduct, function(data){
			dwr.util.removeAllOptions("type_code");
			//dwr.util.setValue("type_code","เลือก");
			//dwr.util.removeAllOptions("type_code");
			dwr.util.addOptions("type_code", [{code:"",name:"เลือก"}], "code" , "name");
			dwr.util.addOptions("type_code", data , "code" , "name");

			if(vTypeCode != "" && vTypeCode != null)
				dwr.util.setValue("type_code", vTypeCode)
		});
	}

</script>
<%@page import="com.ko.webapp.util.FormHandler"%>
<%
	FormHandler formHandler = new FormHandler(request);
%>
<form name="dataform" action="" method="post">
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">

              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%">
					<span class="websitename">ข้อมูลเปอร์เซ็นการแบ่งเงิน</span>
				 </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="15">&nbsp;</td>
              </tr>
			  <tr>
				<td >&nbsp;</td>
				<td>
					<input name="btnSave"  type="button" class="barbutton" value="บันทึก"  onclick="checkPercent();" >
					
					<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="javascript:location.href='<c:url value="/process?action=ConfigShareMoneyPercent&cmd=add"/>'">
					
					<input name="btnBack"  type="button" class="barbutton" value="กลับหน้าค้นหา" onClick="backpage();">
				</td>
			  </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="25">&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
					<table width="950" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td height="25" align="right">พ.ร.บ. :&nbsp;</td>
						<td colspan="3" >
							<select name="legislation_id_temp" id="legislation_id_temp" style="width:200" onChange="legislation();getDutyTable('');" >
							<c:forEach items="${listLegis}"  var="legis" >
							  	<option value="${legis.legislation_code }" <c:if test = "${legis.legislation_code == lgCode}">selected</c:if> >${legis.legislation_name }</option>
							</c:forEach>
							</select>
							<input type="hidden" name="id" value="${configMoneyEdit.id}"></input>
					
							<font style="color:red">*</font>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="checkbox" name="isnotice" id="isnotice" value="${configMoneyEdit.isnotice}" <c:if test="${configMoneyEdit.isnotice == 'Y'}">checked="checked"</c:if>/>มีผู้แจ้งความ
						</td>
					  </tr>
					  <tr>
						<td height="25" align="right">% เงินส่งคลัง :&nbsp;</td>
						<td  colspan="3">
							<input type="text" id="treasury" name="treasury" class="textNum" OnKeyPress="ChkMinusDbl(this);" size="5" value="${configMoneyEdit.treasury }">
							<font style="color:red">*</font>
							
							&nbsp;&nbsp;
							% เงินสินบน :&nbsp;
							<input type="text" name="bribe" class="textNum" OnKeyPress="ChkMinusDbl(this);" size="5" value="${configMoneyEdit.bribe}">
							<font style="color:red">*</font>
							&nbsp;&nbsp;
							
							
							% เงินรางวัล :&nbsp;
							<input type="text" name="reward" class="textNum" OnKeyPress="ChkMinusDbl(this);" size="5" value="${configMoneyEdit.reward}">
							<font style="color:red">*</font>
						</td>
					  </tr>
					  <tr>
						<td height="25" align="right">เงินสินบนสูงสุด :&nbsp;</td>
						<td colspan="3">
							<input type="text" name="bribe_limit"  class="textNum" OnKeyPress="ChkMinusDbl(this);" size="10" value="${configMoneyEdit.bribe_limit}">
							<font style="color:red">*</font>&nbsp;บาท&nbsp;&nbsp;&nbsp;
							<i>กรณีไม่จำกัดจำนวนเงินสินบนสูงสุด ให้กำหนดค่าเป็น 0</i>
						</td>
					  </tr>
					  <tr>
						<td height="25" align="right">เงินรางวัลสูงสุด :&nbsp;</td>
						<td colspan="3">
							<input type="text" name="reward_limit"  class="textNum" OnKeyPress="ChkMinusDbl(this);" size="10" value="${configMoneyEdit.reward_limit}">
							<font style="color:red">*</font>&nbsp;บาท&nbsp;&nbsp;&nbsp;
							<i>กรณีไม่จำกัดจำนวนเงินรางวัลสูงสุด ให้กำหนดค่าเป็น 0</i>
						</td>
					  </tr>
					  <tr><td colspan="4">&nbsp;</td></tr>
					  <tr>
						<td height="25" align="right">กระทำผิดมาตรา :&nbsp;</td>
						<td colspan="3" >
							<select name="indictment_id" id="indictment_id" style="width:860px;" >
								<option value="" selected >เลือก</option>
							</select>
						</td>
					  </tr>
					  <tr>
						<td height="25" align="right">สินค้า :&nbsp;</td>
						<td colspan="3" >
							<select name="duty_code" id="duty_code" style="width:860px;" onchange="producttype(this.value,'');" >
								<option value="" selected>เลือก</option>
							</select>
						</td>
					  </tr>
					  <tr>
					  <td height="25" align="right">ชนิดสินค้า :&nbsp;</td>
					  <td colspan="3" >
			
							<select name="type_code" id="type_code" style="width:860px;">
								<option value="" selected>เลือก</option>
							</select>
						</td>
						</tr>

					</table>
				  </td>
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

  //frmvalidator.addValidation("legislation_id_temp","dontselect=0","กรุณาเลือก พ.ร.บ");
  frmvalidator.addValidation("bribe","req","กรุณาป้อน เงินสินบน");
  frmvalidator.addValidation("bribe","numeric");
  frmvalidator.addValidation("reward","req","กรุณาป้อน เงินรางวัล");
  frmvalidator.addValidation("reward","numeric");
  frmvalidator.addValidation("treasury","req","กรุณาป้อน เงินส่งคลัง");
  frmvalidator.addValidation("treasury","numeric");
  frmvalidator.addValidation("bribe_limit","req","กรุณาป้อน เงินสินบนสูงสุด");
  //frmvalidator.addValidation("bribe_limit","numeric");
  frmvalidator.addValidation("reward_limit","req","กรุณาป้อน เงินรางวัลสูงสุด");
  //frmvalidator.addValidation("reward_limit","numeric");

  
</script>

<script>
	legislation();
	getDutyTable('${configMoneyEdit.duty_code}');
	producttype('${configMoneyEdit.duty_code}','${configMoneyEdit.type_code}');
</script>
