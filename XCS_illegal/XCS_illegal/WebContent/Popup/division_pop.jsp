<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigDecimal"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>



<html xmlns="http://www.w3.org/1999/xhtml">
<html >

<HEAD>
<script type="text/javascript">

function clearfield(){
       
	        opener.document.getElementById("${formname}").value="";
	        opener.document.getElementById("${formcode}").value="";
	        //opener.document.getElementById("${formpos}").value=""; // add by mu

	  
		opener.focus();
		self.close();
	}
function sendvalue(value,formcode){
   var type = "${formname}";

   if(type=="coemp"){
       addRow(value,empid);
    }else{
      opener.document.getElementById("${formname}").value=value;
      opener.document.getElementById("${formcode}").value=formcode;
    }
	opener.focus();
	self.close();
}
</script>

<title>ข้อมูลหน่วยงาน : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>

</HEAD>
    <body>
    <form method="post" name="dataform" action="<c:url value='process?action=Ed_office_pop&formname=${formname}&formcode=${formcode}&cmd=list'/>">
      <table border="0" cellpadding="0" cellspacing="0" width="95%">
           <tr>
                <td colspan="2"><span class="websitename" >ข้อมูลหน่วยงาน</span></td>
           </tr>
           <tr>
                <td colspan="2"><hr /></td>
           </tr>
           <tr>
                <td colspan="2">
                     <input name="btnSelect"  type="button" class="barbutton" value="ไม่เลือกรายการ" onclick = "clearfield();">
                     </td>
           </tr>
           <tr>
                <td colspan="2"><hr /></td>
           </tr>
           <c:if test="${sub_offcode == null }">
	           <tr>
	                <td width="30%" align="right">รหัสหน่วยงาน : </td>
	                <td width="70%">
	                     <input name="txt_offcode" type="text" class="text"  size="45" value="${param.txt_offcode }">
	                </td>
	           </tr>
	           <tr>
	                <td align="right">ชื่อหน่วยงาน : </td>
	                <td >
	
	                     <input name="txt_offname" type="text" class="text"  size="45" value="${param.txt_offname }">
	                </td>
	           </tr>
	           <tr >
	                <td align="right">&nbsp;</td>
	                <td >
	                     <input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">
	                </td>
	           </tr>
           </c:if>
      </table>
        </form>
      <table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
             <tr  align="left" valign="top">
						<td colspan="2"><%=pageUtil.getPagination()%></td><td align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
             <tr>
                     <td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
                     <td width="20%" class="TblHeaderColumn">รหัสหน่วยงาน</td>
                     <td width="55%" class="TblHeaderColumn">ชื่อหน่วยงาน</td>
             </tr>
             <c:forEach items="${Ed_officeList}"  var="Ed_office" varStatus="i">
             <c:set var="Rows" value="${Rows + 1}" />
             <c:if test="${(Rows % 2) == 1}">

				<tr>
					<td class="TblRow aligncenter">${Rows+_rowIndex}</td>
					<td height="25" align="left" valign="top" class="TblRow AlignCenter"><span class="TblRow AlignCenter"><a href="#" onClick="sendvalue('${Ed_office.short_name}','${Ed_office.offcode}')">${Ed_office.offcode}</a></span></td>
					<td align="left" valign="top" class="TblRow AlignLeft"><span class="TblRow AlignLeft">${Ed_office.short_name}</span></td>

				</tr>
			</c:if>
			<c:if test="${(Rows % 2) == 0}">

				<tr>
					<td class="TblRow aligncenter bgRowGray">${Rows+_rowIndex}</td>
					<td height="25" class="TblRow AlignCenter bgRowGray"><span class="TblRow AlignCenter"><a href="#" onClick="sendvalue('${Ed_office.short_name}','${Ed_office.offcode}')">${Ed_office.offcode}</a></span></td>
					<td class="TblRow AlignLeft bgRowGray"><span class="TblRow AlignLeft">${Ed_office.short_name}</span></td>

				</tr>
			</c:if>
			</c:forEach>
      </table>
   
    </body>
</html>
