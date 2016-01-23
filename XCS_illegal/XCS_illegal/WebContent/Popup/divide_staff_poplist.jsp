<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigDecimal"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%@include file="/Templates/meta.jsp" %>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<html xmlns="http://www.w3.org/1999/xhtml">

<HEAD>
<base target="_self" />
<title>รายชื่อเจ้าหน้าที่ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript">
var opener = window.dialogArguments;
function saveto()
{
var data = 	new Array();
var count = 0;
var dcount = 0;

	for (var i=1; i < document.dataform3.thecheckbox.length; i++)
	{
		if (document.dataform3.thecheckbox[i].checked)
		{
			count=dcount;
			dcount+=1;
			data[count]=new Array();
			data[count][1]=""; //document.dataform3.staff_no[i].value;
			data[count][2]=document.dataform3.inspector_code[i].value;
			data[count][3]=document.dataform3.posname[i].value;
			data[count][4]="3";
			data[count][5]=document.dataform3.idcard_no[i].value;
			data[count][6]=document.dataform3.poscode[i].value;
			data[count][7]=document.dataform3.offcode[i].value;
			data[count][8]=document.dataform3.offname[i].value;
			data[count][9]=document.dataform3.fullname[i].value;
			data[count][10]=document.dataform3.first_name[i].value;
			data[count][11]=document.dataform3.last_name[i].value;
            data[count][12]=document.dataform3.title_code[i].value;
			data[count][13]=document.dataform3.staff_level[i].value;
			data[count][14]=document.dataform3.title_name[i].value;
			//alert (data[count][1]+ " - " + data[count][2]+ " - " + data[count][3]+ " - " + data[count][4] );
		}
	}
	//alert (dcount);
	//alert (data.length);
	window.returnValue = data;
	window.close();

}
</script>
</HEAD>

<BODY>
<form method="post" name="dataform" action="<c:url value='process?action=Divide_staff_poplist&cmd=list'/>">
<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" > รายชื่อเจ้าหน้าที่</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input name="btnSelect"  type="button" class="barButton" value="เลือกรายการ" onClick="saveto()" >
			<input name="btnBack"  type="button" class="barButton" value="กลับ" onClick="self.close()" >
			<input type="hidden" name="showOther" id="showOther" value="${showOther}"></input>
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
            <option value="${team.inspector_code}" <c:if test="${team.inspector_code == param.teamname}"> selected </c:if>>${team.inspector_code} ${team.inspector_name}</option>
            </c:forEach>
            </select>
		</td>
	</tr>
	<tr>
		<td width="30%"  align="right">ชื่อเจ้าหน้าที่ : </td>
		<td width="70%">
			<input name="txtfname" type="text" class="text"  size="20" value="${param.txtfname}">
			นามสกุล :&nbsp;&nbsp;&nbsp;<input name="txtlname" value="${param.txtlname}" type="text" class="text"  size="25">
		</td>
	</tr>
	<tr>
		<td  align="right">ตำแหน่ง : </td>
		<td >
			<input name="txtposname" value="${param.txtposname}" type="text" class="text"  size="50">
		</td>
	</tr>
	<tr>
		<td  align="right">สังกัด : </td>
		<td >
			<input name="txtoffname" value="${param.txtoffname}" type="text" class="text"  size="50">
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

			
			<script>
				function Check(chkcont,chk)
					{
					if(chkcont.checked==true){
					for (i = 0; i < chk.length; i++)
					chk[i].checked = true ;
					}else{
					for (i = 0; i < chk.length; i++)
					chk[i].checked = false ;
					}
					}

			</script>

	
