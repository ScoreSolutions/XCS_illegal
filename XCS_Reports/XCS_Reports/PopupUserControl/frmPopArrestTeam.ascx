<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="frmPopArrestTeam.ascx.vb" Inherits="XCS_Reports.frmPopArrestTeam" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<link href="../_Script/StyleSheet.css" rel="stylesheet" type="text/css" />
<%@ Register Src="../UserControls/PageControl.ascx" TagName="PageControl" TagPrefix="uc1" %>
<asp:Panel ID="Panel1" runat="server" Width="800" Height="600" BorderColor="Black" BorderWidth="1" BackColor="#ffffff"  >
    <table cellspacing="1" width="100%">
        <tr>
            <td colspan="2" style="font-size:20pt;color:Purple" >คณะผู้จับกุม</td>
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
                    DataTextField="inspector_code" DataValueField="id" Width="260px">
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
            <td class="style2" align="center" >
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
            <td align="left">
                <asp:Button ID="btnSelect" runat="server" Text="เลือกรายการ" Height="30px"  
                    Width="88px" />
            </td>
        </tr>
        <tr>
            <td align="center">
                <uc1:PageControl ID="PageControl1" runat="server" />
            </td>
        </tr>
        <tr>
            <td align="center">
                <asp:GridView ID="gvData" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                    CssClass="GridViewStyle" Width="98%" AllowPaging="true">
                    <RowStyle CssClass="RowStyle" />
                    <Columns>
                        <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                            <HeaderStyle HorizontalAlign="Center" Width="70px" />
                            <ItemStyle HorizontalAlign="Center" />
                        </asp:BoundField>
                        <asp:TemplateField ShowHeader="false">
                        <headertemplate>
                            <asp:CheckBox ID="chkH" runat="server" OnCheckedChanged="chkH_OnCheckedChanged" AutoPostBack="true" />
                        </headertemplate>
                        <itemtemplate>
                            <asp:CheckBox ID="chk" runat="server" />
                            <asp:Label ID="lblidcard_no" runat="server" Text='<%# Eval("idcard_no") %>' Visible="false"></asp:Label>
                            <asp:Label ID="lblposcode" runat="server" Text='<%# Eval("poscode") %>' Visible="false"></asp:Label>
                            <asp:Label ID="lbloffcode" runat="server" Text='<%# Eval("offcode") %>' Visible="false"></asp:Label>
                        </itemtemplate>
                        <headerstyle width="30px" />
                        <itemstyle horizontalalign="Center" width="30px" />
                        </asp:TemplateField>
                        
                        <asp:TemplateField  HeaderText="รหัสพนักงาน">
                        <itemtemplate>
                            <asp:Label ID="lblEmpID" runat="server" Text='<%# Eval("empid") %>'></asp:Label>
                        </itemtemplate>
                        <headerstyle width="80px"  />
                        <itemstyle horizontalalign="center" width="80px" />
                        </asp:TemplateField>  
                        
                        <asp:TemplateField  HeaderText="ชื่อ-สกุล">
                        <itemtemplate>
                            <asp:Label ID="lblfullname" runat="server" Text='<%# Eval("fullname") %>'></asp:Label>
                        </itemtemplate>
                        <headerstyle width="130px"  />
                        <itemstyle horizontalalign="left" width="130px" />
                        </asp:TemplateField>  
                        
                        <asp:TemplateField  HeaderText="ตำแหน่ง">
                        <itemtemplate>
                            <asp:Label ID="lblposname" runat="server" Text='<%# Eval("posname") %>'></asp:Label>
                        </itemtemplate>
                        <headerstyle width="100px"  />
                        <itemstyle horizontalalign="left" width="100px" />
                        </asp:TemplateField>                                      
                        
                        <asp:TemplateField  HeaderText="สังกัด">
                        <itemtemplate>
                            <asp:Label ID="lbloffname" runat="server" Text='<%# Eval("offname") %>'></asp:Label>
                        </itemtemplate>
                        <headerstyle width="130px"  />
                        <itemstyle horizontalalign="left" width="130px" />
                        </asp:TemplateField> 
                        
                        <asp:TemplateField  HeaderText="ประเภทเจ้าหน้าที่">
                        <itemtemplate>
                            <asp:Label ID="lblper_type_name" runat="server" Text='<%# Eval("per_type_name") %>'></asp:Label>
                        </itemtemplate>
                        <headerstyle width="100px"  />
                        <itemstyle horizontalalign="left" width="100px" />
                        </asp:TemplateField>                                       
                    </Columns>
                    <PagerStyle CssClass="PagerStyle" />
                    <PagerSettings Visible="false" />
                    <HeaderStyle CssClass="HeaderStyle" />
                    <AlternatingRowStyle CssClass="AltRowStyle" />
                </asp:GridView>
            </td>
        </tr>
    </table>
</asp:Panel>
<asp:Button ID="Button1" runat="server" Text="Button" Width="0px" CssClass="zHidden" />
<cc1:ModalPopupExtender ID="zPopArrestTeam" runat="server" PopupControlID="Panel1" TargetControlID="Button1"
    BackgroundCssClass="modalBackground" DropShadow="true">
</cc1:ModalPopupExtender>