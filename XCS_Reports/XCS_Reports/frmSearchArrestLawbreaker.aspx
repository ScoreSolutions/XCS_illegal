<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="frmSearchArrestLawbreaker.aspx.vb"
    Inherits="XCS_Reports.frmSearchArrestLawbreaker" %>

<%@ Register Src="UserControls/PageControl.ascx" TagName="PageControl" TagPrefix="uc1" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title></title>
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
            font-family: "MS Sans Serif";
            font-size: 14;
            width: 215px;
            height: 25;
        }
        .style2
        {
            text-align: left;
            font-family: MS Sans Serif;
            font-size: 14;
            height: 25;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <asp:ScriptManager ID="ScriptManager1" runat="server" />
    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
        <ContentTemplate>
            <div id="div4" style="font-size: x-large; color: Purple; font-family: MS Sans Serif;
                font-size: 26;">
                ค้นหาชื่อผู้กระทำผิด
            </div>
            <div id="div1">
            </div>
            <div id="div2">
                <table cellspacing="1" width="100%">
                    <tr>
                        <td class="style1">
                            &nbsp;
                            <asp:Label ID="Label7" runat="server" Text="ชื่อ-สกุลผู้กระทำผิด :"></asp:Label>
                        </td>
                        <td class="style2">
                            &nbsp;
                            <asp:TextBox ID="txtName" runat="server" Width="260px"></asp:TextBox>
                        </td>
                        <td class="style1">
                            &nbsp;
                        </td>
                        <td class="style2">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            &nbsp;
                            <asp:Label ID="Label8" runat="server" Text="เลขที่บัตรประชาชน :"></asp:Label>
                        </td>
                        <td class="style2">
                            &nbsp;
                            <asp:TextBox ID="txtIDCard" runat="server" Width="260px"></asp:TextBox>
                        </td>
                        <td class="style1">
                            &nbsp;
                        </td>
                        <td class="style2">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            &nbsp;
                        </td>
                        <td class="style2" style=" padding-left:60px" >
                            &nbsp;
                            <asp:Button ID="btnSearch" runat="server" Text="ค้นหา" />
                        </td>
                        <td class="style1">
                            &nbsp;
                        </td>
                        <td class="style2">
                            &nbsp;
                        </td>
                    </tr>
                </table>
            </div>
            <div id="div3">
                <table width="800">
                    <tr>
                        <td>
                            <uc1:PageControl ID="PageControl1" runat="server" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <asp:GridView ID="gvData" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                                CssClass="GridViewStyle" Width="800px" AllowPaging="true">
                                <RowStyle CssClass="RowStyle" />
                                <Columns>
                                    <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                                        <HeaderStyle HorizontalAlign="Center" Width="100px" />
                                        <ItemStyle HorizontalAlign="Center" />
                                    </asp:BoundField>
                                    <asp:BoundField DataField="lawbreaker_id_card" HeaderText="เลขบัตรประชาชน">
                                        <HeaderStyle HorizontalAlign="Center" Width="150px"/>
                                        <ItemStyle HorizontalAlign="Left" />
                                    </asp:BoundField>
                                     <asp:TemplateField HeaderText="ชื่อ-สกุล">
                                        <ItemTemplate>
                                            <asp:LinkButton ID="lnk_offcode" runat="server" CommandName="select" 
                                                CommandArgument='<%#Eval("title_code")+ "," + Eval("first_name")+ "," + Eval("last_name") + "," + Eval("lawbreaker_id_card") %>'  Text='<%# Eval("lawbreaker_name") %>'></asp:LinkButton>
                                        </ItemTemplate>
                                        <ItemStyle HorizontalAlign="Left" />
                                    </asp:TemplateField>
                                  
                                    <asp:BoundField DataField="lawbreaker_address" HeaderText="ที่อยู่">
                                        <HeaderStyle HorizontalAlign="Center" Width="300px"/>
                                        <ItemStyle HorizontalAlign="Left" />
                                    </asp:BoundField>
                                </Columns>
                                <PagerStyle CssClass="PagerStyle" />
                                <PagerSettings Visible="false" />
                                <HeaderStyle CssClass="HeaderStyle" />
                                <AlternatingRowStyle CssClass="AltRowStyle" />
                            </asp:GridView>
                        </td>
                    </tr>
                </table>
            </div>
        </ContentTemplate>
    </asp:UpdatePanel>
    </form>
</body>
</html>
