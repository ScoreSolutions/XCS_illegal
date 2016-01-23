<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="ucRewardRequestAlcohol.ascx.vb" Inherits="XCS_Admin.ucRewardRequestAlcohol" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="../UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="../UserControls/txtTime.ascx" TagName="txtTime" TagPrefix="uc2" %>
<%@ Register src="../PopupUserControl/frmSearchStaff.ascx" tagname="frmSearchStaff" tagprefix="uc9" %>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            บันทึกรับรองผลคดี
        </td>
    </tr>
</table>

<table cellspacing="0" cellpadding="0" border="0"  width="95%"  >
    <tr>
        <td style="width:20%" >&nbsp;
            <asp:Label ID="lblApplicationRewardRequestID" runat="server" Visible="false" Text="0" ></asp:Label>
        </td>
        <td style="width:25%" >&nbsp;</td>
        <td style="width:15%" >&nbsp;</td>
        <td style="width:40%" >&nbsp;</td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            วันที่ :
        </td>
        <td class="style2" colspan="3" >
            <uc1:txtDate ID="txtAcceptDate" runat="server" IsNotNull="true" DefaultCurrentDate="true" />
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            เสนอ :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtReportTo" runat="server" Height="23px" Width="250px" ></asp:TextBox>
            <asp:Label ID="Label29" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            <i> เช่น ผู้อำนวยการส่วนคดี</i>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            ชื่อผู้พิสูจน์ :
        </td>
        <td class="style2" >
            <asp:Label ID="lblProveStaffName" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
        </td>
        <td class="style1">
            ตำแหน่ง :
        </td>
        <td class="style2" >
            <asp:Label ID="lblProveStaffPosname" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            เจ้าหน้าที่ดำเนินคดี :
        </td>
        <td class="style2" >
            <asp:Label ID="lblSueStaffName" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
        </td>
        <td class="style1">
            ตำแหน่ง :
        </td>
        <td class="style2" >
            <asp:Label ID="lblSueStaffPosname" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
        </td>
    </tr>
    
    <tr style="height:30px" >
        <td class="style1">
            เปรียบเทียบปรับเป็นเงิน :
        </td>
        <td class="style2" colspan="3" >
            <asp:Label ID="lblCaseTotalFine" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label> บาท &nbsp;
            (<asp:Label ID="alCaseTotalFine" runat="server"></asp:Label>)
        </td>        
    </tr>
    <tr>
        <td class="style1">
            เงินสินบน <asp:Label ID="lblBribeP" runat="server" Width="20px" Height="20px"  ></asp:Label> % เป็นเงิน :
        </td>
        <td class="style2" colspan="3" >
            <asp:Label ID="lblBribeMoney" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label> บาท &nbsp;
            (<asp:Label ID="alBirbeText" runat="server"></asp:Label>)
        </td>
    </tr>
    <tr>
        <td class="style1">
            เงินรางวัล <asp:Label ID="lblRewardP" runat="server" Width="20px" Height="20px"  ></asp:Label> % เป็นเงิน :
        </td>
        <td class="style2" colspan="3" >
            <asp:Label ID="lblRewardMoney" runat="server" BackColor="Silver" Width="250px" Height="20px" ></asp:Label> บาท &nbsp;
            (<asp:Label ID="alRewardText" runat="server"></asp:Label>)
        </td>
    </tr>
</table>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            การรับรองผลการจับกุมผู้กระทำผิดพระราชบัญญัติสุรา
        </td>
    </tr>
</table>
<table cellspacing="0" cellpadding="0" border="0"  width="95%"  >
    <tr>
        <td style="width:20%" >&nbsp;</td>
        <td style="width:25%" >&nbsp;</td>
        <td style="width:15%" >&nbsp;</td>
        <td style="width:44%" >&nbsp;</td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            เรียน :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtAcceptLean" runat="server" Height="23px" Width="250px" ></asp:TextBox>
            <asp:Label ID="Label1" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            ชื่อผู้จับกุม :
        </td>
        <td class="style2" colspan="3" >
            <asp:Label ID="lblAccuserName" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
            <asp:Button ID="btnSearchAccuserStaff" runat="server" Text="..." Width="25px" Height="21px" />
            <uc9:frmSearchStaff ID="frmSearchAccuserStaff" runat="server" />
            <asp:Label ID="Label2" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            
            <asp:Label ID="lblAccuserStaffID" runat="server" Visible="false" ></asp:Label>
            <asp:Label ID="lblAccuserPoscode" runat="server" Visible="false" ></asp:Label>
            <asp:Label ID="lblAccuserOffcode" runat="server" Visible="false" ></asp:Label>
        </td>
    </tr>
    <tr>
        <td class="style1">
            ตำแหน่ง :
        </td>
        <td class="style2" >
            <asp:Label ID="lblAccuserPosname" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
        </td>
        <td class="style1">
            สังกัด :
        </td>
        <td class="style2" >
            <asp:Label ID="lblAccuserOffname" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
        </td>
    </tr>
    <tr>
        <td class="style1">
            ขอรับรองว่า :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtAcceptDesc" runat="server" Width="550px" Height="50px" TextMode="MultiLine"></asp:TextBox>
            <asp:Label ID="Label3" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
        </td>
    </tr>
</table>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            หัวหน้าฝ่าย หรือตำแหน่งเทียบเท่า
        </td>
    </tr>
