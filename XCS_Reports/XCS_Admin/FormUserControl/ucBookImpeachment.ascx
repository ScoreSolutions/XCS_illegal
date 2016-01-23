<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="ucBookImpeachment.ascx.vb" Inherits="XCS_Admin.ucBookImpeachment" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="../UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="../UserControls/txtTime.ascx" TagName="txtTime" TagPrefix="uc2" %>
<%@ Register src="../PopupUserControl/frmSearchStaff.ascx" tagname="frmSearchStaff" tagprefix="uc9" %>

<div style="width: 100%; height: 300px; overflow-y: auto;">
    <asp:Label ID="lblTrackNo" runat="server" Visible="false"></asp:Label>
    <table cellspacing="0" cellpadding="0" border="0"  width="80%"  >
        <tr style="height:30px" >
            <td style="width:25%" class="style1" >
                เลขที่คดี (สมุดรับคำกล่าวโทษ) :
            </td>
            <td style="width:30%" class="style2">
                <asp:Label ID="lblCaseNonOffice" runat="server" Text="น" Font-Bold="True"  Visible="False" ></asp:Label>
                <asp:TextBox ID="txtCaseNo1" runat="server" Height="23px" Width="50px" ></asp:TextBox>
                /
                <asp:TextBox ID="txtCaseNo2" runat="server" Height="23px" Width="80px" MaxLength="4" ></asp:TextBox>
                <asp:Label ID="Label29" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
            <td style="width:15%" class="style1">
                วันที่รับคดี :
            </td>
            <td style="width:30%" valign="top" class="style2">
                <uc1:txtDate ID="txtCaseDate" runat="server" />
                <asp:Label ID="Label12" runat="server" Text="เวลา"></asp:Label>
                <uc2:txtTime ID="txtCaseTime" runat="server" />
            </td>
        </tr>
        <tr style="height:30px">
            <td >&nbsp;</td>
            <td >
                <asp:CheckBox ID="chkNoneOffice" runat="server" Text="คดีจับกุมนอกสถานที่" AutoPostBack="True" />
            </td>
            <td colspan="2">&nbsp;</td>
        </tr>
        <tr style="height:30px" >
            <td class="style1"  >เจ้าหน้าที่ดำเนินคดี : </td>
            <td class="style2" colspan="2" >
                <table border="0" cellpadding="0" cellspacing="0" width="300px">
                    <tr>
                        <td >
                            <asp:Label ID="lblSueStaffName" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
                            <asp:Label ID="lblSueStaffID" runat="server" Visible="False"></asp:Label>
                            <asp:Label ID="lblSueStaffOffcode" runat="server" Visible="False"></asp:Label>
                        </td>
                        <td style="width:40px">
                            <asp:Button ID="btnSearchSueStaff" runat="server" Text="..." Width="25px" Height="21px" />
                            <uc9:frmSearchStaff ID="frmSearchSueStaff" runat="server" />
                            <asp:Label ID="Label30" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                    </tr>
                </table>
            </td>
            <td >&nbsp;</td>
        </tr>
        <tr style="height:30px">
            <td class="style1" valign="top">ลักษณะคดี : </td>
            <td class="style2" valign="top">
                <asp:RadioButtonList ID="rdiCaseQuality" runat="server" RepeatColumns="1" AutoPostBack="True" >
                    <asp:ListItem Text="เปรียบเทียบปรับได้ : ยินยอมชำระเงิน" Value="1" Selected="True" ></asp:ListItem>
                    <asp:ListItem Text="ส่งฟ้องศาล" Value="2" ></asp:ListItem>
                </asp:RadioButtonList>
            </td>
            <td class="style1" valign="top">คดีสิ้นสุดชั้น : </td>
            <td class="style2" valign="top">
                <asp:RadioButtonList ID="rdiCaseLast" runat="server" RepeatColumns="1"  >
                    <asp:ListItem Value="1" Selected="True" Text="กรมสรรพสามิต" ></asp:ListItem>
                    <asp:ListItem Value="2" Enabled="False" Text="ศาล"></asp:ListItem>
                    <asp:ListItem Value="3" Enabled="False" Text="พนักงานสอบสวน/พนักงานอัยการ"></asp:ListItem>
                </asp:RadioButtonList>
            </td>
        </tr>
        <asp:Panel ID="pnlCaseLast" runat="server" Visible="False">
            <tr >
                <td class="style1" >ผลคดี : </td>
                <td class="style2">
                    <asp:TextBox ID="txtCaseResult" runat="server" Height="23px" Width="260px"></asp:TextBox>
                </td>
                <td class="style1" >วันที่คดีสิ้นสุด : </td>
                <td class="style2">
                    <uc1:txtDate ID="txtCaseLastDate" runat="server" />
                </td>
            </tr>
            <tr>
                <td class="style1" >ค่าปรับ : </td>
                <td class="style2" colspan="3">
                    <asp:TextBox ID="txtCaseFine" runat="server" Height="23px" Width="50px"></asp:TextBox> บาท
                </td>
            </tr>
        </asp:Panel>
    </table>
</div>

