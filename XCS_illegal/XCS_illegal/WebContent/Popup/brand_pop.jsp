<%@ page contentType="text/html; charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%
PageUtil pageUtil = new PageUtil(request);
%>

<%@page import="com.ko.webapp.util.PageUtil"%><html xmlns="http://www.w3.org/1999/xhtml">

<HEAD>
<base target="_self" />
<title>ยี่่ห้อ<c:if test="${isSecond == 'Y'}">รอง</c:if> : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
</HEAD>

<BODY>
<script type="text/javascript">
var opener = window.dialogArguments;
function sendvalue(value,code){
   var type = "${textCode}";
   if(type=="coemp"){
       addRow(value);
    }else{
      opener.document.getElementById("${textCode}").value=value;
      opener.document.getElementById("${textName}").value=code;
    }
	opener.focus();
	self.close();
}
function txtclear(){
	   
	  
    opener.document.getElementById("${textCode}").value="";
    opener.document.getElementById("${textName}").value="";
  
	opener.focus();
	self.close();
}


</script>
<form id='formPopup' action="<c:url value="/process?action=Brand_pop&cmd=list&p=${p}&duty=${duty}&isSecond=${isSecond}&textCode=${textCode}&textName=${textName}&group_id=${group_id}&brand_main_code=${brand_main_code}" />" method="post" name="searchstaff">
<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >ยี่ห้อ<c:if test="${isSecond == 'Y'}">รอง</c:if></span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input name="btnSave"  type="button" class="barbutton" value="ไม่เลือกรายการ" onClick="txtclear();">
				
		</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td align="right">ชื่อยี่ห้อ : </td>
		<td >
			<input name="txtNameBrand" type="text" class="text"  size="45" value="${param.txtNameBrand }">

		</td>
	</tr>
	<tr>
		<td width="30%" align="right">รหัสยี่ห้อ : </td>
		<td width="70%">
			<input name="txtCodeBrand" type="text" class="text"  size="45" value="${param.txtCodeBrand }">
		</td>
	</tr>
	<tr>
		<td align="right">&nbsp;</td>
		<td >
			<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">
		</td>
	</tr>

</table>
</form>
<br />

<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
			<tr  align="left" valign="top">
						<td colspan="2"><%=pageUtil.getPagination()%></td><td align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
	  <tr>
			<td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>

			<td width="20%" class="TblHeaderColumn">รหัสยี่ห้อ</td>
			<td width="35%" class="TblHeaderColumn">ชื่อไทย</td>
			<td width="35%" class="TblHeaderColumn">ชื่ออังกฤษ</td>
	  </tr>
	  <c:forEach items="${brand_popList}"  var="brand" varStatus="i">
	  		<c:if test="${(i.count % 2) == 1}">
			<tr>
				<td class="TblRow aligncenter">${i.count+_rowIndex}</td>
				<td height="25" align="left" class="TblRow AlignCenter"><a href="#" onClick="sendvalue('${brand.brand_main_code}','${brand.brand_name}')">${brand.brand_main_code}</a></td>
				<td class="TblRow AlignLeft"><span class="TblRow AlignLeft">${brand.name_thai}</span></td>
				<td class="TblRow AlignLeft"><span class="TblRow AlignLeft">${brand.name_eng}</span></td>
			</tr>
			</c:if>
			<c:if test="${(i.count % 2) == 0}">
			<tr>
				<td class="TblRow aligncenter bgRowGray">${i.count+_rowIndex}</td>
				<td height="25" class="TblRow AlignCenter bgRowGray"><span class="TblRow AlignCenter"><a href="#" onClick="sendvalue('${brand.brand_main_code}','${brand.brand_name}')">${brand.brand_main_code}</a></span></td>
				<td class="TblRow AlignLeft bgRowGray"><span class="TblRow AlignLeft">${brand.name_thai} </span></td>
				<td class="TblRow AlignLeft bgRowGray"><span class="TblRow AlignLeft">${brand.name_eng} </span></td>
			</tr>
			</c:if>
		</c:forEach>
</table>
</BODY>
</HTML>
