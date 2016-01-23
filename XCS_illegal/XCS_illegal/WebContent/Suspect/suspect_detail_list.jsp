<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.ko.function.*" %>
<%@page import="com.ko.function.ReturnDateFormat" %>
<%@page import="com.ko.service.RunningKey" %>

<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<script type="text/javascript" language="JavaScript" src="script/KOPopup.js" ></script>
<script type="text/javascript" language="JavaScript" src="script/KOObject.js" ></script>
<script type="text/javascript" language="JavaScript" src="script/KOTable.js" ></script>
<script type="text/javascript" language="JavaScript" src="script/JSon.js" ></script>


<script type="text/JavaScript">

function MM_jumpMenu(targ,selObj,restore){ //v3.0
  eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
  if (restore) selObj.selectedIndex=0;
}

function MM_jumpMenuGo(selName,targ,restore){ //v3.0
  var selObj = MM_findObj(selName); if (selObj) MM_jumpMenu(targ,selObj,restore);
}

function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}

function togglePict(bID,aID){
		mnuB = document.getElementById(bID);
		mnuA = document.getElementById(aID);

		if (mnuB.style.display == 'none'){
			mnuA.style.display = 'none';
			mnuB.style.display = '';
		}else{
			mnuA.style.display = '';
			mnuB.style.display = 'none';
		}

	}

function winPopup(theURL,winName,features, myWidth, myHeight, isCenter) {
	if(window.screen)if(isCenter)if(isCenter=="true"){
		var myLeft = (screen.width-myWidth)/2;
		var myTop = (screen.height-myHeight)/2;
		features+=(features!='')?',':'';
		features+=',left='+myLeft+',top='+myTop;
	}
	
	window.open(theURL,winName,features+((features!='')?',':'')+'width='+myWidth+',height='+myHeight);
} 
//-->
</script>
<style type="text/css">
<!--
.style7 {
	color: #FF0000;
	font-weight: bold;
}
-->
</style>

	<%@ include file="../Templates/header.jsp" %>
	

	<% 
	    request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html;charset=utf-8");
	    
		String path = com.ko.util.FormUtility.getScriptReferencePath(request);
		java.util.HashMap<String,String> params = com.ko.util.EngineUtility.transformRequestParameter(request.getParameterMap());
		String revisionCommand = com.ko.util.FormUtility.generateRealRevisionCommand(params);
		String suspectNo = request.getParameter("suspect_no");
		String suspect_investigate_id = request.getParameter("suspect_investigate_id");
	%>
	
