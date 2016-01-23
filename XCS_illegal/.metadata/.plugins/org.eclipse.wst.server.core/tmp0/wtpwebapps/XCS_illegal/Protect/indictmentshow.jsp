<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript" language="JavaScript" src="script/Popup.js" ></script>
<script type="text/javascript">
function createRow(tableName, list_Data,list_DataName){
	var list = [];
	for (var i in list_Data) {
		  //document.writeln(i);
		 var object = list_Data[i];
		 var data = [];
		 data["CASE_LAW_ID"] = object.CASE_LAW_ID;
		 data["GUILT_BASE"]  = object.GUILT_BASE;
		 list[i]=data;
		 //eval(document.writeln(object+"."+list_DataName[0]));
		 //alert(object+"."+list_DataName[1]);
		 //eval(document.writeln("object.CASE_LAW_ID"));
		 alert("มาตรา = "+object.CASE_LAW_ID);
		 }
	document.writeln("list = "+list);
	for (var i in list) {
		if(list[i] !=null){
		 var object2 = list[i];
		 alert("มาตร2 = "+object2["CASE_LAW_ID"]);
		}
	}
}
function openPopup()
{
var listPopupObject = openPopupDialog('Popup/arrest_indictment_form.jsp?varPopupName=&varLegislationID=&varDisableLegislation=N&varItemPerPage=20&varSearch=Y' ,'', 'dialogWidth:650px,dialogHeight:350px,top=220,left=450,menubar=no,toorlbar=no,location=no,scrollbars=no,modal=yes');

alert(listPopupObject);

var str = getSerializeObject("CASE_LAW_ID","GUILT_BASE");
alert(str);



var list_Value=new Array("CASE_LAW_ID","GUILT_BASE");
//createRow("",listPopupObject,list_Value);


 for (var i in listPopupObject) {
	  //document.writeln(i);
	  var object = listPopupObject[i];
	  for (var key in object ) {
		  document.writeln("key = "+key); // จะเห็นว่าค่า n จะวนลูป Key
		  document.writeln("<br/>");
		  document.writeln(" "+key+"="+object[key]); // จะเห็นว่าจะได้ค่า Key เข้าไปอ้าง Propety ได้
		  document.writeln("<br/>");
		  }

	  document.writeln("<br/>");
	 // document.writeln("มาตรา = "+object.CASE_LAW_ID);
	  document.writeln("<br/>");
	 }

}

</script>

<table width="800" border="0" cellspacing="0" cellpadding="0" >
  <tr>
    <td width="20%" height="25" align="right" valign="top">ข้อกล่าวหา :&nbsp;</td>
    <td width="80%" colspan="3">
        <table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" >
             <tr class="TblHeaderColumn AlignCenter">
                  <td width="10%">ลำดับที่</td>
                  <td width="10%" ><input type="checkbox" name="checkbox" value="checkbox" ></td>
                  <td width="10%">มาตรา</td>
                  <td width="10%">บทกำหนดโทษ</td>
                  <td width="60%">ข้อกล่าวหา</td>
             </tr>
			 <c:forEach items="${inclist}" var="inc" varStatus="i" >
		             <tr class="TblRow">
		                  <td class="TblRow AlignCenter">${i.count}</td>
		                  <td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox" ></td>
		                  <td class="TblRow">${inc.case_law_id}<input type="hidden" name="case_law_id" value="${inc.case_law_id}" ></td>
		                  <td class="TblRow">${inc.penalty_case_law_id} <input type="hidden" name="penalty_case_law_id" value="${inc.penalty_case_law_id}" ></td>
		                  <td class="TblRow">
		                  <input type="hidden" name="guilt_base" value="${inc.guilt_base}" > ${inc.guilt_base}</td>
		             </tr>
		</c:forEach>
        </table>
			<!--	  onClick="window.open('Popup/arrest_indictment_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=350,top=220,left=450,modal=yes');">
			-->
				<span class="spanLink" onClick="openPopup();">
			 เพิ่มรายการ
			</span> |
			<span class="spanLink">ลบรายการ</span>

    </td>
   </tr>
   <tr>
      <td colspan="4" height="25" align="right">&nbsp;</td>
   </tr>
</table>