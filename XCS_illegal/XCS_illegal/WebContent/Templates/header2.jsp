<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<style>
<!--
#slidemenubar, #slidemenubar2{
  top:1px;
  position:absolute;
  font-weight:bold;
  border:1.5px solid green;
  background-color:#552288;
  layer-background-color:#552288;
  line-height:20px;
}
-->
</style> 
<body onload="MM_preloadImages('images/icon_top_mytask_02.png','images/icon_top_myprofile_02.png','images/icon_top_help_02.png');draw();">
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td valign="top" height="100">

        <!-- JavaScript Menu -->
        <LINK href="Templates/Menu/ExciseMenu.css" type="text/css" rel="stylesheet" />
        <SCRIPT language="javascript" type="text/javascript" src="Templates/Menu/unimenu.js"></SCRIPT>
        <SCRIPT language="javascript" type="text/javascript" src="Templates/Menu/ExciseMenucfg.js"></SCRIPT>


        <iframe frameborder="0" style="position:absolute;z-index:20;width:1px;height:1px" name='menuFrame' id='menuFrame'>
        </iframe>
        <table width="100%" height="100" border="0" cellpadding="0" cellspacing="0" >
            <tr>
                <td width="52%" background="images/bk_violet.jpg">
                    <table width="95%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td width="26%"><img src="images/logo.png" width="166" height="96" alt="" /></td>
                            <td width="74%" align="left" valign="middle">
                              <img src="images/pic_webname.png" width="355" height="60" />
                            </td>
                        </tr>
                    </table>
                </td>
                <td width="48%" align="right" valign="bottom" background="images/bk_violet.jpg">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                          <td width="40%" align="right">&nbsp;</td>
                          <td width="60%" align="left">
                              <span class="logindetailwhite">
                          ผู้ใช้ : <span class="logindetailnormalwhite">นายปัณณวิชญ์ สันติประสิทธิ์กุล</span>  <br />
                              </span>
                          </td>
                        </tr>
                        <tr>
                          <td  align="right">&nbsp;</td>
                          <td  align="left">
                              <span class="logindetailwhite">ตำแหน่ง :
                                <span class="logindetailnormalwhite">ผู้ดูแลระบบ</span>
                              </span>
                          </td>
                        </tr>
                        <tr>
                          <td  align="left"></td>
                          <td  align="left">
                              <span class="logindetailwhite">หน่วยงาน :
                                  <span class="logindetailnormalwhite">ส่วนคดี สสพ.กรุงเทพฯ3 |
                                      <b> <a href="#">ออกจากระบบ</a></b></span>
                              </span>
                          </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td bgcolor="#EDEDED" colspan="2">
                    <!-- Menu-->
                    <ul id="ExciseMenu_ul" style="display: none;">
                        <li title=>
                            <a href="index.jsp" target="_self" title="หน้าแรก">หน้าแรก</a>
                        </li>
                        <li></li>
                        <li title="">
                            <a href="javascript:void(0)" target="_self" title="งานสืบสวนข้อมูล">งานสืบสวนข้อมูล</a>
                            <ul>
                                <li title="">
                                    <a href="Suspect.jsp?action=suspectList01" target="_self" title="">ผู้ต้องสงสัย</a>
                                </li>
                                <li>
                                  <a href="Invest.jsp?action=InvestReport" target="_self" title="">รายงานการสืบสวน</a>
                                </li>
                                <li title="">
                                  <a href="Invest.jsp?action=SearchWarrant" target="_self" title="">จัดทำหมายค้น</a>
                                </li>
                                <li>
                                  <a href="Invest.jsp?action=2_27" target="_self" title="">ใบรับรองความบริสุทธิ์</a>
                                </li>
                                <li>
                                  <a href="Protect.jsp?action=NoticeArrestList" target="_self" title="">ใบแจ้งความนำจับ</a>
                                </li>
                            </ul>
                        </li>
                        <li></li>
                        <li title="">
                            <a href="javascript:void(0)" target="_self" title="">งานจับกุม</a>
                            <ul>
                                <li title="">
                                    <a href="Protect.jsp?action=ArrestSearch" target="_self" title="">บันทึกการจับกุม</a>
                                </li>
                                <li title="">
                                    <a href="Protect.jsp?action=LavySearch" target="_self" title="">อายัดทรัพย์สิน</a>
                                </li>
                            </ul>
                        </li>
                        <li></li>
                        <li title="">
                            <a href="javascript:void(0)" target="_self" title="">งานเปรียบเทียบคดี</a>
                            <ul>
                                <li title="">
                                    <a href="CompareCase.jsp?action=BookImpList" target="_self" title="">บันทึกรับคำกล่าวโทษ(1/55)</a>
                                </li>
                                <li title="">
                                    <a href="CompareCase.jsp?action=CompareList" target="_self" title="">เปรียบเทียบปรับ</a>
                                </li>
                                <li>
                                  <a href="">รายงานการขออนุมัติเปรียบเทียบคดี</a>
                                </li>
                                <li title="">
                                    <a href="CompareCase.jsp?action=PayFineList" target="_self" title="">ชำระเงินค่าปรับและออกใบเสร็จ</a>
                                </li>

                                <li title="">
                                    <a href="CompareCase.jsp?action=RewardReqList" target="_self" title="">คำร้องขอรับเงินสินบนและรางวัล</a>
                                </li>
                                <li title="">
                                    <a href="CompareCase.jsp?action=RewardDivideList" target="_self" title="">แบ่งเงินสินบนรางวัล</a>
                                </li>
                            </ul>
                        </li>
                        <li></li>
                        <li title="">
                            <a href="javascript:void(0)" target="_self" title="">งานนำส่งเงินไปยังระบบรายได้</a>
                            <ul>
                                <li title="">
                                    <a href="CompareCase.jsp?action=IncRedList" target="_self" title="">การเพิ่ม-ลดค่าปรับเปรียบเทียบ</a>
                                </li>
                                <li title="">
                                    <a href="CompareCase.jsp?action=SendIncomeList" target="_self" title="">การนำส่งเงินรายได้</a>
                                </li>
                            </ul>
                        </li>
                        <li></li>
                        <li title="">
                            <a href="javascript:void(0)" target="_self" title="">งานพิสูจน์ของกลาง</a>
                            <ul>
                                <li title="">
                                    <a href="ProveExhibit.jsp?action=InsideProveList" target="_self" title="">หน่วยงานภายใน</a>
                                </li>
                                <li title="">
                                    <a href="ProveExhibit.jsp?action=OutsideProveList" target="_self" title="">หน่วยงานภายนอก</a>
                                </li>
                                <li>
                                  <a href="ProveExhibit.jsp?action=SendExhibitList" target="_self" title ="" >ใบนำส่งของกลางเพื่อจัดเก็บ</a>
                                </li>
                            </ul>
                        </li>
                        <li></li>
                        <li title="">
                            <a href="javascript:void(0)" target="_self" title="">งานจัดการของกลาง</a>
                            <ul>
                                <li title="">
                                    <a href="ManageExhibit.jsp?action=ReceiveList" target="_self" title="">การตรวจรับของกลาง</a>
                                </li>
                                <li title="">
                                    <a href="ManageExhibit.jsp?action=DestroyList" target="_self" title="">การทำลายของกลาง</a>
                                </li>

                                <li title="">
                                    <a href="ManageExhibit.jsp?action=SellList" target="_self" title="">การขายทอดตลาด</a>
                                </li>
                                <li title="">
                                    <a href="ManageExhibit.jsp?action=ReturnList" target="_self" title="">การคืนของกลาง</a>
                                </li>

                                <li title="">
                                    <a href="ManageExhibit.jsp?action=KeepList" target="_self" title="">การจัดเก็บของกลาง</a>
                                </li>
                                <li title="">
                                    <a href="ManageExhibit.jsp?action=RegisterList" target="_self" title="">ทะเบียนสินค้าและของกลาง</a>
                                </li>
                            </ul>
                        </li>
                        <li></li>
                        <li title="">
                            <a href="javascript:void(0)" target="_self" title="">งานทะเบียนประวัติผู้กระทำผิด</a>
                            <ul>
                                <li title="">
                                    <a href="javascript:void(0)" target="_self" title="">บันทึกการจับกุม</a>
                                </li>
                                <li title="">
                                    <a href="javascript:void(0)" target="_self" title="">บันทึกรับคำกล่าวโทษ</a>
                                </li>
                            </ul>
                        </li>
                        <li></li>
                        <li title="">
                            <a href="javascript:void(0)" target="_self" title="">รายงานและสถิติข้อมูล</a>
                            <ul>
                                <li title="">
                                    <a href="SummaryReports.jsp?action=repInvest" target="_self" title="">ส่วนสืบสวน</a>
                                </li>
                                <li title="">
                                    <a href="SummaryReports.jsp?action=repProtect" target="_self" title="">ส่วนปราบปราม</a>
                                </li>
                                <li title="">
                                    <a href="SummaryReports.jsp?action=repCase" target="_self" title="">ส่วนคดี</a>
                                </li>
                                <li title="">
                                    <a href="SummaryReports.jsp?action=repExhibit" target="_self" title="">ส่วนพิสูจน์และจัดการของกลาง</a>
                                </li>
                            </ul>
                        </li>
                        <li></li>
                        <li title="">
                            <a href="javascript:void(0)" target="_self" title="">ข้อมูลหลัก</a>
                            <ul>
                                <li title="">
                                    <a href="javascript:void(0)" target="_self" title="">ข้อมูลศาล</a>
                                </li>
                                <li title="">
                                    <a href="javascript:void(0)" target="_self" title="">ข้อกล่าวหา</a>
                                </li>
                                <li title="">
                                    <a href="javascript:void(0)" target="_self" title="">ประเภทใบอนุญาติ</a>
                                </li>
                                <li title="">
                                    <a href="javascript:void(0)" target="_self" title="">ข้อมูลเชื้อชาติ</a>
                                </li>
                                <li title="">
                                    <a href="javascript:void(0)" target="_self" title="">ข้อมูลสัญชาติ</a>
                                </li>
                                <li title="">
                                    <a href="javascript:void(0)" target="_self" title="">ข้อมูลศาสนา</a>
                                </li>
                                <li title="">
                                    <a href="javascript:void(0)" target="_self" title="">ประเภทภาพถ่าย</a>
                                </li>
                                <li title="">
                                    <a href="javascript:void(0)" target="_self" title="">ข้อมูลความสัมพันธ์</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </td>
            </tr>
            <tr>
                <td height="2" bgcolor="#999999"></td>
                <td align="right" bgcolor="#999999"></td>
            </tr>
            <tr>
                <td height="3" align="left" colspan="2" bgcolor="#FFFFFF">
                    <table width="203" border="0" height="3" cellspacing="0" cellpadding="0">
                        <tr>
                            <td width="200" bgcolor="#999999"></td>
                            <td><img src="images/pic_angleMenu.gif" /></td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>




        <div id="slidemenubar2" style="padding: 3px 3px 3px 3px; background-color:#552288;z-index:50;" onMouseover="pull()" onMouseout="draw()">
          <script type="text/javascript" src="Templates/SlideMenu/stlib.js"></script>
          <table style="border-width:1px; border-color:#ffffff; border-style:solid;" ><tr><td>
          <span id="ctl00_MenuContent_MenuCtl1_lblMenuOutput">


          <script type="text/javascript">
          <!--
          stBM(2,"tree6ed7",[0,"","","/Web_App/images/blank.gif",0,"left","default","hand",1,0,-1,-1,-1,"none",0,"#0066CC","#663399","","no-repeat",1,"/Web_App/images/button_01.gif","/Web_App/images/button_02.gif",10,10,0,"line_def0.gif","line_def1.gif","line_def2.gif","line_def3.gif",1,0,5,3,"left",0,0]);
          stBS("p0",[0,0]);
          stIT("p0i0",["ข้อมูลผู้ใช้","/Web_App/SHNDMain.aspx","_self","","","","",0,0,"bold 9pt 'Tahoma'","#FFFF00","none","transparent","/Web_App/images/bg_01.gif","repeat-x","bold 9pt 'Tahoma'","#000000","none","transparent","/Web_App/images/bg_01.gif","repeat-x","bold 9pt 'Tahoma'","#FFFFFF","none","transparent","/Web_App/images/bg_01.gif","repeat-x","bold 9pt 'Tahoma'","#000000","none","transparent","/Web_App/images/bg_01.gif","repeat-x",1,0,"left","middle",180,21]);
          stIT("p0i1",["เปลี่ยนรหัสผ่าน","/Web_App/SHNDChangePassword.aspx",,,,,,,,,"#FFFFFF",,,,,,,,,,,,,,,,,,,,,,,,,,,0],"p0i0");stIT("p0i2",["สร้างสูตรและเมนูอาหาร","#",,,,,,,,,"#FFFFFF"],"p0i1");
          stBS("p1",[,0],"p0");
          stIT("p1i0",["Transaction","#",,,,,,,,,"#FFFFFF",,,"","no-repeat",,"#FFFFFF","underline",,"","no-repeat",,,,,"","no-repeat",,"#FFFFFF","underline",,"","no-repeat",,,,,,17],"p0i1");stBS("p2",[,0],"p0");
          stIT("p2i0",["- เมนูอาหารมาตรฐาน","/Web_App/app_formula/Transaction/StandardMenuSearch.aspx",,,,,,,,"9pt 'Tahoma'","#FFFFFF",,"#1F2C3A",,,"9pt 'Tahoma'",,,"#1F2C3A",,,"9pt 'Tahoma'",,,"#1F2C3A",,,"9pt 'Tahoma'",,,"#1F2C3A",,,,,,,,15],"p1i0");stIT("p3i1",["- เมนูอาหารล่วงหน้า","/Web_App/app_formula/Transaction/MenuSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stIT("p1i1",["Master","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p3",[,0],"p0");
          stIT("p3i1",["- ประเภทอาหาร","/Web_App/app_formula/master/FoodType.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ชนิดอาหาร","/Web_App/app_formula/master/FoodCategory.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ชนิดสารอาหารที่ควบคุม","/Web_App/app_formula/master/DiseaseCategory.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ชนิดของนม","/Web_App/app_formula/master/MilkCategory.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- เบอร์นม","/Web_App/App_admin/Master/MilkCode.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- สูตรอาหารสำรับ","/Web_App/app_formula/Transaction/FormulaSetSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- สูตรอาหารทางการแพทย์","/Web_App/app_formula/master/FormulaFeedMD.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- สูตรอาหาร Blenderize Diet","/Web_App/app_formula/master/BlenderizeDietSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- สูตรอาหาร Liquid Diet","/Web_App/app_formula/master/FormulaFeedLDSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- สูตรนมผสมสำหรับเด็ก","/Web_App/app_formula/master/FormulaMilk.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stES();
          stIT("p0i3",["คลังวัสดุและอุปกรณ์","#",,,,,,,,,"#FFFFFF"],"p0i1");
          stBS("p4",[,0],"p0");
          stIT("p4i0",["ToDoList","/Web_App/App_Inventory/ToDoList/ToDoList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p4i1",["Transaction","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p5",[,0],"p0");
          stIT("p3i1",["- รับเข้าคลัง","/Web_App/app_inventory/Transaction/StockInSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- เบิกวัสดุ","/Web_App/app_inventory/Transaction/StockOutRequestSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- จ่ายวัสดุ","/Web_App/app_inventory/Transaction/StockOutSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- คืนคลัง","/Web_App/app_inventory/Transaction/ReturnRequestSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- รับคืน","/Web_App/app_inventory/Transaction/ReturnWarehouseSeacrh.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ส่งคืน","/Web_App/app_inventory/Transaction/SendSupplier.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- แจ้งซ่อม","/Web_App/app_inventory/Transaction/RepairRequestSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ส่งซ่อม","/Web_App/app_inventory/Transaction/RepairSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- จำหน่ายของเสีย","/Web_App/app_inventory/Transaction/StockoutWasteSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ตรวจนับวัสดุ","/Web_App/app_inventory/Transaction/StockCheckCounter.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ตรวจสอบการตรวจนับ","/Web_App/app_inventory/Transaction/StockCheckAudit.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- อนุมัติการตรวจนับ","/Web_App/app_inventory/Transaction/StockCheckHead.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stIT("p4i2",["Master","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p6",[,0],"p0");
          stIT("p3i1",["- หน่วยนับ","/Web_App/app_inventory/master/unit.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- หมวดวัสดุ","/Web_App/app_inventory/master/MaterialClass.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ประเภทวัสดุ","/Web_App/app_inventory/master/MaterialGroup.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- บริษัท/ร้านค้า","/Web_App/app_inventory/master/Supplier.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- วัสดุอาหาร","/Web_App/app_inventory/master/MaterialFoodSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- สารอาหาร","/Web_App/app_formula/master/Nutrient.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- อาหารทางสาย/นม/ยา","/Web_App/app_inventory/master/MaterialFeed.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- วัสดุอุปกรณ์","/Web_App/app_inventory/master/MaterialTool.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stES();
          stIT("p0i4",["วางแผนความต้องการ","#",,,,,,,,,"#FFFFFF"],"p0i1");
          stBS("p7",[,0],"p0");
          stIT("p7i0",["ยอดประมาณการคงเหลือ","/Web_App/app_Plan/Transaction/ToDoListRemain.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p7i1",["Transaction","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p8",[,0],"p0");
          stIT("p3i1",["- แผนประมาณการวัสดุอาหาร","/Web_App/app_Plan/Transaction/PlanOrderFoodSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- แผนประมาณการวัสดุอาหาร (หน่วยงาน)","/Web_App/app_Plan/Transaction/PlanOrderFoodDivisionSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- แผนประมาณการวัสดุอาหารตามสัญญา","/Web_App/app_Plan/Transaction/PlanContractFoodSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- แผนประมาณการวัสดุอุปกรณ์","/Web_App/app_Plan/Transaction/PlanOrderToolsSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- แผนประมาณการวัสดุอุปกรณ์ (หน่วยงาน)","/Web_App/app_Plan/Transaction/PlanOrderToolsDivisionSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- แผนประมาณการวัสดุอุปกรณ์ตามสัญญา","/Web_App/app_Plan/Transaction/PlanContractToolsSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stIT("p7i2",["Master","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p9",[,0],"p0");
          stIT("p3i1",["- วันหยุด","/Web_App/App_admin/Master/Holiday.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stES();
          stIT("p0i5",["สั่งอาหาร","#",,,,,,,,,"#FFFFFF"],"p0i1");
          stBS("p10",[,0],"p0");
          stIT("p10i0",["Transaction","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p11",[,0],"p0");
          stIT("p3i1",["- สั่งอาหารผู้ป่วย","/Web_App/app_Order/Transaction/OrderFoodSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- สั่งอาหารจัดเลี้ยง (หน่วยงาน)","/Web_App/app_Order/Transaction/OrderPartyDept.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- สั่งอาหารจัดเลี้ยง (ผู้อำนวยการ)","/Web_App/app_Order/Transaction/OrderPartyDirector.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- สั่งอาหารจัดเลี้ยง (ฝ่ายโภชนาการ)","/Web_App/app_Order/Transaction/OrderPartyOfficer.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- สั่งอาหารสวัสดิการ","/Web_App/app_Order/Transaction/OrderWelfare.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stIT("p10i1",["Master","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p12",[,0],"p0");
          stIT("p3i1",["- กำหนดสิทธิ์การใช้บริการอาหารสวัสดิการ","/Web_App/app_Order/Master/WelfareRight.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stES();
          stIT("p0i6",["จัดส่งอาหาร","#",,,,,,,,,"#FFFFFF"],"p0i1");
          stBS("p13",[,0],"p0");
          stIT("p13i0",["Transaction","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p14",[,0],"p0");
          stIT("p3i1",["- การจัดส่งอาหารสำรับ","/Web_App/app_Delivery/Transaction/OrderTransferSet.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- การจัดส่งอาหารทางสายให้อาหาร","/Web_App/app_Delivery/Transaction/OrderTransferFeed.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- การจัดส่งนมผสมสำหรับเด็ก","/Web_App/app_Delivery/Transaction/OrderTransferMilk.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- การงดอาหาร","/Web_App/App_Prepare/Transaction/NpoOrderSet.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stES();
          stIT("p0i7",["สั่งซื้อวัสดุ","#",,,,,,,,,"#FFFFFF"],"p0i1");
          stBS("p15",[,0],"p0");
          stIT("p15i0",["Transaction","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p16",[,0],"p0");
          stIT("p3i1",["- ใบสั่งซื้อล่วงหน้า (หน่วยงาน)","/Web_App/app_Purchase/Transaction/PrePODivisionSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ใบสั่งซื้อล่วงหน้า","/Web_App/app_Purchase/Transaction/PrePOSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ตรวจรับวัสดุอาหาร","/Web_App/app_Purchase/Transaction/ReceiveSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ใบสั่งซื้อ","/Web_App/app_Purchase/Transaction/POSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stES();
          stIT("p0i8",["เตรียมการผลิตอาหาร","#",,,,,,,,,"#FFFFFF"],"p0i1");
          stBS("p17",[,0],"p0");
          stIT("p17i0",["Transaction","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p18",[,0],"p0");
          stIT("p3i1",["- Register การสั่งอาหารสำรับ","/Web_App/App_Prepare/Transaction/RegisterOrderSet.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- Register การสั่งอาหารทางสายให้อาหาร","/Web_App/App_Prepare/Transaction/RegisterOrderFeed.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- Register การสั่งนมผสมสำหรับเด็ก","/Web_App/App_Prepare/Transaction/RegisterOrderMilk.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- การงดอาหาร","/Web_App/App_Prepare/Transaction/NpoOrderSet.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- การเปลี่ยนแปลงอาหาร","/Web_App/App_Prepare/Transaction/ChangOrder.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- จัดอาหารสำรับ","/Web_App/App_Prepare/Transaction/OrderPatientSet.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- จัดอาหารทางสายให้อาหาร","/Web_App/App_Prepare/Transaction/OrderFeedSet.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- จัดนมผสมสำหรับเด็ก","/Web_App/App_Prepare/Transaction/OrderMilkSet.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- รายงานสารอาหารที่ผู้ป่วยได้รับ","/Web_App/App_Prepare/PreReport/PatientNutrientPreReport.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ใบแจ้งค่าอาหารทางการแพทย์","/Web_App/App_Prepare/Transaction/MedFeedCharge.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ตัดยอดวัตถุดิบสำหรับเตรียมอาหารสำรับ","/Web_App/App_Prepare/Transaction/CutOrder.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- แจ้งคืนวัตถุดิบหลังเตรียม","/Web_App/App_Prepare/Transaction/PrepareReturn.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- น้ำหนักหลังเตรียม","/Web_App/App_Prepare/Transaction/PrepareWeightAfter.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- เมนูอาหารสำรับ","/Web_App/PreReport/PreMenuFormulaReport.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- จัดอาหารจัดเลี้ยง","/Web_App/App_Prepare/Transaction/PrepareParty.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- จัดอาหารสวัสดิการ","/Web_App/App_Prepare/PreReport/WelfarePreReport.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- จำนวนผู้รับบริการอาหารสวัสดิการ","/Web_App/App_Prepare/Transaction/WelRealServiceSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stES();
          stIT("p0i9",["รายงานสรุป","#",,,,,,,,,"#FFFFFF"],"p0i1");
          stBS("p19",[,0],"p0");
          stIT("p19i0",["รายงานสรุปผู้ป่วยตามชนิดอาหาร","/Web_App/PreReport/PrePatientQtyFeed.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i1",["รายงานสรุปผู้ป่วยตามประเภทการให้อาหาร","/Web_App/PreReport/PrePatientQtyTypeFeed.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i2",["รายงานสรุปจำนวนการใช้ภาชนะ","/Web_App/PreReport/PreContainerUseQty.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i3",["รายงานสรุปจำนวนการใช้วัตถุดิบ","/Web_App/PreReport/PreMaterialUseQty.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i4",["รายงานสรุปจำนวนการเบิกอาหารทางการแพทย์","/Web_App/PreReport/PreMaterialCM.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i5",["รายงานสรุปจำนวนการเบิก Blenderize Diet","/Web_App/PreReport/PreMaterialBD.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i6",["รายงานสรุปจำนวนการใช้วัสดุอุปกรณ์","/Web_App/PreReport/PreToolsUseQty.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i7",["รายงานสรุปจำนวนการจ่ายอาหารทางการแพทย์เป็นกระป๋อง","/Web_App/PreReport/PreMedCharge.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i8",["รายงานสรุปจำนวนผู้ป่วยตามชนิดของนม","/Web_App/PreReport/PrePatientQtyMilk.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i9",["รายงานสรุปปริมาณการใช้นมผง","/Web_App/PreReport/PreMaterialMilk.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i10",["รายงานสรุปจำนวนผู้ป่วยตามประเภทอาหาร","/Web_App/PreReport/PrePatientSetQty.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i11",["เมนูอาหารสำรับ","/Web_App/PreReport/PreMenuFormulaReport.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i12",["Portion อาหาร","/Web_App/PreReport/PreMenuPortionReport.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i13",["รายงานสรุปยอดการสั่งซื้อวัสดุอาหาร","/Web_App/PreReport/PreMaterialOrder.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i14",["รายงานสรุปยอดประมาณการคงเหลือ","/Web_App/PreReport/PreMaterialOrderRemain.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i15",["รายงานการเตรียมอาหารสำรับตามเมนู","/Web_App/PreReport/PrePrepareSet.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i16",["รายงานสรุปสถิติการใช้วัตถุดิบ","/Web_App/PreReport/PreMaterialUseQtyClass.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i17",["รายงานสถิตส่วนต่างจากการเตรียม","/Web_App/PreReport/PreCompareInterest.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i18",["รายงานสถิตการเปลี่ยนชนิดของผักและผลไม้","/Web_App/PreReport/PreChangeVegetable.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i19",["รายงานการจำแนกฤดูกาลของผักและผลไม้","/Web_App/PreReport/PreMaterialSeason.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i20",["รายงานสรุปจำนวนผู้รับบริการอาหารสวัสดิการ","/Web_App/PreReport/PreWelfareQty.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i21",["รายงานสรุปจำนวนผู้มีสิทธิ์รับบริการอาหารสวัสดิการ","/Web_App/PreReport/PreWelfareRightQty.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i22",["รายงานเปรียบเทียบจำนวนผู้รับบริการอาหารสวัสดิการ","/Web_App/PreReport/PreWelfareCompare.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i23",["รายงานสรุปรายการวัสดุอาหารที่รับเข้าคลัง","/Web_App/PreReport/PreStockinMaterialList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i24",["รายงานสรุปยอดวัสดุอาหารที่รับเข้าคลัง","/Web_App/PreReport/PreStockinMaterial.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i25",["รายงานสรุปรายการวัสดุอาหารที่หน่วยงานเบิก","/Web_App/PreReport/PreRequisitionMaterialList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i26",["รายงานสรุปยอดวัสดุอาหารที่หน่วยงานเบิก","/Web_App/PreReport/PreRequisitionMaterial.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i27",["รายงานสรุปรายการวัสดุอาหารที่จ่ายออก","/Web_App/PreReport/PreRequisitionMaterialList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i28",["รายงานสรุปยอดวัสดุอาหารที่จ่ายออก","/Web_App/PreReport/PreRequisitionMaterial.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i29",["รายงานสรุปรายการวัสดุอาหารที่รับคืนจากหน่วยงาน","/Web_App/PreReport/PreStockInReturnMaterialList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i30",["รายงานสรุปยอดวัสดุอาหารที่รับคืนจากหน่วยงาน","/Web_App/PreReport/PreStockInReturnMaterial.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i31",["รายงานสรุปรายการวัสดุอาหารที่ส่งคืนผู้จำหน่าย","/Web_App/PreReport/PreStockoutSupplist.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i32",["รายงานสรุปยอดวัสดุอาหารที่ส่งคืนผู้จำหน่าย","/Web_App/PreReport/PreStockoutSuppMaterial.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i33",["รายงานสรุปรายการวัสดุอาหารที่จำหน่ายออกเป็นของเสีย","/Web_App/PreReport/PreStockoutLostList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i34",["รายงานสรุปยอดวัสดุอาหารที่จำหน่ายออกเป็นของเสีย","/Web_App/PreReport/PreStockoutMaterial.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i35",["รายงานสรุปรายการวัสดุอุปกรณ์ที่รับเข้าคลัง","/Web_App/PreReport/PreStockinToolList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i36",["รายงานสรุปยอดวัสดุอุปกรณ์ที่รับเข้าคลัง","/Web_App/PreReport/PreStockinTools.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i37",["รายงานสรุปรายการวัสดุอุปกรณ์ที่หน่วยงานเบิก","/Web_App/PreReport/PreRequisitionToolList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i38",["รายงานสรุปยอดวัสดุอุปกรณ์ที่หน่วยงานเบิก","/Web_App/PreReport/PreRequisitionTool.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i39",["รายงานสรุปรายการวัสดุอุปกรณ์ที่จ่ายออก","/Web_App/PreReport/PreRequisitionToolList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i40",["รายงานสรุปยอดวัสดุอุปกรณ์ที่จ่ายออก","/Web_App/PreReport/PreRequisitionTool.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i41",["รายงานสรุปรายการวัสดุอุปกรณ์ที่รับคืนจากหน่วยงาน","/Web_App/PreReport/PreStockinToolList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i42",["รายงานสรุปยอดวัสดุอุปกรณ์ที่รับคืนจากหน่วยงาน","/Web_App/PreReport/PreStockinTools.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i43",["รายงานสรุปรายการวัสดุอุปกรณ์ที่ส่งคืนคลังของโรงพยาบาล","/Web_App/PreReport/PreStockOutHosList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i44",["รายงานสรุปยอดวัสดุอุปกรณ์ที่ส่งคืนคลังของโรงพยาบาล","/Web_App/PreReport/PreStockOutHosMaterial.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i45",["รายงานแสดงรายการวัสดุอุปกรณ์ที่มีการส่งซ่อม","/Web_App/PreReport/PreRepairList.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i46",["รายงานสรุปข้อมูลความถี่การส่งซ่อม","/Web_App/PreReport/PreRepairFrequency.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i47",["รายงานสรุปวัสดุอาหารคงเหลือ","/Web_App/PreReport/PreMaterialRemain.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stIT("p19i48",["รายงานสรุปค่าใช้จ่ายสำหรับผู้ป่วย","/Web_App/PreReport/PreBillingReport.aspx",,,,,,,,,"#FFFFFF"],"p1i0");
          stES();
          stIT("p0i10",["รักษาความปลอดภัย","#",,,,,,,,,"#FFFFFF"],"p0i1");
          stBS("p20",[,0],"p0");
          stIT("p20i0",["Master","#",,,,,,,,,"#FFFFFF"],"p1i0");
          stBS("p21",[,0],"p0");
          stIT("p3i1",["- เมนูการใช้งานระบบ","/Web_App/App_admin/Master/SystemMenu.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- กลุ่มการใช้งาน","/Web_App/App_admin/Master/GroupPermissionSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- หอผู้ป่วย","/Web_App/App_admin/Master/Ward.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- หน่วยงาน","/Web_App/App_admin/Master/DivisionSearch.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stIT("p3i1",["- ผู้ใช้และสิทธิ์การใช้งาน","/Web_App/App_admin/Master/Officer.aspx",,,,,,,,,"#FFFFFF"],"p2i0");stES();
          stES();

          stIT("p0i11",["ออกจากระบบ","/Web_App/SHNDLogin.aspx?logout=yes",,,,,,,,,"#FF5555",,,,,,,,,,,,,,,,,,,,,,,,,,,0],"p0i0");
          stES();
          stEM();
          //-->
          </script>
          </span>
          </td>
          <td align="center" style="color:white" valign="top">
          <br />M<br />E<br />N<br />U
          </td></tr></table>
        </div>

        <script language="JavaScript1.2">
          // initial value
          mnu = document.getElementById('menuFrame');
          themenu = document.getElementById('slidemenubar2').style;
          rightboundary=0;
          if (document.all) {
              window.onload=regenerate2;
          }
          setValue();

          // working function

          function regenerate(){
              window.location.reload()
          }
          function regenerate2(){
              if (document.layers)
                  setTimeout("window.onresize=regenerate",400)
          }
          function setValue() {
                  leftboundary=-1 * (getWide() - 20);
                  mnu.style.height=getHeight();
          }

          function pull(){
              setValue();
              if (document.all) {
                  if (window.drawit)
                      clearInterval(drawit);

                  pullit=setInterval("pullengine()",2);
              }
              else
              {
                  themenu.left="0" + "px";
              }
          }

          function draw(){
              setValue();
              if (document.all) {
                  clearInterval(pullit);
                  drawit=setInterval("drawengine()",2);
              }
              else
              {
                  themenu.left= -1 * (getWide() - 20) + "px";
              }
          }

          function pullengine(){
              if (document.all&&themenu.pixelLeft<rightboundary) {
                  if (themenu.pixelLeft < -15) {
                     themenu.pixelLeft+=15;
                      mnu.style.pixelLeft+=15;
                     }
                   else {
                     themenu.pixelLeft = 0;
                     mnu.style.pixelLeft = 0;
                   }

              }
              else if (window.pullit)
                  clearInterval(pullit);
          }

          function drawengine(){
              if (document.all&&themenu.pixelLeft>leftboundary) {
                  if (themenu.pixelLeft - leftboundary < 15) {
                      themenu.pixelLeft = leftboundary;
                      mnu.style.pixelLeft = leftboundary;
                  }
                  else {
                      mnu.style.pixelLeft-=15;
                      themenu.pixelLeft-=15;
                  }
              }
              else if (window.drawit)
                  clearInterval(drawit);
          }
          function getWide()
          {
              return document.getElementById('slidemenubar2').offsetWidth;
          }
          function getHeight()
          {
              return document.getElementById('slidemenubar2').offsetHeight;
          }

          themenu.top = "78px";
          if (getWide() > 20)
              themenu.left = -1 * (getWide() - 20) + "px";


          mnu.style.width=getWide();
          mnu.style.height=getHeight();
          mnu.style.top=themenu.top;
          mnu.style.left=themenu.left;
        </script>
	</td>
  </tr>

