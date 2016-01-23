<%@ page contentType="text/html; charset=UTF-8" %>

<script type="text/JavaScript">

function MM_jumpMenuGo(selName,targ,restore){ //v3.0
  var selObj = MM_findObj(selName); if (selObj) MM_jumpMenu(targ,selObj,restore);
}

</script>
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
//-->
</script>
	<%@ include file="../Templates/header.jsp" %>
	
	
	<%
		String suspectNo = request.getParameter("suspect_no");
		String path = com.ko.util.FormUtility.getScriptReferencePath(request);
		/// String context = response.getServletContext();
		String sp = request.getParameter("sp");
		String action = request.getParameter("action");
		String catid = request.getParameter("catid");
	%>
	
	<script>
		function KO_openUploadDialog(caller){
			var w = window.showModalDialog('Popup/suspect_picture_form.jsp?suspect_no=<%=suspectNo%>' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');
			window.location.reload(true);
		}

		function KO_doSearch(caller){
			var id = jQuery("select[name=picture_category_id] :selected").val();
			//var fullUrl = window.location.href;
			//var url = fullUrl.replace("/[&id=\\d+]/", "");
			//window.location = fullUrl + "&catid=" + id;

			//Suspect.jsp?action=SuspectPicture&sp=1&suspect_no=1268711064312
			window.location = "Suspect.jsp?action=<%=action%>&sp=<%=sp%>&catid="+ id +"&suspect_no=<%=suspectNo%>";
		}
		
		function KO_doDeleteSuspectPicture(caller){

			var confirm = window.confirm("ยืนยันการลบข้อมูล?");
			if (!confirm){
				return false;
			}
			
			var data = jQuery("form#pager").serialize();
			data = data + "&target=SUSPECT_PICTURE";
			var url = "DeleteSuspectDetail.do";
			jQuery.post(url,data, function(result){
				// alert(result);
				// var json = jQuery.toJson(result);
				// alert(json);
			});
			window.location.reload(true);
		}

		jQuery(document).ready(function(){
			applyPictureCategoryOption("<%=path%>", "picture_category_id");

			jQuery("select[name=picture_category_id]").val("<%=catid%>");

			var cat_text = jQuery("select[name=picture_category_id] :selected").text();
			jQuery("#cat_text").attr("innerHTML","หมวดภาพถ่าย :: " + cat_text);

		});
	</script>
	
  </tr>
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
                <td><table width="379" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="113" align="right" valign="middle">ประเภทผู้ต้องสงสัย&nbsp;:&nbsp;</td>
                    <td width="260" valign="middle">
						<form name="form1" action="Suspect.jsp"  method="post">
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
                </table></td>
              </tr>
              
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
				  <%	  if (request.getParameter("sp").equals("1")) {	  %>
					<!-- Left menu -->
					
					<jsp:include page="suspect_detail_thai.jsp">
						<jsp:param name="suspect_no" value="<%=suspectNo %>"></jsp:param>
					</jsp:include>
				  <% }else if (request.getParameter("sp").equals("2")) {  %>
					<!-- Left menu -->
					<jsp:include page="suspect_detail_eng.jsp">
						<jsp:param name="suspect_no" value="<%=suspectNo %>"></jsp:param>
					</jsp:include>
				  <%	 }else if (request.getParameter("sp").equals("3")) {  %>
					<!-- Left menu -->
					<jsp:include page="suspect_detail_company.jsp">
						<jsp:param name="suspect_no" value="<%=suspectNo %>"></jsp:param>
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
                      href="Suspect.jsp?action=SuspectDetail3&sp=<%=spType%>&suspect_no=<%=suspectNo%>">ข้อมูลประกอบการสืบสวน</a>
                   <a style="border: 1;border-color:gray;background-color:#D4D0C8;height: 20;color: black;text-decoration: none"
                      href="Suspect.jsp?action=SuspectDetail2&sp=<%=spType %>&suspect_no=<%=suspectNo%>">ข้อมูลดำเนินการสืบสวน</a>
                   <a style="border: 1;border-color:gray;background-color:#FFCC33;height: 20;color: black;text-decoration: none"
                      href="Suspect.jsp?action=SuspectPicture&sp=<%=spType%>&suspect_no=<%=suspectNo%>">ภาพถ่าย</a>
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="35">&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="30"><table width="700" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="447"><span class="sectionname">ภาพถ่ายผู้ต้องสงสัย</span></td>
                    <td width="253" align="right" valign="bottom">&nbsp;</td>
                  </tr>
                  
                  <tr>
                    <td><table width="379" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                          <td width="120" align="left" valign="middle">หมวดภาพถ่าย&nbsp;:&nbsp;</td>
                          <td width="250" valign="middle">
                          
							  <select name="picture_category_id" style="width:150px">
								<option>--- ทั้งหมด ---</option>
								<option>บุคคล</option>
								<option>สถานที่</option>
								<option>แผนที่</option>
								<option>ยานพาหนะ</option>&nbsp;&nbsp;
								<input name="Button" type="button" class="button" value="ค้นหา" onClick="KO_doSearch(this);"/>
							  </select>
							  
						   </td>
                        </tr>
                      </table></td>
                    <td align="right" valign="bottom">&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td align="right" valign="bottom">&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="30">
						<span class="spanLink" onClick="KO_openUploadDialog(this);">เพิ่มข้อมูลใหม่</span>
					&nbsp;
						<span class="spanLink" onClick="KO_doDeleteSuspectPicture(this);">ลบข้อมูล</span>
					</td>
                    <td align="right" valign="bottom"><strong id="cat_text">หมวดภาพถ่าย :: บุคคล </strong></td>
                  </tr>
                </table></td>
              </tr>
              
              <tr>
                <td>&nbsp;</td>
                <td>
                
                <jsp:include page="/QueryPager/suspect_picture_pager.jsp"></jsp:include>
                
                <!-- 
                
                <table class="tableList" width="700" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                  <tr>
                     <td colspan="4"><%@ include file="../Templates/splitPageBar.html" %></td>
                  </tr>
                  <tr>
                    <td width="28" align="center" class="TblHeaderColumn aligncenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                    <td width="100" align="center" class="TblHeaderColumn aligncenter">หมวดภาพถ่าย</td>
                    <td width="114" align="center" class="TblHeaderColumn aligncenter">รูปภาพ</td>
                    <td width="478" class="TblHeaderColumn">รายละเอียด</td>
                    <td width="80" class="TblHeaderColumn">&nbsp;</td>
                  </tr>
                  <tr>
                    <td align="center" class="TblRow aligncenter"><input type="checkbox" name="checkbox2" value="checkbox"></td>
                    <td align="center" class="TblRow aligncenter">ภาพบุคคล</td>
                    <td height="120" align="center" class="TblRow aligncenter"><span class="TblRow AlignCenter bgRowGray"><img src="img_suspect/mr-bean02.jpg" width="100" height="100"></span></td>
                    <td align="left" valign="top" class="TblRow AlignLeft">ทำการบันทึกภาพได้ขณะที่ผู้ต้องสงสัยไม่ทันระวังตัว</td>
                    <td align="right" class="TblRow"><input name="Submit3" type="button" class="button" value="แก้ไขข้อมูล"></td>
                  </tr>
                  <tr>
                    <td align="center" class="TblRow aligncenter bgRowGray"><input type="checkbox" name="checkbox3" value="checkbox"></td>
                    <td align="center" class="TblRow aligncenter bgRowGray">ภาพบุคคล</td>
                    <td align="center" class="TblRow aligncenter bgRowGray"><span class="TblRow AlignCenter"><img src="img_suspect/mr_bean.jpg" width="100" height="100"></span></td>
                    <td class="TblRow AlignLeft bgRowGray">ทำการบันทึกภาพได้ขณะที่ผู้ต้องสงสัยไม่ทันระวังตัว และกำลังมีปากเสียงอยู่กับสายที่เข้าไปสืบ</td>
                    <td align="right" class="TblRow bgRowGray"><span class="TblRow">
                      <input name="Submit32" type="button" class="button" value="แก้ไขข้อมูล">
                    </span></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  
                </table>
                
                 -->
                
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
		<!-- Footer -->
		<!--#include file = "templates/footer.htm"-->
	</td>
  </tr>
</table>

</body>
</html>
