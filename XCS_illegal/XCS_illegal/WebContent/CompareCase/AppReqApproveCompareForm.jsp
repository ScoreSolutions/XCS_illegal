<%@ page import="java.util.Date" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type="text/javascript">

    function doCancel(flag){
        if(flag){
            writeTranLog('ยกเลิกการแก้ไขข้อมูลรายงานการขออนุมัติการเปรียบเทียบคดี');
        }
        location.href = 'process?action=AppReqApproveCompare&cmd=edit&id=${aac.id}';
    }
    function doBack2Search(flag){
        if(flag){
            writeTranLog('กลับหน้าค้นหา');
        }
        location.href = 'process?action=AppReqApproveCompare&cmd=list';
    }
    function checkReport(){
        var t ='${totalFine}';
        
        printReports('ILL_P034&getTrackNo='+document.form1.track_no.value);

        if(parseFloat(t) <= 100000.0){
        	printReports('ILL_P034_1&getAppoveid='+document.form1.arf1_id.value);
        }
        if((parseFloat(t) > 100000.0) && (parseFloat(t) <= 1000000.0)){
        	printReports('ILL_P034_2&getAppoveid='+document.form1.arf2_id.value);
        }
        if(parseFloat(t) > 1000000.0){
        	printReports('ILL_P034_3&getAppoveid='+document.form1.arf3_id.value);
        }
        
    }
</script>
<form action="process?action=AppReqApproveCompare&cmd=update"   method="post" name="form1" id="form1">
<c:if test="${aac.id != null}">
    <input type="hidden" name="id" value="${aac.id}"/>
</c:if>
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td width="100%" align="left" valign="top">
<table width="100" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td width="1%">&nbsp;</td>
    <td width="99%"><span class="websitename">รายงานขออนุมัติการเปรียบเทียบคดี</span></td>
</tr>
<tr>
    <td height="25">&nbsp;</td>
    <td>
        <input name="btnSave" type="submit" class="barbutton" value="บันทึก">
        <input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="doCancel('yes');">
        <input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="doBack2Search('yes');">
        <c:if test="${aac.id != null}">
        	<input name="btnPrint" type="button" class="barbutton" value="พิมพ์" onClick="checkReport();">
        </c:if>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>
<table width="1000" border="0" cellpadding="0" cellspacing="0">
<tr>
    <td width="20%" align="right">เลขที่การขออนุมัติ :&nbsp;</td>
    <td width="30%"><input name="track_no" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" value="${aac.track_no}" size="20"/></td>
    <td width="20%" align="right">วันที่ :&nbsp;</td>
    <td width="30%">
        <c:if test="${aac.req_date != null}">
        <input name="req_date" type="text" class="textdate" OnKeyPress="window.event.keyCode = 0"
               value="${aac.req_date2}" size="10" />
        </c:if>
        <c:if test="${aac.req_date == null}">
            <input name="req_date" type="text" class="textdate"  OnKeyPress="window.event.keyCode = 0"
               value="<fmt:formatDate value='<%=new Date()%>' pattern='dd/MM/yyyy' />" size="10" />
        </c:if>
    </td>
</tr>
<tr>
    <td height="25" align="right">สำนักงาน :&nbsp;</td>
    <td colspan="3">
         <input OnKeyPress="window.event.keyCode = 0" type="text" class="textview" value="${aac.offname}" name="offname" id="aac_offcode" size="55" />
         <input type="hidden" value="${aac.offcode }" name="offcode"></input>
    </td>
</tr>
<tr>
    <td height="25" align="right">พ.ร.บ. :&nbsp;</td>
    <td colspan="3">
        <input  type="text" class="textview"  OnKeyPress="window.event.keyCode = 0" value="${aac.legislation_name}" name="aac_legislation_id" id="${aac.legislation_id}"  size="55" />
    </td>
</tr>
<tr>
    <td align="right">เลขคดีเปรียบเทียบที่ :&nbsp;</td>
    <td>
        <input type="hidden" name="compare_case_id" value="${aac.ccid}"  />
        <input type="Text" name="SuspectDetail22" id="SuspectDetail22" class="textview" value="${aac.compare_case_no}" OnKeyPress="window.event.keyCode = 0" size="55" />
    </td>
    <td align="right">วันที่ชำระ :&nbsp;</td>
    <td>
        <input name="theDate5" type="text" class="textdate" size="10"  OnKeyPress="window.event.keyCode = 0"
        value="${aac.pay_date2}"  />
    </td>
</tr>
<tr><td colspan="4">&nbsp;</td></tr>
<tr>
    <td height="22" align="right" valign="top">รายชื่อผู้ต้องหา :&nbsp;</td>
    <td colspan="3">
        <table class="tableList" width="600" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
            <tr>
                <td width="10%" class="TblHeaderColumn AlignCenter" >ลำดับที่</td>
                <td  class="TblHeaderColumn AlignCenter">ชื่อ-สกุล</td>
                <td width="30%" class="TblHeaderColumn AlignCenter">อาชีพ</td>
                <td width="20%" class="TblHeaderColumn AlignCenter">สัญชาติ</td>
            </tr>
            <c:forEach varStatus="i" var="aal" items="${aals}">
                <tr class="${i.count%2==0?'even_gray':'odd_gray'}">
                    <td class="TblRow AlignCenter">${i.count}</td>
                    <td align="left" valign="top" class="TblRow AlignLeft">${aal.lawbreaker_full_name}</td>
                    <td align="left" valign="top" class="TblRow AlignLeft">${aal.career}</td>
                    <td align="left" valign="top" class="TblRow AlignLeft">${aal.nationality_name}</td>
                </tr>
            </c:forEach>
        </table>
    </td>
