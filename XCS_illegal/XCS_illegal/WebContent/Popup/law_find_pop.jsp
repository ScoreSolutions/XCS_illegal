<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<html xmlns="http://www.w3.org/1999/xhtml">

<HEAD>

<title>รายชื่อเจ้าหน้าที่ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript">

function sendvalue(value,empid){
   var type = "${formname}";

   if(type=="coemp"){
       addRow(value,empid);
    }else{

	 if("${formname}"!=""){
      opener.document.getElementById("${formname}").value=value;
      }
      if("${empid}"!=""){
      opener.document.getElementById("${empid}").value=empid;
      }
      

    }
	opener.focus();
	self.close();
}
function clearfield(){
	   var type = "${formname}";

	   if(type=="coemp"){
	       addRow(value,empid);
	    }else{

		 if("${formname}"!=""){
	      opener.document.getElementById("${formname}").value="";
	      }
	      if("${empid}"!=""){
	      opener.document.getElementById("${empid}").value="";
	      }
	   
	    }
		opener.focus();
		self.close();
	}
</script>
</HEAD>

<BODY>
<table border="0" cellpadding="0" cellspacing="0" width="95%">
<form method="post" name="dataform" action="<c:url value='process?action=LawFind_pop&formname=${formname}&id=${empid}&cmd=list'/>">

	<tr>
		<td colspan="2"><span class="websitename" > รายชื่อผู้กระทำผิด</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
			<td colspan="2">
			<input name="btnSelect"  type="button" class="barButton" value="ไม่เลือกรายการ" onclick = "clearfield();" >
				</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	
	<tr>
		<td width="30%"  align="right">ชื่อ-สกุล ผู้กระทำผิด : </td>
		<td width="70%">
			<input name="txtfname" type="text" class="text"  size="20" value = "${param.txtfname}">
			</td>
	</tr>
	<tr>
		<td colspan="2">&nbsp;&nbsp; </td>
	</tr>
	 <tr>
		<td align="right">&nbsp;</td>
		<td >
			<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">
			</td>
	</tr>
	<tr>
		<td colspan="2"><hr /> &nbsp;&nbsp;</td>
	</tr>
	
	</form>
</table>



<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">

 <tr align="left" valign="top">
				<td colspan="1"><%=pageUtil.getPagination()%></td><td align="right"><%=pageUtil.getPageStatus()%></td>
			</tr>
       <tr>
         <td colspan="6"></td>
       </tr>
       <tr>
			<td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
			
			<td width="25%" class="TblHeaderColumn">ชื่อ-สกุล</td>
			
	  </tr>
	 
	  <c:forEach items="${divide_staffList}"  var="staff" varStatus="i">
			<tr>
			<td class="TblRow aligncenter">${i.count+_rowIndex}</td>
			<td height="25" align="left" valign="top" class="TblRow AlignLeft"><a href="#" onClick="sendvalue('${staff.lawbreaker_name}','${staff.lawbreaker_no}')">${staff.lawbreaker_name}</a></td>
				</tr>
		</c:forEach>
</table>

</BODY>
</HTML>