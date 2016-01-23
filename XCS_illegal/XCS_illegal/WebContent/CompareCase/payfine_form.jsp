<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<%@ page import="java.util.Date" %>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type="text/javascript" language="JavaScript">
	function chkManual()
	{

		rdiA = document.getElementById("rdiInvByA");
		rdiM = document.getElementById("rdiInvByM");
		lstA = document.getElementById("lstAuto");
		lstM = document.getElementById("lstManual");


		if (rdiA.checked==true){
			lstA.style.display='';
			lstM.style.display='none';

		}else{
			lstA.style.display='none';
			lstM.style.display='';
		}
	}
	function btnPrintClick(btn,id,row)
	{	var i = parseInt(row)-1;
		
		var doc = document.dataform;
		var tracNO = "${db.track_no}";


		if(!doc.bprint.length){
			if(doc.bprint.value == "บันทึกและพิมพ์")
			{
				if(doc.pay_date.value != ""){
					//alert("save4");
					//window.showModalDialog('process?action=Payfine&cmd=setprint&paper_no='+doc.paper_no.value+'&aal_id='+id , self , 'dialogWidth=300px,dialogHeight=200px');
					window.open('process?action=Report&__report=ILL_P031&getTrackNo=' + tracNO + '&__formatt=pdf&time=<%=new Date().getTime()%>' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');		
					doc.bprint.value = "ยกเลิก";
				}else{
					alert("กรุณาระบุวันที่ชำระเงิน");
					doc.pay_date.focus();
				}
				
			}else{
				doc.bprint.value = "บันทึกและพิมพ์";
				//window.showModalDialog('process?action=Payfine&cmd=unsetprint&aal_id='+id , self , 'dialogWidth=300px,dialogHeight=200px');
			}
		}else{
			//alert("aaaa");
			if(doc.bprint[i].value == "บันทึกและพิมพ์"){
				//window.showModalDialog('process?action=Payfine&cmd=setprint&paper_no='+doc.paper_no[i].value+'&aal_id='+id , self , 'dialogWidth=300px,dialogHeight=200px');
				window.open('process?action=Report&__report=ILL_P031&getTrackNo=' + tracNO + '&__formatt=pdf' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
				doc.bprint[i].value = "ยกเลิก";
			}else{
				doc.bprint[i].value = "บันทึกและพิมพ์";
				window.showModalDialog('process?action=Payfine&cmd=unsetprint&aal_id='+id , self , 'dialogWidth=300px,dialogHeight=200px');
			}
		}

		
	}
	function calsum(){
		var doc = document.dataform;
		var sum1 = 0;
		if(!doc.fine.length){
			sum1 = 	parseFloat(doc.fine.value);
			doc.fine.value = AddComma(doc.fine.value);
		}else{	
			for(i = 0; i < doc.fine.length; i++){
				sum1 = 	parseFloat(doc.fine[i].value)+parseFloat(sum1);	
				doc.fine[i].value = AddComma(doc.fine[i].value);
			}
		}	
		
		doc.all_finea.value=AddComma(sum1);
		doc.all_fineb.value=AddComma(sum1);	
	}

	function cancelInv(){
		var answer = confirm("ยืนยันการยกเลิกใบเสร็จรับเงินค่าปรับ");
		if(answer){
			if(document.dataform.onsubmit()){
				writeTranLog('ยกเลิกใบเสร็จรับเงินค่าปรับ');
				//document.dataform.confirm.value = '2';
				//document.dataform.submit();
				location.href='<c:url value="/process?action=Payfine&cmd=cancelInv&ccID=${cc.id}&aaID=${db.id}" />';
			}
		}
			
	}

	function Print(){
		writeTranLog('พิมพ์ใบเสร็จรับเงิน');
		Reports.ReportUrl(function(data){
			if(data != ""){
				window.open(data + "ReportName=ILL_P031&getTrackNo=${db.track_no}&vReportType=PDF&time=" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}else{
				window.open('process?action=Report&__report=ILL_P031&getTrackNo=${db.track_no}&__formatt=pdf' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}
		});
	}
</script>




<form method="post" name="dataform"  action="process?action=Payfine&cmd=create" >
		<table width="700" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">ชำระเงินค่าปรับและออกใบเสร็จ</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                	<c:if test="${IsSend == '0'}">
						<input name="btnSave"  type="submit" class="barButton" value="บันทึก" >
						<input name="btnCancel"  type="button" class="barButton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขข้อมูลการชำระค่าปรับและออกใบเสร็จ');window.location.href='<c:url value="${action}" />'; " >
					</c:if>
					<input name="btnBack"  type="button" class="barButton" value="กลับหน้าค้นหา" onclick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Payfine&cmd=list&default=Y" />' ">
					<c:if test="${cc.pay_date != null}">
						<c:if test="${cc.inv_type == 'A'}">
							<input name="btnPrint"  type="button" class="barButton" value="พิมพ์ใบเสร็จฯ" onclick="Print();" />
						</c:if>
						<c:if test="${IsSend == '0'}">
							<input name="btnCancelInv"  type="button" class="barButton" value="ยกเลิกใบเสร็จฯ" onclick="writeTranLog('ยกเลิกใบเสร็จรับเงิน');cancelInv();"></input>	
						</c:if>
					</c:if>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>

              <tr>
                <td>&nbsp;</td>
                <td ><table width="787" border="0" cellspacing="0" cellpadding="0" >
                  <tr>
                    <td width="375" align="left" valign="top">
	                
						<!-- รายละเอียดบันทึกการจับกุม-->
						<%@ include file="../Protect/arrest_detailshow.jsp"%>
					</td>
                  </tr>

                </table></td>
              </tr>
			  <tr>
					<td>&nbsp;<input type="hidden" name="allaal" value="${aalsize}"/>
					<input type="hidden" name="track_no" value="${db.track_no}"/></td>
					<td colspan="2"> <hr /></td>
			  </tr>
			  <tr>
				<td>&nbsp;</td>
				<td >
					<table border="0" cellpadding="0" cellspacing="0" width="100%" >
						<tr>
							<td align="right" width="20%" >วันที่รับชำระ :&nbsp;<input type="hidden" name="update"	value="${update}" /></td>
							<td align="left" width="30%">
								<c:if test="${cc.pay_date != null}">
								 	<input name="pay_date" id="pay_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
										value="<fmt:formatDate pattern="dd/MM/yyyy" value="${cc.pay_date}"  />" />
								</c:if>
								<c:if test="${cc.pay_date == null}">
								 	<input name="pay_date" id="pay_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
										value="<fmt:formatDate pattern="dd/MM/yyyy" value="<%=new Date() %>"  />" />
								</c:if>
								<a href="javascript:NewCssCal('pay_date','ddmmyyyy')">
								<img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
								<font style="color:red">*</font>
							</td>
							<td align="right" width="20%">เลขคดีเปรียบเทียบที่ :&nbsp;</td>
							<td width="30%">
								<input type="text" id="compare_case_no" name="compare_case_no" 
								onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" 
								class="textview" size="20" value="${cc.compare_case_no}"/>
							</td>
						</tr>
						<tr  >
							<td align="right" >ออกใบเสร็จแบบ :&nbsp;</td>
							<td align="left" colspan="3">
								<input type="radio" id="rdiInvByA" name="inv_type" <c:if test="${cc.inv_type == 'A'}">checked</c:if>  value="A" onClick="chkManual();" />Auto &nbsp;&nbsp;&nbsp;
								<input type="radio" id="rdiInvByM" name="inv_type" <c:if test="${cc.inv_type == 'M' || cc.pay_date == null}">checked</c:if> value="M" onClick="chkManual();" />Manual
							</td>
						</tr>
					  </table>
				  </td>
			  </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                	<table border="0">
                    	<tr>
                        	<td width="180" align="left">
                    			<span class="logindetail">รายชื่อผู้กระทำผิด</span>
                            </td>
                        </tr>
                    </table>
                </td>
              </tr>
              <tr id="lstAuto" <c:if test="${cc.inv_type == 'M' || cc.pay_date == null}">style='display:none'</c:if> >
                <td>&nbsp; </td>
                <td >
                   <table class="tableList"  border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                      <tr>
                        <td width="50" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                        <td width="150" class="TblHeaderColumn">ชื่อผู้กระทำผิด</td>
                        <td width="80" class="TblHeaderColumn">ค่าปรับ</td>
                        <td width="120" class="TblHeaderColumn">เลขที่ใบเสร็จ</td>
                        <td width="100" class="TblHeaderColumn">เลขที่กระดาษ</td>
                      </tr>
                       <c:forEach items="${aallist }" var="aal" varStatus="i">
							<tr>
								<td class="TblRow AlignLeft AlignCenter">${i.count }</td>
								<td class="TblRow AlignLeft">${aal.lawbreaker_name}</td>
								<td class="TblRow AlignRight">
									<input name="aal_id" type="hidden" value="${aal.id}"  size="10"  >
									<input id="fine" readonly name="fine" class="textViewNum" type="text" value="${aal.fine}"  size="10"   >
								</td>
								<td class="TblRow" align="center"><input type="text" readonly id="invcode" name="invcode" value="${aal.invcode}" class="textview" size="16"></td>
                				<td class="TblRow" align="center"><input id="paper_no"  name="paper_no" type="text" value="${aal.paper_no}"  size="10"  class="textbox"></td>
                				<td class="TblRow" align ="Center" style="display:none">
	                        	<INPUT TYPE="button"  value="<c:choose><c:when test="${aal.iscancel == 'Y'}">ยกเลิก</c:when><c:otherwise>บันทึกและพิมพ์</c:otherwise></c:choose>" id="bprint" name="bprint" style="width:100" onClick="btnPrintClick('bprint','${aal.id}','${i.count}');"/>
							</tr>
	                  </c:forEach>
                      <tr class="bgRowGray">
                        <td class="TblRow" colspan="2"><p align="right"><b>ค่าปรับรวม&nbsp;</b></p></td>
                        <td class="TblRow AlignLeft"><p align="right"><input type="text" name="all_finea" size="10" value="0"  class="textViewNum" /></p></td>
						<td class="TblRow AlignLeft" colspan="4">&nbsp;</td>
                      </tr>
                    </table>
                </td>
              </tr>

              <tr id="lstManual"  <c:if test="${cc.inv_type == 'A'}">style='display:none'</c:if> >
                <td>&nbsp;</td>
                <td >
                   <table class="tableList" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                      <tr>
                        <td width="50" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                        <td width="150" class="TblHeaderColumn">ชื่อผู้กระทำผิด</td>
                        <td width="80" class="TblHeaderColumn">ค่าปรับ</td>
                        <td width="120" class="TblHeaderColumn">ใบเสร็จเล่มที่</td>
                        <td width="120" class="TblHeaderColumn">ใบเสร็จเลขที่</td>
                      </tr>
                    <c:forEach items="${aallist }" var="aal" varStatus="i">
						<tr>
							<td class="TblRow AlignLeft AlignCenter">${i.count}</td>
							<td class="TblRow AlignLeft">${aal.lawbreaker_name}</td>
							<td class="TblRow AlignRight">
								<input id="fine1" readonly name="fine1" type="text" value="${aal.fine}"  size="10"  class="textViewNum"  >
								<input name="aal_id" type="hidden" value="${aal.id}"   >
							</td>
							<td class="TblRow" align="center" ><input id="invBook1"  name="book_no" type="text" value="${aal.book_no}"  size="10"  class="textbox"  ></td>
	                  		<td class="TblRow" align="center" ><input id="invNo1" name="inv_no" type="text"  value="${aal.inv_no}"  size="10"  class="textbox"></td>
						</tr>
                    </c:forEach>
                      
                      <tr class="bgRowGray">
                        <td class="TblRow" colspan="2"><p align="right"><b>ค่าปรับรวม&nbsp;</b></p></td>
                        <td class="TblRow AlignLeft"><p align="right"><input type="text" name="all_fineb" size="7" value="0" class="textViewNum" /></p></td>
						<td class="TblRow AlignLeft" colspan="4">&nbsp;</td>
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
<script type="text/javascript" >
calsum();
	var frmvalidator  = new Validator("dataform");

 	frmvalidator.addValidation("pay_date","req","กรุณากรอกวันที่");
 	
 	
 	</script>
	