<script type="text/javascript">

         var ko_object = new KO_Object();

 //_________________  indictment
 
         var indictment = [];//new Array();
      	 var ko_table_Indictment = new KO_Table();
      	 ko_table_Indictment.setTableId("table_indictment");
      	 ko_table_Indictment.setTrId("indictment");
        // ko_table_Indictment.setTrStyle("class='TblRow'","class='TblRow bgRowGray'");
         ko_table_Indictment.setTrStyle_row1("class='TblRow'");
         ko_table_Indictment.setTrStyle_row2("class='TblRow bgRowGray'");
         ko_table_Indictment.setTdStyle_row1("class='TblRow AlignCenter'","class='TblRow AlignCenter'","class='TblRow'");
         ko_table_Indictment.setTdStyle_row2("class='TblRow AlignCenter'","class='TblRow AlignCenter'","class='TblRow'");
         ko_table_Indictment.setReferenceObject(indictment);
     	 var property_indictment=new Array("key.Index","key.Checkbox:Value=property.CASE_LAW_ID","property.CASE_LAW_ID","property.PENALTY_CASE_LAW_ID","property.GUILT_BASE"); 
     	 ko_table_Indictment.setColumns_property(property_indictment);
     	 
         var indexer = new Object();
         indexer.indictment = 1;
         indexer.Suspect_vehicle = 1;
         indexer.v_staff_list = 1;
   	 
        function openPopupIndictment()
        {
        	var listPopupObject = openPopupDialog('Popup/arrest_indictment_form.jsp?varPopupName=&varLegislationID='+document.getElementsByName('legislation_id')[0].value +  '&varDisableLegislation=N&varItemPerPage=20&varSearch=Y' ,'', 'dialogWidth:650px,dialogHeight:350px,top=220,left=450,menubar=no,toorlbar=no,location=no,scrollbars=no,modal=yes');
        	if(listPopupObject != null){
            ko_table_Indictment.setRowIndex(indexer.indictment);      
           // ko_table_Indictment.createRows("table_indictment",listPopupObject,property_indictment);
            ko_table_Indictment.createRows(listPopupObject);
        	ko_object.setPushArrayObject(indictment,listPopupObject);
        	ko_table_Indictment.setReferenceObject(indictment);
        	indexer.indictment = ko_table_Indictment.getReferentObject().length+1;
        	}
        }

        function removeRowIndictment()
        {
        	 var select_index = ko_table_Indictment.getSelectCheckBoxIndex();
        	 for (var i = 0; i < select_index.length; i++) {
            	 ko_table_Indictment.removeRow(select_index[i]-i);
        		 ko_table_Indictment.setNullReferentObject(select_index[i]);
        	 }
        	 indictment = ko_object.getClearValueNullInArray(indictment);
        	 ko_table_Indictment.setReferenceObject(indictment);
    		 indexer.indictment = ko_table_Indictment.getReferentObject().length+1; 
        }

        function isAllCheckBoxIndictment(objectCheckBox) {
   		 if(objectCheckBox.checked == true){
   			 ko_table_Indictment.isAllCheckBox(true);
   		 }else{
   			 ko_table_Indictment.isAllCheckBox(false);
   		 }
   	 }
      	 
 //_______________ V_STAFF_LIST
     var v_staff_list = [];//new Array();
     var ko_table_v_staff_list = new KO_Table();
     ko_table_v_staff_list.setTrId("v_staff_list");
     ko_table_v_staff_list.setTrStyle_row1("class='TblRow'");
     ko_table_v_staff_list.setTrStyle_row2("class='TblRow bgRowGray'");
     ko_table_v_staff_list.setTdStyle_row1("class='TblRow AlignCenter'","class='TblRow AlignCenter'","");
     ko_table_v_staff_list.setTdStyle_row2("class='TblRow AlignCenter'","class='TblRow AlignCenter bgRowGray'","");
     ko_table_v_staff_list.setReferenceObject(v_staff_list);
     
 	 var property_v_staff_list=new Array("key.Index","key.Checkbox","format('property.TITLE_NAME''property.FIRST_NAME' 'property.LAST_NAME')","property.POSNAME"); 
    
 	  function openPopupV_STAFF_LIST(){ 
 	    	var listPopupObject = openPopupDialog('Popup/divide_staff_pop.jsp?varPopupName=&varOffname=&varItemPerPage=20&varSearch=Y' ,'', 'dialogWidth:650px,dialogHeight:400px,top=220,left=400,menubar=no,toorlbar=no,location=no,scrollbars=no,modal=yes');
 	    	if(listPopupObject != null){ 
 	        ko_table_v_staff_list.createRows(listPopupObject,property_v_staff_list,"table_V_staff_list");
 	        ko_object.setPushArrayObject(v_staff_list,listPopupObject);
 	        ko_table_v_staff_list.setReferenceObject(v_staff_list);
 	    	}
 	    }

 	 function removeRowV_STAFF_LIST()
      {
      	 var select_index = ko_table_v_staff_list.getSelectCheckBoxIndex();
      	 for (var i = 0; i < select_index.length; i++) {
          	ko_table_v_staff_list.removeRow(select_index[i]-i);
          	ko_table_v_staff_list.setNullReferentObject(select_index[i]);
      	 }
      	 v_staff_list = ko_object.getClearValueNullInArray(v_staff_list);
      	 ko_table_v_staff_list.setReferenceObject(v_staff_list);
      	 indexer.v_staff_list = ko_table_v_staff_list.getReferentObject().length+1; 
      }

      function isAllCheckBoxV_STAFF_LIST(objectCheckBox) {
 		 if(objectCheckBox.checked == true){
 			ko_table_v_staff_list.isAllCheckBox(true);
 		 }else{
 			ko_table_v_staff_list.isAllCheckBox(false);
 		 }
 	 }  	 
