<%@ page import="com.ko.webapp.util.PageUtil" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ include file="/Templates/meta.jsp" %>

<%
	PageUtil pageUtil = new PageUtil(request);
%>
<%@page import="com.ko.webapp.util.FormHandler"%>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>
<script type='text/javascript' src='dwr/interface/DutyTable.js'></script>
<script type='text/javascript' src='dwr/interface/DutyGroup.js'></script>
<script type='text/javascript' src='dwr/interface/Exhibit.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>
<script type="text/javascript" >

	function setGroupID(group_id, vLegislationID, vGroupID){

		LegislationProduct.getDutyGroup(vLegislationID,function(data){
			dwr.util.removeAllOptions(group_id);
			if (vLegislationID != ""){
				dwr.util.addOptions(group_id,data,"group_id","group_name");
				if(vGroupID!=null && vGroupID!="" ){
					dwr.util.setValue(group_id,vGroupID);
				}else{
					vGroupID = dwr.util.getValue(group_id);
				}
			}else
			{
				dwr.util.addOptions(group_id,{"":"โปรดเลือก"});
			}

			getDutyTable("duty_code",vGroupID ,"");
			getDutyUnit(vGroupID,"QTY","qty_unit_code","");
			getDutyUnit(vGroupID,"SIZES","sizes_unit_code","");
			getDutyUnit(vGroupID,"NETWEIGHT","netweight_unit_code","");
		});
	}
	
	function getGroupID(id,groupID_sel,packageSize_id,sizePackage_sel){
		DutyGroup.getDutyGroup(function(data){
			dwr.util.addOptions(id,{"":"โปรดเลือก"});
			dwr.util.addOptions(id,data,"group_id","group_name");
			dwr.util.setValue(id,groupID_sel);
		});
	}
	
	function getDutyTable(id,group_idVal,dutyTable_sel){
	  	DutyTable.getDutyTable(group_idVal,function(data){
	  		dwr.util.removeAllOptions(id);
	  		dwr.util.addOptions(id,{"":"โปรดเลือก"});
	  		dwr.util.addOptions(id,data,"duty_code","duty_name");
	  		dwr.util.setValue(id,dutyTable_sel);
	  	});
	  }
	  
	  function getDutyUnit(vGroupID,vUsedFor, cmbUnit, vUnitCode){
		DutyGroup.getDutyUnit(vGroupID,vUsedFor,function(data){
			dwr.util.removeAllOptions(cmbUnit);
			dwr.util.addOptions(cmbUnit,{"":"โปรดเลือก"});
			dwr.util.addOptions(cmbUnit,data,"unit_code","unit_name");
			dwr.util.setValue(cmbUnit,vUnitCode);
		});
	  }

	  	setGroupID("group_id", "${si.legislation_id}", "${si.group_id}")
	  	getDutyTable("duty_code","${si.group_id}" ,"${si.duty_code}");
		getDutyUnit("${si.group_id}","QTY","qty_unit_code","${si.qty_unit_code}");
		getDutyUnit("${si.group_id}","SIZES","sizes_unit_code","${si.sizes_unit_code}");
		getDutyUnit("${si.group_id}","NETWEIGHT","netweight_unit_code","${si.netweight_unit_code}");
	  
	  function brandopenmodal()
	  {
	  	if(document.dataform.group_id.value != "")
	  		window.showModalDialog('process?action=Brand_pop&cmd=list&p=Y&duty='+document.getElementById('duty_code').options.value+ '&group_id=' + document.getElementById('group_id').value +'&textCode=brand_code&textName=brand_name' , self , 'dialogWidth=700px,Height=400px');
	  	else{
	  		alert("กรุณาเลือกประเภทสินค้า");
	  		document.dataform.group_id.focus();
	  	}
	  }

	  function Valid(){
		if(jQuery('#legislation_id').val()==""){
			alert("กรุณาเลือก พ.ร.บ.");
			return false;
		}else if(jQuery('#delivery_code').val()==""){
			alert("กรุณาระบุเลขที่ใบนำส่ง");
			jQuery('#delivery_code').focus();
			return false;
		}else if(jQuery('#delivery_date').val()==""){
			alert("กรุณาระบุวันที่นำส่ง");
			jQuery('#delivery_date').focus();
			return false;
		}else if(jQuery('#group_id').val()==""){
			alert("กรุณาเลือกประเภทสินค้า");
			jQuery('#group_id').focus();
			return false;
		}else{
			return true;
		}
	  }

	  function confirmBox(str_text,var_id){
		var r
		r = confirm(str_text);
  		if(r){
  	  		window.location.href='<c:url value="/process?action=StockInitial&cmd=Delete&id='+var_id+'"/>';
 		}	
  		return r;
	}
