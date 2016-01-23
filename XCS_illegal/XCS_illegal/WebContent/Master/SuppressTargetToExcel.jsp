<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%
response.setContentType("application/vnd.ms-excel");
response.setCharacterEncoding("UTF-8");
response.setHeader("Content-Disposition", "inline; filename=\"test.xls\"");
response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
%>
<html>
<head>
</head>
<body>
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">

              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%">
					<span class="websitename">กำหนดเป้าปราบปราม</span>
				 </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="15">&nbsp;</td>
              </tr>
			  <tr>
				<td >&nbsp;</td>
			  </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="25">&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
						<table border="0" cellpadding="0" cellspacing="0" width="1000">
							<tr>
                				<td width="20%" align="right">ปีงบประมาณ :&nbsp;</td>
                				<td width="50%">
                					${suppresstarget.budget_year} &nbsp;&nbsp; ครั้งที่ : ${suppresstarget.qty}
                				</td>
							</tr>
							<tr>
								<td align="right">หน่วยงาน :&nbsp;</td>
								<td height="40" >
								   ${suppresstarget.offcode}&nbsp;&nbsp;
								   ${suppresstarget.offname}
								</td>
                			</tr>

							<tr>
                				<td align="right">พ.ร.บ. :&nbsp;</td>
                				<td >${suppressTargetItemHeader.legislation_name}</td>
                			</tr>
                			<tr>
								<td align="right" >สินค้า :&nbsp;</td>
								<td height="25">${suppressTargetItemHeader.group_name}</td>
                			</tr>
                			<tr>
                			    <td align="right" >ข้อมูล ณ วันที่ :&nbsp;</td>
                			    <td align="left">
                			    	<fmt:formatDate value='${suppresstarget.job_date}' pattern='dd/MM/yyyy'/>
                			    </td>
								
                			</tr>
							<tr><td colspan="4" align="center">&nbsp;</td></tr>
                		</table>
					</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
					<table class="tableList"  width="2240"   border="1" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
						 <tr class="TblHeaderColumn">
							  <td width="150" rowspan="3">ประเภทเป้าหมาย</td>
							  <td  rowspan="2" colspan="2" align="center" >รวมทุกเดือน</td>
							  <td colspan="24">&nbsp;</td>
						</tr>
						 <tr class="TblHeaderColumn">
							  <td colspan="2" >ตค.</td>
							  <td colspan="2" >พย.</td>
							  <td colspan="2" >ธค.</td>
							  <td colspan="2" >มค.</td>
							  <td colspan="2" >กพ.</td>
							  <td colspan="2" >มีค.</td>
							  <td colspan="2" >เมย.</td>
							  <td colspan="2" >พค.</td>
							  <td colspan="2" >มิย.</td>
							  <td colspan="2" >กค.</td>
							  <td colspan="2" >สค.</td>
							  <td colspan="2" >กย.</td>
						</tr>
						 <tr class="TblHeaderColumn">
							  <td width="90" >จำนวนดคี(ราย)</td>
							  <td width="80" >ค่าปรับ(บาท)</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
							  <td width="60">จำนวน<br />คดี</td>
							  <td width="100">ค่าปรับ</td>
						</tr>
						
						<c:forEach var="suppressTargetItem" items="${suppresstarget.suppress_items}" varStatus="i">
							<c:if test="${suppressTargetItem.target_type == 1}">
						<tr class="TblRow">
						  <td >เปรียบเทียบปรับ</td>
						  <td Align="right">
						    <fmt:formatNumber type='number' value= '${suppressTargetItem.qty_10+suppressTargetItem.qty_11+suppressTargetItem.qty_12+suppressTargetItem.qty_01+suppressTargetItem.qty_02+suppressTargetItem.qty_03+suppressTargetItem.qty_04+suppressTargetItem.qty_05+suppressTargetItem.qty_06+suppressTargetItem.qty_07+suppressTargetItem.qty_08+suppressTargetItem.qty_09}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_10+suppressTargetItem.fine_11+suppressTargetItem.fine_12+suppressTargetItem.fine_01+suppressTargetItem.fine_02+suppressTargetItem.fine_03+suppressTargetItem.fine_04+suppressTargetItem.fine_05+suppressTargetItem.fine_06+suppressTargetItem.fine_07+suppressTargetItem.fine_08+suppressTargetItem.fine_09}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_10}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_10}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_11}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_11}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						    <fmt:formatNumber type='number' value='${suppressTargetItem.qty_12}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_12}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_01}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_01}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_02}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_02}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_03}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_03}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_04}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_04}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_05}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_05}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_06}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_06}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_07}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_07}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_08}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_08}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_09}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_09}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						</tr>
						</c:if>
						<c:if test="${suppressTargetItem.target_type == 2}">
						<tr class="TblRow bgRowGray">
						  <td>ฟ้องศาล</td>
						  <td Align="right">
						    <fmt:formatNumber type='number'   value= '${suppressTargetItem.qty_10+suppressTargetItem.qty_11+suppressTargetItem.qty_12+suppressTargetItem.qty_01+suppressTargetItem.qty_02+suppressTargetItem.qty_03+suppressTargetItem.qty_04+suppressTargetItem.qty_05+suppressTargetItem.qty_06+suppressTargetItem.qty_07+suppressTargetItem.qty_08+suppressTargetItem.qty_09}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						     <fmt:formatNumber type='number' value='${suppressTargetItem.fine_10+suppressTargetItem.fine_11+suppressTargetItem.fine_12+suppressTargetItem.fine_01+suppressTargetItem.fine_02+suppressTargetItem.fine_03+suppressTargetItem.fine_04+suppressTargetItem.fine_05+suppressTargetItem.fine_06+suppressTargetItem.fine_07+suppressTargetItem.fine_08+suppressTargetItem.fine_09}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_10}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_10}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_11}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_11}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_12}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_12}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_01}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_01}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_02}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_02}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_03}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_03}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_04}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_04}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_05}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_05}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_06}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_06}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_07}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_07}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_08}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_08}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_09}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_09}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						</tr>
						</c:if>
						<c:if test="${suppressTargetItem.target_type == 3}">
						<tr class="TblRow">
						  <td >ไม่มีตัวผู้ต้องหา</td>
						  <td Align="right">
						    <fmt:formatNumber type='number'   value= '${suppressTargetItem.qty_10+suppressTargetItem.qty_11+suppressTargetItem.qty_12+suppressTargetItem.qty_01+suppressTargetItem.qty_02+suppressTargetItem.qty_03+suppressTargetItem.qty_04+suppressTargetItem.qty_05+suppressTargetItem.qty_06+suppressTargetItem.qty_07+suppressTargetItem.qty_08+suppressTargetItem.qty_09}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						    <fmt:formatNumber type='number' value='${suppressTargetItem.fine_10+suppressTargetItem.fine_11+suppressTargetItem.fine_12+suppressTargetItem.fine_01+suppressTargetItem.fine_02+suppressTargetItem.fine_03+suppressTargetItem.fine_04+suppressTargetItem.fine_05+suppressTargetItem.fine_06+suppressTargetItem.fine_07+suppressTargetItem.fine_08+suppressTargetItem.fine_09}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_10}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_01}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_11}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_11}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_12}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_12}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_01}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_01}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_02}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_02}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_03}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_03}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_04}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_04}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_05}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_05}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_06}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_06}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_07}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_07}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_08}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_08}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.qty_09}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItem.fine_09}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						</tr>
						</c:if>	     				
						</c:forEach>
						<c:forEach var="suppressTargetItemSum" items="${suppressTargetItemSum}" varStatus="i">
						<tr >
						  <td align="center" >ยอดรวม</td>
						  <td Align="right">
						    <fmt:formatNumber type='number' value= '${suppressTargetItemSum.total_qty}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.total_fine}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_10}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_10}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_11}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_11}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						    <fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_12}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_12}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_01}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_01}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_02}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_02}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_03}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_03}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_04}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_04}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_05}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_05}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_06}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_06}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_07}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_07}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_08}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_08}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.qty_09}' minFractionDigits='0' maxFractionDigits='0'/>
						  </td>
						  <td Align="right">
						  	<fmt:formatNumber type='number' value='${suppressTargetItemSum.fine_09}' minFractionDigits='2' maxFractionDigits='2'/>
						  </td>
						</tr>
						</c:forEach>				       	   
					 </table>
				</td>
              </tr>
            </table></td>
		  </tr>
		</table>
</body>
</html>