</tr>
<tr>
    <td height="20" colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right" valign="top">รายการของกลาง :&nbsp;</td>
    <td colspan="3">
        <table class="tableList" width="600" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="10%" height="15" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                <td class="TblHeaderColumn AlignCenter">ชื่อสินค้า</td>
                <td width="20%" class="TblHeaderColumn AlignCenter">ยี่ห้อ</td>
                <td width="10%" class="TblHeaderColumn AlignCenter">ขนาด</td>
                <td width="10%" class="TblHeaderColumn AlignCenter">จำนวน</td>
                <td width="15%" class="TblHeaderColumn AlignCenter">ปริมาณสุทธิ</td>
            </tr>
            <c:forEach items="${aahs}" var="aae" varStatus="i">
                <tr class="${i.count%2==0?'even_gray':'odd_gray'}">
                    <td class="TblRow AlignCenter">${i.count}</td>
                    <td class="TblRow ">${aae.product_name}</td>
                    <td class="TblRow ">${aae.brand_name}</td>
                    <td class="TblRow AlignCenter">${aae.size_desc} ${aae.size_unit}</td>
                    <td class="TblRow AlignLeft">${aae.qty} ${aae.qty_unit}</td>
                    <td class="TblRow AlignLeft">${aae.netweight} ${aae.netweight_unit}</td>
                </tr>
            </c:forEach>
        </table>
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right">ชื่อยานพาหนะ :&nbsp;</td>
    <td align="left">
        <input type="Text" name="vehicle_name" id="vehicle_name" size="30" class="textbox" value="${aac.vehicle_name}"/>
    </td>
    <td align="right">หมายเลขเครื่อง :&nbsp;</td>
    <td>
        <input type="Text" name="engine_no" id="engine_no" size="30" class="textbox" value="${aac.engine_no}"/>
    </td>
</tr>
<tr>
    <td align="right">หมายเลขตัวถัง :&nbsp;</td>
    <td align="left">
        <input type="Text" name="body_no" id="body_no" size="30" class="textbox" value="${aac.body_no}"/>
    </td>
    <td align="right">ระวางบรรทุก :&nbsp;<br/> (* กรณีเป็นเรือบรรทุก)</td>
    <td>
        <input type="Text" name="hold_ship" id="hold_ship" size="20" class="textNum" onkeypress="ChkMinusInt(this)" value="${aac.hold_ship}"/> ตัน
    </td>
</tr>
<tr>
    <td align="right">ชื่อผู้ถือกรรมสิทธิ์ :&nbsp;</td>
    <td colspan="3" align="left">
        <input type="Text" name="ownership" id="ownership" size="30" class="textbox" value="${aac.ownership}"/>
    </td>
</tr>
<tr>
    <td align="right">ชื่อผู้เช่า/เช่าซื้อ :&nbsp;</td>
    <td>
        <input type="Text" name="rent_name" id="rent_name" size="30" class="textbox" value="${aac.rent_name}"/>
    </td>
    <td align="right">สัญญา :&nbsp;</td>
    <td><input type="Text" size="30" class="textbox" name="contract" id="contract" value="${aac.contract}"/></td>
</tr>
<tr>
    <td align="right">เลขที่สัญญา :&nbsp;</td>
    <td>
        <input type="Text" size="30" class="textbox" name="contract_no" id="contract_no" value="${aac.contract_no}"/>
    </td>
    <td align="right">ลงวันที่ :&nbsp;</td>
    <td>
        <input name="contract_date" id="contract_date" type="text" class="textdate" size="10" OnKeyPress="window.event.keyCode = 0"
               value="${aac.contract_date}" />
        <img onClick="javascript:NewCssCal('contract_date','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" border="0">
    </td>
</tr>
<tr>
    <td align="right">ผู้กระทำผิดเป็น :&nbsp;</td>
    <td colspan="3" align="left">
        <input type="radio" name="islawbreakerrent" id="islawbreakerrent1"
               value="0" ${aac.islawbreakerrent == 0?'checked':''}/>ผู้เช่า &nbsp;&nbsp;&nbsp;
        <input type="radio" name="islawbreakerrent" id="islawbreakerrent2"
               value="1" ${aac.islawbreakerrent == 1?'checked':''}/>ผู้เช่าซื้อ &nbsp;&nbsp;&nbsp;
        <c:if test="${aac.islawbreakerrent != null}">
        <input type="radio" name="islawbreakerrent" id="islawbreakerrent3"
               value="2" ${aac.islawbreakerrent == 2?'checked':''}/>ไม่เป็นทั้งผู้เช่าและผู้ซื้อ
        </c:if>
        <c:if test="${aac.islawbreakerrent == null}">
        <input type="radio" name="islawbreakerrent" id="islawbreakerrent3"
               value="2" checked />ไม่เป็นทั้งผู้เช่าและผู้ซื้อ
        </c:if>
    </td>
</tr>
<tr>
    <td height="22" align="right" valign="top">ผู้กระทำผิด :&nbsp;</td>
    <td colspan="3">
        <table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
            <tr>
                <td class="TblHeaderColumn aligncenter">ลำดับที่</td>
                <td class="TblHeaderColumn">ชื่อ-สกุล</td>
                <td class="TblHeaderColumn">เคยกระทำผิด</td>
                <td class="TblHeaderColumn">ความผิดครั้งก่อน / บทลงโทษที่ได้รับ</td>
            </tr>
            <c:forEach items="${aals}" var="aal" varStatus="i">
                <tr class="${i.count%2==0?'even_gray':'odd_gray'}">
                    <td class="TblRow AlignCenter">${i.count}</td>
                    <td align="left" valign="top" class="TblRow AlignLeft">${aal.lawbreaker_full_name}</td>
                    <td align="left" valign="top" class="TblRow AlignCenter">
                    	<input type="checkbox" name="ismistake_${aal.id}" ${(aal.ismistake=='Y') ? 'checked' : ''} />
                    </td>
                    <td align="left" valign="top" class="TblRow AlignLeft">
                        <input type="text" class="textbox" name="ismistake_desc_${aal.id}" size="40" value="${aal.ismistake_desc}"></td>
                </tr>
            </c:forEach>
        </table>
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ข้อเท็จจริงเกี่ยวกับความผิดโดยละเอียด จากบันทึกการจับกุมของเจ้าพนักงานผู้จับ :&nbsp;
    </td>
