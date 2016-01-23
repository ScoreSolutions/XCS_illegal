<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="ucProveExhibit.ascx.vb" Inherits="XCS_Admin.ucProveExhibit" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="../UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="../UserControls/txtTime.ascx" TagName="txtTime" TagPrefix="uc2" %>
<%@ Register src="../PopupUserControl/frmPopArrestExhibit.ascx" tagname="frmPopArrestExhibit" tagprefix="uc8" %>
<%@ Register src="../PopupUserControl/frmSearchStaff.ascx" tagname="frmSearchStaff" tagprefix="uc9" %>


    <asp:Label ID="lblTrackNo" runat="server" Visible="false"></asp:Label>
    <asp:Label ID="lblProductGroupID" runat="server" Visible="false" Text="0" ></asp:Label>
    <asp:Label ID="lblLegislationID" runat="server" Visible="false" Text="0" ></asp:Label>
    <asp:Label ID="lblArrestOffcode" runat="server" Visible="false" Text="" ></asp:Label>
    
    <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr style="height:20px">
            <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
                พิสูจน์ของกลาง
            </td>
        </tr>
    </table>
    <table cellspacing="0" cellpadding="0" border="0"  width="95%" >
        <tr style="height:30px" >
            <td style="width:20%" class="style1" >
                รายงานการพิสูจน์เลขที่ :
            </td>
            <td style="width:30%" class="style2">
                <asp:TextBox ID="txtReportNo1" runat="server" Height="23px" Width="50px" ></asp:TextBox>
                /
                <asp:TextBox ID="txtReportNo2" runat="server" Height="23px" Width="80px" MaxLength="4" ></asp:TextBox>
                <asp:Label ID="Label29" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
            <td style="width:25%" class="style1">
                เลขที่คดี(สมุดบันทึกรับคำกล่าวโทษ) :
            </td>
            <td style="width:25%" class="style2">
                <asp:Label ID="lblCaseID" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
            </td>
        </tr>
        <tr>
            <td  class="style1">
                วันที่รับเรื่องพิสูจน์ :
            </td>
            <td  class="style2">
                <uc1:txtDate ID="txtTakenDate" runat="server" />
                <asp:Label ID="Label12" runat="server" Text="เวลา"></asp:Label>
                <uc2:txtTime ID="txtTakenTime" runat="server" IsNotNull="true" />
            </td>
            <td  class="style1">
                วันที่รับคดี :
            </td>
            <td  class="style2">
                <asp:Label ID="lblCaseDate" runat="server" BackColor="Silver" Width="100px" Height="20px"  ></asp:Label>
                <asp:Label ID="Label1" runat="server" Text="เวลา"></asp:Label>
                <asp:Label ID="lblCaseTime" runat="server" BackColor="Silver" Width="80px" Height="20px"  ></asp:Label>
            </td>
        </tr>
        
        <tr style="height:30px" >
            <td class="style1"  >ชื่อผู้พิสูจน์ : </td>
            <td class="style2"  >
                <table border="0" cellpadding="0" cellspacing="0" width="300px">
                    <tr>
                        <td >
                            <asp:Label ID="lblProveStaffName" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
                            <asp:Label ID="lblProveStaffID" runat="server" Visible="False"></asp:Label>
                            <asp:Label ID="lblProveStaffPoscode" runat="server" Visible="False"></asp:Label>
                            <asp:Label ID="lblProveStaffOffcode" runat="server" Visible="False"></asp:Label>
                        </td>
                        <td style="width:40px">
                            <asp:Button ID="btnSearchProveStaff" runat="server" Text="..." Width="25px" Height="21px" />
                            <uc9:frmSearchStaff ID="frmSearchProveStaff" runat="server" />
                            <asp:Label ID="Label30" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                    </tr>
                </table>
            </td>
            <td class="style1" >ตำแหน่ง(กรณีปฏิบัติราชการแทน) : </td>
            <td class="style2">
                <asp:TextBox ID="txtReplacePosition" runat="server" Height="23px" Width="250px" ></asp:TextBox>
            </td>
        </tr>
        <tr style="height:30px" >
            <td class="style1" >ตำแหน่ง : </td>
            <td class="style2">
                <asp:Label ID="lblProvePositionName" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
            </td>
            <td class="style1" >มูลค่าภาษี : </td>
            <td class="style2">
                <asp:TextBox ID="txtTaxValue" runat="server" Height="23px" Width="100px" ></asp:TextBox>
            </td>
        </tr>
    </table>

    <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr style="height:20px">
            <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
                1. รายการบัญชีสิ่งของ
            </td>
        </tr>
    </table>
    
    <table cellspacing="1" width="100%">
        <tr>
            <td>
                &nbsp;<asp:Button ID="btnAddExhibit" runat="server" Text="เพิ่มใหม่" Width="69px" />
                    <uc8:frmPopArrestExhibit ID="frmPopExhibit1" runat="server" />
                &nbsp;<asp:Button ID="btnDelExhibit" runat="server" Text="ลบรายการ" />
            </td>
        </tr>
        <tr>
            <td class="style1">
                <div style="width: 100%; height: 100px; overflow-y: auto;">
                    <asp:GridView ID="gvExhibitList" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                        CssClass="GridViewStyle" Width="98%">
                        <RowStyle CssClass="RowStyle" />
                        <Columns>
                            <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                            </asp:BoundField>
                            <asp:TemplateField ShowHeader="false">
                                <HeaderTemplate>
                                    <asp:CheckBox ID="chk" runat="server" OnCheckedChanged="chkH_OnCheckedChanged" AutoPostBack="true" /></HeaderTemplate>
                                <ItemTemplate>
                                    <asp:CheckBox ID="chk" runat="server" /></ItemTemplate>
                                <HeaderStyle Width="30px" />
                                <ItemStyle HorizontalAlign="Center" Width="30px" />
                            </asp:TemplateField>
                            <asp:TemplateField HeaderText="ชนิดสินค้า">
                                <ItemTemplate>
                                    <asp:Label ID="lblDutyName" runat="server" Text='<%# Eval("duty_name") %>'></asp:Label><asp:Label
                                        ID="lblDutyCode" runat="server" Text='<%# Eval("duty_code") %>' Visible="false"></asp:Label></ItemTemplate>
                                <HeaderStyle Width="100px" />
                                <ItemStyle HorizontalAlign="center" Width="100px" />
                            </asp:TemplateField>
                            <asp:TemplateField HeaderText="ชื่อสินค้า">
                                <ItemTemplate>
                                    <asp:LinkButton ID="lblGroupName" runat="server" Text='<%# Eval("group_name") %>'
                                        CommandArgument='<%# Eval("seq") %>' CommandName="Edit"></asp:LinkButton>
                                    <asp:Label ID="lblGroupID" runat="server" Text='<%# Eval("group_id") %>' Visible="false"></asp:Label>
                                    <asp:Label ID="lblBrandCode" runat="server" Text='<%# Eval("brand_code") %>' Visible="false"></asp:Label>
                                    <asp:Label ID="lblBrandName" runat="server" Text='<%# Eval("brand_name") %>' Visible="false"></asp:Label>
                                </ItemTemplate>
                                <HeaderStyle Width="150px" />
                                <ItemStyle HorizontalAlign="center" Width="100px" />
                            </asp:TemplateField>
                            <asp:TemplateField HeaderText="ใน/นอก">
                                <ItemTemplate>
                                    <asp:Label ID="lblIsDomesticName" runat="server" Text='<%# Eval("is_domestic_name") %>'></asp:Label><asp:Label
                                        ID="lblIsDomesticCode" runat="server" Text='<%# Eval("isdomestic") %>' Visible="false"></asp:Label></ItemTemplate>
                                <HeaderStyle Width="100px" />
                                <ItemStyle HorizontalAlign="center" Width="100px" />
                            </asp:TemplateField>
                            <asp:TemplateField HeaderText="สถานะของกลาง">
                                <ItemTemplate>
                                    <asp:Label ID="lblStatusName" runat="server" Text='<%# Eval("exhibit_status_name") %>'></asp:Label><asp:Label
                                        ID="lblExhibitStatus" runat="server" Text='<%# Eval("exhibit_status") %>' Visible="false"></asp:Label></ItemTemplate>
                                <HeaderStyle Width="100px" />
                                <ItemStyle HorizontalAlign="center" Width="100px" />
                            </asp:TemplateField>
                            <asp:TemplateField HeaderText="ขนาด">
                                <ItemTemplate>
                                    <asp:Label ID="lblSizeName" runat="server" Text='<%# Eval("size_name") %>'></asp:Label>
                                    <asp:Label ID="lblSizeDesc" runat="server" Text='<%# Eval("size_desc") %>' Visible="false"></asp:Label>
                                    <asp:Label ID="lblSizeUnitCode" runat="server" Text='<%# Eval("size_unit_code") %>' Visible="false"></asp:Label>
                                    <asp:Label ID="lblSizeUnitName" runat="server" Text='<%# Eval("size_unit_name") %>' Visible="false"></asp:Label>
                                </ItemTemplate>
                                <HeaderStyle Width="100px" />
                                <ItemStyle HorizontalAlign="center" Width="100px" />
                            </asp:TemplateField>
                            <asp:TemplateField HeaderText="จำนวน">
                                <ItemTemplate>
                                    <asp:Label ID="lblQtyName" runat="server" Text='<%# Eval("qty_name") %>'></asp:Label>
                                    <asp:Label ID="lblQty" runat="server" Text='<%# Eval("qty") %>' Visible="false"></asp:Label>
                                    <asp:Label ID="lblQtyUnitCode" runat="server" Text='<%# Eval("qty_unit_code") %>' Visible="false"></asp:Label>
                                    <asp:Label ID="lblQtyUnitName" runat="server" Text='<%# Eval("qty_unit_name") %>' Visible="false"></asp:Label>
                                </ItemTemplate>
                                <HeaderStyle Width="100px" />
                                <ItemStyle HorizontalAlign="center" Width="100px" />
                            </asp:TemplateField>
                            <asp:TemplateField HeaderText="ปริมาณสุทธิ">
                                <ItemTemplate>
                                    <asp:Label ID="lblWeightName" runat="server" Text='<%# Eval("weight_name") %>'></asp:Label>
                                    <asp:Label ID="lblWeight" runat="server" Text='<%# Eval("weight") %>' Visible="false"></asp:Label>
                                    <asp:Label ID="lblWeightUnitCode" runat="server" Text='<%# Eval("weight_unit_code") %>' Visible="false"></asp:Label>
                                    <asp:Label ID="lblWeightUnitName" runat="server" Text='<%# Eval("weight_unit_name") %>' Visible="false"></asp:Label>
                                    <asp:Label ID="lblExhibitList" runat="server" Text='<%# Eval("exhibit_list") %>' Visible="false"></asp:Label>
                                </ItemTemplate>
                                <HeaderStyle Width="100px" />
                                <ItemStyle HorizontalAlign="center" Width="100px" />
                            </asp:TemplateField>
                            <asp:BoundField DataField="EXHIBIT_DESC" HeaderText="ดีกรีสุรา">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                            </asp:BoundField>
                            <asp:BoundField DataField="CAR_NO" HeaderText="ทะเบียนรถ">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                            </asp:BoundField>
                            <asp:BoundField DataField="REMARKS" HeaderText="หมายเหตุ(ส่วนพิสูจน์)">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                            </asp:BoundField>
                            <asp:BoundField DataField="id" >
                                <HeaderStyle CssClass="zHidden" />
                                <ItemStyle CssClass="zHidden" />
                                <ControlStyle CssClass="zHidden" />
                                <FooterStyle CssClass="zHidden" />
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
    
    <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr style="height:20px">
            <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
                2. รายงานตรวจพิสูจน์ของกลาง
            </td>
        </tr>
        <tr>
            <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:TextBox ID="txtReportDesc" runat="server" Width="800px" Height="150px" TextMode="MultiLine"></asp:TextBox>
                <asp:Label ID="Label2" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
        </tr>
        <tr><td>&nbsp;</td></tr>
    </table>
    
    <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr style="height:20px">
            <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
                3. คำสั่ง
            </td>
        </tr>
        <tr>
            <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:TextBox ID="txtReportOrder" runat="server" Width="800px" Height="150px" TextMode="MultiLine"></asp:TextBox>
            </td>
        </tr>
        <tr><td>&nbsp;</td></tr>
    </table>
    