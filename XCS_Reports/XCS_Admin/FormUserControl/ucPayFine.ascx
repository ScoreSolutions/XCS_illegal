<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="ucPayFine.ascx.vb" Inherits="XCS_Admin.ucPayFine" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="../UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="../UserControls/txtTime.ascx" TagName="txtTime" TagPrefix="uc2" %>

    <asp:Label ID="lblTrackNo" runat="server" Visible="false"></asp:Label>
    <asp:Label ID="lblLegislationID" runat="server" Visible="false" Text="0" ></asp:Label>
    
    
   
    <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr style="height:20px">
            <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
                ชำระเงินค่าปรับ
            </td>
        </tr>
    </table>
    <table cellspacing="0" cellpadding="0" border="0"  width="95%" >
        <tr style="height:30px" >
            <td style="width:20%" class="style1" >
                วันที่รับชำระ :
            </td>
            <td style="width:30%" class="style2">
                <uc1:txtDate ID="txtPayDate" runat="server" IsNotNull="true" />
            </td>
            <td style="width:25%" class="style1">
                เลขคดีเปรียบเทียบปรับที่ :
            </td>
            <td style="width:25%" class="style2">
                <asp:Label ID="lblCompareCaseNo" runat="server" BackColor="Silver" Width="150px" Height="20px"  ></asp:Label>
            </td>
        </tr>
        <tr><td>&nbsp;</td></tr>
    </table>

    <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr style="height:20px">
            <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
                รายชื่อผู้กระทำผิด
            </td>
        </tr>
    </table>
    
    <table cellspacing="1" cellpadding="0" border="0"  width="600px" >
        <tr><td colspan="4">&nbsp;</td></tr>
        <tr>
            <td colspan="4" >
                <asp:GridView ID="gvArrestLawbreaker" runat="server" AutoGenerateColumns="False"
                    AllowSorting="true" CssClass="GridViewStyle" Width="600px">
                    <RowStyle CssClass="RowStyle" />
                    <Columns>
                        <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                            <HeaderStyle HorizontalAlign="Center" />
                            <ItemStyle HorizontalAlign="center" Width="60px" />
                        </asp:BoundField>
                        <asp:BoundField DataField="id" >
                            <HeaderStyle CssClass="zHidden" />
                            <ItemStyle CssClass="zHidden" />
                            <ControlStyle CssClass="zHidden" />
                            <FooterStyle CssClass="zHidden" />
                        </asp:BoundField>
                        <asp:TemplateField HeaderText="ชื่อผู้กระทำผิด">
                            <ItemTemplate>
                                <asp:Label ID="lblFullname" runat="server" Text='<%# Eval("lawbreaker_name") %>'></asp:Label>
                            </ItemTemplate>
                            <HeaderStyle  Width="200px" />
                            <ItemStyle HorizontalAlign="left" Width="200px" />
                        </asp:TemplateField>
                        <asp:TemplateField HeaderText="ค่าปรับ">
                            <ItemTemplate>
                                <asp:Label ID="lblFine" runat="server" Text='<%# Eval("fine") %>' BackColor="Silver" Width="80px" Height="20px" CssClass="styleRight" ></asp:Label>
                            </ItemTemplate>
                            <HeaderStyle Width="100px" />
                            <ItemStyle HorizontalAlign="right" Width="100px" />
                        </asp:TemplateField>
                        <asp:TemplateField HeaderText="ใบเสร็จเล่มที่">
                            <ItemTemplate>
                                <asp:TextBox ID="txtInvBookNo" runat="server" Height="23px" Width="100px" Text='<%# Eval("book_no") %>' ></asp:TextBox>
                            </ItemTemplate>
                            <HeaderStyle Width="150px" />
                            <ItemStyle HorizontalAlign="left" Width="150px" />
                        </asp:TemplateField>
                        <asp:TemplateField HeaderText="ใบเสร็จเลขที่">
                            <ItemTemplate>
                                <asp:TextBox ID="txtInvNo" runat="server" Height="23px" Width="100px" Text='<%# Eval("inv_no") %>' ></asp:TextBox>
                            </ItemTemplate>
                            <HeaderStyle Width="150px" />
                            <ItemStyle HorizontalAlign="center" Width="150px" />
                        </asp:TemplateField>
                    </Columns>
                    <PagerStyle CssClass="PagerStyle" />
                    <PagerSettings Visible="false" />
                    <HeaderStyle CssClass="HeaderStyle" />
                    <AlternatingRowStyle CssClass="AltRowStyle" />
                </asp:GridView>
            </td>
        </tr>
        <tr style="height:30px;background-color:#D2D2D2" >
            <td style="width:60px" >&nbsp;</td>
            <td style="width:170px" ><b>ค่าปรับรวม</b></td>
            <td style="width:85px" >
                <asp:Label ID="lblCaseTotalFine" runat="server" BackColor="Silver" Width="80px" Height="20px" CssClass="styleRight" ></asp:Label>
            </td>
            <td  >&nbsp;</td>
        </tr>
    </table>
    