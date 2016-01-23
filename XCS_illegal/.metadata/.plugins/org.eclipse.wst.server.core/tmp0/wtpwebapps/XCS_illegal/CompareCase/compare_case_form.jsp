<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@include file="/Templates/taglibs.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="css/calendar/calendar.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="js/menu.js" ></script>
<script type="text/javascript" language="JavaScript" src="js/calendar/calendar.js"></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script language="javascript" type="text/javascript">
function winPopup(theURL,winName,features, myWidth, myHeight, isCenter) {
	
		if(window.screen)if(isCenter)if(isCenter=="true"){
			var myLeft = (screen.width-myWidth)/2;
			var myTop = (screen.height-myHeight)/2;
			features+=(features!='')?',':'';
			features+=',left='+myLeft+',top='+myTop;
		}
		window.open(theURL,winName,features+((features!='')?',':'')+'width='+myWidth+',height='+myHeight);
		
}
function toggleVisibility()
{
var checkAction = document.getElementById("row1").style.display;
//alert(checkAction);
if(checkAction=="none"){
document.getElementById("row1").style.display = "";
}else{
document.getElementById("row1").style.display = "none";
}
}

</script>
<style type="text/css">
<!--
.style7 {
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
}
-->
</style>
</head>
<body onLoad="MM_preloadImages('images/icon_top_mytask_02.png','images/icon_top_myprofile_02.png','images/icon_top_help_02.png')">
<form name="form" action="">
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td valign="top" height="100">
		<!-- Header -->
		<!--#include file = "templates/header.htm"-->
	</td>
  </tr>
  <tr>
    <td valign="top">
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td valign="top" align="left" width="200" height="100%">
				<!-- Left menu -->
				<!--#include file = "templates/leftmenu.htm"-->
			</td>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">คำร้องขอให้เปรียบเทียบคดี</span></td>
              </tr>

              <tr>
                <td>&nbsp;</td>
                <td>
                	
                    
                    <!--   Start  My Form-->
                	<table border="0" width="700">
              			<tr valign="top">
							<td align="right">&nbsp;</td>
                            <td>&nbsp;</td>
                      	</tr>
                        <tr valign="top">
							<td colspan="2">
								<table width="100%" border="0" cellpadding="0" cellspacing="0">
									<tr valign="top">
										<td width="172" height="25" align="right" valign="middle">สมุดรับคำกล่าวโทษลำดับที่ :</td>
										<td width="183">
               	   		          <input type="Text" id="notifierAmphur2" name="notifierAmphur2" value="" class="textinput"/>
											<img src="images/btn_browse.png" width="18" height="19" border="0" >
                                   	  </td>
										<td width="119" align="right" valign="middle">&nbsp;</td>
										<td width="220">&nbsp;</td>
                                    </tr>
                                    <tr>
                                    	<td>&nbsp;</td>
                                    	<td align="left">
                                        	<input name="save_form" type="button" value="แสดงคำร้องขอให้เปรียบเทียบ" class="button" onClick="javascript:toggleVisibility();">
                                        </td>
                                        <td colspan="2">&nbsp;</td>
                                    </tr>
								</table>											
                             </td>
						</tr>
										
                        <tr valign="top" >
                        	<td colspan="2">&nbsp;</td>
                        </tr>
                        <tr id="row1" style="display:none">
                            <td>&nbsp;</td>
                            <td><table width="700" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
                              <tr>
                                <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
                                <td width="98%"></td>
                                <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
                              </tr>
                              <tr>
                                <td height="40">&nbsp;</td>
                                <td align="center" valign="top">
                                	<table width="100%" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                          <td align="center" valign="top"><p style="font-size: 12pt;font-style:normal">คำร้องขอให้เปรียบเทียบคดีตามกฏหมายในหน้าที่กรมสรรพสารมิต</p></td>
                                        </tr>
                                        <tr>
                                          <td align="left" valign="top" height="40">&nbsp;</td>
                                        </tr>
                                        <tr>
                                          <td align="right" valign="top"><p style="font-size: 12pt;font-style:normal">เขียนที่ กรมสรรพสามิต</p></td>
                                        </tr>
                                        <tr>
                                          <td align="right" valign="top"><p style="font-size: 12pt;font-style:normal">วันที่ 27 เดือนสิงหาคม พ.ศ.2552</p></td>
                                        </tr>
                                        <tr>
                                          <td align="left" valign="top" height="20">&nbsp;</td>
                                        </tr>
                                        <tr>
                                          <td align="left" valign="top">
                                          		<p style="font-size: 12pt;font-style:normal">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ตามที่ข้าพเจ้าได้ต้องหาว่าได้กระทำความผิดฐาน มีไว้ในครอบครองซึ่งสุราที่ต้องปิดแสตมป์สุรา แต่มิได้ปิดแสตมป์สุราตามวิธีและเงื่อนไขที่กำหนดในกฏกระทรวง ตามสมุดรับคำกล่าวโทษลำดับที่.........  อันเป็นความผิดตาม พ.ร.บ.สุรา พ.ศ.2493 มาตรา 4</p>
                                          </td>
                                        </tr>
                                        <tr>
                                          <td align="left" valign="top">&nbsp;</td>
                                        </tr> 
                                        <tr>
                                          <td align="left" valign="top">
                                          		<p style="font-size: 12pt;font-style:normal">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ข้าพเจ้ายอมรับว่าได้กระทำความผิดตามข้อกล่าวหาจริง และเพื่อให้เรื่องระงับไปโดยมิต้องนำคดีขึ้นสู่ศาล ข้าพเจ้าร้องขอให้กรมสรรพสามิตเปรียบเทียบคดี ตามมาตรา 10 แห่ง พ.ร.บ.สุรา พ.ศ.2493 และหากผลเป็นประการใด ข้าพเจ้ายอมรับผิดชอบทุกประการ ซึ่งในชั้นนี้ข้าพเจ้าได้ชำระเงินค่าปรับไว้แล้วตามหลักเกณฑ์การกำหนดค่าปรับที่กรมสรรพสามิตกำหนด และข้าพเจ้าทราบแล้วว่าในวันที่ผู้มีอำนาจเปรียบเทียบคดีอนุมัติให้เปรียบเทียบคดี เป็นวันที่คดีอาญาเลิกกันตามประมวลกฏหมายวิธีพิจารณาความอาญา</p>
                                          </td>
                                        </tr>
                                        <tr>
                                          <td align="left" valign="top" height="40">&nbsp;</td>
                                        </tr> 
                                        <tr>
                                          <td align="right" valign="top">
                                          		<table border="0" width="300">
                                                	<tr><td><p style="font-size: 12pt;font-style:normal">ลงชื่อ____________________ผู้ต้องหา</p></td></tr>
                                                    <tr><td><p style="font-size: 12pt;font-style:normal" align="center">(_____________________)</p></td></tr>
                                                </table>
                                          </td>
                                        </tr> 
                                        <tr>
                                          <td align="left" valign="top" height="40">&nbsp;</td>
                                        </tr> 
                                        <tr>
                                          <td align="right" valign="top">
                                          		<table border="0" width="300">
                                                	<tr><td><p style="font-size: 12pt;font-style:normal">ลงชื่อ____________________พยาน</p></td></tr>
                                                    <tr><td><p style="font-size: 12pt;font-style:normal" align="center">(_____________________)</p></td></tr>
                                                </table>
                                          </td>
                                        </tr> 
                                        <tr>
                                          <td align="left" valign="top" height="40">&nbsp;</td>
                                        </tr> 
                                        <tr>
                                          <td align="right" valign="top">
                                          		<table border="0" width="300">
                                                	<tr><td><p style="font-size: 12pt;font-style:normal">ลงชื่อ____________________พยาน</p></td></tr>
                                                    <tr><td><p style="font-size: 12pt;font-style:normal" align="center">(_____________________)</p></td></tr>
                                                </table>
                                          </td>
                                        </tr> 
                                        <tr>
                                          <td align="left" valign="top">&nbsp;</td>
                                        </tr> 
                                        <tr>
                                          <td align="left" valign="top">&nbsp;</td>
                                        </tr>                                   
                                	</table>
                                </td>
                                <td>&nbsp;</td>
                              </tr>
                              <tr>
                                <td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
                                <td></td>
                                <td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
                              </tr>
                            </table></td>
                         </tr>
                        <tr valign="top" >
                        	<td colspan="2">&nbsp;</td>
                        </tr>
                        <tr valign="top" >
                            <td colspan="2" align="center">
                            	<input name="save_form" type="button" value="&#3610;&#3633;&#3609;&#3607;&#3638;&#3585;" class="button">
                                <input name="reset_form" type="reset" value="&#3618;&#3585;&#3648;&#3621;&#3636;&#3585;" class="button">
                                <input name="save_form" type="button" value="พิมพ์" class="button">
                            </td>
                        </tr>
					</table>
                    <!--   Start  My Form-->
                                    
                      
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
</form>
</body>
</html>