</tr>
<tr>
    <td align="right">&nbsp;</td>
    <td colspan="3" align="left">
        <textarea cols="80" rows="5" name="mistake_detail">${aac.mistake_detail}</textarea>
    </td>
</tr>
<tr>
    <td align="right">ผิดกฎหมายมาตรา :&nbsp;</td>
    <td align="left"><input type="text" class="textView" OnKeyPress="window.event.keyCode = 0" size="15" value="${aac.case_law_id}"></td>
    <td align="right">แห่งพระราชบัญญัติ :&nbsp;</td>
    <td><input type="text" class="textView" size="35" OnKeyPress="window.event.keyCode = 0" value="${aac.legislation_name}"></td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        เหตุผลที่ควรเปรียบเทียบคดี และ/หรือจัดการกับของกลาง :&nbsp;
    </td>
</tr>
<tr>
    <td align="right">&nbsp;</td>
    <td colspan="3" align="left">
        <textarea cols="80" rows="5" name="compare_reason">${aac.compare_reason}</textarea>
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right">เจ้าหน้าที่ดำเนินคดี :&nbsp;</td>
    <td>
        <input type="text" name="textfield12" class="textview" size="31" value="${aac.sue_name}">
    </td>
    <td align="right">ตำแหน่ง :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="textfield12" class="textview" size="35" value="${aac.sue_posname}">
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<c:choose>
<c:when test="${totalFine <= 100000.0}">
    <!-- แบบขออนุมัติ 1-->
    <c:if test="${arf1 != null}">
        <input type="hidden" name="arf1_id" id="arf1_id" value="${arf1.id}"/>
    </c:if>
    <tbody id="approve1">
    <tr>
        <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <b>แบบขออนุมัติ 1</b>&nbsp;
            <font color="red" size="1" style="font-style:italic">(กรณีเป็นอำนาจเปรียบเทียบของ นิติกร 8 ว ส่วนคดี
                สกม./จบ.สส.7 ฝ่ายกฎหมาย สสพ/สรรพสามิตพื้นที่สาขา////แสดงเมื่อเลือกคดีที่มีค่าปรับรวมไม่เกิน 1แสนบาท)</font>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td align="right">เรียน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="arf1_inform_to" class="textbox" size="100" value="${arf1.inform_to}"  >
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td align="right">เพื่อ :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="arf1_inform_for" class="textbox" size="100" value="${arf1.inform_for}">
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td>
            <input name="arf1_staff_inform_name" type="text" class="textreadonly" size="30" id="arf1_staff_inform_name" OnKeyPress="window.event.keyCode = 0" value="${sta1.staff_inform_name}" style="float:left"/>
	        <input type="hidden" id="arf1_staff_id_inform" name="arf1_staff_id_inform" value="${arf1.staff_id_inform}">
	        <input type="hidden" id="arf1_poscode_inform" name="arf1_poscode_inform" value="${arf1.poscode_inform}">
	        <input type="hidden" id="arf1_offcode_inform" name="arf1_offcode_inform" value="${arf1.offcode_inform}">
	        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
	             onClick="window.open('process?action=Divide_staff_pop&posname=arf1_posname_inform&offcode=arf1_offcode_inform&poscode=arf1_poscode_inform&formname=arf1_staff_inform_name&id=arf1_staff_id_inform' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
	        <font style="color:red">*</font>    
        </td>
        <td align="right">วันที่ :&nbsp;</td>
        <td>
            <input name="arf1_inform_date" id="arf1_inform_date" type="text" class="textdate" size="10" maxlength="10"
               value="<fmt:formatDate value='${arf1.inform_date}'  pattern='dd/MM/yyyy'/>"/>
        <a href="javascript:NewCssCal('arf1_inform_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19"
                                                                        height="19" border="0"></a>
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td colspan="3">
            <input name="arf1_posname_inform" id="arf1_posname_inform" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta1.posname_inform}"/>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <b>ความเห็นของ นิติกร 8 ส่วนคดี สกม./สรรพสามิตพื้นที่</b>&nbsp;
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="arf1_isaccept" value="Y" ${(arf1.isaccept!='N')?'checked':''}
                   OnClick="
                                     document.getElementById('arf1_accept_desc').disabled=false;
                                     document.getElementById('arf1_noneaccept_desc').disabled=true;
                                     document.getElementById('arf1_noneaccept_desc').value='';
                                     "
                    > เห็นชอบ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="arf1_accept_desc" name="arf1_accept_desc" type="text" class="textbox" size="50" value="${arf1.accept_desc}" ${arf1.isaccept!='N'?'':'disabled'} style="display:none;" />
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3">
            <INPUT TYPE="radio" NAME="arf1_isaccept"  value="N" ${arf1.isaccept=='N'?'checked':''}
                   OnClick="
                                     document.getElementById('arf1_accept_desc').disabled=true;
                                     document.getElementById('arf1_noneaccept_desc').disabled=false;
                                     document.getElementById('arf1_accept_desc').value='';
                               "> ไม่เห็นชอบ
            <input id="arf1_noneaccept_desc" name="arf1_noneaccept_desc" type="text" class="textbox" size="50" value="${arf1.noneaccept_desc}" ${arf1.isaccept=='N'?'':'disabled'}/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td colspan="3">
           <input name="staff_accept_name" type="text" class="textreadonly" OnKeyPress="window.event.keyCode = 0" size="30" id="staff_accept_name" value="${sta1.staff_accept_name}"
               style="float:left"/>
        <input type="hidden" id="arf1_staff_id_accept" name="arf1_staff_id_accept" value="${arf1.staff_id_accept}">
        <input type="hidden" id="arf1_poscode_accept" name="arf1_poscode_accept" value="${arf1.poscode_accept}">
        <input type="hidden" id="arf1_offcode_accept" name="arf1_offcode_accept" value="${arf1.offcode_accept}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf1_posname_accept&offcode=arf1_offcode_accept&poscode=arf1_poscode_accept&formname=staff_accept_name&id=arf1_staff_id_accept' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td colspan="3">
            <input name="arf1_posname_accept" id="arf1_posname_accept" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta1.posname_accept}"/>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <b>คำสั่งของนิติกรชำนาญการพิเศษ</b>&nbsp;
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="arf1_isapprove" ${(arf1.isapprove!='N')?'checked':''} value="Y"
                   OnClick="
                                     document.getElementById('arf1_approve_desc').disabled=false;
                                     document.getElementById('arf1_noneapprove_desc').disabled=true;
                                     document.getElementById('arf1_noneapprove_desc').value='';
                                     "
                    > อนุมัติ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="arf1_approve_desc" name="arf1_approve_desc" type="text" class="textbox" size="50" value="${arf1.approve_desc}" ${arf1.isapprove!='N'?'':'disabled'} style="display:none;" />
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3">
            <INPUT TYPE="radio" NAME="arf1_isapprove" ${arf1.isapprove=='N'?'checked':''} value="N"
                   OnClick="
                                     document.getElementById('arf1_approve_desc').disabled=true;
                                     document.getElementById('arf1_noneapprove_desc').disabled=false;
                                     document.getElementById('arf1_approve_desc').value='';
                               "> ไม่อนุมัติ
            <input id="arf1_noneapprove_desc" name="arf1_noneapprove_desc" type="text" class="textbox" size="50" value="${arf1.noneapprove_desc}" ${arf1.isapprove=='N'?'':'disabled'}/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td>
            <input name="staff_approve_name" type="text" class="textreadonly" size="30" id="staff_approve_name" OnKeyPress="window.event.keyCode = 0" value="${sta1.staff_approve_name}"
               style="float:left"/>
        <input type="hidden" id="arf1_staff_id_approve" name="arf1_staff_id_approve" value="${arf1.staff_id_approve}">
        <input type="hidden" id="arf1_poscode_approve" name="arf1_poscode_approve" value="${arf1.poscode_approve}">
        <input type="hidden" id="arf1_offcode_approve" name="arf1_offcode_approve" value="${arf1.offcode_approve}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf1_posname_approve&offcode=arf1_offcode_approve&poscode=arf1_poscode_approve&formname=staff_approve_name&id=arf1_staff_id_approve' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        </td>
        <td align="right">วันที่ :&nbsp;</td>
        <td>
            <input name="arf1_approve_date" id="arf1_approve_date" type="text" class="textdate" size="10" OnKeyPress="window.event.keyCode = 0"
               value="<fmt:formatDate value='${arf1.approve_date}'  pattern='dd/MM/yyyy'/>"/>
        <a href="javascript:NewCssCal('arf1_approve_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19"
                                                                        height="19" border="0"></a>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td colspan="3">
            <input name="arf1_posname_approve" id="arf1_posname_approve" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta1.posname_approve}"/>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    </tbody>
