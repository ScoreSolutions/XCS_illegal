package com.ko.webapp.action;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.Constants;
import com.ko.service.*;
import com.ko.util.*;
import com.pccth.rdbservice.*;
import com.ko.webapp.bean.UserSession;

import java.sql.PreparedStatement;

import com.ko.domain.*;
import com.ko.WebService.PRC.*;
import com.pccth.prcservice.*;
import com.pccth.prcservice.types.*;

public class SyncRDBAction extends BaseAction {
	String menuID="48";
	String data_source = "WebService";
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		if(uData.chkUserMenu(menuID)==true){
			request.setAttribute("ErrMsg", "");
			request.setAttribute("CompleteMsg", "");
			forward("?page=/Master/SyncRDB.jsp", request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	
	public void SyncAll(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		SyncEdOffice(request, response);
		SyncDutyGroup(request,response);
		SyncDutyTable(request,response);
		SyncTitle(request,response);
		SyncUnit(request,response);
		SyncProductType(request,response);
		SyncCountry(request,response);
		SyncProvince(request,response);
		SyncDistrict(request,response);
		SyncSubDistrict(request,response);
		SyncDutyUnit(request,response);
	}
	
	public void SyncSubDistrict(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		TambolService service = new TambolService();
		if(service.chkServiceConnection()==true){
			//List<TambolInfo> mm = service.getTambolList("", "");
			TambolInfo[] mm = service.getInfo("", "");
	
			String vIdcardNo = "0";
			if(uData != null)
				vIdcardNo = uData.getIdCard().toString();
			
			int i = 0;
			
			for (TambolInfo info : mm) {
				String code = info.getTambol_code();
				if (!code.endsWith("00") && !code.endsWith("0000") && !code.toLowerCase().endsWith("xx")) {
					DB db1 = new DB();
					PreparedStatement pre = null;
					
					Subdistrict sd = new Subdistrict(db);
					String vDistrictCode = info.getTambol_code().substring(0,4);
					List<Subdistrict> sdList = sd.findByWhere(Subdistrict.SUBDISTRICT_CODECol + " = ?", info.getTambol_code());
					try
					{
						String sql = "";
						if(sdList.size()==1)
						{
							sql = "update subdistrict ";
							sql += " set subdistrict_code='" + info.getTambol_code() + "', ";
							sql += " subdistrict_name = '" + info.getTambol_name() + "',";
							sql += " district_code = '" + vDistrictCode + "',";
							sql += " active = 'Y',";
							sql += " rdb_code = '" + info.getTambol_code() + "',";
							sql += " update_by = '" + vIdcardNo + "',";
							sql += " update_on= sysdate ";
							sql += " where id= '" + sdList.get(0).getId() + "'";
							
							//System.out.println(sql);
							System.out.println("Update SubDistrict" + (i + 1));
						}
						else
						{
							sql = " INSERT INTO SUBDISTRICT (ID, SUBDISTRICT_CODE, SUBDISTRICT_NAME, ";
							sql += " DISTRICT_CODE, OFFCODE, ACTIVE, CREATE_BY, CREATE_ON, RDB_CODE) ";
							sql += " VALUES (subdistrict_seq.nextval, '" + info.getTambol_code() + "','" + info.getTambol_name() + "', ";
							sql += " '" + vDistrictCode + "', '" + info.getOffCode() + "','Y','" + vIdcardNo + "',sysdate,'" + info.getTambol_code() + "')";
							//System.out.println(sql);
							System.out.println("Insert SubDistrict" + (i + 1));
						}
						
						pre = db1.getParameterizedStatement(sql, null);
						pre.execute();
						
					}
					catch(Exception e)
					{
						System.out.println("ErrorMessage : " + e.getMessage());
						//pre.execute("ALTER SYSTEM SET open_cursors = 500 SCOPE=BOTH");
					}
					
					pre.close();
					db1.closedb();
					pre = null;
					db1 = null;
					i++;
				}
			}
			
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}
	
	public void SyncDistrict(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		TambolService service = new TambolService();
		if(service.chkServiceConnection()==true){
			//List<TambolInfo> mm = service.getAumphurList("", "");
			TambolInfo[] mm = service.getInfo("", "");
			
			String vIdcardNo = "0";
			if(uData != null)
				vIdcardNo = uData.getIdCard().toString();
			
			int i = 0;
			
			for (TambolInfo info : mm) {
				String code = info.getTambol_code();
				if (code.endsWith("00") && !code.endsWith("0000")) {
					String vProvinceCode = info.getTambol_code().substring(0,2);
					String vDistrictCode = info.getTambol_code().substring(0,4);
					District d = new District(db);
					List<District> dList = d.findByWhere(District.DISTRICT_CODECol + " = ?", vDistrictCode);
					try
					{
						//System.out.println("AAAAAAAAAAAAA");
						if (dList.size()>0)
						{
							d = d.findByPk(dList.get(0).getId());
							d.setDistrict_code(vDistrictCode);
							d.setDistrict_name(info.getTambol_name());
							d.setProvince_code(vProvinceCode);
							d.setOffcode(info.getOffCode());
							d.setUpdate_by(Long.parseLong(vIdcardNo));
							d.setUpdate_on(DateUtil.getCurrentDate());
							//System.out.println("BBBBBBBBBBBBBBBB");
							d = d.update();
							System.out.println("Update District" + (i + 1));
						}
						else
						{
							d.setDistrict_code(vDistrictCode);
							d.setDistrict_name(info.getTambol_name());
							d.setProvince_code(vProvinceCode);
							d.setOffcode(info.getOffCode());
							d.setCreate_by(Long.parseLong("0" + uData.getIdCard()));
							d.setCreate_on(DateUtil.getCurrentDate());
							//System.out.println("CCCCCCCCCCCCC");
							d = d.create();
							System.out.println("Insert District" + (i + 1));
						}
					}
					catch(Exception e)
					{
						System.out.println("ErrorMessage : " + e.getMessage());
					}
					i++;
				}
			}
			
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}
	
	public void SyncProvince(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		TambolService service = new TambolService();
		if(service.chkServiceConnection()==true)
		{
			//List<TambolInfo> mm = service.getProvinceList("", "");
			TambolInfo[] mm = service.getInfo("", "");
			
			String vIdcardNo = "0";
			if(uData != null)
				vIdcardNo = uData.getIdCard().toString();
			
			int i = 0;
			
			for (TambolInfo info : mm) {
				String code = info.getTambol_code();
				if (code.endsWith("0000")) {
					Province p = new Province(db);
					String vProvinceCode = info.getTambol_code().substring(0,2);
					List<Province> pList = p.findByWhere(Province.PROVINCE_CODECol + " = ?", vProvinceCode);
					try
					{
						if(pList.size()>0)
						{
							p = p.findByPk(pList.get(0).getId());
							p.setProvince_code(vProvinceCode);
							p.setProvince_name(info.getTambol_name());
							p.setRdb_code(info.getTambol_code());
							p.setUpdate_by(Long.parseLong("0" + vIdcardNo));
							p.setUpdate_on(DateUtil.getCurrentDate());
							
							p = p.update();
							System.out.println("Update Province" + (i + 1));
						}
						else
						{
							p.setProvince_code(vProvinceCode);
							p.setProvince_name(info.getTambol_name());
							p.setRdb_code(info.getTambol_code());
							p.setCreate_by(Long.parseLong("0" + vIdcardNo));
							p.setCreate_on(DateUtil.getCurrentDate());
							
							p = p.create();
							System.out.println("Insert Province" + (i + 1));
						}
					}
					catch(Exception e)
					{
						System.out.println("ErrorMessage : " + e.getMessage());
					}
					i++;
				}
			}
			
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}
	
	public void SyncCountry(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		CountryService service = new CountryService();
		if(service.chkServiceConnection()==true)
		{
			List<CountryInfo> mm = service.getCountryList("", "");
			for (int i=0;i<mm.size();i++)
			{
				Country c = new Country(db);
				List<Country> cList = c.findByWhere("TRIM(country_code)=?",mm.get(i).getCountry_code().trim());
				try
				{	
					if (cList.size()>0){
						c = c.findByPk(cList.get(0).getId());
						c.setCountry_code(mm.get(i).getCountry_code().trim());
						c.setCountry_name(mm.get(i).getCountry_name());
						c.setShort_name(mm.get(i).getShort_name());
						c.setContinent(mm.get(i).getContinent());
						c.setIndc_afta(mm.get(i).getIndc_afta());
						c.setRace_name(mm.get(i).getRace_name());
						c.setCountry_seq(Long.parseLong(mm.get(i).getCountry_seq()));
						c.setBegin_date(DateUtil.getCurrentDate());
						
						c = c.update();
						log.debug("Update Country" + (i + 1) + " " + c.getCountry_name());
					}
					else
					{
						c.setCountry_code(mm.get(i).getCountry_code().trim());
						c.setCountry_name(mm.get(i).getCountry_name());
						c.setShort_name(mm.get(i).getShort_name());
						c.setContinent(mm.get(i).getContinent());
						c.setIndc_afta(mm.get(i).getIndc_afta());
						c.setRace_name(mm.get(i).getRace_name());
						c.setCountry_seq(Long.parseLong(mm.get(i).getCountry_seq()));
						c.setBegin_date(DateUtil.getCurrentDate());
						
						c = c.create();
						System.out.println("Insert Country" + (i + 1) + " " + c.getCountry_name());
					}
				}
				catch(Exception e)
				{
					System.out.println("ErrorMessage : " + e.getMessage());
				}
			}
			
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}
	
	public void SyncProductType(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ProductTypeService service = new ProductTypeService();
		if(service.chkServiceConnection()==true)
		{
			String vIdcardNo = "0";
			if(uData != null)
				vIdcardNo = uData.getIdCard().toString();
			
			List<ProductTypeInfo> mm = service.getProductTypeList("", "");
			for (int i=0;i<mm.size();i++)
			{
				ProductType pt = new ProductType(db);
				List<Map<String,Object>> ptList = pt.findBySql("select id from product_type where " + ProductType.TYPE_CODECol + "= '" + mm.get(i).getType_code() + "' and " + ProductType.DUTY_CODECol + "= '" + mm.get(i).getDuty_code() + "'");
				try
				{
					if(ptList.size()>0)
					{
						pt = pt.findByPk(Long.parseLong(ptList.get(0).get("id").toString()));
						pt.setDuty_code(mm.get(i).getDuty_code());
						pt.setType_code(mm.get(i).getType_code());
						pt.setType_name(mm.get(i).getType_name());
						pt.setGroup_id(mm.get(i).getGroup_id());
						pt.setUpdate_by(Long.parseLong("0" + vIdcardNo));
						pt.setUpdate_on(DateUtil.getCurrentDate());
						
						pt = pt.update();
						System.out.println("Update ProductType" + (i + 1));
					}else
					{
						pt.setDuty_code(mm.get(i).getDuty_code());
						pt.setType_code(mm.get(i).getType_code());
						pt.setType_name(mm.get(i).getType_name());
						pt.setGroup_id(mm.get(i).getGroup_id());
						pt.setActive("Y");
						pt.setCreate_by(Long.parseLong("0" + vIdcardNo));
						pt.setCreate_on(DateUtil.getCurrentDate());
						
						pt = pt.create();
						System.out.println("Insert ProductType" + (i + 1));
					}
				}
				catch(Exception e)
				{
					System.out.println("ErrorMessage : " + e.getMessage());
				}
			}
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}
	
	public void SyncUnit(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ProductUnitService service = new ProductUnitService();
		if(service.chkServiceConnection() == true)
		{
			String vIdcardNo = "0";
			if(uData != null)
				vIdcardNo = uData.getIdCard().toString();
			
			List<ProductUnitInfo> mm = service.getProductUnitList("", "");
			for (int i=0;i<mm.size();i++)
			{
				Unit u = new Unit(db);
				List<Unit> uList = u.findByWhere(Unit.UNIT_CODECol + " = ? and data_source = '" + data_source + "'", mm.get(i).getUnit_code());
				try
				{
					if (uList.size()>0)
					{
						u = u.findByPk(uList.get(0).getId());
						u.setUnit_code(mm.get(i).getUnit_code());
						u.setThname(mm.get(i).getUnit_name_thai());
						u.setEnname(mm.get(i).getUnit_name_eng());
						u.setAbbname(mm.get(i).getShort_name());
						u.setUpdate_by(Long.parseLong("0"+vIdcardNo));
						u.setUpdate_on(DateUtil.getCurrentDate());
						u.setData_source(data_source);
						u = u.update();
						System.out.println("Update Unit" + (i + 1));
					}
					else
					{
						u.setUnit_code(mm.get(i).getUnit_code());
						u.setThname(mm.get(i).getUnit_name_thai());
						u.setEnname(mm.get(i).getUnit_name_eng());
						u.setAbbname(mm.get(i).getShort_name());
						u.setCreate_by(Long.parseLong("0"+vIdcardNo));
						u.setCreate_on(DateUtil.getCurrentDate());
						u.setData_source(data_source);
						u = u.create();
						System.out.println("Insert Unit" + (i + 1));
					}
				}
				catch (Exception e)
				{
					System.out.println("ErrorMessage : " + e.getMessage());
				}
			}
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}
	
	public void SyncTitle(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		MasterService service = new MasterService();
		if(service.chkServiceConnection()==true)
		{
			List<TitleInfo> mm = service.getTitleList("", "");
			//System.out.println(mm.size());
			for (int i=0;i<mm.size();i++)
			{
				try
				{
					//System.out.println(mm.get(i).getTitle_code());
					Title ti = new Title(db);
					List<Title> tiList = ti.findByWhere(Title.TITLE_CODECol + "= ? ", mm.get(i).getTitle_code());
					if (tiList.size()==1){
						ti = ti.findByWhere(" title_code = ?",tiList.get(0).getTitle_code()).get(0);
						ti.setTitle_code(mm.get(i).getTitle_code());
						ti.setTitle_name(mm.get(i).getTitle_name());
						ti.setTitle_type(mm.get(i).getTitle_type());
						ti.setShort_title(mm.get(i).getShort_title());
						ti.setShort_suffix(mm.get(i).getShort_suffix());
						ti.setTitle_seo(Long.parseLong(mm.get(i).getTitle_seq()));
						ti.setBegin_date(DateUtil.getCurrentDate());
						
						ti = ti.update();
						System.out.println("Update Title" + (i + 1) + " " + ti.getTitle_name());
					}else{
						ti.setTitle_code(mm.get(i).getTitle_code());
						ti.setTitle_name(mm.get(i).getTitle_name());
						ti.setTitle_type(mm.get(i).getTitle_type());
						ti.setShort_title(mm.get(i).getShort_title());
						ti.setShort_suffix(mm.get(i).getShort_suffix());
						ti.setTitle_seo(Long.parseLong(mm.get(i).getTitle_seq()));
						ti.setBegin_date(DateUtil.getCurrentDate());
						
						ti = ti.create();
						System.out.println("Insert Title" + (i + 1));
					}
				}
				catch (Exception e)
				{
					//System.out.println("ErrorMessage : " + e.getStackTrace().toString());
				}
			}
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}
	
	private String getGroupIDByDutyCode(String duty_code) throws Exception{
		String ret="";
		String sql = "select pt.group_id ";
		sql += " from product_type pt ";
		sql += " inner join duty_group dg on dg.group_id=pt.group_id ";
		sql += " where dg.group_status='N' ";
		sql += " and pt.duty_code = '" + duty_code + "'";
		ProductType pt = new ProductType(db);
		List<Map<String,Object>> list = pt.findBySql(sql);
		if(list.size()>0)
			ret = list.get(0).get("group_id").toString();
		
		return ret;
	}
	
	public void SyncDutyTable(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		MasterService service = new MasterService();
		if(service.chkServiceConnection()==true)
		{
			List<DutyTableInfo> mm = service.getDutyTableList("", "");
			for (int i=0;i<mm.size();i++)
			{
				DutyTable dt = new DutyTable(db);
				List<DutyTable> dtList = dt.findByWhere(DutyTable.DUTY_CODECol + "=? and data_source = '" + data_source + "'", mm.get(i).getDuty_code());
				try
				{
					if(dtList.size()==1)
					{
						dt = dt.findByPk(dtList.get(0).getId());
						dt.setDuty_code(mm.get(i).getDuty_code());
						dt.setDuty_name(mm.get(i).getDuty_name());
						dt.setBegin_date(DateUtil.getCurrentDate());
						dt.setLaw_duty_code(mm.get(i).getLaw_duty_code());
						dt.setGroup_id(getGroupIDByDutyCode(mm.get(i).getDuty_code()));
						dt.setData_source(data_source);
						dt = dt.update();
						System.out.println("Update DutyTable" + (i + 1) + " " + dt.getDuty_name());
					}
					else
					{
						dt.setDuty_code(mm.get(i).getDuty_code());
						dt.setDuty_name(mm.get(i).getDuty_name());
						dt.setBegin_date(DateUtil.getCurrentDate());
						dt.setLaw_duty_code(mm.get(i).getLaw_duty_code());
						dt.setGroup_id(getGroupIDByDutyCode(mm.get(i).getDuty_code()));
						dt.setData_source(data_source);
						dt = dt.create();
						System.out.println("Insert DutyTable" + (i + 1) + " " + dt.getDuty_name());
					}
				}
				catch(Exception e)
				{
					System.out.println("ErrorMessage : " + e.getMessage());
				}
			}
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}
	
	public void SyncDutyGroup(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		DutyGroupService service = new DutyGroupService();
		if(service.chkServiceConnection()==true)
		{
			List<DutyGroupInfo> mm = service.getDutyGroupList("", "");
			for (int i=0;i<mm.size();i++)
			{
				DutyGroup dg = new DutyGroup(db);
				List<DutyGroup> dgList = dg.findByWhere(DutyGroup.GROUP_IDCol + "= ?", mm.get(i).getGroup_id());
				try
				{
					if (dgList.size()==1){
						dg = dg.findByPk(dgList.get(0).getId());
						dg.setGroup_id(mm.get(i).getGroup_id());
						dg.setGroup_name(mm.get(i).getGroup_name());
						dg.setGroup_status(mm.get(i).getGroup_status());
						dg.setSub_group_id(mm.get(i).getSub_group_id());
						dg.setBegin_date(DateUtil.getCurrentDate());
						
						dg = dg.update();
						System.out.println("Update DutyGroup" + (i + 1));
					}
					else{
						dg.setGroup_id(mm.get(i).getGroup_id());
						dg.setGroup_name(mm.get(i).getGroup_name());
						dg.setGroup_status(mm.get(i).getGroup_status());
						dg.setSub_group_id(mm.get(i).getSub_group_id());
						dg.setBegin_date(DateUtil.getCurrentDate());
						
						dg = dg.create();
						System.out.println("Insert DutyGroup" + (i + 1));
					}
				}
				catch(Exception e)
				{
					System.out.println("ErrorMessage : " + e.getMessage());
				}
			}
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}
	
	public void SyncEdOffice(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		EdOfficeService service = new EdOfficeService();
		if (service.chkServiceConnection()==true){
			
			//List<EdOfficeInfo>  mm = service.getEdOfficeList("","");
			EdOfficeInfo[] mm = service.getInfo("", "");
			int i = 0;
			for (EdOfficeInfo info : mm) {
				EdOffice ed = new EdOffice(db);
				List<EdOffice> edList = ed.findByWhere(EdOffice.OFFCODECol +"= ?",info.getOffCode());
				try{
					if(edList.size()==1){				
						ed = ed.findByPk(edList.get(0).getId());
						ed.setOffcode(info.getOffCode());
						ed.setOffname(info.getOffName());
						ed.setShort_name(info.getShort_name());
						ed.setIndc_off(info.getIndc_off());
						ed.setTambol_code(info.getTambol_code());
						ed.setSupoffcode(info.getSupOffCode());
						ed.setBegin_date(DateUtil.getCurrentDate());
						
						ed = ed.update();
						System.out.println("Update EdOfficeInfo " + (i + 1));
					}else{
						ed.setOffcode(info.getOffCode());
						ed.setOffname(info.getOffName());
						ed.setShort_name(info.getShort_name());
						ed.setIndc_off(info.getIndc_off());
						ed.setTambol_code(info.getTambol_code());
						ed.setSupoffcode(info.getSupOffCode());
						ed.setBegin_date(DateUtil.getCurrentDate());
						
						ed = ed.create();
						System.out.println("Insert EdOfficeInfo " + (i + 1));
					}
					
				}catch(Exception e){
					System.out.println("ErrorMessage : " + e.getMessage());
				}
				i++;
			}	
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}
	
	
	
	
	
public void SyncDutyUnit(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		ProductUnitService service = new ProductUnitService();
		if (service.chkServiceConnection()==true){
			
			DutyUnitInfo[] mm = service.getDutyUnitInfo("", "");
			
			int i = 0;
			for (DutyUnitInfo info : mm) {
				
				//System.out.println("BeginDate :" + info.getBegin_date() + " $$ EndDate : " + info.getEnd_date());
				String group_id = getGroupIDByDutyCode(info.getDuty_code());
				
				String sql = "";
				sql += " select * from duty_unit ";
				sql += " where group_id = '" + group_id + "' and unit_code = '" + info.getUnit_code() + "' ";
				sql += " and used_for = '" + info.getUsed_for() + "' and data_source = '" + data_source + "'";
				//log.debug(sql);
				DutyUnit du = new DutyUnit(db);
				List<Map<String,Object>> duList = du.findBySql(sql);
				//System.out.println(duList.size() + "  " + duList.get(0).get("id").toString());
				try{
					String vBeginDate = "";
					String vEndDate = "";
					if (!info.getBegin_date().equals(""))
						vBeginDate =  (Integer.parseInt(info.getBegin_date().substring(0,4))+543) + info.getBegin_date().substring(4);
					
					if (!info.getEnd_date().equals(""))
						vEndDate = (Integer.parseInt(info.getEnd_date().substring(0,4))+543) + info.getEnd_date().substring(4);
					
					//System.out.println("$$$$$$$$$$$$$$$ " + vBeginDate);
					if(duList.size()>0){
						System.out.println("UPDATE");
						du = du.findByPk(new Long(duList.get(0).get("id").toString()));
						du.setUnit_code(info.getUnit_code());
						du.setUsed_for(info.getUsed_for());
						if (!vBeginDate.equals(""))
							du.setBegin_date(DateUtil.getDateFromString(vBeginDate));
						if (!vEndDate.equals(""))
							du.setEnd_date(DateUtil.getDateFromString(vEndDate));

						du.setGroup_id(group_id);
						du.setData_source(data_source);
						du = du.update();
						log.debug("Update DutyUnit " + (i + 1) + " " + du.getUnit_code());
					}else{
						System.out.println("INSERT");
						du.setUnit_code(info.getUnit_code());
						du.setUsed_for(info.getUsed_for());
						du.setBegin_date(DateUtil.getDateFromString(vBeginDate));
						du.setEnd_date(DateUtil.getDateFromString(vEndDate));
						du.setGroup_id(group_id);
						du.setData_source(data_source);
						du = du.create();
						log.debug("Insert DutyUnit " + (i + 1) + " " + du.getUnit_code());
					}					
				}catch(Exception e){
					log.debug("ErrorMessage : " + e.getMessage());
				}
				i++;
			}	
			request.setAttribute("ErrMsg", "");
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
	}

	public void SyncBrandMain(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		DutyGroupService dg = new DutyGroupService();
		if(dg.chkServiceConnection()==true){
			List<DutyGroupInfo> mm = dg.getDutyGroupList("", "");
			for (int i=0;i<mm.size();i++){
				//System.out.println("GROUP_ID :" + mm.get(i).getGroup_id());
				PrcBrandMain bm = new PrcBrandMain();
				if(bm.chkServiceConnection()==true){
				 	BrandMainInfo[] bmi = bm.getBrandMainInfo("GROUP_ID", mm.get(i).getGroup_id());
				 	if(bm.getErr_desc().equals(bm.serviceCompleteCode)){
					 	for(int j=0;j<bmi.length;j++){
					 		//System.out.println("GROUP_ID :" + mm.get(i).getGroup_id() + " $$$$ BrandMainCode :" + bmi.get(j).getBrand_main_code());
						 	try{
						 		BrandMain bnd = new BrandMain(db);
							 	List<BrandMain> bmList = bnd.findByWhere("group_id = '" + mm.get(i).getGroup_id() + "' and brand_main_code = '" + bmi[j].getBrand_main_code() + "'", null);
							 	
							 	String begin_date = "";
							 	if(bmi[j].getBegin_date() != null && bmi[j].getBegin_date().length() == 8)
							 		begin_date = (new Long(bmi[j].getBegin_date().substring(0,4))+543) + "" + bmi[j].getBegin_date().substring(3);
							 	
							 	String end_date = "";
							 	if(bmi[j].getEnd_date() != null && bmi[j].getEnd_date().length() == 8)
							 		end_date = (new Long(bmi[j].getEnd_date().substring(0,4))+543) + "" + bmi[j].getEnd_date().substring(3);
							 	
							 	if(bmList.size()>0){
							 		//Update
							 		bnd = bnd.findByPk(bmList.get(0).getId());
							 		bnd.setBrand_main_code(bmi[j].getBrand_main_code());
							 		bnd.setBrand_main_thai(bmi[j].getBrand_main_thai());
							 		bnd.setBrand_main_eng(bmi[j].getBrand_main_eng());
							 		bnd.setBegin_date(!begin_date.equals("") ? DateUtil.getDateFromString(begin_date) : null);
							 		bnd.setEnd_date(!end_date.equals("") ? DateUtil.getDateFromString(end_date) : null);
							 		bnd.setUpd_userid(uData.getIdCard());
							 		bnd.setUpd_date(new Date());
							 		bnd.setGroup_id(mm.get(i).getGroup_id());
							 		bnd.setData_source("WebService");
							 		bnd = bnd.update();
							 		
							 		System.out.println("Update BrandMain " + bmi[j].getBrand_main_thai() + "  GROUP_ID :" + mm.get(i).getGroup_name());
							 	}else{
							 		//Insert
							 		bnd.setBrand_main_code(bmi[j].getBrand_main_code());
							 		bnd.setBrand_main_thai(bmi[j].getBrand_main_thai());
							 		bnd.setBrand_main_eng(bmi[j].getBrand_main_eng());
							 		bnd.setBegin_date(!begin_date.equals("") ? DateUtil.getDateFromString(begin_date) : null);
							 		bnd.setEnd_date(!end_date.equals("") ? DateUtil.getDateFromString(end_date) : null);
							 		bnd.setUpd_userid(uData.getIdCard());
							 		bnd.setUpd_date(new Date());
							 		bnd.setGroup_id(mm.get(i).getGroup_id());
							 		bnd.setData_source("WebService");
							 		bnd = bnd.create();
							 		
							 		System.out.println("Insert BrandMain " + bmi[j].getBrand_main_thai() + "  GROUP_ID :" + mm.get(i).getGroup_name());
							 	}
						 	}catch(Exception e){
						 		System.out.println("ErrorMessage : " + (bmi[j].getBrand_main_thai() != null ? bmi[j].getBrand_main_thai() : bmi[j].getBrand_main_eng()) + "  GROUP_NAME :" + mm.get(i).getGroup_name() + e.getMessage());
						 	}
					 	}
				 	}
				}else{
					request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + bm.getErr_desc());
				}
			}
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + dg.getErr_desc());
		}
	}
	
	
	
	
public void SyncBrandMain2(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PrcBrandMain bm = new PrcBrandMain();
		if(bm.chkServiceConnection()==true){
			String group_id="7002";
		 	BrandMainInfo[] bmi = bm.getBrandMainInfo("GROUP_ID", group_id);
		 	if(bm.getErr_desc().equals(bm.serviceCompleteCode)){
			 	for(int j=0;j<bmi.length;j++){
			 		//System.out.println("GROUP_ID :" + mm.get(i).getGroup_id() + " $$$$ BrandMainCode :" + bmi.get(j).getBrand_main_code());
				 	try{
				 		BrandMain bnd = new BrandMain(db);
					 	List<BrandMain> bmList = bnd.findByWhere("group_id = '" + group_id + "' and brand_main_code = '" + bmi[j].getBrand_main_code() + "'", null);
					 	
					 	String begin_date = "";
					 	if(bmi[j].getBegin_date() != null && bmi[j].getBegin_date().length() == 8)
					 		begin_date = (new Long(bmi[j].getBegin_date().substring(0,4))+543) + "" + bmi[j].getBegin_date().substring(3);
					 	
					 	String end_date = "";
					 	if(bmi[j].getEnd_date() != null && bmi[j].getEnd_date().length() == 8)
					 		end_date = (new Long(bmi[j].getEnd_date().substring(0,4))+543) + "" + bmi[j].getEnd_date().substring(3);
					 	
					 	if(bmList.size()>0){
					 		//Update
					 		bnd = bnd.findByPk(bmList.get(0).getId());
					 		bnd.setBrand_main_code(bmi[j].getBrand_main_code());
					 		bnd.setBrand_main_thai(bmi[j].getBrand_main_thai());
					 		bnd.setBrand_main_eng(bmi[j].getBrand_main_eng());
					 		bnd.setBegin_date(!begin_date.equals("") ? DateUtil.getDateFromString(begin_date) : null);
					 		bnd.setEnd_date(!end_date.equals("") ? DateUtil.getDateFromString(end_date) : null);
					 		bnd.setUpd_userid(uData.getIdCard());
					 		bnd.setUpd_date(new Date());
					 		bnd.setGroup_id(group_id);
					 		bnd.setData_source("WebService");
					 		bnd = bnd.update();
					 		
					 		//System.out.println("Update BrandMain " + bmi[j].getBrand_main_thai() + "  GROUP_ID :" + group_id);
					 	}else{
					 		//Insert
					 		bnd.setBrand_main_code(bmi[j].getBrand_main_code());
					 		bnd.setBrand_main_thai(bmi[j].getBrand_main_thai());
					 		bnd.setBrand_main_eng(bmi[j].getBrand_main_eng());
					 		bnd.setBegin_date(!begin_date.equals("") ? DateUtil.getDateFromString(begin_date) : null);
					 		bnd.setEnd_date(!end_date.equals("") ? DateUtil.getDateFromString(end_date) : null);
					 		bnd.setUpd_userid(uData.getIdCard());
					 		bnd.setUpd_date(new Date());
					 		bnd.setGroup_id(group_id);
					 		bnd.setData_source("WebService");
					 		bnd = bnd.create();
					 		
					 		System.out.println("Insert BrandMain " + bmi[j].getBrand_main_thai() + "  GROUP_ID :" + group_id);
					 	}
				 	}catch(Exception e){
				 		//System.out.println("ErrorMessage : " + (bmi[j].getBrand_main_thai() != null ? bmi[j].getBrand_main_thai() : bmi[j].getBrand_main_eng()) + "  GROUP_NAME :" + group_id + e.getMessage());
				 	//}finally{
				 	//	db.closedb();
				 	}
			 	}
		 	}
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + bm.getErr_desc());
		}
			
	}
	
	public void SyncData(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		MasterService service = new MasterService();
		if(service.chkServiceConnection()==true)
		{
			request.setAttribute("ErrMsg", "");
			request.setAttribute("CompleteMsg", "");
			String[] str;
			str = request.getParameterValues("chkList");

			if(str != null){
				for(int i = 0;i<str.length;++i)
				{
					if(str[i].equals("ED_OFFICE"))
						SyncEdOffice(request,response);
					else if(str[i].equals("DUTY_GROUP"))
						SyncDutyGroup(request,response);
					else if(str[i].equals("DUTY_TABLE"))
						SyncDutyTable(request,response);
					else if(str[i].equals("PRODUCT_TYPE"))
						SyncProductType(request,response);
					else if(str[i].equals("UNIT"))
						SyncUnit(request,response);
					else if(str[i].equals("COUNTRY"))
						SyncCountry(request,response);
					else if(str[i].equals("PROVINCE"))
						SyncProvince(request,response);
					else if(str[i].equals("DISTRICT"))
						SyncDistrict(request,response);
					else if(str[i].equals("SUBDISTRICT"))
						SyncSubDistrict(request,response);
					else if(str[i].equals("TITLE"))
						SyncTitle(request,response);
					else if(str[i].equals("DUTY_UNIT"))
						SyncDutyUnit(request,response);
					else if(str[i].equals("BRAND_MAIN"))
						SyncBrandMain(request,response);
				}
				request.setAttribute("CompleteMsg", "การดำเนินการเสร็จสมบูรณ์");
			}else{
				request.setAttribute("ErrMsg", "กรุณาเลือกตารางที่ต้องการทำข้อมูลให้ตรงกัน");
			}
		}else{
			request.setAttribute("ErrMsg", "ไม่สามารถเชื่อมต่อกับ Web Service ได้\n" + service.getErr_desc());
		}
		forward("?page=/Master/SyncRDB.jsp");
	}
	
	public static void main(String args[]){
		SyncRDBAction bm = new SyncRDBAction();
		try{
			bm.SyncUnit(null, null);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
