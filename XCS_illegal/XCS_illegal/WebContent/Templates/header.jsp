<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.ko.webapp.bean.UserSession"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<%@page import="com.ko.webapp.action.LoginAction" %>
<%@page import="com.ko.*" %>

<html>
<head>
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<%@include file="../Templates/meta.jsp"%>
<style type="text/css">
   .logout a {text-decoration: none;font-weight:bold;color:white;}
   .logout a:hover{color:black;text-decoration: underline;}
   
</style>
<link type="text/css" rel="stylesheet"  href="css/style.css">

<script type="text/javascript" language="JavaScript" src="js/rollimage.js?time=<%=new java.util.Date().getTime()%>"></script>
<script type="text/javascript" language="JavaScript" src="js/menu.js?time=<%=new java.util.Date().getTime()%>"></script>
<script type="text/javascript" language="JavaScript" src="js/JScript.js?time=<%=new java.util.Date().getTime()%>"></script>

<script type="text/javascript" language="JavaScript" src="script/jquery.js"></script>
<script type="text/javascript" language="JavaScript" src="script/jquery.form.js"></script>
<script type="text/javascript" language="JavaScript" src="script/service.js"></script>
<script type="text/javascript" language="JavaScript" src="script/action.js"></script>
<script type="text/javascript" language="JavaScript" src="script/effect.js"></script>
<script type="text/javascript" language="JavaScript" src="script/util.js"></script>
<!-- for menu -->
<LINK  type="text/css" rel="stylesheet" href="Templates/Menu/ExciseMenu.css"/>

<!-- dwr -->
<script type='text/javascript' src='<c:url value="dwr/interface/SelectRegion.js"/>'></script>
<script type='text/javascript' src='dwr/interface/Tranlog.js'></script>
<script type='text/javascript' src='dwr/engine.js?time=<%=new java.util.Date().getTime()%>'></script>
<script type='text/javascript' src='dwr/util.js?time=<%=new java.util.Date().getTime()%>'></script>
<script type="text/javascript" src="js/gen_validatorv31.js?time=<%=new java.util.Date().getTime()%>"></script>
<script type='text/javascript' src='js/datetimepicker_css.js?time=<%=new java.util.Date().getTime()%>'></script>
<script type='text/javascript' src='dwr/interface/Master.js?time=<%=new java.util.Date().getTime() %>'></script>
<script type="text/javascript">
function writeTranLog(tran_desc){
	var browser = "<%=RequestUtil.getBrowser(request)%>";
	var ip_address = "<%=RequestUtil.getIpAddress(request)%>";
	var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
	var login_his_id = "<%=RequestUtil.getUserSession(request).getLogin_his_id()%>";
	var session_id = "<%=request.getSession().getId()%>";
	//Tranlog.writeTranLog(user_id,ip_address,tran_desc,browser,session_id);
	Tranlog.writeTranLog(user_id,ip_address,tran_desc,browser,session_id, login_his_id);
}

function ShowNotifyPop(){
	var data = window.showModalDialog('Popup/NotifyPopup.jsp' , self , 'dialogWidth=700px,Height=600px');
	if(data != null){
		
	}
}

</script>
</head>
<body >
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td valign="top" >
			<table width="100%" height="100" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="52%" background="images/bk_green.jpg">
					<table width="95%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="26%"><a href="<c:url value="/"/>"><img src="images/logo.png" width="166"
								height="96" alt="" border="0"/></a></td>
							<td width="74%" align="left" valign="middle"><img
								src="images/pic_webname.png" width="355" height="60" /></td>
						</tr>
					</table>
					</td>
					<td width="48%" align="right" valign="bottom"
						background="images/bk_green.jpg">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<%
					UserSession us = (UserSession)session.getValue(Constants.USER_SESSION);
					if(us==null){%>
						<tr><td rowspan="3" colspan="2">&nbsp;</td></tr>
					<% }else{%>
						<tr>
							<td align="right"><b>Version :</b>&nbsp;</td>
							<td align="left">&nbsp;1.5.0.0</td>
						</tr>
						<tr>
							<td width="40%" align="right"><b>ผู้ใช้งาน :</b>&nbsp;</td>
							<td width="60%" align="left">&nbsp;<%=us.getFullName() %></td>
						</tr>
						<tr>
							<td align="right"><b>ตำแหน่ง :</b>&nbsp;</td>
							<td align="left">&nbsp;<%=us.getPosname()%></td>
						</tr>
						<tr>
							<td align="right"><b>หน่วยงาน :</b>&nbsp;</td>
							<td align="left">&nbsp;<%=us.getOffname() %></td>
						</tr>
						<tr height="25px">
							<td>&nbsp;</td>
							<td align="left">
								<div class="logout">
									<a href="process?action=Login&cmd=Logout" >ออกจากระบบ</a>
								</div>
							</td>
						</tr>
					<% }%>
					</table>
					</td>
				</tr>
				<tr>
					<td bgcolor="#EDEDED" colspan="2"><!-- Menu-->
					<%
					if(us != null){
						out.println("<SCRIPT language=\"javascript\"  type=\"text/javascript\" src=\"Templates/Menu/unimenu.js\"></SCRIPT>");
						out.println("<SCRIPT language=\"javascript\"  type=\"text/javascript\" src=\"Templates/Menu/ExciseMenucfg.js\"></SCRIPT>");
						out.println(session.getValue("MyMenu").toString());
					}else //Menu
						out.println("&nbsp;");
					%>
					</td>
				</tr>
				<tr>
					<td height="2" bgcolor="#999999"></td>
					<td align="right" bgcolor="#999999"></td>
				</tr>
				<tr>
					<td height="3" align="left" colspan="2" bgcolor="#FFFFFF">
					<table width="203" border="0" height="3" cellspacing="0"
						cellpadding="0">
						<tr>
							<td width="200" bgcolor="#999999"></td>
							<td><img src="images/pic_angleMenu.gif" /></td>
						</tr>
					</table>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td valign="top" height="650px" >
		<!-- Body -->