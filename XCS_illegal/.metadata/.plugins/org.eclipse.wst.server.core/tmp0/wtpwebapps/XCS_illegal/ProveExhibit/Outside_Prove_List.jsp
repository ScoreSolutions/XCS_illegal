<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<script type='text/javascript' src='dwr/interface/Exhibit.js'></script>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script language="javascript" type="text/javascript">
function winPopup(theURL,winName,features, myWidth, myHeight, isCenter) {

		if(window.screen)if(isCenter)if(isCenter=="true"){
			var myLeft = (screen.width-myWidth)/2;
			var myTop = (screen.height-myHeight)/2;
			features+=(features!='')?',':'';
			features+=',left='+myLeft+',top='+myTop;
		}
		window.open(theURL,winName,features+((features!='')?',':'')+'width='+myWidth+',height='+myHeight);

}
function clear2(){
	window.location.href="process?action=Outsideprove";
}

function btDelete(id)
{
	Exhibit.chkRefOutsideProve(id, function(data){
		if(data != "")
			alert(data);
		else{
			var answer = confirm ("ยืนยันการลบข้อมูล");
			if (answer){
				window.location.href="process?action=Outsideprove&id="+id+"&cmd=delete";
			}
		}
	});
	
}
</script>

		<!-- Header -->
		

    <form method="post" name="dataform"  action="<c:url value="process?action=Outsideprove&cmd=list"/>" >
 
		<!-- Body -->
		<table width="100%"  border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">บันทึกการตรวจรับของกลางจากหน่วยงานภายนอก</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><a href="process?action=Outsideprove&cmd=add" class="linkmenu3level">เพิ่มข้อมูล</a></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="1000" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
                  <tr>
                    <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
                    <td width="98%"></td>
                    <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td align="center" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="54%" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
                        <td width="46%">&nbsp;</td>
                      </tr>
                      <tr>
                        <td align="left" valign="top" colspan="2">
                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
								  <tr>
										<td width="20%" align="right">เลขที่งาน :&nbsp;</td>
										<td width="30%">
											<input type="text" name="job_no" size="30"  class="text"   value="${param.job_no }" >
										</td>
										<td width="15%" align="right">วันที่รับเรื่อง :&nbsp;</td>
										
										<TD>
							<input name="job_date1" id="job_date1" type="text" class="textdate" value="${param.job_date1 }" OnKeyPress="window.event.keyCode = 0" size="7" maxlength="10" />
							<a href="javascript:NewCssCal('job_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
							&nbsp;&nbsp;-&nbsp;&nbsp;
							<input name="job_date2" id="job_date2" type="text" class="textdate" value="${param.job_date2 }" OnKeyPress="window.event.keyCode = 0" size="7" maxlength="10" />
							<a href="javascript:NewCssCal('job_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
							</TD>
										
										
								  </tr>
								  <tr>
										<td align="right">เลขที่หนังสือจากหน่วยงานภายนอก :&nbsp;</td>
										<td >
											<input type="text" name="ref_doc_no" size="30"  class="text"   value="${param.ref_doc_no }" >
										</td>
										<td align="right">หนังสือลงวันที่ :&nbsp;</td>
										
										
						<TD>
							<input name="ref_doc_date1" id="ref_doc_date1" type="text" value="${param.ref_doc_date1 }" class="textdate" OnKeyPress="window.event.keyCode = 0" size="7" maxlength="10" />
							<a href="javascript:NewCssCal('ref_doc_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt=""  width="19" height="19" border="0" ></a>
							&nbsp;&nbsp;-&nbsp;&nbsp;
							<input name="ref_doc_date2" id="ref_doc_date2" type="text" value="${param.ref_doc_date2 }" class="textdate" OnKeyPress="window.event.keyCode = 0" size="7" maxlength="10" />
							<a href="javascript:NewCssCal('ref_doc_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
							</TD>
										
								  </tr>
								  <tr>
										<td align="right">หน่วยงานที่ส่งพิสูจน์ :&nbsp;</td>
										<td >
                                                    <input type="radio" name="dept_type" id="dept_typeP" value="P" <c:if test="${param.dept_type == 'P'}"> checked </c:if>>สถานีตำรวจ&nbsp;
                                                    <input type="radio" name="dept_type" id="dept_typeO" value="O" <c:if test="${param.dept_type == 'O'}"> checked </c:if>>หน่วยงานอื่นๆ&nbsp;
                                                    <input type="radio" name="dept_type" id="dept_type" value="" <c:if test="${param.dept_type !='P' && param.dept_type != 'O'}"> checked </c:if> >ไม่ระบุ
										</td>
										<td  align="right">ชื่อหน่วยงาน :&nbsp;</td>
										<td >
											<input type="text" name="doc_dept_name" size="30"  class="text"   value="${param.doc_dept_name }" >
										</td>
								  </tr>
								  <tr>
									<td  height="25" align="right">พ.ร.บ. :&nbsp;</td>
									<td >
										<select name="legislation_id" id="legislation_id" style="width:200px;">
											<option value="" <c:if test="${ltion.id == '' ||ltion.id == null}"> selected </c:if>>ทั้งหมด</option>
            									<c:forEach items="${ltlist}"  var="ltion">
            										<option value='${ltion.id}' <c:if test="${ltion.id == param.legislation_id}"> selected </c:if> >${ltion.legislation_code} ${ltion.legislation_name}</option>
            									</c:forEach>
            							</select>
									</td>
                                             <td>&nbsp;</td>
                                             <td colspan="2">
                                                  <INPUT TYPE="checkbox" NAME="isreturn" value="Y" <c:if test="${param.isreturn == 'Y'}"> checked </c:if> >รับของกลางคืนพร้อมผลการตรวจพิสูจน์
                                             </td>
								  </tr>
								  <tr>
                                              <td align="right">เลขที่หนังสือส่งผลการพิสูจน์ :&nbsp;</td>
                                              <td >
                                                   <input type="text" name="prove_no" size="30"  class="text"   value="${param.prove_no }" >
                                              </td>
                                              <td  align="right">สรรพสามิตพื้นที่ :&nbsp;</td>
                                              <td >
                                             	<select name="offcode" id="offcode" style="width:200px;" <c:if test="${IsAdmin!='1'}" >disabled</c:if> >
                                                   <option value="" selected >เลือก</option>
        											 <c:forEach items="${edlist}" var="off">
         											 <option value="${off.offcode}" <c:if test="${off.offcode == offcodenow}"> selected </c:if>>${off.short_name}</option>
       												 </c:forEach>
                                                 </select>
                                              </td>
                                              
								  </tr>
								  <tr>
									<td  height="25" align="right">สถานะ :&nbsp;</td>
									<td >
										<select name="status" id="status" style="width:200px;">
											<option value="" <c:if test="${'' == param.status || param.status== null }"> selected </c:if>>ทั้งหมด</option>
											<option value="0" <c:if test="${'0' == param.status}"> selected </c:if>>ระหว่างดำเนินการ</option>
											<option value="1" <c:if test="${'1' == param.status}"> selected </c:if>>ดำเนินการแล้ว</option>
										</select>
									</td>
                                    <td>&nbsp;</td>
                                    <td >
                                         &nbsp;
                                    </td>
                                    
								  </tr>
								  
							</table>
						  </td>
                      </tr>
                       <tr>
                              <td>&nbsp;</td>                       
                            <td height="25" align="left"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"><%@ include file="../Templates/clearIcon.jsp"%></td>
                          </tr>
                    </table></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
                    <td></td>
                    <td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
                  </tr>
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                	</form>
                <table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                   <tr  align="left" valign="top">
						<td colspan="6"><%=pageUtil.getPagination()%></td>
						<td align="right" colspan="3"><%=pageUtil.getPageStatus()%>	</td>
					</tr>
                    <tr  class="TblRow bgRowGray">
                      <td width="30" class="TblHeaderColumn">ลำดับ</td>
                      <td width="100" class="TblHeaderColumn">เลขที่งาน</td>
                      <td width="120" class="TblHeaderColumn">วัน เวลา ที่รับเรื่อง</td>
                      <td width="120" height="25" class="TblHeaderColumn">อ้างอิงเลขที่หนังสือ</td>
                      <td width="150" class="TblHeaderColumn">หน่วยงานที่ส่งพิสูจน์</td>
                      <td class="TblHeaderColumn">พ.ร.บ.</td>
                      <td width="80" class="TblHeaderColumn">เลขที่รายการพิสูจน์</td>
                      <td width="180" class="TblHeaderColumn">สรรพสามิตพื้นที่</td>
                      <td width="60" class="TblHeaderColumn">&nbsp;</td>
                    </tr>
                   
                    
                    
                <c:forEach items="${dblist}"  var="db" varStatus="i">
             <c:set var="Rows" value="${Rows + 1}" />
             <c:if test="${(Rows % 2) == 1}">

				<tr class="TblRow AlignLeft">
                    <td class="TblRow AlignCenter">${Rows}</td>
					<td ><a href="<c:url value="/process?action=Outsideprove&id=${db.id}&cmd=preup"/>" class="linkdatarow">${db.job_no}</a></td>
                    <td >${db.job_date2}</td>
                    <td >${db.ref_doc_no}</td>
                    <td >${db.doc_dept_name}</td>
                    <td >${db.legislation_name}</td>
                    <td >${db.prove_no}</td>
                    <td >${db.offname}</td>
                    <td>
                     	 <img src="images/icon_delete.gif" width="25" height="25" border="0" alt="ลบ" style="cursor:hand;" onclick = 'btDelete("${db.id}");'>
                    </td>
				</tr>
			</c:if>
			<c:if test="${(Rows % 2) == 0}">

				<tr class="TblRow bgRowGray">

                <td class="TblRow AlignCenter bgRowGray">${Rows}</td>
					<td ><a href="<c:url value="/process?action=Outsideprove&id=${db.id}&cmd=preup"/>" class="linkdatarow">${db.job_no}</a></td>
                   <td >${db.job_date2}</td>
                    <td >${db.ref_doc_no}</td>
                     <td >${db.doc_dept_name}</td>
                    <td >${db.legislation_name}</td>
                    <td >${db.prove_no}</td>
                    <td >${db.offname}</td>
                    <td>
                    	<img src="images/icon_delete.gif" width="25" height="25" border="0" alt="ลบ" style="cursor:hand;" onclick = 'btDelete("${db.id}");'>
                    </td>

				</tr>
			</c:if>
			</c:forEach>
                    
                  </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>


		