<table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
       <tr  align="left" valign="top">
						<td colspan="5"><%=pageUtil.getPagination()%></td><td align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
       <form method="post" name="dataform3" >
       <tr>
			<td width="5%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
			<td class="TblHeaderColumn aligncenter" width="5%"> <input type="checkbox" name="allCheckbox" value="" onClick="Check(this,document.dataform3.thecheckbox);" />
				<INPUT TYPE="hidden" NAME="thecheckbox"></td>
			<td width="15%" class="TblHeaderColumn">รหัสพนักงาน
				<input type="hidden" id="idcard_no" name="idcard_no" value="" />
				<input type="hidden" id="staff_no" name="staff_no" value="" />
				<input type="hidden" id="inspector_code" name="inspector_code" value="" /></td>
			<td width="20%" class="TblHeaderColumn">ชื่อ-สกุล
				<input type="hidden" id="fullname" name="fullname" value="" /></td>
			<td width="25%" class="TblHeaderColumn">ตำแหน่ง
				<input type="hidden" id="posname" name="posname" value="" />
				<input type="hidden" id="poscode" name="poscode" value="" /></td>
			<td width="25%" class="TblHeaderColumn">สังกัด
				<input type="hidden" id="offname" name="offname" value="" />
				<input type="hidden" id="offcode" name="offcode" value="" /></td>
			<td width="10%" class="TblHeaderColumn">ประเภทเจ้าหน้าที่</td>
                <input type="hidden" id="first_name" name="first_name" value="" />
				<input type="hidden" id="last_name" name="last_name" value="" />
                <input type="hidden" id="title_code" name="title_code" value="" />
				<input type="hidden" id="staff_level" name="staff_level" value="" />
				<input type="hidden" id="title_name" name="title_name" value="" />
	  </tr>
	  <c:forEach items="${divide_staffList}"  var="staff" varStatus="i">
             <c:if test="${(i.count % 2) == 1}">
			<tr>
			<td class="TblRow aligncenter">${i.count+_rowIndex}</td>
			<td class="TblRow aligncenter" ><INPUT TYPE="checkbox" NAME="thecheckbox"></td>
			<td height="25" align="left" valign="top" class="TblRow AlignLeft">${staff.idcard_no}
				<input type="hidden" id="idcard_no" name="idcard_no" value="${staff.idcard_no}" />
				<input type="hidden" id="staff_no" name="staff_no" value="" />
				<input type="hidden" id="inspector_code" name="inspector_code" value="${staff.team_code}" /></td>
			<td align="left" valign="top" class="TblRow AlignLeft"><span class="TblRow AlignLeft">
				${staff.title_name}${staff.first_name}&nbsp;&nbsp;${staff.last_name}</span>
				<input type="hidden" id="fullname" name="fullname" value="${staff.title_name}${staff.first_name}&nbsp;&nbsp;${staff.last_name}" /></td>
			<td align="left" valign="top" class="TblRow AlignLeft"><span class="TblRow AlignLeft">${staff.posname}</span>
				<input type="hidden" id="posname" name="posname" value="${staff.posname}" />
				<input type="hidden" id="poscode" name="poscode" value="${staff.poscode}" /></td>
			<td align="left" valign="top" class="TblRow AlignLeft"><span class="TblRow AlignLeft">${staff.offname}
				<input type="hidden" id="offname" name="offname" value="${staff.offname}" />
				<input type="hidden" id="offcode" name="offcode" value="${staff.offcode}" />
                <input type="hidden" id="first_name" name="first_name" value="${staff.first_name}" />
				<input type="hidden" id="last_name" name="last_name" value="${staff.last_name}" />
                <input type="hidden" id="title_code" name="title_code" value="${staff.title_code}" />
				<input type="hidden" id="staff_level" name="staff_level" value="${staff.staff_level}" />
				<input type="hidden" id="title_name" name="title_name" value="${staff.title_name}" /></span></td>
			<td align="left" valign="top" class="TblRow AlignLeft">${staff.per_type_name}</td>
			</tr>
			</c:if>
			 <c:if test="${(i.count % 2) == 0}">
			<tr>
			<td class="TblRow aligncenter bgRowGray">${i.count+_rowIndex}</td>
			<td class="TblRow aligncenter bgRowGray" ><INPUT TYPE="checkbox" NAME="thecheckbox"></td>
			<td height="25" align="left" valign="top" class="TblRow AlignLeft  bgRowGray">${staff.idcard_no}
				<input type="hidden" id="idcard_no" name="idcard_no" value="${staff.idcard_no}" />
			    <input type="hidden" id="staff_no" name="staff_no" value="" />
				<input type="hidden" id="inspector_code" name="inspector_code" value="${staff.team_code}" /></td>
			<td align="left" valign="top" class="TblRow AlignLeft bgRowGray"><span class="TblRow AlignLeft">
				${staff.title_name}${staff.first_name}&nbsp;&nbsp;${staff.last_name}</span>
				<input type="hidden" id="fullname" name="fullname" value="${staff.title_name}${staff.first_name}&nbsp;&nbsp;${staff.last_name}" /></td>
			<td align="left" valign="top" class="TblRow AlignLeft bgRowGray"><span class="TblRow AlignLeft">${staff.posname}</span>
				<input type="hidden" id="posname" name="posname" value="${staff.posname}" />
				<input type="hidden" id="poscode" name="poscode" value="${staff.poscode}" /></td>
			<td align="left" valign="top" class="TblRow AlignLeft bgRowGray"><span class="TblRow AlignLeft">${staff.offname}</span>
				<input type="hidden" id="offname" name="offname" value="${staff.offname}" />
				<input type="hidden" id="offcode" name="offcode" value="${staff.offcode}" />
                <input type="hidden" id="first_name" name="first_name" value="${staff.first_name}" />
				<input type="hidden" id="last_name" name="last_name" value="${staff.last_name}" />
                <input type="hidden" id="title_code" name="title_code" value="${staff.title_code}" />
				<input type="hidden" id="staff_level" name="staff_level" value="${staff.staff_level}" />
				<input type="hidden" id="title_name" name="title_name" value="${staff.title_name}" />
            </td>
            <td align="left" valign="top" class="TblRow AlignLeft bgRowGray">${staff.per_type_name}</td>
			</tr>
			</c:if>
		</c:forEach>
</table>
</form>
</BODY>
</HTML>
