








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseLawbreakerRelatif;
import com.ko.util.DB;

import java.util.List;

public class LawbreakerRelatif extends BaseLawbreakerRelatif{
	public LawbreakerRelatif(DB db){
		super(db);
	}
	// business method go here
    public String getFull_current_address() {
        return ((getCurrent_address_no()!=null)?"เลขที่ "+getCurrent_address_no()+" ":"")+
               ((getCurrent_moo()!=null)?"หมู่ที่ "+getCurrent_moo().toString()+" ":"")+
               ((getCurrent_soi()!=null)?"ซอย "+getCurrent_soi()+" ":"")+
               ((getCurrent_road()!=null)?"ถนน "+getCurrent_road()+" ":"")+
               ((getCurrent_subdistrict_code()!=null)?getCurrent_subdistrict_text()+" ":"")+
               ((getCurrent_district_code()!=null)?getCurrent_district_text()+" ":"")+
               ((getCurrent_province_code()!=null)?getCurrent_province_text()+" ":"")+
               ((getCurrent_post_code()!=null)?"รหัสไปรษณีย์ "+getCurrent_post_code()+" ":"");
    }
    public String getFull_hometown_address(){
        return ((getHometown_address_no()!=null)?"เลขที่ "+getHometown_address_no()+" ":"")+
               ((getHometown_moo()!=null)?"หมู่ที่ "+getHometown_moo().toString()+" ":"")+
               ((getHometown_soi()!=null)?"ซอย "+getHometown_soi()+" ":"")+
               ((getHometown_road()!=null)?"ถนน "+getHometown_road()+" ":"")+
               ((getHometown_subdistrict_code()!=null)?getHometown_subdistrict_text()+" ":"")+
               ((getHometown_district_code()!=null)?getHometown_district_text()+" ":"")+
               ((getHometown_province_code()!=null)?getHometown_province_text()+" ":"")+
               ((getHometown_post_code()!=null)?"รหัสไปรษณีย์ "+getHometown_post_code()+" ":"");
    }
    public String getHometown_province_text(){
       return getProvinceText(getHometown_province_code());
    }
    public String getCurrent_province_text(){
        return getProvinceText(getCurrent_province_code());
    }
    public String getProvinceText(String code){
        Province dbP = new Province(db);
        try {
            List<Province> dbPList= dbP.findByWhere(Province.PROVINCE_CODECol+"=?",code);
            if(dbPList != null && dbPList.size()>0){
                return "จังหวัด "+dbPList.get(0).getProvince_name();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getHometown_district_text(){
        return getDistrictText(getHometown_district_code());
    }
    public String getCurrent_district_text(){
        return getDistrictText(getCurrent_district_code());
    }
    public String getDistrictText(String code){
        District dbP = new District(db);
        try {
            List<District> dbPList= dbP.findByWhere(District.DISTRICT_CODECol+"=?",code);
            if(dbPList != null && dbPList.size()>0){
                return "อำเภอ "+dbPList.get(0).getDistrict_name();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getHometown_subdistrict_text() {
        return getSubDistrictText(getHometown_subdistrict_code());
    }
    public String getCurrent_subdistrict_text(){
        return getSubDistrictText(getCurrent_subdistrict_code());
    }
    public String getSubDistrictText(String code){
        Subdistrict dbP = new Subdistrict(db);
        try {
            List<Subdistrict> dbPList= dbP.findByWhere(Subdistrict.SUBDISTRICT_CODECol+"=?",code);
            if(dbPList != null && dbPList.size()>0){
                return "ตำบล "+dbPList.get(0).getSubdistrict_name();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getRelation_text(){
        Relation rel = new Relation(db);
        try {
            rel = rel.findByPk(getRelation());
            return rel.getRelation_name();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }

    public String getTitle_text(){
        Title rel = new Title(db);
        try {
            List<Title> relList = rel.findByWhere(Title.TITLE_CODECol+"=?",getTitle_code());
            if(relList != null && relList.size()>0){
                return relList.get(0).getTitle_name();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
}