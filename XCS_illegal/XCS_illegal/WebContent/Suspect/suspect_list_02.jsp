<%@ page contentType="text/html; charset=UTF-8" %>
<script type="text/JavaScript">


function MM_preloadtask() {
	//alert('555');
	document.getElementById('sp_thai').style.display = 'block';
	document.getElementById('sp_eng').style.display = 'none';
	document.getElementById('sp_com').style.display = 'none';
}

function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}

function showdetail(objselect) {
	vdetail = objselect.value;
	document.getElementById('sp_row').style.display ='block';
	if (vdetail == 'thai') { // DOM3 = IE5, NS6
		document.getElementById('sp_thai').style.display = 'block';
		document.getElementById('sp_eng').style.display = 'none';
		document.getElementById('sp_com').style.display = 'none';
	} else if (vdetail == 'other'){
		document.getElementById('sp_thai').style.display = 'none';
		document.getElementById('sp_eng').style.display = 'block';
		document.getElementById('sp_com').style.display = 'none';
	} else if (vdetail == 'company') {
		document.getElementById('sp_thai').style.display = 'none';
		document.getElementById('sp_eng').style.display = 'none';
		document.getElementById('sp_com').style.display = 'block';
	} else {
		document.getElementById('sp_thai').style.display = 'none';
		document.getElementById('sp_eng').style.display = 'none';
		document.getElementById('sp_com').style.display = 'none';
		document.getElementById('sp_row').style.display ='none';
	}

}

function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}

function MM_jumpMenu(targ,selObj,restore){ //v3.0
  eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
  if (restore) selObj.selectedIndex=0;
}

function MM_jumpMenuGo(selName,targ,restore){ //v3.0
  var selObj = MM_findObj(selName); if (selObj) MM_jumpMenu(targ,selObj,restore);
}
//-->
</script>

		<!-- Header -->
		<%@ include file="../Templates/header.jsp" %>
		
<%		
 String path = com.ko.util.FormUtility.getScriptReferencePath(request);
 String targetToken = "Suspect.jsp?action=suspectList02&";
 String replaceToken = "Suspect/suspect_list_02.jsp?";
 session.setAttribute(com.ko.util.SessionConstant.PAGER_REPLACE_TOKEN, replaceToken);
 session.setAttribute(com.ko.util.SessionConstant.PAGER_TARGET_TOKEN, targetToken);
 
 java.util.HashMap<String,String> params = com.ko.util.EngineUtility.transformRequestParameter(request.getParameterMap());
 String revisionCommand = com.ko.util.FormUtility.generateRealRevisionCommand(params);
 
 
 
%>

