<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="ucRewardDivideTax.ascx.vb" Inherits="XCS_Admin.ucRewardDivideTax" %>
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
                <asp:TemplateField HeaderText="ชื่อ-สกุล">
                    <ItemTemplate>
                        <asp:Label ID="lbltitlecode" runat="server" Text='<%# Eval("TITLE_CODE") %>' Visible="false"></asp:Label>
                        <asp:Label ID="lblfirstname" runat="server" Text='<%# Eval("first_name") %>' Visible="false"></asp:Label>
                        <asp:Label ID="lbllastname" runat="server" Text='<%# Eval("last_name") %>' Visible="false"></asp:Label>
                        <asp:Label ID="lblfullname" runat="server" Text='<%# Eval("first_name") + " " + Eval("last_name") %>'></asp:Label></ItemTemplate>
                    <HeaderStyle Width="250px" />
                    <ItemStyle HorizontalAlign="left" Width="250px" />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="ตำแหน่ง">
                    <ItemTemplate>
                        <asp:Textbox ID="lblposname" runat="server" Text='<%# Eval("position_name") %>' Width="210px" ></asp:Textbox>
                        <asp:Label ID="lblposcode" runat="server" Text='<%# Eval("poscode") %>' Visible="false"></asp:Label>
                        <asp:Label ID="lblstafflevel" runat="server" Text='<%# Eval("STAFF_LEVEL") %>' Visible="false"></asp:Label>
                    </ItemTemplate>
                    <HeaderStyle />
                    <ItemStyle HorizontalAlign="left" Width="220px" />
                    <HeaderStyle Width="220px" />
                </asp:TemplateField>
                <asp:TemplateField HeaderText="ในฐานะ"  >
                    <ItemTemplate>
                        <asp:Label ID="lblDutyStatusID" runat="server" Text='<%# Eval("duty_status_id") %>' Visible="false"></asp:Label>
                        <asp:Label ID="lblDutyStatusName" runat="server" Text='<%# Eval("duty_status_name") %>' Visible="false"></asp:Label>
                        <asp:DropDownList ID="ddlDutyStatus" runat="server" Width="100px" AutoPostBack="true" OnSelectedIndexChanged="ddlDutyStatus_SelectedIndexChanged" ></asp:DropDownList>
                    </ItemTemplate>
                    <HeaderStyle Width="100px"  />
                    <ItemStyle HorizontalAlign="left" Width="100px"  />
                </asp:TemplateField>
                
                <asp:TemplateField HeaderText="จำนวนส่วน">
                    <ItemTemplate>
                        <asp:TextBox ID="txtShare1" runat="server" Width="40px" Text='<%# Eval("share1") %>' ></asp:TextBox>
                    </ItemTemplate>
                    <HeaderStyle HorizontalAlign="Right" />
                    <ItemStyle HorizontalAlign="center" />
                </asp:TemplateField>
                <asp:TemplateField >
                    <ItemTemplate>
                        <asp:TextBox ID="txtShare2" runat="server" Width="40px" Text='<%# Eval("share2") %>'></asp:TextBox>
                    </ItemTemplate>
                    <HeaderStyle />
                    <ItemStyle HorizontalAlign="center" />
                </asp:TemplateField>
                
                <asp:TemplateField HeaderText="รายการ">
                    <ItemTemplate>
                        <asp:TextBox ID="txtMoney1" runat="server" Width="60px" Text='<%# Eval("money1") %>' OnTextChanged="txtMoney1_TextChanged" AutoPostBack="true" ></asp:TextBox>
                    </ItemTemplate>
                    <HeaderStyle HorizontalAlign="Right" />
                    <ItemStyle HorizontalAlign="center" />
                </asp:TemplateField>
                <asp:TemplateField >
                    <ItemTemplate>
                        <asp:TextBox ID="txtMoney2" runat="server" Width="60px" Text='<%# Eval("money2") %>' OnTextChanged="txtMoney2_TextChanged" AutoPostBack="true"  ></asp:TextBox>
                    </ItemTemplate>
                    <HeaderStyle />
                    <ItemStyle HorizontalAlign="center" />
                </asp:TemplateField>
                <asp:BoundField HeaderText="รวมทั้งสิ้น" DataField="money_total" DataFormatString="{0:#,##0.00}">
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
