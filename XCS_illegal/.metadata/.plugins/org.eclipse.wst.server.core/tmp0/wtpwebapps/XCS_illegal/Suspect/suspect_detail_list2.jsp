<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="css/calendar/calendar.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="js/calendar/calendar.js"></script>
<script type="text/javascript" language="JavaScript" src="js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="js/menu.js" ></script>
<script type="text/JavaScript">
function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}
</script>

<%
	String suspectNo = request.getParameter("suspect_no");
%>

<script>
	function KO_doDeleteInvertigation(caller){

		var confirm = window.confirm("ยืนยันการลบข้อมูล?");
		if (!confirm){
			return false;
		}
		
		var data = jQuery("form#pager").serialize();
		data = data + "&target=SUSPECT_INVESTIGATE";
		var url = "DeleteSuspectDetail.do";
		jQuery.post(url,data, function(result){
			// alert(result);
			// var json = jQuery.toJson(result);
			// alert(json);
		});
		window.location.reload(true);
	}
</script>

</head>
<body >
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td valign="top" height="100">
		<!-- Header -->
		<%@ include file="../Templates/header.jsp" %>
	</td>
  </tr>
  <tr>
    <td valign="top">
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
			  <tr></tr>
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
					<span class="websitename">ประวัติผู้ต้องสงสัย<%=sType%></span>
				 </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
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
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
				  <%	  if (request.getParameter("sp").equals("1")) {	  %>
					<!-- Left menu -->
					<jsp:include page="suspect_detail_thai.jsp"></jsp:include>
					
				  <% }else if (request.getParameter("sp").equals("2")) {  %>
					<!-- Left menu -->
					<jsp:include page="suspect_detail_eng.jsp"></jsp:include>
					
				  <%	 }else if (request.getParameter("sp").equals("3")) {  %>
					<!-- Left menu -->
					<jsp:include page="suspect_detail_company.jsp"></jsp:include>
				  <% } 
					
					String spType = request.getParameter("sp");
					%>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="30" valign="bottom">
                   <a style="border: 1;border-color:gray;background-color:#D4D0C8;height: 20;color: black;text-decoration: none"
                      href="Suspect.jsp?action=SuspectDetail3&sp=<%=spType%>&suspect_no=<%=suspectNo %>">ข้อมูลประกอบการสืบสวน</a>
                   <a style="border: 1;border-color:gray;background-color:#FFCC33;height: 20;color: black;text-decoration: none"
                      href="Suspect.jsp?action=SuspectDetail2&sp=<%=spType %>&suspect_no=<%=suspectNo %>">ข้อมูลดำเนินการสืบสวน</a>
                   <a style="border: 1;border-color:gray;background-color:#D4D0C8;height: 20;color: black;text-decoration: none"
                      href="Suspect.jsp?action=SuspectPicture&sp=<%=spType%>&suspect_no=<%=suspectNo %>">ภาพถ่าย</a>
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="35">&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
					<span class="sectionname">ข้อมูลดำเนินการสืบสวน</span>
					<font size="2" color="#FF0000"><i>*แสดงข้อมูลการดำเนินการสืบสวนที่เป็นข้อมูลของผู้ที่ใช้ระบบ</i></font>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="30">
					<a href="Suspect.jsp?action=SuspectInvest&sp=<%=request.getParameter("sp")%>&suspect_no=<%=suspectNo%>"> เพิ่มข้อมูลใหม่</a>
                &nbsp;
					<span class="spanLink" onClick="KO_doDeleteInvertigation(this);">ลบข้อมูล</span>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                
                
                <!-- 
                
                <table class="tableList" width="803" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                  <tr>
                     <td colspan="6"><%@ include file="../Templates/splitPageBar.html" %></td>
                  </tr>
                  <tr>
                    <td width="35" class="TblHeaderColumn AlignCenter"><input type="checkbox" name="checkbox3" value="checkbox"></td>
                    <td width="80" class="TblHeaderColumn">วันที่เริ่ม</td>
                    <td width="80" class="TblHeaderColumn">วันที่สิ้นสุด</td>
                    <td width="170" class="TblHeaderColumn">คดี พ.ร.บ.</td>
                    <td width="255" class="TblHeaderColumn">พฤติกรรมผู้ต้องสงสัย</td>
                    <td width="183" class="TblHeaderColumn">&nbsp;</td>
                  </tr>
                  <tr>
                    <td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                    <td class="TblRow AlignLeft">30/08/2552</td>
                    <td class="TblRow AlignLeft">02/09/2552</td>
                    <td class="TblRow AlignLeft">พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</td>
                    <td class="TblRow AlignLeft">นำเข้าและจำหน่ายมอเตอร์ไซต์ 4 สูบที่ไม่ได้เสียภาษี </td>
                    <td align="right" valign="middle" class="TblRow">
                      <input name="Submit3" type="button" class="button" value="แก้ไขข้อมูล"
                         onClick="MM_goToURL('parent','Suspect.jsp?action=SuspectInvest&sp=<%out.println(request.getParameter("sp")); %>');
                         return document.MM_returnValue">&nbsp;
                      <input name="Submit3" type="button" class="button" onClick="window.open('Reports/InvestigationReports.xps' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');" value="พิมพ์">
				</td>
					
                  </tr>
                  <tr>
                    <td class="TblRow AlignCenter bgRowGray"><input type="checkbox" name="checkbox2" value="checkbox"></td>
                    <td class="TblRow AlignLeft bgRowGray">15/09/2552</td>
                    <td class="TblRow AlignLeft bgRowGray">16/09/2552</td>
                    <td class="TblRow AlignLeft bgRowGray">พ.ร.บ.สุรา พ.ศ.2493 </td>
                    <td class="TblRow AlignLeft bgRowGray">ลักลอบขนสุราที่คาดว่าจะเป็นสุราเถื่อนจากกรุงเทพฯ ไปยังจังหวัดสุโขทัย</td>
                    <td align="right" class="TblRow bgRowGray"><span class="TblRow">
                      <input name="Submit3" type="button" class="button" value="แก้ไขข้อมูล"
                           onClick="MM_goToURL('parent','suspect_detail_list.jsp?sp=<%out.println(request.getParameter("sp")); %>');
                           return document.MM_returnValue">&nbsp;
                      <input name="Submit3" type="button" class="button" onClick="window.open('Reports/InvestigationReports.xps' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');" value="พิมพ์">                    </span></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                </table>
                
                 -->
                 
                 <jsp:include page="/QueryPager/suspect_investigation_pager.jsp">
                 	<jsp:param name="suspect_no" value="<%=suspectNo %>"></jsp:param>
                 </jsp:include>
                 
                
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
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
		<%@ include file = "../Templates/footer.jsp"%>
	</td>
  </tr>
</table>
</body>
</html>
