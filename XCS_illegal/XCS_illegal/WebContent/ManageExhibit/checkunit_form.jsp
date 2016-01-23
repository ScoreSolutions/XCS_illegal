<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ page import="java.util.Date" %>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<script type='text/javascript' src='dwr/interface/Exhibit.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>

<script language="JavaScript" type="text/javascript">
	var max_row=<c:choose><c:when test="${soi_list_size != null}">${soi_list_size}</c:when><c:otherwise>1</c:otherwise></c:choose>;
	var sum_qty=<c:choose><c:when test="${qty != null}">${qty}</c:when><c:otherwise>0</c:otherwise></c:choose>;
	var unit_desc='';

	var action_form =  'ExhibitReceive';
	var module_name = 'การตรวจรับของกลาง';
	var so_id = '${si.stockout_id}';
	var jsonUnit = eval('${unit_json}');

	var seimaxrow=1; // jsp  Count  config
	var seistartrow=2;
	var seieditrow = -1;
	var seieditna = 0;

	var aatdata1 =new Array();
	var aatdata2 =new Array();
	var aatdata3 =new Array();
	var aatdata4 =new Array();
	var aatdata5 =new Array();
	var aatdata6 =new Array();
	var aatdata7 =new Array();
	var aatdata8 =new Array();
	var aatdata9 =new Array();
	var aatdata10 =new Array();
	var aatdata11 =new Array();
	var aatdata12 =new Array();

	var seidata1 =new Array();
	var seidata2 =new Array();
	var seidata3 =new Array();
	var seidata4 =new Array();
	var seidata5 =new Array();
	var seidata6 =new Array();
	var seidata7 =new Array();
	var seidata8 =new Array();
	var seidata9 =new Array();
	var seidata10 =new Array();
	var seidata11 =new Array();
	var seidata12 =new Array();
	var seidata13 =new Array();
	var seidata14 =new Array();
	var seidata15 =new Array();
	var seidata16 =new Array();
	var seidata17 =new Array();
	var seidata18 =new Array();
	var seidata19 =new Array();
	var seidata20 =new Array();
	var seidata21 =new Array();
	var seidata22 =new Array();
	var seidata23 =new Array();
	var seidata24 =new Array();
	var seidata25 =new Array();
	var seidata26 =new Array();
	
	function chkDuplicate(){		
		var chk_code = dwr.util.getValue("stockout_code1")+"/"+dwr.util.getValue("stockout_code2");		
		Exhibit.chkDupStockout(chk_code, function(data) {
	    	if(data != ""){
	    		alert("ข้อมูลซ้ำค่ะ");
	    		document.dataform.stockout_code2.value = "";
	    		document.dataform.stockout_code2.focus();
	    	}
	  	});
	}

	function tosubmit(){
		var de_id = dwr.util.getValue("de_id");
		var id = dwr.util.getValue("de_id_1");
		Exhibit.chkDupDeliveryExhibit(de_id,id, function(data) {
	    	if(data != ""){
	    		alert("เลขที่หนังสือส่งซ้ำค่ะ");
	    	}else{
	    		if(document.getElementById("doc_no").value==""){
		    	  	alert("กรุณากรอกเลขที่เอกสาร กค.");
		    	  	document.getElementById("doc_no").focus();
	    	  	}else if(document.getElementById("stockin_date").value==""){
		    	  	alert("กรุณากรอกวันที่รับของกลาง");
		    	  	document.getElementById("stockin_date").focus();
	    		}else if(document.getElementById("location").value==""){
		    	  	alert("กรุณากรอกสถานที่จัดเก็บ");
		    	  	document.getElementById("location").focus();
	    	  	}else if(document.getElementById("stockin_time").value==""){
	    	  		alert("กรุณากรอกเวลาจัดเก็บ");
	    	  		document.getElementById("stockin_time").focus();
	    	  	}else{
	    	  		document.dataform.submit();
	    	  	}	    		
	    	}
	  	});
	}
	function clickCancal(){
		if(document.dataform.de_id_1.value){
			document.dataform.action = "process?action=ExhibitReceive&cmd=preup&id="+document.dataform.de_id_1.value;
			document.dataform.submit();
		}
	}
	function clickBack8(){
		document.dataform.action = "process?action=ExhibitReceive";
		document.dataform.submit();
	}
	function confirm2(){		
		var answer = confirm ("ยืนยันการตรวจรับของกลาง");
		if (answer){
			writeTranLog('ยืนยันการตรวจรับของกลาง');
			document.dataform.status.value = '2';
			document.dataform.submit();
		}
	}

	function seidelRow(myTable){
		if (seimaxrow>1){
			var x=document.getElementById(myTable).deleteRow(myTable,seimaxrow-1);
			seimaxrow--
		}
	}

	function seialternate(id){
		if(document.getElementsByTagName){
		   var table = document.getElementById(id);
		   var rows = table.getElementsByTagName("tr");
		   for(i = 0; i < rows.length; i++){
			   //manipulate rows
			   if(i % 2 == 0){
			      rows[i].className = "even";
			   }else{
			      rows[i].className = "odd";
			   }
		   }
		 }
	}

	function seirerun_id(){
		if(seimaxrow != 1){
			if (!document.dataform.seitc_id.length){
				document.dataform.seitc_id.value=1;
			}else{
				for (var i=0; i < document.dataform.seitc_id.length; i++){
					document.dataform.seitc_id[i].value=i+1;
	   			}
			}
		}
	}

	function seidelRown(myTable,Rown)
	{
		var x=document.getElementById(myTable).deleteRow(Rown);
		seimaxrow--
	}

	function seirender(myTable){
		//alert('aaa  ' + seidata1.length);
		for (i=1;i<=seidata1.length-1;i++){
			seiinsRow(myTable,seimaxrow,seidata1[i],seidata2[i],seidata3[i],seidata4[i],seidata5[i],seidata6[i],seidata7[i],seidata8[i],seidata9[i],seidata10[i],seidata11[i],seidata12[i],seidata13[i],seidata14[i],seidata15[i],seidata16[i],seidata17[i],seidata18[i],seidata19[i],seidata20[i],seidata21[i],seidata22[i],seidata23[i],seidata24[i],seidata25[i],seidata26[i]);
		}
	}

	function seiCheck(chkcont,chk){
		if(chkcont.checked==true){
			for (i = 0; i < chk.length; i++)
				chk[i].checked = true ;
		}else{
			for (i = 0; i < chk.length; i++)
				chk[i].checked = false ;
		}
	}
	
	function seiopenmodal(myTable){
		var  dup=0;
		var seidata = window.showModalDialog('process?action=Exhibit_arrest_pop', self , 'dialogWidth=700px,Height=400px');
		
		if(seidata != null){ 
			seidelall(myTable);
			for (var i=0; i < seidata.length; i++)	{
				//alert(i);
				seiinsRow(myTable,seimaxrow,seidata[i][1],seidata[i][2],seidata[i][3],seidata[i][4],seidata[i][5],seidata[i][6],seidata[i][7],seidata[i][8],seidata[i][9],seidata[i][10],seidata[i][11],seidata[i][12],seidata[i][13],seidata[i][14],seidata[i][15],seidata[i][16],seidata[i][17],seidata[i][18],seidata[i][19],seidata[i][20],seidata[i][21],seidata[i][22],seidata[i][23],seidata[i][24],seidata[i][25],seidata[i][26]);
			}
		}
	}
	
	function seidelall(myTable){
		
		var c_value = "";
		var x="";
		if(seimaxrow == 1){}else{
			if (!document.dataform.seitc_id.length)
			{
			//alert ("nobox");
				document.getElementById(myTable).deleteRow(1);
				seimaxrow--;
			}else{
				var numrow =  document.dataform.seitc_id.length;
				for (var i=0; i < numrow; i++)
		   		{
					document.getElementById(myTable).deleteRow(1);
					seimaxrow=1;
		      	}
		  	 	seirerun_id();
			}
		}
	}
	
	function printReports(){
		var repName = "ILL_P043";//name of report
		var trackNo = document.getElementById("stockin_code").value;
		Reports.ReportUrl(function(data){
			if(data != ""){
				window.open(data + "ReportName=" + repName + "&getStockNo="+trackNo+"&vReportType=PDF&time=" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}else{
				window.open('process?action=Report&__report=' + repName + '&__formatt=pdf&getStockNo='+trackNo+'&rnd='+new Date().getTime() , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}
		});		
	}

	function caleft(ro){
		var sub ;
		
		if(document.dataform.seitc_id.length){
			for(var mm=0; mm < document.dataform.seitc_id.length; mm++){
				//alert("qty : "+document.dataform.sei_qty[mm].value + "   send_qty : " + document.dataform.sei_send_qty[mm].value);
				if(parseFloat(document.dataform.sei_qty[mm].value) > parseFloat(document.dataform.sei_send_qty[mm].value)){
					alert("กรูณากรอกค่าให้น้อยกว่าจำนวนจับกุม");
					document.dataform.sei_qty[mm].select();
					return;
				}else{
					sub = parseFloat(document.dataform.sei_send_qty[mm].value)-parseFloat(document.dataform.sei_qty[mm].value);
			
					document.dataform.sei_left_qty[mm].value=sub;
					sub=0;
				}
			}
		}else{
			if(parseFloat(document.dataform.sei_qty.value) > parseFloat(document.dataform.sei_send_qty.value)){
				alert("กรูณากรอกค่าให้น้อยกว่าจำนวนจับกุม");
				document.dataform.sei_qty.select();
				return;
			}else{
				sub = parseFloat(document.dataform.sei_send_qty.value)-parseFloat(document.dataform.sei_qty.value);
				document.dataform.sei_left_qty.value=sub;
				
			}
		}
	}
	
	function seiinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26){
		var row;
		var x=document.getElementById(myTable).insertRow(seimaxrow);
		seimaxrow++;
		row = seimaxrow - 1;
		var y1=x.insertCell(0);
		var y2=x.insertCell(1);
		var y3=x.insertCell(2);
		var y4=x.insertCell(3);
		var y5=x.insertCell(4);
		var y6=x.insertCell(5);
		var y7=x.insertCell(6);
		var y8=x.insertCell(7);

		var exp = new Date();
		var s = exp.getTime();
		var sub = parseFloat(data13)-parseFloat(data14);
		y1.innerHTML="<input readonly class='textboxlist' size='1' name='seitc_id' value='" + row + "' />";

		var productName = data25;
		if(data20 != "")
			productName += " ยี่ห้อ " + data20;
		
		y2.innerHTML="<input type=\"hidden\" name=\"seiref_id\" value=\""+s+"\" />"+productName;
		y3.innerHTML=data10;
		y4.innerHTML="<input type=\"text\" size=\"2\" name=\"sei_send_qty\" readonly class=\"textViewNum\" value=\""+data7+"\">"+" "+data8;
		y5.innerHTML="<input type=\"text\" size=\"2\" style=\"text-align: right\" name=\"sei_qty\" value=\""+data13+"\" onkeypress=\"ChkMinusDbl(this);\" onBlur=\" caleft('"+s+"'); \" > "+" "+data8;
		y6.innerHTML="<input type=\"text\" size=\"2\" name=\"sei_left_qty\"  class=\"textViewNum\" readonly value=\""+(data7-data13)+"\">"+" "+data8;
		y7.innerHTML="<input type=\"text\" size=\"2\" style=\"text-align: right\" name=\"sei_netweigth\" class=\"textNum\" value=\""+data15+"\" onkeypress=\"ChkMinusDbl(this);\" >"+getUnitSelect(data14, row, data19);
		y8.innerHTML="<input type=\"text\" size=\"20\" name=\"sei_remarks\" value=\"" + data16 + "\"  >"
		+"<input type=\"hidden\"  name=\"sei_id\" value=\""+data1+"\" />"
		+"<input type=\"hidden\"  name=\"sei_product_code\" value=\""+data2+"\" />"
		+"<input type=\"hidden\"  name=\"sei_product_name\" value=\""+data3+"\" />"
		+"<input type=\"hidden\"  name=\"sei_brand_code\" value=\""+data4+"\" />"
		+"<input type=\"hidden\"  name=\"sei_sizes_code\" value=\""+data5+"\" />"
		+"<input type=\"hidden\"  name=\"sei_sizes_unit_code\" value=\""+data17+"\" />"
		+"<input type=\"hidden\"  name=\"sei_unit_code\" value=\"" + data6 +"\" />"
		+"<input type=\"hidden\"  name=\"sei_send_unit\" value=\""+data8+"\" />"
		+"<input type=\"hidden\"  name=\"sei_isdomestic\" value=\""+data9+"\" />"
		+"<input type=\"hidden\"  name=\"sei_isdomestic_name\" value=\""+data10+"\" />"
		+"<input type=\"hidden\"  name=\"sei_stockin_type\" value=\""+data11+"\" />"
		+"<input type=\"hidden\"  name=\"sei_lose_qty\" value=\""+data13+"\" />"
		+"<input type=\"hidden\"  name=\"sei_duty_code\" value=\""+data18+"\" />"
		+"<input type=\"hidden\"  name=\"sei_group_id\" value=\""+data19+"\" />"
		+"<input type=\"hidden\"  name=\"sei_product_name\" value=\""+data3+"\" />"
		+"<input type=\"hidden\"  name=\"sei_brand_name\" value=\""+data20+"\" />"
		+"<input type=\"hidden\"  name=\"sei_qty_unit_name\" value=\""+data21+"\" />"
		+"<input type=\"hidden\"  name=\"sei_sizes_desc\" value=\""+data22+"\" />"
		+"<input type=\"hidden\"  name=\"sei_sizes_unit_name\" value=\""+data23+"\" />"
		+"<input type=\"hidden\"  name=\"sei_netweight_unit_name\" value=\""+data24+"\" />"
		+"<input type=\"hidden\"  name=\"sei_duty_name\" value=\""+data25+"\" />"
		+"<input type=\"hidden\"  name=\"sei_group_name\" value=\""+data26+"\" />";
	}

	var aatmaxrow=1; // jsp  Count  config
	var aatstartrow=2;
	var aateditrow = -1;
	var aateditna = 0;

	function aatinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12){
		var row;
		var x=document.getElementById(myTable).insertRow(aatmaxrow);
		aatmaxrow++;
		row = aatmaxrow - 1;
		var y1=x.insertCell(0);
		var y2=x.insertCell(1);
		var y3=x.insertCell(2);
		var y4=x.insertCell(3);
		var y5=x.insertCell(4);
		var y6=x.insertCell(5);
		var y7=x.insertCell(6);
		
		
		var exp = new Date();
		var s = exp.getTime();
		
		y1.innerHTML="<input readonly class='textboxlist' size='1' name='aattc_id' value='" + row + "' />";
		y2.innerHTML="<input type=\"checkbox\" name=\"aatcheckbox\" value=\"\"><input type=\"hidden\" name=\"aatref_id\" value=\""+s+"\" />";
		y3.innerHTML= data10;
		y4.innerHTML= data4+
		"<input type=\"hidden\" name=\"aat_id\" value=\""+data1+"\">"
		+"<input type=\"hidden\" name=\"aat_staff_no\" value=\""+data2+"\">"
		+"<input type=\"hidden\" name=\"aat_inspector_code\" value=\""+data3+"\">"
		+"<input type=\"hidden\" name=\"aat_staff_position\" value=\""+data4+"\">"
		+"<input type=\"hidden\" name=\"aat_staff_idcardno\" value=\""+data6+"\">"
		+"<input type=\"hidden\" name=\"aat_staff_poscode\" value=\""+data7+"\">"
		+"<input type=\"hidden\" name=\"aat_staff_offcode\" value=\""+data8+"\">"
		+"<input type=\"hidden\" name=\"aat_offname\" value=\""+data9+"\">"
		+"<input type=\"hidden\" name=\"aat_first_name\" value=\""+data10+"\">"
		+"<input type=\"hidden\" name=\"aat_last_name\" value=\""+data11+"\">"
		+"<input type=\"hidden\" name=\"aat_title_name\" value=\""+data12+"\">";
	}
	
	function aatdelRow(myTable){
		if (aatmaxrow>1){
			var x=document.getElementById(myTable).deleteRow(myTable,aatmaxrow-1);
			aatmaxrow--
		}
	}

	function aatalternate(id){
	 if(document.getElementsByTagName){
	   var table = document.getElementById(id);
	   var rows = table.getElementsByTagName("tr");
	   for(i = 0; i < rows.length; i++){
	     //manipulate rows
	     if(i % 2 == 0){
	       rows[i].className = "even";
	     }else{
	       rows[i].className = "odd";
	     }
	   }
	 }
	}

	function aatrerun_id(){
		if (!document.dataform.aattc_id.length){
			document.dataform.aattc_id.value=1;
		}
		for (var i=0; i < document.dataform.aattc_id.length; i++){
			document.dataform.aattc_id[i].value=i+1;
		}
	}

	function aatdelRown(myTable,Rown){
		var x=document.getElementById(myTable).deleteRow(Rown);
		aatmaxrow--
	}

	function aatopenmodal(myTable){
		var  dup=0;
		var data = window.showModalDialog('process?action=Divide_staff_poplist', self , 'dialogWidth=700px,Height=400px');
		if(data != null){
			for (var i=0; i < data.length; i++){
				dup=0;
				if (aatmaxrow>1){
					for (var j=0; j < document.dataform.aat_staff_idcardno.length; j++){
						//alert (document.dataform.aat_staff_idcardno[j].value+ "-" +data[i][5]);
						if (document.dataform.aat_staff_idcardno[j].value==data[i][5])
								dup=1;
					}
				}
				if (dup==0){
			    	aatinsRow(myTable,aatmaxrow,"",data[i][1],data[i][2],data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8],data[i][9],data[i][10],data[i][11]);	
			    }
			}
		}
	}

	function aatget_check_value(myTable){
		var c_value = "";
		var x="";
		var ans;
		if(aatmaxrow != 1){
			if (!document.dataform.aatcheckbox.length&&document.dataform.aatcheckbox.checked){
				ans = confirm("ต้องการลบรายการ ใช่หรือไม่");
				if(ans){
				    document.getElementById(myTable).deleteRow(1);
				    aatmaxrow--;
				}
			}else{
			   var chkCount = 0;
               for(var j=0;j< document.dataform.aatcheckbox.length; j++){
            	   if (document.dataform.aatcheckbox[j].checked){
                	   chkCount++;

                   }

               }
               if(chkCount>0){
            	   ans = confirm("ต้องการลบรายการ ใช่หรือไม่");
            	   if(ans){
			           for (var i=0; i < document.dataform.aatcheckbox.length; i++){	
			   		        if (document.dataform.aatcheckbox[i].checked){
						        document.getElementById(myTable).deleteRow(i+1);
					  	        i--;
						        aatmaxrow--;
				            }
			           }
			           aatrerun_id();
            	   }
               }
			}
		}
	}
	
	function aatrender(myTable){
	 	for (i=1;i<=aatdata1.length-1;i++){
	 		aatinsRow(myTable,i,aatdata1[i],aatdata2[i],aatdata3[i],aatdata4[i],aatdata5[i],aatdata6[i],aatdata7[i],aatdata8[i],aatdata9[i],aatdata12[i],aatdata11[i],aatdata10[i]);
	 	}
	}

	function aatCheck(chkcont,chk){
		if(document.dataform.checkbox1.checked == true){
			for (i = 0; i < document.dataform.aatcheckbox.length; i++){
				document.dataform.aatcheckbox[i].checked = true ;
			}
		}else{
			for (i = 0; i < document.dataform.aatcheckbox.length; i++){
				document.dataform.aatcheckbox[i].checked = false ;
			}
		}
	}

	function tosubmit2(){

		var rowCount = document.getElementById('seiTable').rows.length;
		if(document.dataform.onsubmit()){
			if(rowCount <= 1){
				alert("กรุณาเพิ่มรายการของกลาง");		
			}else
				document.dataform.submit();
		}else
			return false;
	}
	
	aatrender('aatTable');