//_________________  SUSPECT_VEHICLE
   	 
   	 var ko_table_Suspect_vehicle = new KO_Table();
   	     ko_table_Suspect_vehicle.setTableId("table_Suspect_vehicle");
       	 ko_table_Suspect_vehicle.setTrId("Suspect_vehicle");
       	 ko_table_Suspect_vehicle.setTdStyle_row1("","class='TblRow AlignCenter'","class='TblRow AlignLeft'");
       	 ko_table_Suspect_vehicle.setTdStyle_row2("","class='TblRow AlignCenter bgRowGray'","class='TblRow AlignLeft bgRowGray'");
       	 
     	 var property_Suspect_vehicle=new Array("key.Checkbox","property.CAR_NO","property.PRODUCTTYPE_TYPE_NAME","format('property.BRAND_BRAND_NAME'/'property.CAR_MODEL'/'property.CAR_COLOR')","property.DESCRIPTION"); 
     	 ko_table_Suspect_vehicle.setColumns_property(property_Suspect_vehicle);

    function openPopupSUSPECT_VEHICLE(){ 
    	var popupObject = openPopupDialog('Popup/popup_vehicle.jsp' ,'', 'dialogWidth:550px,dialogHeight:350px,top=220,left=450,menubar=no,toorlbar=no,location=no,scrollbars=no,modal=yes');
    	if(popupObject != null){ 
        ko_table_Suspect_vehicle.createRow(popupObject);
    	}
    }

    function removeRowSUSPECT_VEHICLE()
    {
    	 var select_index = ko_table_Suspect_vehicle.getSelectCheckBoxIndex();
    	 for (var i = 0; i < select_index.length; i++) {
             ko_table_Suspect_vehicle.removeRow(select_index[i]-i);
    		 ko_table_Suspect_vehicle.setNullReferentObject(select_index[i]);
    	 }
    	// ko_table_Suspect_vehicle.clearRows();
    	 ko_table_Suspect_vehicle.clearNullReferentObject();
		 indexer.Suspect_vehicle = ko_table_Suspect_vehicle.getReferentObject().length+1; 
		 //var sob = ko_table_Suspect_vehicle.getReferentObject();
    }

    function isAllCheckBoxSUSPECT_VEHICLE(objectCheckBox) {
		 if(objectCheckBox.checked == true){
			 ko_table_Suspect_vehicle.isAllCheckBox(true);
		 }else{
			 ko_table_Suspect_vehicle.isAllCheckBox(false);
		 }
	 }

    function showPopup(){
    	var popupObject = openPopupDialog('Popup/arrest_accuser_pop.jsp?varPopupName=&varOffname=&varItemPerPage=20&varSearch=Y' ,'', 'dialogWidth:650px,dialogHeight:500px,top=220,left=450,menubar=no,toorlbar=no,location=no,scrollbars=no,modal=yes');
    	return popupObject;
    }

	 function openPopupStaff(control_1,control_2){
 		 var popupObject = showPopup();
 	     if(popupObject != null){ 
    		document.getElementsByName(control_1)[0].value = popupObject.TITLE_NAME+popupObject.FIRST_NAME+" "+popupObject.LAST_NAME;
    		document.getElementsByName(control_2)[0].value = popupObject.IDCARD_NO;
            }else{
            	document.getElementsByName(control_1)[0].value = null;
        		document.getElementsByName(control_2)[0].value = null;
            }
 	 }
 	 
 	 function openPopupStaff1(){
 		 var popupObject = showPopup();
 	     if(popupObject != null){ 
    		document.getElementsByName('name_staff_investigate')[0].value = popupObject.TITLE_NAME+popupObject.FIRST_NAME+" "+popupObject.LAST_NAME;
    		document.getElementsByName("staff_investigate")[0].value = popupObject.POSCODE;
    		document.getElementsByName("poscode_investigate")[0].value = popupObject.IDCARD_NO;
            }else{
            	document.getElementsByName('name_staff_investigate')[0].value = null;
        		document.getElementsByName("staff_investigate")[0].value = null;
        		document.getElementsByName("poscode_investigate")[0].value = null;
            }
 	 }
 	
 	 function openPopupStaff2(id){
 		 var popupObject = showPopup();
 	     if(popupObject != null){ 
    		document.getElementsByName('name_staff_command')[0].value = popupObject.TITLE_NAME+popupObject.FIRST_NAME+" "+popupObject.LAST_NAME;
    		document.getElementsByName("staff_command")[0].value = popupObject.POSCODE;
    		document.getElementsByName("poscode_command")[0].value = popupObject.IDCARD_NO;
            }else{
            	document.getElementsByName('name_staff_command')[0].value = null;
        		document.getElementsByName("staff_command")[0].value = null;
        		document.getElementsByName("poscode_command")[0].value = null;
            }
 	 }
 	 
	function KO_submitForm(){

		var invest_no = document.getElementsByName("investigate_no")[0];
		var name_staff_invest = document.getElementsByName("name_staff_investigate")[0];
		var name_staff_command = document.getElementsByName("name_staff_command")[0];
		var startDate = document.getElementsByName("start_date")[0];		
		var startTime = document.getElementsByName("start_time")[0];
		var endDate = document.getElementsByName("end_date")[0];		
		var endTime = document.getElementsByName("end_time")[0];
			
		if (invest_no.value.length == 0) 
		{
			alert("กรุณากรอกเลขที่รายงานสืบสวน");
			invest_no.focus();
			return false;
		}

		if (name_staff_invest.value.length == 0) 
		{
			alert("กรุณากรอกชื่อผู้สืบสวน");
			name_staff_invest.focus();
			return false;
		}

		if (name_staff_command.value.length == 0) 
		{
			alert("กรุณากรอกชื่อผู้สั่งการให้สืบสวน");
			name_staff_command.focus();
			return false;
		}

		if (startDate.value.length == 0) 
		{
			alert("กรุณากรอกวันที่เริ่มทำการสืบสวน");
			startDate.focus();
			return false;
		}

		if (startTime.value.length == 0) 
		{
			alert("กรุณากรอกเวลาที่เริ่มทำการสืบสวน");
			startTime.focus();
			return false;
		}

		if (endDate.value.length == 0) 
		{
			alert("กรุณากรอกวันที่สิ้นสุดทำการสืบสวน");
			endDate.focus();
			return false;
		}

		if (endTime.value.length == 0) 
		{
			alert("กรุณากรอกเวลาที่สิ้นสุดทำการสืบสวน");
			endTime.focus();
			return false;
		}

		
		try{
			
			document.getElementsByName('suspect_investigate_team')[0].value = JSON.stringify(ko_table_v_staff_list.getReferentObject()); 
			document.getElementsByName('suspect_investigate_indictment')[0].value = JSON.stringify(ko_table_Indictment.getReferentObject()); 
			document.getElementsByName('suspect_vihecle')[0].value = JSON.stringify(ko_table_Suspect_vehicle.getReferentObject());         

			
			//alert(document.getElementsByName('suspect_investigate_team')[0].value);
			//alert(document.getElementsByName('suspect_investigate_indictment')[0].value);
			//alert(document.getElementsByName('suspect_vihecle')[0].value);
			
			//return;
			
			
			jQuery("form#investigation_form").submit();

          
			 //-- upload picture
			 //var url = "SaveSuspectPicture?suspect_no=<%=suspectNo%>";
		   // jQuery("#investigation_form").attr("action","SaveSuspectPicture");
		   // jQuery("form#investigation_form").submit();
		    
		  // alert("บันทึกข้อมูลเรียบร้อย");
		 //  location.reload(true); 
			/* var ans = KO_saveSuspectConfirm();
			 if(ans){
				 window.location = "Suspect.jsp?action=ThaiSave&suspect_no=" + suspectNo;
			 }*/

		}catch(err){
			alert(err.message);
		}
			
	}

		jQuery(document).ready(function(){
			jQuery("input[name='track_no']").val ('<%=RunningKey.getRunningKey("SUSPECT_INVESTIGATE","","","040401")%>');
			jQuery("input[name='doc_date']").val ('<%=MainFuntion.DateTimeNow("dd/MM/yyyy",ReturnDateFormat.Th)%>');
			jQuery("input[name='start_time']").val ('<%=MainFuntion.getTimeNow()%>');
			jQuery("input[name='end_time']").val ('00:00');
			applyOption("<%=path%>", "legislation_id","LEGISLATION_LIST");
			applyProvinceAction("<%=path%>", "current_province_code", "current_district_code", "current_subdistrict_code");
			applyProvinceAction("<%=path%>", "suspect_province_code", "suspect_district_code", "suspect_subdistrict_code");
		   
			//document.getElementById('pic_map').style.display='';
			//jQuery('#pic_map').attr('src','RenderImage?suspect_no=<%=suspectNo%>');
			
		    <% 
		     if(suspect_investigate_id != null){
		    	
		    	out.println("document.getElementById('pic_map').style.display='';");
		    	out.println("jQuery('#pic_map').attr('src','RenderImage?suspect_no="+suspectNo+"');");
		    	//out.print("<script type='text/javascript'> jQuery('#pic_map').attr('src','RenderImage?suspect_no="+suspect_investigate_id+"'));</script>");
		    	out.println("eval('"+revisionCommand+"')");
		     }
		    %> 
	     
		});
	</script>
	
  <tr>
    <td valign="top">
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%">
					  <%
					  String sType="";
					  if (request.getParameter("sp").equals("1"))
						   sType="คนไทย";
					  else if (request.getParameter("sp").equals("2")) 
						   sType="ชาวต่างชาติ";
					  else if (request.getParameter("sp").equals("3")) 
						   sType="ผู้ประกอบการ";
					  %>
					<span class="websitename">ประวัติผู้ต้องสงสัย<% out.println(sType); %></span>
				 </td>
              </tr>
              
              <tr>
                <td height="25">&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>
					<table width="379" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="113" align="right" valign="middle">ประเภทผู้ต้องสงสัย&nbsp;:&nbsp;</td>
						<td width="260" valign="middle">
							<form name="investigation_from" action="Suspect.jsp"  method="post" >
								 <select name="action">
									<option value="suspectList01" 
										<%if (request.getParameter("sp").equals("1"))  out.println("selected"); %> >คนไทย
									</option>
									<option value="suspectList02" 
										<%if (request.getParameter("sp").equals("2"))  out.println("selected"); %>>คนต่างชาติ
									</option>
									<option value="suspectList03" 
										<%if (request.getParameter("sp").equals("3"))  out.println("selected"); %>>ผู้ประกอบการ
									</option>
								  </select>
								  <input name="Button1" type="submit" class="button"  value="ตกลง">
							  </form>
						</td>
					  </tr>
					</table>
				 </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
				  <%	  if (request.getParameter("sp").equals("1")) {	  %>
					<!-- Left menu -->
					<jsp:include page="suspect_detail_thai.jsp">
						<jsp:param name="suspect_no" value="<%=suspectNo%>" /> 
					</jsp:include>
				  <% }else if (request.getParameter("sp").equals("2")) {  %>
					<!-- Left menu -->
					<jsp:include page="suspect_detail_eng.jsp">
						<jsp:param name="suspect_no" value="<%=suspectNo%>" /> 
					</jsp:include>
				  <%	 }else if (request.getParameter("sp").equals("3")) {  %>
					<!-- Left menu -->
					<jsp:include page="suspect_detail_company.jsp">
						<jsp:param name="suspect_no" value="<%=suspectNo%>" /> 
					</jsp:include>
				  <% } 
					
					String spType = request.getParameter("sp");
					%>
				</td>
              </tr>
			  <tr>
                <td>&nbsp;</td>
                <td height="30" valign="bottom">
                   <a style="border: 1;border-color:gray;background-color:#D4D0C8;height: 20;color: black;text-decoration: none"
                      href="Suspect.jsp?action=SuspectDetail3&sp=<%=spType %>&suspect_no=<%=suspectNo%>">ข้อมูลประกอบการสืบสวน</a>
                   <a style="border: 1;border-color:gray;background-color:#FFCC33;height: 20;color: black;text-decoration: none"
                      href="Suspect.jsp?action=SuspectDetail2&sp=<%=spType%>&suspect_no=<%=suspectNo%>">ข้อมูลดำเนินการสืบสวน</a>
                   <a style="border: 1;border-color:gray;background-color:#D4D0C8;height: 20;color: black;text-decoration: none"
                      href="Suspect.jsp?action=SuspectPicture&sp=<%=spType%>&suspect_no=<%=suspectNo%>">ภาพถ่าย</a>
                </td>
				</td>
              </tr>
              
              <tr>
                <td>&nbsp;</td>
                <td height="35">&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><span class="sectionname">เพิ่มข้อมูลดำเนินการสืบสวน</span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                
                   <!--<iframe name="upload_picture_frame" src="xxx" style="display:none;"></iframe>
                   <form name="investigation_form" target="upload_picture_frame" id="investigation_form"  action="SaveInvestigationAction?suspect_no=<%=suspectNo%>" method="post" enctype="multipart/form-data" >
                   -->
                <form name="investigation_form" id="investigation_form"  action="SaveInvestigationAction?suspect_no=<%=suspectNo%>" method="post" enctype="multipart/form-data" >
                	 <INPUT TYPE="hidden" NAME="suspect_investigate_team" value="">
					<INPUT TYPE="hidden" NAME="suspect_investigate_indictment" value="">
					<INPUT TYPE="hidden" NAME="suspect_vihecle" value="">
                
                <table width="750" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td height="25" align="right">เลขที่งาน :&nbsp;</td>
                    <td>
						<input type="text" name="track_no" class="textView" size="25" >
					</td>
                    <td align="right">วันที่บันทึก :&nbsp;</td>
                    <td>
							<input name="doc_date" id="doc_date" type="text" class="textView" size="10" value="01/11/2552" maxlength="10">
					</td>
                  </tr>
				  <tr>
                    <td height="25" align="right">เลขที่รายงานสืบสวน :&nbsp;</td>
                    <td colspan="3">
						<input type="text" name="investigate_no" class="textbox">
						<font style="color:red">*</font>
					</td>
                  </tr>
                  <tr>
                    <td width="160" height="25" align="right">ผู้สืบสวน :&nbsp;</td>
                    <td width="238">
						<input type="text" name="name_staff_investigate" class="textView" value="" size="30">
						<INPUT TYPE="hidden" NAME="staff_investigate" value="">
						<INPUT TYPE="hidden" NAME="poscode_investigate" value="">
						<img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle" style="cursor:hand"
                      onClick="openPopupStaff1();">
						<font style="color:red">*</font>
					</td>
                    <td width="137" align="right">ผู้สั่งการให้สืบสวน :&nbsp;</td>
                    <td width="215">
						<input type="text" name="name_staff_command" class="textView" size="30">
						<INPUT TYPE="hidden" NAME="staff_command" value="">
						<INPUT TYPE="hidden" NAME="poscode_command" value="">
						<img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"
                                   style="cursor:hand" onClick="openPopupStaff2();">
						<font style="color:red">*</font>
					</td>
                  </tr>
                  <tr>
                    <td height="25" align="right">ผู้สั่งให้บันทึก :&nbsp;</td>
                    <td>
                    <input type="text" name="name_staff_order_save" class="textView" size="30">
                    <INPUT TYPE="hidden" NAME="staff_order_save" value="">
                      <img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"
                      style="cursor:hand" onClick="openPopupStaff('name_staff_order_save','staff_order_save');">
                    </td>
                    <td align="right">ผู้ให้ข้อมูล :&nbsp;</td>
                    <td><input type="text" name="name_staff_info" class="textView" size="30">
                       <INPUT TYPE="hidden" NAME="staff_info" value="">
                      <img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"
                      style="cursor:hand"
                      onClick="openPopupStaff('name_staff_info','staff_info')" >
                    </td>
                  </tr>
                  <tr>
                    <td height="25" align="right">เรียน :&nbsp;</td>
                    <td>
                    <input type="text" name="name_staff_report_to" class="textView" size="30">
                    <INPUT TYPE="hidden" NAME="staff_report_to" value="">
                      <img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"
                           style="cursor:hand"
                      onClick="openPopupStaff('name_staff_report_to','staff_report_to');">
                    </td>
                    <td align="right">เบอร์โทรศัพท์ผู้ให้ข้อมูล :&nbsp;</td>
                    <td><input type="text" name="staff_info_mobile" class="textbox"></td>
                  </tr>
                  <tr>
                    <td height="25" align="right" valign="top">ผู้ร่วมสืบสวน :&nbsp;</td>
                    <td colspan="3">

						<table id="table_V_staff_list" class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" >
							<tr class="TblHeaderColumn AlignCenter">
								<td width="50">ลำดับที่</td>
								<td width="30" ><input type="checkbox" name="checkbox" value="checkbox" onClick="isAllCheckBoxV_STAFF_LIST(this);" ></td>
								<td width="150">ชื่อ-สกุล</td>
								<td width="150">ตำแหน่ง</td>
							</tr>
							<!--
							<tr class="TblRow">
								<td class="TblRow AlignCenter">1</td>
								<td  class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
								<td >นายชูศักดิ์ วังวัฒนา</td>
								<td >เจ้าพนักงานสรรพสามิต</td>
							</tr>
							<tr  class="TblRow bgRowGray">
								<td class="TblRow AlignCenter">2</td>
								<td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
								<td >นายเฉลิมชัย สุวรรณมุณี</td>
								<td >เจ้าพนักงานสรรพสามิต</td>
							</tr>
						-->
						</table>
						<span class="spanLink" onClick="openPopupV_STAFF_LIST();">เพิ่มรายการ</span> |
                              <span class="spanLink" onClick="removeRowV_STAFF_LIST();">ลบรายการ</span>
					</td>
                  </tr>
                  <tr>
                    <td height="25" align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
				  <tr>
                    <td height="25" align="left" valign="middle" bgcolor="#F5F5F5"><strong>&nbsp;&nbsp;&nbsp;ข้อมูลสืบสวน</strong></td>
                    <td colspan="3" bgcolor="#F5F5F5">&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="25" align="right">วันที่เริ่มทำการสืบสวน :&nbsp;</td>
                    <td>
                  <!--  <input name="start_date" type="text" class="textdate" size="10" disabled="disabled">
                      <img src="images/btn_calendar.png" alt="" width="19" height="19" align="absmiddle">&nbsp;&nbsp;&nbsp;
                        เวลา&nbsp;:&nbsp;<input name="start_time" type="text" class="textbox" size="5" maxlength="5">
						-->
					<input type="Text" name="start_date" id="start_date" class="textdate" readonly size="7" maxlength="10" style="width:75;"> <a href="javascript:NewCssCal('start_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a><font style="color:red">*</font>
					 
                        เวลา&nbsp;:&nbsp;<input name="start_time" type="text" class="textbox" size="5" maxlength="5" onblur="ValidateTime(this);"></td>
					</td>
                    <td align="right">วันที่สิ้นสุดทำการสืบสวน&nbsp;:&nbsp;</td>
                    <td>
                    <!--
                    <input name="end_date" type="text" class="textdate" size="10" disabled="disabled">
                      <img src="images/btn_calendar.png" alt="" width="19" height="19" align="absmiddle">
                      -->
                      <input type="Text" name="end_date" id="end_date" class="textdate" readonly size="7" maxlength="10" style="width:75;"> <a href="javascript:NewCssCal('end_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a><font style="color:red">*</font>
                     
                        เวลา&nbsp;:&nbsp;<input name="end_time" type="text" class="textbox" size="5" maxlength="5" onblur="ValidateTime(this);"></td>
                  </tr>
                  <tr>
                    <td height="25" align="right">คดี พ.ร.บ. :&nbsp;</td>
                    <td>
						<select name="legislation_id"><!--
						  <option value="1">พ.ร.บ.สุรา พ.ศ.2493</option>
						  <option value="2">พ.ร.บ.ยาสูบ พ.ศ.2509</option>
						  <option value="3">พ.ร.บ.ไพ่</option>
						  <option value="4">พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</option>
						--></select>
						<font style="color:red">*</font>
					</td>
                    <td align="right">ประเภทคดี :&nbsp;</td>
                    <td>
						<select name="case_type">
						  <option selected value="1">คดีรายใหญ่</option>
						  <option value="2">เอเยนต์</option>
						  <option value="3">รายย่อย</option>
						</select>
						<font style="color:red">*</font>
					</td>
                  </tr>
                  <tr>
                    <td height="25" align="right" valign="top">สงสัยว่ากระทำผิดข้อกล่าวหา :&nbsp;</td>
                    <td colspan="3">

						<table id="table_indictment" class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" >
							<tr class="TblHeaderColumn AlignCenter">
								<td width="10%">ลำดับที่</td>
								<td width="10%" ><input type="checkbox" name="checkbox" value="checkbox" onClick="isAllCheckBoxIndictment(this);" ></td>
                                        <td width="10%">มาตรา</td>
                                        <td width="10%">บทกำหนดโทษ</td>
								<td width="60%">ข้อกล่าวหา</td>
							</tr>
							<!--<tr class="TblRow">
								<td class="TblRow AlignCenter">1</td>
								<td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                                        <td class="TblRow">75</td>
                                        <td class="TblRow">156</td>
								<td class="TblRow">
									ขายหรือจำหน่ายซึ่งเครื่องหมายแสดงการเสียภาษีจดทะเบียนที่ยังไม่ได้ใช้
								</td>
							</tr>
							<tr  class="TblRow bgRowGray">
								<td class="TblRow AlignCenter">2</td>
								<td class="TblRow AlignCenter" ><input type="checkbox" name="checkbox" value="checkbox"></td>
                                        <td class="TblRow">77</td>
                                        <td class="TblRow">156</td>
                                        <td class="TblRow">
									นำแสตมป์สรรพสามิตที่ใช้ในการเสียภาษีแล้วมาใช้อีกเพื่อแสดงว่าได้เสียภาษีแล้ว
								</td>
							</tr>
						-->
						</table>
						<span class="spanLink" onClick="openPopupIndictment();">
                                                                      เพิ่มรายการ
                        </span> |
                        <span class="spanLink" onClick="removeRowIndictment();">ลบรายการ</span>
					</td>
                  </tr>
                  <tr>
                    <td height="25" align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
				  <tr>
                    <td height="75" align="right" valign="top">พฤติกรรมผู้ต้องสงสัย :&nbsp;</td>
                    <td colspan="3" valign="top"><textarea name="suspect_behavior" rows="4" class="textareabig2" id="textarea3"></textarea></td>
                    </tr>
				  <tr>
                    <td height="75" align="right" valign="top">หมายเหตุ (ข้อมูลอื่นๆ) :&nbsp;</td>
                    <td colspan="3" valign="top"><textarea name="remarks" rows="4" class="textareabig2" id="textarea3"></textarea></td>
                    </tr>
                  <tr>
                    <td height="25" align="right" valign="top">การดำเนินการสืบสวน ณ.ปัจจุบัน:&nbsp;</td>
                    <td height="60" colspan="3" valign="top"><textarea name="investigate_present" rows="4" class="textareabig2" id="textarea2" ></textarea></td>
                    </tr>
                  <tr>
                    <td height="25" align="right" valign="top">&nbsp;</td>
                    <td colspan="3">&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="25" align="left" valign="middle" bgcolor="#F5F5F5" colspan="4" >
						<strong>&nbsp;&nbsp;&nbsp;ที่อยู่ปัจจุบันของผู้ต้องสงสัย</strong>
					</td>
                  </tr>
                  <tr>
                    <td height="25" colspan="4" align="left" valign="top">
						<table width="696" border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td width="160" height="25" align="right">ละติจูด&nbsp;:&nbsp;</td>
								<td width="536"><input name="current_coordinate_x" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7">
								&nbsp;&nbsp;ลองติจูด&nbsp;:&nbsp;
								<input name="current_coordinate_y" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7"></td>
							</tr>
							<tr>
								<td height="25" align="right">เลขที่ :&nbsp; </td>
								<td><input name="current_address_no" type="text" class="textbox" size="4">
								&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
								<input name="current_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3"></td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td height="25" align="right" valign="top">อาคาร/สถานที่ :&nbsp; </td>
								<td><input name="current_address_name" type="text" class="textbox" size="58"></td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
								<td><input name="current_soi" type="text" class="textbox">
								&nbsp;&nbsp;ถนน&nbsp;:&nbsp;
								<input name="current_road" type="text" class="textbox" size="25"></td>
							</tr>
							<tr>
								<td height="25" align="right">จังหวัด :&nbsp;</td>
								<td>
									<select name="current_province_code" id="sProvince"  style="width:180px;">
										<option value="x" selected>กรุงเทพมหานคร</option>
										<option value="x">กระบี่</option>
										<option value="x">ขอนแก่น</option>
									</select>
								</td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td height="25" align="right">อำเภอ :&nbsp;</td>
								<td>
									<select name="current_district_code" id="sDistrict" style="width:180px;" >
										<option value="x">เขตพระนคร</option>
										<option value="x" >เขตห้วยขวาง</option>
										<option value="x">เขตดุสิต</option>
										<option value="x" selected>เขตราชเทวี</option>
								 </td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td height="25" align="right">ตำบล :&nbsp;</td>
								<td>
									<select name="current_subdistrict_code" id="sSubDistrict" style="width:180px;" >
										<option value="x" selected>แขวงมักกะสัน</option>
										<option value="x">แขวงทุ่งสองห้อง</option>
										<option value="x">แขวงบางกะปิ</option>
										<option value="x">แขวง</option>
									</select>
								 </td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td height="30" align="right">รหัสไปรษณีย์&nbsp;:&nbsp;</td>
								<td>
									<input name="current_zipcode" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" size="10" maxlength="5">
									&nbsp;&nbsp;&nbsp;
									โทรศัพท์ :&nbsp;<input name="current_tel" type="text" class="textbox" size="10">
								</td>
							</tr>
						</table></td>
                  </tr>
                  <tr>
                    <td height="25" align="right" valign="top">&nbsp;</td>
                    <td colspan="3">&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="25" align="left" valign="middle" bgcolor="#F5F5F5"><strong>&nbsp;&nbsp;&nbsp;สถานที่ต้องสงสัย</strong></td>
                    <td colspan="3" bgcolor="#F5F5F5">&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="25" colspan="4" align="left" valign="top">
						<table width="696" border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td width="160" height="25" align="right">ละติจูด&nbsp;:&nbsp;</td>
								<td width="536"><input name="suspect_coordinate_x" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7">
								&nbsp;&nbsp;ลองติจูด&nbsp;:&nbsp;
								<input name="suspect_coordinate_y" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7"></td>
							</tr>
							<tr>
								<td height="25" align="right">เลขที่ :&nbsp; </td>
								<td><input name="suspect_address_no" type="text" class="textbox" size="4">
								&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
								<input name="suspect_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3"></td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td height="25" align="right" valign="top">อาคาร/สถานที่ :&nbsp; </td>
								<td><input name="suspect_address_name" type="text" class="textbox" size="58"></td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
								<td><input name="suspect_soi" type="text" class="textbox">
								&nbsp;&nbsp;ถนน&nbsp;:&nbsp;
								<input name="suspect_road" type="text" class="textbox" size="25"></td>
							</tr>
							<tr>
								<td height="25" align="right">จังหวัด :&nbsp;</td>
								<td>
									<select name="suspect_province_code" id="sProvince"  style="width:180px;">
										<option value="x" selected>กรุงเทพมหานคร</option>
										<option value="x">กระบี่</option>
										<option value="x">ขอนแก่น</option>
									</select>
								</td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td height="25" align="right">อำเภอ :&nbsp;</td>
								<td>
									<select name="suspect_district_code" id="sDistrict" style="width:180px;" >
										<option value="x">เขตพระนคร</option>
										<option value="x" >เขตห้วยขวาง</option>
										<option value="x">เขตดุสิต</option>
										<option value="x" selected>เขตราชเทวี</option>
								 </td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td height="25" align="right">ตำบล :&nbsp;</td>
								<td>
									<select name="suspect_subdistrict_code" id="sSubDistrict" style="width:180px;" >
										<option value="x" selected>แขวงมักกะสัน</option>
										<option value="x">แขวงทุ่งสองห้อง</option>
										<option value="x">แขวงบางกะปิ</option>
										<option value="x">แขวง</option>
									</select>
								 </td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td height="30" align="right">รหัสไปรษณีย์&nbsp;:&nbsp;</td>
								<td>
									<input name="suspect_zipcode" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" size="10" maxlength="5">
									&nbsp;&nbsp;&nbsp;
									โทรศัพท์ :&nbsp;<input name="suspect_tel" type="text" class="textbox" size="10">
								</td>
							</tr>
							<!--
							<tr  id="picB">
								<td  align="right" valign="top" OnClick="togglePict('picB','picA');">รูปภาพแผนที่&nbsp;:&nbsp;</td>
								<td colspan="3" valign="top">
									<input name="file" type="file" class="textbox" size="35">
									<input name="Submit2" type="button"  value="Upload"><br>
									<font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
								</td>
							</tr>
							-->
							<tbody  id="picA">
								  <tr >
									<td  align="right" valign="top" OnClick="togglePict('picB','picA');"></td>
									<td colspan="3" valign="top">
											<img id="pic_map" src="img_suspect/553548995.jpg" border="0" width="100" height="100" style="display:none">
									  </td>
								  </tr>
								  <tr >
									<td  align="right" valign="top" >รูปภาพแผนที่&nbsp;:&nbsp;</td>
									<td colspan="3" valign="top">
										<input name="file" type="file" class="textbox" size="35">
										<input name="Submit2" type="button"  value="Upload"><br>
										<font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
									  </td>
								  </tr>
							</tbody>
							  <tr>
								<td height="60" align="right" valign="top">รายละเอียดเกี่ยวกับแผนที่&nbsp;:&nbsp;</td>
								<td colspan="3"><textarea name="suspect_map_desc"  cols="35" rows="3" class="textareabig"></textarea></td>
							  </tr>
						</table></td>
                    </tr>
                  <tr>
                    <td height="25" align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="25" align="left" valign="middle" bgcolor="#F5F5F5"><strong>&nbsp;&nbsp;&nbsp;ยานพาหนะที่เกี่ยวข้อง</strong></td>
                    <td colspan="3" bgcolor="#F5F5F5">&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="25"  colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<span class="spanLink" 
						  onClick="openPopupSUSPECT_VEHICLE();">เพิ่มข้อมูล</span> |
						  <span class="spanLink" onClick="removeRowSUSPECT_VEHICLE();">ลบรายการที่เลือก</span>
					</td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="25" colspan="4" align="right">
                    
                    
					<table id="table_Suspect_vehicle" class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                      <tr>
                        <td width="27" class="TblHeaderColumn AlignCenter"><input type="checkbox" name="checkbox" value="checkbox" onClick="isAllCheckBoxSUSPECT_VEHICLE(this);" ></td>
                        <td width="147" class="TblHeaderColumn">เลขทะเบียน</td>
                        <td width="86" class="TblHeaderColumn">ประเภท</td>
                        <td width="144" class="TblHeaderColumn">ยี่ห้อ / รุ่น / สี</td>
                        <td width="309" class="TblHeaderColumn">รายละเอียดเพิ่มเติม</td>
                        </tr><!--
                        
                      <tr>
                        <td height="30" class="TblRow AlignCenter"><input type="checkbox" name="checkbox2" value="checkbox"></td>
                        <td class="TblRow AlignLeft">
							<span class="spanLink" 
						  onClick="winPopup('Popup/popup_vehicle.jsp','Province','','550','350','true'); return false;">
								กข 2342 กรุงเทพมหานคร
							</span>
						</td>
                        <td class="TblRow AlignLeft">รถเก๋ง</td>
                        <td class="TblRow AlignLeft">ฮอนด้า / ซีวิค / ขาว</td>
                        <td class="TblRow AlignLeft">แต่งซิ่ง โหลดเตี้ย ติดท่อไอเสียเสียงดัง ติดฟิลม์ดำรอบคัน</td>
                        </tr>
                      <tr>
                        <td height="30" class="TblRow AlignCenter bgRowGray"><input type="checkbox" name="checkbox3" value="checkbox"></td>
                        <td class="TblRow AlignLeft bgRowGray">
							<span class="spanLink" 
						  onClick="winPopup('Popup/popup_vehicle.jsp','Province','','550','350','true'); return false;">
								กจ 9301 นนทบุรี
							</span>
						</td>
                        <td class="TblRow AlignLeft bgRowGray">รถจักรยานยนต์</td>
                        <td class="TblRow AlignLeft bgRowGray">ฮอนด้า / เวฟ100 / แดงส้ม</td>
                        <td class="TblRow AlignLeft bgRowGray">ปาดเบาะบาง ใส่ท่อเสียงดัง</td>
                        </tr>
                        
                    -->
                    </table>
                    
                    
                    
                    
                    </td>
                    </tr>
                  
                  <tr>
                    <td height="25" align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="25" colspan="4" align="center"><input type="button" name="Submit" value="  บันทึก  " class="button" onClick="KO_submitForm();">
                      &nbsp;
                      <input type="reset" name="Submit2" value="  ยกเลิก  " class="button" onClick="location.reload(true);"></td>
                    </tr>
                    

                </table>
                </form>
              
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
		
	</td>
  </tr>
  <tr>
    <td>
		<!-- Footer -->
		<%@ include file = "../Templates/footer.jsp"%>
	</td>
  </tr>
</table>
</form>
</body>
</html>