</c:when>


<c:when test="${totalFine <= 1000000.0}">
<!-- แบบขออนุมัติ 2-->
    <c:if test="${arf2 != null}">
        <input type="hidden" name="arf2_id" value="${arf2.id}"/>
    </c:if>
<tbody id="approve2">
<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <b>แบบขออนุมัติ 2</b>&nbsp;
        <font color="red" size="1" style="font-style:italic">(กรณีเป็นอำนาจเปรียบเทียบของ นิติกร 8 ว ส่วนคดี
            สกม./สรรพสามิตพื้นที่////แสดงเมื่อเลือกคดีที่มีค่าปรับรวมเกิน 1 แสนบาทแต่ไม่เกิน 1 ล้านาท)</font>
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right">เรียน :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="arf2_inform_to" class="textbox" size="100" id="arf2_inform_to" value="${arf2.inform_to}" >
        <font style="color:red">*</font>
    </td>
</tr>
<tr>
    <td align="right">เพื่อ :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="arf2_inform_for" class="textbox" size="100" id="arf2_inform_for" value="${arf2.inform_for}" >
        <font style="color:red">*</font>
    </td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
    <td>
        <input name="arf2_staff_inform_name" type="text" class="textreadonly" OnKeyPress="window.event.keyCode = 0" size="30" id="arf2_staff_inform_name" value="${sta2.staff_inform_name}"
               style="float:left"/>
        <input type="hidden" id="arf2_staff_id_inform" name="arf2_staff_id_inform" value="${arf2.staff_id_inform}">
        <input type="hidden" id="arf2_poscode_inform" name="arf2_poscode_inform" value="${arf2.poscode_inform}">
        <input type="hidden" id="arf2_offcode_inform" name="arf2_offcode_inform" value="${arf2.offcode_inform}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf2_inform_posname&offcode=arf2_offcode_inform&poscode=arf2_poscode_inform&formname=arf2_staff_inform_name&id=arf2_staff_id_inform' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        <font style="color:red">*</font>
    </td>
    <td align="right">วันที่ :&nbsp;</td>
    <td>
        <input name="arf2_inform_date" id="arf2_inform_date" type="text" class="textdate" size="10" OnKeyPress="window.event.keyCode = 0"
               value="<fmt:formatDate value='${arf2.inform_date}'  pattern='dd/MM/yyyy'/>"/>
        <a href="javascript:NewCssCal('arf2_inform_date','ddmmyyyy')">
        	<img src="images/btn_calendar.png" alt="" width="19"  height="19" border="0">
        </a>
        <font style="color:red">*</font>
    </td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
    <td colspan="3">
        <input name="arf2_inform_posname" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta2.posname_inform}" id="arf2_inform_posname"/>
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <b>นิติกร 8 ส่วนคดี/สรรพสามิตพื้นที่</b>&nbsp;
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right">เรียน :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="arf2_director_inform_to" class="textbox" size="100" id="arf2_director_inform_to" value="${arf2.director_inform_to}">

    </td>