</script>
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		<td width="100%" align="left" valign="top">
		 	<table width="1000" border="0" cellspacing="0" cellpadding="0">
		 		<tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ข้อมูลสินค้าตั้งต้น</span></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                	<td colspan="2" >
	                    <form action="process?action=StockInitial&cmd=Save" name="dataform" method="post" onsubmit="return Valid();" >
							<table width="800" border="0" cellspacing="0" cellpadding="0" align="center">
								  <tr height="25px">
										<td width="20%" align="right">หน่วยงาน :
											<input name="id" id="id" type="hidden" value="${si.id}"  ></input>
											<input name="offcode" id="offcode" type="text" value="${offcode }" style="display:none" ></input>
										</td>
										<td width="80%">${offname }</td>
								  </tr>
								  <tr>
										<td align="right">พ.ร.บ. :&nbsp;</td>
										<td >
											<select name="legislation_id" id="legislation_id" style="width:300px;" onchange="setGroupID('group_id',this.value,'');" >
											     <option value="" selected>เลือก</option>
					            				<c:forEach items="${ltlist}"  var="ltion">
					            					<option value="${ltion.id}" <c:if test="${si.legislation_id == ltion.id}">selected</c:if> >${ltion.legislation_code} ${ltion.legislation_name}</option>
					            				</c:forEach>
											</select>
											<font style="color:red">*</font>
										</td>
								  </tr>
								  <tr>
										<td align="right">เลขที่นำส่ง/เลขที่คดี :&nbsp;</td>
										<td >
											<input name="delivery_code" id="delivery_code" type="text" size="25" maxlength="50" value="${si.delivery_code}">
											<font style="color:red">*</font>
										</td>
								  </tr>
								  <tr>
								  		<td align="right">วันที่นำส่ง/วันที่คดี :</td>
										<td >
											<input name="delivery_date" type="text" id="delivery_date" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${si.delivery_date2}">
                                            <a href="javascript:NewCssCal('delivery_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>&nbsp;
                                            <font style="color:red">*</font>
										</td>
								  </tr>
								  <tr>
							            <td  align="right">&nbsp;</td>
							            <td >
							              <input type="radio" name="isdomestic1" value="I" <c:if test="${si.isdomestic == 'I' || isdomestic1 == null}"> checked </c:if>  />ในประเทศ&nbsp;&nbsp;&nbsp;
							              <input type="radio" name="isdomestic1" value="O" <c:if test="${si.isdomestic == 'O'}"> checked </c:if> />ต่างประเทศ&nbsp;&nbsp;&nbsp;
							              <input type="radio" name="isdomestic1" value="Z" <c:if test="${si.isdomestic == 'Z'}"> checked </c:if> />ไม่ระบุ
							            </td>
							       </tr>
							       <tr>
							     		<td height="25" align="right">ประเภทสินค้า :&nbsp;</td>
							     		<td>
							     			<select id="group_id" name="group_id" style="width:300px"
							     			 onChange="getDutyTable('duty_code',this.value);
							     			 getDutyUnit(this.value,'SIZES','sizes_unit_code','');
							     			 getDutyUnit(this.value,'QTY','qty_unit_code','');
							     			 getDutyUnit(this.value,'NETWEIGHT','netweight_unit_code','');" >
							     			</select>
							     			<font style="color:red">*</font>
							     		</td>
							     	</tr>
								  	<tr>
										<td  height="25" align="right">ชนิดสินค้า :&nbsp;</td>
										<td >
											<select name="duty_code" id="duty_code"  style="width:300px;" >
											</select>
										</td>
								    </tr>
								    <tr>
							          <td align="right">ยี่ห้อ :&nbsp;</td>
							          <td >
							               <input id="brand_code" name="brand_code" type="text" size="10" value="${si.brand_code }" />
							               <img src="images/btn_browse.png" alt="" width="18" height="18" border="0" style="cursor:pointer" onClick="brandopenmodal();" />
							               <input id="brand_name" name="brand_name" type="text" size="30" class="textview" value="${si.brand_main_name }"  />
							          </td>
							       </tr>
							       <tr>
							          <td align="right">ขนาดบรรจุ :&nbsp;</td>
							          <td >
							          		<input type="text" class="textNum" value="${si.sizes_desc }" name="sizes_desc" id="sizes_desc" size="11" onkeypress="ChkMinusDbl(this);"  />&nbsp;
							              	หน่วย :
							               <select name="sizes_unit_code" id="sizes_unit_code" class="select" >
							               		<option  value="" selected>โปรดเลือก</option>
							               </select>
							          </td>
							       </tr>
							       <tr>
							          <td align="right">จำนวน :&nbsp;</td>
							          <td >
											<input name="qty" id="qty" type="text" value="${si.qty }" class="textNum"   size="11" onkeypress="ChkMinusInt(this);"/>&nbsp;
							               		หน่วย :
							               <select name="qty_unit_code" id="qty_unit_code" class="select" onChange='data[23]=document.formdata1.qty_unit_code.options[selectedIndex].text'>
							                    <option  value="" selected>โปรดเลือก</option>
							               </select>
							          </td>
							       </tr>
							       <tr>
							          <td align="right">ปริมาณสุทธิ :&nbsp;</td>
							          <td >
											<input name="netweight" id="netweight" value="${si.netweight }" type="text" class="textNum"   onkeypress="ChkMinusDbl(this);" size="11" />&nbsp;
							               		หน่วย :
							               <select name="netweight_unit_code" id="netweight_unit_code" class="select" onChange='data[24]=document.formdata1.netweight_unit_code.options[selectedIndex].text;'>
							                    <option  value="" selected>โปรดเลือก</option>
							               </select>
							          </td>
							       </tr>
							       <tr>
										<td  height="25" align="right">หมายเหตุ :&nbsp;</td>
										<td >
											<input name="remarks" id="remarks" type="text" value="${si.remarks }"  size="43" />
											<input name="status" id="status" type="hidden" value="${si.status }" />
										</td>
								    </tr>
							       <tr><td colspan="2">&nbsp;</td></tr>
							       <tr>
							       		<td >&nbsp;</td>
							       		<td >
							       			<input name="btnSave"  type="submit" class="barbutton" value="บันทึก" >
											<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" onClick = "canceledit()" >
							       		</td>
							       </tr>
							       <tr><td colspan="2">&nbsp;</td></tr>
							</table>
	                    </form>
                	</td>
                </tr>
                <tr>
                	<td>&nbsp;</td>
                	<td><b>รายละเอียดสินค้า</b></td>
                </tr>
                <tr>
                 	<td>&nbsp;</td>
                  	<td >	
           				<table class="tableList" width="1000" border="1" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
           				  <tr>
                       		<td width="80" class="TblHeaderColumn AlignCenter">&nbsp;</td>
                       		<td width="80" class="TblHeaderColumn">เลขที่หนังสือนำส่ง</td>
                       		<td width="60" class="TblHeaderColumn">วันที่นำส่ง</td>
                       		<td width="150" class="TblHeaderColumn">พ.ร.บ.</td>
                       		<td width="100" class="TblHeaderColumn">ประเภทสินค้า</td>
                       		<td width="100" class="TblHeaderColumn">ชนิดสินค้า</td>
                       		<td class="TblHeaderColumn">ยี่ห้อ</td>
                       		<td width="150" class="TblHeaderColumn">รายละเอียด</td>
                       		<td width="50" class="TblHeaderColumn">หมายเหตุ</td>
                       		<td width="80" class="TblHeaderColumn">สถานะ</td>
                     	  </tr>
           				  
	           			 	<c:forEach items="${siList}"  var="stock" varStatus="i">		  						
		                       	<c:if test="${(i.count % 2) == 1}">
				                    <tr>			                            		
			                           	<td class="TblRow AlignCenter"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=StockInitial&cmd=Update&id="/>${stock.id}'">แก้ไข</span> | <span class="spanLink"  onclick="confirmBox('ต้องการลบข้อมูล','${stock.id}')">ลบ</span></td>
			                           	<td class="TblRow AlignCenter">${stock.delivery_code}</td>
			                           	<td class="TblRow AlignCenter">${stock.delivery_date2 }</td>
			                           	<td class="TblRow AlignLeft">${stock.legislation_name}</td>
			                           	<td class="TblRow AlignLeft">${stock.group_name}</td>
								  		<td class="TblRow AlignLeft">${stock.duty_name}</td>
								  		<td class="TblRow AlignLeft">${stock.brand_main_name}</td>
								  		<td class="TblRow AlignLeft">
								  			ขนาด ${stock.sizes_desc} ${stock.sizes_unit_name}<br />
								  			จำนวน ${stock.qty } ${stock.qty_unit_name }<br />
								  			ปริมาตร ${stock.netweight } ${stock.netweight_unit_name }
										</td>
								  		<td class="TblRow AlignLeft">${stock.remarks}</td>
								  		<td class="TblRow AlignCenter">${stock.status_name}</td>
				                   	</tr>
	                      		</c:if>
	                      		<c:if test="${(i.count % 2) == 0}">
	                      			<tr>
			                            <td class="TblRow AlignCenter bgRowGray"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=StockInitial&cmd=Update&id="/>${stock.id}'">แก้ไข</span> | <span class="spanLink"  onclick="confirmBox('ต้องการลบข้อมูล','${stock.id}','${i.count}')">ลบ</span></td>
			                           	<td class="TblRow AlignCenter bgRowGray">${stock.delivery_code}</td>
			                           	<td class="TblRow AlignCenter bgRowGray">${stock.delivery_date2 }</td>
			                           	<td class="TblRow AlignLeft bgRowGray">${stock.legislation_name}</td>
			                           	<td class="TblRow AlignLeft bgRowGray">${stock.group_name}</td>
								  		<td class="TblRow AlignLeft bgRowGray">${stock.duty_name}</td>
								  		<td class="TblRow AlignLeft bgRowGray">${stock.brand_main_name}</td>
								  		<td class="TblRow AlignLeft bgRowGray">
								  			ขนาด ${stock.sizes_desc} ${stock.sizes_unit_name}<br />
								  			จำนวน ${stock.qty } ${stock.qty_unit_name }<br />
								  			ปริมาตร ${stock.netweight } ${stock.netweight_unit_name }
										</td>
								  		<td class="TblRow AlignLeft bgRowGray">${stock.remarks}</td>
								  		<td class="TblRow AlignCenter bgRowGray">${stock.status_name}</td>
			                        </tr>
			                    </c:if>
							</c:forEach>                  			
           				</table>
                  	</td>        
                </tr>
                <tr>
                	<td>&nbsp;</td>
                	<td>&nbsp;</td>
                </tr> 
		 	</table>
		</td>	
		</tr>
	</table>
<c:if test="${IsDup == 'Y'}">
	<script>
		alert("พบข้อมูลซ้ำ ไม่สามารถบันทึกข้อมูลได้");
	</script>
</c:if>