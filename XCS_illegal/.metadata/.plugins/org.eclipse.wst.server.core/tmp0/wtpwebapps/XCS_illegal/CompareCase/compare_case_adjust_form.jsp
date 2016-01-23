<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@include file="/Templates/taglibs.jsp"%>
<%@ page import="java.util.Date" %>
<script type='text/javascript' src='dwr/interface/Pke_Compare.js'></script>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type="text/javascript" language="JavaScript">
	function tosubmit(){
		var doc = document.dataform;

		//ตรวจสอบว่าวันที่เปรียบเทียบปรับต้อง >= วันที่เกิดเหตุ
		var CompareCaseDate = jQuery("#compare_case_date").val();
		var ccdd = CompareCaseDate.substring(0,2);
		var ccmm = CompareCaseDate.substring(3,5);
		var ccyy = CompareCaseDate.substring(6,10);

		var OccurrenceDate = jQuery("#occurrence_date").val();
		var Odd = OccurrenceDate.substring(0,2);
		var Omm = OccurrenceDate.substring(3,5);
		var Oyy = OccurrenceDate.substring(6,10);

		if(ccyy + "-" + ccmm + "-" + ccdd < Oyy + "-" + Omm + "-" + Odd){
			alert("วันที่เปรียบเทียบปรับจะต้องไม่น้อยกว่าวันที่เกิดเหตุ");
			jQuery("#compare_case_date").select();
			return;
		}
		
		var vLegislation = dwr.util.getValue("legislation_id");
		var compareCaseNo = document.getElementById("compare_case_no_1").value;
		var compareCaseYear = document.getElementById("compare_case_no_2").value;
		var vOffcode = dwr.util.getValue("offcode");
		var vTrackNo = dwr.util.getValue("track_no");
		
		Pke_Compare.ChkValidateCompareCaseNo(compareCaseNo, compareCaseYear, vOffcode,vTrackNo, function(data){
			if(data != ""){
				//alert("เลขที่คดีเปรียบเทียบที่ ต้องน้อยกว่า เลขบันทึกรับคำกล่าวโทษ");
				alert(data);
				document.getElementById("compare_case_no_1").select();
			}else if(document.getElementById("managetype1").checked==true && document.getElementById("compare_authority_id").value==""){
				alert("กรุณาเลือกอำนาจในการเปรียบเทียบ");
		    }else if(vLegislation == 1 && parseFloat(document.dataform.bribe_money.value) > 150000){
				alert("จำนวนเงินสินบนต้องไม่เกิน 150,000.00 บาท");
				document.dataform.bribe_money.select();
		    }else if(vLegislation == 1 && parseFloat(document.dataform.reward_money.value) > 150000){
		    	alert("จำนวนเงินรางวัลต้องไม่เกิน 150,000.00 บาท");
				document.dataform.reward_money.select();
			}else if(parseFloat(document.dataform.all_p.value) != 100){
			 	alert("เปอร์เซ็นการแบ่งเงินต้องไม่เกิน 100%");
			 	document.dataform.all_p.select();
			}else if(parseFloat(ClearComma(document.dataform.all_money.value)) != parseFloat(ClearComma(document.dataform.allcase_fine.value))){
				alert("จำนวนเงินค่าปรับรวมไม่ถูกต้อง");
				document.dataform.all_money.select();
			}else if(chkDecimal(document.dataform.treasury_money)==false){
				alert("จำนวนเงินส่งคลังต้องมีทศยม 2 ตำแหน่ง");
				document.dataform.treasury_money.select();
			}else if(chkDecimal(document.dataform.bribe_money)==false){
				alert("จำนวนเงินสินบนต้องมีทศยม 2 ตำแหน่ง");
				document.dataform.bribe_money.select();
			}else if(chkDecimal(document.dataform.reward_money)==false){
				alert("จำนวนเงินรางวัลต้องมีทศยม 2 ตำแหน่ง");
				document.dataform.reward_money.select();
			}else if(document.dataform.onsubmit()!=false){
				var vTrackNo = "${db.track_no}";
				var caseID = document.dataform.compare_case_no_1.value + "/" + document.dataform.compare_case_no_2.value;
				var vOffcode = dwr.util.getValue("compare_office");
				var vCaseNoneOffice = dwr.util.getValue("txtNoneOffice");

				Pke_Compare.ChkDupCompareCaseNO(vTrackNo, caseID, vOffcode, vCaseNoneOffice, function(data){
					if(data != ""){
						alert(data);
						document.getElementById("compare_case_no_1").select();
					}else{
						document.dataform.submit();
					}
				});
			}
		});
	}


	function chkDecimal(txtVal){
		var ret = true;
		var numVal = txtVal.value;
		if (numVal.indexOf(".")>0){
			var numDec = numVal.split(".")[1];
			if(numDec.length != 2)
				ret = false;
			else
				ret = true;
		}
		return ret;
	}

	function enabledAuthority()
	{
		if (document.getElementById("managetype1").checked==true){
			document.getElementById("compare_authority_id").disabled=false;
			document.getElementById("authority").style.display='';
		}else{
			document.getElementById("compare_authority_id").disabled=true;
			document.getElementById("authority").style.display='none';
		}
	}

    function calFine(){
        var doc = document.dataform;
        var count =doc.iCount.value;
        var input = doc.case_fine.value;
        if(count <= 1){
        	doc.aalFine.value=AddComma(input);
        }else{
        	for(var i=0; i<doc.aalFine.length; i++){
            	doc.aalFine[i].value=AddComma(input);
        	}
        }
        doc.allcase_fine.value=AddComma(input*count);
    }

    function calRow(){
        var doc = document.dataform;
        var output = 0.00;
        if(doc.treasury_money_p.value!="")
        	output = (parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.treasury_money_p.value))/100;
        
        doc.treasury_money.value=formatMoney(output,2);
        
        doc.treasury.value=AddComma(output);
        if(doc.treasury.value == "NaN") doc.treasury.value="0.00";
    }
    function calRow1(){
        var doc = document.dataform;
        var output = 0.00;
        if(doc.bribe_money_p.value!="")
         	output = (parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.bribe_money_p.value))/100;

        doc.bribe_money.value=formatMoney(output,2);
        doc.bribe.value=AddComma(output);
        if(doc.bribe.value == "NaN") doc.bribe.value="0.00";
    }
    function calRow2(){
        var doc = document.dataform;
        var output = 0.00;
        if(doc.reward_money_p.value != "")
        	output = (parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.reward_money_p.value))/100;

        doc.reward_money.value=formatMoney(output,2);
        doc.reward.value=AddComma(output);
        if(doc.reward.value == "NaN") doc.reward.value="0.00";
    }
    function calsum(){
    	var doc = document.dataform;

		if(doc.treasury_money_p.value=="") doc.treasury_money_p.value = "0";
		if(doc.bribe_money_p.value=="") doc.bribe_money_p.value = "0";
		if(doc.reward_money_p.value=="") doc.reward_money_p.value = "0";
    	
    	var sum1 = parseFloat(ClearComma(doc.treasury_money_p.value))+parseFloat(ClearComma(doc.bribe_money_p.value))+parseFloat(ClearComma(doc.reward_money_p.value));
    	var sum2 = parseFloat(ClearComma(doc.treasury_money.value))+parseFloat(ClearComma(doc.bribe_money.value))+parseFloat(ClearComma(doc.reward_money.value));
    	var sum3 = parseFloat(ClearComma(doc.treasury.value))+parseFloat(ClearComma(doc.bribe.value))+parseFloat(ClearComma(doc.reward.value));
		doc.all_p.value=sum1;
		if(doc.all_p.value == "NaN") doc.all_p.value = "0";
		
		doc.all.value=AddComma(sum3);
		if(doc.all.value == "NaN") doc.all.value="0.00";
		
		doc.all_money.value=AddComma(sum2);
		if(doc.all_money.value == "NaN") doc.all_money.value="0.00";
    }
    function calMoney(){
		//User For page_load
    	var doc = document.dataform;
        doc.treasury.value = AddComma((parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.treasury_money_p.value))/100);
        doc.bribe.value = AddComma((parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.bribe_money_p.value))/100);
        doc.reward.value = AddComma((parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.reward_money_p.value))/100);
        calsum();

        if(doc.treasury.value == "NaN") doc.treasury.value="0.00";
        if(doc.bribe.value == "NaN") doc.bribe.value="0.00";
        if(doc.reward.value == "NaN") doc.reward.value="0.00";
    }
	function sharemoney(){
		//alert("sharemoney");
		
		var dataform = document.dataform;
		calFine();
		dataform.allcase_fine.value = AddComma(dataform.numLawbreaker.value*dataform.case_fine.value);
		var vTrackNo = dataform.track_no.value;
		var vLegislation = dwr.util.getValue("legislation_id");
		var vIndictment = dwr.util.getValue("indictment_id");
		var vIsNotice = "${db.application_notice_arrest_id}";
		if(vIsNotice == null){
			vIsNotice='N';
		}
		var vFineSum = ClearComma(dataform.allcase_fine.value);
		if (!vIsNotice){
			vIsNotice = "N";
			//alert(vIsNotice);
		}else{
			vIsNotice = "Y";
			//alert(vIsNotice);
		}

		Pke_Compare.getShareMoney(vTrackNo,vLegislation,vIndictment,vIsNotice,vFineSum,function(data) {
			
			//%share
	    	dwr.util.setValue("bribe_money_p", data[0]);
	    	dwr.util.setValue("reward_money_p", data[1]);
	    	dwr.util.setValue("treasury_money_p", data[2]);
	    	///dwr.util.setValue("all_p", data[0]+data[1]+data[2]);
	    	//money share
	    	dwr.util.setValue("treasury", AddComma(data[5]));
	    	dwr.util.setValue("bribe", AddComma(data[3]));
	    	dwr.util.setValue("reward", AddComma(data[4]));

	    	displayMoney(data[3],data[5],data[4]);
	    	calsum();
		  	});
	  	
	}

	function displayMoney(bribe, treasury, reward){
		document.dataform.bribe_money.value = formatMoney(bribe,2);
		document.dataform.treasury_money.value = formatMoney(treasury,2);
		document.dataform.reward_money.value = formatMoney(reward,2);
	}

	function ChkDupCaseNo(txtNo){
		
		var vTrackNo = "${db.track_no}";
		var caseID = document.dataform.compare_case_no_1.value + "/" + document.dataform.compare_case_no_2.value;
		var vOffcode = dwr.util.getValue("compare_office");
		Pke_Compare.ChkDupCompareCaseNO(vTrackNo, caseID, vOffcode, function(data){
			if(data != ""){
				document.getElementById("compare_case_no_1").value = "";
				document.getElementById("compare_case_no_2").value = "";
				alert(data);
				document.getElementById("compare_case_no_1").select();
			}
		});
	}

	function ChkNoneOffice(){
		//chkNoneOffice
		if (document.getElementById("chkNoneOffice").checked==true)
			document.getElementById("txtCaseNoneOffice").innerHTML="น";
		else
			document.getElementById("txtCaseNoneOffice").innerHTML="&nbsp;";
	}
