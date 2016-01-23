<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="frmApplicationRewardDivide.aspx.vb" Inherits="XCS_Admin.frmApplicationRewardDivide" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="UserControls/txtTime.ascx" TagName="txtTime" TagPrefix="uc2" %>
<%@ Register src="PopupUserControl/frmPopArrestTeam.ascx" tagname="frmPopArrestTeam" tagprefix="uc7" %>
<%@ Register src="PopupUserControl/frmSearchStaff.ascx" tagname="frmSearchStaff" tagprefix="uc9" %>
<%@ Register src="FormUserControl/ucRewardDivideTax.ascx" tagname="ucRewardDivideTax" tagprefix="uc3" %>
<%@ Register src="FormUserControl/ucRewardDivideAlcohol.ascx" tagname="ucRewardDivideAlcohol" tagprefix="uc4" %>
<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
    <meta http-equiv="x-ua-compatible" content="IE=9" />
    <script language="javascript" src="_Script/JScript.js" type="text/javascript"></script>
    <script language="javascript" src="_Script/datetimepicker_css.js" type="text/javascript"></script>
    <link href="_Script/StyleSheet.css" rel="stylesheet" type="text/css" />
    <style type="text/css">
        div.color
        {
            border-top-width: 3px;
            border-top-style: solid;
            border-top-color: #ff9900;
        }
        .style1
        {
            text-align: right;
            height: 25;
            font-family: Tahoma;
            font-size: 10pt;
        }
        .style2
        {
            text-align: left;
            height: 25;
            font-family: Tahoma;
            font-size: 10pt;
        }
        .style3
        {
            text-align: left;
            font-family: MS Sans Serif;
            font-size: 14;
            width: 161px;
            height: 25;
        }
        .style4
        {
            text-align: left;
            font-family: MS Sans Serif;
            font-size: 14;
            width: 265px;
            height: 100;
        }
        .style5
        {
            text-align: right;
            font-family: "MS Sans Serif";
            font-size: 14;
            width: 215px;
            height: 25px;
        }
        .style6
        {
            text-align: left;
            font-family: MS Sans Serif;
            font-size: 14;
            height: 25px;
        }
        .style7
        {
            text-align: left;
            font-family: MS Sans Serif;
            font-size: 14;
            height: 25;
            width: 305px;
        }
        .styleRight
        {
            text-align: right;
            height: 25;
            font-family: Tahoma;
            font-size: 10pt;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <cc1:ToolkitScriptManager ID="ScriptManager1" runat="server" >
    </cc1:ToolkitScriptManager>
    <div id="div1" style="font-size: 30px; color: #723373;">
        แบ่งเงินสินบนและรางวัล
    </div>
    <div id="div2" style="height: 20px">
    </div>
    <div id="div4">
        <asp:UpdatePanel ID="UpdatePanel1" runat="server">
            <ContentTemplate>
                <table border="0" cellspacing="1" width="100%">
                    <tr>
                        <td style="width:15%" >
                            &nbsp;
                        </td>
                        <td style="width:25%">
                            &nbsp;
                        </td>
                        <td style="width:15%">
                            &nbsp;
                        </td>
                        <td style="width:45%">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td class="style1" >เลขที่งาน : </td>
                        <td class="style2">
                            <asp:TextBox ID="txtDivideNo" runat="server" Height="23px" Width="150px"></asp:TextBox>
                            &nbsp;<asp:Button ID="btnSearchData" runat="server" Text="ค้นหา" Width="48px" Height="20px" />
                            <asp:Label ID="Label39" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                            <asp:Label ID="lblLoginHisID" runat="server" Visible="false" Text="0"></asp:Label>
                            <asp:Label ID="lblRewardDivideID" runat="server" Visible="false" Text="0"></asp:Label>
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label16" runat="server" Text="วันที่แบ่งเงินรางวัล :"></asp:Label>
                        </td>
                        <td class="style2">
                            <uc1:txtDate ID="txtDivideDate" runat="server" />
                            <asp:Label ID="Label50" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <asp:Label ID="Label1" runat="server" Text="วันที่รับเงินรางวัล :"></asp:Label>
                        </td>
                        <td class="style2">
                            <uc1:txtDate ID="txtReceiveDate" runat="server" />
                            <asp:Label ID="Label2" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">คดีเปรียบเทียบที่ :</td>
                        <td class="style2" >
                            <asp:Label ID="lblCompareCaseNo" runat="server" BackColor="Silver" Width="100px" Height="23px"></asp:Label>
                        </td>
                        <td class="style1">วันที่เปรียบเทียบปรับ :</td>
                        <td class="style2" >
                            <asp:Label ID="lblCompareCaseDate" runat="server" BackColor="Silver" Width="100px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">พ.ร.บ. :</td>
                        <td class="style2" >
                            <asp:Label ID="lblLegislationName" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                            <asp:Label ID="lblLegislationID" runat="server" Visible="false" Text="0"></asp:Label>
                        </td>
                        <td class="style1">หน่วยงาน :</td>
                        <td class="style2" >
                            <asp:Label ID="lblOffname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                        </td>
                    </tr>

                    <tr>
                        <td class="style1">เงินค่าปรับ :</td>
                        <td class="style2" >
                            <asp:Label ID="lblCaseTotalFine" runat="server" BackColor="Silver" Width="150px" Height="23px"></asp:Label>
                        </td>
                        <td class="style1">ผู้กล่าวโทษ :</td>
                        <td class="style2" >
                            <asp:Label ID="lblAccuserName" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">เงินสินบน :</td>
                        <td class="style2" >
                            <asp:Label ID="lblBribeMoney" runat="server" BackColor="Silver" Width="150px" Height="23px"></asp:Label>
                        </td>
                        <td class="style1">ผู้ต้องหา :</td>
                        <td class="style2" >
                            <asp:Label ID="lblLawbreakerName" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    
                    <tr>
                        <td class="style1">เงินรางวัล :</td>
                        <td class="style2" colspan="3" >
                            <asp:Label ID="lblRewardMoney" runat="server" BackColor="Silver" Width="150px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">เงินส่งคลัง :</td>
                        <td class="style2" colspan="3" >
                            <asp:Label ID="lblTreasuryMoney" runat="server" BackColor="Silver" Width="150px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <uc3:ucRewardDivideTax ID="ucRewardDivideTax1" runat="server" />
                    <uc4:ucRewardDivideAlcohol ID="ucRewardDivideAlcohol1" runat="server" />
                    <tr>
                        <td class="style1">
                            หมายเหตุ :</td>
                        <td class="style2" colspan="3">
                            <asp:TextBox ID="txtRemark" runat="server" Height="50px" TextMode="MultiLine" 
                                Width="550px"></asp:TextBox>
                        </td>
                    </tr>
                </table>
                
            </ContentTemplate>
        </asp:UpdatePanel>
    </div>
    <br />
    <div id="div8" style=" text-align:center;width:1000px" >
         <asp:UpdatePanel ID="UpdatePanel7" runat="server">
             <ContentTemplate>
              <asp:Button ID="btnSave" runat="server" Text="บันทึก" Width="70px"  Height="30px"/>
             </ContentTemplate>
         </asp:UpdatePanel>
     </div>
    </form>
</body>
</html>
