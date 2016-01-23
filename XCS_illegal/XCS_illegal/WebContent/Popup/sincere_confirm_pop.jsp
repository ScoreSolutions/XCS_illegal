<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>

<title>เลขที่ ส.ส.2/27 : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
</HEAD>
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
<BODY>
<form id='formPopup' action="<c:url value="/process?action=sincere_confirm&cmd=list"/>" method="post" name="searc_sincere">
<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >เลขที่ ส.ส.2/27</span></td>
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
		<td  align="right">เลขที่ ส.ส.2/27 : </td>
		<td >
			<input name="Start227" type="text" value="${param.Start227}" class="textbox" size="20" />&nbsp;&nbsp;&nbsp;&nbsp;
               ถึง :&nbsp;
               <input name="End227" type="text" value="${param.End227}" class="textbox" size="20" />
		</td>
	</tr>
	<tr>
		<td  align="right">วันที่บันทึก : </td>
		<td >
			<input name="DateStart" id="DateStart" value="${param.DateStart}" type="text" class="textdate" value="" size="10" maxlength="10" />
			<a href="javascript:NewCssCal('DateStart','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absmiddle"  style="border-style: none" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
               ถึง :&nbsp;
			<input name="DateEnd" id="DateEnd" value="${param.DateEnd}" type="text" class="textdate" value="" size="10" maxlength="10" />
			<a href="javascript:NewCssCal('DateEnd','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absmiddle"  style="border-style: none" /></a>
		</td>
	</tr>
     <tr>
		<td width="30%"  align="right">ผลการตรวจค้น : </td>
		<td width="70%">
            <input name="textSearch" value="${param.textSearch}" type="text" class="text"  size="50" />
		</td>
	</tr>
	<tr>
		<td align="right">&nbsp;</td>
		<td >
			<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">
		</td>
	</tr>
</table>
<br />
<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
           <tr  align="left" valign="top">
<td colspan="2"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
       <tr>
			<td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
			<td width="20%" class="TblHeaderColumn">เลขที่ ส.ส.2/27</td>
			<td width="20%" class="TblHeaderColumn">วันที่บันทึก</td>
			<td width="50%" class="TblHeaderColumn">ผลการตรวจค้น</td>
	  </tr>
	  <!--
	  <tr>
			<td class="TblRow aligncenter">1</td>
			<td height="25" align="left" valign="top" class="TblRow AlignLeft">LS001005300001</td>
			<td align="left" valign="top" class="TblRow AlignLeft">01/02/2553</td>
			<td align="left" valign="top" class="TblRow AlignLeft">ผลการตรวจค้น ส.ส.2/27</td>
	  </tr>
	  <tr>
			<td class="TblRow aligncenter bgRowGray">2</td>
			<td height="25" class="TblRow AlignLeft bgRowGray">LS001005300002</td>
			<td align="left" valign="top" class="TblRow AlignLeft bgRowGray">01/02/2553</td>
			<td align="left" valign="top" class="TblRow AlignLeft bgRowGray">ตรวจสอบแล้วพบของกลางอยู่มากมายหลายรายการ</td>
	  </tr>
	  -->
	  <c:forEach items="${scList}"  var="sc" varStatus="i">
	  		<c:if test="${(i.count % 2) == 1}">
			<tr>
				<td class="TblRow aligncenter">${i.count}</td>
				<td height="25" align="left" valign="top" class="TblRow AlignLeft"><a  href="#" onClick ="sendvalue('${sc.track_no}','${sc.application_sincere_confirm_id}','','','','')">${sc.track_no}</a></td>
				<td align="left" valign="top" class="TblRow AlignLeft">${sc.input_date2}</td>
				<td align="left" valign="top" class="TblRow AlignLeft">${sc.detect_result}</td>
			</tr>
			</c:if>
			<c:if test="${(i.count % 2) == 0}">
			<tr>
				<td class="TblRow aligncenter bgRowGray">${i.count}</td>
				<td height="25" class="TblRow AlignLeft bgRowGray"><a  href="#" onClick ="sendvalue('${sc.track_no}','${sc.application_sincere_confirm_id}','','','','')">${sc.track_no}</a></td>
				<td align="left" valign="top" class="TblRow AlignLeft bgRowGray">${sc.input_date2}</td>
				<td align="left" valign="top" class="TblRow AlignLeft bgRowGray">${sc.detect_result}</td>
			</tr>
			</c:if>
		</c:forEach>
</table>
</form>
</BODY>
</HTML>
