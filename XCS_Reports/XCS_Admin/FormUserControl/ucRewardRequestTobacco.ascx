<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="ucRewardRequestTobacco.ascx.vb" Inherits="XCS_Admin.ucRewardRequestTobacco" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="../UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="../UserControls/txtTime.ascx" TagName="txtTime" TagPrefix="uc2" %>
<%@ Register src="../PopupUserControl/frmPopArrestTeam.ascx" tagname="frmPopArrestTeam" tagprefix="uc7" %>
<%@ Register src="../PopupUserControl/frmSearchStaff.ascx" tagname="frmSearchStaff" tagprefix="uc9" %>


<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            บันทึกการรับรองผล
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
        <td class="style1" >เจ้าหน้าที่ดำเนินคดี/<br />ผู้มีอำนาจเปรียบเทียบ :</td>
        <td class="style2">
            <asp:Label ID="lblSueStaffName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
        </td>
        <td class="style1">ตำแหน่ง :</td>
        <td class="style2">
            <asp:Label ID="lblSueStaffPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            เปรียบเทียบปรับเป็นเงิน :
        </td>
        <td class="style2"  >
            <asp:Label ID="lblCaseTotalFine" runat="server" BackColor="Silver" Width="200px" Height="20px"  ></asp:Label> บาท <br />
            (<asp:Label ID="alCaseTotalFine" runat="server"></asp:Label>)
        </td>
        <td class="style1">
            เงินรางวัล <asp:Label ID="lblRewardP" runat="server" Width="20px" Height="20px"  ></asp:Label> % เป็นเงิน :
        </td>
        <td class="style2" colspan="3" >
            <asp:Label ID="lblRewardMoney" runat="server" BackColor="Silver" Width="200px" Height="20px" ></asp:Label> บาท <br />
            (<asp:Label ID="alRewardText" runat="server"></asp:Label>)
        </td>     
    </tr>
    <tr style="height:30px">
        <td class="style1" >ชื่อผู้จับกุม :</td>
        <td class="style2">
            <table width="250px" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <asp:Label ID="lblAccuserName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                        <asp:Label ID="lblAccuserStaffID" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblAccuserPoscode" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblAccuserOffcode" runat="server" Visible="false"></asp:Label>
                    </td>
                    <td>
                        <asp:Button ID="btnSearchAccuserStaff" runat="server" Text="..." Width="25px" Height="23px" />
                        <uc9:frmSearchStaff ID="frmSearchAccuserStaff" runat="server" />
                    </td>
                </tr>
            </table>
        </td>
        <td class="style1">ตำแหน่ง :</td>
        <td class="style2">
            <asp:Label ID="lblAccuserPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            ความเห็นอื่น :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtLawerOpinion" runat="server" Width="550px" Height="50px" TextMode="MultiLine"></asp:TextBox>
        </td>
    </tr>
</table>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            ความเห็นของผู้อำนวยการสำนักกฎหมาย
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
            ตำแหน่ง :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtDirectorPosition" runat="server" Height="23px" Width="250px" ></asp:TextBox>
            <asp:Label ID="Label4" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            ความเห็นอื่น :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtDirectorOpinion" runat="server" Width="550px" Height="50px" TextMode="MultiLine"></asp:TextBox>
        </td>
    </tr>
</table>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            คำสั่ง
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
            คำสั่ง :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtCommand" runat="server" Width="550px" Height="50px" TextMode="MultiLine"></asp:TextBox>
        </td>
    </tr>
</table>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            ลายมือชื่อของผู้รับรางวัล
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
            ความเห็นอื่น :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtArrestOpinion" runat="server" Width="550px" Height="50px" TextMode="MultiLine"></asp:TextBox>
        </td>
    </tr>
</table>