</script>
<form method="post" name="dataform" action="process?action=Caseadjust&cmd=create">

<table width="100%"  border="0" cellspacing="0"
	cellpadding="0">
	<tr>

		<td width="100%" align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="1%">&nbsp;</td>
				<td width="99%"><span class="websitename">เปรียบเทียบปรับ</span></td>
			</tr>
			<tr>
				<td colspan="2"><input name="btnSave" id="btnSave" type="button"
					class="barButton" value="บันทึก" onClick="tosubmit();"> 
					<input name="btnCancel" id="btnCancel" type="button" class="barButton"
					value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขบันทึกการจับกุม');window.location.href='<c:url value="${action}" />'; "> <input name="btnBack" type="button"
					class="barButton" value="กลับหน้าค้นหา"
					onclick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Caseadjust&cmd=list&default=Y" />' "></td>
			</tr>
			<tr <c:if test="${cc.id == null }">style="display:none"</c:if>  >
				<td height="25">&nbsp;</td>
				<td>พิมพ์รายงาน :&nbsp; <select name="cmbPrintReports"
					id="cmbPrintReports" style="width: 250px;">
					<option value="" selected>เลือก</option>
					<option value="ILL_P027">พิมพ์คำร้องขอเปรียบเทียบคดี</option>
					<option value="ILL_P028">พิมพ์เปรียบเทียบคดี(ส.ส.2/52)</option>
					<option value="ILL_P029">พิมพ์บันทึกคำให้การของผู้ต้องหา(ส.ส.2/53)</option>
					<option value="ILL_P030">พิมพ์บันทึกคำให้การของผู้กล่าวโทษ(ส.ส.2/54)</option>
				</select> <input type="button" id="btnPrint" name="btnPrint" value="พิมพ์" class="barButton" 
					onClick="if(document.dataform.cmbPrintReports.value!='')printReports(document.dataform.cmbPrintReports.value+'&getTrackNo=${db.track_no}&time=<%=new Date().getTime() %>');">
					<br />
					</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
				<table width="900" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="1%" align="left" valign="top">&nbsp;</td>
						<td width="98%"></td>
						<td width="1%" align="right" valign="top">&nbsp;</td>
					</tr>

					<tr>
						<td height="40">&nbsp;</td>
						<td align="center" valign="top">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">

							<tr>
								<td align="left" valign="top"><!-- รายละเอียดบันทึกการจับกุม-->
								<input name="track_no" type="hidden"  value="${db.track_no}"  />
								<%@ include file="../Protect/arrest_detailshow.jsp"%>

								<table width="800" border="0" cellspacing="0" cellpadding="0">
									<tr class="bgRowGray">
										<td colspan="4"><strong>ที่ทำการเปรียบเทียบปรับ</strong>
										</td>
									</tr>
									<tr valign="top">

										<td height="10" colspan="4" align="right" valign="middle">&nbsp;<input
											type="hidden" name="update" value="${update}" /></td>
									</tr>
									<tr valign="top">
										<td height="25" align="right" valign="middle">คดีเปรียบเทียบที่&nbsp;:&nbsp;</td>
										<td width="152">
											<b><span id="txtCaseNoneOffice"  >${caseNoneOffice }</span></b>
											<input type="Text" id="compare_case_no_1" name="compare_case_no_1" class="textNum" onkeypress="ChkMinusInt(this);" size="5" value="${case_no_1}" />
											/&nbsp; 
											<input type="Text" id="compare_case_no_2" name="compare_case_no_2" class="textNum" onkeypress="ChkMinusInt(this);" size="4" value="${case_no_2}" />
											<font style="color: red">*</font></td>
										<td height="25" align="right" valign="middle">วันที่ :&nbsp;</td>
										<td>
											<c:if test="${cc.compare_case_date != null}">
												<input name="compare_case_date" id="compare_case_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${cc.compare_case_date}"  />" />
											</c:if>
											<c:if test="${cc.compare_case_date == null}">
												<input name="compare_case_date" id="compare_case_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="<fmt:formatDate pattern="dd/MM/yyyy" value="<%=new Date() %>"  />" />
											</c:if>
											<a href="javascript:NewCssCal('compare_case_date','ddmmyyyy')">
											<img id="imgCompareCaseDate" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a> 
											<font style="color: red">*</font>
										</td>
									</tr>
									<tr>
									  	<td>&nbsp;</td>
									  	<td colspan='3'>
									  		<input type="checkbox" id="chkNoneOffice" name="chkNoneOffice" 
									  		<c:if test="${db.case_none_office == 'Y'}"> checked </c:if> 
									  		value='Y' onclick="ChkNoneOffice()" disabled />คดีจับกุมนอกสถานที่
									  		<input type="hidden" id="txtNoneOffice"  name="txtNoneOffice" 
									  		value="${db.case_none_office }" />
									  	</td>
									  </tr>
									<tr>
										<td align="right" valign="middle">ที่ทำการเปรียบเทียบ :&nbsp;</td>
										<td width="243">
											<select name="compare_office" id="compare_office" onchange="setOfficeProvince('province2','district2','tambol2',this.value)" 
												style="width: 200px;
												<c:if test="${db.case_none_office == 'Y'}">
													display:none;
												</c:if>
												">
												<option value="" selected>เลือก</option>
												<c:forEach var="ed" items="${edlist}">
													<option value="${ed.offcode}" 
														<c:if test="${ed.offcode == compare_office}">  selected </c:if>>
														${ed.short_name}
													</option>
												</c:forEach>
											</select> 
											<c:if test="${db.case_none_office == 'Y'}">
												<input type="text" name="case_non_office_name" id="case_non_office_name" value="${db.case_non_office_name}" style="width: 195px;" />
											</c:if>
										<font style="color: red">*</font></td>
										<td align="right" valign="middle">ชื่อผู้กล่าวหา :&nbsp;</td>
										<td width="243"><input type="text" id="accuser" name="accuser" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
											class="textview" size="31"
											value="${db.accuser_name}"
											 /> <input type="hidden" name="accuser_idcardno" id="accuser_idcardno"
											value="${aa.accuser_idcardno}" /> <font style="color: red">*</font></td>
									</tr>
									<tr>
										<td height="25" align="right">จังหวัด :&nbsp;</td>
										<td><select name="compare_province" id="province2"
											style="width: 200px;" onchange="getDistrict('district2','tambol2',this.value,'')">
											<option value="">โปรดเลือกจังหวัด</option>

										</select> <font style="color: red">*</font></td>
										<td height="25" align="right">จังหวัด :&nbsp;</td>
										<td><select name="accuser_province" id="province3"
											style="width: 200px;" onchange="getDistrict('district3','tambol3',this.value,'')">
											<option value="">โปรดเลือกจังหวัด</option>

										</select></td>
									</tr>
									<tr>
										<td height="25" align="right">อำเภอ :&nbsp;</td>
										<td><select name="compare_district" id="district2" onchange="getTambol('tambol2',this.value,'')"
											 style="width: 200px">
											<option value="">โปรดเลือกอำเภอ</option>
										</select> <font style="color: red">*</font></td>
										<td height="25" align="right">อำเภอ :&nbsp;</td>
										<td><select name="accuser_district" id="district3" onchange="getTambol('tambol3',this.value,'')"
											 style="width: 200px">
											<option value="">โปรดเลือกอำเภอ</option>
										</select></td>
									</tr>
									<tr>
										<td height="25" align="right">ตำบล :&nbsp;</td>
										<td><select name="compare_subdistrict" id="tambol2"
											 style="width: 200px">
											<option value="">โปรดเลือกตำบล</option>
										</select></td>
										<td height="25" align="right">ตำบล :&nbsp;</td>
										<td><select name="accuser_subdistrict" id="tambol3"
											 style="width: 200px">
											<option value="">โปรดเลือกตำบล</option>
										</select></td>
									</tr>

									<tr>
										<td align="right">ผู้ดำเนินการเปรียบเทียบ :&nbsp;</td>
										<td colspan="3" onClick="enabledAuthority();"><input
											id="managetype1" name="manage_type" type="radio" value="1"
											<c:if test="${cc.manage_type=='1'}">checked</c:if>>ผู้มีอำนาจโดยตรง
										&nbsp;&nbsp; <input id="managetype2" name="manage_type"
											type="radio" value="2"
											<c:if test="${cc.manage_type=='2' ||cc.manage_type== null ||cc.manage_type== ''}" >checked</c:if>>เจ้าหน้าที่ดำเนินคดี&nbsp;&nbsp;
										<font style="color: red">*</font></td>
									</tr>

									<tr>
										<td align="right">เจ้าหน้าที่ดำเนินคดี/&nbsp;<br>ผู้มีอำนาจเปรียบเทียบ :&nbsp;</td>
										<td>
											<input type="text" id="sue_staff_name" name="sue_staff_name" class="textview" size="30" value="${sue_staff_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" /> 
											<input type="hidden" id="sue_staff_idcardno" name="sue_staff_idcardno" value="${sue_staff_idcardno}" /> 
											<img id="imgSueStaffName" src="images/btn_browse.png" width="18" height="19" border="0" style="cursor: hand"
											onClick="window.open('process?action=Divide_staff_pop&formname=sue_staff_name&id=sue_staff_idcardno&poscode=sue_poscode&offcode=sue_offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" />
											<input type="hidden" id="sue_poscode" name="sue_poscode" value="${sue_poscode} "></input>
											<input type="hidden" id="sue_offcode" name="sue_offcode" value="${sue_offcode}"></input>
											<font style="color: red">*</font>
										</td>
										<td align="right">อำนาจในการเปรียบเทียบ :&nbsp;</td>
										<td><select name="compare_authority_id" id="compare_authority_id"
											style="width: 180px;" >
											<option value="" selected>เลือก</option>
											<c:forEach var="ca" items="${calist}">
												<option value="${ca.authority_code}"
													<c:if test="${ca.authority_code == cc.compare_authority_id }">  selected </c:if>>
												${ca.authority_name}</option>
											</c:forEach>
										</select> <span id="authority" style="display: none;"><font
											style="color: red">*</font></span></td>
									</tr>
									<tr valign="top">
										<td height="25" colspan="4" align="right" valign="middle">&nbsp;</td>
									</tr>
									<tr class="bgRowGray">
										<td colspan="4"><strong>เปรียบเทียบคดี</strong></td>
									</tr>
									<tr valign="top">
										<td height="10" colspan="4" align="right" valign="middle">&nbsp;</td>
									</tr>

									<script>
									var caselaw = new Array();
									for(i=0;i<=10;i++){
										caselaw[i]="";
										}
									var penaltylaw = new Array();
									for(i=0;i<=10;i++){
										penaltylaw[i]="";
										}
									var incid = new Array();
									for(i=0;i<=10;i++){
										incid[i]="";
										}
									function selectcaselaw(){
										for(i=0;i<=incid.length;i++){
											if(incid[i]==document.dataform.indictment_id.value){		
												document.dataform.case_law_id.value = caselaw[i];
												document.dataform.penalty_desc.value = penaltylaw[i];
											}
										}
									}
									</script>
									<tr>
										<td align="right">ข้อกล่าวหา :&nbsp;</td>
										<td colspan="3"><select name="indictment_id"
											id="indictment_id" style="width: 580px;" onchange="selectcaselaw();">
											<option value="">เลือก</option>
											<c:forEach items="${inclist}" var="inc">
												<option value="${inc.indictment_id}"
													<c:if test="${inc.indictment_id == cc.indictment_id}"> selected </c:if> >
													${inc.indictment_name}
												</option>
											</c:forEach>
										</select> <font style="color: red">*</font></td>
										<c:forEach items="${inclist}" var="inc" varStatus="i">
										<script>
										incid[${i.count}]="${inc.indictment_id}";
										caselaw[${i.count}]="${inc.case_law_id}";
										penaltylaw[${i.count}]="${inc.penalty_case_law_id}";
										</script>
										</c:forEach>
									</tr>
									<tr>
										<td align="right">มาตรา :&nbsp;</td>
										<td colspan="3"><input type="text" name="case_law_id" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
											class="textview" size="35" value="${cc.indictment_id }">&nbsp;
										บทกำหนดโทษ : <input type="text" name="penalty_desc" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
											class="textview" size="32" value=""></td>
									</tr>
									<tr>
										<td align="right">การดำเนินการ :&nbsp;</td>
										<td colspan="3"><TEXTAREA id="administration" NAME="administration" ROWS="5"
											COLS="55">${db.administration}</TEXTAREA> <font
											style="color: red">*</font></td>
									</tr>
									<tr>
										<td align="right">คำให้การของผู้กล่าวโทษ :&nbsp;</td>
										<td colspan="3">
											<TEXTAREA id="accuser_testimony" NAME="accuser_testimony" ROWS="5" COLS="55">${accuser_testimony }</TEXTAREA> 
											<font style="color: red">*</font></td>
									</tr>
									<tr>
										<td align="right">เลขที่คดี(สมุดรับคำกล่าวโทษ) :&nbsp;</td>
										<td><input type="text" name="case_id" id="case_id" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${db.case_id}">
											<input type="hidden" name="bi_id"  value="${db.book_impeachment_id}">
											</td>
										<td align="right">วันที่รับคำกล่าวโทษ:</td>
										<td>
											<input name="case_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.case_date2}" />
										</td>
									</tr>

									<tr valign="top">
										<td height="25" colspan="4" align="right" valign="middle">&nbsp;</td>
									</tr>
									<tr class="bgRowGray">
										<td colspan="4"><strong>รายชื่อผู้กระทำผิด</strong></td>
									</tr>
									<tr>
										<td colspan="4">&nbsp;</td>
									</tr>
									<tr>
										<td colspan="2">
										<table width="95%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td width="27%" class="TblHeaderColumn AlignCenter">ลำดับที่</td>
												<td width="62%" class="TblHeaderColumn">ชื่อผู้กระทำผิด</td>
												<td width="20%" class="TblHeaderColumn">ค่าปรับ</td>
											</tr>
											<c:forEach items="${aallist}" var="aal" varStatus="i">
												<tr>
													<td class="TblRow AlignLeft AlignCenter">${i.count }</td>
													<td class="TblRow AlignLeft">${aal.lawbreaker_name}</td>
													<td class="TblRow AlignRight">
														<input type="Text" id="aalFine" name="aal_fine" value="${aal.fine}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textViewNum" />
														<div id="case_fine_div"></div>
													</td>
												</tr>
												<c:set var="i_count" value="${i.count}" />
												<c:set var="numLawbreaker" value="${i.count}" />
											</c:forEach>
										</table>
										<input type="hidden" name="iCount"
											value="${i_count}" /></td>
										<input type="hidden" name="numLawbreaker"
											value="${numLawbreaker}" /></td>
										<td valign="top" colspan="2">
										<table border="0" cellpadding="0" cellspacing="0" width="100%">
											<tr>
												<td align="right" width="40%">ค่าปรับของคดีต่อคน :&nbsp;</td>
												<td><input type="Text" id="case_fine" name="case_fine"
													value="${db.case_fine }" class="textNum"
													onkeypress="ChkMinusDbl(this);" onblur="calFine();calRow();calRow1();calRow2();calsum();"  style="width: 80px"
													size="15" /> &nbsp;บาท</td>
											</tr>
											<tr>
												<td align="right">มูลค่าภาษีพิสูจน์ :&nbsp;</td>
												<td><input type="Text" id="tax_val" name="tax_value"
													value="${db.tax_value}" class="textViewNum"
													onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" style="width: 80px"
													size="15" readonly="readonly"/> &nbsp;บาท</td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td height="30">&nbsp;</td>
									</tr>
									<tr class="bgRowGray">
										<td colspan="4"><strong>รายละเอียดเงินค่าปรับ /เงินสินบนและเงินรางวัล</strong></td>
									</tr>
									<tr valign="top">
										<td height="10" colspan="4" align="right" valign="middle">&nbsp;</td>
									</tr>
									<tr>
										<td align="right">ค่าปรับเปรียบเทียบคดีรวม :&nbsp;</td>
										<td><input type="text" name="allcase_fine"
											class="textViewNum" size="15" value="${db.allcase_fine}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" > บาท</td>
										<td align="right">วันที่ชำระ :</td>
										<td><input name="paydate" id="paydate" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
											 value="<fmt:formatDate pattern="dd/MM/yyyy" value="${cc.pay_date}" />" />
										
										</td>
									</tr>
									<tbody id="divideMoney">
										<tr>
											<td align="right" valign="top">&nbsp;</td>
											<td colspan="3">
												<table border="0" cellpadding="0" cellspacing="0">
													<tr id="calShareMoney">
														<td colspan="4">
															<input type="button" class="barButton" value="คำนวณ % การแบ่งเงิน" onClick="sharemoney();" />
														</td>
													</tr>
													<tr>
														<td>เงินส่งคลัง&nbsp;&nbsp;</td>
														<td><input type="text" id="treasury_money_p" name="treasury_money_p" size="3"
															value="${cc.treasury_money_p}" class="textNum" onkeypress="ChkMinusInt(this);" onblur="calRow();calsum();">%&nbsp;&nbsp;</td>
														<td><input type="text" name="treasury" size="12" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
															value="" class="textViewNum">&nbsp;</td>
														<td><input type="text" id="treasury_money" name="treasury_money" size="12"
															onChange="calsum();" value="${cc.treasury_money}" class="textNum" onkeypress="ChkMinusDbl(this);"></td>
													</tr>
													<tr>
														<td>เงินสินบน&nbsp;&nbsp;</td>
														<td><input type="text" id="bribe_money_p" name="bribe_money_p" class="textNum"
															onkeypress="ChkMinusInt(this);" onblur="calRow1();calsum();" size="3" value="${cc.bribe_money_p}">%&nbsp;&nbsp;</td>
														<td><input type="text" name="bribe" class="textViewNum" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
															size="12" value="">&nbsp;</td>
														<td><input type="text" id="bribe_money" name="bribe_money" class="textNum"
															onChange="calsum();" onkeypress="ChkMinusDbl(this);" size="12" value="${cc.birbe_money}"></td>
													</tr>
													<tr>
														<td>เงินรางวัล&nbsp;&nbsp;</td>
														<td><input type="text" id="reward_money_p" name="reward_money_p" class="textNum"
															onkeypress="ChkMinusInt(this);" onblur="calRow2();calsum();" size="3" value="${cc.reward_money_p }">%&nbsp;&nbsp;</td>
														<td><input type="text" name="reward" class="textViewNum" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
															size="12" value="">&nbsp;</td>
														<td><input type="text" id="reward_money" name="reward_money" class="textNum" onBlur="chkDecimal(this);"
															onChange="calsum();" onkeypress="ChkMinusDbl(this);" size="12" value="${cc.reward_money }"></td>
													</tr>
													<tr>
														<td><b>รวม</b>&nbsp;&nbsp;</td>
														<td><input type="text" name="all_p" class="textViewNum" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
															size="3" value="">%&nbsp;&nbsp;</td>
														<td><input type="text" name="all" class="textViewNum" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
															size="12" value="">&nbsp;</td>
														<td><input type="text" name="all_money" class="textViewNum" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
															size="12" value="">
															<input type="hidden" name="case_status" id="case_status" value="${cc.case_status}"> </input>
														</td>
													</tr>
												</table>
											</td>
										</tr>
									</tbody>
									<tr valign="top">
										<td height="25" colspan="4" align="right" valign="middle">&nbsp;</td>
									</tr>
								</table>
								</td>
							</tr>
						</table>
						</td>
						<td>&nbsp;</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td height="25" colspan="3">&nbsp;</td>
			</tr>


		</table>
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
</table>
<script>

	function formatMoney(valIn, dec){
		//กำหนดให้แสดงตัวเลขมีทศนิยมอย่างน้อย 2 ตำแหน่งเสมอ
		//ถ้า valIn มีทศนิยมมากกว่า 2 ตำแหน่งอยู่แล้ว ให้แสดงข้อมูลตามที่มี โดยไม่มีการปัดเศษ
		var temp = "" + valIn;
		if ( isNaN( parseFloat(temp) ) ) {
			temp = 0;
		}
		if (parseInt(temp) == 0)
			return '0.' + repeatChar("0",dec);
		else {
			if(temp.indexOf(".")>0){
				var num = temp.split(".");
				if(num[1].length < dec)
					temp = num[0] + "." + num[1] + repeatChar("0",(dec-1));
				else 
					temp = num[0] + "." + num[1];
			}else{
				temp = temp + "." + repeatChar("0",dec);
			}
		}
		
		return temp;
	}

	function repeatChar(chr,num){
		//ทำซ้ำตัวอักษรที่ต้องการ (chr) ตามจำนวนครั้งที่ต้องการ (num)  : JavaScript ไม่มีฟังก์ชั่น repeat ก็เลยต้องมาเขียนเอง (--")
		var ret = "";
		var count = num + 0;
		for(i=0;i<count;i++){
			ret += chr;
		}
		return ret;
	}

	<c:if test="${db.case_none_office == 'N'}">
		setOfficeProvince('province2','district2','tambol2',"${compare_office}");   //ที่ทำการเปรียบเทียบ
	</c:if>
	getProvince('province2','district2','tambol2','${cc.compare_province}','${cc.compare_district}','${cc.compare_subdistrict}');
	getProvince('province3','district3','tambol3','${cc.accuser_province}','${cc.accuser_district}','${cc.accuser_subdistrict}');
	selectcaselaw();
	calFine();
	calMoney();
	enabledAuthority();

	<c:if test="${cc.id == null}">
		setOfficeProvince('province3','district3','tambol3',"${accuser_offcode}");  //ที่อยู่ของผู้กล่าวโทษ
	</c:if>
	<c:if test="${cc != null}" >
		displayMoney(${cc.birbe_money},${cc.treasury_money},${cc.reward_money});
	</c:if>

	
