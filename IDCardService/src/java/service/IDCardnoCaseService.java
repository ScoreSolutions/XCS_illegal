package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.Exception;

import com.domain.BaseDomain;
import data.*;

public class IDCardnoCaseService extends BaseService {

    String _err="";

    public ResponseHeader getResponse(RequestHeader reqHeader) throws Exception{
        ResponseHeader ret = new ResponseHeader();

        if(validateHeader(reqHeader)==true){
           if(isValidData(reqHeader.getLawbreaker_idcard_no(), reqHeader.getRestrospect_year())==true){
               ret.setIsValidData(true);
               ret.setMessage("");
               ret.setResponseBody(setIDCardnoCase(reqHeader.getLawbreaker_idcard_no(), reqHeader.getRestrospect_year()));
           }else{
                ret.setIsValidData(false);
                ret.setMessage("ไม่พบข้อมูลผู้กระทำผิด");
                ret.setResponseBody(null);
           }

        }else{
            //ret = new ResponseHeader();
            ret.setIsValidData(false);
            ret.setMessage(_err);
            ret.setResponseBody(null);
        }

        return ret;
    }

    private ArrayList<IDCardnoCase> setIDCardnoCase(String lawbreaker_id_cardno, long restrospect_year) throws Exception{
        ArrayList ret = new ArrayList();
        try{
            BaseDomain aa = new BaseDomain(db);
            String sql = "";
            sql += " select aal.lawbreaker_id_card, t.title_code, t.title_name, aal.first_name, aal.last_name, aal.other_name, aal.sex, ";
            sql += " aal.address_no lawbreaker_address_no, aal.soi lawbreaker_soi, aal.road lawbreaker_road, aal.moo lawbreaker_moo, ";
            sql += " aal.subdistrict lawbreaker_subdistrict, aal.district lawbreakerk_district, aal.province lawbreaker_province, ";
            sql += " r.race_name, n.nation_name nationality_name, aal.career, ";
            sql += " to_char(aal.birth_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') birth_date, aal.age, ";
            sql += " aal.father_name, aal.mother_name, aa.track_no, bi.case_id,";
            sql += " to_char(bi.case_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date, aa.offcode, ";
            sql += " lg.legislation_code,lg.legislation_name, aa.product_group_id, ";
            sql += " to_char(aa.occurrence_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date, ";
            sql += " aa.scene_name, aa.scene_no,aa.scene_moo,aa.scene_soi,aa.scene_road,aa.scene_subdistrict, aa.scene_district,aa.scene_province,";
            sql += " aa.coordinate_x,aa.coordinate_y, nvl(aa.accuser_name, tia.title_name || sta.first_name || ' ' || sta.last_name) accuser_name,";
            sql += " nvl(aa.accuser_posname, psa.posname || ' ' || sta.staff_level) accuser_posname, nvl(aa.accuser_offname, eda.offname) accuser_offname,";
            sql += " aa.behaviour, aa.testimony, cc.accuser_testimony,aa.administration,bi.case_quality, cc.compare_case_no,";
            sql += " to_char(cc.pay_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') pay_date,";
            sql += " pke_compare.getInvNo(aal.id) invcode, tis.title_name || sts.first_name || ' ' || sts.last_name sue_staff_name,";
            sql += " pss.posname || ' ' || sts.staff_level sue_posname, eds.offname sue_offname, cc.case_total_fine, ";
            sql += " cci.case_law_id compare_law_id, cci.penalty_case_law_id compare_penalty_case_law_id, cc.birbe_money, cc.reward_money, cc.treasury_money, ";
            sql += " bi.case_last,to_char(bi.case_last_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_last_date, bi.case_result, ";
            sql += " aap.exhibit_report_no, to_char(aap.taken_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') taken_date,";
            sql += " tie.title_name || ste.first_name || ' ' || ste.last_name prove_staff_name, pse.posname || ' ' || ste.staff_level prove_posname, ede.offname prove_offname ";
            sql += " from application_arrest_lawbreaker aal ";
            sql += " left join title t on t.title_code=aal.title_code ";
            sql += " left join nationality n on n.id=aal.nationality_id ";
            sql += " left join race r on r.id=aal.race_id ";
            sql += " inner join application_arrest aa on aa.track_no=aal.track_no ";
            sql += " inner join book_impeachment bi on bi.track_no=aa.track_no ";
            sql += " inner join legislation lg on lg.id=aa.legislation_id ";
            sql += " left join staff sta on sta.idcard_no=aa.accuser_idcardno ";
            sql += " left join title tia on tia.title_code=sta.title_code ";
            sql += " left join position psa on psa.poscode=aa.accuser_poscode ";
            sql += " left join ed_office eda on eda.offcode=aa.accuser_offcode ";
            sql += " left join compare_case cc on aa.track_no=cc.track_no ";
            sql += " left join staff sts on sts.idcard_no=cc.sue_staff_idcardno ";
            sql += " left join title tis on tis.title_code=sts.title_code ";
            sql += " left join position pss on pss.poscode=cc.sue_poscode ";
            sql += " left join ed_office eds on eds.offcode=cc.sue_offcode ";
            sql += " left join indictment cci on cci.indictment_id=cc.indictment_id ";
            sql += " left join application_arrest_prove aap on aap.track_no=aa.track_no ";
            sql += " left join staff ste on ste.idcard_no=aap.staff_idcardno_prove ";
            sql += " left join title tie on tie.title_code=ste.title_code ";
            sql += " left join position pse on pse.poscode=aap.staff_prove_poscode ";
            sql += " left join ed_office ede on ede.offcode=aap.staff_prove_offcode ";
            sql += " where aal.lawbreaker_id_card='" + lawbreaker_id_cardno + "' ";
            sql += " and to_char(bi.case_date,'yyyy')>= (to_char(sysdate,'yyyy') - " + restrospect_year + ")";

            List<Map<String,Object>> lList = aa.findBySql(sql);
            //System.out.println(sql);
            for(int i=0;i<lList.size();i++){
                IDCardnoCase data = new IDCardnoCase();
                Map<String,Object> map = lList.get(i);

                data.setLawbreaker_idcard_no(lawbreaker_id_cardno);
                data.setTitle_code((map.get("title_code") != null ? map.get("title_code").toString() : ""));
                data.setTitle_name((map.get("title_name") != null ? map.get("title_name").toString() : ""));
                data.setFirst_name((map.get("first_name") != null ? map.get("first_name").toString() : ""));
                data.setLast_name((map.get("last_name") != null ? map.get("last_name").toString() : ""));
                data.setOther_name((map.get("other_name") != null ? map.get("other_name").toString() : ""));
                data.setSex((map.get("sex") != null ? map.get("sex").toString() : ""));
                data.setLawbreaker_address_no((map.get("lawbreaker_address_no") != null ? map.get("lawbreaker_address_no").toString() : ""));
                data.setLawbreaker_soi(map.get("lawbreaker_soi") != null ? map.get("lawbreaker_soi").toString() : "");
                data.setLawbreaker_road(map.get("lawbreaker_road") != null ? map.get("lawbreaker_road").toString() : "");
                data.setLawbreaker_moo(map.get("lawbreaker_moo") != null ? map.get("lawbreaker_moo").toString() : "");
                data.setLawbreaker_subdistrict(map.get("lawbreaker_subdistrict") != null ? map.get("lawbreaker_subdistrict").toString() : "");
                data.setLawbreaker_district(map.get("lawbreaker_district") != null ? map.get("lawbreaker_district").toString() : "");
                data.setLawbreaker_province(map.get("lawbreaker_province") != null ? map.get("lawbreaker_province").toString() : "");
                data.setRace_name(map.get("race_name") != null ? map.get("race_name").toString() : "");
                data.setNationality_name(map.get("nationality_name") != null ? map.get("nationality_name").toString() : "");
                data.setCareer(map.get("career") != null ? map.get("career").toString() : "");
                data.setBirth_date(map.get("birth_date") != null ? map.get("birth_date").toString() : "");
                data.setAge(map.get("age") != null ? new Long(map.get("age").toString()) : 0l);
                data.setFather_name(map.get("father_name") != null ? map.get("father_name").toString() : "");
                data.setMother_name(map.get("mother_name") != null ? map.get("mother_name").toString() : "");
                data.setTrack_no(map.get("track_no") != null ? map.get("track_no").toString() : "");
                data.setCase_id(map.get("case_id") != null ? map.get("case_id").toString() : "");
                data.setCase_date(map.get("case_date") != null ? map.get("case_date").toString() : "");
                data.setOffcode(map.get("offcode") != null ? map.get("offcode").toString() : "");
                data.setLegislation_code(map.get("legislation_code") != null ? map.get("legislation_code").toString() : "");
                data.setLegislation_name(map.get("legislation_name") != null ? map.get("legislation_name").toString() : "");
                data.setProduct_group_id(map.get("product_group_id") != null ? map.get("product_group_id").toString() : "");
                data.setOccurrence_date(map.get("occurrence_date") != null ? map.get("occurrence_date").toString() : "");
                data.setScene_name(map.get("scene_name") != null ? map.get("scene_name").toString() : "");
                data.setScene_no(map.get("scene_no") != null ? map.get("scene_no").toString() : "");
                data.setScene_moo(map.get("scene_moo") != null ? map.get("scene_moo").toString() : "");
                data.setScene_soi(map.get("scene_soi") != null ? map.get("scene_soi").toString() : "");
                data.setScene_road(map.get("scene_road") != null ? map.get("scene_road").toString() : "");
                data.setScene_subdistrict(map.get("scene_subdistrict") != null ? map.get("scene_subdistrict").toString() : "");
                data.setScene_district(map.get("scene_district") != null ? map.get("scene_district").toString() : "");
                data.setScene_province(map.get("scene_province") != null ? map.get("scene_province").toString() : "");
                data.setCoordinate_x(map.get("coordinate_x") != null ? new Double(map.get("coordinate_x").toString()) : 0d);
                data.setCoordinate_y(map.get("coordinate_y") != null ? new Double(map.get("coordinate_y").toString()) : 0d);
                data.setAccuser_name(map.get("accuser_name") != null ? map.get("accuser_name").toString() : "");
                data.setAccuser_posname(map.get("accuser_posname") != null ? map.get("accuser_posname").toString() : "");
                data.setAccuser_offname(map.get("accuser_offname") != null ? map.get("accuser_offname").toString() : "");
                data.setBehavior(map.get("behaviour") != null ? map.get("behaviour").toString() : "");
                data.setTestimony(map.get("testimony") != null ? map.get("testimony").toString() : "");
                data.setAccuser_testimony(map.get("accuser_testimony") != null ? map.get("accuser_testimony").toString() : "");
                data.setAdministration(map.get("administration") != null ? map.get("administration").toString() : "");
                data.setCase_quality(map.get("case_quality") != null ? map.get("case_quality").toString() : "");
                data.setCompare_case_no(map.get("compare_case_no") != null ? map.get("compare_case_no").toString() : "");
                data.setPay_date(map.get("pay_date") != null ? map.get("pay_date").toString() : "");
                data.setInvcode(map.get("invcode") != null ? map.get("invcode").toString() : "");
                data.setSue_staff_name(map.get("sue_staff_name") != null ? map.get("sue_staff_name").toString() : "");
                data.setSue_posname(map.get("sue_posname") != null ? map.get("sue_posname").toString() : "");
                data.setSue_offname(map.get("sue_offname") != null ? map.get("sue_offname").toString() : "");
                data.setCase_total_fine(map.get("case_total_fine") != null ? new Double(map.get("case_total_fine").toString()) : 0d);
                data.setCompare_law_id(map.get("compare_law_id") != null ? map.get("compare_law_id").toString() : "");
                data.setCompare_penalty_case_law_id(map.get("compare_penalty_case_law_id") != null ? map.get("compare_penalty_case_law_id").toString() : "");
                data.setBirbe_money(map.get("birbe_money") != null ? new Double(map.get("birbe_money").toString()) : 0d);
                data.setReward_money(map.get("reward_money") != null ? new Double(map.get("reward_money").toString()) : 0d);
                data.setTreasury_money(map.get("treasury_money") != null ? new Double(map.get("treasury_money").toString()) : 0d);
                data.setCase_last(map.get("case_last") != null ? map.get("case_last").toString() : "");
                data.setCase_last_date(map.get("case_last_date") != null ? map.get("case_last_date").toString() : "");
                data.setCase_result(map.get("case_result") != null ? map.get("case_result").toString() : "");
                data.setExhibit_report_no(map.get("exhibit_report_no") != null ? map.get("exhibit_report_no").toString() : "");
                data.setTaken_date(map.get("taken_date") != null ? map.get("taken_date").toString() : "");
                data.setProve_staff_name(map.get("prove_staff_name") != null ? map.get("prove_staff_name").toString() : "");
                data.setProve_posname(map.get("prove_posname") != null ? map.get("prove_posname").toString() : "");
                data.setProve_offname(map.get("prove_offname") != null ? map.get("prove_offname").toString() : "");


                //Set GuiltBaseInfo
                String iSql = "";
                iSql += "select aai.id, ic.case_law_id, ic.penalty_case_law_id, ic.guilt_base, ic.exhibit_wild";
                iSql += " from application_arrest_indictment aai";
                iSql += " inner join indictment ic on ic.indictment_id = aai.indictment_id ";
                iSql += " where aai.track_no = '" + map.get("track_no").toString() + "' ";
                iSql += " order by aai.id";
                
                BaseDomain aai = new BaseDomain(db);
                List<Map<String,Object>> iList = aai.findBySql(iSql);
                ArrayList<GuiltBaseInfo> iInfo = new ArrayList();
                for(int j=0;j<iList.size();j++){
                    GuiltBaseInfo iData = new GuiltBaseInfo();
                    Map<String,Object> iMap = iList.get(j);
                    iData.setCase_law_id(iMap.get("case_law_id") != null ? iMap.get("case_law_id").toString() : "");
                    iData.setPenalty_case_law_id(iMap.get("penalty_case_law_id") != null ? iMap.get("penalty_case_law_id").toString() : "");
                    iData.setGuilt_base(iMap.get("guilt_base") != null ? iMap.get("guilt_base").toString() : "");
                    iData.setExhibit_wild(iMap.get("exhibit_wild") != null ? iMap.get("exhibit_wild").toString() : "");

                    iInfo.add(iData);
                }
                data.setGuilt_base_info(iInfo);


                //Set ExhibitListInfo
                String eSql = "select aae.id, aae.duty_code, dt.duty_name, aae.product_code, nvl(dg.group_name,nvl(dt.duty_name,aae.product_name)) product_name, ";
                eSql += " aae.brand_code, nvl(bm.brand_main_thai,nvl(bm.brand_main_eng,aae.brand_name)) brand_name ,aae.isdomestic, ";
                eSql += " aae.sizes_code, aae.sizes_desc, aae.size_unit_code, nvl(aae.sizes_unit_name,nvl(su.thname,aae.sizes_unit_name)) sizes_unit_name, ";
                eSql += " aae.qty, aae.qty_unit_code unit_code, nvl(qu.thname, aae.qty_unit_name) unit_name, ";
                eSql += " aae.netweight, aae.netweight_unit_code,nvl(wu.thname,aae.netweight_unit_name) netweight_unit_name, aae.status, aae.exhibit_list, aae.exhibit_desc, ";
                eSql += " aae.car_no, aae.remarks ";
                eSql += " from application_arrest_exhibit aae ";
                eSql += " left join duty_group dg on dg.group_id=aae.group_id ";
                eSql += " left join duty_table dt on dt.duty_code=aae.duty_code ";
                eSql += " left join brand_main bm on bm.brand_main_code=aae.brand_code and bm.group_id=aae.group_id ";
                eSql += " left join unit su on su.unit_code=aae.size_unit_code ";
                eSql += " left join unit qu on qu.unit_code=aae.qty_unit_code ";
                eSql += " left join unit wu on wu.unit_code=aae.netweight_unit_code ";
                eSql += " where aae.track_no = '" + map.get("track_no").toString() + "'";
                eSql += " order by aae.id ";
                
                BaseDomain aae = new BaseDomain(db);
                //System.out.println(eSql);
                List<Map<String,Object>> eList = aae.findBySql(eSql);
                ArrayList<ExhibitListInfo> eInfo = new ArrayList();
                for(int j=0;j<eList.size();j++){
                    ExhibitListInfo eData = new ExhibitListInfo();
                    Map<String,Object> eMap = eList.get(j);
                    eData.setDuty_code(eMap.get("duty_code") != null ? eMap.get("duty_code").toString() : "");
                    eData.setDuty_name(eMap.get("duty_name") != null ? eMap.get("duty_name").toString() : "");
                    eData.setProduct_code(eMap.get("product_code") != null ? eMap.get("product_code").toString() : "");
                    eData.setProduct_name(eMap.get("product_name") != null ? eMap.get("product_name").toString() : "");
                    eData.setBrand_code(eMap.get("brand_code") != null ? eMap.get("brand_code").toString() : "");
                    eData.setBrand_name(eMap.get("brand_name") != null ? eMap.get("brand_name").toString() : "");
                    eData.setIsdomestic(eMap.get("isdomestic") != null ? eMap.get("isdomestic").toString() : "");
                    eData.setSizes_code(eMap.get("sizes_code") != null ? eMap.get("sizes_code").toString() : "");
                    eData.setSizes_desc(eMap.get("sizes_desc") != null ? eMap.get("sizes_desc").toString() : "");
                    eData.setSizes_unit_code(eMap.get("sizes_unit_code") != null ? eMap.get("sizes_unit_code").toString() : "");
                    eData.setSizes_unit_name(eMap.get("sizes_unit_name") != null ? eMap.get("sizes_unit_name").toString() : "");
                    eData.setQty(eMap.get("qty") != null ? new Long(eMap.get("qty").toString()) : 0);
                    eData.setUnit_code(eMap.get("unit_code") != null ? eMap.get("unit_code").toString() : "");
                    eData.setUnit_name(eMap.get("unit_name") != null ? eMap.get("unit_name").toString() : "");
                    eData.setNetweight(eMap.get("netweight") != null ? new Double(eMap.get("netweight").toString()) : 0);
                    eData.setNetweight_unit_code(eMap.get("netweight_unit_code") != null ? eMap.get("netweight_unit_code").toString() : "");
                    eData.setNetweight_unit_name(eMap.get("netweight_unit_name") != null ? eMap.get("netweight_unit_name").toString() : "");
                    eData.setStatus(eMap.get("status") != null ? eMap.get("status").toString() : "");
                    eData.setExhibit_list(eMap.get("exhibit_list") != null ? eMap.get("exhibit_list").toString() : "");
                    eData.setExhibit_desc(eMap.get("exhibit_desc") != null ? eMap.get("exhibit_desc").toString() : "");
                    eData.setCar_no(eMap.get("car_no") != null ? eMap.get("car_no").toString() : "");
                    eData.setRemarks(eMap.get("remarks") != null ? eMap.get("remarks").toString() : "");

                    eInfo.add(eData);
                }
                data.setExhibit_list_info(eInfo);

                ret.add(data);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return ret;
    }

    private boolean validateHeader(RequestHeader reqHeader) throws Exception {
        boolean ret = true;

        if(reqHeader.getAppID() == null || reqHeader.getAppID().trim().equals("")){
            _err = "กรุณาระบุ Application ID";
            ret = false;
        }else if(reqHeader.getIP_address() == null || reqHeader.getIP_address().trim().equals("")){
            _err = "กรุณาระบุหมายเลข IP";
            ret = false;
        }else if(reqHeader.getIdcard_no() == null || reqHeader.getIdcard_no().trim().equals("")){
            _err = "กรุณาระบุเลขบัตรประชาชนของเจ้าหน้าที่";
            ret = false;
        }else if (chkIDCardno(reqHeader.getIdcard_no())==false){
            ret = false;
        }else if(reqHeader.getLawbreaker_idcard_no() == null || reqHeader.getLawbreaker_idcard_no().trim().equals("")){
            _err = "กรุณาระบุเลขบัตรประชาชนของผู้กระทำผิด";
            ret = false;
        }else if(reqHeader.getRestrospect_year() < 0){
            _err = "กรุณาระบุจำนวนปีย้อนหลังที่ต้องการแสดงข้อมูล";
            ret = false;
        }

        return ret;
    }

    private boolean chkIDCardno(String idcard_no) throws Exception{
        boolean ret = false;
        try{
                String sql = "select id from staff where idcard_no='" + idcard_no + "'";
                //System.out.println(sql);
                BaseDomain aa = new BaseDomain(db);
                List<Map<String,Object>> sList = aa.findBySql(sql);

            if(sList != null && sList.size()>0)
                ret = true;
            else
                _err = "ไม่พบข้อมูลเจ้าหน้าที่";
                
        }catch(Exception e){
            ret = false;
            _err = e.getMessage();
        }
        return ret;
    }

    private boolean isValidData(String lawbreaker_idcard_no, long restrospect_year) throws Exception{
        boolean ret = false;
        try{
            BaseDomain aa = new BaseDomain(db);
            String sql = "select aal.id ";
            sql += " from application_arrest_lawbreaker aal ";
            sql += " inner join book_impeachment bi on bi.track_no=aal.track_no";
            sql += " where upper(trim(aal.lawbreaker_id_card)) = '" + lawbreaker_idcard_no + "' ";
            sql += " and to_char(bi.case_date,'yyyy') >= (to_char(sysdate,'yyyy') - " + restrospect_year + ")";
//System.out.println(sql);
            List<Map<String,Object>> lList = aa.findBySql(sql);
            if(lList.size()>0)
                ret = true;
            
        }catch(Exception e){
            e.printStackTrace();
        }

        return ret;
    }


    

    
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String args[]) throws Exception {
//            IDCardnoCaseService cs = new IDCardnoCaseService();
//            ArrayList<IDCardnoCase> lList = cs.setIDCardnoCase("3620400686332",1);
//
//            for(int i=0;i<lList.size();i++){
//                System.out.println(lList.get(i).getTrack_no().toString());
//                System.out.println(lList.get(i).getTitle_code().toString());
//                System.out.println(lList.get(i).getTitle_name().toString());
//                System.out.println(lList.get(i).getFirst_name().toString());
//                System.out.println(lList.get(i).getLast_name().toString());
//                System.out.println(lList.get(i).getOther_name().toString());
//                System.out.println(lList.get(i).getSex().toString());
//                System.out.println(lList.get(i).getAccuser_name().toString());
//                System.out.println(lList.get(i).getAccuser_posname().toString());
//                System.out.println(lList.get(i).getAccuser_offname().toString());
//                System.out.println(lList.get(i).getCase_total_fine());
//
//                for (int j=0;j<lList.get(i).getGuilt_base_info().size();j++){
//                    System.out.println("CaseLawID: " + lList.get(i).getGuilt_base_info().get(j).getCase_law_id());
//                    System.out.println("PenaltyCaseLawID: " + lList.get(i).getGuilt_base_info().get(j).getPenalty_case_law_id());
//                    System.out.println("GuiltBase: " + lList.get(i).getGuilt_base_info().get(j).getGuilt_base());
//                    System.out.println("ExhibitWild: " + lList.get(i).getGuilt_base_info().get(j).getExhibit_wild());
//                }
//
//                for(int j=0;j<lList.get(i).getExhibit_list_info().size();j++){
//                    System.out.println("DutyCode : " + lList.get(i).getExhibit_list_info().get(j).getDuty_code());
//                    System.out.println("DutyName : " + lList.get(i).getExhibit_list_info().get(j).getDuty_name());
//                    System.out.println("ProductCode : " + lList.get(i).getExhibit_list_info().get(j).getProduct_code());
//                    System.out.println("ProductName : " + lList.get(i).getExhibit_list_info().get(j).getProduct_name());
//                    System.out.println("Qty : " + lList.get(i).getExhibit_list_info().get(j).getQty());
//                    System.out.println("UnitCode : " + lList.get(i).getExhibit_list_info().get(j).getUnit_code());
//                    System.out.println("UnitName : " + lList.get(i).getExhibit_list_info().get(j).getUnit_name());
//                }
//            }
//	}
}
