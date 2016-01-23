<%@ page contentType="text/html; charset=utf-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>

    <title>คำนวณเงินรางวัล : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" language="JavaScript" src="../js/rollimage.js"></script>
    <script type="text/javascript" language="JavaScript" src="../js/menu.js"></script>
    <script type="text/javascript" language="JavaScript" src="../script/jquery.js"></script>
    <script type="text/javascript" language="JavaScript" src="../js/JScript.js"></script>
    <script type="text/javascript">
        function onSubmit() {
            var arrest = jQuery("[name=arrest]").val();
            var arrest_co = jQuery("[name=arrest_co]").val();
            var command = jQuery("[name=command]").val();
            var helper = jQuery("[name=helper]").val();
            if (arrest == '')arrest = 0;
            if (arrest_co == '')arrest_co = 0;
            if (command == '')command = 0;
            if (helper == '')helper = 0;
            var compare = <%=request.getParameter("person")%>;
            var total = parseInt(arrest) + parseInt(arrest_co) + parseInt(command) + parseInt(helper);
            if (compare == total) {
                var data = [];
                data['arrest'] = arrest;
                data['arrest_co'] = arrest_co;
                data['command'] = command;
                data['helper'] = helper;
                window.returnValue = data;
                window.close();
            }else{
                alert('จำนวนคนไม่เท่ากัน');
            }
        }
    </script>
</HEAD>

<BODY>
<table border="0" cellpadding="0" cellspacing="0" width="95%">
    <tr>
        <td colspan="2"><span class="websitename">คำนวณเงินรางวัล</span></td>
    </tr>
    <tr>
        <td colspan="2">
            <hr/>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <input name="btnCal" type="button" class="barbutton" value="แจก" onclick="onSubmit()">
            <input name="btnBack" type="button" class="barbutton" value="กลับ" onclick="window.close()">
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <hr/>
        </td>
    </tr>
    <tr>
        <td align="right">ผู้จับกุม :&nbsp;</td>
        <td><input name="arrest" type="text" class="text" size="10" class="textNum" value="1" readonly OnKeyPress="ChkMinusDbl(this);"> คน
        </td>
    </tr>
    <tr>
        <td align="right">ผู้ร่วมจับกุม :&nbsp;</td>
        <td><input name="arrest_co" type="text" class="text" size="10" class="textNum" OnKeyPress="ChkMinusDbl(this);">
            คน
        </td>
    </tr>
    <tr>
        <td align="right">ผู้สั่งการ :&nbsp;</td>
        <td><input name="command" type="text" class="text" size="10" class="textNum" OnKeyPress="ChkMinusDbl(this);"> คน
        </td>
    </tr>
    <tr>
        <td align="right">ผู้ช่วยเหลือ :&nbsp;</td>
        <td><input name="helper" type="text" class="text" size="10" class="textNum" OnKeyPress="ChkMinusDbl(this);"> คน
        </td>
    </tr>
</table>
</BODY>
</HTML>
