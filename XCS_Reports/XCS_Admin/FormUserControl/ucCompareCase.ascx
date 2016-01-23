<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="ucCompareCase.ascx.vb" Inherits="XCS_Admin.ucCompareCase" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="../UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="../UserControls/txtTime.ascx" TagName="txtTime" TagPrefix="uc2" %>
<%@ Register src="../PopupUserControl/frmSearchStaff.ascx" tagname="frmSearchStaff" tagprefix="uc9" %>

    
    <asp:Label ID="lblTrackNo" runat="server" Visible="false"></asp:Label>
    <asp:Label ID="lblBookImpeachmentID" runat="server" Visible="false" Text="0" ></asp:Label>
    <asp:Label ID="lblIsNotice" runat="server" Visible="false" Text="N"></asp:Label>
    <asp:Label ID="lblLegislationID" runat="server" Visible="false" Text="0" ></asp:Label>
    <asp:Label ID="lblLawbreakerQty" runat="server" Visible="false" Text="0"></asp:Label>
    <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr style="height:20px">
            <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
                ที่ทำการเปรียบเทียบ
            </td>
        </tr>
    </table>
    <table cellspacing="0" cellpadding="0" border="0"  width="95%"  >
        <tr style="height:30px" >
            <td style="width:25%" class="style1" >
                คดีเปรียบเทียบที่ :
            </td>
            <td style="width:30%" class="style2">
                <asp:Label ID="lblCompareCaseNonOffice" runat="server" Text="น" Font-Bold="True"  Visible="False" ></asp:Label>
                <asp:TextBox ID="txtCompareCaseNo1" runat="server" Height="23px" Width="50px" ></asp:TextBox>
                /
                <asp:TextBox ID="txtCompareCaseNo2" runat="server" Height="23px" Width="80px" MaxLength="4" ></asp:TextBox>
                <asp:Label ID="Label29" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
            <td style="width:20%" class="style1">
                วันที่ :
            </td>
            <td style="width:25%" class="style2">
                <uc1:txtDate ID="txtCompareCaseDate" runat="server" IsNotNull="true" />
            </td>
        </tr>
        <tr style="height:30px">
            <td >&nbsp;</td>
            <td >
                <asp:CheckBox ID="chkNoneOffice" runat="server" Text="คดีจับกุมนอกสถานที่" Enabled="false" />
            </td>
            <td colspan="2">&nbsp;</td>
        </tr>
        <tr style="height:30px" >
            <td class="style1" >ที่ทำการเปรียบเทียบ : </td>
            <td class="style2" >
                <asp:DropDownList ID="ddlCompareOffice" runat="server" Height="23px" 
                    Width="260px" DataTextField="short_name" DataValueField="offcode" 
                    AutoPostBack="True">
                </asp:DropDownList>
                <asp:TextBox ID="txtCompareOffice" runat="server" Height="23px" Width="250px" Visible="false" ></asp:TextBox>
                <asp:Label ID="Label42" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
            <td class="style1"  >ชื่อผู้กล่าวหา : </td>
            <td class="style2"  >
                <asp:Label ID="lblAccuserName" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
            </td>
        </tr>
        
        <tr style="height:30px" >
            <td class="style1">จังหวัด : </td>
            <td class="style2">
                <asp:DropDownList ID="ddlCompareProvince" runat="server" Height="23px" 
                    Width="260px" AutoPostBack="True" DataTextField="province_name" 
                    DataValueField="province_code">
                </asp:DropDownList>
                <asp:Label ID="Label46" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
            <td class="style1">จังหวัด : </td>
            <td class="style2">
                <asp:DropDownList ID="ddlAccuserProvince" runat="server" Height="23px" 
                    Width="260px" AutoPostBack="True" DataTextField="province_name" 
                    DataValueField="province_code">
                </asp:DropDownList>
            </td>
        </tr>
        <tr style="height:30px">
            <td class="style1">อำเภอ : </td>
            <td class="style2">
                <asp:DropDownList ID="ddlCompareDistrict" runat="server" Height="23px" 
                    Width="260px" AutoPostBack="True" DataTextField="district_Name" 
                    DataValueField="district_code">
                </asp:DropDownList>
                <asp:Label ID="Label47" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
            <td class="style1">อำเภอ : </td>
            <td class="style2">
                <asp:DropDownList ID="ddlAccuserDistrict" runat="server" Height="23px" 
                    Width="260px" AutoPostBack="True" DataTextField="district_Name" 
                    DataValueField="district_code">
                </asp:DropDownList>
            </td>
        </tr>
        <tr style="height:30px">
            <td class="style1">ตำบล : </td>
            <td class="style2">
                <asp:DropDownList ID="ddlCompareSubDistrict" runat="server" Height="23px" 
                    Width="260px" DataTextField="subdistrict_name" 
                    DataValueField="subdistrict_code">
                </asp:DropDownList>
                <asp:Label ID="Label48" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
            <td class="style1">ตำบล : </td>
            <td class="style2">
                <asp:DropDownList ID="ddlAccuserSubdistrict" runat="server" Height="23px" 
                    Width="260px" DataTextField="subdistrict_name" 
                    DataValueField="subdistrict_code">
                </asp:DropDownList>
            </td>
        </tr>
        <tr style="height:30px" >
            <td class="style1"  >ผู้ดำเนินการเปรียบเทียบ : </td>
            <td class="style2" colspan="3" >
                <asp:RadioButtonList ID="rdiManageType" runat="server" RepeatColumns="2" RepeatLayout="Table" AutoPostBack="true" >
                    <asp:ListItem Value="1" Text="ผู้มีอำนาจโดยตรง" ></asp:ListItem>
                    <asp:ListItem Value="2" Text="เจ้าหน้าที่ดำเนินคดี" Selected="True"></asp:ListItem>
                </asp:RadioButtonList>
            </td>
        </tr>
        <tr style="height:30px" >
            <td class="style1"  >เจ้าหน้าที่ดำเนินคดี/<br />ผู้มีอำนาจเปรียบเทียบ : </td>
            <td class="style2"  >
                <table border="0" cellpadding="0" cellspacing="0" width="300px">
                    <tr>
                        <td >
                            <asp:Label ID="lblSueStaffName" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
                            <asp:Label ID="lblSueStaffID" runat="server" Visible="False"></asp:Label>
                            <asp:Label ID="lblSueStaffPoscode" runat="server" Visible="False"></asp:Label>
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
            <td class="style1" >อำนาจในการเปรียบเทียบ : </td>
            <td class="style2">
                <asp:DropDownList ID="ddlCompareAuthority" runat="server" Height="23px" Width="260px"
                    DataTextField="authority_name" DataValueField="id" Enabled="false" ></asp:DropDownList>
            </td>
        </tr>
    </table>
    
    <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr style="height:20px">
            <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
                เปรียบเทียบคดี
            </td>
        </tr>
    </table>
        
    <table cellspacing="0" cellpadding="0" border="0"  width="95%"  >  
        <tr>
            <td style="width:25%">&nbsp;</td>
            <td style="width:30%">&nbsp;</td>
            <td style="width:20%">&nbsp;</td>
            <td style="width:25%">&nbsp;</td>
        </tr>
        <tr style="height:30px">
            <td class="style1" valign="top">ข้อกล่าวหา : </td>
            <td class="style2" colspan="3" valign="top">
                <asp:DropDownList ID="ddlIndictment" runat="server" Height="23px" Width="670px"
                    DataTextField="indictment_name" DataValueField="indictment_id" AutoPostBack="true" ></asp:DropDownList>
                <asp:Label ID="Label1" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
        </tr>

        <tr style="height:30px">
            <td class="style1" >มาตรา : </td>
            <td class="style2">
                <asp:Label ID="lblCaseLawID" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
            </td>
            <td class="style1" >บทกำหนดโทษ : </td>
            <td class="style2">
                <asp:Label ID="lblPenaltyDesc" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
            </td>
        </tr>
        <tr >
            <td class="style1" >การดำเนินการ : </td>
            <td class="style2" colspan="3" >
                <asp:TextBox ID="txtAdministration" runat="server" Width="670px" Height="95px" TextMode="MultiLine"></asp:TextBox>
                <asp:Label ID="Label2" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
        </tr>
        <tr>
            <td class="style1" >คำให้การของผู้กล่าวโทษ  : </td>
            <td class="style2" colspan="3" >
                <asp:TextBox ID="txtAccuserTestimony" runat="server" Width="670px" Height="95px" TextMode="MultiLine"></asp:TextBox>
                <asp:Label ID="Label3" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
        </tr>
        
        <tr style="height:30px">
            <td class="style1" >เลขที่คดี (สมุดรับคำกล่าวโทษ) : </td>
            <td class="style2">
                <asp:Label ID="lblCaseID" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
            </td>
            <td class="style1" >วันที่รับคำกล่าวโทษ : </td>
            <td class="style2">
                <asp:Label ID="lblCaseDate" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
            </td>
        </tr>
        
        <tr style="height:30px">
            <td class="style1" >ค่าปรับของคดีต่อคน : </td>
            <td class="style2">
                <asp:TextBox ID="txtCaseFine" runat="server" Height="23px" Width="250px" AutoPostBack="true" ></asp:TextBox>
            </td>
            <td class="style1" >มูลค่าภาษีพิสูจน์ : </td>
            <td class="style2">
                <asp:Label ID="lblTaxVal" runat="server" BackColor="Silver" Width="250px" Height="20px"  ></asp:Label>
            </td>
        </tr>
    
    </table>

    <table border="0" cellpadding="0" cellspacing="0" width="100%">
        <tr style="height:20px">
            <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
                รายละเอียดเงินค่าปรับ /เงินสินบนและเงินรางวัล
            </td>
        </tr>
    </table>
    <table cellspacing="0" cellpadding="0" border="0"  width="80%"  >  
        <tr>
            <td style="width:30%">&nbsp;</td>
            <td style="width:30%">&nbsp;</td>
            <td style="width:20%">&nbsp;</td>
            <td style="width:20%">&nbsp;</td>
        </tr>
        <tr style="height:30px">
            <td class="style1" >ค่าปรับเปรียบเทียบคดีรวม : </td>
            <td class="style2" >
                <span style="text-align:right">
                    <asp:Label ID="lblCaseTotalFine" runat="server" BackColor="Silver" Width="150px" Height="20px" Text="0.00"   ></asp:Label>
                </span>
            </td>
            <td class="style1" >วันที่ชำระ : </td>
            <td class="style2">
                <asp:Label ID="lblPayDate" runat="server" BackColor="Silver" Width="150px" Height="20px"  ></asp:Label>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td colspan="3">
                <asp:Button ID="btnCalFine" runat="server" Text="คำนวณ % การแบ่งเงิน" Width="150px" Height="30px"/>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td colspan="3">
                <table border="0" cellpadding="0" cellspacing="0" width="60%">
                    <tr style="height:30px">
                        <td>เงินส่งคลัง</td>
                        <td>
                            <asp:TextBox ID="txtTreasuryP" runat="server" Height="23px" Width="40px" CssClass="styleRight" MaxLength="3" AutoPostBack="true" ></asp:TextBox>%
                        </td>
                        <td>
                            <asp:Label ID="lblTreasury" runat="server" BackColor="Silver" Width="100px" Height="20px" CssClass="styleRight" ></asp:Label>
                        </td>
                        <td>
                            <asp:TextBox ID="txtTreasuryMoney" runat="server" Height="23px" Width="100px" CssClass="styleRight" AutoPostBack="true" ></asp:TextBox>
                        </td>
                    </tr>
                    
                    <tr style="height:30px">
                        <td>เงินสินบน</td>
                        <td>
                            <asp:TextBox ID="txtBribeP" runat="server" Height="23px" Width="40px" CssClass="styleRight" MaxLength="3"  AutoPostBack="true" ></asp:TextBox>%
                        </td>
                        <td>
                            <asp:Label ID="lblBribe" runat="server" BackColor="Silver" Width="100px" Height="20px" CssClass="styleRight" ></asp:Label>
                        </td>
                        <td>
                            <asp:TextBox ID="txtBribeMoney" runat="server" Height="23px" Width="100px" CssClass="styleRight" AutoPostBack="true" ></asp:TextBox>
                        </td>
                    </tr>
                    
                    <tr style="height:30px">
                        <td>เงินรางวัล</td>
                        <td>
                            <asp:TextBox ID="txtRewardP" runat="server" Height="23px" Width="40px" CssClass="styleRight" MaxLength="3" AutoPostBack="true" ></asp:TextBox>%
                        </td>
                        <td>
                            <asp:Label ID="lblReward" runat="server" BackColor="Silver" Width="100px" Height="20px" CssClass="styleRight" ></asp:Label>
                        </td>
                        <td>
                            <asp:TextBox ID="txtRewardMoney" runat="server" Height="23px" Width="100px" CssClass="styleRight" AutoPostBack="true" ></asp:TextBox>
                        </td>
                    </tr>
                    <tr style="height:30px">
                        <td><b>รวม</b></td>
                        <td>
                            <asp:Label ID="lblAllP" runat="server" BackColor="Silver" Width="40px" Height="20px" CssClass="styleRight" ></asp:Label>%
                        </td>
                        <td>
                            <asp:Label ID="lblAll" runat="server" BackColor="Silver" Width="100px" Height="20px" CssClass="styleRight" ></asp:Label>
                        </td>
                        <td>
                            <asp:Label ID="lblAllMoney" runat="server" BackColor="Silver" Width="100px" Height="20px" CssClass="styleRight" ></asp:Label>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>


