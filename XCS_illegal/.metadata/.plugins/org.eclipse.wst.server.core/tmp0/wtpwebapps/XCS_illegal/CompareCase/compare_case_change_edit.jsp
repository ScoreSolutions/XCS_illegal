<%@ page import="java.util.Date" %>
<%@ page import="com.ko.webapp.util.InvoiceUtil" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<%
    InvoiceUtil ivu = new InvoiceUtil();
    if(request.getAttribute("offcode")!=null){
        ivu.setOffcode(request.getAttribute("offcode").toString());
    }
    int indexInvoice = 0;
%>
<script type="text/javascript">
    function initValue(flag){
        if(flag){
            writeTranLog('ยกเลิกการแก้ไขข้อมูลการเพิ่มลดค่าปรับเปรียบเทียบ');
        }
    }
    function back2search() {
        writeTranLog('กลับหน้าค้นหา');
        location.href = "process?action=CompareCase&cmd=list";
    }
    function changeForm(ccvalue){
        location.href = "process?action=CompareCaseChange&cmd=add&ccid="+ccvalue;
    }
    function calValue(money){
        //alert(money);
        <c:if test="${cc != null}" >
            var dif = ${cc.case_fine}-money.value;
            var lbs = ${cc.lawbreakersQty};
            if(dif>=0){
                jQuery("[name=case_fine_diff]").val(dif);
                jQuery("#compare_fine_type_text").html('ปรับลด');
                jQuery("[name=change_type]").val(2);
                document.getElementById("decrease_inv").style.display = '';
                document.getElementById("auto_inv").style.display = 'none';
                document.getElementById("manual_inv").style.display = 'none';
                document.getElementById("inv_select").style.display = 'none';

                //
            }else{
                jQuery('[name=inv_type]').val('A');
                jQuery("[name=case_fine_diff]").val(Math.abs(dif));
                jQuery("#compare_fine_type_text").html('ปรับเพิ่ม');
                jQuery("[name=change_type]").val(1);
                document.getElementById("decrease_inv").style.display = 'none';
                document.getElementById("auto_inv").style.display = '';
                document.getElementById("manual_inv").style.display = 'none';
                document.getElementById("inv_select").style.display = '';
                jQuery("#receipt1").attr('checked',true);
            }
            var total = lbs*money.value;
            //alert(money.value);
            //alert("lbs="+lbs);
            jQuery("[name=case_fine_total_new]").val(total);
            jQuery("[name=case_fine_total_diff]").val(Math.abs(total-(${cc.case_fine}*lbs)));
            //alert("นะท่าน"+Math.abs(total-(${cc.case_fine}*lbs)));
            jQuery("[name=birbe_money_new]").val(total* ${cc.bribe_money_p} / 100);
            jQuery("[name=birbe_money_diff]").val(Math.abs(${cc.birbe_money} - total*${cc.bribe_money_p}/100));
            jQuery("[name=reward_money_new]").val(total*${cc.reward_money_p}/100);
            jQuery("[name=reward_money_diff]").val(Math.abs(${cc.reward_money} -total*${cc.reward_money_p}/100));
            jQuery("[name=treasury_money_new]").val(total*${cc.treasury_money_p}/100);
            jQuery("[name=treasury_money_diff]").val(Math.abs(${cc.treasury_money} -total*${cc.treasury_money_p}/100));
        </c:if>
    }
    function chkManual(flag){
        if(flag){
            // display auto
            jQuery('[name=inv_type]').val('A');
            document.getElementById('auto_inv').style.display = '';
            document.getElementById('manual_inv').style.display = 'none';
        }else{

            // display manual
            jQuery('[name=inv_type]').val('M');
            document.getElementById('auto_inv').style.display = 'none';
            document.getElementById('manual_inv').style.display = '';
        }
    }
    function saveInvAuto(index){
        var saveRow = jQuery("#auto_inv_row_"+index);
        // post ajax save.
    }
