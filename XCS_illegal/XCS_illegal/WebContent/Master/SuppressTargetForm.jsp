<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/interface/SuppressTargetList.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>
<script type="text/JavaScript">
	 /*
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
	  */
	  function getValmount(){
			var temp=1;
			var budget_year = document.getElementById("budget_year").value;
			var qty = document.getElementById("qty").value;
			var offcode = document.getElementById("offcode").value;
			var legislation_id = document.getElementById("legislation_id").value;
			var product_group_id = document.getElementById("product_group_id").value;
			if(offcode.substr(2,4) == '0000'){
				
				SuppressTargetList.getSuppressTargetItem_sql1(budget_year,offcode,qty,legislation_id,product_group_id,function(data){
					 if(data != null){
						 //alert(data.length);
						 
						  	for(var countList=0; countList < data.length; countList++){
							  	dwr.util.setValue("fine_01"+temp, formatMoney(data[countList].fine01.toFixed(2)));
							  	dwr.util.setValue("fine_02"+temp, formatMoney(data[countList].fine02.toFixed(2)));
							  	dwr.util.setValue("fine_03"+temp, formatMoney(data[countList].fine03.toFixed(2)));
							  	dwr.util.setValue("fine_04"+temp, formatMoney(data[countList].fine04.toFixed(2)));
							  	dwr.util.setValue("fine_05"+temp, formatMoney(data[countList].fine05.toFixed(2)));
							  	dwr.util.setValue("fine_06"+temp, formatMoney(data[countList].fine06.toFixed(2)));
							  	dwr.util.setValue("fine_07"+temp, formatMoney(data[countList].fine07.toFixed(2)));
							  	dwr.util.setValue("fine_08"+temp, formatMoney(data[countList].fine08.toFixed(2)));
							  	dwr.util.setValue("fine_09"+temp, formatMoney(data[countList].fine09.toFixed(2)));
							  	dwr.util.setValue("fine_10"+temp, formatMoney(data[countList].fine10.toFixed(2)));
							  	dwr.util.setValue("fine_11"+temp, formatMoney(data[countList].fine11.toFixed(2)));
							  	dwr.util.setValue("fine_12"+temp, formatMoney(data[countList].fine12.toFixed(2)));
						  		dwr.util.setValue("qty_01"+temp, data[countList].qty01);
						  		dwr.util.setValue("qty_02"+temp, data[countList].qty02);
						  		dwr.util.setValue("qty_03"+temp, data[countList].qty03);
						  		dwr.util.setValue("qty_04"+temp, data[countList].qty04);
						  		dwr.util.setValue("qty_05"+temp, data[countList].qty05);
						  		dwr.util.setValue("qty_06"+temp, data[countList].qty06);
						  		dwr.util.setValue("qty_07"+temp, data[countList].qty07);
						  		dwr.util.setValue("qty_08"+temp, data[countList].qty08);
						  		dwr.util.setValue("qty_09"+temp, data[countList].qty09);
						  		dwr.util.setValue("qty_10"+temp, data[countList].qty10);
						  		dwr.util.setValue("qty_11"+temp, data[countList].qty11);
						  		dwr.util.setValue("qty_12"+temp, data[countList].qty12);
						  		//alert(countList);
						  		dwr.util.setValue("sumFine"+temp,formatMoney((data[countList].fine01+data[countList].fine02+data[countList].fine03+data[countList].fine04+data[countList].fine05+data[countList].fine06+data[countList].fine07+data[countList].fine08+data[countList].fine09+data[countList].fine10+data[countList].fine11+data[countList].fine12).toFixed(2)));
						  		dwr.util.setValue("sumQty"+temp, data[countList].qty01+data[countList].qty02+data[countList].qty03+data[countList].qty04+data[countList].qty05+data[countList].qty06+data[countList].qty07+data[countList].qty08+data[countList].qty09+data[countList].qty10+data[countList].qty11+data[countList].qty12);
						  		temp++;
						  		
						  	}
						  	
					  	}else{
						 	 alert("ไม่มีข้อมูลรายละเอียดเป้าปราบปราม ของเลขที่เอกสารคุม ");
					  	}
				});
				alert("ดึงยอดรวมจากหน่วยงานในสังกัดภาคเรียบร้อย");
			}else{
				if((offcode.substr(2,2)!='00') && (offcode.substr(4,2) == '00')){
					
					SuppressTargetList.getSuppressTargetItem_sql2(budget_year,offcode,qty,legislation_id,product_group_id,function(data){
						 if(data != null){
							 //alert(data.length);
							
							  	for(var countList=0; countList < data.length; countList++){
								  	dwr.util.setValue("fine_01"+temp, formatMoney(data[countList].fine01.toFixed(2)));
								  	dwr.util.setValue("fine_02"+temp, formatMoney(data[countList].fine02.toFixed(2)));
								  	dwr.util.setValue("fine_03"+temp, formatMoney(data[countList].fine03.toFixed(2)));
								  	dwr.util.setValue("fine_04"+temp, formatMoney(data[countList].fine04.toFixed(2)));
								  	dwr.util.setValue("fine_05"+temp, formatMoney(data[countList].fine05.toFixed(2)));
								  	dwr.util.setValue("fine_06"+temp, formatMoney(data[countList].fine06.toFixed(2)));
								  	dwr.util.setValue("fine_07"+temp, formatMoney(data[countList].fine07.toFixed(2)));
								  	dwr.util.setValue("fine_08"+temp, formatMoney(data[countList].fine08.toFixed(2)));
								  	dwr.util.setValue("fine_09"+temp, formatMoney(data[countList].fine09.toFixed(2)));
								  	dwr.util.setValue("fine_10"+temp, formatMoney(data[countList].fine10.toFixed(2)));
								  	dwr.util.setValue("fine_11"+temp, formatMoney(data[countList].fine11.toFixed(2)));
								  	dwr.util.setValue("fine_12"+temp, formatMoney(data[countList].fine12.toFixed(2)));
							  		dwr.util.setValue("qty_01"+temp, data[countList].qty01);
							  		dwr.util.setValue("qty_02"+temp, data[countList].qty02);
							  		dwr.util.setValue("qty_03"+temp, data[countList].qty03);
							  		dwr.util.setValue("qty_04"+temp, data[countList].qty04);
							  		dwr.util.setValue("qty_05"+temp, data[countList].qty05);
							  		dwr.util.setValue("qty_06"+temp, data[countList].qty06);
							  		dwr.util.setValue("qty_07"+temp, data[countList].qty07);
							  		dwr.util.setValue("qty_08"+temp, data[countList].qty08);
							  		dwr.util.setValue("qty_09"+temp, data[countList].qty09);
							  		dwr.util.setValue("qty_10"+temp, data[countList].qty10);
							  		dwr.util.setValue("qty_11"+temp, data[countList].qty11);
							  		dwr.util.setValue("qty_12"+temp, data[countList].qty12);
							  		dwr.util.setValue("sumFine"+temp,formatMoney((data[countList].fine01+data[countList].fine02+data[countList].fine03+data[countList].fine04+data[countList].fine05+data[countList].fine06+data[countList].fine07+data[countList].fine08+data[countList].fine09+data[countList].fine10+data[countList].fine11+data[countList].fine12).toFixed(2)));
							  		dwr.util.setValue("sumQty"+temp, data[countList].qty01+data[countList].qty02+data[countList].qty03+data[countList].qty04+data[countList].qty05+data[countList].qty06+data[countList].qty07+data[countList].qty08+data[countList].qty09+data[countList].qty10+data[countList].qty11+data[countList].qty12);
							  		temp++;
							  		
							  	}
							  	
						  	}else{
							 	 alert("ไม่มีข้อมูลรายละเอียดเป้าปราบปราม ของเลขที่เอกสารคุม ");
						  	}
					});
					alert("ดึงยอดรวมจากหน่วยงานในสังกัดจังหวัดเรียบร้อย");
				}
			}
			sumTotal();
		}
	  function CalFine(chk){
		  var valmount;
		  var varQty;
		  var getVa=document.getElementById("percent").value;
		  var percent;
		  var percentQty;
		  var fromMount=parseInt(document.dataform.cmbMonthFrom.value);
		  var toMount=parseInt(document.dataform.cmbMonthTo.value);
		  if( fromMount > toMount){
			  alert("กรุณาเลือกระหว่างเดือนอีกครั้ง");
		  }else{
			  for(var z=0; z<chk.length; z++)
			  {
				 if(chk[z].checked == true)
				 {
					  for(var j=parseInt(document.dataform.cmbMonthFrom.value); j<= parseInt(document.dataform.cmbMonthTo.value); j++)
					  {
						  if(j <= 9)
						  {  
								valmount=document.getElementById('fine_0'+j+chk[z].value).value;
								//add by mu
								valQty=document.getElementById('qty_0'+j+chk[z].value).value;
								percentQty=valQty*(getVa/100);
								document.getElementById('qty_0'+j+chk[z].value).value=Math.ceil(parseInt(valQty)+percentQty);
								//alert(Math.ceil(3.3));
								//------
								valmount=valmount.replace(/,/g,"");
						  		percent=valmount*(getVa/100);
						  		document.getElementById('fine_0'+j+chk[z].value).value=percentAddDist(valmount,roundNumber(percent,2),getVa);
						  		//alert(percentAddDist(valmount,roundNumber(percent,2),getVa));
						  }else{
							  valmount=document.getElementById('fine_'+j+chk[z].value).value;
							  //add by mu
							  valQty=document.getElementById('qty_'+j+chk[z].value).value;
							  percentQty=valQty*(getVa/100);
							  document.getElementById('qty_'+j+chk[z].value).value=Math.ceil(parseInt(valQty)+percentQty);
							  //---
							 valmount=valmount.replace(/,/g,"");
							  percent=valmount*(getVa/100);
							  document.getElementById('fine_'+j+chk[z].value).value=percentAddDist(valmount,roundNumber(percent,2),getVa);
							 // alert(percentAddDist(valmount,roundNumber(percent,2),getVa));
						  }
					  } 
				  }		 
			  } 
			  getTotalFine();
			  sumTotal();
		  }  
}
	  function getTotalFine(){
		  var listChk = document.dataform.fine_id;
		  var inmount;
		  var inqty;
		  var sumfine=0;
		  var sumqty=0;
		  for(var s=0; s<listChk.length; s++){
			  if(listChk[s].checked == true){
		  			for(var w=1; w <= 12; w++){
			  			if(w <= 9){
			  				inmount = document.getElementById('fine_0'+w+listChk[s].value).value ;
			  				inqty = document.getElementById('qty_0'+w+listChk[s].value).value ;
			  				inmount = inmount.replace(/,/g,"");
			  				inqty = inqty.replace(/,/g,"");
			  				sumfine = sumfine + parseFloat(inmount);
			  				sumqty = sumqty + parseFloat(inqty);
			  			}else{
							inmount = document.getElementById('fine_'+w+listChk[s].value).value ;
							inqty = document.getElementById('qty_'+w+listChk[s].value).value ;
							inmount = inmount.replace(/,/g,"");
							inqty = inqty.replace(/,/g,"");
							sumfine = sumfine + parseFloat(inmount);
							sumqty = sumqty + parseFloat(inqty);
			  			}
		  			}
		  			document.getElementById("sumQty"+listChk[s].value).value = formatMoney(sumqty); 
		  			document.getElementById("sumFine"+listChk[s].value).value = formatMoney(sumfine.toFixed(2)); 
		  			sumfine=0;
		  			sumqty=0;
			  }  
	     
	  	}
}
	  function formatMoney(inum){
		  if(inum != '0.00'){
		    var s_inum=new String(inum);  
		    var num2=s_inum.split(".",s_inum);   
		    var l_inum=num2[0].length;   
		    var n_inum=""; 
		    var i;  
		    for(i=0;i<l_inum;i++){   
		        if(parseInt(l_inum-i)%3==0){   
		            if(i==0){   
		                n_inum+=s_inum.charAt(i);          
		            }else{   
		                n_inum+=","+s_inum.charAt(i);          
		            }      
		        }else{   
		            n_inum+=s_inum.charAt(i);   
		        }   
		    }   
		    if(num2[1]!=undefined){   
		        n_inum+="."+num2[1];   
		    } 
		  }else{
			  n_inum=inum;
		  }  
		  return n_inum;   
}
	  function percentAddDist(str1,str2,flag){
		  var total;
		  if(flag < 0){
			  total=parseFloat(str1)+parseFloat(str2);
		  }else{
			  total=parseFloat(str1)+parseFloat(str2);
		  }
		  return formatMoney(total.toFixed(2));
}
	  function roundNumber(num, dec) {
			var result = Math.round(num*Math.pow(10,dec))/Math.pow(10,dec);
			return result;
}



	  
	  function changStatus(){
		  document.getElementById("status").value="0";
	  }
	  function backSearch(){
		  window.location.href='<c:url value="/process?action=SuppressTargetList_Master" />';
	  }

     function selectLegislation(LID) {

		mnu = document.getElementById(LID);
		//alert(mnu.value);
		if (mnu.value=="4")
			document.getElementById('product_group_id').disabled=false;
		else
			document.getElementById('product_group_id').disabled=true;

	}
     function sumTotal(){
    		
    		
    		var dataSumQty;
    		var dataSumFine;
    		var totalQty;
    		var totalFine;
    		var paraIn1;
    		var paraIn2;
    		var paraIn3;
    		var paraOut1;
    		var paraOut2;
    		var paraOut3;
    		
    		//sum input paramiter
    		for(var numSum=1; numSum <=12; numSum++ ){
    			dataSumQty = 0;
    			dataSumFine =0;
    			if(numSum <= 9){
    				paraIn1 = document.getElementById('qty_0'+numSum+'1').value;
    				paraIn2 = document.getElementById('qty_0'+numSum+'2').value;
    				paraIn3 = document.getElementById('qty_0'+numSum+'3').value;
    				paraIn1 = paraIn1.replace(/,/g,"");
    				paraIn2 = paraIn2.replace(/,/g,"");
    				paraIn3 = paraIn3.replace(/,/g,"");
    				paraOut1 = document.getElementById('fine_0'+numSum+'1').value;
    				paraOut2 = document.getElementById('fine_0'+numSum+'2').value;
    				paraOut3 = document.getElementById('fine_0'+numSum+'3').value;
    				paraOut1 = paraOut1.replace(/,/g,"");
    				paraOut2 = paraOut2.replace(/,/g,"");
    				paraOut3 = paraOut3.replace(/,/g,"");
    				dataSumQty =parseFloat(paraIn1)+parseFloat(paraIn2)+parseFloat(paraIn3);
    				document.getElementById('toTalQty'+numSum).innerHTML = formatMoney(dataSumQty); 
    				dataSumFine =parseFloat(paraOut1)+parseFloat(paraOut2)+parseFloat(paraOut3);
    				document.getElementById('toTalFine'+numSum).innerHTML = formatMoney(dataSumFine.toFixed(2));
    				//document.getElementById("toTalFine"+numSum).innerHTML = formatMoney(dataSumFine); 
    				//dataSumFine[numSum] = parseFloat(document.getElementById('fine_0'+numSum+'1'.value))+parseFloat(document.getElementById('fine_0'+numSum+'2'.value))+parseFloat(document.getElementById('fine_0'+numSum+'3'.value));
    			}else{
    				paraIn1 = document.getElementById('qty_'+numSum+'1').value;
    				paraIn2 = document.getElementById('qty_'+numSum+'2').value;
    				paraIn3 = document.getElementById('qty_'+numSum+'3').value;
    				paraIn1 = paraIn1.replace(/,/g,"");
    				paraIn2 = paraIn2.replace(/,/g,"");
    				paraIn3 = paraIn3.replace(/,/g,"");
    				paraOut1 = document.getElementById('fine_'+numSum+'1').value;
    				paraOut2 = document.getElementById('fine_'+numSum+'2').value;
    				paraOut3 = document.getElementById('fine_'+numSum+'3').value;
    				paraOut1 = paraOut1.replace(/,/g,"");
    				paraOut2 = paraOut2.replace(/,/g,"");
    				paraOut3 = paraOut3.replace(/,/g,"");
    				dataSumQty =parseFloat(paraIn1)+parseFloat(paraIn2)+parseFloat(paraIn3);
    				document.getElementById('toTalQty'+numSum).innerHTML = formatMoney(dataSumQty);
    				dataSumFine =parseFloat(paraOut1)+parseFloat(paraOut2)+parseFloat(paraOut3);
    				document.getElementById('toTalFine'+numSum).innerHTML = formatMoney(dataSumFine.toFixed(2));
    				//dataSumFine[numSum] = parseFloat(document.getElementById('fine_'+numSum+'1'.value))+parseFloat(document.getElementById('fine_'+numSum+'2'.value))+parseFloat(document.getElementById('fine_'+numSum+'3'.value));
    			}
    			
    		}
    		paraIn1 = document.getElementById('sumQty1').value;
    		paraIn2 = document.getElementById('sumQty2').value;
    		paraIn3 = document.getElementById('sumQty3').value;
    		paraIn1 = paraIn1.replace(/,/g,"");
    		paraIn2 = paraIn2.replace(/,/g,"");
    		paraIn3 = paraIn3.replace(/,/g,"");
    		paraOut1 = document.getElementById('sumFine1').value;
    		paraOut2 = document.getElementById('sumFine2').value;
    		paraOut3 = document.getElementById('sumFine3').value;
    		paraOut1 = paraOut1.replace(/,/g,"");
    		paraOut2 = paraOut2.replace(/,/g,"");
    		paraOut3 = paraOut3.replace(/,/g,"");
    		totalQty = parseFloat(paraIn1)+parseFloat(paraIn2)+parseFloat(paraIn3);
    		document.getElementById('toTalQty').innerHTML = formatMoney(totalQty);
    		totalFine =parseFloat(paraOut1)+parseFloat(paraOut2)+parseFloat(paraOut3);
    		document.getElementById('toTalFine').innerHTML = formatMoney(totalFine.toFixed(2));
    		
    	}
     function ChkMinusDblSuppress(ctl)
	  {
	  	zz = window.event.keyCode;

	  	if ( zz < 48 || zz > 57)  {
	  		if (zz == 46) {
	  			if (ctl.value.indexOf(".", 0) >= 0)
	  				window.event.keyCode = 0;
	  		}
	  		else {
	  			if (zz == 45) {
	  				//if (ctl.value.indexOf("-", 0) >= 0)
	  					window.event.keyCode = 0;
	  			}
	  			else
	  				window.event.keyCode = 0;
	  		}
	  	}
	  	
	  }