</tr>
<tr>
    <td align="right">เพื่อ :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="arf2_director_inform_for" class="textbox" size="100" id="arf2_director_inform_for" value="${arf2.director_inform_for}">
    </td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
    <td>
        <input name="arf2_staff_director_name" type="text" class="textreadonly" OnKeyPress="window.event.keyCode = 0" size="30" id="arf2_staff_director_name" value="${sta2.staff_director_name}"
               style="float:left"/>
        <input type="hidden" id="arf2_staff_id_director" name="arf2_staff_id_director" value="${arf2.staff_id_director}">
        <input type="hidden" id="arf2_poscode_director" name="arf2_poscode_director" value="${arf2.poscode_director}">
        <input type="hidden" id="arf2_offcode_director" name="arf2_offcode_director" value="${arf2.offcode_director}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf2_director_posname&offcode=arf2_offcode_director&poscode=arf2_poscode_director&formname=arf2_staff_director_name&id=arf2_staff_id_director' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
    </td>
    <td align="right">วันที่ :&nbsp;</td>
    <td>
        <input name="arf2_director_inform_date" id="arf2_director_inform_date" type="text" class="textdate" size="10" OnKeyPress="window.event.keyCode = 0"
               value="<fmt:formatDate value='${arf2.director_inform_date}'  pattern='dd/MM/yyyy'/>"/>
        <a href="javascript:NewCssCal('arf2_director_inform_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19"
                                                                        height="19" border="0"></a>
    </td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
    <td colspan="3">
        <input name="arf2_director_posname" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta2.posname_director}" id="arf2_director_posname"/>        
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <b>ความเห็นของ ผู้อำนวยการสำนักกฎหมาย/ผู้อำนวยการสำนักงานสรรพสามิตภาค</b>&nbsp;
    </td>
</tr>
<tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="arf2_isaccept" value="Y" ${arf2.isaccept!='N'?'checked':''}
                   OnClick="
                                     document.getElementById('arf2_accept_desc').disabled=false;
                                     document.getElementById('arf2_noneaccept_desc').disabled=true;
                                     document.getElementById('arf2_noneaccept_desc').value='';
                                     "
                    > เห็นชอบ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="arf2_accept_desc" name="arf2_accept_desc" type="text" class="textbox" size="50" value="${arf2.accept_desc}" ${arf2.isaccept!='N'?'':'disabled'} style="display:none;" />
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3">
            <INPUT TYPE="radio" NAME="arf2_isaccept"  value="N" ${arf2.isaccept=='N'?'checked':''}
                   OnClick="
                                     document.getElementById('arf2_accept_desc').disabled=true;
                                     document.getElementById('arf2_noneaccept_desc').disabled=false;
                                     document.getElementById('arf2_accept_desc').value='';
                               "> ไม่เห็นชอบ
            <input id="arf2_noneaccept_desc" name="arf2_noneaccept_desc" type="text" class="textbox" size="50" value="${arf2.noneaccept_desc}" ${arf2.isaccept=='N'?'':'disabled'}/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td colspan="3">
           <input name="arf2_staff_accept_name" type="text" class="textreadonly" OnKeyPress="window.event.keyCode = 0" size="30" id="arf2_staff_accept_name" value="${sta2.staff_accept_name}"
               style="float:left"/>
        <input type="hidden" id="arf2_staff_id_accept" name="arf2_staff_id_accept" value="${arf2.staff_id_accept}">
        <input type="hidden" id="arf2_poscode_accept" name="arf2_poscode_accept" value="${arf2.poscode_accept}">
        <input type="hidden" id="arf2_offcode_accept" name="arf2_offcode_accept" value="${arf2.offcode_accept}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf2_posname_accept&offcode=arf2_offcode_accept&poscode=arf2_poscode_accept&formname=arf2_staff_accept_name&id=arf2_staff_id_accept' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td colspan="3">
            <input name="arf2_posname_accept" id="arf2_posname_accept" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta2.posname_accept}"/>
        </td>
    </tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <b>คำสั่งของนิติกร 8 ส่วนคดี/สรรพสามิตพื้นที่ </b>&nbsp;
    </td>
</tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="arf2_isapprove" ${arf2.isapprove!='N'?'checked':''} value="Y"
                   OnClick="
                                     document.getElementById('arf2_approve_desc').disabled=false;
                                     document.getElementById('arf2_noneapprove_desc').disabled=true;
                                     document.getElementById('arf2_noneapprove_desc').value='';
                                     "
                    > อนุมัติ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="arf2_approve_desc" name="arf2_approve_desc" type="text" class="textbox" size="50" value="${arf2.approve_desc}" ${arf2.isapprove!='N'?'':'disabled'} style="display:none;" />
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3">
            <INPUT TYPE="radio" NAME="arf2_isapprove" ${arf2.isapprove=='N'?'checked':''} value="N"
                   OnClick="
                                     document.getElementById('arf2_approve_desc').disabled=true;
                                     document.getElementById('arf2_noneapprove_desc').disabled=false;
                                     document.getElementById('arf2_approve_desc').value='';
                               "> ไม่อนุมัติ
            <input id="arf2_noneapprove_desc" name="arf2_noneapprove_desc" type="text" class="textbox" size="50" value="${arf2.noneapprove_desc}" ${arf2.isapprove=='N'?'':'disabled'}/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td>
            <input name="arf2_staff_approve_name" type="text" class="textreadonly" OnKeyPress="window.event.keyCode = 0" size="30" id="arf2_staff_approve_name" value="${sta2.staff_approve_name}"
               style="float:left"/>
        <input type="hidden" id="arf2_staff_id_approve" name="arf2_staff_id_approve" value="${arf2.staff_id_approve}">
        <input type="hidden" id="arf2_poscode_approve" name="arf2_poscode_approve" value="${arf2.poscode_approve}">
        <input type="hidden" id="arf2_offcode_approve" name="arf2_offcode_approve" value="${arf2.offcode_approve}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf2_posname_approve&offcode=arf2_offcode_approve&poscode=arf2_poscode_approve&formname=arf2_staff_approve_name&id=arf2_staff_id_approve' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        </td>
        <td align="right">วันที่ :&nbsp;</td>
        <td>
            <input name="arf2_approve_date" id="arf2_approve_date" type="text" class="textdate" size="10" OnKeyPress="window.event.keyCode = 0"
               value="<fmt:formatDate value='${arf2.approve_date}'  pattern='dd/MM/yyyy'/>"/>
        	<a href="javascript:NewCssCal('arf2_approve_date','ddmmyyyy')">
        	<img src="images/btn_calendar.png" alt="" width="19" height="19" border="0"></a>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td colspan="3">
            <input name="arf2_posname_approve" id="arf2_posname_approve" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta2.posname_approve}"/>
        </td>
    </tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
