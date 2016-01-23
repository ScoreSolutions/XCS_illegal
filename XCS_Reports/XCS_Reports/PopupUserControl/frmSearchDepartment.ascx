<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="frmSearchDepartment.ascx.vb" Inherits="XCS_Reports.frmSearchDepartment" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<link href="../_Script/StyleSheet.css" rel="stylesheet" type="text/css" />
<%@ Register Src="../UserControls/PageControl.ascx" TagName="PageControl" TagPrefix="uc1" %>

<asp:TextBox ID="txtDepartmentID" runat="server" Width="71px" Height="23px"></asp:TextBox>
<asp:Button ID="btnSearchDepartment" runat="server" Text="..." Width="25px" Height="21px" />
<asp:TextBox ID="txtDepartmentName" runat="server" Width="151px" Height="23px"></asp:TextBox>

<asp:Panel ID="Panel1" runat="server" Width="800" Height="450" BorderColor="Black" BorderWidth="1" BackColor="#ffffff"  >
    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
        <ContentTemplate>

                <table cellspacing="1" width="100%"  >
                    <tr>
                        <td colspan="2" style="font-size:20pt;color:Purple" >ข้อมูลหน่วยงาน</td>
                        <td colspan="2" align="right">
                            <asp:ImageButton ID="imgClose" runat="server" ImageUrl="~/Images/closewindows.png" />
                        </td>
                    </tr>
                    <tr><td colspan="4">&nbsp;</td></tr>
                    <tr>
                        <td class="style1">
                            &nbsp;
                            <asp:Label ID="Label7" runat="server" Text="รหัสหน่วยงาน :"></asp:Label>
                        </td>
                        <td class="style2">
                            &nbsp;
                            <asp:TextBox ID="txtOffCode" runat="server" Width="260px" Height="23px"></asp:TextBox>
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
                            <asp:Label ID="Label8" runat="server" Text="ชื่อหน่วยงาน :"></asp:Label>
                        </td>
                        <td class="style2">
                            &nbsp;
                            <asp:TextBox ID="txtOffName" runat="server" Width="260px" Height="23px"></asp:TextBox>
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
                        <td class="style2" style="padding-left: 5px">
                            
                            <asp:Button ID="btnSearch" runat="server" Text="ค้นหา" Height="30px"  Width="60px" />
                        </td>
                        <td class="style1">
                            &nbsp;
                        </td>
                        <td class="style2">
                            &nbsp;
                        </td>
                    </tr>
                </table>
            <div id="div3">
                <table width="800">
                    <tr>
                        <td align="center">
                            <uc1:PageControl ID="PageControl1" runat="server" />
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <asp:GridView ID="gvEDOffice" runat="server" AutoGenerateColumns="False" AllowSorting="false"
                               AllowPaging="true"  CssClass="GridViewStyle" Width="95%">
                                <RowStyle CssClass="RowStyle" />
                                <Columns>
                                    <asp:BoundField DataField="seq" HeaderText="ลำดับที่" >
                                        <HeaderStyle HorizontalAlign="Center" Width="100px"/>
                                        <ItemStyle HorizontalAlign="Center" />
                                    </asp:BoundField>
                                    <asp:BoundField DataField="id">
                                        <ControlStyle CssClass="zHidden" />
                                        <FooterStyle CssClass="zHidden" />
                                        <HeaderStyle CssClass="zHidden" />
                                        <ItemStyle CssClass="zHidden" />
                                    </asp:BoundField>
                                    <asp:TemplateField HeaderText="รหัสหน่วยงาน">
                                        <ItemTemplate>
                                            <asp:LinkButton ID="lnk_offcode" runat="server" CommandName="select" 
                                                CommandArgument='<%#Eval("offcode") + "," + Eval("offname") %>'  Text='<%# Eval("offcode") %>'></asp:LinkButton>
                                        </ItemTemplate>
                                        <ItemStyle HorizontalAlign="Center" />
                                    </asp:TemplateField>
                                    <asp:BoundField DataField="offname" HeaderText="ชื่อหน่วยงาน">
                                        <HeaderStyle HorizontalAlign="Center" Width="400px"/>
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
</asp:Panel>
<asp:Button ID="Button1" runat="server" Text="Button" Width="0px" CssClass="zHidden" />
<cc1:ModalPopupExtender ID="zPopSearchDepartment" runat="server" PopupControlID="Panel1" TargetControlID="Button1"
    BackgroundCssClass="modalBackground" DropShadow="true">
</cc1:ModalPopupExtender>