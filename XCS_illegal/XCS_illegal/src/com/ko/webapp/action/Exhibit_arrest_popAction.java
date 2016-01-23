package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.ApplicationArrest;
import com.ko.domain.ApplicationArrestProve;
import com.ko.domain.DeliveryExhibit;
import com.ko.domain.DeliveryExhibitItem;
import com.ko.domain.SendIncome;
import com.ko.domain.SendIncomeCase;
import com.ko.domain.Staff;
import com.ko.domain.Title;
import com.ko.domain.InspectorTeam;
import com.ko.domain.Unit;
import com.ko.domain.V_COMPARE_CASE_POPUP;
import com.ko.domain.V_STAFF_LIST_POPUP;

import com.ko.domain.Legislation;
import com.ko.domain.base.BaseIndictment;
import com.ko.util.DateUtil;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.ParameterUtil;







public class Exhibit_arrest_popAction extends BaseAction{


	public void pre(HttpServletRequest request,HttpServletResponse response)throws Exception{
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);


	}



	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		request.setAttribute("p", request.getParameter("pap"));
		request.setAttribute("pageOut", request.getParameter("rdiSource"));
		String checkRadio = ParameterUtil.getStringParam("rdiSource", request);
		log.debug("radio="+checkRadio);
		ApplicationArrestProve aap = new ApplicationArrestProve(db);
		V_COMPARE_CASE_POPUP vcc = new V_COMPARE_CASE_POPUP(db);
		//StringBuffer where1=new StringBuffer(" where 1=1 ");

		pre(request,response);
		
		String sql1=
		"	select distinct de.id, de.delivery_code, de.job_no, de.delivery_date,de.subject_type," +
		" de.subject || ' ' || decode(de.subject_type,'1','เสร็จคดี','2','ระหว่างคดี(ฟ้องศาล)','3','ระหว่างคดี(ไม่มีตัว)') subject," +
		"   decode(de.subject_type,'1','เสร็จคดี','2','ระหว่างคดี(ฟ้องศาล)','3','ระหว่างคดี(ไม่มีตัว)') status_name," +
		"   to_char(de.delivery_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') delivery_date2,"+
		"	de.legislation_id, lg.legislation_name, de.offcode_from, ed.offname offname_from	, 'SEND' source_type"+
		"	from delivery_exhibit de"+
		"	inner join legislation lg on lg.id=de.legislation_id"+
		"	inner join ed_office ed on ed.offcode=de.offcode_from"+
		"	inner join delivery_exhibit_item dei on dei.delivery_exhibit_id=de.id"+
		"	left join app_arrest_prove_exhibit ape on ape.id=dei.app_arrest_prove_exhibit_id" +
		" where de.id not in (select nvl(delivery_exhibit_id,0) from stockin) and de.status='2' " +
		" and de.offcode_to = '" + uData.getOffcode() + "' ";
		
		String sql3	=
			"	select count(distinct de.id)" +
			"	from delivery_exhibit de"+
			"	inner join legislation lg on lg.id=de.legislation_id"+
			"	inner join ed_office ed on ed.offcode=de.offcode_from"+
			"	inner join delivery_exhibit_item dei on dei.delivery_exhibit_id=de.id"+
			"	left join app_arrest_prove_exhibit ape on ape.id=dei.app_arrest_prove_exhibit_id " +
			" where de.id not in (select nvl(delivery_exhibit_id,0) from stockin) and de.status='2'" +
			" and de.offcode_to = '" + uData.getOffcode() + "' ";
		
		String whDE = "";
		if(!request.getParameter("delivery_code").trim().equals(""))
			whDE += " and de.delivery_code like '%" + request.getParameter("delivery_code").trim().replace("'", "''") + "%'";
		if(!request.getParameter("job_no").trim().equals(""))
			whDE += " and de.job_no like '%" + request.getParameter("job_no").trim().replace("'", "''") + "%'";
		if(!request.getParameter("delivery_date1").trim().equals(""))
			whDE += " and to_char(de.delivery_date,'yyyymmdd')>='" + DateUtil.formatConditionDate(request.getParameter("delivery_date1")) + "'";
		if(!request.getParameter("delivery_date2").trim().equals(""))
			whDE += " and to_char(de.delivery_date,'yyyymmdd')<='" + DateUtil.formatConditionDate(request.getParameter("delivery_date2")) + "'";
		if(!request.getParameter("legislation_id").equals(""))
			whDE += " and de.legislation_id = '" + request.getParameter("legislation_id") + "'";
		if(!request.getParameter("isdomestic").equals("Z"))
			whDE += " and dei.isdomestic = '" + request.getParameter("isdomestic") + "'";
		if(!request.getParameter("offcode").equals(""))
			whDE += " and de.offcode_from = '" + request.getParameter("offcode").trim().replace("'", "''") + "'";
		
		sql1 += whDE;
		sql3 += whDE;
		
		//ต้องได้ใช้แน่ๆ  รายการใบโอน
		String sql2 = 
			" select distinct so.id,so.stockout_code,so.job_no, so.stockout_date,so.subject_type, " +
			" so.subject || ' ' || decode(so.subject_type,'1','เสร็จคดี','2','ระหว่างคดี(ฟ้องศาล)','3','ระหว่างคดี(ไม่มีตัว)') subject, " +
			" decode(so.status,'1','เสร็จคดี','2','ระหว่างคดี(ฟ้องศาล)','3','ระหว่างคดี(ไม่มีตัว)') status_name, " +
			" to_char(so.stockout_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') stockout_date2, " +
			" so.legislation_id, lg.legislation_name, so.offcode offcode_from, edf.offname offname_from,'TRANSFER' source_type " +
			" from stockout so " +
			" inner join legislation lg on lg.id=so.legislation_id " +
			" inner join ed_office edf on edf.offcode=so.offcode " +
			" inner join stockout_item soi on so.id=soi.stockout_id" +
			" where so.stockout_type='5' and so.status='2' " +
			" and so.id not in (select nvl(si.stockout_id,0) from stockin si) " +
			" and so.offcode_to = '" + uData.getOffcode() + "' ";

		String sql4 = 
			" select count(distinct so.id)" +
			" from stockout so " +
			" inner join legislation lg on lg.id=so.legislation_id " +
			" inner join ed_office edf on edf.offcode=so.offcode " +
			" inner join stockout_item soi on so.id=soi.stockout_id" +
			" where so.stockout_type='5' and so.status='2' " +
			" and so.id not in (select nvl(si.stockout_id,0) from stockin si)" +
			" and so.offcode_to = '" + uData.getOffcode() + "' ";

		String whSO = "";
		if(!request.getParameter("delivery_code").trim().equals(""))
			whSO += " and so.stockout_code like '%" + request.getParameter("delivery_code").trim().replace("'", "''") + "%'";
		if(!request.getParameter("job_no").trim().equals(""))
			whSO += " and so.job_no like '%" + request.getParameter("job_no").trim().replace("'", "''") + "%'";
		if(!request.getParameter("delivery_date1").trim().equals(""))
			whSO += " and to_char(so.stockout_date,'yyyymmdd')>='" + DateUtil.formatConditionDate(request.getParameter("delivery_date1")) + "'";
		if(!request.getParameter("delivery_date2").trim().equals(""))
			whSO += " and to_char(so.stockout_date,'yyyymmdd')<='" + DateUtil.formatConditionDate(request.getParameter("delivery_date2")) + "'";
		if(!request.getParameter("legislation_id").equals(""))
			whSO += " and so.legislation_id = '" + request.getParameter("legislation_id") + "'";
		if(!request.getParameter("isdomestic").equals("Z"))
			whSO += " and soi.isdomestic = '" + request.getParameter("isdomestic") + "'";
		if(!request.getParameter("offcode").equals(""))
			whSO += " and so.offcode = '" + request.getParameter("offcode").trim().replace("'", "''") + "'";

		sql2 += whSO;
		sql4 += whSO;
		
		log.debug(sql1 + " union " + sql2);

		
			//log.debug("countBySql="+sql3+where1.toString());
			Integer totalRow = aap.countBySql(sql3+ " union " + sql4, null);
			pageUtil.setTotalRow(totalRow);
			//log.debug(totalRow);
			//log.debug("findBySql="+sql1+where1.toString());
			//log.debug("sqlBySql="+sql1+where1.toString());
			//log.debug(sql1 + " union " + sql2);
			List<Map<String,Object>> aap_list = aap.findBySql(sql1 + " union " + sql2,null,pageUtil);
			//log.debug(aap_list);
			request.setAttribute("aapList", aap_list);
			
			if(aap_list.size()>0){
				List<Map<String,Object>> aalinapp = new ArrayList<Map<String,Object>>();				
				for(int j=0;j<aap_list.size();j++){
					if(aap_list.get(j).get("source_type").equals("SEND")){
						String aaesql;
						aaesql = 
							" select de.id  sel_id, pd.product_code,  nvl(dei.duty_name, nvl(dg.group_name, dt.duty_name)) || \n" +
							" case when nvl(dei.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) is not null then ' ยี่ห้อ ' || nvl(dei.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) else '' end || \n" +	 
							" case when  nvl(dei.sizes_desc,sp.size_desc) is not null then ' ขนาด ' || nvl(dei.sizes_desc,sp.size_desc) || ' ' || nvl(dei.sizes_unit_name,nvl(us.thname, us.thname)) else '' end product_name, \n" +  
							" dei.brand_code, dei.sizes_code, dei.sizes_unit_code,	sum(dei.qty) send_qty, nvl(u.thname,u.enname) send_unit, \n" +
							" nvl(ape.isdomestic,aoi.isdomestic) isdomestic,  decode(nvl(ape.isdomestic,aoi.isdomestic),'I','ในประเทศ','O','ต่างประเทศ','Z','ไม่ระบุ') isdomestic_name, \n" +	 
							" 'SEND' stockin_type,  dei.NETWEIGHT_UNIT,sum(dei.NETWEIGHT) netweight,dei.unit_code, dei.duty_code,   \n" +
							" nvl(dei.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) brand_name, nvl(dei.qty_unit_name,u.thname) qty_unit_name, \n" + 
							" nvl(dei.sizes_desc, sp.size_desc) sizes_desc, nvl(dei.sizes_unit_name, us.thname) sizes_unit_name,   \n" +
							" nvl(dei.netweight_unit_name, wu.thname) netweight_unit_name, nvl(dei.duty_name, dt.duty_name) duty_name ,  \n" +
							" nvl(dei.group_name, dg.group_name) group_name, dg.group_id  \n" +
							" from delivery_exhibit_item dei	  \n" +
							" inner join delivery_exhibit de on de.id=dei.delivery_exhibit_id \n" +  
							" left join product pd on pd.product_code=dei.product_code	  \n" +
							" left join brand_main bm on bm.brand_main_code=dei.brand_code and bm.group_id = dei.group_id \n" +  
							" left join size_package sp on dei.sizes_code=sp.size_code	 and sp.group_id = dei.group_id   \n" +
							" left join unit us on us.unit_code=dei.sizes_unit_code   \n" +
							" left join unit u on u.unit_code=dei.unit_code	  \n" +
							" left join unit wu on wu.unit_code=dei.netweight_unit   \n" +
							" left join app_arrest_prove_exhibit ape on ape.id=dei.app_arrest_prove_exhibit_id \n" +  
							" left join application_outside_prove_item aoi on aoi.id=dei.application_outside_prove_item \n" +  
							" left join duty_table dt on dt.duty_code=dei.duty_code   \n" +
							" left join duty_group dg on dg.group_id=dei.group_id   \n" +
							" where dei.delivery_exhibit_id = ?   \n" +
							" group by de.id, pd.product_code ,   nvl(dei.duty_name, nvl(dg.group_name, dt.duty_name)) || \n" + 
							" case when dei.brand_code is not null then ' ยี่ห้อ ' ||  nvl(dei.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng))  else '' end || \n" +  
							" case when  dei.sizes_code is not null then ' ขนาด ' || nvl(dei.sizes_desc,sp.size_desc) || ' ' || nvl(dei.sizes_unit_name,nvl(us.thname, us.thname)) else '' end, \n" +  
							" dei.brand_code, dei.sizes_code, dei.sizes_unit_code,nvl(u.thname,u.enname),	nvl(ape.isdomestic,aoi.isdomestic),   \n" +
							" dei.NETWEIGHT_UNIT, dei.unit_code, dei.duty_code , nvl(dei.sizes_unit_name,nvl(us.thname, us.thname)), \n" +
							" nvl(dei.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) , nvl(dei.qty_unit_name,u.thname) , \n" + 
							" nvl(dei.sizes_desc, sp.size_desc) , nvl(dei.sizes_unit_name, us.thname) ,   \n" +
							" nvl(dei.netweight_unit_name, wu.thname) , nvl(dei.duty_name, dt.duty_name)  ,  \n" +
							" nvl(dei.group_name, dg.group_name) , dg.group_id, dei.duty_name, dg.group_name, dt.duty_name ";
						
log.debug(aaesql);
							ApplicationArrest aae = new ApplicationArrest(db);
							List<Map<String,Object>> inapp_list = aae.findBySql(aaesql,aap_list.get(j).get("id"));
						
							for(int k=0;k<inapp_list.size();k++){
								aalinapp.add( inapp_list.get(k));
							}
						}else{ 
							//กรณีมาจากการโอน
							String aaesql;
							aaesql = 
									" select so.id sel_id, soi.product_code, nvl(soi.duty_name,dt.duty_name) ||   \n" +
								" case when nvl(soi.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) is not null then ' ยี่ห้อ ' || nvl(soi.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) else '' end || \n" +	  
								" case when nvl(soi.sizes_desc,sp.size_desc) is not null then ' ขนาด ' || nvl(soi.sizes_desc,sp.size_desc) || ' ' || nvl(soi.sizes_unit_name,us.thname) else '' end product_name,   \n" +
								" soi.brand_code, soi.sizes_code, soi.sizes_unit_code,   sum(soi.qty) send_qty, nvl(u.thname,u.enname) send_unit, soi.isdomestic,   \n" +
								" decode(soi.isdomestic,'I','ในประเทศ','O','ต่างประเทศ','Z','ไม่ระบุ') isdomestic_name,'TRANSFER' stockin_type	,soi.NETWEIGHT_UNIT,   \n" +
								" sum(soi.NETWEIGHT) netweight,soi.unit_code, soi.duty_code ,nvl(soi.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) brand_name, \n" +
								" nvl(soi.qty_unit_name,u.thname) qty_unit_name, nvl(soi.sizes_desc,sp.size_desc) sizes_desc, nvl(soi.sizes_unit_name,us.thname) sizes_unit_name, \n" +
								" nvl(soi.netweight_unit_name, uw.thname) netweight_unit_name, nvl(soi.duty_name,dt.duty_name) duty_name, \n" +
								" nvl(soi.group_name,dg.group_name) group_name, dg.group_id \n" +
								" from stockout_item soi	 inner join stockout so on so.id=soi.stockout_id \n" +  
								" left join product pd on pd.product_code=soi.product_code	  \n" +
								" left join brand_main bm on bm.brand_main_code=soi.brand_code and bm.group_id = soi.group_id \n" +  
								" left join size_package sp on soi.sizes_code=sp.size_code  and sp.group_id = soi.group_id   \n" +
								" left join unit us on us.unit_code=soi.sizes_unit_code   \n" +
								" left join unit u on u.unit_code=soi.unit_code   \n" +
								" left join unit uw on uw.unit_code=soi.netweight_unit \n" +
								" left join duty_table dt on dt.duty_code=soi.duty_code   \n" +
								" left join duty_group dg on dg.group_id=soi.group_id \n" +
								" where soi.stockout_id = ?   \n" +
								" group by so.id , soi.product_code, nvl(soi.duty_name,dt.duty_name) || \n" +  
								" case when nvl(soi.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) is not null then ' ยี่ห้อ ' || nvl(soi.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) else '' end || \n" +	  
								" case when nvl(soi.sizes_desc,sp.size_desc) is not null then ' ขนาด ' || nvl(soi.sizes_desc,sp.size_desc) || ' ' || nvl(soi.sizes_unit_name,us.thname) else '' end ,   \n" +
								" soi.brand_code, soi.sizes_code, soi.sizes_unit_code,   nvl(u.thname,u.enname) , soi.isdomestic,  decode(soi.isdomestic,'I','ในประเทศ','O','ต่างประเทศ','Z','ไม่ระบุ') , \n" +
								" soi.NETWEIGHT_UNIT,soi.unit_code,soi.duty_code, nvl(soi.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)), nvl(soi.qty_unit_name,u.thname) ,  \n" +
								" nvl(soi.sizes_desc,sp.size_desc) , nvl(soi.sizes_unit_name,us.thname) ,nvl(soi.netweight_unit_name, uw.thname) , nvl(soi.duty_name,dt.duty_name) , \n" +
								" nvl(soi.group_name,dg.group_name) , dg.group_id";

							log.debug("TRANSFER " + aaesql);
							ApplicationArrest aae = new ApplicationArrest(db);
							List<Map<String,Object>> inapp_list = aae.findBySql(aaesql,aap_list.get(j).get("id"));
						
							for(int k=0;k<inapp_list.size();k++){
								aalinapp.add( inapp_list.get(k));
							}
						}
					}
					log.debug(aalinapp);
					request.setAttribute("allapplist", aalinapp);
				}

		forward("/Popup/send_exhibit_pop.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("res="+request.getParameter("pap"));
		request.setAttribute("p", request.getParameter("pap"));
		pre(request,response);
		forward("/Popup/send_exhibit_pop.jsp", request, response);
	}
	

}