</tbody>
</c:when>

<c:when test="${totalFine > 1000000.0}">
<!-- แบบขออนุมัติ 3-->
    <c:if test="${arf3 != null}">
        <input type="hidden" name="arf3_id" value="${arf3.id}"/>
    </c:if>
<tbody id="approve3">
<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <b>แบบขออนุมัติ 3</b>&nbsp;
        <font color="red" size="1" style="font-style:italic">(กรณีเป็นอำนาจเปรียบเทียบของ
            ผู้อำนวยการสำนักกฎหมาย/ผู้อำนวยการสำนังานสรรพสามิตภาค)////แสดงเมื่อเลือกคดีที่มีค่าปรับรวมเกิน 1
            ล้านบาท</font>
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right">เรียน :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="arf3_inform_to" class="textbox" size="100" id="arf3_inform_to" value="${arf3.inform_to}" >
        <font style="color:red">*</font>
    </td>
</tr>
<tr>
    <td align="right">เพื่อ :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="arf3_inform_for" class="textbox" size="100" id="arf3_inform_for" value="${arf3.inform_for}" >
        <font style="color:red">*</font>
    </td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
    <td>
        <input name="arf3_staff_inform_name" type="text" class="textreadonly" OnKeyPress="window.event.keyCode = 0" size="30" id="arf3_staff_inform_name" value="${sta3.staff_inform_name}"
               style="float:left"/>
        <input type="hidden" id="arf3_staff_id_inform" name="arf3_staff_id_inform" value="${arf3.staff_id_inform}">
        <input type="hidden" id="arf3_poscode_inform" name="arf3_poscode_inform" value="${arf3.poscode_inform}">
        <input type="hidden" id="arf3_offcode_inform" name="arf3_offcode_inform" value="${arf3.offcode_inform}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf3_posname_inform&offcode=arf3_offcode_inform&poscode=arf3_poscode_inform&formname=arf3_staff_inform_name&id=arf3_staff_id_inform' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        <font style="color:red">*</font>
    </td>
    <td align="right">วันที่ :&nbsp;</td>
    <td>
        <input name="arf3_inform_date" id="arf3_inform_date" type="text" class="textdate" size="10" OnKeyPress="window.event.keyCode = 0"
               value="<fmt:formatDate value='${arf3.inform_date}'  pattern='dd/MM/yyyy'/>"/>
        <a href="javascript:NewCssCal('arf3_inform_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19"
                                                                        height="19" border="0"></a>
        <font style="color:red">*</font>
    </td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
    <td colspan="3">
        <input name="arf3_posname_inform" id="arf3_posname_inform" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta3.posname_inform}"/>
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <b>นิติกร 8 ส่วนคดี/สรรพสามิตพื้นที่</b>&nbsp;
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right">เรียน :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="arf3_lawyer8_inform_to" class="textbox" size="100" id="arf3_lawyer8_inform_to" value="${arf3.lawyer8_inform_to}">

    </td>
</tr>
<tr>
    <td align="right">เพื่อ :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="arf3_lawyer8_inform_for" class="textbox" size="100" id="arf3_lawyer8_inform_for" value="${arf3.lawyer8_inform_for}">
    </td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
    <td>
        <input name="arf3_staff_lawyer8_name" type="text" class="textreadonly" OnKeyPress="window.event.keyCode = 0" size="30" id="arf3_staff_lawyer8_name" value="${sta3.staff_lawyer8_name}"
               style="float:left"/>
        <input type="hidden" id="arf3_staff_id_lawyer8" name="arf3_staff_id_lawyer8" value="${arf3.staff_id_lawyer8}">
        <input type="hidden" id="arf3_poscode_lawyer8" name="arf3_poscode_lawyer8" value="${arf3.poscode_lawyer8}">
        <input type="hidden" id="arf3_offcode_lawyer8" name="arf3_offcode_lawyer8" value="${arf3.offcode_lawyer8}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf3_lawyer8_posname&offcode=arf3_offcode_lawyer8&poscode=arf3_poscode_lawyer8&formname=arf3_staff_lawyer8_name&id=arf3_staff_id_lawyer8' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
    </td>
    <td align="right">วันที่ :&nbsp;</td>
    <td>
        <input name="arf3_lawyer8_inform_date" id="arf3_lawyer8_inform_date" type="text" class="textdate" size="10" OnKeyPress="window.event.keyCode = 0"
               value="<fmt:formatDate value='${arf3.lawyer8_inform_date}'  pattern='dd/MM/yyyy'/>"/>
        <a href="javascript:NewCssCal('arf3_lawyer8_inform_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19"
                                                                        height="19" border="0"></a>
    </td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
    <td colspan="3">
        <input name="arf3_lawyer8_posname" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta3.posname_lawyer8}" id="arf3_lawyer8_posname"/>        
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <b>ผู้อำนวยการสำนักกฎหมาย/ผู้อำนวยการสำนักงานสรรพสามิตภาค</b>&nbsp;
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right">เรียน :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="arf3_director_inform_to" class="textbox" size="100" id="arf3_director_inform_to" value="${arf3.director_inform_to}">

    </td>
