<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
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
<script type="text/javascript"><!--
var data = 	new Array();
var opener = window.dialogArguments;
function sendvalue(value,id){
   var type = "${formname}";

   if(type=="coemp"){
       addRow(value,empid);
    }else{
    	if("${formname}" != ""){
      opener.document.getElementById("${formname}").value=value;
      }
      if("${id}" != ""){
      opener.document.getElementById("${id}").value=id;
      }
    }
	opener.focus();
	self.close();
}

function saveto()
{
	var count = 0;
	var dcount = 0;
	var brow = window.navigator.userAgent;
	
	for (var i=1; i < document.dataform3.thecheckbox.length; i++)
	{
		if (document.dataform3.thecheckbox[i].checked)
		{
			//if (brow.indexOf("Chrome")>0){//Google Chrome
				
			//}else{
				count=dcount;
				dcount+=1;
				data[count]=new Array();
				data[count][1]=document.dataform3.case_law_id[i].value;
				data[count][2]=document.dataform3.law_id[i].value;
				data[count][3]=document.dataform3.guilt_base[i].value;
				if (document.dataform3.exhibit_wild[i].checked)
				{
					data[count][4]="Y";
				}
				else
				{
					data[count][4]="N";
				}
				data[count][5]=document.dataform3.indictment_id[i].value;
			//}
		}
	}

	if (brow.indexOf("Chrome")>0){
		document.cookie="data=" + data;
	}else
   		window.returnValue = data;
	self.close();

}

</script>
<title>ข้อกล่าวหา : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" language="JavaScript" src="js/JScript.js" ></script>
</HEAD>

<BODY>

<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
	<td colspan="2"><span class="websitename"  id="varPopupName" > ข้อกล่าวหา</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input name="btnSave" onclick="saveto()" type="button" class="barbutton" value="เลือกรายการ" >
			</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2" align="center" valign="center">
<form method="post" name="dataform" action="<c:url value="process?action=Indictment_pop&cmd=list"/>" >
			<table border="0" cellpadding="0" cellspacing="0">
				<tr>
                      <td >

						<table  border="0" cellpadding="0" cellspacing="0">
							<tr>
                                     <td align="right">พ.ร.บ. : </td>
                                     <td>
                                         <select name="legislation_id" id="legislation_id" style="width:200px;">
                                         		<c:forEach items="${lePList}"  var="leP">
													<option value="${leP.id}" >${leP.legislation_name}</option>
												</c:forEach>
                                         </select>
                                     </td>
							</tr>
							<tr>
                                     <td align="right">ข้อกล่าวหา : </td>
                                     <td><INPUT TYPE="textguilt" name="GuiltBase" id="GuiltBase" size="30" value="${param.GuiltBase}" /></td>
							</tr>
							<tr>
							<td align="right">บทกำหนดโทษมาตรา : </td>
							<td>
							<input type="text"   name="low" size="30" id="low" value="${param.low}" />
							</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>
								<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">
								</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
						</table>

					</td>
				</tr>
			</table>
				</form>
		</td>
	</tr>
	<tr>
		<td colspan="2">


			<table class="tableList" border="0" cellpadding="0" cellspacing="0">

          
			</table>
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
			
<table class="tableList" border="0" cellpadding="0" cellspacing="0">

  <tr  align="left" valign="top">
						<td colspan="4"><%=pageUtil.getPagination()%></td><td align="right" colspan="2"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
<form method="post" name="dataform3" action="<c:url value="process?action=Indictment_pop&cmd=list"/>" >
		  	<tr>
					<td class="TblHeaderColumn aligncenter" width="10%">ลำดับ</td>
					<td class="TblHeaderColumn aligncenter" width="5%"> <input type="checkbox" name="allCheckbox" value="" onClick="Check(this,document.dataform3.thecheckbox);" />
					<INPUT TYPE="hidden" NAME="thecheckbox"></td>
					<td class="TblHeaderColumn aligncenter" width="10%">มาตรา<input type="hidden" id="case_law_id" name="case_law_id" value="" />
					<input type="hidden" id="indictment_id" name="indictment_id" value="" /></td>
					<td class="TblHeaderColumn aligncenter" width="10%">บทกำหนดโทษ<input type="hidden" id="law_id" name="law_id" value="" /></td>
					<td class="TblHeaderColumn aligncenter" width="55%">ข้อกล่าวหา<input type="hidden" id="guilt_base" name="guilt_base" value="" /></td>
                    <td class="TblHeaderColumn aligncenter" width="10%">ของกลางเถื่อน<INPUT TYPE="hidden" NAME="exhibit_wild" checked disabled  /></td>
			  </tr>

			 <c:forEach items="${Inditcment_List}"  var="indictment">
             <c:set var="Rows" value="${Rows + 1}" />
             <c:if test="${(Rows % 2) == 1}">

	<tr>
					<td class="TblRow aligncenter">${Rows+_rowIndex}</td>
					<td class="TblRow aligncenter" ><INPUT TYPE="checkbox" NAME="thecheckbox"></td>
					<td class="TblRow aligncenter">${indictment.case_law_id}<input type="hidden" id="case_law_id" name="case_law_id" value="${indictment.case_law_id}" />
					<input type="hidden" id="indictment_id" name="indictment_id" value="${indictment.indictment_id}" /></td>
					<td class="TblRow aligncenter">${indictment.penalty_case_law_id}<input type="hidden" id="law_id" name="law_id" value="${indictment.penalty_case_law_id}" /></td>
					<td class="TblRow">${indictment.guilt_base}<input type="hidden" id="guilt_base" name="guilt_base" value="${indictment.guilt_base}" /></td>
					<td class="TblRow aligncenter"><INPUT TYPE="checkbox" NAME="exhibit_wild" <c:if test="${indictment.exhibit_wild=='Y'}"> checked</c:if>  disabled  /></td>

				</tr>
			</c:if>
			<c:if test="${(Rows % 2) == 0}">
			<tr>
					<td class="TblRow aligncenter bgRowGray" >${Rows+_rowIndex}</td>
					<td class="TblRow aligncenter bgRowGray" ><INPUT TYPE="checkbox" NAME="thecheckbox"></td>
					<td class="TblRow aligncenter bgRowGray">${indictment.case_law_id}<input type="hidden" id="case_law_id" name="case_law_id" value="${indictment.case_law_id}" />
					<input type="hidden" id="indictment_id" name="indictment_id" value="${indictment.indictment_id}" /></td>
					<td class="TblRow aligncenter bgRowGray">${indictment.penalty_case_law_id}<input type="hidden" id="law_id" name="law_id" value="${indictment.penalty_case_law_id}" /></td>
					<td class="TblRow bgRowGray">${indictment.guilt_base}<input type="hidden" id="guilt_base" name="guilt_base" value="${indictment.guilt_base}" /></td>
					<td class="TblRow aligncenter bgRowGray"><INPUT TYPE="checkbox" NAME="exhibit_wild"  <c:if test="${indictment.exhibit_wild=='Y'}"> checked</c:if>  disabled  /></td>

				</tr>

			</c:if>
			</c:forEach>

			</table>
			</form>
		</td>
	</tr>
</table>
<script>
if(opener.document.dataform.legislation_id!=null){
document.dataform.legislation_id.value =  opener.document.dataform.legislation_id.value;
}
</script>
</BODY>
</HTML>