<script type="text/javascript">


	jQuery(document).ready(function() {
		applyProvinceAction("<%=path%>", "province_code", "district_code", "subdistrict_code");
		applyOfficeOption("<%=path%>", "offcode");
		eval('<%=revisionCommand%>');
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
                <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยชาวต่างชาติ</span></td>
              </tr>
              
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
				<form action="Suspect.jsp" method="post" name="from1">
					<table width="379" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="113" align="right" valign="middle">ประเภทผู้ต้องสงสัย&nbsp;:&nbsp;</td>
						<td width="260" valign="middle">
							  <select name="action">
								<option value="suspectList01">คนไทย</option>
								<option value="suspectList02" selected>คนต่างชาติ</option>
								<option value="suspectList03">ผู้ประกอบการ</option>
							  </select>
							  <input name="Button1" type="submit" class="barbutton"  value="ตกลง">
						  </td>
					  </tr>
					</table>
				</form>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              
              <tr>
                <td>&nbsp;</td>
                <td><table width="800" border="1" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
                  <tr>
                    <td>
                    
                    <form method="post" action="Suspect.jsp?action=suspectList02">
                    
                    <table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5">
                        
                        <tr>
                          <td>&nbsp;</td>
                          <td align="left" valign="top"><span class="sectionname">ค้นหาข้อมูลต้องสงสัย :: คนต่างชาติ</span></td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <td>&nbsp;</td>
                          <td align="left" valign="top">&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                        
                        <tr id="sp_row">
                          <td>&nbsp;</td>
                          <td align="center" valign="top">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0" id="sp_thai">
                              <tr>
                                <td width="20%" height="25" align="right">เลขที่หนังสือเดินทาง :&nbsp;</td>
                                <td width="30%"><input type="text" name="suspect_passport" class="textbox"/></td>
                                <td width="20%" align="right">มาจากประเทศ :&nbsp;</td>
                                <td width="30%"><input type="text" name="theDate144" class="textbox"/></td>
                              </tr>
                              <tr>
                                <td height="25" align="right">ชื่อ-ชื่อกลาง-นามสกุล :&nbsp;</td>
                                <td><input type="text" name="partial_name" class="textbox"/></td>
                                <td align="right">&nbsp;</td>
                                <td>&nbsp;</td>
                              </tr>
                              <tr>
                                <td height="10" colspan="4" align="right"></td>
                                </tr>
                              <tr>
                                <td height="25" align="left">สถานที่ต้องสงสัย</td>
                                <td>&nbsp;</td>
                                <td align="right">&nbsp;</td>
                                <td>&nbsp;</td>
                              </tr>
                              <tr>
                               <td height="25" align="right">จังหวัด :&nbsp;</td>
                               <td>
                                    <select name="province_code" id="sProvince"  style="width:180px;">
                                         <option value="x" selected>กรุงเทพมหานคร</option>
                                         <option value="x">กระบี่</option>
                                         <option value="x">ขอนแก่น</option>
                                    </select>
                               </td>
                                <td align="right">สำนักงาน :&nbsp;</td>
                                <td >
                                     <select name="offcode" id="s" style="width:200px;">
                                       <option value="x" selected>ทั้งหมด</option>
                                       <option value="x" >สสพ.กรุงเทพฯ 3</option>
                                       <option value="x" >ส่วนคดี สำนักกฎหมาย</option>
                                     </select>
                                </td>
                              </tr>
                              <tr>
                                   <td height="25" align="right">อำเภอ :&nbsp;</td>
                                   <td>
                                        <select name="district_code" id="sDistrict" style="width:180px;" >
                                             <option value="x">เขตพระนคร</option>
                                             <option value="x" >เขตห้วยขวาง</option>
                                             <option value="x">เขตดุสิต</option>
                                             <option value="x" selected>เขตราชเทวี</option>
                                    </td>
                                    <td align="right">ประเภทคดี :&nbsp;</td>
                                    <td>
                                         <select name="case_type" id="s" style="width:200px;">
                                           <option value="" selected>ทั้งหมด</option>
                                           <option value="1" >คดีรายใหญ่</option>
                                           <option value="2" >เอเย่นต์</option>
                                           <option value="3" >รายย่อย</option>
                                         </select>
                                    </td>
                              </tr>
                              <tr>
                                <td height="25" align="right">ตำบล :&nbsp;</td>
                                <td>
                                     <select name="subdistrict_code" id="sDistrict" style="width:180px;" >
                                          <option value="x">แขวงลาดพร้าว</option>
                                          <option value="x" >แขวงมักกะสัน</option>
                                          <option value="x">แขวงถนนนครไชยศรี</option>
                                          <option value="x" selected>แขวงห้วยขวาง</option>
                                 </td>
                                <td align="right">&nbsp;</td>
                                <td>&nbsp;</td>
                              </tr>
                            </table>
                            
                            
                          </td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <td>&nbsp;</td>
                          <td height="40" align="center" valign="bottom"><input type="image" src="images/btn_search_big.png" width="65" height="23"></td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <td align="left" valign="bottom" height="10"></td>
                          <td></td>
                          <td align="right" valign="bottom"></td>
                        </tr>
                    </table>
                    </form>
                    
                    </td>
                  </tr>
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="30">
					<span class="spanLink" onClick="MM_goToURL('parent','Suspect.jsp?action=EngForm');
					return document.MM_returnValue">เพิ่มข้อมูลใหม่</span>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                
                <jsp:include page="/QueryPager/foreign_suspect_pager.jsp"/>
                
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>
	</td>
  </tr>
  <tr>
    <td>
		<%@ include file = "../Templates/footer.jsp"%>
	</td>
  </tr>
</table>

</body>
</html>
