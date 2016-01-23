<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>

<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
		 		<td width="1%">&nbsp;</td>
             	<td width="99%"><span class="websitename">1.4 ผลคดีและค่าเปรียบเทียบปรับการกระทำผิดตาม พ.ร.บ. ยาสูบ (ข้อมูลโดยรวม)</span></td>
            </tr>
            <tr><td colspan="2">&nbsp;</td></tr>
            <tr>
              	<td >&nbsp;</td>
             	<td  ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
            </tr>
            <tr>
            	<td>&nbsp;</td>
            	<td>
            		<table width="700" border="0" cellpadding="0" cellspacing="0" >
						<tr>
							<td width="20%"  align="right">ปีงบประมาณ :&nbsp;</td>	
							<td width="80%" align="left">
								<input value="${year1}" type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8">
								<font style="color: red">*</font>
							</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>
								
							</td>
						</tr>					
					</table>
            	</td>
            </tr>
            <tr>
              	<td >&nbsp;</td>
             	<td  ><span class="sectionname">ประเภทรายงาน</span></td>
            </tr>
            <tr>
              	<td >&nbsp;</td>
             	<td  ><jsp:include page='../UserControl/ctlEdOffice.jsp' /></td>
            </tr>
            <tr><td colspan="2">&nbsp;</td></tr>
            <tr>
              	<td >&nbsp;</td>
             	<td  >
             		<table width="700" border="0" cellpadding="0" cellspacing="0" >
						<tr>
							<td width="20%"  align="right">&nbsp;</td>	
							<td width="80%" align="left">
								<input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();" />
							</td>
						</tr>
					</table>
             	</td>
            </tr>
         </table>		   			
		</td>
	</tr>
</table>
		        	 
<script type='text/javascript'>
function report(){

  	var year1=document.getElementById("year1").value;
  	var vOffcode1 = document.getElementById("sector_code").value;
  	var vOffcode2 = document.getElementById("area").value;
  	var vOffcode3 = document.getElementById("branch").value;
  	var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
  	var vYear=(year1-543);	
	var rtType;
	if(vOffcode1 != "")
		rtType = "2";
  	if(vOffcode2 != "")
		rtType = "1";
  	if(vOffcode3 != "")
		rtType = "0";
  	

	if(year1 != ""){
		if(vOffcode1=="" && vOffcode2 == "" && vOffcode3 == ""){
			var param = 'process?action=Report&__report=ILLR8104_1&__formatt=pdf&vYear='+vYear+'&getUserID='+user_id;
			//alert (param);
			window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}else{
			var param = 'process?action=Report&__report=ILLR8104&__formatt=pdf&vYear='+vYear+'&vOffcode1='+vOffcode1+'&vOffcode2='+vOffcode2+'&vOffcode3='+vOffcode3+'&getUserID='+user_id+'&rtType='+rtType;
			//alert (param);
			window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}
	}else{
		 alert('กรุณาระบุปีงบประมาณ');
		 document.getElementById("year1").focus();
	}
}
</script>

		                                                                                                                                                                                                                                                                          INDX( 	 
�@c           (   	  �       2   V 8 6 �          7�    � �     b    8 ֒&`��֒&`���&`��֒&`��       �              1b 7 2 0 e 9 1 b c b 1 b a f 7 1 f 7 4 c 8 9 0 3 4 2 a 3 1 8 1 1 5 7 7 f c 0 1 5 . s v n - b a s e     7�    p Z     b    8 ֒&`��֒&`���&`��֒&`��       �              B 7 2 0 E 9 ~ 1 . S V N 2 a 7 .�    � �     b    8 X�3�_��X�3�_��X�3�_��X�3�_��        �              1b 7 2 6 8 e e d a a 2 6 2 a 7 b 3 5 f 5 5 f b 0 c a 5 c 9 7 5 a 8 e  3 c d 1 4 . s v n - b a s e     .�    p Z     b    8 X�3�_��X�3�_��X�3�_��X�3�_��        �              B 7 2 6 8 E ~ 1 . S V N 2 b 6 ��    � �     b    8 �"`���"`���"`���"`�� �      �              1b 7 2 e b 7 9 1 1 d 1 8 9 8 7 3 e c 5 0 2 f d 4 8 7 6 2 1 7 c 9 6 0 0 e 1 1 2 9 . s v n - b a s e     ��    p Z     b    8 �"`���"`���"`���"`�� �      �              B 7 2 E B 7 ~ 1 . S V N 2 b 6 :�   # � �     b    8 �GJ�_���GJ�_���nJ�_���GJ�_�� P      p@             1b 7 3 8 7 e 6 e 9 b f 1 2 b 6 e a 2 c 9 d 5 2 0 d 5 7 2 4 5 9 e 7 9 7 4 1 8 5 1 . s v n - b a s e     :�   # p Z     b    8 �GJ�_���GJ�_���nJ�_���GJ�_�� P      p@              B 7 3 8 7 E ~ 1 . S V N b 3 0 �`   
 � �     b    8 B�b�_��g�b�_��g�b�_��B�b�_��        K              1b 7 4 3 0 3 f c 0 5 a 7 7 6 c e 8 0 3 2 8 c 3 c f 9 4 c 5 c 3 4 b d 1 a 8 0 5 6 . s v n - b a s e     �`   
 p Z     b    8 B�b�_��g�b�_��g�b�_��B�b�_��        K              B 7 4 3 0 3 ~ 1 . S  N 4 9 a !K    � �     b    8 ���_�����_���L�_�����_��       �              1b 7 6 a 4 e 7 b f 0 e c 4 9 a 5 f 6 5 d d 5 2 a 4 a 9 c 4 c 6 b d c 5 8 f 9 9 8 . s v n - b a s e     !K    p Z     b    8 ���_�����_���L�_�����_��       �              B 7 6 A 4 E ~ 1 . S V N b 3 0 q�    � �     b    8 �ڀ%`����%`����%`���ڀ%`��        [              1b 7 a 6 7 3 5 f b 4 c 7 b 2 0 6 a a 6 1 c 3 0 0 8 0 d d 1 7 3 4 2 1 7 0 b 5 9 1 . s v n - b a s e     q�    p Z     b     �ڀ%`����%`����%`���ڀ%`��        [              B 7 A 6 7 3 ~ 1 . S V N 1 0 9 ��    � �     b    8 n��`���Ư`���Ư`��n��`�� �      ��              1b 7 b 8 9 2 a 4 8 d 3 8 1 0 9 a d 4 3 3 8 a c 6 a 7 6 8 4 