<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>

<script type="text/javascript" language="JavaScript" src="script/Popup.js" ></script>

<script type="text/javascript">



var incmaxrow=1; // jsp  Count  config
var incstartrow=2;
var inceditrow = -1;
var inceditna = 0;

function incinsRow(myTable,maxrox,data1,data2,data3,data4,id,data6)
{

var row;
var x=document.getElementById(myTable).insertRow(incmaxrow);
incmaxrow++;
row = incmaxrow - 1;
var y1=x.insertCell(0);
var y2=x.insertCell(1);
var y3=x.insertCell(2);
var y4=x.insertCell(3);
var y5=x.insertCell(4);


var exp = new Date();
var s = exp.getTime();

y1.innerHTML="<input  readonly class='textboxlist' size='1' name='tc_id' value='" + row + "' />"+"<input type=\"hidden\" name=\"aai_id\" value=\""+id+"\">";
y2.innerHTML="<input type=\"checkbox\" name=\"inccheckbox\" value=\"\"><input type=\"hidden\" name=\"incref_id\" value=\""+s+"\" />";
y3.innerHTML= data1+ "<input type=\"hidden\" name=\"aai_case_law_id\" value=\"" +data1+ "\">"
+ "<input type=\"hidden\" name=\"aai_indictment_id\" value=\"" +data6+ "\">" ;
y4.innerHTML=data2+"<input type=\"hidden\" id=\"aai_penalty_case_law_id\" name=\"aai_penalty_case_law_id\" value=\""+data2+"\">";
y5.innerHTML=data3+"<input type=\"hidden\" name=\"aai_guilt_base\" value=\""+data3+"\">"
+"<input type=\"hidden\" name=\"aai_exhibit_wild\" value=\""+data4+"\">";



}
function incdelRow(myTable)
{
if (incmaxrow>1)
{
var x=document.getElementById(myTable).deleteRow(myTable,incmaxrow-1);
incmaxrow--
}
}

function incalternate(id){
 if(document.getElementsByTagName){
   var table = document.getElementById(id);
   var rows = table.getElementsByTagName("tr");
   for(i = 0; i < rows.length; i++){
 //manipulate rows
     if(i % 2 == 0){
       rows[i].className = "even";
     }else{
       rows[i].className = "odd";
     }
   }
 }
}

function increrun_id()
{
if (!document.dataform.tc_id.length)
{
document.dataform.tc_id.value=1;
}
for (var i=0; i < document.dataform.tc_id.length; i++)
   {
		document.dataform.tc_id[i].value=i+1;
   }
}

function incdelRown(myTable,Rown)
{
var x=document.getElementById(myTable).deleteRow(Rown);
incmaxrow--
}
function incopenmodal(myTable)
{
var  dup=0;
var data = window.showModalDialog('process?action=Indictment_pop&cmd=add' , self , 'dialogWidth=700px,Height=400px');
if(data != null){
	{
		for (var i=0; i < data.length; i++)
		{
			dup=0;
				if (incmaxrow>1)
			{
				for (var j=0; j < document.dataform.aai_indictment_id.length; j++)
				{
					//alert (document.dataform.aai_indictment_id[j].value+ "-" +data[i][5]);
					if (document.dataform.aai_indictment_id[j].value==data[i][5])
						{dup=1;}
				}
			}
			if (dup==0)
	    	{incinsRow(myTable,incmaxrow,data[i][1],data[i][2],data[i][3],data[i][4],'',data[i][5]);}
	    }
	}
	}
}


function incget_check_value(myTable)
{
var c_value = "";
var x="";
if (!document.dataform.inccheckbox.length)
{
	document.getElementById(myTable).deleteRow(1);
}
for (var i=0; i < document.dataform.inccheckbox.length; i++)
   {

   if (document.dataform.inccheckbox[i].checked)
      {
     // c_value = c_value + document.dataform.check_list[i].value + "\n";
		document.getElementById(myTable).deleteRow(i);
		i--;
		incmaxrow--;
      }
   }
   //alert(incmaxrow-1);
   increrun_id();
}
function incrender(myTable)
{
 for (i=1;i<=incdata1.length-1;i++)
    {
        incinsRow(myTable,i,incdata1[i],incdata2[i],incdata3[i],incdata4[i],incdata5[i],incdata6[i]);
    }
}
var incdata1 =new Array();
var incdata2 =new Array();
var incdata3 =new Array();
var incdata4 =new Array();
var incdata5 =new Array();
var incdata6 =new Array();

function incCheck(chkcont,chk)
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

<table width="800" border="0" cellspacing="0" cellpadding="0" >
  <tr>
    <td width="20%" height="25" align="right" valign="top">ข้อกล่าวหา :&nbsp;</td>
    <td width="80%" colspan="3">
        <table class="tableList" id=incTable width="100%" border="0" cellspacing="0" cellpadding="0" >
             <tr class="TblHeaderColumn AlignCenter">
                  <td width="10%">ลำดับที่</td>
                  <td width="5%" ><input type="checkbox" name="incallCheckbox" value="" onClick="incCheck(this,document.dataform.inccheckbox);" />
					<INPUT TYPE="hidden" NAME="inccheckbox"></td>
                  <td width="20%">มาตรา</td>
                  <td width="15%">บทกำหนดโทษ</td>
                  <td width="50%">ข้อกล่าวหา</td>
             </tr>
			 <c:forEach items="${aailist}" var="inc" varStatus="i" >
		    <script>
			incdata1[${i.count}] = "${inc.case_law_id}" ;
			incdata2[${i.count}] = "${inc.penalty_case_law_id}" ;
			incdata3[${i.count}] = "${inc.guilt_base}" ;
			incdata4[${i.count}] = "${inc.exhibit_wild}" ;
			incdata5[${i.count}] = "${inc.id}";
			incdata6[${i.count}] = "${inc.indictment_id}";
			</script>
		</c:forEach>
        </table>

    </td>
   </tr>
   <tr>
      <td colspan="4" height="25" align="right">&nbsp;</td>
   </tr>
</table>
<script>
incrender('incTable');
</script>