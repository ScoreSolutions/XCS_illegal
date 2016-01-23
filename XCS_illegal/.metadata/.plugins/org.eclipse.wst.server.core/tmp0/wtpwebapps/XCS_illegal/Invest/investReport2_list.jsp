<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script LANGUAGE="JavaScript">

function clear2(){
	window.location.href="process?action=Invest";
}

function disableProduct(LID) {

	var mnu = document.getElementById(LID);
	//alert(mnu.value);
	if (mnu.value=="4")
		document.getElementById('cmbProduct').disabled=false;
	else{
		document.getElementById('cmbProduct').disabled=true;
		document.getElementById('cmbProduct').value = "";
	}

}

function btDelete(id){
	var answer = confirm ("ยืนยันการลบข้อมูล");
	if (answer){
		window.location.href="process?action=Invest&id="+id+"&cmd=delete";
	}
}
</script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="1%">&nbsp;</td>
		<td width="99%"><span class="websitename">รายงานการสืบสวน</span></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td height="30"><span class="spanLink"
			onClick="window.location.href='process?action=Invest&cmd=add';writeTranLog('เพิ่มข้อมูลรายงานการสืบสวน');" > เพิ่มข้อมูลใหม่</span>
			<br />
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>
		<form action="process?action=Invest&cmd=find" method="post"
			name="from1">
		<table width="800" border="0" cellpadding="0" cellspacing="0"
			bgcolor="#F5F5F5">
			<tr>
				<td>&nbsp;</td>
				<td align="left" valign="top"><span class="sectionname">ค้นหาข้อมูล</span></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td align="left" valign="top">&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr id="sp_row">
				<td>&nbsp;</td>
				<td align="center" valign="top">
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					id="sp_thai">
					<tr>
						<td width="20%" height="25" align="right">วันที่รายงาน
						:&nbsp;</td>
						<td width="30%" align="left" ><input type="Text" name="report_date_f"
							id="report_date_f" class="textdate" readonly size="7"
							maxlength="10" style="width:75;" value=${report_date_f}>
						<a href="javascript:NewCssCal('report_date_f','ddmmyyyy')"><img
							src="images/btn_calendar.png" alt="" width="19" height="19"
							align="middle" style="border-style: none"></a>&nbsp;&nbsp;&nbsp;ถึง
						:&nbsp; <input type="Text" name="report_date_t" id="report_date_t"
							class="textdate" readonly size="7" maxlength="10"
							style="width:75;" value=${report_date_t} ><a
							href="javascript:NewCssCal('report_date_t','ddmmyyyy')"><img
							src="images/btn_calendar.png" alt="" width="19" height="19"
							align="middle" style="border-style: none"></a></td>
						<td width="20%" height="25" align="right">คดีสืบสวนที่
						:&nbsp;</td>
						<td width="30%" align="left" ><input name="invest_no_f" type="text"
							class="textbox" size="7" maxlength="10" value=${invest_no_f }>
						&nbsp;&nbsp;&nbsp;ถึง :&nbsp; <input name="invest_no_t"
							type="text" class="textbox" size="7" maxlength="10"
							value=${invest_no_t}></td>
					</tr>
					<tr align="left"  >
						<td height="25" align="right">ชื่อผู้สืบสวน :&nbsp;</td>
						<td><input type="text" name="partial_name1" class="textbox"
							size="30" value="${partial_name1}" /></td>
						<td align="right">ชื่อผู้สั่งการ :&nbsp;</td>
						<td><input type="text" name="partial_name2" class="textbox"
							size="26" value="${partial_name2}" /></td>
					</tr>
					<tr align="left" >
						<td height="25" align="right">คดี พ.ร.บ. :&nbsp;</td>
						<!-- style="width:200" OnChange="selectLegislation('cmbLegislation');"> -->
						<td><select name="legislation_id" id="cmbLegislation"
							style="width:200" OnChange="disableProduct('cmbLegislation');">
							<option value="" >ทั้งหมด</option>
							<c:forEach items="${lglist}" var="lg">
								<option value="${lg.id}"
									<c:if test="${lg.id==lgselect}"> selected </c:if>>${lg.legislation_name}</option>
							</c:forEach>
						</select></td>
						<td align="right">สินค้า :&nbsp;</td>
						<td><select name="product_group_id" id="cmbProduct"
							style="width:200" disabled="disabled">
							<option value="" >ทั้งหมด</option>
							<c:forEach items="${dtlist}" var="dt">
								<option value="${dt.group_id}"
									<c:if test="${dt.group_id==dtselect}"> selected </c:if>>${dt.group_name}</option>
							</c:forEach>
						</select></td>
					</tr>
					<tr align="left" >
						<td height="25" align="right">หน่วยงาน :&nbsp;</td>
						<td><select name="offcode_invest" id="offcode_invest" <c:if test="${IsAdmin == '0'}">disabled</c:if>
							style="width:250px;">
							<option value="">ทั้งหมด</option>
							<c:forEach items="${edlist}" var="ed">
								<option value="${ed.offcode}"
									<c:if test="${ed.offcode==offcodeselect}"> selected </c:if>>${ed.short_name}</option>
							</c:forEach>
						</select></td>

					</tr>
					<tr align="left" >
						<td height="25" align="right">มาตรความเชื่อมั่นของแหล่งข่าว
						:&nbsp;</td>
						<td colspan="3"><select name="confidence_gauge" id=""
							style="width:400" OnChange="selectLegislation('cmbLegislation');">
							<option value="" selected>ทั้งหมด</option>
							<option value="A"
								<c:if test="${conselect=='A'}"> selected </c:if>>A
							ที่ผ่านมาเชื่อมั่นได้อย่างสมบูรณ์</option>
							<option value="B"
								<c:if test="${conselect=='B'}"> selected </c:if>>B
							ที่ผ่านมาเชื่อถือได้เป็นส่วนใหญ่</option>
							<option value="C"
								<c:if test="${conselect=='C'}"> selected </c:if>>C
							ที่ผ่านมาเชื่อถือไม่ได้เป็นส่วนใหญ่</option>
							<option value="X"
								<c:if test="${conselect=='X'}"> selected </c:if>>X
							ไม่สามารถตัดสินได้</option>
						</select></td>
					</tr>
					<tr align="left" >
						<td align="right">ค่าของเนื้อข่าว :&nbsp;</td>
						<td colspan="3" ><select name="news_value" id=""
							style="width:400">
							<option value="" selected>ทั้งหมด</option>
							<option value="1"
								<c:if test="${newsselect=='1'}"> selected </c:if>>1
							รู้ว่าเป็นความจริงโดยปราศจากข้อสงสัย</option>
							<option value="2"
								<c:if test="${newsselect=='2'}"> selected </c:if>>2
							ข่าว เป็นที่รู้จากแหล่งแต่ยังไม่ได้รายงานให้เจ้าหน้าที่</option>
							<option value="3"
								<c:if test="${newsselect=='3'}"> selected </c:if>>3
							ข่าวไม่เป็นที่รู้จักจากแหล่งแต่รู้มาจากผู้อื่นและได้มีการบันทึกไว้แล้ว
							</option>
							<option value="4"
								<c:if test="${newsselect=='4'}"> selected </c:if>>4
							ไม่สามารถตัดสินได้</option>
						</select></td>
					</tr>
				</table>

				</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td height="40" align="center" valign="bottom"><input id="btSearch" 
					type="image" src="images/btn_search_big.png" width="64" height="22"
					value="Submit" alt="Submit" onclick="writeTranLog('ค้นหางานการสืบสวน')" ><%@ include file="../Templates/clearIcon.jsp"%></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="left" valign="bottom" height="10"></td>
				<td></td>
				<td align="right" valign="bottom"></td>
			</tr>
		</table>
		</form>
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>


		<table width="100%" border="0" cellpadding="0" cellspacing="0"
			class="tablelist">
		

			<tr  align="left" valign="top">
