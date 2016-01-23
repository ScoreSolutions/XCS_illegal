<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="frmArrestAdminEdit.aspx.vb"
    Inherits="XCS_Reports.frmArrestAdminEdit" enableEventValidation="false"  enableViewStateMac="false" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="UserControls/txtTime.ascx" TagName="txtTime" TagPrefix="uc2" %>
<%@ Register src="PopupUserControl/frmSearchDepartment.ascx" tagname="frmSearchDepartment" tagprefix="uc3" %>
<%@ Register src="PopupUserControl/frmSearchAccuser.ascx" tagname="frmSearchAccuser" tagprefix="uc4" %>
<%@ Register src="PopupUserControl/frmSearchIndictment.ascx" tagname="frmSearchIndictment" tagprefix="uc5" %>
<%@ Register src="PopupUserControl/frmPopArrestLawbreaker.ascx" tagname="frmPopArrestLawbreaker" tagprefix="uc6" %>
<%@ Register src="PopupUserControl/frmPopArrestTeam.ascx" tagname="frmPopArrestTeam" tagprefix="uc7" %>
<%@ Register src="PopupUserControl/frmPopArrestExhibit.ascx" tagname="frmPopArrestExhibit" tagprefix="uc8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
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
    </style>

</head>
<body>
    <form id="form1" runat="server">
    <cc1:ToolkitScriptManager ID="ScriptManager1" runat="server" >
    </cc1:ToolkitScriptManager>
    <div id="div1" style="font-size: 30px; color: #723373;">
        บันทึกการจับกุม
    </div>
    <div id="div2" style="height: 20px">
    </div>
    <div id="div3" style="background-color: gray; font-size: 16;">
        รายละเอียดบันทึกการจับกุม
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
                            <asp:Label ID="Label1" runat="server" Text="เลขที่งาน :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:TextBox ID="txtTrack_no" runat="server" Height="23px" Width="260px"></asp:TextBox>
                            &nbsp;<asp:Button ID="btnSearchData" runat="server" Text="ค้นหา" Width="48px" Height="20px" />
                            <asp:Label ID="Label39" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                            <asp:Label ID="lblLoginHisID" runat="server" Visible="false" Text="0"></asp:Label>
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label16" runat="server" Text="วันที่เขียนบันทึกจับกุม :"></asp:Label>
                        </td>
                        <td class="style2">
                            <uc1:txtDate ID="TxtApplicationDate" runat="server" />
                            <asp:Label ID="Label50" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <asp:Label ID="Label2" runat="server" Text="เขียนที่ :"></asp:Label>
                        </td>
                        <td class="style2">
                            <uc3:frmSearchDepartment ID="frmSearchDepartment1" runat="server" />
                            <asp:Label ID="Label40" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label17" runat="server" Text="วันที่เกิดเหตุ : "></asp:Label>
                        </td>
                        <td class="style2" valign="top">
                            <uc1:txtDate ID="txtOccuranceDate" runat="server" />
                            <asp:Label ID="Label34" runat="server" Text="เวลา"></asp:Label>
                            <uc2:txtTime ID="TxtOccuranceTime" runat="server" />
                        </td>
                    </tr>
                    <tr>
                        <td  class="style1">
                            <asp:Label ID="Label3" runat="server" Text="พื้นที่ :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:Label ID="lblOffName" runat="server" BackColor="Silver" Width="260px" 
                                Text="" Height="23px"></asp:Label>
                            <asp:Label ID="Label41" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                            <asp:TextBox ID="txtOffCode" runat="server" Height="23px" 
                                Width="71px" CssClass="zHidden" ></asp:TextBox>
                        </td>
                        <td  class="style1">
                            <asp:Label ID="Label18" runat="server" Text="ผู้กระทำผิด :"></asp:Label>
                        </td>
                        <td class="style2">
                            <table>
                                <tr>
                                    <td>
                                        <asp:RadioButtonList ID="rdLawbreakType" runat="server" RepeatColumns="2" Width="190px" Height="18px">
                                            <asp:ListItem Value="1" Selected="False" >บุคคลทั่วไป
                                            </asp:ListItem>
                                            <asp:ListItem Value="2">ผู้ประกอบการ
                                            </asp:ListItem>
                                        </asp:RadioButtonList>
                                    </td>
                                    <td>
                                        <asp:Label ID="Label13" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <asp:Label ID="Label4" runat="server" Text="พ.ร.บ. :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:DropDownList ID="ddlLegislation" runat="server" Height="23px" 
                                Width="260px" DataTextField="legislation_name" DataValueField="ID" 
                                AutoPostBack="True">
                            </asp:DropDownList>
                            <asp:Label ID="Label42" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label19" runat="server" Text="มีตัวผู้กระทำผิด :"></asp:Label>
                        </td>
                        <td>
                            <table cellpadding="0" cellspacing="0">
                                <tr>
                                    <td >
                                        <asp:RadioButtonList ID="rdHaveCluprit" runat="server" RepeatColumns="2" Width="190px"
                                            Height="20px" AutoPostBack="true" >
                                            <asp:ListItem Value="Y" Selected="True" >มีตัว
                                            </asp:ListItem>
                                            <asp:ListItem Value="N">ไม่มีตัว
                                            </asp:ListItem>
                                        </asp:RadioButtonList>
                                    </td>
                                    <td class="style2">
                                        <asp:CheckBox ID="chkIsSendToCourt" runat="server" Text="ส่งฟ้องศาล" Enabled="false" />
                                        <asp:Label ID="Label45" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <asp:Label ID="Label5" runat="server" Text="สินค้า :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:DropDownList ID="ddlProductGroupID" runat="server" Height="23px" 
                                Width="260px" DataTextField="group_name" DataValueField="group_id">
                            </asp:DropDownList>
                            <asp:Label ID="Label43" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label20" runat="server" Text="ประมาณการค่าปรับ :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:TextBox ID="txtEstimatFine" runat="server" Width="115px" Height="23px" Enabled="false" ></asp:TextBox>
                            <asp:Label ID="Label33" runat="server" Text="บาท"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1" valign="top">
                            <asp:Label ID="Label6" runat="server" Text="ผู้กล่าวหา : "></asp:Label>
                        </td>
                        <td  valign="top">
                            <asp:RadioButtonList ID="rdAccuserType" runat="server" RepeatColumns="2" Width="403px">
                                <asp:ListItem Value="2" Selected="False" >เจ้าหน้าที่กรมสรรพสามิต
                                </asp:ListItem>
                                <asp:ListItem Value="3">เจ้าหน้าที่สรรพสามิตภาค
                                </asp:ListItem>
                                <asp:ListItem Value="1">เจ้าหน้าที่สรรพสามิตพื้นที่
                                </asp:ListItem>
                                <asp:ListItem Value="4">เจ้าหน้าที่สรรพสามิตพื้นที่สาขา</asp:ListItem>
                                <asp:ListItem Value="5">เจ้าหน้าที่อื่นๆ</asp:ListItem>
                            </asp:RadioButtonList>
                        </td>
                        <td  align="right" valign="top">
                             <table cellpadding="0" cellspacing="0" style="height:80px">
                                <tr >
                                    <td class="style1">
                                         <asp:TextBox ID="txtAccuserIDcardNo" runat="server" Height="23px" Width="71px" 
                                             Visible="False"></asp:TextBox>
                                         <asp:Label ID="Label21" runat="server" Text=" ชื่อผู้กล่าวหา : " Height="23px"></asp:Label>
                                    </td>
                                </tr>
                                <tr >
                                    <td  class="style1">
                                        <asp:TextBox ID="txtAccuserPOSCode" runat="server" Height="23px" Width="71px" 
                                            Visible="False"></asp:TextBox>
                                       <asp:Label ID="Label27" runat="server" Text="ตำแหน่ง :" Height="23px"></asp:Label>
                                    </td>
                                </tr>
                                <tr >
                                    <td  class="style1">
                                        <asp:TextBox ID="txtAccuserOffCode" runat="server" Height="23px" Width="71px" 
                                            Visible="False"></asp:TextBox>
                                       <asp:Label ID="Label28" runat="server" Text="สังกัด : " Height="23px"></asp:Label>
                                    </td>
                                </tr>
                            </table>   
                        </td>
                        <td valign="top">
                            <table cellpadding="0" cellspacing="0">
                                <tr>
                                    <td valign="top" style="background-color: #C0C0C0;">
                                        <table cellpadding="0" cellspacing="0" >
                                            <tr>
                                                <td>&nbsp;
                                                    <asp:Label ID="lblAccuserName" runat="server" Width="260px" Height="23px"></asp:Label>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>&nbsp;
                                                    <asp:Label ID="lblAccuserPosName" runat="server" Width="260px" Height="23px"></asp:Label>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>&nbsp;
                                                    <asp:Label ID="lblAccuserOffName" runat="server" Width="260px" Height="23px" ></asp:Label>
                                                </td>
                                            </tr>
                                        </table>
                                       
                                    </td>
                                    <td valign="top" align="right" style="background-color: #C0C0C0;">
                                        <asp:Button ID="btnSearchDivide_staff_popForArrest" runat="server" Text="..." Width="25px"
                                            Height="21px" />
                                        <uc4:frmSearchAccuser ID="frmSearchAccuser1" runat="server" />
                                    </td>
                                    <td valign="top">
                                        <asp:Label ID="Label49" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <asp:Label ID="Label7" runat="server" Text="ชื่อสถานที่เกิดเหตุ :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:TextBox ID="txtScene_Name" runat="server" Width="260px" Height="23px"></asp:TextBox>
                            <asp:Label ID="Label44" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label22" runat="server" Text="จังหวัด :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:DropDownList ID="ddlSceneProvince" runat="server" Height="23px" 
                                Width="260px" AutoPostBack="True" DataTextField="province_name" 
                                DataValueField="province_code">
                            </asp:DropDownList>
                            <asp:Label ID="Label46" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <asp:Label ID="Label8" runat="server" Text="บ้านเลขที่ :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:TextBox ID="txtSceneNo" runat="server" Width="96px" Height="23px"></asp:TextBox>
                            &nbsp;&nbsp;&nbsp;
                            <asp:Label ID="Label14" runat="server" Text="หมู่ :"></asp:Label>
                            <asp:TextBox ID="txtSceneMoo" runat="server" Width="107px" Height="23px"></asp:TextBox>
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label23" runat="server" Text="อำเภอ :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:DropDownList ID="ddlSceneDistrict" runat="server" Height="23px" 
                                Width="260px" AutoPostBack="True" DataTextField="District_Name" 
                                DataValueField="district_code">
                            </asp:DropDownList>
                            <asp:Label ID="Label47" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <asp:Label ID="Label9" runat="server" Text="ซอย :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:TextBox ID="txtSceneSoi" runat="server" Width="260px" Height="23px"></asp:TextBox>
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label24" runat="server" Text="ตำบล :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:DropDownList ID="ddlScebeSubDistrict" runat="server" Height="23px" 
                                Width="260px" DataTextField="SubDistrict_Name" 
                                DataValueField="subdistrict_code">
                            </asp:DropDownList>
                            <asp:Label ID="Label48" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <asp:Label ID="Label10" runat="server" Text="ถนน :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:TextBox ID="txtSceneRoad" runat="server" Width="260px" Height="23px"></asp:TextBox>
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label25" runat="server" Text="สถานีตำรวจท้องที่เกิดเหตุ :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:TextBox ID="txtPoliceStation" runat="server" Width="206px" Height="23px"></asp:TextBox>
                            <asp:Label ID="Label32" runat="server" Text=" (ส.ส.2/54)"></asp:Label>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            <asp:Label ID="Label11" runat="server" Text="จำนวนผู้กระทำผิด :"></asp:Label>
                        </td>
                        <td class="style2">
                            &nbsp;
                            <asp:Label ID="lblNoOfLawbreak" runat="server" Width="60px"></asp:Label>
                            <asp:Label ID="Label15" runat="server" Text="คน"></asp:Label>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:CheckBox ID="chkAllegedCo" runat="server" Text="ข้อกล่าวหาร่วมกัน" 
                                Enabled="False" />
                        </td>
                        <td class="style1">
                            <asp:Label ID="Label26" runat="server" Text="ละติจูด :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:TextBox ID="txtCoordinateX" runat="server" Width="93px" Height="23px"></asp:TextBox>
                            <asp:Label ID="Label31" runat="server" Text="ลองติจูด :"></asp:Label>
                            <asp:TextBox ID="txtCoordinateY" runat="server" Width="100px" Height="23px"></asp:TextBox>
                        </td>
                    </tr>
                    <tr>
                        <td class="style1">
                            &nbsp;</td>
                        <td class="style2">
                            &nbsp;</td>
                        <td>
                            &nbsp;</td>
                        <td class="style2">
                            &nbsp;</td>
                    </tr>
                </table>
            </ContentTemplate>
        </asp:UpdatePanel>
    </div>
     <div id="div8" style=" text-align:center;width:1000px" >
         <asp:UpdatePanel ID="UpdatePanel7" runat="server">
             <ContentTemplate>
              <asp:Button ID="btnSave" runat="server" Text="บันทึก" Width="70px"  Height="30px"/>
             </ContentTemplate>
         </asp:UpdatePanel>
     </div>
     <br />
    <div id="div5" class="color">
        <asp:Panel ID="myPanel" runat="server" GroupingText=" ข้อกล่าวหา" Width="98%">
            <asp:UpdatePanel ID="UpdatePanel2" runat="server">
                <ContentTemplate>
                    <table cellspacing="1" width="100%">
                        <tr>
                            <td>
                                &nbsp;<asp:Button ID="btnAddIndictment" runat="server" Text="เพิ่มใหม่" Width="69px" />
                                <uc5:frmSearchIndictment ID="frmSearchIndictment1" runat="server" />

                                &nbsp;<asp:Button ID="btnDeleteIndictment" runat="server" Text="ลบรายการ" />
                            </td>
                        </tr>
                        <tr>
                            <td class="style1">
                                <div style="width: 800px; height: 200px; overflow-y: auto;">
                                    <asp:GridView ID="gvIndictment" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                                        CssClass="GridViewStyle" Width="800px">
                                        <RowStyle CssClass="RowStyle" />
                                        <Columns>
                                            <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                                                <HeaderStyle HorizontalAlign="Center" Width="70px" />
                                                <ItemStyle HorizontalAlign="Center" />
                                            </asp:BoundField>
                                            <asp:TemplateField ShowHeader="false">
                                                <HeaderTemplate>
                                                    <asp:CheckBox ID="chkH" runat="server" OnCheckedChanged="chkH_OnCheckedChanged" AutoPostBack="true" />
                                                </HeaderTemplate>
                                                <ItemTemplate>
                                                    <asp:CheckBox ID="chk" runat="server" />
                                                </ItemTemplate>
                                                <HeaderStyle Width="30px" />
                                                <ItemStyle HorizontalAlign="Center" Width="30px" />
                                            </asp:TemplateField>
                                            <asp:BoundField DataField="CASE_LAW_ID" HeaderText="มาตรา">
                                                <HeaderStyle HorizontalAlign="Center" Width="90px" />
                                                <ItemStyle HorizontalAlign="Center" />
                                            </asp:BoundField>
                                            <asp:BoundField DataField="PENALTY_CASE_LAW_ID" HeaderText="บทกำหนดโทษ">
                                                <HeaderStyle HorizontalAlign="Center" Width="100px" />
                                                <ItemStyle HorizontalAlign="Left" />
                                            </asp:BoundField>
                                            <asp:BoundField DataField="GUILT_BASE" HeaderText="ข้อกล่าวหา">
                                                <HeaderStyle HorizontalAlign="Center" Width="450px" />
                                                <ItemStyle HorizontalAlign="Left" />
                                            </asp:BoundField>
                                            <asp:TemplateField HeaderText="ของกลางเถื่อน">
                                                <ItemTemplate>
                                                    <asp:CheckBox ID="chkExhibitWild" runat="server" />
                                                    <asp:Label ID="lblExhibitWild" runat="server" Text='<%# Bind("Exhibit_Wild") %>'
                                                        Style="display: none"></asp:Label>
                                                </ItemTemplate>
                                                <HeaderStyle Width="90px" />
                                                <ItemStyle HorizontalAlign="Center" Width="30px" />
                                            </asp:TemplateField>
                                            <asp:TemplateField ShowHeader="false" >
                                                <ItemTemplate>
                                                    <asp:Label ID="lblIndictmentID" runat="server" Text='<%# Bind("INDICTMENT_ID") %>'
                                                        Style="display: none"></asp:Label>
                                                </ItemTemplate>
                                                <ItemStyle CssClass="zHidden" />
                                                <HeaderStyle CssClass="zHidden" />
                                                <ControlStyle CssClass="zHidden" />
                                                <FooterStyle CssClass="zHidden" />
                                            </asp:TemplateField>
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
                </ContentTemplate>
            </asp:UpdatePanel>
        </asp:Panel>
        <br />
        <br />
        
        <asp:Panel ID="Panel1" runat="server" GroupingText="รายชื่อผู้กระทำผิดกฏหมาย" Width="100%"  >
        <div style="width: 100%; height: 200px; overflow-y: auto;">
            <asp:UpdatePanel ID="UpdatePanel3" runat="server">
                <ContentTemplate>
                    <table cellspacing="1" width="100%">
                        <tr>
                            <td>
                                &nbsp;<asp:Button ID="btnAddArrestLawbreaker" runat="server" Text="เพิ่มใหม่" Width="69px" />
                                <uc6:frmPopArrestLawbreaker ID="frmPopArrestLawbreaker1" runat="server" />
                                
                                &nbsp;<asp:Button ID="btnDeleteArrestLawbreaker" runat="server" 
                                    Text="ลบรายการ" />
                            </td>
                        </tr>
                        <tr>
                            <td class="style1">
                                <asp:GridView ID="gvArrestLawbreaker" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                                    CssClass="GridViewStyle" Width="1500px">
                                    <RowStyle CssClass="RowStyle" />
                                    <Columns>
                                        <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                                            <HeaderStyle HorizontalAlign="Center" />
                                            <ItemStyle HorizontalAlign="center" Width="100px" />
                                        </asp:BoundField>
                                        <asp:TemplateField ShowHeader="false">
                                            <HeaderTemplate>
                                                <asp:CheckBox ID="chkH" runat="server" OnCheckedChanged="chkH_OnCheckedChanged" AutoPostBack="true" />
                                            </HeaderTemplate>
                                            <ItemTemplate>
                                                <asp:CheckBox ID="chk" runat="server" />
                                                  <asp:Label ID="lblNationality_ID" runat="server" Text='<%# Eval("Nationality_ID") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblRace_ID" runat="server" Text='<%# Eval("Race_ID") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblSubDistrict_Code" runat="server" Text='<%# Eval("SubDistrict") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblDistrict_Code" runat="server" Text='<%# Eval("District") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblProvince_Code" runat="server" Text='<%# Eval("Province") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblTitle_Code" runat="server" Text='<%# Eval("Title_Code") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblFirstName" runat="server" Text='<%# Eval("First_NAME") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblLastName" runat="server" Text='<%# Eval("Last_Name") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblSex" runat="server" Text='<%# Eval("Sex") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblCULPRIT_TYPE" runat="server" Text='<%# Eval("CULPRIT_TYPE") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblOtherName" runat="server" Text='<%# Eval("Other_Name") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblAddress_no" runat="server" Text='<%# Eval("Address_no") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblMoo" runat="server" Text='<%# Eval("Moo") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblSoi" runat="server" Text='<%# Eval("Soi") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblRoad" runat="server" Text='<%# Eval("Road") %>' Visible="false"></asp:Label>
                                                <asp:Label ID="lblTitle_Name" runat="server" Text='<%# Eval("Title_Name") %>' Visible="false"></asp:Label>
                                                <asp:Label ID="lblProvince_Name" runat="server" Text='<%# Eval("Province_Name") %>'
                                                    Visible="false"></asp:Label>
                                                <asp:Label ID="lblDistrict_Name" runat="server" Text='<%# Eval("District_Name") %>'
                                                    Visible="false"></asp:Label>
                                                <asp:Label ID="lblSubDistrict_Name" runat="server" Text='<%# Eval("SubDistrict_Name") %>'
                                                    Visible="false"></asp:Label>
                                                <asp:Label ID="lblAge" runat="server" Text='<%# Eval("Age") %>' Visible="false"></asp:Label>
                                                  
                                                  <asp:Label ID="lblMIDDLE_NAME" runat="server" Text='<%# Eval("MIDDLE_NAME") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblEXCISE_REG_NO" runat="server" Text='<%# Eval("EXCISE_REG_NO") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblCORPORATION_CODE" runat="server" Text='<%# Eval("CORPORATION_CODE") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblCOMPANY_NAME" runat="server" Text='<%# Eval("COMPANY_NAME") %>' Visible="false"></asp:Label>
                                                  <asp:Label ID="lblCOMPANY_TITLE_CODE" runat="server" Text='<%# Eval("COMPANY_TITLE_CODE") %>' Visible="false"></asp:Label>
                                                  
                                            </ItemTemplate>
                                            <HeaderStyle Width="30px" />
                                            <ItemStyle HorizontalAlign="Center" Width="30px" />
                                        </asp:TemplateField>
                                       
                                        <asp:TemplateField  HeaderText="ชื่อผู้กระทำผิด">
                                        <itemtemplate>
                                          <asp:LinkButton ID="lnk_fullname" runat="server" CommandName="Edit" 
                                                CommandArgument='<%# Eval("seq")%>'  Text='<%# Eval("Title_Name") + Eval("First_NAME") + " " + Eval("Last_Name")  %>'></asp:LinkButton>
                                           
                                        </itemtemplate>
                                        <headerstyle   />
                                        <itemstyle horizontalalign="left" width="150px" />
                                        </asp:TemplateField> 
                                        
                                         <asp:TemplateField  HeaderText="ประเภทผู้กระทำผิด">
                                        <itemtemplate>
                                            <asp:Label ID="lblCULPRIT" runat="server" Text='<%# Eval("CULPRIT") %>'></asp:Label>
                                        </itemtemplate>
                                        <headerstyle  />
                                        <itemstyle horizontalalign="left" width="200px" />
                                        </asp:TemplateField> 
                                        
                                        <asp:TemplateField  HeaderText="อาชีพ">
                                        <itemtemplate>
                                            <asp:Label ID="lblCAREER" runat="server" Text='<%# Eval("CAREER") %>'></asp:Label>
                                        </itemtemplate>
                                        <headerstyle width="130px"  />
                                        <itemstyle horizontalalign="left" width="100px" />
                                        </asp:TemplateField>
                                        
                                        <asp:TemplateField  HeaderText="วันเกิด">
                                        <itemtemplate>
                                            <asp:Label ID="lblBIRTH_DATE" runat="server" Text='<%# Eval("BIRTH_DATE") %>'></asp:Label>
                                        </itemtemplate>
                                        <headerstyle width="100px"  />
                                        <itemstyle horizontalalign="center" width="100px" />
                                        </asp:TemplateField>
                                        
                                        <asp:TemplateField  HeaderText="เลขที่บัตรประชาชน">
                                        <itemtemplate>
                                            <asp:Label ID="lblLAWBREAKER_ID_CARD" runat="server" Text='<%# Eval("LAWBREAKER_ID_CARD") %>'></asp:Label>
                                        </itemtemplate>
                                        <headerstyle   />
                                        <itemstyle horizontalalign="left" width="140px" />
                                        </asp:TemplateField>
                                        
                                        <asp:TemplateField  HeaderText="เลขที่หนังสือเดินทาง">
                                        <itemtemplate>
                                            <asp:Label ID="lblLAWBREAKER_PASSPORT" runat="server" Text='<%# Eval("LAWBREAKER_PASSPORT") %>'></asp:Label>
                                        </itemtemplate>
                                        <headerstyle  />
                                        <itemstyle horizontalalign="left" width="200px" />
                                        </asp:TemplateField>
                                        
                                         <asp:TemplateField  HeaderText="เชื้อชาติ">
                                        <itemtemplate>
                                            <asp:Label ID="lblrace_id_name" runat="server" Text='<%# Eval("race_id_name") %>'></asp:Label>
                                        </itemtemplate>
                                        <headerstyle   />
                                        <itemstyle horizontalalign="left" width="100px" />
                                        </asp:TemplateField>
                                        
                                        <asp:TemplateField  HeaderText="สัญชาติ">
                                        <itemtemplate>
                                            <asp:Label ID="lblnationality_id_name" runat="server" Text='<%# Eval("nationality_id_name") %>'></asp:Label>
                                        </itemtemplate>
                                        <headerstyle />
                                        <itemstyle horizontalalign="left" width="100px" />
                                        </asp:TemplateField>
                                             
                                        <asp:TemplateField  HeaderText="ที่อยู่">
                                        <itemtemplate>
                                            <asp:Label ID="lblAddress" runat="server" Text='<%# Eval("Address") %>'></asp:Label>
                                        </itemtemplate>
                                        <headerstyle  />
                                        <itemstyle horizontalalign="left" width="300px" />
                                        </asp:TemplateField>
                                         
                                        <asp:TemplateField  HeaderText="ชื่อบิดา">
                                        <itemtemplate>
                                            <asp:Label ID="lblFATHER_NAME" runat="server" Text='<%# Eval("FATHER_NAME") %>'></asp:Label>
                                        </itemtemplate>
                                        <headerstyle />
                                        <itemstyle horizontalalign="left" width="130px" />
                                        </asp:TemplateField>
                                        
                                        <asp:TemplateField  HeaderText="ชื่อมารดา">
                                        <itemtemplate>
                                            <asp:Label ID="lblMOTHER_NAME" runat="server" Text='<%# Eval("MOTHER_NAME") %>'></asp:Label>
                                        </itemtemplate>
                                        <headerstyle   />
                                        <itemstyle horizontalalign="left" width="130px" />
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
                </ContentTemplate>
            </asp:UpdatePanel>
            </div>
        </asp:Panel>
        <br />
        <br />
        <asp:Panel ID="Panel2" runat="server" GroupingText=" บันทึกการจับ" Width="100%"    >
            <asp:UpdatePanel ID="UpdatePanel4" runat="server">
                <ContentTemplate >
                    <table cellspacing="3"  width="100%"  >
                        <tr>
                            <td style="width:120px" valign="top" align="right" >
                                <asp:Label ID="Label35" runat="server" Text="พฤติการณ์ในการจับ : "></asp:Label>
                            </td>
                            <td style="width:200px" valign="top">
                                <asp:TextBox ID="txtBEHAVIOUR" runat="server" Width="260px" Height="95px" 
                                    TextMode="MultiLine" Text="รับสารภาพตลอดข้อกล่าวหา" Font-Size="20px" ></asp:TextBox>
                            </td>
                            <td  valign="top">
                                <asp:Label ID="Label36" runat="server" Text=" (ส.ส 2/39) "></asp:Label>
                            </td>
                            <td >
                                &nbsp;
                            </td>
                        </tr>
                        <tr>
                            <td valign="top" align="right">
                                <asp:Label ID="Label37" runat="server" Text="คำให้การของผู้ต้องหา : "></asp:Label>
                            </td>
                            <td  valign="top">
                                <asp:TextBox ID="txtTESTIMONY" runat="server" Width="260px" Height="59px" 
                                    TextMode="MultiLine" Text="รับสารภาพตลอดข้อกล่าวหา" Font-Size="20px" ></asp:TextBox>
                            </td>
                            <td valign="top">
                                &nbsp;
                            </td>
                            <td >
                                &nbsp;
                            </td>
                        </tr>
                        <tr>
                            <td  valign="top" align="right">
                                <asp:Label ID="Label38" runat="server" Text="การแจ้งสิทธิ์ :"></asp:Label>
                            </td>
                            <td  valign="top">
                                <asp:TextBox ID="txtAdministration" runat="server" Width="260px" Height="60px" TextMode="MultiLine" Text="แจ้งให้ญาติทราบ" Font-Size="20px" ></asp:TextBox>
                            </td>
                            <td valign="top">
                                &nbsp;
                            </td>
                            <td >
                                &nbsp;
                            </td>
                        </tr>
                    </table>
                </ContentTemplate>
            </asp:UpdatePanel>
        </asp:Panel>
        <br />
        <br />
        <asp:Panel ID="Panel3" runat="server" GroupingText=" คณะผู้จับกุม" Width="100%">
            <asp:UpdatePanel ID="UpdatePanel5" runat="server">
                <ContentTemplate>
                    <table cellspacing="1" width="100%">
                        <tr>
                            <td>
                                &nbsp;<asp:Button ID="btnAddDivide_staff_poplist" runat="server" 
                                    Text="เพิ่มใหม่" Width="69px" />
                                <uc7:frmPopArrestTeam ID="frmPopArrestTeam1" runat="server" />
                                
                                
                                &nbsp;<asp:Button ID="btnDeleteDivide_staff_poplist" runat="server" 
                                    Text="ลบรายการ" />
                            </td>
                        </tr>
                        <tr>
                            <td class="style1">
                                <div style="width: 850px; height: 250px; overflow-y: auto;">
                                <asp:GridView ID="gvArrestList" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                                    CssClass="GridViewStyle" Width="800px" >
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
                                                <asp:Label ID="lblidcard_no" runat="server" Text='<%# Eval("STAFF_IDCARDNO") %>' Visible="false"></asp:Label>
                                                <asp:Label ID="lblposcode" runat="server" Text='<%# Eval("STAFF_POSCODE") %>' Visible="false"></asp:Label>
                                                <asp:Label ID="lbloffcode" runat="server" Text='<%# Eval("STAFF_OFFCODE") %>' Visible="false"></asp:Label>
                                            </itemtemplate>
                                            <headerstyle width="30px" />
                                            <itemstyle horizontalalign="Center" width="30px" />
                                        </asp:TemplateField>
                                        
                                        <asp:TemplateField  HeaderText="ชื่อ">
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
                                        
                                        <asp:TemplateField  HeaderText="ในฐานะ">
                                        <itemtemplate>
                                            <asp:DropDownList ID="ddlDuty"  runat="server">
                                            </asp:DropDownList>
                                        </itemtemplate>
                                        <headerstyle width="100px"  />
                                        <itemstyle horizontalalign="center" width="100px" />
                                        </asp:TemplateField>                                       
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
                </ContentTemplate>
            </asp:UpdatePanel>
        </asp:Panel>
        <br />
        <br />
        <asp:Panel ID="Panel4" runat="server" GroupingText="  บัญชีสิ่งของ" Width="100%">
            <asp:UpdatePanel ID="UpdatePanel6" runat="server">
                <ContentTemplate>
                    <table cellspacing="1" width="100%">
                        <tr>
                            <td>
                                &nbsp;<asp:Button ID="btnAddArrestExhibit" runat="server" Text="เพิ่มใหม่" Width="69px" />
                                <uc8:frmPopArrestExhibit ID="frmPopArrestExhibit1" runat="server" />
                                &nbsp;<asp:Button ID="btnDelArrestExhibit" runat="server" Text="ลบรายการ" />
                            </td>
                        </tr>
                        <tr>
                            <td class="style1">
                                <asp:GridView ID="gvExhibitList" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                                    CssClass="GridViewStyle" Width="70%">
                                    <RowStyle CssClass="RowStyle" />
                                    <Columns>
                                        <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                                            <HeaderStyle HorizontalAlign="Center" />
                                            <ItemStyle HorizontalAlign="Left" />
                                        </asp:BoundField>
                                        <asp:TemplateField ShowHeader="false">
                                            <HeaderTemplate>
                                                <asp:CheckBox ID="chk" runat="server" OnCheckedChanged="chkH_OnCheckedChanged" AutoPostBack="true" />
                                            </HeaderTemplate>
                                            <ItemTemplate>
                                                <asp:CheckBox ID="chk" runat="server" />
                                            </ItemTemplate>
                                            <HeaderStyle Width="30px" />
                                            <ItemStyle HorizontalAlign="Center" Width="30px" />
                                        </asp:TemplateField>
                                        <asp:TemplateField  HeaderText="ชนิดสินค้า">
                                            <itemtemplate>
                                                <asp:Label ID="lblDutyName" runat="server" Text='<%# Eval("duty_name") %>' ></asp:Label>
                                                <asp:Label ID="lblDutyCode" runat="server" Text='<%# Eval("duty_code") %>' Visible="false" ></asp:Label>
                                            </itemtemplate>
                                            <headerstyle width="100px"  />
                                            <itemstyle horizontalalign="center" width="100px" />
                                        </asp:TemplateField>   
                                        <asp:TemplateField  HeaderText="ชื่อสินค้า">
                                            <itemtemplate>
                                                <asp:LinkButton ID="lblGroupName" runat="server" Text='<%# Eval("group_name") %>' CommandArgument='<%# Eval("seq") %>' CommandName="Edit" ></asp:LinkButton>
                                                <asp:Label ID="lblGroupID" runat="server" Text='<%# Eval("group_id") %>' Visible="false" ></asp:Label>
                                                <asp:Label ID="lblBrandCode" runat="server" Text='<%# Eval("brand_code") %>' Visible="false" ></asp:Label>
                                                <asp:Label ID="lblBrandName" runat="server" Text='<%# Eval("brand_name") %>' Visible="false" ></asp:Label>
                                            </itemtemplate>
                                            <headerstyle width="150px"  />
                                            <itemstyle horizontalalign="center" width="100px" />
                                        </asp:TemplateField> 
                                        <asp:TemplateField  HeaderText="ใน/นอก">
                                            <itemtemplate>
                                                <asp:Label ID="lblIsDomesticName" runat="server" Text='<%# Eval("is_domestic_name") %>' ></asp:Label>
                                                <asp:Label ID="lblIsDomesticCode" runat="server" Text='<%# Eval("isdomestic") %>' Visible="false" ></asp:Label>
                                            </itemtemplate>
                                            <headerstyle width="100px"  />
                                            <itemstyle horizontalalign="center" width="100px" />
                                        </asp:TemplateField>
                                        <asp:TemplateField  HeaderText="สถานะของกลาง">
                                            <itemtemplate>
                                                <asp:Label ID="lblStatusName" runat="server" Text='<%# Eval("exhibit_status_name") %>' ></asp:Label>
                                                <asp:Label ID="lblExhibitStatus" runat="server" Text='<%# Eval("exhibit_status") %>' Visible="false" ></asp:Label>
                                            </itemtemplate>
                                            <headerstyle width="100px"  />
                                            <itemstyle horizontalalign="center" width="100px" />
                                        </asp:TemplateField>
                                        <asp:TemplateField  HeaderText="ขนาด">
                                            <itemtemplate>
                                                <asp:Label ID="lblSizeName" runat="server" Text='<%# Eval("size_name") %>' ></asp:Label>
                                                <asp:Label ID="lblSizeDesc" runat="server" Text='<%# Eval("size_desc") %>' Visible="false" ></asp:Label>
                                                <asp:Label ID="lblSizeUnitCode" runat="server" Text='<%# Eval("size_unit_code") %>' Visible="false" ></asp:Label>
                                                <asp:Label ID="lblSizeUnitName" runat="server" Text='<%# Eval("size_unit_name") %>' Visible="false" ></asp:Label>
                                            </itemtemplate>
                                            <headerstyle width="100px"  />
                                            <itemstyle horizontalalign="center" width="100px" />
                                        </asp:TemplateField>
                                        <asp:TemplateField  HeaderText="จำนวน">
                                            <itemtemplate>
                                                <asp:Label ID="lblQtyName" runat="server" Text='<%# Eval("qty_name") %>' ></asp:Label>
                                                <asp:Label ID="lblQty" runat="server" Text='<%# Eval("qty") %>' Visible="false" ></asp:Label>
                                                <asp:Label ID="lblQtyUnitCode" runat="server" Text='<%# Eval("qty_unit_code") %>' Visible="false" ></asp:Label>
                                                <asp:Label ID="lblQtyUnitName" runat="server" Text='<%# Eval("qty_unit_name") %>' Visible="false" ></asp:Label>
                                            </itemtemplate>
                                            <headerstyle width="100px"  />
                                            <itemstyle horizontalalign="center" width="100px" />
                                        </asp:TemplateField>
                                         <asp:TemplateField  HeaderText="ปริมาณสุทธิ">
                                            <itemtemplate>
                                                <asp:Label ID="lblWeightName" runat="server" Text='<%# Eval("weight_name") %>' ></asp:Label>
                                                <asp:Label ID="lblWeight" runat="server" Text='<%# Eval("weight") %>' Visible="false" ></asp:Label>
                                                <asp:Label ID="lblWeightUnitCode" runat="server" Text='<%# Eval("weight_unit_code") %>' Visible="false" ></asp:Label>
                                                <asp:Label ID="lblWeightUnitName" runat="server" Text='<%# Eval("weight_unit_name") %>' Visible="false" ></asp:Label>
                                                <asp:Label ID="lblExhibitList" runat="server" Text='<%# Eval("exhibit_list") %>' Visible="false" ></asp:Label>
                                            </itemtemplate>
                                            <headerstyle width="100px"  />
                                            <itemstyle horizontalalign="center" width="100px" />
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
                                    </Columns>
                                    <PagerStyle CssClass="PagerStyle" />
                                    <PagerSettings Visible="false" />
                                    <HeaderStyle CssClass="HeaderStyle" />
                                    <AlternatingRowStyle CssClass="AltRowStyle" />
                                </asp:GridView>
                            </td>
                        </tr>
                    </table>
                </ContentTemplate>
            </asp:UpdatePanel>
        </asp:Panel>
    </div>
    <div id="div6">
    </div>
    </form>
</body>
</html>