</script>
<script type="text/javascript" src="script/logic/exhibit_module.js"></script>
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%" align="left" valign="top">
		<form action="process?action=ExhibitReceive&cmd=update" name="dataform" method="post">
		<input type="hidden" name="id" value="${si.id}" />
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="1%">&nbsp;</td>
				<td width="99%"><span class="websitename">การตรวจรับของกลาง</span></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td height="25">&nbsp;</td>
				<td>
					<c:if test="${si.status != '2'}">
						<input name="btnSave" type="button" class="barbutton" value="บันทึก" onClick="javascript:tosubmit2();">
						<input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="clickBack8();">  
						<c:if test="${si.id == null}">
							<input name="btnCancel" type="reset" class="barbutton" value="ยกเลิกการแก้ไข" onclick="caleft('ro');">
						</c:if>
						<c:if test="${si.id != null}">
							<input name="btnCancel" type="reset" class="barbutton" value="ยกเลิกการแก้ไข" onclick="clickCancal();">
							<input name="btnConfirm" type="button" class="barbutton" value="ยืนยัน" onClick="confirm2()"> 
							<input name="btnPrint" type="button" class="barbutton" value="พิมพ์" onClick="printReports();writeTranLog('พิมพ์บันทึกการตรวจรับของกลาง');">
						</c:if>
					</c:if>
					<c:if test="${si.status == '2'}" >
						<input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="clickBack8();">
						<input name="btnPrint" type="button" class="barbutton" value="พิมพ์" onClick="printReports();writeTranLog('พิมพ์บันทึกการตรวจรับของกลาง');"> 
					</c:if>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
				<table width="800" border="0" cellspacing="0" cellpadding="0">
					<tr valign="top">
						<td colspan="2">
						<table border="0" cellpadding="0" cellspacing="0" width="800">
							<tr>
								<td align="right" width="20%">เลขที่งานรับ :&nbsp;</td>
								<td width="30%"><input type="text" id="stockin_code" name="stockin_code" class="textview" size="30" value="${si.stockin_code}" OnKeyPress="window.event.keyCode = 0" /></td>
								<td align="right" width="20%">วันที่รับของกลาง :&nbsp;</td>
								<td width="30%">
									<c:if test="${si.stockin_date != null}">
										<input type="text" id="stockin_date" name="stockin_date" size="15" class="textdate" OnKeyPress="window.event.keyCode = 0" value="${si.stockin_date}" /> 
										<a href="javascript:NewCssCal('stockin_date','ddmmyyyy')">
										<img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
										<input id="stockin_time"name="stockin_time" id="send_time" type="text" class="textbox" size="5" maxlength="5" value="${si.stockin_time}" onkeypress="txtTime_OnKeyPress(this);" />
									</c:if>
									<c:if test="${si.stockin_date == null}">
										<input type="text" id="stockin_date" name="stockin_date" size="15" class="textdate" OnKeyPress="window.event.keyCode = 0" value="<fmt:formatDate value='<%=new Date() %>' pattern="dd/MM/yyyy"/>"/> 
										<a href="javascript:NewCssCal('stockin_date','ddmmyyyy')">
										<img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a> 
										<input id="stockin_time"name="stockin_time" id="send_time" type="text" class="textbox" size="5" maxlength="5" value="<fmt:formatDate value='<%=new Date() %>' pattern="HH:mm"/>" onkeypress="txtTime_OnKeyPress(this);" />
									</c:if>
								    <font style="color: red">*</font>
								</td>
							</tr>
							<tr>
								<td align="right">เลขที่หนังสือส่ง :&nbsp;</td>
								<td>กค. 
									<input type="text" id="doc_no" name="doc_no" value="${si.delivery_code}" size="30" class="textview" OnKeyPress="window.event.keyCode = 0" /> 
									<input type="hidden" id="de_id" name="de_id" value="${si.delivery_exhibit_id}" />
									<input type="hidden" id="so_id" name="so_id" value="${si.stockout_id}" />
									<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor: hand" onClick="javascript:seiopenmodal('seiTable');"> 
									<font style="color: red">*</font>
									<input type="hidden" id="de_id_1" name="de_id_1" value="${si.id}" />
								</td>
								<td align="right">วันที่นำส่ง :&nbsp;</td>
								<td>
									<input type="text" id="send_date" name="send_date" size="15" class="textdate"
									value="${si.delivery_date}" OnKeyPress="window.event.keyCode = 0" />
								</td>
							</tr>

							<tr valign="top">
								<td align="right">สถานที่จัดเก็บ :&nbsp;</td>
								<td align="left">
									<input type="text" id="location" name="location" class="textbox" size="20" value="${si.location}" /> 
									<font style="color: red">*</font>
								</td>
								<td align="right">วันที่ครบกำหนด<br />ทำลาย/ขายทอดตลาด :&nbsp;</td>
								<td>
									<input type="text" id="destroy_limit_date" name="destroy_limit_date" size="15" class="textdate" OnKeyPress="window.event.keyCode = 0" value="${si.destroy_limit_date}" /> 
									<a href="javascript:NewCssCal('destroy_limit_date','ddmmyyyy')">
									<img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>&nbsp;
								</td>
							</tr>
							<tr>
								<td align="right">จากหน่วยงาน :&nbsp;</td>
								<td align="left"><input type="text" name="offname" class="textview" OnKeyPress="window.event.keyCode = 0" size="40"  value="${si.offname}"></td>
								<td align="right">สถานะ :&nbsp;</td>
								<td align="left"><input type="text" name="status_name" class="textview" OnKeyPress="window.event.keyCode = 0" size="40" value="${si.statusname}"></td>
								<td align="left"><input type="hidden" name="status" value="${si.status}"></td>
							</tr>
							<tr>
								<td align="right">ผู้บันทึก :&nbsp;</td>
								<td><input type="text" name="receive_by" class="textview" readonly size="30" value="${si.staff_name}"></td>
								<td align="right">ตำแหน่ง :&nbsp;</td>
								<td><input type="text" name="poscode_receive" class="textview" readonly size="40" value="${si.posname}"></td>
							</tr>
							<tr>

								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td><span class="spanLink" onClick="aatopenmodal('aatTable');"> เพิ่มใหม่</span> | <span class="spanLink"
									onclick="aatget_check_value('aatTable')">ลบรายการที่เลือก</span></td>
							</tr>
							<tr>
								<td height="25" align="right" valign="top">คณะกรรมการตรวจรับ :&nbsp;</td>
								<td colspan="3">
								<table id="aatTable" class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0">
									<tr class="TblHeaderColumn AlignCenter">
										<td width="50">ลำดับที่</td>
										<td width="30"><input type="checkbox" name="checkbox1" value="checkbox" onclick="aatCheck();"></td>
										<td width="200">ชื่อ-สกุล</td>
										<td width="300">ตำแหน่ง</td>
									</tr>
									<c:forEach items="${aatlist}" var="aat" varStatus="i">
										<script>
											 aatdata1[${i.count}] = "${aat.id}";
											 aatdata2[${i.count}] ="${aat.staff_idcardno}";
											 aatdata3[${i.count}]  ="";
											 aatdata4[${i.count}] ="${aat.posname}";
											 aatdata5[${i.count}]  ="${aat.duty_status_id}";
											 aatdata6[${i.count}]  ="${aat.staff_idcardno}";
											 aatdata7[${i.count}]  ="${aat.staff_poscode}";
											 aatdata8[${i.count}]  ="${aat.staff_offcode}";
											 aatdata9[${i.count}]  ="${aat.offname}";
											 aatdata10[${i.count}] ="";
											 aatdata11[${i.count}] ="";
											 aatdata12[${i.count}] ="${aat.staff_name}";
										</script>
									</c:forEach>
								</table>
								</td>
							</tr>
							<tr>
								<td colspan="4">&nbsp;</td>
							</tr>
							<tr>
								<td align="right" valign="top">หมายเหตุ :&nbsp;</td>
								<td align="left" colspan="3"><textarea name="remarks" cols="" rows="3" class="textareabig">${si.remarks}</textarea></td>
							</tr>
							<tr><td colspan="4">&nbsp;</td></tr>
							<tr>
								<td align="right" >&nbsp;</td>
								<td align="left" colspan="3">ลำดับที่ 1 คือประธานกรรมการตรวจรับ</td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td height="25" colspan="2"><span class="logindetail">รายการรับของกลาง</span></td>
					</tr>
					<tr>

						<td colspan="2">
						<table id="seiTable" class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
							<tr>
								<td width="5%" class="TblHeaderColumn AlignCenter">ลำดับ</td>
								<td class="TblHeaderColumn AlignCenter">ชื่อสินค้า</td>
								<td width="10%" class="TblHeaderColumn AlignCenter">ประเทศ</td>
								<td width="10%" class="TblHeaderColumn AlignCenter">จำนวนส่ง</td>
								<td width="10%" class="TblHeaderColumn AlignCenter">จำนวนชำรุด</td>
								<td width="10%" class="TblHeaderColumn AlignCenter">จำนวนรับ</td>
								<td width="20%" class="TblHeaderColumn AlignCenter">ปริมาณสุทธิ</td>
								<td width="20%" class="TblHeaderColumn AlignCenter">หมายเหตุ</td>
							</tr>
							<c:forEach items="${seilist}" var="aa" varStatus="i">
								<script>
										seidata1[${i.count}] = "${aa.id}" ;
										seidata2[${i.count}] = "${aa.product_code}" ;
										seidata3[${i.count}] = "${aa.product_name}" ;
										seidata4[${i.count}] = "${aa.brand_code}" ;
										seidata5[${i.count}] = "${aa.sizes_code}";
										seidata6[${i.count}] = "${aa.unit_code}";
										seidata7[${i.count}] = "${aa.send_qty}";
										seidata8[${i.count}] = "${aa.unit_name}";
										seidata9[${i.count}] = "${aa.isdomestic}";
										seidata10[${i.count}] = "${aa.isdomestic_name}";
										seidata11[${i.count}] = "${aa.stockin_type}";
										seidata12[${i.count}] = "${aa.sel_id}";
										seidata13[${i.count}] = "${aa.lose_qty}";
										seidata14[${i.count}] = "${aa.netweight_unit}";
										seidata15[${i.count}] = "${aa.netweight}";
										seidata16[${i.count}] = "${aa.remarks}";	
										seidata17[${i.count}] = "${aa.sizes_unit_code}";
										seidata18[${i.count}] = "${aa.duty_code}";
										seidata19[${i.count}] = "${aa.group_id}";
										seidata20[${i.count}] = "${aa.brand_name}";
										seidata21[${i.count}] = "${aa.unit_name}";
										seidata22[${i.count}] = "${aa.sizes_desc}";
										seidata23[${i.count}] = "${aa.sizes_unit_name}";
										seidata24[${i.count}] = "${aa.netweight_unit_name}";
										seidata25[${i.count}] = "${aa.duty_name}";
										seidata26[${i.count}] = "${aa.group_name}";						
									</script>
							</c:forEach>
						</table>
						</td>
					</tr>
					<tr valign="top">
						<td colspan="2" align="center">&nbsp;</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</form>
	</tr>
</table>
<script language="JavaScript" type="text/javascript">
	aatrender('aatTable');
	seirender('seiTable');
	//You should create the validator only after the definition of the HTML form
  	var frmvalidator  = new Validator("dataform");

  	frmvalidator.addValidation("doc_no","req","กรุณากรอกเลขที่เอกสาร กค.");
  	frmvalidator.addValidation("location","req","กรุณากรอกสถานที่จัดเก็บ");
  	frmvalidator.addValidation("stockin_date","req","กรุณากรอกวันที่รับของกลาง");
  	frmvalidator.addValidation("stockin_time","req","กรุณากรอกเวลาที่รับของกลาง");
  	//frmvalidator.addValidation("destroy_limit_date","req","กรุณากรอกวันที่ครบกำหนด ทำลาย/ขายทอดตลาด");

  	
</script>