</script> 
	<script language="JavaScript" type="text/javascript">
	//You should create the validator only after the definition of the HTML form
	  var frmvalidator  = new Validator("dataform");
	
	  frmvalidator.addValidation("compare_case_no_1","req","กรุณากรอกเลขที่คดี");
	  frmvalidator.addValidation("compare_case_no_2","req","กรุณากรอกเลขที่คดี");
	  frmvalidator.addValidation("compare_case_date","req","กรุณากรอกวันที่");
	  <c:if test="${db.case_none_office == 'N'}">
	  	frmvalidator.addValidation("compare_office","req","กรุณากรอกที่ทำการ");
	  </c:if>
	  <c:if test="${db.case_none_office == 'Y'}">
	  	frmvalidator.addValidation("case_non_office_name","req","กรุณากรอกที่ทำการเปรียบเทียบ");
	  </c:if>
	  frmvalidator.addValidation("accuser","req","กรุณากรอกชื่อผู้กล่าวหา");
	  frmvalidator.addValidation("compare_province","req","กรุณากรอกจังหวัด");
	  frmvalidator.addValidation("compare_district","req","กรุณากรอกอำเภอ");
	  frmvalidator.addValidation("compare_subdistrict","req","กรุณากรอกตำบล");
	  frmvalidator.addValidation("indictment_id","req","เลือกข้อหา");
	  frmvalidator.addValidation("sue_staff_name","req","กรุณากรอกผู้มีอำนาจในการเปรียบเทียบ");

		function PayFined(){//ชำระเงินแล้ว แต่ยังไม่นำส่งเงิน
			//02 = ผู้ต้องหาชำระเงินแล้ว แต่ยังไม่นำส่งเงิน
			//03 = นำส่งเงินรายได้แล้ว
			//05 = ยกเลิกการนำส่งเงิน
			document.getElementById('compare_case_no_1').disabled=true;
			document.getElementById('compare_case_no_2').disabled=true;
			document.getElementById('imgCompareCaseDate').style.display='none';
			<c:if test="${db.case_none_office == 'N'}">
				//document.getElementById('compare_office').style.display='none';
				document.getElementById('compare_office').disabled=true;
			</c:if>
			<c:if test="${db.case_none_office == 'Y'}">
		  		document.getElementById('case_non_office_name').disabled=true;
		  	</c:if>
			document.getElementById('province2').disabled=true;
			document.getElementById('district2').disabled=true;
			document.getElementById('tambol2').disabled=true;
			document.getElementById('province3').disabled=true;
			document.getElementById('district3').disabled=true;
			document.getElementById('tambol3').disabled=true;
			document.getElementById('managetype1').disabled=true;
			document.getElementById('managetype2').disabled=true;
			document.getElementById('imgSueStaffName').style.display='none';
			document.getElementById('compare_authority_id').disabled=true;
			document.getElementById('indictment_id').disabled=true;
			document.getElementById('administration').disabled=true;
			document.getElementById('accuser_testimony').disabled=true;
			document.getElementById('case_fine').disabled=true;
			document.getElementById('calShareMoney').style.display='none';		
		}

		function SendIncome(){
			//03 = นำส่งเงินรายได้แล้ว
			document.getElementById('btnSave').style.display='none';
			document.getElementById('btnCancel').style.display='none';
			document.getElementById('treasury_money_p').disabled=true;
			document.getElementById('bribe_money_p').disabled=true;
			document.getElementById('reward_money_p').disabled=true;
			document.getElementById('treasury_money').disabled=true;
			document.getElementById('bribe_money').disabled=true;
			document.getElementById('reward_money').disabled=true;
		}
	   
	</script>
	
	<c:if test="${(db.compare_status == '02' || db.compare_status == '03' || db.compare_status == '05') && (cc.case_status == '2' || cc.case_status == '3')}">
		<script>
			PayFined();
		</script>
	</c:if>
	<c:if test="${(db.compare_status == '03' && cc.case_status == '3')}">
		<script>
			SendIncome();
		</script>
	</c:if>
	<c:if test="${IsEdit == 'N'}">
		<script>
			PayFined();
			SendIncome();
		</script>
	</c:if>
</form>
