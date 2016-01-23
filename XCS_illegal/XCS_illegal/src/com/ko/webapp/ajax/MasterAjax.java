package com.ko.webapp.ajax;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ko.domain.Court;
import com.ko.domain.Unit;
import com.ko.domain.DutyUnit;
import com.ko.domain.DutyTable;
import com.ko.domain.BrandMain;
import com.ko.domain.ApplicationSearchWarrant;

import com.ko.domain.Race;
import com.ko.domain.Nationality;
import com.ko.domain.Lawbreaker;
import com.ko.domain.Religion;
import com.ko.domain.PictureCategory;
import com.ko.domain.SuspectPicture;
import com.ko.domain.Relation;
import com.ko.domain.SuspectRelatif;

//import com.ko.domain.StaffOther;
import com.ko.domain.ApplicationArrest;
import com.ko.domain.Indictment;
import com.ko.domain.Unit;



public class MasterAjax extends BaseAjax {
	private final Log logger = LogFactory.getLog(getClass());
	
	public String chkDupCourt(String CourtCode, String CourtID){
		String ret = "";
		try{
			Court c = new Court(db);
			List<Court> cList = c.findByWhere(" court_code = '" + CourtCode + "' and id <> '" + CourtID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "รหัสศาลซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	public String chkRelCourt( String CourtID){
		String ret = "";
		try{
			ApplicationSearchWarrant c = new ApplicationSearchWarrant(db);
			//List<ApplicationSearchWarrant> cList = c.findByWhere(" court_id = " + CourtID + "", null);
			
			String SQL = "select id from application_search_warrant where rownum = 1 and court_id =  " + CourtID  ;
			List<Map<String,Object>> cList = c.findBySql(SQL);
			if(cList != null && cList.size()>0){
				ret = "รายการข้อมูลนี้ถูกนำไปใช้แล้ว ไม่สามารถลบข้อมูลได้";
			};
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	public String chkDupRace(String RaceCode, String RaceID){
		String ret = "";
		try{
			Race r = new Race(db);		
			List<Race> cList = r.findByWhere(" race_code = '" + RaceCode + "' and id <> '" + RaceID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "รหัสเชื้อชาติซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}	
	public String chkDupNationalCode(String NatCode, String NatID){
		String ret = "";
		try{
			Nationality c = new Nationality(db);
			String SQL = "select id  from nationality where nation_code = " + NatCode + " and id <>  " + NatID + "";
			List<Map<String,Object>> cList = c.findBySql(SQL);	
			//List<Nationality> cList = n.findByWhere(" nation_code = '" + NatCode + "' and id <> '" + NatID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "รหัสสัญชาติซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String chkDupBrandTH(String BrandMainTh,String BrandGroupID ,String BrandMainID){
		//System.out.println("BrandMainTh="+ BrandMainTh + "   BrandGroupID="+BrandGroupID + "  BrandMainID="+BrandMainID);
		String ret = "";
		try{
			BrandMain c = new BrandMain(db);
			List<BrandMain> cList = c.findByWhere(" brand_main_thai = '" + BrandMainTh + "' and group_id = '" + BrandGroupID + "' and id <> '" + BrandMainID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "ชื่อยี่ห้อไทยซ้ำ";
			}
		}catch (Exception e){

		}finally{
			closeDB();
		}

		return ret;
	}
	
	public String chkDupBrandEN(String BrandMainEn,String BrandGroupID ,String BrandMainID){
		String ret = "";
		try{
			BrandMain c = new BrandMain(db);
			List<BrandMain> cList = c.findByWhere(" brand_main_eng = '" + BrandMainEn + "' and group_id = '" + BrandGroupID + "' and id <> '" + BrandMainID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "ชื่อยี่ห้ออังกฤษซ้ำ";
			}
		}catch (Exception e){

		}finally{
			closeDB();
		}

		return ret;
	}
	
	public String chkRelNational( String NatID){
		String ret = "";		
		try{
			Lawbreaker c = new Lawbreaker(db);
			String SQL = "select id   from application_arrest_lawbreaker where rownum = 1 and nationality_id =  " + NatID ;
			List<Map<String,Object>> cList = c.findBySql(SQL);			
			if(cList != null && cList.size()>0){
				ret = "รายการข้อมูลนี้ถูกนำไปใช้แล้ว ไม่สามารถลบข้อมูลได้";
			};
		}catch (Exception e){

		}finally{
			closeDB();
		}
		return ret;
	}
	public String chkDupReligionCode(String ReligionCode, String ReligionID){
		String ret = "";
		try{
			Religion c = new Religion(db);
			String SQL = "select id  from religion where religion_code = " + ReligionCode + " and id <>  " + ReligionID + "";
			List<Map<String,Object>> cList = c.findBySql(SQL);	
			//List<Nationality> cList = n.findByWhere(" nation_code = '" + NatCode + "' and id <> '" + NatID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "รหัสศาสนาซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	public String chkRelReligion( String ReligionID){
		String ret = "";		
		try{
			Lawbreaker c = new Lawbreaker(db);
			String SQL = "select id from lawbreaker where rownum = 1 and religion_id =  " + ReligionID ;
			List<Map<String,Object>> cList = c.findBySql(SQL);			
			if(cList != null && cList.size()>0){
				ret = "รายการข้อมูลนี้ถูกนำไปใช้แล้ว ไม่สามารถลบข้อมูลได้";
			};
		}catch (Exception e){

		}finally{
			closeDB();
		}
		return ret;
	}
	public String chkDupPicCateCode(String PicCateCode, String PicCateID){
		String ret = "";
		try{
			PictureCategory c = new PictureCategory(db);
			String SQL = "select id  from picture_category where category_code = " + PicCateCode + " and id <>  " + PicCateID + "";
			List<Map<String,Object>> cList = c.findBySql(SQL);	
			//List<Nationality> cList = n.findByWhere(" nation_code = '" + NatCode + "' and id <> '" + NatID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "รหัสหมวดภาพถ่ายซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	public String chkRelPicCate( String PicCateID){
		String ret = "";		
		try{
			SuspectPicture c = new SuspectPicture(db);
			String SQL = "select id from suspect_picture where rownum = 1 and picture_category_id =  " + PicCateID ;
			List<Map<String,Object>> cList = c.findBySql(SQL);			
			if(cList != null && cList.size()>0){
				ret = "รายการข้อมูลนี้ถูกนำไปใช้แล้ว ไม่สามารถลบข้อมูลได้";
			};
		}catch (Exception e){

		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String chkDupRelsCode(String RelationCode, String RelationID){
		String ret = "";
		try{
			Relation c = new Relation(db);
			String SQL = "select id  from relation where  relation_code = " + RelationCode + " and id <>  " + RelationID + "";
			List<Map<String,Object>> cList = c.findBySql(SQL);	
			//List<Nationality> cList = n.findByWhere(" nation_code = '" + NatCode + "' and id <> '" + NatID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "รหัสความสัมพันธ์ซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String chkRelRels( String RelsID){
		String ret = "";		
		try{
			SuspectRelatif c = new SuspectRelatif(db);
			String SQL = "select id from suspect_relatives where rownum = 1 and relation =  " + RelsID ;
			List<Map<String,Object>> cList = c.findBySql(SQL);			
			if(cList != null && cList.size()>0){
				ret = "รายการข้อมูลนี้ถูกนำไปใช้แล้ว ไม่สามารถลบข้อมูลได้";
			};
		}catch (Exception e){

		}finally{
			closeDB();
		}
		return ret;
	}

	public String chkRefStaffOther(String StaffNO){
		String ret = "";
		try{
			ApplicationArrest aa = new ApplicationArrest(db);
			List<ApplicationArrest> aaList = aa.findByWhere("accuser_idcardno = '" + StaffNO + "'", null);
			if(aaList != null && aaList.size()>0)
				ret = "ข้อมูลมีการนำไปใช้ ไม่สามารถลบได้";
		}catch(Exception e){
			
		}finally{
			closeDB();
		}
		
		return ret;
	}
 
	
	public String chkDupRaceCode(String RaceCode, String RaceID){
		String ret = "";
		try{
			Race c = new Race(db);
			String SQL = "select id  from race where  race_code = " + RaceCode + " and id <>  " + RaceID + "";
			List<Map<String,Object>> cList = c.findBySql(SQL);	
			//List<Nationality> cList = n.findByWhere(" nation_code = '" + NatCode + "' and id <> '" + NatID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "รหัสเชื้อชาติซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String chkRelRace( String RaceID){
		String ret = "";		
		try{
			SuspectRelatif c = new SuspectRelatif(db);
			String SQL = "select id from application_arrest_lawbreaker where rownum = 1 and Race_id =  " + RaceID ;
			List<Map<String,Object>> cList = c.findBySql(SQL);			
			if(cList != null && cList.size()>0){
				ret = "รายการข้อมูลนี้ถูกนำไปใช้แล้ว ไม่สามารถลบข้อมูลได้";
			};
		}catch (Exception e){

		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String chkRelIndictment( String IndictmentID){
		String ret = "";
		String msg = "รายการข้อมูลที่เลือกได้ถูกนำไปใช้แล้ว ไม่สามารถลบข้อมูลได้";
		try{
			Indictment c = new Indictment(db);
			String SQL = "select id from application_arrest_indictment where rownum = 1 and indictment_id in ( " + IndictmentID + ")";
			List<Map<String,Object>> cList = c.findBySql(SQL);			
			if(cList != null && cList.size()>0){
				ret = msg;
			}else{
				SQL = "select id from application_notice_indictment where rownum = 1 and indictment_id in ( " + IndictmentID + ")";
				cList = c.findBySql(SQL);
				if(cList != null && cList.size()>0){
					ret = msg;
				}else{
					SQL = "select id from application_sincere_indictment where rownum = 1 and indictment_id in ( " + IndictmentID + ")";
					cList = c.findBySql(SQL);
					if(cList != null && cList.size()>0){
						ret = msg;
					}else{
						SQL = "select id from compare_case where rownum = 1 and indictment_id in ( " + IndictmentID + ")";
						cList = c.findBySql(SQL);
						if(cList != null && cList.size()>0){
							ret = msg;
						}else{
							SQL = "select id from suspect_investigate_indictment where rownum = 1 and indictment_id in ( " + IndictmentID + ")";
							cList = c.findBySql(SQL);
							if(cList != null && cList.size()>0){
								ret = msg;
							}
						}
					}
				}
			}
		}catch (Exception e){

		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String getUnitName(String unit_code){
		String ret="";
		try{
			Unit u = new Unit(db);
			List<Unit> uList = u.findByWhere("unit_code = '" + unit_code + "'", null);
			if(uList.size()>0)
				ret = uList.get(0).getThname();
		}catch(Exception e){
			
		}finally{
			closeDB();
		}
		log.debug(ret + " $$$$$$$$$$$");
		
		return ret;
	}
	
	public String chkDupDutyTable(String DutyCode, String DutyID){
		String ret = "";
		try{
			DutyTable c = new DutyTable(db);
			List<DutyTable> cList = c.findByWhere(" duty_code = '" + DutyCode + "' and id <> '" + DutyID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "รหัสชนิดสินค้าซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	public String chkDupUnitTh(String UnitNameTh, String UnitID){
		String ret = "";
		try{
			Unit c = new Unit(db);
			List<Unit> cList = c.findByWhere(" thname = '" + UnitNameTh + "' and id <> '" + UnitID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "ชื่อหน่วยนับไทยซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String chkDupUnitEn(String UnitNameEn, String UnitID){
		String ret = "";
		try{
			Unit c = new Unit(db);
			List<Unit> cList = c.findByWhere(" enname = '" + UnitNameEn + "' and id <> '" + UnitID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "ชื่อหน่วยนับอังกฤษซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String chkDupUnitAbb(String UnitAbbName, String UnitID){
		String ret = "";
		try{
			Unit c = new Unit(db);
			List<Unit> cList = c.findByWhere(" abbname = '" + UnitAbbName + "' and id <> '" + UnitID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "ชื่อหน่วยนับย่อซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String chkDupDutyUnit(String UnitCode, String UnitGroupID,String DutyUnitID){
		String ret = "";
		try{
			DutyUnit c = new DutyUnit(db);
			List<DutyUnit> cList = c.findByWhere(" unit_code = '" + UnitCode + "' and group_id = '" + UnitGroupID  + "' and id <> '" + DutyUnitID + "'", null);
			if(cList != null && cList.size()>0){
				ret = "รหัสประเภทสินค้าซ้ำ";
			}
		}catch (Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
	}
	
}