<td colspan="7"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>


			<tr class="TblHeaderColumn AlignCenter">
				<td width="3%">ลำดับ</td>
				<td width="7%">คดีสืบสวนที่</td>
				<td width="5%">วันที่</td>
				<td width="5%">แบบสส.1 ครั้งที่</td>
				<td width="12%">ผู้สืบสวน</td>
				<td width="15%">คดี พ.ร.บ.(สินค้า)</td>
				<td width="11%">สืบสวนวันที่</td>
				<td width="25%">สถานที่ทำการสืบสวน</td>
				<td width="12%">ผู้สั่งการ</td>
				<td>หน่วยงาน</td>
				<td width="5%">&nbsp;</td>
			</tr>
			<c:forEach items="${aimap}"  var="ai" varStatus="i">
			<tr>
				<td width="3%" align="center">${i.count+_rowIndex}</td>
				<td width="7%"><a href="process?action=Invest&cmd=view&id=${ai.id}" onclick=writeTranLog('แสดงรายละเอียดรายงานการสืบสวน') >${ai.invest_no}</a></td>
				<td width="5%">${ai.report_date2 }</td>
				<td width="5%" align="center" >${ai.invest_qty }</td>
				<td width="12%">${ai.staff_name_invest }</td>
				<td width="15%">${ai.legislation_name }</td>
				<td width="11%">${ai.invest_date }</td>
				<td width="25%">${ai.invest_address }</td>
				<td width="12%">${ai.staff_name_command }</td>
				<td>${ai.short_name}</td>
				<td width="5%">&nbsp;
					<img src="images/icon_delete.gif" title="ลบรายการ" style="cursor:hand" onclick = "return btDelete('${ai.id}');" ></img>
				</td>
			</tr>
			</c:forEach>
		</table>
		</td>
	</tr>
</table>




