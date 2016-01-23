<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="frmUpdateStaffInfo.aspx.vb" Inherits="XCS_Admin.frmUpdateStaffInfo" %>

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
    
    <script type="text/JavaScript" language="JavaScript" >
        function pageLoad() {
            var manager = Sys.WebForms.PageRequestManager.getInstance();
            manager.add_endRequest(endRequest);
            manager.add_beginRequest(OnBeginRequest);
        }
        function OnBeginRequest(sender, args) {
            $get('pageContent').className = 'onProgress';
        }
        function endRequest(sender, args) {
            $get('pageContent').className = '';
        }
    </script>
</head>
<body>
<center>
    <table width="1000px" id="pageContent" >
        <tr>
            <td style="width: 100%;height:800px;vertical-align:top;" >
                <form id="form1" runat="server">
                    <cc1:ToolkitScriptManager ID="ScriptManager1" runat="server" >
                    </cc1:ToolkitScriptManager>
                    <div id="div1" style="font-size: 30px; color: #723373;text-align:left;">
                        อัพเดทรายชื่อเจ้าหน้าที่
                    </div>
                    <div id="div2" style="height: 20px">
                    </div>
                    <div id="div4">
                        <asp:UpdatePanel ID="UpdatePanel1" runat="server">
                            <ContentTemplate>
                                <table border="0" cellspacing="1" width="100%"  >
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
                                        <td class="style1" >&nbsp;</td>
                                        <td class="style2" colspan="3">
                                            &nbsp;<asp:Button ID="btnUpdate" runat="server" Text="ดำเนินการ" Width="70px" Height="20px" />
                                            <asp:Label ID="lblLoginHisID" runat="server" Visible="false" Text="0"></asp:Label>
                                        </td>
                                        
                                    </tr>
                                </table>
                                
                            </ContentTemplate>
                        </asp:UpdatePanel>
                    </div>
                    
                    <asp:UpdateProgress ID="UpdateProgress1" runat="server" AssociatedUpdatePanelID="UpdatePanel1">
                        <ProgressTemplate>
                            <div id="IMGDIV" align="center" valign="middle" runat="server" style="position: absolute;
                                left: 0; top: 0; width: 100%; height: 100%; visibility: visible; vertical-align: middle;
                                border-style: inset; border-color: black; background-color: #000000; z-index: 20000">
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <br />
                                <asp:Image ID="Image1" runat="server" ImageUrl="~/images/icon_inprogress.gif" CssClass="" />
                            </div>
                        </ProgressTemplate>
                    </asp:UpdateProgress>
                    </form>
            </td>
        </tr>
    </table>
</center>
</body>
</html>
