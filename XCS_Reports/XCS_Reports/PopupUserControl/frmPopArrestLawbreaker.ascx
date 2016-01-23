<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="frmPopArrestLawbreaker.ascx.vb" Inherits="XCS_Reports.frmPopArrestLawbreaker" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="../UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="../UserControls/PageControl.ascx" TagName="PageControl" TagPrefix="uc2" %>
<link href="_Script/StyleSheet.css" rel="stylesheet" type="text/css" />

<asp:Panel ID="Panel1" runat="server" Width="650" Height="550" BorderColor="Black" BorderWidth="1" BackColor="#ffffff"  >
    <table cellspacing="1" width="100%">
        <tr>
            <td colspan="2" style="font-size:20pt;color:Purple" >รายชื่อผู้กระทำผิด</td>
            <td align="right">
                <asp:ImageButton ID="imgClose" runat="server" ImageUrl="~/Images/closewindows.png" />
            </td>
        </tr>
        <tr>
            <td class="style1">
                &nbsp;</td>
            <td class="style2" >
                &nbsp;</td>
            <td>
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label7" runat="server" Text="ประเภทผู้กระทำผิด :"></asp:Label>
            </td>
            <td class="style2">
                <asp:DropDownList ID="ddlCULPRIT" runat="server" AutoPostBack="true" 
                    Height="23px" Width="260px">
                    <asp:ListItem Value="1">คนไทย</asp:ListItem>
                    <asp:ListItem Value="2">ชาวต่างชาติ</asp:ListItem>
                    <asp:ListItem Value="3">ผู้ประกอบการ</asp:ListItem>
                </asp:DropDownList>
                <asp:Label ID="Label50" runat="server" ForeColor="#FF3300" Text="*"></asp:Label>
                <asp:TextBox ID="txtSeq" runat="server" CssClass="zHidden" Text="0"></asp:TextBox>
            </td>
            <td>
            </td>
        </tr>
        <tbody ID="pnl1" runat="server">
            <tr>
                <td class="style1">
                    <asp:Label ID="Label8" runat="server" Text="เลขที่บัตรประชาชน :"></asp:Label>
                </td>
                <td class="style2"  Width="100px" >
                <table cellpadding="0" cellspacing="0">
                    <tr>
                        <td class="style2">
                            <asp:TextBox ID="txtIDCardNo" runat="server" Width="260px" Height="23px" 
                                MaxLength="13" onkeypress="return ChkMinusInt(this,event)"  AutoPostBack="true"></asp:TextBox>
                                
                        </td>
                        <td class="style2">
                            <asp:Label ID="Label53" runat="server" Text="เพศ :"></asp:Label>
                        </td>
                        <td class="style2" >
                            <asp:RadioButtonList ID="rdSex" runat="server" RepeatDirection="Horizontal"
                                RepeatLayout="Flow" Width="100px">
                                <asp:ListItem Selected="True" Value="M">ชาย</asp:ListItem>
                                <asp:ListItem Value="F">หญิง</asp:ListItem>
                            </asp:RadioButtonList>
                        </td>
                        <td>
                            <asp:Label ID="Label1" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                    </tr>
                </table>
                </td>
                <td >
                </td>
            </tr>
            <tr>
                <td class="style1">
                <asp:Label ID="Label9" runat="server" Text="ชื่อผู้กระทำผิด :"></asp:Label>
                </td>
                <td class="style2" >
                <table cellpadding="0" cellspacing="0">
                    <tr>
                        <td>
                            <asp:DropDownList ID="ddlTitle" runat="server" Height="23px" Width="121px" 
                                DataTextField="title_name" DataValueField="title_code">
                            </asp:DropDownList>
                        </td>
                        <td>
                            <asp:TextBox ID="txtName" runat="server" Width="128px" Height="23px" 
                                MaxLength="200"></asp:TextBox>
                        </td>
                        <td><asp:Label ID="Label23" runat="server" Text="-"></asp:Label></td>
                        <td>
                            <asp:TextBox ID="txtLastName" runat="server" Width="143px" Height="23px" 
                                MaxLength="200"></asp:TextBox>
                        </td>
                        <td>
                            <asp:Label ID="Label2" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                        </td>
                        <td>
                            <asp:Button ID="btnSearchArrestLawbreaker" runat="server" Text="..." Width="25px" Height="21px" />
                        </td>
                    </tr>
                </table>
                </td>
                <td >
                </td>
            </tr>
             <tr>
                <td class="style1">
                 <asp:Label ID="Label10" runat="server" Text="ชื่ออื่นๆ :"></asp:Label>
                </td>
                <td class="style2" >
                <asp:TextBox ID="txtOtherName" runat="server" Width="260px"  Height="23px" 
                        MaxLength="200"></asp:TextBox>
                </td>
                <td >
                </td>
            </tr>
        </tbody>
        <tbody ID="pnl2" runat="server" visible="false" >
            <tr>
                <td class="style1">
                    <asp:Label ID="Label54" runat="server" Text="เลขที่หนังสือเดินทาง :"></asp:Label>
                </td>
                <td class="style2">
                    <table cellpadding="0" cellspacing="0">
                        <tr>
                            <td class="style2">
                                <asp:TextBox ID="txtLAWBREAKER_PASSPORT" runat="server" Width="260px" 
                                    Height="23px" MaxLength="50" AutoPostBack="true"></asp:TextBox>
                            </td>
                            <td class="style2">
                                <asp:Label ID="Label6" runat="server" Text="เพศ :"></asp:Label>
                            </td>
                            <td class="style2" >
                                <asp:RadioButtonList ID="rdSex2" runat="server" RepeatDirection="Horizontal"
                                    RepeatLayout="Flow" Width="100px">
                                    <asp:ListItem Selected="True" Value="M">ชาย</asp:ListItem>
                                    <asp:ListItem Value="F">หญิง</asp:ListItem>
                                </asp:RadioButtonList>
                            </td>
                            <td>
                                <asp:Label ID="Label22" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                            </td>
                        </tr>
                    </table>
                </td>
                <td >
                </td>
            </tr>
            <tr>
                <td class="style1">
                    <asp:Label ID="Label55" runat="server" Text="คำนำหน้าชื่อ :"></asp:Label>
                </td>
                <td class="style2">
                    <asp:DropDownList ID="ddlTitle2" runat="server" DataTextField="title_name" 
                        DataValueField="title_code" Height="23px" Width="260px">
                    </asp:DropDownList>
                </td>
                <td >
                </td>
            </tr>
            <tr>
                <td class="style1">
                    <asp:Label ID="Label56" runat="server" Text="ชื่อผู้กระทำผิด :"></asp:Label>
                </td>
                <td class="style2">
                    <asp:TextBox ID="txtName2" runat="server" Height="23px" Width="260px" 
                        MaxLength="200"></asp:TextBox>
                    <asp:Label ID="Label60" runat="server" ForeColor="#FF3300" Text="*"></asp:Label>
                </td>
                <td >
                </td>
            </tr>
            <tr>
                <td class="style1">
                    <asp:Label ID="Label57" runat="server" Text="ชื่อกลาง :"></asp:Label>
                </td>
                <td class="style2">
                    <asp:TextBox ID="txtMidName" runat="server" Height="23px" Width="260px" 
                        MaxLength="10"></asp:TextBox>
                </td>
                <td >
                </td>
            </tr>
            <tr>
                <td class="style1">
                    <asp:Label ID="Label58" runat="server" Text="นามสกุล :"></asp:Label>
                </td>
                <td class="style2">
                    <asp:TextBox ID="txtLastName2" runat="server" Height="23px" Width="260px" 
                        MaxLength="200"></asp:TextBox>
                </td>
                <td >
                    &nbsp;</td>
            </tr>
            <tr>
                <td class="style1">
                    <asp:Label ID="Label59" runat="server" Text="ชื่ออื่นๆ :"></asp:Label>
                </td>
                <td class="style2">
                    <asp:TextBox ID="txtOtherName2" runat="server" Height="23px" Width="260px" 
                        MaxLength="200"></asp:TextBox>
                </td>
                <td >
                </td>
            </tr>
        </tbody>
        <tbody ID="pnl3" runat="server" visible="false" >
            <tr>
                <td class="style1">
                    <asp:Label ID="Label61" runat="server" Text="เลขทะเบียนสรรพสามิต :"></asp:Label>
                </td>
                <td class="style2">
                    <asp:TextBox ID="txtExcNo" runat="server" Height="23px" Width="260px" 
                        MaxLength="20" AutoPostBack="true"></asp:TextBox>
                </td>
                <td >
                </td>
            </tr>
            <tr>
                <td class="style1">
                    <asp:Label ID="Label62" runat="server" Text="เลขทะเบียนนิติบุคคล :"></asp:Label>
                </td>
                <td class="style2">
                    <asp:TextBox ID="txtCorpNo" runat="server" Height="23px" Width="260px" 
                        MaxLength="20"></asp:TextBox>
                </td>
                <td >
                </td>
            </tr>
            <tr>
                <td class="style1">
                    <asp:Label ID="Label63" runat="server" Text="ชื่อผู้ประกอบการ :"></asp:Label>
                </td>
                <td class="style2">
                 <table cellpadding="0" cellspacing="0">
                    <tr>
                        <td>
                            <asp:DropDownList ID="ddlEXCTitle" runat="server" Height="23px" Width="121px" 
                                DataTextField="title_name" DataValueField="title_code">
                            </asp:DropDownList>
                        </td>
                        <td>
                            <asp:TextBox ID="txtEXCName" runat="server" Width="275px" Height="23px" 
                                MaxLength="200"></asp:TextBox>
                           
                        </td>
                        <td> <asp:Label ID="Label65" runat="server" ForeColor="#FF3300" Text="*"></asp:Label></td>
                    </tr>
                </table>
                </td>
                <td >
                </td>
            </tr>
            <tr>
                <td class="style1">
                    <asp:Label ID="Label64" runat="server" Text="ชื่อผู้แทน :"></asp:Label>
                </td>
                <td class="style2">
                <table cellpadding="0" cellspacing="0">
                    <tr>
                        <td>
                            <asp:DropDownList ID="ddlTitle3" runat="server" Height="23px" Width="121px" 
                                DataTextField="title_name" DataValueField="title_code">
                            </asp:DropDownList>
                        </td>
                        <td>
                            <asp:TextBox ID="txtName3" runat="server" Width="128px" Height="23px" 
                                MaxLength="200"></asp:TextBox>
                        </td>
                        <td><asp:Label ID="Label26" runat="server" Text="-"></asp:Label></td>
                        <td>
                            <asp:TextBox ID="txtLastName3" runat="server" Width="143px" Height="23px" 
                                MaxLength="200"></asp:TextBox>
                        </td>
                        <td>
                            &nbsp;</td>
                        <td>
                            &nbsp;</td>
                    </tr>
                </table>
                   </td>
                <td >
                    &nbsp;</td>
            </tr>
            <tr>
                <td class="style1">
                    <asp:Label ID="Label66" runat="server" Text="ชื่ออื่นๆ :"></asp:Label>
                </td>
                <td class="style2">
                    <asp:TextBox ID="txtOtherName3" runat="server" Height="23px" Width="260px" 
                        MaxLength="200"></asp:TextBox>
                </td>
                <td >
                </td>
            </tr>
        </tbody>
        <tr>
            <td class="style1">
                <asp:Label ID="Label11" runat="server" Text="บ้านเลขที่ :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtAddress" runat="server" Width="90px"  Height="23px" 
                    MaxLength="50"></asp:TextBox>
                <asp:Label ID="Label3" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
                &nbsp;&nbsp; <asp:Label ID="Label24" runat="server" Text="หมู่ :"></asp:Label>
                <asp:TextBox ID="txtMoo" runat="server" Width="90px"  Height="23px" onkeypress="return isNumberKey(event)"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label12" runat="server" Text="ซอย :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtSoi" runat="server" Width="260px"  Height="23px" 
                    MaxLength="100"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label13" runat="server" Text="ถนน :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtRoad" runat="server" Width="260px"  Height="23px" 
                    MaxLength="100"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label14" runat="server" Text="จังหวัด :"></asp:Label>
            </td>
            <td class="style2">
                <asp:DropDownList ID="ddlProvince" runat="server" Height="23px" 
                    Width="260px" DataTextField="province_name" DataValueField="province_code" 
                    AutoPostBack="True">
                </asp:DropDownList>
                <asp:Label ID="Label4" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label15" runat="server" Text="อำเภอ :"></asp:Label>
            </td>
            <td class="style2">
                <asp:DropDownList ID="ddlDistrict" runat="server" Height="23px" 
                    Width="260px" DataTextField="district_name" DataValueField="district_code" 
                    AutoPostBack="True">
                </asp:DropDownList>
                <asp:Label ID="Label5" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label16" runat="server" Text="ตำบล :"></asp:Label>
            </td>
            <td class="style2">
                <asp:DropDownList ID="ddlSubDistrict" runat="server" Height="23px" 
                    Width="260px" DataTextField="subdistrict_name" 
                    DataValueField="subdistrict_code">
                </asp:DropDownList>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label17" runat="server" Text="เชื้อชาติ :"></asp:Label>
            </td>
            <td class="style2">
                <asp:DropDownList ID="ddlrace" runat="server" Height="22px" 
                    Width="93px" DataTextField="race_name" DataValueField="id">
                </asp:DropDownList>
                &nbsp;<asp:Label ID="Label25" runat="server" Text="สัญชาติ :"></asp:Label>
                <asp:DropDownList ID="ddlNationality" runat="server" Height="20px" 
                    Width="93px" DataTextField="nation_name" DataValueField="id">
                </asp:DropDownList>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label18" runat="server" Text="อาชีพ :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtCAREER" runat="server" Width="260px"  Height="23px" 
                    MaxLength="100"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label19" runat="server" Text="วันเกิด :"></asp:Label>
            </td>
            <td class="style2">
                <uc1:txtDate ID="txtBirthday" runat="server" />
                <asp:Label ID="Label51" runat="server" Text="อายุ :"></asp:Label>
                <asp:Label ID="lblAge" runat="server" ></asp:Label>
                <asp:Label ID="Label52" runat="server" Text="ปี"></asp:Label>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label20" runat="server" Text="ชื่อบิดา :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtFatherName" runat="server" Width="260px"  Height="23px" 
                    MaxLength="100"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr>
            <td class="style1">
                <asp:Label ID="Label21" runat="server" Text="ชื่อมารดา :"></asp:Label>
            </td>
            <td class="style2">
                <asp:TextBox ID="txtMotherName" runat="server" Width="260px"  Height="23px" 
                    MaxLength="100"></asp:TextBox>
            </td>
            <td class="style1">
                &nbsp;</td>
        </tr>
        <tr><td>&nbsp;</td></tr>
        <tr>
            <td>&nbsp;</td>
            <td>
                <asp:Button ID="btnAdd" runat="server" Text="เพิ่ม" Height="30px" Width="60px" />
            </td>
        </tr>
    </table>
