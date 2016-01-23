<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="frmPopArrestExhibit.ascx.vb" Inherits="XCS_Admin.frmPopArrestExhibit" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="../UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="../UserControls/PageControl.ascx" TagName="PageControl" TagPrefix="uc2" %>
<link href="../_Script/StyleSheet.css" rel="stylesheet" type="text/css" />

<asp:Panel ID="Panel1" runat="server" Width="650" Height="550" BorderColor="Black" BorderWidth="1" BackColor="#ffffff"  >
    <table cellspacing="1" width="100%">
        <tr>
            <td colspan="2" style="font-size:20pt;color:Purple" >บัญชีสิ่งของ</td>
            <td colspan="2" align="right">
                <asp:ImageButton ID="imgClose" runat="server" ImageUrl="~/Images/closewindows.png" />
            </td>
        </tr>
        <tr><td>&nbsp;</td></tr>
        <tr>
            <td class="style1">
                &nbsp;
                <asp:Label ID="Label7" runat="server" Text="ประเภทของกลาง :"></asp:Label>
            </td>
            <td class="style2">
                <asp:DropDownList ID="ddlGroupID" runat="server" Height="23px" 
                    Width="260px" AutoPostBack="true">
                </asp:DropDownList>
                <asp:Label ID="Label50" runat="server" ForeColor="#FF3300" Text="*"></asp:Label>
                <asp:Label ID="lblRowID" runat="server" CssClass="zHidden" Text="0"></asp:Label>
                <asp:Label ID="lblExhibitID" runat="server" CssClass="zHidden" Text="0"></asp:Label>
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
                <asp:Label ID="Label8" runat="server" Text="ชนิดของกลาง :"></asp:Label>
            </td>
            <td class="style2">
                <asp:DropDownList ID="ddlDutyCode" runat="server" Height="23px" 
                    Width="260px">
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
                &nbsp;</td>
            <td class="style2">
                <asp:RadioButtonList ID="rdIsDomestic" runat="server"  Height="18px" RepeatColumns="3" Width="224px">
                    <asp:ListItem Value="I">ในประเทศ
                    </asp:ListItem>
                    <asp:ListItem Value="O">ต่างประเทศ
                    </asp:ListItem>
                    <asp:ListItem Value="Z" Selected="True" >ไม่ระบุ</asp:ListItem>
                </asp:RadioButtonList>
            </td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label10" runat="server" Text="ยี่ห้อ :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtBrandCode" runat="server" Width="80px" Height="23px"></asp:TextBox>
                &nbsp;<asp:Button ID="btnPopBrand" runat="server" Text="..." Width="25px" Height="21px" />
                &nbsp;<asp:TextBox ID="txtBrandName" runat="server" Height="23px" Width="145px"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label11" runat="server" Text="ขนาดบรรจุ :"></asp:Label>
            </td>
            <td class="style2">
               <asp:TextBox ID="txtSizeDesc" runat="server" Height="23px" Width="80px"></asp:TextBox>
                &nbsp;<asp:Label ID="Label51" runat="server" Text="หน่วย :"></asp:Label>
                <asp:DropDownList ID="ddlSizeUnitCode" runat="server" Height="23px" 
                    Width="120px">
                </asp:DropDownList>
            </td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label12" runat="server" Text="จำนวน :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtQty" runat="server" Height="23px" Width="80px"></asp:TextBox>
                &nbsp;<asp:Label ID="Label52" runat="server" Text="หน่วย :"></asp:Label>
                <asp:DropDownList ID="ddlQtyUnitCode" runat="server" Height="23px" 
                    Width="120px">
                </asp:DropDownList>
            </td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label13" runat="server" Text="ปริมาณสุทธิ :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtWeight" runat="server" Height="23px" Width="80px"></asp:TextBox>
                &nbsp;<asp:Label ID="Label53" runat="server" Text="หน่วย :"></asp:Label>
                <asp:DropDownList ID="ddlWeightUnitCode" runat="server" Height="23px" 
                    Width="120px">
                </asp:DropDownList>
            </td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label14" runat="server" Text="สถานะของกลาง :"></asp:Label>
            </td>
            <td class="style2">
                <asp:RadioButtonList ID="rdiExhibitStatus" runat="server"  Height="16px" RepeatColumns="3" Width="122px">
                    <asp:ListItem Value="1" Selected="True" >ยึด
                    </asp:ListItem>
                    <asp:ListItem Value="2">คืน
                    </asp:ListItem>
                </asp:RadioButtonList>
            </td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label15" runat="server" Text="รายการของกลาง :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtExhibitList" runat="server" Height="23px" Width="260px"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label16" runat="server" Text="ขนาดดีกรี :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtExhibitDesc" runat="server" Height="23px" Width="112px"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label17" runat="server" Text="ทะเบียนรถ :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtCarNo" runat="server" Height="23px" Width="260px"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label18" runat="server" Text="หมายเหตุ :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtRemark" runat="server" Height="23px" Width="260px"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
            <td class="style2">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                &nbsp;
            </td>
            <td class="style2" >
                &nbsp;
                <asp:Button ID="btnAdd" runat="server" Text="เพิ่ม" Height="30px"  Width="60px"/>
            </td>
            <td class="style1">
                &nbsp;
            </td>
            <td class="style2">
                &nbsp;
            </td>
        </tr>
    </table>
