<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script language="javascript">
function checkSelect(){
	if(document.getElementById("LawType").value == ""){
		alert("กรุณาเลือก พ.ร.บ");
	}else
		window.open('/XCS_illegal/process?action=Sendexhibit_pop&pap='+document.getElementById("LawType").value , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=yes,width=600,height=500');
}
</script>
<a href="javascript:checkSelect()">เพิ่มรายการ</a>
<table border="1">
	<tr>
		<td><select name="LawType" id="LawType" >
                 <option selected value="">เลือก</option>
                 <option value="1">พ.ร.บ.สุรา พ.ศ.2493</option>
                 <option value="2">พ.ร.บ.ยาสูบ พ.ศ.2509</option>
                 <option value="3">พ.ร.บ.ไพ่</option>
                 <option value="4">พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</option>
          </select>
		</td>
	</tr>
</table>