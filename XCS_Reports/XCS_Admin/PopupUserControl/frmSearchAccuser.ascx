<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="frmSearchAccuser.ascx.vb" Inherits="XCS_Admin.frmSearchAccuser" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<link href="../_Script/StyleSheet.css" rel="stylesheet" type="text/css" />
<%@ Register Src="../UserControls/PageControl.ascx" TagName="PageControl" TagPrefix="uc1" %>
<asp:Panel ID="Panel1" runat="server" Width="800" Height="550" BorderColor="Black" BorderWidth="1" BackColor="#ffffff"  >

        <table cellspacing="1" width="100%">
            <tr>
                <td colspan="2" style="font-size:20pt;color:Purple" >รายชื่อเจ้าหน้าที่</td>
                <td colspan="2" align="right">
                    <asp:ImageButton ID="imgClose" runat="server" ImageUrl="~/Images/closewindows.png" />
                </td>
            </tr>
            <tr><td>&nbsp;</td></tr>
            <tr>
                <td class="style1">
                    <asp:Label ID="Label7" runat="server" Text="ทีมสายตรวจ :"></asp:Label>
                </td>
                <td class="style2">
                    <asp:DropDownList ID="ddlInspectorTeam" runat="server" Height="23px" 
                        Width="260px" DataTextField="inspector_code" 
                        DataValueField="id">
                    </asp:DropDownList>
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
                    <asp:Label ID="Label10" runat="server" Text="ชื่อเจ้าหน้าที่ :"></asp:Label>
                
                </td>
                <td class="style2">
                    <asp:TextBox ID="txtFirstName" runat="server" Width="137px" Height="23px"></asp:TextBox>
                    &nbsp;&nbsp;
                    <asp:Label ID="Label11" runat="server" Text="นามสกุล :"></asp:Label>
                    <asp:TextBox ID="txtLastName" runat="server" Width="157px" Height="23px"></asp:TextBox>
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
                    <asp:Label ID="Label9" runat="server" Text="ตำแหน่ง :"></asp:Label>
                </td>
                <td class="style2">
                    <asp:TextBox ID="txtPosName" runat="server" Width="260px" Height="23px"></asp:TextBox>
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
                    <asp:Label ID="Label8" runat="server" Text="สังกัด : "></asp:Label>
                </td>
                <td class="style2">
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
                <td class="style2" style="padding-left: 110px">
                    
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

        <table width="100%">
            <tr>
                <td align="center" >
                    <uc1:PageControl ID="PageControl1" runat="server" />
                </td>
            </tr>
            <tr>
                <td align="center" >
                <div style="width: 100%; height: 350px;  overflow-y: auto;align:center">
                <asp:GridView ID="gvData" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                        CssClass="GridViewStyle" Width="95%" AllowPaging="true">
                        <RowStyle CssClass="RowStyle" />
                        <Columns>
                            <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                                <HeaderStyle HorizontalAlign="Center" Width="60px"/>
                                <ItemStyle HorizontalAlign="Center" />
                            </asp:BoundField>
                             <asp:TemplateField HeaderText="เลขบัตรประชาชน">
                                <ItemTemplate>
                                    <asp:LinkButton ID="lnk_emp" runat="server" CommandName="select" 
                                        CommandArgument='<%#Eval("idcard_no") + "," + Eval("fullname") + "," + Eval("posname") + "," + Eval("offname") + "," + Eval("poscode") + "," + Eval("offcode")%>'  Text='<%# Eval("idcard_no") %>'></asp:LinkButton>
                                </ItemTemplate>
                                <ItemStyle HorizontalAlign="Center" Width="120px"/>
                            </asp:TemplateField>
                            <asp:BoundField DataField="fullname" HeaderText="ชื่อ-สกุล">
                                <HeaderStyle HorizontalAlign="Center"  Width="150px" />
                                <ItemStyle HorizontalAlign="Left" />
                            </asp:BoundField>
                            <asp:BoundField DataField="posname" HeaderText="ตำแหน่ง">
                                <HeaderStyle HorizontalAlign="Center"  Width="150px"/>
                                <ItemStyle HorizontalAlign="Left" />
                            </asp:BoundField>
                            <asp:BoundField DataField="offname" HeaderText="สังกัด">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                            </asp:BoundField>
                            <asp:BoundField DataField="per_type_name" HeaderText="ประเภทเจ้าหน้าที่">
                                <HeaderStyle HorizontalAlign="Center" Width="120px"/>
                                <ItemStyle HorizontalAlign="Left" />
                            </asp:BoundField>
                             <asp:BoundField DataField="poscode">
                                <ControlStyle CssClass="zHidden" />
                                <FooterStyle CssClass="zHidden" />
                                <HeaderStyle CssClass="zHidden" />
                                <ItemStyle CssClass="zHidden" />
                            </asp:BoundField>
                             <asp:BoundField DataField="offcode">
                                <ControlStyle CssClass="zHidden" />
                                <FooterStyle CssClass="zHidden" />
                                <HeaderStyle CssClass="zHidden" />
                                <ItemStyle CssClass="zHidden" />
                            </asp:BoundField>
                        </Columns>
                        <PagerStyle CssClass="PagerStyle" />
                        <PagerSettings Visible="false" />
                        <HeaderStyle CssClass="HeaderStyle" />
                        <AlternatingRowStyle CssClass="AltRowStyle" />
                    </asp:GridView>
                </div>
                    
                </td>
            </tr>
        </table>

</asp:Panel>
<asp:Button ID="Button1" runat="server" Text="Button" Width="0px" CssClass="zHidden" />
<cc1:ModalPopupExtender ID="zPopSearchAccuser" runat="server" PopupControlID="Panel1" TargetControlID="Button1"
    BackgroundCssClass="modalBackground" DropShadow="true">
</cc1:ModalPopupExtender>