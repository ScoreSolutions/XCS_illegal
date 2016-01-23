<%@ Control Language="vb" AutoEventWireup="false" CodeBehind="ucRewardRequestTax.ascx.vb" Inherits="XCS_Admin.ucRewardRequestTax" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="cc1" %>
<%@ Register Src="../UserControls/txtDate.ascx" TagName="txtDate" TagPrefix="uc1" %>
<%@ Register Src="../UserControls/txtTime.ascx" TagName="txtTime" TagPrefix="uc2" %>
<%@ Register src="../PopupUserControl/frmPopArrestTeam.ascx" tagname="frmPopArrestTeam" tagprefix="uc7" %>
<%@ Register src="../PopupUserControl/frmSearchStaff.ascx" tagname="frmSearchStaff" tagprefix="uc9" %>


<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            รายงานการจับกุม
        </td>
    </tr>
</table>

<table cellspacing="0" cellpadding="0" border="0"  width="95%"  >
    <tr>
        <td style="width:20%" >&nbsp;
            <asp:Label ID="lblApplicationRewardRequestID" runat="server" Visible="false" Text="0" ></asp:Label>
            <asp:Label ID="lblTrackNo" runat="server" Visible="false" Text="" ></asp:Label>
        </td>
        <td style="width:25%" >&nbsp;</td>
        <td style="width:15%" >&nbsp;</td>
        <td style="width:40%" >&nbsp;</td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            เรื่อง :
        </td>
        <td class="style2" colspan="3" >
            <asp:Label ID="lblReportName" runat="server" Text="รายงานการจับกุมคดี พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527" 
            BackColor="Silver" Width="550px" Height="23px" ></asp:Label>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            สินค้า :
        </td>
        <td class="style2" >
            <asp:Label ID="lblProductGroupName" runat="server" BackColor="Silver" Width="250px" Height="23px" ></asp:Label>
        </td>
        <td class="style2" colspan="2" >
            <asp:CheckBox ID="chkInform" runat="server" Text="มีการแจ้งความ"  />
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:CheckBox ID="chkCountInform" runat="server" Text="ตรวจนับได้ตรงกับที่แจ้ง"  />
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            ชนิดและปริมาณของที่จับได้ :
        </td>
        <td class="style2" colspan="3" >
            <asp:GridView ID="gvExhibit" runat="server" AutoGenerateColumns="False" AllowSorting="false"
                CssClass="GridViewStyle" Width="85%">
                <RowStyle CssClass="RowStyle" />
                <EmptyDataTemplate>
                    <table width="760px">
                        <tr class="HeaderStyle" style="height:30px" >
                            <td style="width:60px;text-align:center;" >ลำดับที่</td>
                            <td style="width:250px;text-align:center;" >ชื่อสินค้า</td>
                            <td style="width:250px;text-align:center;" >ยี่ห้อ</td>
                            <td style="width:100px;text-align:center;" >จำนวน</td>
                            <td style="width:100px;text-align:center;" >หน่วย</td>
                        </tr>
                    </table>
                </EmptyDataTemplate>
                <Columns>
                    <asp:BoundField DataField="seq" HeaderText="ลำดับที่">
                        <HeaderStyle HorizontalAlign="Center" Width="60px" />
                        <ItemStyle HorizontalAlign="Center" Width="60px" />
                    </asp:BoundField>
                    <asp:BoundField DataField="duty_name" HeaderText="ชื่อสินค้า">
                        <HeaderStyle HorizontalAlign="Center"  />
                        <ItemStyle HorizontalAlign="Center"  />
                    </asp:BoundField>
                    <asp:BoundField DataField="brand_name" HeaderText="ยี่ห้อ">
                        <HeaderStyle HorizontalAlign="Center" Width="250px" />
                        <ItemStyle HorizontalAlign="Center" Width="250px" />
                    </asp:BoundField>
                    <asp:BoundField DataField="qty" HeaderText="จำนวน">
                        <HeaderStyle HorizontalAlign="Center" Width="100px" />
                        <ItemStyle HorizontalAlign="Center" Width="100px" />
                    </asp:BoundField>
                    <asp:BoundField DataField="qty_unit_name" HeaderText="หน่วย">
                        <HeaderStyle HorizontalAlign="Center" Width="100px" />
                        <ItemStyle HorizontalAlign="Center" Width="100px" />
                    </asp:BoundField>
                </Columns>
                <PagerStyle CssClass="PagerStyle" />
                <PagerSettings Visible="false" />
                <HeaderStyle CssClass="HeaderStyle" />
                <AlternatingRowStyle CssClass="AltRowStyle" />
            </asp:GridView>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            ลักษณะที่ตรวจพบ :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtAbnormaly" runat="server" Width="550px" Height="50px" TextMode="MultiLine"></asp:TextBox>
            <asp:Label ID="Label3" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
        </td>
    </tr>
    
    <tr style="height:30px" >
        <td class="style1">
            ผู้ช่วยเหลือ (ในคดี) :
        </td>
        <td class="style2" colspan="3" >
            <asp:GridView ID="gvArrestHelper" runat="server" AutoGenerateColumns="False" AllowSorting="false"
                CssClass="GridViewStyle" Width="85%">
                <RowStyle CssClass="RowStyle" />
                <EmptyDataTemplate>
                    <table width="760px">
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
        <td  colspan="3" >
            &nbsp;<asp:Button ID="btnAddHelperSaffList" runat="server" Text="เพิ่มใหม่"
                Width="69px" /><uc7:frmPopArrestTeam ID="frmPopHelperList" runat="server" />
            &nbsp;<asp:Button ID="btnDeleteHelperStaffList" runat="server" Text="ลบรายการ" />
        </td>
    </tr>
    <tr><td colspan="4">&nbsp;</td></tr>
    <tr>
        <td class="style1" >ผู้ควบคุมการจับกุม :</td>
        <td class="style2">
            <table width="250px" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <asp:Label ID="lblControlStaffName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                        <asp:Label ID="lblControlStaffID" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblControlPoscode" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblControlOffcode" runat="server" Visible="false"></asp:Label>
                    </td>
                    
                    <td>
                        <asp:Button ID="btnSearchControlStaff" runat="server" Text="..." Width="25px" Height="23px" />
                        <uc9:frmSearchStaff ID="frmSearchControlStaff" runat="server" />
                    </td>
                </tr>
            </table>
        </td>
        <td class="style1">ตำแหน่ง :</td>
        <td class="style2">
            <asp:Label ID="lblControlPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            รายละเอียดการจับกุม <br />และความเห็น :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtCommentControl" runat="server" Width="550px" Height="50px" TextMode="MultiLine"></asp:TextBox>
            <asp:Label ID="Label1" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            ความเห็นของผู้บังคับบัญชา :
        </td>
        <td class="style2" colspan="3" >
            <table border="0" cellpadding="0" cellspacing="0" width="100%">
                <tr>
                    <td align="left" colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        1. ความเห็นของผู้บังคับบัญชาชั้นต้น :&nbsp;
                    </td>
                </tr>
                <tr>
                    <td align="right">ความเห็น :&nbsp;</td>
                    <td colspan="3">
                        <asp:TextBox ID="txtCommentInitial" runat="server"  Width="430px" Height="50px" TextMode="MultiLine"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td width="15%" height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
                    <td width="35%">
                        <table border="0" cellpadding="0" cellspacing="0" width="250px">
                            <tr>
                                <td>
                                    <asp:Label ID="lblInitialStaffName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                                    <asp:Label ID="lblInitialStaffID" runat="server" Visible="false"></asp:Label>
                                    <asp:Label ID="lblInitialStaffPoscode" runat="server" Visible="false"></asp:Label>
                                    <asp:Label ID="lblInitialStaffOffcode" runat="server" Visible="false"></asp:Label>
                                </td>
                                <td>
                                    <asp:Button ID="btnSearchInitialStaff" runat="server" Text="..." Width="25px" Height="23px" />
                                    <uc9:frmSearchStaff ID="frmSearchInitialStaff" runat="server" />
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td width="15%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                    <td width="35%">
                        <asp:Label ID="lblInitialStaffPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                    </td>
                </tr>
                <tr ><td colspan="4">&nbsp;</td></tr>
                <tr>
                    <td align="left" colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        2. ความเห็นของผู้บังคับบัญชา :&nbsp;
                    </td>
                </tr>
                <tr>
                    <td align="right">ความเห็น :&nbsp;</td>
                    <td colspan="3">
                        <asp:TextBox ID="txtCommentCommander" runat="server"  Width="430px" Height="50px" TextMode="MultiLine"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
                    <td >
                        <table border="0" cellpadding="0" cellspacing="0" width="250px">
                            <tr>
                                <td>
                                    <asp:Label ID="lblCommanderStaffName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                                    <asp:Label ID="lblCommanderStaffID" runat="server" Visible="false"></asp:Label>
                                    <asp:Label ID="lblCommanderPoscode" runat="server" Visible="false"></asp:Label>
                                    <asp:Label ID="lblCommanderOffcode" runat="server" Visible="false"></asp:Label>
                                </td>
                                <td>
                                    <asp:Button ID="btnSearchCommanderStaff" runat="server" Text="..." Width="25px" Height="23px" />
                                    <uc9:frmSearchStaff ID="frmSearchCommanderStaff" runat="server" />
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                    <td >
                        <asp:Label ID="lblCommanderPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
                    </td>
                </tr>
            </table>
        </td>
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
            การรับรองการจับกุมและผลคดี
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
        <td class="style1" >ชื่อผู้รับรอง :</td>
        <td class="style2">
            <table width="250px" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <asp:Label ID="lblConfirmStaffName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                        <asp:Label ID="lblConfirmStaffID" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblConfirmStaffPoscode" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblConfirmStaffOffcode" runat="server" Visible="false"></asp:Label>
                    </td>
                    
                    <td>
                        <asp:Button ID="btnSearchConfirmStaff" runat="server" Text="..." Width="25px" Height="23px" />
                        <uc9:frmSearchStaff ID="frmSearchConfirmStaff" runat="server" />
                    </td>
                </tr>
            </table>
        </td>
        <td class="style1">ตำแหน่ง :</td>
        <td class="style2">
            <asp:Label ID="lblConfirmStaffPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
        </td>
    </tr>
    <tr style="height:30px">
        <td class="style1" >ชื่อผู้จับกุม :</td>
        <td class="style2">
            <asp:Label ID="lblAccuserName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
        </td>
        <td class="style1">ตำแหน่ง :</td>
        <td class="style2">
            <asp:Label ID="lblAccuserPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
        </td>
    </tr>
    <tr style="height:30px">
        <td class="style1" >วันที่จับกุม :</td>
        <td class="style2" colspan="3" >
            <asp:Label ID="lblOccurrenceDate" runat="server" BackColor="Silver" Width="100px" Height="23px"></asp:Label>
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
            ดำเนินการขออนุมัติ
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
            <asp:TextBox ID="txtAskLean" runat="server" Height="23px" Width="250px" ></asp:TextBox>
            <asp:Label ID="Label4" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
        </td>
    </tr>
    <tr style="height:30px" >
        <td class="style1">
            เห็นควรส่ง :
        </td>
        <td class="style2" colspan="3" >
            <asp:TextBox ID="txtDepartmentSend" runat="server" Height="23px" Width="250px" ></asp:TextBox>
            <asp:Label ID="Label2" runat="server" Text="*" ForeColor="#FF3300"></asp:Label>
        </td>
    </tr>
    <tr>
        <td class="style1" >ชื่อผู้ขออนุมัติ :</td>
        <td class="style2">
            <table width="250px" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <asp:Label ID="lblAskStaffName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                        <asp:Label ID="lblAskStaffID" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblAskPoscode" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblAskOffcode" runat="server" Visible="false"></asp:Label>
                    </td>
                    <td>
                        <asp:Button ID="btnSearchAskStaff" runat="server" Text="..." Width="25px" Height="23px" />
                        <uc9:frmSearchStaff ID="frmSearchAskStaff" runat="server" />
                    </td>
                </tr>
            </table>
        </td>
        <td class="style1">ตำแหน่ง :</td>
        <td class="style2">
            <asp:Label ID="lblAskPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
        </td>
    </tr>
