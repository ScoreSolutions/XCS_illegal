<%@ page contentType="text/html; charset=UTF-8" %>
<script type='text/javascript' src='dwr/interface/ConfigShareMoney.js'></script>
<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler"%>
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
</script>
<script type="text/JavaScript">
	function updateCourt(url){
		if(document.dataform.onsubmit()){
		document.dataform.action=url;
	    document.dataform.submit();
		}
	}
	function legislation()
	{
		var sumindex=document.getElementById("legislation_id_temp").selectedIndex;
		//alert("sumindex="+(sumindex+1));
		document.getElementById("legislation_id").value=(sumindex+1);
		var temp3 = "${configMoneyEdit.indictment_id}";
		var selValue = document.getElementById("legislation_id_temp").value;
		//alert(selValue);
		ConfigShareMoney.getIndictmentID(selValue,  function(data){
			dwr.util.removeAllOptions("penalty_case_law_id");
			dwr.util.addOptions( "penalty_case_law_id",[{id:"",name:"เลือก"}] , "id" , "name" );
			dwr.util.addOptions( "penalty_case_law_id", data , "id" , "name" );
			dwr.util.setValue("penalty_case_law_id", temp3);
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
<%
	FormHandler formHandler = new FormHandler(request);
%>
<form name="dataform" action="<c:url value="/process?action=ConfigShareMoneyPercent&cmd=update&id=${configMoneyEdit.id}"/>" method="post">
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
					<input name="btnSave"  type="submit" class="barbutton" value="บันทึก" >
					<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="javascript:location.href='<c:url value="/process?action=ConfigShareMoneyPercent&cmd=edit&by_id=${configMoneyEdit.id}"/>'" >
					<input name="btnBack"  type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="javascript:location.href='<c:url value="/process?action=ConfigShareMoneyPercent"/>'">
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
							  	<option value="${legis.legislation_code }" >${legis.legislation_name }</option>
							</c:forEach>
							</select>
							<input type="hidden" name="legislation_id" id="legislation_id"></input>
							<input type="hidden" name="id" value="${configMoneyEdit.id}"></input>
					
							<font style="color:red">*</font>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="checkbox" name="isnotice" value="${configMoneyEdit.isnotice}" <c:if test="${configMoneyEdit.isnotice == 'Y'}">checked="checked"</c:if>/>มีผู้แจ้งความ
						</td>
					  </tr>
					  <tr>
						<td height="25" align="right">% เงินส่งคลัง :&nbsp;</td>
						<td  colspan="3">
							<input type="text" name="treasury" class="textNum" OnKeyPress="ChkMinusDbl(this);" size="5" value="${configMoneyEdit.treasury }">
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
							<select name="penalty_case_law_id" id="penalty_case_law_id" style="width:860px;" >
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
						<script type="text/JavaScript">
							var t=${configMoneyEdit.legislation_id};
							var varDutyCode='${configMoneyEdit.duty_code}';  
							var varTypeCode='${configMoneyEdit.type_code}';
							document.getElementById('legislation_id_temp').selectedIndex = t-1;
							legislation();
							getDutyTable('${configMoneyEdit.duty_code}');
							producttype('${configMoneyEdit.duty_code}','${configMoneyEdit.type_code}');
							
							//document.getElementById('penalty_case_law_id').value = '${configMoneyEdit.penalty_case_law_id}';
							
						</script>
