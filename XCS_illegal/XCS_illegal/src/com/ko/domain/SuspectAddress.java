










/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseSuspectAddress;
import com.ko.util.DB;

import java.util.List;

public class SuspectAddress extends BaseSuspectAddress{
	public SuspectAddress(DB db){
		super(db);
	}
	// business method go here
    public String getFull_address() {
        return ((getAddress()!=null)?"เลขที่ "+getAddress()+" ":"")+
               ((getAddress_name()!=null)?getAddress_name()+" ":"")+
               ((getMoo()!=null)?"หมู่ที่ "+getMoo().toString()+" ":"")+
               ((getSoi()!=null)?"ซอย "+getSoi()+" ":"")+
               ((getRoad()!=null)?"ถนน "+getRoad()+" ":"")+
               ((getSubdistrict_code()!=null)?getSubDistrictText()+" ":"")+
               ((getDistrict_code()!=null)?getDistrictText()+" ":"")+
               ((getProvince_code()!=null)?getProvinceText()+" ":"")+
               ((getZipcode()!=null)?"รหัสไปรษณีย์ "+getZipcode()+" ":"");
    }
    public String getProvinceText(){
        Province dbP = new Province(db);
        try {
            List<Province> dbPList= dbP.findByWhere(Province.PROVINCE_CODECol+"=?",getProvince_code());
            if(dbPList != null && dbPList.size()>0){
                return "จังหวัด "+dbPList.get(0).getProvince_name();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getDistrictText(){
        District dbP = new District(db);
        try {
            List<District> dbPList= dbP.findByWhere(District.DISTRICT_CODECol+"=?",getDistrict_code());
            if(dbPList != null && dbPList.size()>0){
                return "อำเภอ "+dbPList.get(0).getDistrict_name();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getSubDistrictText(){
        Subdistrict dbP = new Subdistrict(db);
        try {
            List<Subdistrict> dbPList= dbP.findByWhere(Subdistrict.SUBDISTRICT_CODECol+"=?",getSubdistrict_code());
            if(dbPList != null && dbPList.size()>0){
                return "ตำบล "+dbPList.get(0).getSubdistrict_name();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
}