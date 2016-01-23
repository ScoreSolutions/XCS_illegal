<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="frmReportPreview.aspx.vb" Inherits="XCS_Reports.frmReportPreview" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title></title>
    <link rel="stylesheet" type="text/css" href="CssClass.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <table width="100%" border="0" >
            <tr>
                <td align="left" bgcolor="White">&nbsp;&nbsp;&nbsp;&nbsp;
                    <asp:DropDownList ID="DDexport" runat="server" >
                        <asp:ListItem Value="1" Selected >Excel</asp:ListItem>
                    </asp:DropDownList>&nbsp;
                    <asp:Button ID="btnExport" runat="server" Text="Export" CssClass="formDialog"/>
                 </td>
            </tr>
            <tr>
                <td>                             
                    <asp:Label ID="lblReportDesc" runat="server"></asp:Label>
                </td>
           </tr>
            <tr>
                <td align="center" >
                    <asp:Label ID="lblerror" runat="server" Text="** Not Found **" Font-Bold="True" 
                        Font-Italic="False" Font-Names="Tahoma" Font-Size="Medium" ForeColor="#990000"></asp:Label>
                        <br /><br />
                </td>
            </tr>
        </table>
    </div>
    </form>
</body>
</html>
