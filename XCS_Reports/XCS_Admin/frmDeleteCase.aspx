<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="frmDeleteCase.aspx.vb" Inherits="XCS_Admin.frmDeleteCase" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
    <meta http-equiv="x-ua-compatible" content="IE=9" >
    <script language="javascript" src="_Script/JScript.js" type="text/javascript"></script>
    <script language="javascript" src="_Script/datetimepicker_css.js" type="text/javascript"></script>
    <link href="_Script/StyleSheet.css" rel="stylesheet" type="text/css" />
    <style type="text/css">
        div.color
        {
            border-top-width: 3px;
            border-top-style: solid;
            border-top-color: #ff9900;
        }
        .style1
        {
            text-align: right;
            height: 25;
            font-family: Tahoma;
            font-size: 10pt;
        }
        .style2
        {
            text-align: left;
            height: 25;
            font-family: Tahoma;
            font-size: 10pt;
        }
        .style3
        {
            text-align: left;
            font-family: MS Sans Serif;
            font-size: 14;
            width: 161px;
            height: 25;
        }
        .style4
        {
            text-align: left;
            font-family: MS Sans Serif;
            font-size: 14;
            width: 265px;
            height: 100;
        }
        .style5
        {
            text-align: right;
            font-family: "MS Sans Serif";
            font-size: 14;
            width: 215px;
            height: 25px;
        }
        .style6
        {
            text-align: left;
            font-family: MS Sans Serif;
            font-size: 14;
            height: 25px;
        }
        .style7
        {
            text-align: left;
            font-family: MS Sans Serif;
            font-size: 14;
            height: 25;
            width: 305px;
        }
        .styleRight
        {
            text-align: right;
            height: 25;
            font-family: Tahoma;
            font-size: 10pt;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <cc1:ToolkitScriptManager ID="ScriptManager1" runat="server" >
    </cc1:ToolkitScriptManager>
    <div id="div1" style="font-size: 30px; color: #723373;">
        ลบข้อมูลคดี
    </div>
    <div id="div2" style="height: 20px">
    </div>
    <div id="div4">
        <asp:UpdatePanel ID="UpdatePanel1" runat="server">
            <ContentTemplate>
                <table border="0" cellspacing="1" width="100%">
                    <tr>
                        <td style="width:15%" >
                            &nbsp;
                        </td>
                        <td style="width:25%">
                            &nbsp;
                        </td>
                        <td style="width:15%">
                            &nbsp;
                        </td>
                        <td style="width:45%">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="style1" >เลขที่งาน : </td>
                        <td class="style2" colspan="3">
                            <asp:TextBox ID="txtTrackNo" runat="server" Height="23px" Width="150px"></asp:TextBox>
                            &nbsp;<asp:Button ID="btnDelete" runat="server" Text="ลบข้อมูล" Width="70px" Height="20px" />
                            <asp:Label ID="Label39" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                            <asp:Label ID="lblLoginHisID" runat="server" Visible="false" Text="0"></asp:Label>
                        </td>
                        
                    </tr>
                </table>
                
            </ContentTemplate>
        </asp:UpdatePanel>
    </div>
    </form>
</body>
</html>