</tr>
<tr>
    <td align="right">เพื่อ :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="arf3_director_inform_for" class="textbox" size="100" id="arf3_director_inform_for" value="${arf3.director_inform_for}">
    </td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
    <td>
        <input name="arf3_staff_director_name" type="text" class="textreadonly" OnKeyPress="window.event.keyCode = 0" size="30" id="arf3_staff_director_name" value="${sta3.staff_director_name}"
               style="float:left"/>
        <input type="hidden" id="arf3_staff_id_director" name="arf3_staff_id_director" value="${arf3.staff_id_director}">
        <input type="hidden" id="arf3_poscode_director" name="arf3_poscode_director" value="${arf3.poscode_director}">
        <input type="hidden" id="arf3_offcode_director" name="arf3_offcode_director" value="${arf3.offcode_director}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf3_director_posname&offcode=arf3_offcode_director&poscode=arf3_poscode_director&formname=arf3_staff_director_name&id=arf3_staff_id_director' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
    </td>
    <td align="right">วันที่ :&nbsp;</td>
    <td>
        <input name="arf3_director_inform_date" id="arf3_director_inform_date" type="text" class="textdate" size="10" OnKeyPress="window.event.keyCode = 0"
               value="<fmt:formatDate value='${arf3.director_inform_date}'  pattern='dd/MM/yyyy'/>"/>
        <a href="javascript:NewCssCal('arf3_director_inform_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19"
                                                                        height="19" border="0"></a>
    </td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
    <td colspan="3">
        <input name="arf3_director_posname" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta3.posname_director}" id="arf3_director_posname"/>        
    </td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>

<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <b>ความเห็นของรองอธิบดี</b>&nbsp;
    </td>
</tr>
<tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="arf3_isaccept" value="Y" ${arf3.isaccept!='N'?'checked':''}
                   OnClick="
                                     document.getElementById('arf3_accept_desc').disabled=false;
                                     document.getElementById('arf3_noneaccept_desc').disabled=true;
                                     document.getElementById('arf3_noneaccept_desc').value='';
                                     "
                    > เห็นชอบ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="arf3_accept_desc" name="arf3_accept_desc" type="text" class="textbox" size="50" value="${arf3.accept_desc}" ${arf3.isaccept!='N'?'':'disabled'} style="display:none;" />
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3">
            <INPUT TYPE="radio" NAME="arf3_isaccept"  value="N" ${arf3.isaccept=='N'?'checked':''}
                   OnClick="
                                     document.getElementById('arf3_accept_desc').disabled=true;
                                     document.getElementById('arf3_noneaccept_desc').disabled=false;
                                     document.getElementById('arf3_accept_desc').value='';
                               "> ไม่เห็นชอบ
            <input id="arf3_noneaccept_desc" name="arf3_noneaccept_desc" type="text" class="textbox" size="50" value="${arf3.noneaccept_desc}" ${arf3.isaccept=='N'?'':'disabled'}/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td colspan="3">
           <input name="arf3_staff_accept_name" type="text" class="textreadonly" OnKeyPress="window.event.keyCode = 0" size="30" id="arf3_staff_accept_name" value="${sta3.staff_accept_name}"
               style="float:left"/>
        <input type="hidden" id="arf3_staff_id_accept" name="arf3_staff_id_accept" value="${arf3.staff_id_accept}">
        <input type="hidden" id="arf3_poscode_accept" name="arf3_poscode_accept" value="${arf3.poscode_accept}">
        <input type="hidden" id="arf3_offcode_accept" name="arf3_offcode_accept" value="${arf3.offcode_accept}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf3_posname_accept&offcode=arf3_offcode_accept&poscode=arf3_poscode_accept&formname=arf3_staff_accept_name&id=arf3_staff_id_accept' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td colspan="3">
            <input name="arf3_posname_accept" id="arf3_posname_accept" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta3.posname_accept}"/>
        </td>
    </tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="left" colspan="4" class="bgRowGray">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <b>คำสั่งของนิติกร 8 ส่วนคดี/สรรพสามิตพื้นที่ </b>&nbsp;
    </td>