</asp:Panel>
<asp:Button ID="Button1" runat="server" Text="Button" Width="0px" CssClass="zHidden" />
<cc1:ModalPopupExtender ID="zPopArrestExhibit" runat="server" PopupControlID="Panel1" TargetControlID="Button1"
    BackgroundCssClass="modalBackground" DropShadow="true">
</cc1:ModalPopupExtender>


<asp:Panel ID="Panel2" runat="server" Width="650" Height="550" BorderColor="Black" BorderWidth="1" BackColor="#ffffff"  >
    <table cellspacing="1" width="100%">
        <tr>
            <td colspan="2" style="font-size:20pt;color:Purple" >ยี่ห้อ</td>
            <td colspan="2" align="right">
                <asp:ImageButton ID="imgSearchBrandClosePop" runat="server" ImageUrl="~/Images/closewindows.png" />
            </td>
        </tr>
        <tr><td>&nbsp;</td></tr>
        <tr>
            <td class="style1">
                &nbsp;ชื่อยี่ห้อ :
            </td>
            <td class="style2" >
                <asp:TextBox ID="txtSearchBrandName" runat="server" Width="260px" Height="23px"></asp:TextBox>
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
                &nbsp;รหัสยี่ห้อ :
            </td>
            <td class="style2"  >
                <asp:TextBox ID="txtSearchBrandCode" runat="server" Width="260px" Height="23px"></asp:TextBox>
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
                <asp:Button ID="btnSearchBrand" runat="server" Text="ค้นหา" Height="30px"  Width="60px" />
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
            <td align="center">
                <uc2:PageControl ID="PageControl1" runat="server" />
            </td>
        </tr>
        <tr>
            <td align="center">
                <asp:GridView ID="gvBrandList" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                    CssClass="GridViewStyle" Width="98%" AllowPaging="true">
                    <RowStyle CssClass="RowStyle" />
                    <Columns>
                        <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                            <HeaderStyle HorizontalAlign="Center" Width="70px" />
                            <ItemStyle HorizontalAlign="Center" />
                        </asp:BoundField>
                        
                        <asp:TemplateField  HeaderText="รหัสยี่ห้อ">
                            <itemtemplate>
                                <asp:LinkButton ID="lblBrandCode" runat="server" Text='<%# Eval("BRAND_MAIN_CODE") %>' CommandName="Select" 
                                CommandArgument='<%# Eval("BRAND_MAIN_CODE")+"|"+Eval("brand_name") %>' ></asp:LinkButton>
                            </itemtemplate>
                            <headerstyle width="80px"  />
                            <itemstyle horizontalalign="center" width="80px" />
                        </asp:TemplateField>  
                        <asp:TemplateField  HeaderText="ชื่อไทย">
                            <itemtemplate>
                                <asp:Label ID="lblBarndThai" runat="server" Text='<%# Eval("name_thai") %>'></asp:Label>
                            </itemtemplate>
                            <itemstyle horizontalalign="left" />
                        </asp:TemplateField>  
                        
                        <asp:TemplateField  HeaderText="ชื่ออังกฤษ">
                            <itemtemplate>
                                <asp:Label ID="lblBrandEng" runat="server" Text='<%# Eval("name_eng") %>'></asp:Label>
                            </itemtemplate>
                            <itemstyle horizontalalign="left" />
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
<asp:Button ID="Button2" runat="server" Text="Button" Width="0px" CssClass="zHidden" />
<cc1:ModalPopupExtender ID="zPopSearchBrandName" runat="server" PopupControlID="Panel2" TargetControlID="Button2"
    BackgroundCssClass="modalBackground" DropShadow="true">
</cc1:ModalPopupExtender>