</table>

<table cellspacing="0" cellpadding="0" border="0"  width="95%"  >
    <tr>
        <td style="width:20%" >&nbsp;</td>
        <td style="width:25%" >&nbsp;</td>
        <td style="width:15%" >&nbsp;</td>
        <td style="width:40%" >&nbsp;</td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            เรียน :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtLeaderLean" runat="server" Height="23px" Width="250px" ></asp:TextBox>
            <asp:Label ID="Label4" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td colspan="3">
            <asp:RadioButtonList ID="rdiLeaderAccept" runat="server" RepeatColumns="1" RepeatDirection="Vertical" RepeatLayout="Flow">
                <asp:ListItem Text="รับรอง" Value="Y" Selected="True"></asp:ListItem>
                <asp:ListItem Text="ไม่รับรอง" Value="N" ></asp:ListItem>
            </asp:RadioButtonList>
            <asp:TextBox ID="txtLeaderDenyReason" runat="server" Height="23px" Width="250px" ></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td class="style1" >ลงชื่อ :</td>
        <td class="style2">
            <table width="250px" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <asp:Label ID="lblLeaderName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                        <asp:Label ID="lblLeaderStaffID" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblLeaderPoscode" runat="server" Visible="false"></asp:Label>
                    </td>
                    
                    <td>
                        <asp:Button ID="btnSearchLeaderStaff" runat="server" Text="..." Width="25px" Height="23px" />
                        <uc9:frmSearchStaff ID="frmSearchLeaderStaff" runat="server" />
                    </td>
                </tr>
            </table>
        </td>
        <td class="style1">ตำแหน่ง :</td>
        <td class="style2">
            <asp:Label ID="lblLeaderPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
        </td>
    </tr>
</table>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            ผู้อำนวยการส่วน หรือตำแหน่งเทียบเท่า
        </td>
    </tr>
</table>

<table cellspacing="0" cellpadding="0" border="0"  width="95%"  >
    <tr>
        <td style="width:20%" >&nbsp;</td>
        <td style="width:25%" >&nbsp;</td>
        <td style="width:15%" >&nbsp;</td>
        <td style="width:40%" >&nbsp;</td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            เรียน :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtSectionDirectorLean" runat="server" Height="23px" Width="250px" ></asp:TextBox>
            <asp:Label ID="Label5" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td colspan="3">
            <asp:RadioButtonList ID="rdiSectionDirectorAccept" runat="server" RepeatColumns="1" RepeatDirection="Vertical" RepeatLayout="Flow">
                <asp:ListItem Text="รับรอง" Value="Y" Selected="True"></asp:ListItem>
                <asp:ListItem Text="ไม่รับรอง" Value="N" ></asp:ListItem>
            </asp:RadioButtonList>
            <asp:TextBox ID="txtSectionDirectorDenyReason" runat="server" Height="23px" Width="250px" ></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td class="style1" >ลงชื่อ :</td>
        <td class="style2">
            <table width="250px" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <asp:Label ID="lblSectionDirectorName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                        <asp:Label ID="lblSectionDirectorStaffID" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblSectionDirectorPoscode" runat="server" Visible="false"></asp:Label>
                    </td>
                    
                    <td>
                        <asp:Button ID="btnSearchSectionDirectorStaff" runat="server" Text="..." Width="25px" Height="23px" />
                        <uc9:frmSearchStaff ID="frmSearchSectionDirectorStaff" runat="server" />
                    </td>
                </tr>
            </table>
        </td>
        <td class="style1">ตำแหน่ง :</td>
        <td class="style2">
            <asp:Label ID="lblSectionDirectorPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
        </td>
    </tr>
</table>


<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            ผู้อำนวยการสำนัก หรือตำแหน่งเทียบเท่า
        </td>
    </tr>
</table>

<table cellspacing="0" cellpadding="0" border="0"  width="95%"  >
    <tr>
        <td style="width:20%" >&nbsp;</td>
        <td style="width:25%" >&nbsp;</td>
        <td style="width:15%" >&nbsp;</td>
        <td style="width:40%" >&nbsp;</td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td colspan="3">
            <asp:RadioButtonList ID="rdiResDirectorAccept" runat="server" RepeatColumns="1" RepeatDirection="Vertical" RepeatLayout="Flow">
                <asp:ListItem Text="รับรอง" Value="Y" Selected="True"></asp:ListItem>
                <asp:ListItem Text="ไม่รับรอง" Value="N" ></asp:ListItem>
            </asp:RadioButtonList>
            <asp:TextBox ID="txtResDirectorDenyReason" runat="server" Height="23px" Width="250px" ></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td class="style1" >ลงชื่อ :</td>
        <td class="style2">
            <table width="250px" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <asp:Label ID="lblResDirectorName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                        <asp:Label ID="lblResDirectorStaffID" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblResDirectorPoscode" runat="server" Visible="false"></asp:Label>
                    </td>
                    <td>
                        <asp:Button ID="btnSearchResDirectorStaff" runat="server" Text="..." Width="25px" Height="23px" />
                        <uc9:frmSearchStaff ID="frmSearchResDirectorStaff" runat="server" />
                    </td>
                </tr>
                
            </table>
        </td>
        <td class="style1">ตำแหน่ง :</td>
        <td class="style2">
            <asp:Label ID="lblResDirectorPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
        </td>
    </tr>
</table>