</tr>
<tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="arf3_isapprove" ${arf3.isapprove!='N'?'checked':''} value="Y"
                   OnClick="
                                     document.getElementById('arf3_approve_desc').disabled=false;
                                     document.getElementById('arf3_noneapprove_desc').disabled=true;
                                     document.getElementById('arf3_noneapprove_desc').value='';
                                     "
                    > อนุมัติ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="arf3_approve_desc" name="arf3_approve_desc" type="text" class="textbox" size="50" value="${arf3.approve_desc}" ${arf3.isapprove!='N'?'':'disabled'} style="display:none;" />
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3">
            <INPUT TYPE="radio" NAME="arf3_isapprove" ${arf3.isapprove=='N'?'checked':''} value="N"
                   OnClick="
                                     document.getElementById('arf3_approve_desc').disabled=true;
                                     document.getElementById('arf3_noneapprove_desc').disabled=false;
                                     document.getElementById('arf3_approve_desc').value='';
                               "> ไม่อนุมัติ
            <input id="arf3_noneapprove_desc" name="arf3_noneapprove_desc" type="text" class="textbox" size="50" value="${arf3.noneapprove_desc}" ${arf3.isapprove=='N'?'':'disabled'}/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td>
            <input name="arf3_staff_approve_name" type="text" class="textreadonly" OnKeyPress="window.event.keyCode = 0" size="30" id="arf3_staff_approve_name" value="${sta3.staff_approve_name}"
               style="float:left"/>
        <input type="hidden" id="arf3_staff_id_approve" name="arf3_staff_id_approve" value="${arf3.staff_id_approve}">
        <input type="hidden" id="arf3_poscode_approve" name="arf3_poscode_approve" value="${arf3.poscode_approve}">
        <input type="hidden" id="arf3_offcode_approve" name="arf3_offcode_approve" value="${arf3.offcode_approve}">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:pointer;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&posname=arf3_posname_approve&offcode=arf3_offcode_approve&poscode=arf3_poscode_approve&formname=arf3_staff_approve_name&id=arf3_staff_id_approve' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        </td>
        <td align="right">วันที่ :&nbsp;</td>
        <td>
            <input name="arf3_approve_date" id="arf3_approve_date" type="text" class="textdate" size="10" OnKeyPress="window.event.keyCode = 0"
               value="<fmt:formatDate value='${arf3.approve_date}'  pattern='dd/MM/yyyy'/>"/>
        <a href="javascript:NewCssCal('arf3_approve_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19"
                                                                        height="19" border="0"></a>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td colspan="3">
            <input name="arf3_posname_approve" id="arf3_posname_approve" type="text" class="textview" OnKeyPress="window.event.keyCode = 0" size="35" value="${sta3.posname_approve}"/>
        </td>
    </tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
</tbody>
</c:when>
</c:choose>
</table>
</td>
</tr>
</table>
</td>
</tr>
</table>
</form>
<SCRIPT language="JavaScript">
    var frmvalidator = new Validator("form1");
    frmvalidator.setAddnlValidationFunction("DoCustomValidation");
    <c:choose>
    <c:when test="${totalFine <= 100000.0}">
    function DoCustomValidation(){
        var frm = document.forms["form1"];
        var inform_to = frm.arf1_inform_to.value;
        if(!inform_to || inform_to == '') {
            sfm_show_error_msg('กรุณาใส่ช่อง เรียน ในแบบฟอร์มการขออนุมัติ 1', frm.arf1_inform_to);
            return false;
        }
        var inform_for = frm.arf1_inform_for.value;
        if(!inform_for || inform_for == '') {
            sfm_show_error_msg('กรุณาใส่ช่อง เพื่อ ในแบบฟอร์มการขออนุมัติ 1', frm.arf1_inform_for);
            return false;
        }
        var inform_name = frm.arf1_staff_inform_name.value;
        if(!inform_name || inform_name == '') {
            sfm_show_error_msg('กรุณาเลือกเจ้าหน้าที่ ในแบบฟอร์มการขออนุมัติ 1', frm.arf1_staff_inform_name);
            return false;
        }
        var inform_date = frm.arf1_inform_date.value;
        if(!inform_date || inform_date == '') {
            sfm_show_error_msg('กรุณาใส่วันที่ ในแบบฟอร์มการขออนุมัติ 1', frm.arf1_inform_date);
            return false;
        }
        return true;
    }
    </c:when>
    <c:when test="${totalFine <= 1000000.0}">
    function DoCustomValidation(){
        var frm = document.forms["form1"];
        var inform_to = frm.arf2_inform_to.value;
        if(!inform_to || inform_to == '') {
            sfm_show_error_msg('กรุณาใส่ช่อง เรียน ในแบบฟอร์มการขออนุมัติ 2', frm.arf2_inform_to);
            return false;
        }
        var inform_for = frm.arf2_inform_for.value;
        if(!inform_for || inform_for == '') {
            sfm_show_error_msg('กรุณาใส่ช่อง เพื่อ ในแบบฟอร์มการขออนุมัติ 2', frm.arf2_inform_for);
            return false;
        }
        var inform_name = frm.arf2_staff_inform_name.value;
        if(!inform_name || inform_name == '') {
            sfm_show_error_msg('กรุณาเลือกเจ้าหน้าที่ ในแบบฟอร์มการขออนุมัติ 2', frm.arf2_staff_inform_name);
            return false;
        }
        var inform_date = frm.arf2_inform_date.value;
        if(!inform_date || inform_date == '') {
            sfm_show_error_msg('กรุณาใส่วันที่ ในแบบฟอร์มการขออนุมัติ 2', frm.arf2_inform_date);
            return false;
        }
        return true;
    }
    </c:when>
    <c:when test="${totalFine > 1000000.0}">
    function DoCustomValidation(){
        var frm = document.forms["form1"];
        var inform_to = frm.arf3_inform_to.value;
        if(!inform_to || inform_to == '') {
            sfm_show_error_msg('กรุณาใส่ช่อง เรียน ในแบบฟอร์มการขออนุมัติ 3', frm.arf3_inform_to);
            return false;
        }
        var inform_for = frm.arf3_inform_for.value;
        if(!inform_for || inform_for == '') {
            sfm_show_error_msg('กรุณาใส่ช่อง เพื่อ ในแบบฟอร์มการขออนุมัติ 3', frm.arf3_inform_for);
            return false;
        }
        var inform_name = frm.arf3_staff_inform_name.value;
        if(!inform_name || inform_name == '') {
            sfm_show_error_msg('กรุณาเลือกเจ้าหน้าที่ ในแบบฟอร์มการขออนุมัติ 3', frm.arf3_staff_inform_name);
            return false;
        }
        var inform_date = frm.arf3_inform_date.value;
        if(!inform_date || inform_date == '') {
            sfm_show_error_msg('กรุณาใส่วันที่ ในแบบฟอร์มการขออนุมัติ 3', frm.arf3_inform_date);
            return false;
        }
        return true;
    }
    </c:when>
    </c:choose>

    <c:if test="${completed != null}" >
    	alert("บึนทึกข้อมูลเรียบร้อย");
	</c:if>
</SCRIPT>
      
