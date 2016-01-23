<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="frmApplicationRewardRequest.aspx.vb" Inherits="XCS_Admin.frmApplicationRewardRequest" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="UserControls/txtTime.ascx" TagName="txtTime" TagPrefix="uc2" %>
<%@ Register src="PopupUserControl/frmPopArrestTeam.ascx" tagname="frmPopArrestTeam" tagprefix="uc7" %>
<%@ Register src="PopupUserControl/frmSearchStaff.ascx" tagname="frmSearchStaff" tagprefix="uc9" %>
<%@ Register src="FormUserControl/ucRewardRequestAlcohol.ascx" tagname="ucRewardRequestAlcohol" tagprefix="uc3" %>
<%@ Register src="FormUserControl/ucRewardRequestTax.ascx" tagname="ucRewardRequestTax" tagprefix="uc4" %>
<%@ Register src="FormUserControl/ucRewardRequestTobacco.ascx" tagname="ucRewardRequestTobacco" tagprefix="uc5" %>

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
    <meta http-equiv="x-ua-compatible" content="IE=9" >
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
        คำร้องขอรับเงินสินบนและรางวัล
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
                        <td class="style1" >
                            <asp:Label ID="Label1" runat="server" Text="เลขที่เอกสาร :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:TextBox ID="txtRequestNo" runat="server" Height="23px" Width="150px"></asp:TextBox>
                            &nbsp;<asp:Button ID="btnSearchData" runat="server" Text="ค้นหา" Width="48px" Height="20px" />
                            <asp:Label ID="Label39" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                            <asp:Label ID="lblLoginHisID" runat="server" Visible="false" Text="0"></asp:Label>
                            <asp:Label ID="lblApplicationRewardRequestID" runat="server" Visible="false" Text="0"></asp:Label>
                            
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label16" runat="server" Text="วันที่ :"></asp:Label>
                        </td>
                        <td class="style2">
                            <uc1:txtDate ID="txtRequestDate" runat="server" />
                            <asp:Label ID="Label50" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                    </tr>
                </table>
                
                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr style="height:20px">
                        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
                            คำร้องขอรับเงินรางวัล
                        </td>
                    </tr>
                </table>
                
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
                        <td class="style1">พ.ร.บ. :</td>
                        <td class="style2" colspan="3" >
                            <asp:Label ID="lblLegislationName" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                            <asp:Label ID="lblLegislationID" runat="server" Visible="false" Text="0"></asp:Label>
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
                        <td class="style1">ชื่อผู้ต้องหา :</td>
                        <td class="style2" >
                            <asp:Label ID="lblLawbreakerName" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                        </td>
                        <td class="style1">ชื่อผู้กล่าวหา :</td>
                        <td class="style2" >
                            <asp:Label ID="lblAccuserName" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">ความผิดฐาน :</td>
                        <td class="style2" colspan="3" >
                            <asp:Label ID="lblGuiltBase" runat="server" BackColor="Silver" Width="690px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">มาตรา :</td>
                        <td class="style2" >
                            <asp:Label ID="lblCaseLawID" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                        </td>
                        <td class="style1">บทกำหนดโทษ :</td>
                        <td class="style2" >
                            <asp:Label ID="lblPenaltyCaseLawID" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">สถานที่เกิดเหตุ :</td>
                        <td class="style2" colspan="3" >
                            <asp:Label ID="lblSceneAddress" runat="server" BackColor="Silver" Width="690px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">ชื่อผู้ร้องขอ/ผู้จับกุม :</td>
                        <td class="style2" >
                            <asp:Label ID="lblRequestName" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                            <asp:Button ID="btnSearchRequestStaff" runat="server" Text="..." Width="25px" Height="21px" />
                            <uc9:frmSearchStaff ID="frmSearchRequestStaff" runat="server" />
                            <asp:Label ID="Label30" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                            <asp:Label ID="lblRequestStaffID" runat="server" Visible="false"></asp:Label>
                            <asp:Label ID="lblRequestPoscode" runat="server" Visible="false"></asp:Label>
                        </td>
                        <td class="style1">ตำแหน่ง :</td>
                        <td class="style2" >
                            <asp:Label ID="lblRequestPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <tr><td colspan="4">&nbsp;</td></tr>
                </table>
                
                <table border="0" cellspacing="1" width="100%">
                    <tr>
                        <td class="style1" valign="top" style="width:15%" >ผู้ร่วมจับกุม</td>
                        <td class="style2" style="width:85%" >
                            <asp:GridView ID="gvArrestCo" runat="server" AutoGenerateColumns="False" AllowSorting="false"
                                CssClass="GridViewStyle" Width="85%">
                                <RowStyle CssClass="RowStyle" />
                                <EmptyDataTemplate>
                                    <table width="650px">
                                        <tr class="HeaderStyle" style="height:30px" >
                                            <td style="width:60px;text-align:center;" >ลำดับที่</td>
                                            <td style="width:60px" >&nbsp;</td>
                                            <td style="width:250px;text-align:center;" >ชื่อ-สกุล</td>
                                            <td style="width:250px;text-align:center;" >ตำแหน่ง</td>
                                        </tr>
                                    </table>
                                </EmptyDataTemplate>
                                <Columns>
                                    <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                                        <HeaderStyle HorizontalAlign="Center" Width="60px" />
                                        <ItemStyle HorizontalAlign="Center" Width="60px" />
                                    </asp:BoundField>
                                    <asp:TemplateField ShowHeader="false">
                                        <HeaderTemplate>
                                            <asp:CheckBox ID="chkH" runat="server" OnCheckedChanged="chkH_OnCheckedChanged" AutoPostBack="true" /></HeaderTemplate>
                                        <ItemTemplate>
                                            <asp:CheckBox ID="chk" runat="server" />
                                            <asp:Label ID="lblidcard_no" runat="server" Text='<%# Eval("STAFF_IDCARDNO") %>' Visible="false"></asp:Label>
                                            <asp:Label ID="lblposcode" runat="server" Text='<%# Eval("STAFF_POSCODE") %>' Visible="false"></asp:Label>
                                            <asp:Label ID="lbloffcode" runat="server" Text='<%# Eval("STAFF_OFFCODE") %>' Visible="false"></asp:Label>
                                            <asp:Label ID="lblstafflevel" runat="server" Text='<%# Eval("STAFF_LEVEL") %>' Visible="false"></asp:Label>
                                        </ItemTemplate>
                                        <HeaderStyle Width="30px" />
                                        <ItemStyle HorizontalAlign="Center" Width="30px" />
                                    </asp:TemplateField>
                                    <asp:TemplateField HeaderText="ชื่อ-สกุล">
                                        <ItemTemplate>
                                            <asp:Label ID="lblfullname" runat="server" Text='<%# Eval("fullname") %>'></asp:Label></ItemTemplate>
                                        <HeaderStyle Width="250px" />
                                        <ItemStyle HorizontalAlign="left" Width="250px" />
                                    </asp:TemplateField>
                                    <asp:TemplateField HeaderText="ตำแหน่ง">
                                        <ItemTemplate>
                                            <asp:Label ID="lblposname" runat="server" Text='<%# Eval("posname") %>'></asp:Label></ItemTemplate>
                                        <HeaderStyle />
                                        <ItemStyle HorizontalAlign="left" />
                                    </asp:TemplateField>
                                    <asp:TemplateField  Visible="false" >
                                        <ItemTemplate>
                                            <asp:Label ID="lbloffname" runat="server" Text='<%# Eval("offname") %>'></asp:Label></ItemTemplate>
                                        <HeaderStyle  />
                                        <ItemStyle HorizontalAlign="left"  />
                                    </asp:TemplateField>
                                </Columns>
                                <PagerStyle CssClass="PagerStyle" />
                                <PagerSettings Visible="false" />
                                <HeaderStyle CssClass="HeaderStyle" />
                                <AlternatingRowStyle CssClass="AltRowStyle" />
                            </asp:GridView>
                        </td>
                    </tr>
                    <tr>
                        <td  >&nbsp;</td>
                        <td  >
                            &nbsp;<asp:Button ID="btnCoStaffList" runat="server" Text="เพิ่มใหม่"
                                Width="69px" /><uc7:frmPopArrestTeam ID="frmPopArrestCo" runat="server" />
                            &nbsp;<asp:Button ID="btnDeleteCoStaffList" runat="server" Text="ลบรายการ" />
                        </td>
                    </tr>
                    <tr><td colspan="2">&nbsp;</td></tr>
                    <tr><td colspan="2">&nbsp;</td></tr>
                </table>
                
                <table border="0" cellspacing="1" width="100%">
                    <tr>
                        <td class="style1" valign="top" style="width:15%" >ผู้สั่งการ</td>
                        <td class="style2"  style="width:85%" >
                            <asp:GridView ID="gvArrestCommand" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                                CssClass="GridViewStyle" Width="85%">
                                <RowStyle CssClass="RowStyle" />
                                <EmptyDataTemplate>
                                    <table width="650px">
                                        <tr class="HeaderStyle" style="height:30px" >
                                            <td style="width:60px;text-align:center;" >ลำดับที่</td>
                                            <td style="width:60px" >&nbsp;</td>
                                            <td style="width:250px;text-align:center;" >ชื่อ-สกุล</td>
                                            <td style="width:250px;text-align:center;" >ตำแหน่ง</td>
                                        </tr>
                                    </table>
                                </EmptyDataTemplate>
                                <Columns>
                                    <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                                        <HeaderStyle HorizontalAlign="Center" Width="60px" />
                                        <ItemStyle HorizontalAlign="Center" Width="60px" />
                                    </asp:BoundField>
                                    <asp:TemplateField ShowHeader="false">
                                        <HeaderTemplate>
                                            <asp:CheckBox ID="chkH" runat="server" OnCheckedChanged="chkH_OnCheckedChanged" AutoPostBack="true" /></HeaderTemplate>
                                        <ItemTemplate>
                                            <asp:CheckBox ID="chk" runat="server" />
                                            <asp:Label ID="lblidcard_no" runat="server" Text='<%# Eval("STAFF_IDCARDNO") %>' Visible="false"></asp:Label>
                                            <asp:Label ID="lblposcode" runat="server" Text='<%# Eval("STAFF_POSCODE") %>' Visible="false"></asp:Label>
                                            <asp:Label ID="lbloffcode" runat="server" Text='<%# Eval("STAFF_OFFCODE") %>' Visible="false"></asp:Label>
                                            <asp:Label ID="lblstafflevel" runat="server" Text='<%# Eval("STAFF_LEVEL") %>' Visible="false"></asp:Label>
                                        </ItemTemplate>
                                        <HeaderStyle Width="30px" />
                                        <ItemStyle HorizontalAlign="Center" Width="30px" />
                                    </asp:TemplateField>
                                    <asp:TemplateField HeaderText="ชื่อ-สกุล">
                                        <ItemTemplate>
                                            <asp:Label ID="lblfullname" runat="server" Text='<%# Eval("fullname") %>'></asp:Label></ItemTemplate>
                                        <HeaderStyle Width="250px" />
                                        <ItemStyle HorizontalAlign="left" Width="250px" />
                                    </asp:TemplateField>
                                    <asp:TemplateField HeaderText="ตำแหน่ง">
                                        <ItemTemplate>
                                            <asp:Label ID="lblposname" runat="server" Text='<%# Eval("posname") %>'></asp:Label></ItemTemplate>
                                        <HeaderStyle  />
                                        <ItemStyle HorizontalAlign="left"  />
                                    </asp:TemplateField>
                                    <asp:TemplateField  Visible="false" >
                                        <ItemTemplate>
                                            <asp:Label ID="lbloffname" runat="server" Text='<%# Eval("offname") %>'></asp:Label></ItemTemplate>
                                        <HeaderStyle  />
                                        <ItemStyle HorizontalAlign="left"  />
                                    </asp:TemplateField>
                                </Columns>
                                <PagerStyle CssClass="PagerStyle" />
                                <PagerSettings Visible="false" />
                                <HeaderStyle CssClass="HeaderStyle" />
                                <AlternatingRowStyle CssClass="AltRowStyle" />
                            </asp:GridView>
                        </td>
                    </tr>
                    <tr>
                        <td  >&nbsp;</td>
                        <td  >
                            &nbsp;<asp:Button ID="btnAddCommandStaffList" runat="server" Text="เพิ่มใหม่"
                                Width="69px" /><uc7:frmPopArrestTeam ID="frmPopArrestCommand" runat="server" />
                            &nbsp;<asp:Button ID="btnDeleteCommandStaffList" runat="server" Text="ลบรายการ" />
                        </td>
                    </tr>
                    <tr><td colspan="2">&nbsp;</td></tr>
                    <tr><td colspan="2">&nbsp;</td></tr>
                </table>
                
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
                        <td class="style1" >ชื่อผู้แจ้งความ :</td>
                        <td class="style2">
                            <asp:TextBox ID="txtInformName" runat="server" Height="23px" Width="230px"></asp:TextBox>
                        </td>
                        <td class="style1">เลขที่ใบแจ้งความนำจับ :</td>
                        <td class="style2">
                            <asp:Label ID="lblNotictNo" runat="server" BackColor="Silver" Width="150px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1" >ชื่อผู้รับแจ้งความ :</td>
                        <td class="style2">
                            <table width="250px" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td>
                                        <asp:Label ID="lblReceiveName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                                        <uc9:frmSearchStaff ID="frmSearchReceiveStaff" runat="server" />
                                        <asp:Label ID="lblReceiveStaffID" runat="server" Visible="false"></asp:Label>
                                        <asp:Label ID="lblReceivePoscode" runat="server" Visible="false"></asp:Label>
                                    </td>
                                    
                                    <td><asp:Button ID="btnSearchReceiveStaff" runat="server" Text="..." Width="25px" Height="23px" /></td>
                                </tr>
                            </table>
                        </td>
                        <td class="style1">ตำแหน่ง :</td>
                        <td class="style2">
                            <asp:Label ID="lblReceivePosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">วันที่รับแจ้งความ :</td>
                        <td class="style2" valign="top">
                            <uc1:txtDate ID="txtInformDate" runat="server" />
                            <asp:Label ID="Label34" runat="server" Text="เวลา"></asp:Label>
                            <uc2:txtTime ID="txtInformTime" runat="server" IsNotNull="false" />
                        </td>
                    </tr>
                </table>
                <uc3:ucRewardRequestAlcohol ID="ucRewardRequestAlcohol1" runat="server" />
                <uc4:ucRewardRequestTax ID="ucRewardRequestTax1" runat="server" />
                <uc5:ucRewardRequestTobacco ID="ucRewardRequestTobacco1" runat="server" />
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
