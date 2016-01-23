<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="ucRewardDivideAlcohol.ascx.vb" Inherits="XCS_Admin.ucRewardDivideAlcohol" %>
<%@ Register src="../PopupUserControl/frmPopArrestTeam.ascx" tagname="frmPopArrestTeam" tagprefix="uc7" %>

<tr><td colspan="4">&nbsp;</td></tr>
<tr>
    <td colspan="4" >
        <asp:Label ID="lblRewardDivideID" runat="server" Text="0" Visible="false"></asp:Label>
        <asp:Label ID="lblRewardMoney" runat="server" Text="0" Visible="false"></asp:Label>
        &nbsp;<asp:Button ID="btnAdd" runat="server" Text="เพิ่มรายการ" Width="69px" />
        &nbsp;<asp:Button ID="btnDelete" runat="server" Text="ลบรายการที่เลือก" />
        <uc7:frmPopArrestTeam ID="frmAddStaffList" runat="server" />
    </td>
</tr>
<tr>
    <td class="style2" colspan="4" >
        <asp:GridView ID="gvStaffList" runat="server" AutoGenerateColumns="False" AllowSorting="false"
            CssClass="GridViewStyle" Width="98%">
            <RowStyle CssClass="RowStyle" />
            <Columns>
                <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                    <HeaderStyle HorizontalAlign="Center" Width="60px" />
                    <ItemStyle HorizontalAlign="Center" Width="60px" />
                </asp:BoundField>
                <asp:TemplateField ShowHeader="false">
                    <HeaderTemplate >
                        <asp:CheckBox ID="chkH" runat="server" OnCheckedChanged="chkH_OnCheckedChanged" AutoPostBack="true" />
                    </HeaderTemplate>
                    <ItemTemplate>
                        <asp:CheckBox ID="chk" runat="server" />
                        <asp:Label ID="lblidcard_no" runat="server" Text='<%# Eval("idcard_no") %>' Visible="false"></asp:Label>
                    </ItemTemplate>
                    <HeaderStyle Width="30px"  />
                    <ItemStyle HorizontalAlign="Center" Width="30px" />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="ลำดับที่<br />รายการ">
                    <ItemTemplate>
                        <asp:Textbox ID="txtSeq" runat="server" Text='<%# Eval("order_seq") %>' Width="30px" ></asp:Textbox>
                        <asp:Label ID="lblSeq" runat="server" Text='<%# Eval("order_seq") %>' Visible="false" ></asp:Label>
                    </ItemTemplate>
                    <HeaderStyle />
                    <ItemStyle HorizontalAlign="center" Width="30px" />
                    <HeaderStyle Width="30px" />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="ชื่อผู้แจ้งความ">
                    <ItemTemplate>
                        <asp:Label ID="lblinformname" runat="server" Text='<%# Eval("first_name") + " " + Eval("last_name") %>' Visible="false"></asp:Label>
                    </ItemTemplate>
                    <HeaderStyle />
                    <ItemStyle HorizontalAlign="left" Width="80px" />
                    <HeaderStyle Width="80px" />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="ชื่อ-สกุล">
                    <ItemTemplate>
                        <asp:Label ID="lbltitlecode" runat="server" Text='<%# Eval("TITLE_CODE") %>' Visible="false"></asp:Label>
                        <asp:Label ID="lblfirstname" runat="server" Text='<%# Eval("first_name") %>' Visible="false"></asp:Label>
                        <asp:Label ID="lbllastname" runat="server" Text='<%# Eval("last_name") %>' Visible="false"></asp:Label>
                        <asp:Label ID="lblfullname" runat="server" Text='<%# Eval("first_name") + " " + Eval("last_name") %>'></asp:Label></ItemTemplate>
                    <HeaderStyle  />
                    <ItemStyle HorizontalAlign="left"  />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="ตำแหน่ง">
                    <ItemTemplate>
                        <asp:Textbox ID="lblposname" runat="server" Text='<%# Eval("position_name") %>' Width="150px" ></asp:Textbox>
                        <asp:Label ID="lblstafflevel" runat="server" Text='<%# Eval("STAFF_LEVEL") %>' Visible="false"></asp:Label>
                    </ItemTemplate>
                    <HeaderStyle />
                    <ItemStyle HorizontalAlign="left" Width="150px" />
                    <HeaderStyle Width="150px" />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="เงินสินบน"  >
                    <ItemTemplate>
                        <asp:Label ID="lblDutyStatus01Money" runat="server" Text='<%# Eval("duty_status01_money") %>' Visible="false" ></asp:Label>
                        <asp:Label ID="lblDutyStatusID" runat="server" Text='<%# Eval("duty_status_id") %>' Visible="false"></asp:Label>
                    </ItemTemplate>
                    <HeaderStyle Width="60px"  />
                    <ItemStyle HorizontalAlign="left" Width="60px"  />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="ผู้จับกุม"  >
                    <ItemTemplate>
                        <asp:TextBox ID="lblDutyStatus02Money" runat="server" Text='<%# Eval("duty_status02_money") %>' Width="60px" OnTextChanged="txtMoney_TextChanged" AutoPostBack="true" ></asp:TextBox>
                    </ItemTemplate>
                    <HeaderStyle Width="60px"  />
                    <ItemStyle HorizontalAlign="left" Width="60px"  />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="ผู้ร่วมจับกุม"  >
                    <ItemTemplate>
                        <asp:TextBox ID="lblDutyStatus03Money" runat="server" Text='<%# Eval("duty_status03_money") %>' Width="60px" OnTextChanged="txtMoney_TextChanged" AutoPostBack="true" ></asp:TextBox>
                    </ItemTemplate>
                    <HeaderStyle Width="60px"  />
                    <ItemStyle HorizontalAlign="left" Width="60px"  />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="ผู้สั่งการ"  >
                    <ItemTemplate>
                        <asp:TextBox ID="lblDutyStatus04Money" runat="server" Text='<%# Eval("duty_status04_money") %>' Width="60px" OnTextChanged="txtMoney_TextChanged" AutoPostBack="true" ></asp:TextBox>
                    </ItemTemplate>
                    <HeaderStyle Width="60px"  />
                    <ItemStyle HorizontalAlign="left" Width="60px"  />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="ผู้ช่วยเหลือ"  >
                    <ItemTemplate>
                        <asp:TextBox ID="lblDutyStatus05Money" runat="server" Text='<%# Eval("duty_status05_money") %>' Width="60px" OnTextChanged="txtMoney_TextChanged" AutoPostBack="true" ></asp:TextBox>
                    </ItemTemplate>
                    <HeaderStyle Width="60px"  />
                    <ItemStyle HorizontalAlign="left" Width="60px"  />
                </asp:TemplateField> 
                <asp:BoundField HeaderText="รวม" DataField="money_total" DataFormatString="{0:#,##0.00}">
                    <HeaderStyle HorizontalAlign="Center" Width="60px" />
                    <ItemStyle HorizontalAlign="right" Width="60px" />
                </asp:BoundField>
            </Columns>
            <PagerStyle CssClass="PagerStyle" />
            <PagerSettings Visible="false" />
            <HeaderStyle CssClass="HeaderStyle" />
            <AlternatingRowStyle CssClass="AltRowStyle" />
        </asp:GridView>
    </td>
</tr>
