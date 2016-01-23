<%@ page contentType="text/html; charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<script type='text/javascript' src='dwr/util.js'></script>
<script type='text/javascript' src='dwr/interface/Lawbreaker.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%@page import="java.util.Date" %>
<%
PageUtil pageUtil = new PageUtil(request);
%>


<HEAD>
<base target="_self" />
<title>ค้นหารายชื่อผู้กระทำผิด : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
var opener = window.dialogArguments;
function sendvalue(vID, lsType){
	Lawbreaker.getByLawbreakerID(lsType,vID, function(data) {
		setData(data);
	});
}

function setData(data){
	opener.document.getElementById("txtIDCardNo").value = (data.lawbreaker_id_card != null ? data.lawbreaker_id_card : "");
	if(data.sex == "M"){
		opener.document.getElementById("tSexM").checked = true;
	}else if(data.sex == "F"){
		opener.document.getElementById("tSexF").checked = true;
	}
	opener.document.getElementById("nick_name").value = (data.title_code != null ? data.title_code : "");
	opener.document.getElementById("first_name").value = (data.first_name != null ? data.first_name : "");
	opener.document.getElementById("last_name").value = (data.last_name != null ? data.last_name : "");
	opener.document.getElementById("other_name").value = (data.other_name != null ? data.other_name : "");
	opener.document.getElementById("home_number").value = (data.address_no != null ? data.address_no : "");
	opener.document.getElementById("moo").value = (data.moo != null ? data.moo : "");
	opener.document.getElementById("soi").value = (data.soi != null ? data.soi : "");
	opener.document.getElementById("road").value = (data.road != null ? data.road : "");
	opener.getProvince('province','district','tambol',data.province_code,data.district_name,data.subdistrict_name);
	opener.document.getElementById("cmbRace").value = (data.race_id != null ? data.race_id : "");
	opener.document.getElementById("cmbNationality").value = (data.nation_id != null ? data.nation_id : "");
	opener.document.getElementById("career").value = (data.career != null ? data.career : "");
	if(data.birth_date2 != null){
		opener.document.getElementById("birthdate").value = data.birth_date2;
		opener.calage();
	}else
		opener.document.getElementById("birthdate").value = "";

	opener.document.getElementById("father_name").value = (data.father_name != null ? data.father_name : "");
	opener.document.getElementById("mother_name").value = (data.mother_name != null ? data.mother_name : "");

	if(data.ls_type="LAWBREAKER")
		opener.document.getElementById("lawbreaker_no").value = data.lawbreaker_no;
	
	opener.focus();
	self.close();
}

</script>
</HEAD>

<BODY>



<form id="formPopup" action='<c:url value="/process?action=ArrestLawbreakerFind_pop&cmd=list&rnd=<%=new Date().getTime() %>" />' name="dataform" method="post"  >
<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >ค้นหาชื่อผู้กระทำผิด</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td width="30%"  align="right">ชื่อ-สกุล ผู้กระทำผิด : </td>
		<td width="70%">
			<input name="txtfname" id="txtfname" type="text" class="textbox"  size="20" value = "${txtfname}">
		</td>
	</tr>
	<tr>
		<td align="right">เลขที่บัตรประชาชน :&nbsp;</td>
		<td>
			<input id="txtIdcardNo" name="txtIdcardNo" type="text" class="textbox"  size="20" value = "${txtIdcardNo}">
		</td>
	</tr>
	<tr>
		<td colspan="2">&nbsp;&nbsp; </td>
	</tr>
	 <tr>
		<td align="right">&nbsp;</td>
		<td >
			<input type="image" src="images/btn_search_big.png"  alt="Submit">
		</td>
	</tr>
	<tr>
		<td colspan="2"><hr /> &nbsp;&nbsp;</td>
	</tr>
</table>

<c:if test="${showPop == '1'}">
	<script>
		if(opener.document.getElementById("first_name").value != "" || opener.document.getElementById("last_name").value != ""){
			document.getElementById("txtfname").value = opener.document.getElementById("first_name").value + " " + opener.document.getElementById("last_name").value;
			document.dataform.submit();
		}
	</script>
</c:if>

</form>

<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC" align="center" >
 	   <tr align="left" valign="top">
				<td colspan="3" ><%=pageUtil.getPagination()%></td>
				<td align="right" ><%=pageUtil.getPageStatus()%></td>
	   </tr>
       <tr>
			<td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
			<TD WIDTH="20%" class="TblHeaderColumn" >เลขบัตรประชาชน</TD>
			<td width="30%" class="TblHeaderColumn">ชื่อ-สกุล</td>
			<td width="40%" class="TblHeaderColumn">ที่อยู่</td>
	   </tr>
	 
	  <c:forEach items="${divide_staffList}"  var="lb" varStatus="i">
			<tr>
				<td class="TblRow" align="center">${i.count+_rowIndex}</td>
				<td align="left" class="TblRow AlignLeft" >${lb.lawbreaker_id_card}</td>
				<td height="25" align="left" valign="top" class="TblRow AlignLeft"><a href="#" onClick="sendvalue('${lb.id}','${lb.lstype }')">${lb.lawbreaker_name}</a></td>
				<td align="left" class="TblRow AlignLeft" >${lb.lawbreaker_address}</td>
			</tr>
		</c:forEach>
</table>

</BODY>

