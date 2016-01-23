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

function sendvalue(value,empid,posname,poscode,offname,offcode){
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
     if("${posname}"!=""){
      opener.document.getElementById("${posname}").value=posname;
     }
     if("${poscode}"!=""){
      opener.document.getElementById("${poscode}").value=poscode;
     }
     if("${offname}"!=""){
      opener.document.getElementById("${offname}").value=offname;
     }
     if("${offcode}"!=""){
      opener.document.getElementById("${offcode}").value=offcode;
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
	      if("${posname}"!=""){
	      opener.document.getElementById("${posname}").value="";
	      }
	      if("${poscode}"!=""){
	      opener.document.getElementById("${poscode}").value="";
	      }
	      if("${offname}"!=""){
	      opener.document.getElementById("${offname}").value="";
	      }
	      if("${offcode}"!=""){
	      opener.document.getElementById("${offcode}").value="";
	      }

	    }
		opener.focus();
		self.close();
	}

</script>
</HEAD>

<BODY>
<table border="0" cellpadding="0" cellspacing="0" width="95%">
<form method="post" name="dataform" action="<c:url value='process?action=Divide_staff_pop&formname=${formname}&id=${empid}&posname=${posname}&poscode=${poscode}&offname=${offname}&offcode=${offcode}&cmd=list'/>">

	<tr>
		<td colspan="2"><span class="websitename" > รายชื่อเจ้าหน้าที่</span></td>
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
		<td width="30%"  align="right">ทีมสายตรวจ : </td>
		<td width="70%">
            <select  name="teamname" id="teamname" style="width:200">
            <option value="" selected>ทั้งหมด</option>
            <c:forEach items="${teamlist}"  var="team">
            <option value="${team.inspector_code}" <c:if test="${team.inspector_code == param.teamname }" > selected</c:if>>${team.inspector_code} ${team.inspector_name}</option>
            </c:forEach>
            </select>
		</td>
	</tr>
	<tr>
		<td width="30%"  align="right">ชื่อเจ้าหน้าที่ : </td>
		<td width="70%">
			<input name="txtfname" type="text" class="text"  size="20" value = "${param.txtfname}">
			นามสกุล :&nbsp;&nbsp;&nbsp;<input name="txtlname" type="text" class="text"  size="25" value = "${param.txtlname}">
		</td>
	</tr>
	<tr>
		<td  align="right">ตำแหน่ง : </td>
		<td >
			<input name="txtposname" type="text" class="text"  size="50" value = "${param.txtposname}">
		</td>
	</tr>
	<tr>
		<td  align="right">สังกัด : </td>
		<td >
			<input name="txtoffname" type="text" class="text"  size="50" value = "${param.txtoffname}" >
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



<table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">

<tr  align="left" valign="top">
<td colspan="3"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>

       <tr>
         <td colspan="6"></td>
       </tr>
       <tr>
			<td width="5%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
			<td width="10%" class="TblHeaderColumn">รหัสพนักงาน</td>
			<td width="20%" class="TblHeaderColumn">ชื่อ-สกุล</td>
			<td width="25%" class="TblHeaderColumn">ตำแหน่ง</td>
			<td width="30%" class="TblHeaderColumn">สังกัด</td>
			<td width="10%" class="TblHeaderColumn">ประเภทเจ้าหน้าที่</td>
	  </tr>
	  <c:forEach items="${divide_staffList}"  var="staff" varStatus="i">
		<tr>
			<td class="TblRow aligncenter">${i.count+_rowIndex}</td>
			<td height="25" align="left" valign="top" class="TblRow AlignLeft"><a href="#" onClick="sendvalue('${staff.title_name}${staff.first_name} ${staff.last_name}','${staff.idcard_no}','${staff.posname}','${staff.poscode}','${staff.offname}','${staff.offcode}')">${staff.idcard_no}</a></td>
			<td align="left" valign="top" class="TblRow AlignLeft"><span class="TblRow AlignLeft">${staff.title_name}${staff.first_name}&nbsp;&nbsp;${staff.last_name}</span></td>
			<td align="left" valign="top" class="TblRow AlignLeft"><span class="TblRow AlignLeft">${staff.posname}</span></td>
			<td align="left" valign="top" class="TblRow AlignLeft"><span class="TblRow AlignLeft">${staff.offname}</span></td>
			<td align="left" valign="top" class="TblRow AlignLeft"><span class="TblRow AlignLeft">${staff.per_type_name}</span></td>
		</tr>
	   </c:forEach>
</table>

</BODY>
</HTML>
