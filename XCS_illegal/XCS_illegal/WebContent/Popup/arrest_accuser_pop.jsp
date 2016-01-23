<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigDecimal"%>
<html>
<HEAD>
<%@ include file="/Templates/meta.jsp"%>
<title>รายชื่อเจ้าหน้าที่ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
</HEAD>
<link href="css/style.css" rel="stylesheet" type="text/css">
<BODY>
<script type="text/javascript">
function sendvalue(value,empid){
   var type = "${formname}";
   if(type=="coemp"){
   		addRow(value,empid);
   }else{
      /* comment by SoCool 
      opener.document.getElementById("${formname}").value=value;
      opener.document.getElementById("empid").value=empid;
      */
      //opener.document.getElementById("empid").value=empid;//add by mu
      opener.document.getElementById("${formname}").value=value;
      opener.document.getElementById("${formcode}").value=empid;
   }
   opener.focus();
   self.close();
}
function addRow(value,empid)
{ /* A quick example on how to <strong class="highlight">add</strong> and delete <strong class="highlight">table</strong> rows. Enjoy coding! */

  var _table = opener.document.getElementById('coemp').insertRow();
  var cell0 = _table.insertCell(0);
  var cell1 = _table.insertCell(1);
  var cell2 = _table.insertCell(2);
  cell0.innerHTML = value + '<input type=\"hidden\" name=\"coempid\" value=\"'+empid+'\">';
  cell1.innerHTML = 'เจ้าหน้าที่';
  cell2.innerHTML = '<a href=\"#\" onclick=\"removeRow(this)\">ลบรายการ</a>';
}
function removeRow(rows)
{ var _row = rows.parentElement.parentElement;
  document.getElementById('coemp').deleteRow(_row.rowIndex);
}
function addElement(value,empid) {
  alert("done");
  var ni = opener.document.getElementById('mydiv');
  alert("done2");
  var newdiv = opener.document.createElement('div');
  alert("done3");
  var divIdName = 'div'+empid;
  alert("done4");
  newdiv.setAttribute('id',divIdName);
  alert("divIdName " +divIdName);
  //newdiv.innerHTML = '<tr class=\"TblRow\"><td>'+value+'</td><td>เจ้าพนักงานสรรพสามิต<input type=\"hidden\" name=\"coempid\" value=\"'+empid+'\"></td><td ><a href=\"#\" onclick=\"removeElement(\''+divIdName+'\')\">ลบรายการ</a></td></tr>';
  alert(newdiv.innerHTML);
  alert("done6");
  ni.appendChild(newdiv);
  alert("done7")
  opener.focus();
  self.close();
}
function removeElement(divNum) {
  var d = document.getElementById('mydiv');
  var olddiv = document.getElementById(divNum);
  d.removeChild(olddiv);
}
function clearfield(){
	var type = "${formname}";
	var type = "${formcode}";
	if(type=="coemp"){
		addRow(value,empid);
	}else{
		if("${formname}" != ""){
	    	opener.document.getElementById("${formname}").value="";
	    }
	    
	    if("${empid}" != ""){
	      	opener.document.getElementById("${empid}").value="";
	    }
	    if("${posname}" != ""){
	      	opener.document.getElementById("${posname}").value="";
	    }
	    if("${poscode}" != ""){
	      	opener.document.getElementById("${poscode}").value="";
	    }
	    if("${offname}" != ""){
	      	opener.document.getElementById("${offname}").value="";
	    }
	    if("${offcode}" != ""){
	    	opener.document.getElementById("${offcode}").value="";
	    }
	    
	    if("${formcode}" != ""){
		    opener.document.getElementById("${formcode}").value="";
		} 
	 }
	 opener.focus();
	 self.close();
}
</script>
<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >รายชื่อเจ้าหน้าที่</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input name="btnBack"  type="button" class="barbutton" value="กลับ" onClick="window.close(); window.opener.focus();" >
            <input name="btnClear"  type="button" class="barbutton" value="ไม่เลือก" onclick = "clearfield();">
		</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2" align="center" valign="center">
		<form id='formPopup' action="<c:url value="/process?action=Staff&formname=${formname}&formcode=${formcode}&cmd=findStaff"/>" method="post" name="searchstaff">
			<table border="0" cellpadding="0" cellspacing="0">
			<tr>
               <td align="right">ทีมสายตรวจ : </td>
              <td>
               <select name="TEAM_ID" id="TEAM_ID" style="width:200px;">
                  <!--<option value="x" selected>90 พ.ร.บ. สุรา พ.ศ.2493</option>
                       -->
                 </select>
                 </td>
			</tr>
			<tr>
				<td width="30%"  align="right">ชื่อ : </td>
				<td width="70%">
					<input id="FIRST_NAME" name="FIRST_NAME" type="text" class="text"  size="20">
					นามสกุล :&nbsp;&nbsp;&nbsp;<input name="LAST_NAME" id="LAST_NAME" type="text" class="text"  size="25">
				</td>
			</tr>
			<tr>
				<td  align="right">ตำแหน่ง : </td>
				<td >
					<input name="POSNAME" id="POSNAME" type="text" class="text"  size="50">
				</td>
			</tr>
			<tr>
				<td  align="right">สังกัด : </td>
				<td >
					<input name="OFFNAME" id="OFFNAME" type="text" class="text"  size="50">
				</td>
			</tr>
			<tr>
				<td align="right">&nbsp;</td>
				<td >
					<input alt="Submit Form" type="image" src="images/btn_search_big.png" width="64" height="22" name="search">
				</td>
			</tr>
			</table>
			 <input name="formname" type="hidden" value="${formname}" >
			 </form>
		</td>
	</tr>
		<tr>
		<td colspan="2">
			<table width="672" border="0" cellpadding="0" cellspacing="0" class="tableList">
            <tr>
				<td colspan="6">
				</td>
			</tr>
						  <tr>
					<td class="TblHeaderColumn aligncenter" width="11%">ลำดับ</td>
					<td class="TblHeaderColumn aligncenter" width="15%">รหัสพนักงาน</td>
					<td class="TblHeaderColumn aligncenter" width="15%">รหัสบัตรประชาชน</td>
					<td class="TblHeaderColumn aligncenter" width="36%">ชื่อ-นามสกุล</td>
					<td class="TblHeaderColumn aligncenter" width="22%">ตำแหน่ง</td>
                    <td class="TblHeaderColumn aligncenter" width="16%">สังกัด</td>
			  </tr>
			  <c:forEach items="${stafflist}"  var="staff"  varStatus="i" >
			    <tr>
                    <td class="TblRow aligncenter" ><a href="#" onClick="sendvalue('${title.title_name}${staff.first_name}-${staff.last_name}','${staff.empid}')">${i.count}</a></td>
                    <td class="TblRow aligncenter"><a href="#" onClick="sendvalue('${title.title_name}${staff.first_name}-${staff.last_name}','${staff.empid}')">${staff.empid}</a></td>
                    <td class="TblRow aligncenter"><a href="#" onClick="sendvalue('${title.title_name}${staff.first_name}-${staff.last_name}','${staff.idcard_no}')">${staff.idcard_no}</a></td>
                    <td class="TblRow aligncenter" ><a href="#" onClick="sendvalue('${title.title_name}${staff.first_name}-${staff.last_name}','${staff.empid}')">${title.title_name}${staff.first_name}-${staff.last_name} </a></td>
                    <td class="TblRow aligncenter"><a href="#" onClick="sendvalue('${title.title_name}${staff.first_name}-${staff.last_name}','${staff.empid}')">${staff.poscode}</a></td>
                    <td class="TblRow aligncenter"><a href="#" onClick="sendvalue('${title.title_name}${staff.first_name}-${staff.last_name}','${staff.empid}')">${staff.offcode}</a></td>
                </tr>
              </c:forEach>
       	  </table>
		  </td>
	</tr>
</table>
</BODY>
</HTML>
