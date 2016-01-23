<%@ page language="java" errorPage="/error.jsp" contentType="text/html; charset=utf-8" %>
<%@ page import="com.ko.webapp.util.FormHandler"%>
<%@ include file="/Templates/taglibs.jsp"%>

<%@page import="com.ko.webapp.bean.UserSession"%>
<!--<script >-->
<!--ShowNotifyPop();-->
<!--</script>-->

<table width="100%" height="450" border="0" cellspacing="0" background="images/bg_logo.jpg">
	<tr>
		<td width="100%" align="center" valign="middle"	background="images/bg_logo.jpg">
		<table border="2" cellpadding="0" cellspacing="0"
			style="border-color:blue" bgcolor="#FFFFFF">
			<tr>
				<td>
					<form action="<c:url value='process?action=Login&cmd=chkLogin'/>" name="mainPage" method="post">
						<table border="0" cellspacing="0" cellpadding="0" width="400">
							<tr>
		
								<td colspan="3" align="left" background="images/bk_green.jpg">
								<img src="images/pic_webname.png" border="0" />
								<td />
							</tr>
							<tr>
								<td rowspan="5"><img src="images/keys.png"></td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
							</tr>
							<tr>
							<input type="hidden" value="3302000679554"></input>
								<td align="right">ชื่อเข้าระบบ :&nbsp;</td>
								<td align="left">
									<input type="text" id="username" name="username" class="textbox" size="15" value="<%=(request.getParameter("username") == null ? "" : request.getParameter("username")) %>" > 
									<font style="color:red">*</font>
								</td>
							</tr>
							<tr>
								<td align="right">รหัสผ่าน :&nbsp;</td>
								<td align="left">
									<input type="password" id="password" name="password" value="" class="textbox" size="15"> 
									<font style="color:red">*</font>
								</td>
							</tr>
							<tr>
								<td align="right">&nbsp;</td>
								<td align="left">
									<font color="red"><b>
									<%
										String errLogin = (String)request.getAttribute("errMsg");
										if(errLogin != null){
											if (errLogin.equals(""))
												out.println("&nbsp;");
											else
												out.println(errLogin);
										}else
											out.println("&nbsp;");
									%>
									</b></font>
								</td>
							</tr>
							<tr>
								<td align="right"></td>
								<td align="left"></td>
							</tr>
							<tr>
								<td align="center" colspan="3">
								<hr size="1"
									style=" border-style:solid; border-width:1px; height:0px; color:#dd00dd; width:95%;" />
								</td>
							</tr>
							<tr>
								<td align="right"></td>
								<td align="center" colspan="2">
									<input type="submit" id="login" value="เข้าสู่ระบบ" class="barbutton" name="login" >
								</td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
