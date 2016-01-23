








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseSuspectVehicle;
import com.ko.util.DB;

import java.util.List;

public class SuspectVehicle extends BaseSuspectVehicle{
	public SuspectVehicle(DB db){
		super(db);
	}
	// business method go here
    public String getFull_name(){
        return getCar_cate()+ " " + getCar_no()+" "+getProvinceText();  
    }
//    public String getCar_category_text(){
//        ProductType pt = new ProductType(db);
//        try {
//            List<ProductType> p = pt.findByWhere(ProductType.DUTY_CODECol+"=?",getProducttype_duty_code());
//            if(p.size()>0)
//                return p.get(0).getType_name();
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
    public String getProvinceText(){
        Province dbP = new Province(db);
        try {
            List<Province> dbPList= dbP.findByWhere(Province.PROVINCE_CODECol+"=?",getProvince_code());
            if(dbPList != null && dbPList.size()>0){
                return dbPList.get(0).getProvince_name();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getBrand_text(){
        BrandMain bm = new BrandMain(db);
        try {
            getBrand_brand_code();
            List<BrandMain> bmList = bm.findByWhere("substr(duty_code,1,2)='05' and brand_main_code=?",getBrand_brand_code());
            if(bmList.size()>0){
                BrandMain bmain = bmList.get(0);
                return (bmain.getBrand_main_eng()!=null)?bmain.getBrand_main_eng():bmain.getBrand_main_thai();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
}