<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<html>
<HEAD>
<%@ include file="/Templates/meta.jsp"%>
<script type='text/javascript' src='<c:url value="/dwr/interface/SelectRegion.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/engine.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/util.js"/>'></script>
<script type='text/javascript'>
window.onload = init;
function init(){
	getProvince('province','district','tambol',40,4001,400101);
}
function getProvince(id,district_id,tambol_id,province_code){
	SelectRegion.getProvince(function(data){
		dwr.util.addOptions(id,[{province_code:"",province_name:"โปรดเลือก"}],"province_code","province_name");
		dwr.util.addOptions(id,data,"province_code","province_name");
		
		if( province_code!=null && province_code!="" ){
			dwr.util.setValue(id,province_code);
		}else{
			dwr.util.setValue(id,"");
		}
		getDistrict(district_id,tambol_id,dwr.util.getValue(id),'');
	});
}
function getDistrict(id,tambol_id,province_code,setdis_code){
	SelectRegion.getDistrict(province_code,function(data){

		dwr.util.removeAllOptions(id);
		dwr.util.addOptions(id,[{district_code:"",district_code:"โปรดเลือก"}],"district_code","district_code");
		dwr.util.addOptions(id,data,"district_code","district_name");
		if( setdis_code!=null && setdis_code!="" ){
			dwr.util.setValue(id,setdis_code);
		}else{
			dwr.util.setValue(id,"");
		}
		getTambol(tambol_id,dwr.util.getValue(id),'');
	});
}
function getTambol(id,district_code,settam_code){
	SelectRegion.getTambol(district_code,function(data){
		dwr.util.removeAllOptions(id);
		dwr.util.addOptions(id,[{subdistrict_code:"",subdistrict_name:"โปรดเลือก"}],"subdistrict_code","subdistrict_name");
		
		dwr.util.addOptions(id,data,"subdistrict_code","subdistrict_name");
		if( settam_code!=null && settam_code!="" ){
			dwr.util.setValue(id,settam_code);
		}else{
			dwr.util.setValue(id,"");
		}
		});
}
</script>
</HEAD>
<BODY>
จังหวัด<select id='province' onchange="getDistrict('district','tambol',this.value)"></select><br/>
อำเภอ<select id='district' onchange="getTambol('tambol',this.value,'')"></select><br/>
ตำบล<select id='tambol'></select><br/>
</BODY>
</HTML>