</script>
<form method="post" name="dataform" action="process?action=CompareCaseChange&cmd=createChange">
<!-- Body -->
            <table width="100%" height="100%" border="0" cellspacing="0"
                   cellpadding="0">
                <tr>
                    <td width="100%" align="left" valign="top">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td width="1%">&nbsp;</td>
                                <td width="99%">
                                    <span class="websitename">การเพิ่ม-ลดค่าปรับเปรียบเทียบ</span>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td>&nbsp;</td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td>
                                    <!--input name="btnSave" type="button" class="barbutton" value="บันทึก" onClick="submitForm();"-->
                                    <input name="btnSave" type="submit" class="barbutton" value="บันทึก"/>
                                    <input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข"
                                           onClick="initValue('cancle');">
                                    <input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา"
                                           onClick="back2search()"/>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td>&nbsp;</td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td>
                                    <table id="input_form_table">
                                         <tr>
                                             <c:if test="${cc != null}">
                                                 <input type="hidden" name="ccid" value="${cc.id}"/>
                                             </c:if>
                                             <input type="hidden" name="change_type" value="" />
                                             <td align="right">
                                                 วันที่ :&nbsp;
                                             </td>
                                             <td colspan="5">
                                                 <input class="textreadonly" type="text" name="change_date" value="<fmt:formatDate value='<%=new Date()%>' pattern='dd/MM/yyyy' />" >
                                             </td>
                                         </tr>
                                        <tr>
                                             <td align="right">
                                                 พ.ร.บ. :&nbsp;
                                             </td>
                                             <td colspan="5">
                                                 <select name="legislation_id">
                                                    <c:forEach items="${les}" var="les" varStatus="i">
                                                        <option value="${les.id}">${les.legislation_name}</option>
                                                    </c:forEach>
                                                 </select>
                                             </td>
                                         </tr>
                                        <tr>
                                             <td align="right">
                                                 เลขคดีเปรียบเทียบที่ :&nbsp;
                                             </td>
                                             <td>
                                                 <input class="textreadonly" type="text" name="compare_case_id" value="${cc.compare_case_no}" >
                                                 <img src="images/btn_browse.png"  width="18" height="19" border="0" alt="ค้นหาหน่วบงาน" style="cursor: hand" name="search_from_corporation_code" id="search_from_corporation_code"
                                           onclick="window.open('process?action=CompareCaseChange&cmd=openCompareCasePopup&legislation_id='+jQuery('[name=legislation_id] > option:selected').val() , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');">
                                             </td>
                                            <td align="right" width="20%">
                                                วันที่เปรียบเทียบเดิม :&nbsp;
                                            </td>
                                            <td>
                                                <input class="textreadonly" name="cc.compare_case_date" type="text" value="<fmt:formatDate value='${cc.compare_case_date}' pattern='dd/MM/yyyy'/>" >
                                            </td>
                                            <td align="right" >
                                                จำนวนผู้ต้องหา :&nbsp;
                                            </td>
                                            <td>
                                                <input class="textreadonly" name="lawbreakerQty" type="text" value="${cc.lawbreakersQty}"> ราย
                                            </td>
                                         </tr>
                                        <tr>
                                             <td align="right">
                                                 ค่าปรับเปรียบเทียบตดี :&nbsp;
                                             </td>
                                             <td>
                                                 <input class="textreadonly" type="text" name="case_fine_old" value="${cc.case_fine}"> บาท/คน
                                             </td>
                                            <td align="right">
                                                ค่าปรับเปรียบเทียบคดีใหม่ :&nbsp;
                                            </td>
                                            <td>
                                                <input name="case_fine_new" type="text" size="15" OnKeyPress="ChkMinusInt(this);" onchange="calValue(this);"> บาท/คน
                                            </td>
                                            <td align="right">
                                                <span id="compare_fine_type_text" style="color:blue;font-size:200%;"></span>&nbsp;&nbsp;&nbsp;&nbsp;ผลต่าง :&nbsp;
                                            </td>
                                            <td>
                                                <input class="textreadonly" name="case_fine_diff" type="text"> บาท/คน
                                            </td>
                                         </tr>
                                         <tr>
                                             <td align="right">
                                                 ค่าปรับเปรียบเทียบตดีรวม :&nbsp;
                                             </td>
                                             <td>
                                                 <input type="text" class="textreadonly" name="case_fine_total_old" value="${cc.case_fine * cc.lawbreakersQty}"> บาท
                                             </td>
                                            <td align="right">
                                                ค่าปรับเปรียบเทียบตดีรวม :&nbsp;
                                            </td>
                                            <td>
                                                <input name="case_fine_total_new" type="text" class="textreadonly"> บาท
                                            </td>
                                            <td align="right">
                                                ค่าปรับเปรียบเทียบตดีรวม :&nbsp;
                                            </td>
                                            <td>
                                                <input name="case_fine_total_diff" type="text" class="textreadonly"> บาท
                                            </td>
                                         </tr>
                                        <tr>
                                             <td align="right">
                                                 เงินสินบน :&nbsp;
                                             </td>
                                             <td >
                                                 <input type="text" name="birbe_money_old" value="${cc.birbe_money}" class="textreadonly"> บาท
                                             </td>
                                            <td align="right">
                                                เงินสินบน :&nbsp;
                                            </td>
                                            <td>
                                                <input name="birbe_money_new" type="text" class="textreadonly"> บาท
                                            </td>
                                            <td align="right">
                                                เงินสินบน :&nbsp;
                                            </td>
                                            <td>
                                                <input name="birbe_money_diff" type="text" class="textreadonly"> บาท
                                            </td>
                                         </tr>
                                         <tr>
                                             <td align="right">
                                                 เงินรางวัล :&nbsp;
                                             </td>
                                             <td>
                                                 <input type="text" name="reward_money_old" value="${cc.reward_money}" class="textreadonly"> บาท
                                             </td >
                                            <td align="right">
                                                เงินรางวัล :&nbsp;
                                            </td>
                                            <td>
                                                <input name="reward_money_new" type="text" class="textreadonly"> บาท
                                            </td>
                                            <td align="right">
                                                เงินรางวัล :&nbsp;
                                            </td>
                                            <td>
                                                <input name="reward_money_diff" type="text" class="textreadonly"> บาท
                                            </td>
                                         </tr>
                                        <tr>
                                             <td align="right">
                                                 เงินส่งคลัง :&nbsp;
                                             </td>
                                             <td>
                                                 <input type="text" name="treasury_money_old" value="${cc.treasury_money}" class="textreadonly"> บาท
                                             </td>
                                            <td align="right">
                                                เงินส่งคลัง :&nbsp;
                                            </td>
                                            <td>
                                                <input name="treasury_money_new" type="text" class="textreadonly"> บาท
                                            </td>
                                            <td align="right">
                                                เงินส่งคลัง :&nbsp;
                                            </td>
                                            <td>
                                                <input name="treasury_money_diff" type="text" class="textreadonly"> บาท
                                            </td>
                                         </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td>&nbsp;</td>                           
                            </tr>
                            <tr id="inv_select">
                                <td>&nbsp;</td>
                                <td>ออกใบเสร็จแบบ :&nbsp;
                                    <input type="radio" id="receipt1" name="inv_type_radio" checked onClick="chkManual(true);" value="A"/> Auto
                                    &nbsp;<input type="radio" id="receipt2" name="inv_type_radio" onClick="chkManual();" value="M"/> Manual
                                    <input type="hidden" name="inv_type" value="A" />
                                </td>
                            </tr>
                            <tr id="auto_inv">
                                <td>&nbsp;</td>
                                <td>
                                <table cellspacing="0" width="55%">
                                <thead>
                                <tr style="text-align:center;background-color:#cccccc;">
                                    <th style="width:10%">ลำดับ</th>
                                    <th style="width:15%">ชื่อผู้กระทำผิด</th>
                                    <th style="width:15%">เลขที่ใบเสร็จ</th>
                                    <th style="width:15%">เลขที่กระดาษ</th>
                                    <th style="width:15%">คำสั่ง</th>
                                    <th style="width:16%">เลขที่ใบเสร็จเดิม</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${cc.lawbreakers}" var="lb" varStatus="i">
                                    <tr id="auto_inv_row_${i.count}">
                                        <td>${i.count}</td>
                                        <td>${lb.lawbreaker_full_name}</td>
                                        <td id="auto_inv_key_${i.count}" class="textreadonly"><%=Long.parseLong(ivu.getInvoiceKey())+(indexInvoice++)%></td>
                                        <td><input type="text" name="auto_paper_no"/></td>
                                        <td><button onclick="saveInvAuto(${i.count})">บันทึกและพิมพ์</button></td>
                                        <td>${cc.inv_type=='A'?(lb.invcode):(lb.book_no+'/'+lb.inv_no)}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                                </td>
                            </tr>
                            <tr id="manual_inv" style="display:none">
                                <td>&nbsp;</td>
                                <td>
                                <table cellspacing="0" width="55%">
                                <thead>
                                <tr style="text-align:center;background-color:#cccccc;">
                                    <th style="width:10%">ลำดับ</th>
                                    <th style="width:30%">ชื่อผู้กระทำผิด</th>
                                    <th style="width:15%">ค่าปรับ</th>
                                    <th style="width:20%">ใบเสร็จเล่มที่</th>
                                    <th style="width:20%">ใบเสร็จเลขที่</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${cc.lawbreakers}" var="lb" varStatus="i">
                                    <tr>
                                        <td>${i.count}</td>
                                        <td>${lb.lawbreaker_full_name}</td>
                                        <td>${lb.fine}</td>
                                        <td><input type="text" name="man_book_no"/></td>
                                        <td><input type="text" name="man_inv_no"/></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                                </td>
                            </tr>
                            <tr id="decrease_inv" style="display:none">
                                <td>&nbsp;</td>
                                <td>
                                <table cellspacing="0" width="55%">
                                <thead>
                                <tr style="text-align:center;background-color:#cccccc;">
                                    <th style="width:10%">ลำดับ</th>
                                    <th style="width:30%">ชื่อผู้กระทำผิด</th>
                                    <th style="width:20%">เลขที่ใบเสร็จ</th>
                                    <th style="width:20%">เลขที่กระดาษ</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${cc.lawbreakers}" var="lb" varStatus="i">
                                    <tr>
                                        <td>${i.count}</td>
                                        <td>${lb.lawbreaker_full_name}</td>
                                        <td>${cc.inv_type=='A'?(lb.invcode):(lb.book_no+'/'+lb.inv_no)}</td>
                                        <td></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td><td>&nbsp;</td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td style="padding-left:200px">
                                    เหตุผลในการปรับเพิ่ม ปรับลด :<br/>
                                    <textarea rows="5" cols="50" name="change_reason">${ccc!=null?(ccc.change_reason):''}</textarea>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
            <tr>
                    <td>&nbsp;</td>
                </tr>
            <tr>
                    <td>&nbsp;</td>
                </tr>
            </table>
</form>
<script  language="JavaScript" type="text/javascript">
	var frmvalidator  = new Validator("dataform");
	
	frmvalidator.addValidation("case_fine_new","req","กรุณากรอกจำนวนเงินค่าปรับใหม่");
</script>