</table>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tr style="height:20px">
        <td style="font-weight:bold;font-size:16;background-color:#D2D2D2;vertical-align:middle;">
            พิจารณาอนุมัติ
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
            <asp:TextBox ID="txtApproveLean" runat="server" Height="23px" Width="250px" ></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td class="style1" >ชื่อผู้อนุมัติ :</td>
        <td class="style2">
            <table width="250px" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <asp:Label ID="lblApproveStaffName" runat="server" BackColor="Silver" Width="220px" Height="23px"></asp:Label>
                        <asp:Label ID="lblApproveStaffID" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblApproveStaffPoscode" runat="server" Visible="false"></asp:Label>
                        <asp:Label ID="lblApproveStaffOffcode" runat="server" Visible="false"></asp:Label>
                    </td>
                    <td>
                        <asp:Button ID="btnSearchApproveStaff" runat="server" Text="..." Width="25px" Height="23px" />
                        <uc9:frmSearchStaff ID="frmSearchApproveStafff" runat="server" />
                    </td>
                </tr>
            </table>
        </td>
        <td class="style1">ตำแหน่ง :</td>
        <td class="style2">
            <asp:Label ID="lblApproveStaffPosname" runat="server" BackColor="Silver" Width="250px" Height="23px"></asp:Label>
        </td>
    </tr>
</table>