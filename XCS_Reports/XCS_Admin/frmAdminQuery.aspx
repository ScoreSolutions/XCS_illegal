<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="frmAdminQuery.aspx.vb" Inherits="XCS_Admin.frmAdminQuery" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:TextBox ID="txtTextCommand" runat="server" TextMode="MultiLine" Height="200px" Width="800px" ></asp:TextBox>
        <asp:Button ID="btnExecute" runat="server" Text="Execute" />
        
        <asp:Label ID="lblMsg" runat="server"></asp:Label><br />
        <asp:GridView ID="GridView1" runat="server">
        </asp:GridView>
    </div>
    </form>
</body>
</html>
