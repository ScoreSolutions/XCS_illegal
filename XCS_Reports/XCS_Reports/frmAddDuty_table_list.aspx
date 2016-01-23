<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="frmAddDuty_table_list.aspx.vb" Inherits="XCS_Reports.frmAddDuty_table_list" %>


<html xmlns="http://www.w3.org/1999/xhtml" >
<head id="Head1" runat="server">
    <title>Untitled Page</title>
    <style type="text/css">
        .style1
        {
            text-align: right;
            font-family: "MS Sans Serif";
            font-size: 14;
            width: 215px;
            height: 25;
        }
        .style2
        {
            text-align: left;
            font-family: MS Sans Serif;
            font-size: 14;
            height: 25;
        }
     *
{
    padding: 0;
    margin: 0;
}
     </style>
      <script type="text/javascript">
      function showModal(page, width, height, scroll) {
          showModalDialog(page, "", "dialogWidth:" + width + "px; dialogHeight:" + height + "px;help:no;status:no;center:yes;scroll:" + scroll);
      }      
    </script>
</head>
<body>
    <form id="form1" runat="server">
    <asp:ScriptManager ID="ScriptManager1" runat="server" />
    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
        <ContentTemplate>
            <div id="div4" style="font-size: x-large; color: Purple; font-family: MS Sans Serif;
                font-size: 26;">
                บัญชีสิ่งของ
            </div>
            <div id="div1">
            </div>
            <div id="div2">
                <table cellspacing="1" width="100%">
                    <tr>
                        <td class="style1">
                            &nbsp;</td>
                        <td class="style2">
                            <asp:CheckBox ID="chkAllegedCo" runat="server" Text="ของกลางร่วม" />
                        </td>
                        <td class="style1">
                            &nbsp;</td>
                        <td class="style2">
                            &nbsp;</td>
                    </tr>
                    <tr>
                        <td class="style1">
                            &nbsp;
                            <asp:Label ID="Label7" runat="server" Text="ประเภทของกลาง :"></asp:Label>
                        </td>
                        <td class="style2">
                            <asp:DropDownList ID="ddlLedislation" runat="server" Height="23px" 
                                Width="260px">
                            </asp:DropDownList>
                            <asp:Label ID="Label50" runat="server" ForeColor="#FF3300" Text="*"></asp:Label>
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
                            <asp:TextBox ID="txt1" runat="server" Width="260px" Height="23px"></asp:TextBox>
                            &nbsp;
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
                            <asp:RadioButtonList ID="rdAccuser1" runat="server" Font-Names="MS Sans Serif" 
                                Font-Size="10pt" Height="18px" RepeatColumns="3" Width="224px">
                                <asp:ListItem Value="1">ในประเทศ
                                </asp:ListItem>
                                <asp:ListItem Value="2">ต่างประเทศ
                                </asp:ListItem>
                                <asp:ListItem Value="3">ไม่ระบุ</asp:ListItem>
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
                            <asp:TextBox ID="txt2" runat="server" Width="128px" Height="23px"></asp:TextBox>
                            <asp:Button ID="btnSearchArrestLawbreaker" runat="server" Text="..." />
                            &nbsp;<asp:TextBox ID="txt3" runat="server" Height="23px" Width="143px"></asp:TextBox>
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
                           <asp:TextBox ID="txt8" runat="server" Height="23px" Width="128px"></asp:TextBox>
                            &nbsp;<asp:Label ID="Label51" runat="server" Text="หน่วย :"></asp:Label>
                            <asp:DropDownList ID="ddlLedislation0" runat="server" Height="23px" 
                                Width="135px">
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
                            <asp:TextBox ID="txt9" runat="server" Height="23px" Width="128px"></asp:TextBox>
                            &nbsp;<asp:Label ID="Label52" runat="server" Text="หน่วย :"></asp:Label>
                            <asp:DropDownList ID="ddlLedislation1" runat="server" Height="23px" 
                                Width="135px">
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
                            <asp:TextBox ID="txt10" runat="server" Height="23px" Width="128px"></asp:TextBox>
                            &nbsp;<asp:Label ID="Label53" runat="server" Text="หน่วย :"></asp:Label>
                            <asp:DropDownList ID="ddlLedislation2" runat="server" Height="23px" 
                                Width="135px">
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
                            <asp:RadioButtonList ID="rdAccuser2" runat="server" Font-Names="MS Sans Serif" 
                                Font-Size="10pt" Height="16px" RepeatColumns="3" Width="122px">
                                <asp:ListItem Value="1">ยึด
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
                            <asp:TextBox ID="txt4" runat="server" Height="23px" Width="260px"></asp:TextBox>
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
                            <asp:TextBox ID="txt7" runat="server" Height="23px" Width="112px"></asp:TextBox>
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
                            <asp:TextBox ID="txt5" runat="server" Height="23px" Width="260px"></asp:TextBox>
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
                            <asp:TextBox ID="txt6" runat="server" Height="23px" Width="260px"></asp:TextBox>
                        </td>
                        <td class="style1">
                            &nbsp;</td>
                        <td class="style2">
                            &nbsp;</td>
                    </tr>
                    <tr>
                        <td class="style1">
                            &nbsp;</td>
                        <td class="style2">
                         
                            &nbsp;</td>
                        <td class="style1">
                            &nbsp;</td>
                        <td class="style2">
                            &nbsp;</td>
                    </tr>
                    <tr>
                        <td class="style1">
                            &nbsp;
                        </td>
                        <td class="style2" style="padding-left: 110px">
                            &nbsp;
                            <asp:Button ID="btnAdd" runat="server" Text="เพิ่ม" Height="30px"  Width="80px"/>
                        </td>
                        <td class="style1">
                            &nbsp;
                        </td>
                        <td class="style2">
                            &nbsp;
                        </td>
                    </tr>
                </table>
            </div>
            <div id="div3">
                <table width="800">
                    <tr>
                        <td>
                           
                        </td>
                    </tr>
                    <tr>
                        <td>
                            
                        </td>
                    </tr>
                </table>
            </div>
        </ContentTemplate>
    </asp:UpdatePanel>
    </form>
</body>
</html>
