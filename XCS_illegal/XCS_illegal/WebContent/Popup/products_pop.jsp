<%@ page contentType="text/html; charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%
PageUtil pageUtil = new PageUtil(request);
%>

<%@page import="com.ko.webapp.util.PageUtil"%><html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>

<title>รายชื่อสินค้าของกลาง : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<base target="_self" />
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

<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >สินค้า</span></td>
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
	<form id='formPopup' action='<c:url value="/process?action=Product_pop&p=${p}&textCode=${textCode}&textName=${textName}&duty=${duty}&cmd=list&group_id=${group_id}"/>' method="post" name="searchstaff">
	
	
	<tr>
		<td width="30%" align="right">ชื่อสินค้า : </td>
		<td width="70%">
			<input name="product_name" type="text" class="text"  size="45" value="${param.product_name }">
		</td>
	</tr>
	
	<tr>
		<td align="right">รหัสสินค้า : </td>
		<td >
			<input name="product_code" type="text" class="text"  size="45" value="${param.product_code }">

		</td>
	</tr>
	<tr>
		<td align="right">&nbsp;</td>
		<td >
			<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">
								
		</td>
		
	</tr>
	
	</form>
	
	
	
	
</table>
<br />

<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
		<tr  align="left" valign="top">
						<td colspan="2"><%=pageUtil.getPagination()%></td><td align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
	  <tr>
			<td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>

			<td width="20%" class="TblHeaderColumn">รหัสสินค้า</td>
			<td width="35%" class="TblHeaderColumn">ชื่อสินค้า</td>
	  </tr>
	  <c:forEach items="${product_popList}"  var="products" varStatus="i">
	  		<c:if test="${(i.count % 2) == 1}">
			<tr>
				<td class="TblRow aligncenter">${i.count+_rowIndex}</td>
				<td height="25" align="left" valign="top" class="TblRow AlignCenter"><a href="#" onClick="sendvalue('${products.product_code}','${products.product_name}')">${products.product_code}</a></td>
				<td align="left" valign="top" class="TblRow AlignLeft"><span class="TblRow AlignLeft">${products.product_name}</span></td>
			</tr>
			</c:if>
			<c:if test="${(i.count % 2) == 0}">
			<tr>
				<td class="TblRow aligncenter bgRowGray">${i.count +_rowIndex}</td>
				<td height="25" align="left" valign="top" class="TblRow AlignCenter bgRowGray"><a href="#" onClick="sendvalue('${products.product_code}','${products.product_name}')">${products.product_code}</a></td>
				<td class="TblRow AlignLeft bgRowGray"><span class="TblRow AlignLeft">${products.product_name}</span></td>
			</tr>
			</c:if>
		</c:forEach>
</table>

</BODY>
</HTML>