</asp:Panel>
<asp:Button ID="Button1" runat="server" Text="Button" Width="0px" CssClass="zHidden" />
<cc1:ModalPopupExtender ID="zPopArrestLawbreaker" runat="server" PopupControlID="Panel1" TargetControlID="Button1"
    BackgroundCssClass="modalBackground" DropShadow="true">
</cc1:ModalPopupExtender>




<asp:Panel ID="Panel2" runat="server" Width="650" Height="550" BorderColor="Black" BorderWidth="1" BackColor="#ffffff"  >
    <table cellspacing="1" width="100%">
        <tr>
            <td colspan="2" style="font-size:20pt;color:Purple" >ค้นหาชื่อผู้กระทำผิด</td>
            <td colspan="2" align="right">
                <asp:ImageButton ID="imgClosePopSearch" runat="server" ImageUrl="~/Images/closewindows.png" />
            </td>
        </tr>
        <tr><td>&nbsp;</td></tr>
        <tr>
            <td class="style1">
                &nbsp;
                <asp:Label ID="Label27" runat="server" Text="ชื่อ-สกุลผู้กระทำผิด :"></asp:Label>
            </td>
            <td class="style2">
                &nbsp;
                <asp:TextBox ID="txtSearchName" runat="server" Width="260px"></asp:TextBox>
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
                <asp:Label ID="Label28" runat="server" Text="เลขที่บัตรประชาชน :"></asp:Label>
            </td>
            <td class="style2">
                &nbsp;
                <asp:TextBox ID="txtSearchIDCard" runat="server" Width="260px"></asp:TextBox>
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
            <td class="style2"  >
                &nbsp;
                <asp:Button ID="btnSearch" runat="server" Text="ค้นหา" Height="30px" Width="60px" />
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
            <td>
                <uc2:PageControl ID="PageControl1" runat="server" />
            </td>
        </tr>
        <tr>
            <td>
                <asp:GridView ID="gvDataList" runat="server" AutoGenerateColumns="False" AllowSorting="true"
                    CssClass="GridViewStyle" Width="98%" AllowPaging="true">
                    <RowStyle CssClass="RowStyle" />
                    <Columns>
                        <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                            <HeaderStyle HorizontalAlign="Center" Width="100px" />
                            <ItemStyle HorizontalAlign="Center" />
                        </asp:BoundField>
                        <asp:BoundField DataField="lawbreaker_id_card" HeaderText="เลขบัตรประชาชน">
                            <HeaderStyle HorizontalAlign="Center" Width="150px"/>
                            <ItemStyle HorizontalAlign="Left" />
                        </asp:BoundField>
                         <asp:TemplateField HeaderText="ชื่อ-สกุล">
                            <ItemTemplate>
                                <asp:LinkButton ID="lnkLawbreakerName" runat="server" CommandName="select" 
                                    CommandArgument='<%#Eval("lawbreaker_no") %>'  Text='<%# Eval("lawbreaker_name") %>'></asp:LinkButton>
                            </ItemTemplate>
                            <ItemStyle HorizontalAlign="Left" />
                        </asp:TemplateField>
                      
                        <asp:BoundField DataField="lawbreaker_address" HeaderText="ที่อยู่">
                            <HeaderStyle HorizontalAlign="Center" Width="300px"/>
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
</asp:Panel>
<asp:Button ID="Button2" runat="server" Text="Button" Width="0px" CssClass="zHidden" />
<cc1:ModalPopupExtender ID="zPopSearchLawbreaker" runat="server" PopupControlID="Panel2" TargetControlID="Button2"
    BackgroundCssClass="modalBackground" DropShadow="true">
</cc1:ModalPopupExtender>