</script>
<%@page import="com.ko.webapp.util.FormHandler"%>
<%
	FormHandler formHandler = new FormHandler(request);
%>
<form method="post" name="dataform" action="<c:url value="/process?action=SuppressTargetList_Master&cmd=create"/>" >
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">

              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%">
					<span class="websitename">กำหนดเป้าปราบปราม</span>
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
					<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" >
					<input name="btnBack"  type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="backSearch();">
					<input name="btnConfirm"  type="button" class="barbutton" value="ส่งข้อมูล" onclick="changStatus();" >
					<input name="btnPrint"  type="button" class="barbutton" value="ออกเป็น Excel" >
				</td>
			  </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="25">&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
						<table border="0" cellpadding="0" cellspacing="0" width="1000">
							<tr>
                				<td width="20%" align="right">ปีงบประมาณ :&nbsp;</td>
                				<td width="30%">
                					<input name="budget_year" id="budget_year" type="text" class="textNum" value="" onkeypress="ChkMinusDbl(this);"/>
                					<font style="color:red">*</font>
                					<input name="status" type="hidden" value="0" />
                					&nbsp;&nbsp;
									ครั้งที่ : <input name="qty" id="qty" type="text" class="textNum" size="3" value=""  onkeypress="ChkMinusDbl(this);"/>
									<font style="color:red">*</font>
                				</td>
								<td width="20%" align="right" >เลขที่เอกสารคุม :&nbsp;</td>
								<td width="30%" height="25">
									<input name="txtTrackNo" id="txtTrackNo" type="text" class="textView" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="" size="30" />
								</td>
							</tr>
							<tr>
								<td align="right">หน่วยงาน :&nbsp;</td>
								<td height="25" >
								   <input type="text" id="offcode" name="offcode" size="4"  class="textbox"  value="" onBlur="getOffname(this.value,'Y',offname);" >
								   <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
										onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" >
								   <input type="text" id="offname" name="offname" size="30" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" class="textview"  value="" >
								   <font style="color:red">*</font>
								</td>
								<td align="right" >&nbsp;</td>
								<td ><span class="spanLink" onclick="getValmount();">ดึงยอดรวมจากหน่วยงานในสังกัด</span></td>

                			</tr>

							<tr>
                				<td align="right">พ.ร.บ. :&nbsp;</td>
                				<td >
			                        <select name="legislation_id" id="legislation_id" style="width:200px;" onchange="selectLegislation('legislation_id');">
			                          <option value="" selected>ทั้งหมด</option>
									  <c:forEach items="${listLegis}"  var="legis" >
			                          		<option value="${legis.id}" >${legis.legislation_name}</option>
			                          </c:forEach>
			                        </select>
			                        <font style="color:red">*</font>&nbsp;&nbsp;
                				</td>
                				
                				<td align="right" >ปรับเพิ่ม-ลด :&nbsp;</td>
                				<td>
                					<input name="percent" type="text" class="textNum" value="" size="15" />%
                					<input name="btnCal"  type="button" class="barbutton" value="คำนวณ" onclick="CalFine(document.dataform.fine_id);">
                				</td>
                			</tr>
                			<tr>
								<td align="right" >สินค้า :&nbsp;</td>
								<td height="25">
									<select name="product_group_id" id="product_group_id" style="width:200px;" disabled="disabled">
										 <option value="" selected>ทั้งหมด</option>
										 <c:forEach items="${listDuty}"  var="duty" >
			                          		<option value="${duty.group_id}" >${duty.group_name}</option>
			                          	 </c:forEach>
									</select>
								</td>
								<td align="right" >&nbsp;</td>
								<td align="left" >
								 	<input type="checkbox" value="1" name="fine_id"/>เปรียบเทียบปรับ &nbsp;&nbsp;
								 	<input type="checkbox" value="2" name="fine_id"/>ฟ้องศาล <br />
								 	<input type="checkbox" value="3" name="fine_id"/>ไม่มีตัวผู้ต้องหา
								</td>
                			</tr>
                			<tr>
                			    <td align="right" >ข้อมูล ณ วันที่ :&nbsp;</td>
                			    <td>
                			    	<input name="job_date" id="job_date" type="text" class="textdate" readonly value=""     />
		  							<a href="javascript:NewCssCal('job_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" /></a>
									<font style="color:red">*</font>&nbsp;สถานะ :&nbsp;<input type="text" name="textStatus" size="20"  class="textview"  value="อยู่ระหว่างดำเนินการ" readonly />
                			    </td>
								<td align="right" >ระหว่างเดือน :&nbsp;</td>
								<td height="25">
									<select name="cmbMonthFrom" id="cmbMonthFrom" style="width:100px;" >
										 <option value="x" selected>เลือก</option>
										 <option value="1">มกราคม</option>
										 <option value="2">กุมภาพันธ์</option>
										 <option value="3">มีนาคม</option>
										 <option value="4">เมษายน</option>
										 <option value="5">พฤษภาคม</option>
										 <option value="6">มิถุนายน</option>
										 <option value="7">กรกฎาคม</option>
										 <option value="8">สิงหาคม</option>
										 <option value="9">กันยายน</option>
										 <option value="10">ตุลาคม</option>
										 <option value="11">พฤศจิกายน</option>
										 <option value="12">ธันวาคม</option>
									</select>&nbsp;&nbsp;ถึง :&nbsp;
									<select name="cmbMonthTo" id="cmbMonthTo" style="width:100px;" >
										 <option value="x" selected>เลือก</option>
										 <option value="1">มกราคม</option>
										 <option value="2">กุมภาพันธ์</option>
										 <option value="3">มีนาคม</option>
										 <option value="4">เมษายน</option>
										 <option value="5">พฤษภาคม</option>
										 <option value="6">มิถุนายน</option>
										 <option value="7">กรกฎาคม</option>
										 <option value="8">สิงหาคม</option>
										 <option value="9">กันยายน</option>
										 <option value="10">ตุลาคม</option>
										 <option value="11">พฤศจิกายน</option>
										 <option value="12">ธันวาคม</option>
									</select>
								</td>
                			</tr>
							<tr><td colspan="4" align="center">&nbsp;</td></tr>
                		</table>
					</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
					<table class="tableList"  width="2240"   border="1" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
						 <tr class="TblHeaderColumn">
							  <td width="150" rowspan="3">ประเภทเป้าหมาย</td>
							  <td  rowspan="2" colspan="2" align="center" >รวมทุกเดือน</td>
							  <td colspan="24">&nbsp;</td>
						</tr>
						 <tr class="TblHeaderColumn">
							  <td colspan="2" >ตค.</td>
							  <td colspan="2" >พย.</td>
							  <td colspan="2"  >ธค.</td>
							  <td colspan="2"  >มค.</td>
							  <td colspan="2"  >กพ.</td>
							  <td colspan="2"  >มีค.</td>
							  <td colspan="2"  >เมย.</td>
							  <td colspan="2"  >พค.</td>
							  <td colspan="2"  >มิย.</td>
							  <td colspan="2"  >กค.</td>
							  <td colspan="2"  >สค.</td>
							  <td colspan="2"  >กย.</td>
						</tr>
						 <tr class="TblHeaderColumn">
							  <td width="90"   >จำนวนดคี(ราย)</td>
							  <td width="80" >ค่าปรับ(บาท)</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
						</tr>
						<tr class="TblRow">
						  <td >เปรียบเทียบปรับ</td>
						  <td Align="right"><input name="sumQty1" type="text" class="textNum" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" readonly/></td>
						  <td Align="right"><input name="sumFine1" type="text" class="textNum" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" readonly/></td>
						  <td Align="right">
						  	<input type="hidden" name="id_item1" value="${suppressTargetItem.id}" />
						  	<input name="qty_101" type="text" class="textNum" id="qty_101" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_101" type="text" class="textNum" id="fine_101" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_111" type="text" class="textNum" id="qty_111" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_111" type="text" class="textNum" id="fine_111" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_121" type="text" class="textNum" id="qty_121" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_121" type="text" class="textNum" id="fine_121" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_011" type="text" class="textNum" id="qty_011" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_011" type="text" class="textNum" id="fine_011" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_021" type="text" class="textNum" id="qty_021" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_021" type="text" class="textNum" id="fine_021" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_031" type="text" class="textNum" id="qty_031" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_031" type="text" class="textNum" id="fine_031" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_041" type="text" class="textNum" id="qty_041" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_041" type="text" class="textNum" id="fine_041" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_051" type="text" class="textNum" id="qty_051" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_051" type="text" class="textNum" id="fine_051" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_061" type="text" class="textNum" id="qty_061" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_061" type="text" class="textNum" id="fine_061" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_071" type="text" class="textNum" id="qty_071" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_071" type="text" class="textNum" id="fine_07" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_081" type="text" class="textNum" id="qty_081" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_081" type="text" class="textNum" id="fine_081" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_091" type="text" class="textNum" id="qty_091" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_091" type="text" class="textNum" id="fine_091" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						</tr>
						<tr class="TblRow bgRowGray">
						  <td>ฟ้องศาล</td>
						  <td Align="right"><input name="sumQty2" type="text" class="textNum" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" readonly/></td>
						  <td Align="right"><input name="sumFine2" type="text" class="textNum" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" readonly/></td>
						  <td Align="right">
						  	<input type="hidden" name="id_item2" value="${suppressTargetItem.id}" />
						  	<input name="qty_102" type="text" class="textNum" id="qty_102" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_102" type="text" class="textNum" id="fine_102" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_112" type="text" class="textNum" id="qty_112" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_112" type="text" class="textNum" id="fine_112" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_122" type="text" class="textNum" id="qty_122" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_122" type="text" class="textNum" id="fine_122" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_012" type="text" class="textNum" id="qty_012" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_012" type="text" class="textNum" id="fine_012" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_022" type="text" class="textNum" id="qty_022" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_022" type="text" class="textNum" id="fine_022" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_032" type="text" class="textNum" id="qty_032" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_032" type="text" class="textNum" id="fine_032" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_042" type="text" class="textNum" id="qty_042" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_042" type="text" class="textNum" id="fine_042" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_052" type="text" class="textNum" id="qty_052" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_052" type="text" class="textNum" id="fine_052" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_062" type="text" class="textNum" id="qty_062" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_062" type="text" class="textNum" id="fine_062" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_072" type="text" class="textNum" id="qty_072" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_072" type="text" class="textNum" id="fine_072" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_082" type="text" class="textNum" id="qty_082" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_082" type="text" class="textNum" id="fine_082" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_092" type="text" class="textNum" id="qty_092" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_092" type="text" class="textNum" id="fine_092" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						</tr>
						<tr class="TblRow">
						  <td >ไม่มีตัวผู้ต้องหา</td>
						  <td Align="right"><input name="sumQty3" type="text" class="textNum" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" readonly/></td>
						  <td Align="right"><input name="sumFine3" type="text" class="textNum" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" readonly/></td>
						  <td Align="right">
						  	<input type="hidden" name="id_item3" value="${suppressTargetItem.id}" />
						  	<input name="qty_103" type="text" class="textNum" id="qty_103" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_103" type="text" class="textNum" id="fine_103" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_113" type="text" class="textNum" id="qty_113" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_113" type="text" class="textNum" id="fine_113" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_123" type="text" class="textNum" id="qty_123" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_123" type="text" class="textNum" id="fine_123" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_013" type="text" class="textNum" id="qty_013" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_013" type="text" class="textNum" id="fine_013" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_023" type="text" class="textNum" id="qty_023" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_023" type="text" class="textNum" id="fine_023" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_033" type="text" class="textNum" id="qty_033" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_033" type="text" class="textNum" id="fine_033" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_043" type="text" class="textNum" id="qty_043" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_043" type="text" class="textNum" id="fine_043" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_053" type="text" class="textNum" id="qty_053" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_053" type="text" class="textNum" id="fine_053" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_063" type="text" class="textNum" id="qty_063" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_063" type="text" class="textNum" id="fine_063" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_073" type="text" class="textNum" id="qty_073" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_073" type="text" class="textNum" id="fine_073" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_083" type="text" class="textNum" id="qty_083" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_083" type="text" class="textNum" id="fine_083" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="qty_093" type="text" class="textNum" id="qty_093" value="<fmt:formatNumber type='number' value='0' minFractionDigits='0' maxFractionDigits='0'/>" size="5" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						  <td Align="right">
						  	<input name="fine_093" type="text" class="textNum" id="fine_093" value="<fmt:formatNumber type='number' value='0' minFractionDigits='2' maxFractionDigits='2'/>" size="12" onkeypress="ChkMinusDblSuppress(this);"/>
						  </td>
						</tr>
						<tr class="TblRow bgRowGray">
						  <td Align="center">ยอดรวม</td>
						  <td Align="right"><div id="toTalQty"/></td>
						  <td Align="right"><div id="toTalFine"/></td>
						  <td Align="right">
						     <div id="toTalQty10"/>
						  </td>
						  <td Align="right">
						     <div id="toTalFine10"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty11"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine11"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty12"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine12"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty1"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine1"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty2"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine2"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty3"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine3"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty4"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine4"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty5"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine5"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty6"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine6"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty7"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine7"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty8"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine8"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalQty9"/>
						  </td>
						  <td Align="right">
						  	<div id="toTalFine9"/>
						  </td>
						</tr>
					 </table>
				</td>
              </tr>


            </table></td>
		  </tr>
		</table>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");

  	frmvalidator.addValidation("job_date","req","กรุณาเลือกวันที่");
  	frmvalidator.addValidation("budget_year","req","กรุณาระบุปีงบประมาณ");
  	frmvalidator.addValidation("qty","req","กรุณาระบุครั้งที่");
  	frmvalidator.addValidation("offcode","req","กรุณาระบุหน่วยงาน");
  	frmvalidator.addValidation("legislation_id","req","กรุณาเลือก พ.ร.บ.");
  	
   sumTotal();
</script>