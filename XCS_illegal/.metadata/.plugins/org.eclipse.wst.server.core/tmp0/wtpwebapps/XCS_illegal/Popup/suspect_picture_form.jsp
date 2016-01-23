<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>

<title>ภาพถ่ายผู้ต้องสงสัย : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>

<script type="text/javascript" language="JavaScript" src="../script/jquery.js" ></script>
<script type="text/javascript" language="JavaScript">
	function togglePict(bID,aID){
		mnuB = document.getElementById(bID);
		mnuA = document.getElementById(aID);

		if (mnuB.style.display == 'none'){
			mnuA.style.display = 'none';
			mnuB.style.display = '';
		}else{
			mnuA.style.display = '';
			mnuB.style.display = 'none';
		}
	}
</script>

<script type="text/javascript">
	function submitForm(){
		jQuery("form#picture_form").submit();
		//alert(jQuery("form#picture_form").serialize());
		window.close();
	}
</script>

</HEAD>

<BODY>

<%
	//SaveSuspectPicture?
	String suspectNo = request.getParameter("suspect_no");
%>

<iframe name="picture_frame" src="xxx" style="display:none;"></iframe>

<form action="../SaveSuspectPicture?suspect_no=<%=suspectNo%>&type=COLLECTION" method="post" 
	target="picture_frame" id="picture_form" enctype="multipart/form-data">
	
	<table border="0" cellpadding="0" cellspacing="0" width ="95%">
		  <tr>
			<td>&nbsp;</td>
			<td><span class="websitename">ภาพถ่ายผู้ต้องสงสัย</span></td>
		  </tr>
			<tr>
				<td colspan="5"><hr /></td>
			</tr>
			<tr>
				<td colspan="5">
					<input name="btnSave"  type="button" class="barbutton" value="บันทึก" onClick="submitForm();">
					<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" >
					<input name="btnBack"  type="submit" class="barbutton" value="กลับ" >
				</td>
			</tr>
			<tr>
				<td colspan="5"><hr /></td>
			</tr>
		  <tr>
			<td>&nbsp;</td>
			<td>
			  <table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
				   <td width="1%">&nbsp;</td>
				   <td width="25%" align="right">หมวดภาพถ่าย :&nbsp;</td>
				   <td width="30%">
					  <select style="width:150px" name="picture_category_id">
						  <option value="0">บุคคล</option>
						  <option value="1">สถานที่</option>
						  <option value="2">แผนที่</option>
						  <option value="3">ยานพาหนะ</option>
					  </select>
					  <font style="color:red">*</font>
					</td>
					<td width="20%">&nbsp;</td>
				    <td width="24%">&nbsp;</td>
				</tr>
					  <tr  id="picB">
						<td>&nbsp;</td>
						<td  align="right" valign="top" OnClick="togglePict('picB','picA');">ภาพถ่าย&nbsp;:&nbsp;</td>
						<td colspan="3" valign="top">
							<input name="picture" type="file" class="textbox" size="35">
							<input name="Submit2" type="button"  value="Upload">
							<font style="color:red">*</font><br>
							<font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
						</td>
					  </tr>
				<tbody  id="picA" style="display:none">
					  <tr >
						<td>&nbsp;</td>
						<td  align="right" valign="top" OnClick="togglePict('picB','picA');">ภาพถ่าย&nbsp;:&nbsp;</td>
						<td colspan="3" valign="top">
								<img src="../img_suspect/mr-bean02.jpg" border="0" width="100" height="100">
						  </td>
					  </tr>
					  <tr >
						<td>&nbsp;</td>
						<td  align="right" valign="top" >เปลี่ยนภาพถ่าย&nbsp;:&nbsp;</td>
						<td colspan="3" valign="top">
							<input name="file" type="file" class="textbox" size="35">
							<input name="Submit2" type="button"  value="Upload"><br>
							<font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
						  </td>
					  </tr>
				</tbody>
				<tr>
				   <td>&nbsp;</td>
				   <td align="right" valign="top">รายละเอียดภาพถ่าย :&nbsp;</td>
				   <td colspan="3"><textarea name="description" cols="40" rows="3" class="textareabig"></textarea></td>
				</tr>
				<tr>
				  <td align="right">&nbsp;</td>
				  <td>&nbsp;</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
			  </table>
             </td>
		  </tr>
		  <tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		  </tr>
	</table>
  </form>
</BODY>
</HTML>
