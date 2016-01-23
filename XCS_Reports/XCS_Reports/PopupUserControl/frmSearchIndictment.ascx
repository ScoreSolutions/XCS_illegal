<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="frmSearchIndictment.ascx.vb" Inherits="XCS_Reports.frmSearchIndictment" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<link href="../_Script/StyleSheet.css" rel="stylesheet" type="text/css" />
<%@ Register Src="../UserControls/PageControl.ascx" TagName="PageControl" TagPrefix="uc1" %>

<asp:Panel ID="Panel1" runat="server" Width="800" Height="550" BorderColor="Black" BorderWidth="1" BackColor="#ffffff"  >
    <table cellspacing="1" width="100%">
        <tr>
            <td colspan="2" style="font-size:20pt;color:Purple" >ข้อกล่าวหา</td>
            <td colspan="2" align="right">
                <asp:ImageButton ID="imgClose" runat="server" ImageUrl="~/Images/closewindows.png" />
            </td>
        </tr>
        <tr><td>&nbsp;</td></tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label7" runat="server" Text="พ.ร.บ. :"></asp:Label>
            </td>
            <td class="style2">
                <asp:DropDownList ID="ddlLegislation" runat="server" Height="23px" 
                    Width="260px" DataTextField="legislation_name" 
                    DataValueField="id" Enabled="false" >
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
                <asp:Label ID="Label10" runat="server" Text="ข้อกล่าวหา :"></asp:Label>
              
            </td>
            <td class="style2">
                <asp:TextBox ID="txtGUILT_BASE" runat="server" Width="260px" Height="23px"></asp:TextBox>
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
                <asp:Label ID="Label9" runat="server" Text="บทกำหนดโทษมาตรา :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtPENALTY_DESC" runat="server" Width="260px" Height="23px"></asp:TextBox>
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
            <td class="style2" style="padding-left: 3px">
               
                <asp:Button ID="btnSearch" runat="server" Text="ค้นหา" Height="30px" Width="60px" />
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
                &nbsp;</td>
            <td class="style2" style="padding-left: 110px">
                &nbsp;</td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td>
                <asp:Button ID="btnSelect" runat="server" Height="30px" Text="เลือกรายการ" 
                    Width="85px" />
            </td>
            <td class="style2" style="padding-left: 110px">
                &nbsp;</td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
    </table>


    <table width="800">
        <tr>
            <td>
                <uc1:PageControl ID="PageControl1" runat="server" />
            </td>
        </tr>
        <tr>
            <td>
             <div style="width: 800px; height: 350px; overflow-y: auto;">
                <asp:GridView ID="gvData" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                    CssClass="GridViewStyle" Width="800px"  AllowPaging="true">
                    <RowStyle CssClass="RowStyle" />
                    <Columns>
                        <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                            <HeaderStyle HorizontalAlign="Center" Width="70px" />
                            <ItemStyle HorizontalAlign="Center" />
                        </asp:BoundField>
                        <asp:TemplateField ShowHeader="false">
                    <HeaderTemplate>
                        <asp:CheckBox ID="chkH" runat="server" OnCheckedChanged="chkH_OnCheckedChanged" AutoPostBack="true" />
                    </HeaderTemplate>
                    <ItemTemplate>
                        <asp:CheckBox ID="chk" runat="server" />
                    </ItemTemplate>
                    <HeaderStyle Width="30px" />
                    <ItemStyle HorizontalAlign="Center" Width="30px" />
                </asp:TemplateField>
                        <asp:BoundField DataField="CASE_LAW_ID" HeaderText="มาตรา">
                            <HeaderStyle HorizontalAlign="Center"  Width="90px"/>
                            <ItemStyle HorizontalAlign="Center" />
                        </asp:BoundField>
                        <asp:BoundField DataField="PENALTY_CASE_LAW_ID" HeaderText="บทกำหนดโทษ">
                            <HeaderStyle HorizontalAlign="Center" Width="100px" />
                            <ItemStyle HorizontalAlign="Left" />
                        </asp:BoundField>
                        <asp:BoundField DataField="GUILT_BASE" HeaderText="ข้อกล่าวหา">
                            <HeaderStyle HorizontalAlign="Center" Width="450px" />
                            <ItemStyle HorizontalAlign="Left" />
                        </asp:BoundField>
                        <asp:TemplateField HeaderText="ของกลางเถื่อน">
                            <ItemTemplate>
                                <asp:CheckBox ID="chkExhibitWild" runat="server"    />
                                <asp:Label ID="lblExhibitWild" runat="server" Text='<%# Bind("Exhibit_Wild") %>' Style="display: none"></asp:Label>
                            </ItemTemplate>
                            <HeaderStyle Width="90px" />
                            <ItemStyle HorizontalAlign="Center" Width="30px" />
                        </asp:TemplateField>
                        <asp:TemplateField ShowHeader="false" >
                            <ItemTemplate>
                                <asp:Label ID="lblIndictmentID" runat="server" Text='<%# Bind("indictment_id") %>'
                                    Style="display: none"></asp:Label>
                            </ItemTemplate>
                            <ItemStyle CssClass="zHidden" />
                            <HeaderStyle CssClass="zHidden" />
                            <ControlStyle CssClass="zHidden" />
                            <FooterStyle CssClass="zHidden" />
                        </asp:TemplateField>
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
<cc1:ModalPopupExtender ID="zPopSearchIndictment" runat="server" PopupControlID="Panel1" TargetControlID="Button1"
    BackgroundCssClass="modalBackground" DropShadow="true">
</cc1:ModalPopupExtender>