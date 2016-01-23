/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.webapp.action;

import com.ko.domain.*;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.sql.rowset.serial.SerialBlob;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class SuspectInvestigateAction extends BaseAction {
    @Override
    public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
    }

//    private void bindFromCmd(SuspectInvestigationCmd cmd, SuspectInvestigate si) {
//        si.setId(cmd.getLong(cmd.getId()));
//        si.setCase_type(cmd.getCase_type());
//        si.setCurrent_address_name(cmd.getCurrent_address_name());
//        si.setCurrent_coordinate_x((cmd.getCurrent_coordinate_x() != null ? new Double(cmd.getCurrent_coordinate_x()) : null));
//        si.setCurrent_address_no(cmd.getCurrent_address_no());
//        si.setCurrent_coordinate_y((cmd.getCurrent_coordinate_y() != null ? new Double(cmd.getCurrent_coordinate_y()) : null));
//        si.setCurrent_district_code(cmd.getCurrent_district_code());
//        si.setCurrent_moo(cmd.getLong(cmd.getCurrent_moo()));
//        si.setCurrent_province_code(cmd.getCurrent_province_code());
//        si.setCurrent_road(cmd.getCurrent_road());
//        si.setCurrent_soi(cmd.getCurrent_soi());
//        si.setCurrent_subdistrict_code(cmd.getCurrent_subdistrict_code());
//        si.setCurrent_tel(cmd.getCurrent_tel());
//        si.setCurrent_zipcode(cmd.getCurrent_zipcode());
//        si.setSuspect_address_name(cmd.getSuspect_address_name());
//        si.setSuspect_coordinate_x(new Double(cmd.getSuspect_coordinate_x()));
//        si.setSuspect_address_no(cmd.getSuspect_address_no());
//        si.setSuspect_coordinate_y(new Double(cmd.getSuspect_coordinate_y()));
//        si.setSuspect_district_code(cmd.getSuspect_district_code());
//        si.setSuspect_moo(cmd.getLong(cmd.getSuspect_moo()));
//        si.setSuspect_province_code(cmd.getSuspect_province_code());
//        si.setSuspect_road(cmd.getSuspect_road());
//        si.setSuspect_soi(cmd.getSuspect_soi());
//        si.setSuspect_subdistrict_code(cmd.getSuspect_subdistrict_code());
//        si.setSuspect_tel(cmd.getSuspect_tel());
//        si.setSuspect_zipcode(cmd.getSuspect_zipcode());
//        si.setSuspect_map(cmd.getSuspect_map());
//        si.setSuspect_map_desc(cmd.getSuspect_map_desc());
//        //si.setDoc_date(cmd.getDate(cmd.getDoc_date()));
//        si.setInvestigate_no(cmd.getInvestigate_no());
//        si.setStaff_investigate(cmd.getStaff_investigate());
//        si.setStaff_command(cmd.getStaff_command());
//        si.setStaff_info(cmd.getStaff_info());
//        si.setStaff_info_mobile(cmd.getStaff_info_mobile());
//        si.setStaff_order_save(cmd.getStaff_order_save());
//        si.setStaff_report_to(cmd.getStaff_report_to());
//        si.setStart_date(cmd.getDateAndTime(cmd.getStart_date(), cmd.getStart_time()));
//        si.setEnd_date(cmd.getDateAndTime(cmd.getEnd_date(), cmd.getEnd_time()));
//        si.setLegislation_id(cmd.getLong(cmd.getLegislation_id()));
//        si.setSuspect_no(cmd.getLong(cmd.getSuspect_no()));
//        si.setSuspect_behavior(cmd.getSuspect_behavior());
//        si.setRemarks(cmd.getRemarks());
//        si.setInvestigate_present(cmd.getInvestigate_present());
//        si.setPoscode_command(cmd.getPoscode_command());
//        si.setPoscode_info(cmd.getPoscode_info());
//        si.setPoscode_investigate(cmd.getPoscode_investigate());
//        si.setPoscode_order_save(cmd.getPoscode_order_save());
//        si.setPoscode_report_to(cmd.getPoscode_report_to());
//        si.setTrack_no(cmd.getTrack_no());
//    }

    public boolean ChkDupSuspectInvestigateNo(String vOffcode, String vInvestigateNo, String vStaffIDCard, String vTrackNo) throws Exception{
		boolean ret = false;
		SuspectInvestigate si = new SuspectInvestigate(db);
		String sql = "select id from suspect_investigate ";
		sql += " where investigate_no = '" + vInvestigateNo + "'";
		sql += " and offcode = '" + vOffcode + "' ";
		sql += " and staff_investigate = '" + vStaffIDCard + "'";
		sql += " and nvl(track_no,'0') <> nvl('" + (vTrackNo.equals("") ? "0" : vTrackNo) + "', track_no) ";
		log.debug(sql);
		List<Map<String,Object>> siList = si.findBySql(sql);
		if (siList.size()>0)
			ret = true;
		
		System.out.println(ret);
		
		return ret;
	}
    
    private void setSiValue(HttpServletRequest request, HttpServletResponse response, SuspectInvestigate si) throws Exception {
    	si.setInvestigate_no(request.getParameter("investigate_no"));
    	si.setStaff_investigate(request.getParameter("staff_investigate"));

    	String vStartDate = (request.getParameter("start_date") != null ? request.getParameter("start_date") : null) + (request.getParameter("start_time") != null ? " " + request.getParameter("start_time") : "");
    	String vEndDate = (request.getParameter("end_date") != null ? request.getParameter("end_date") : "") + (request.getParameter("end_time") != null ? " " + request.getParameter("end_time") : "");
    	si.setStart_date(DateUtil.getDateFromString(vStartDate));
    	si.setEnd_date(DateUtil.getDateFromString(vEndDate));
//        	
    	si.setStaff_command(request.getParameter("staff_command"));
    	si.setStaff_order_save((request.getParameter("staff_order_save")!=null ? request.getParameter("staff_order_save") : ""));
    	si.setStaff_report_to((request.getParameter("staff_report_to")!=null ? request.getParameter("staff_report_to") : ""));
    	si.setStaff_info((request.getParameter("staff_info")!=null ? request.getParameter("staff_info") : ""));
    	si.setStaff_info_mobile((request.getParameter("staff_info_mobile")!=null ? request.getParameter("staff_info_mobile") : ""));
//        	
    	si.setPoscode_investigate((request.getParameter("poscode_investigate")!=null ? request.getParameter("poscode_investigate") : ""));
    	si.setPoscode_command((request.getParameter("poscode_command")!=null ? request.getParameter("poscode_command") : ""));
    	si.setPoscode_order_save((request.getParameter("poscode_order_save")!=null ? request.getParameter("poscode_order_save") : ""));
    	si.setPoscode_report_to((request.getParameter("poscode_report_to")!=null ? request.getParameter("poscode_report_to") : ""));
    	si.setPoscode_info((request.getParameter("poscode_info")!=null ? request.getParameter("poscode_info") : ""));
//        	
    	si.setLegislation_id(new Long(request.getParameter("legislation_id").toString()));
    	si.setCase_type(request.getParameter("case_type"));
    	si.setCurrent_address_name(request.getParameter("current_address_name"));
    	si.setCurrent_address_no(request.getParameter("current_address_no"));
    	si.setCurrent_moo((!request.getParameter("current_moo").equals("") ? new Long(request.getParameter("current_moo").toString()) : null));
    	si.setCurrent_soi(request.getParameter("current_soi"));
    	si.setCurrent_road(request.getParameter("current_road"));
    	si.setCurrent_subdistrict_code(request.getParameter("current_subdistrict_code"));
    	si.setCurrent_district_code(request.getParameter("current_district_code"));
    	si.setCurrent_province_code(request.getParameter("current_province_code"));
    	si.setCurrent_zipcode(request.getParameter("current_zipcode"));
    	si.setCurrent_tel(request.getParameter("current_tel"));
    	si.setCurrent_coordinate_x((!request.getParameter("current_coordinate_x").equals("") ? new Double(request.getParameter("current_coordinate_x").toString()) : null));
    	si.setCurrent_coordinate_y((!request.getParameter("current_coordinate_y").equals("") ? new Double(request.getParameter("current_coordinate_y").toString()) : null));
//        	
    	si.setSuspect_address_name(request.getParameter("suspect_address_name"));
    	si.setSuspect_address_no(request.getParameter("suspect_address_no"));
    	si.setSuspect_moo((!request.getParameter("suspect_moo").equals("") ? new Long(request.getParameter("suspect_moo").toString()) : null));
    	si.setSuspect_soi(request.getParameter("suspect_soi"));
    	si.setSuspect_road(request.getParameter("suspect_road"));
    	si.setSuspect_subdistrict_code(request.getParameter("suspect_subdistrict_code"));
    	si.setSuspect_district_code(request.getParameter("suspect_district_code"));
    	si.setSuspect_province_code(request.getParameter("suspect_province_code"));
    	si.setSuspect_zipcode(request.getParameter("suspect_zipcode"));
    	si.setSuspect_tel(request.getParameter("suspect_tel"));
    	si.setSuspect_coordinate_x((!request.getParameter("suspect_coordinate_x").equals("") ? new Double(request.getParameter("suspect_coordinate_x").toString()) : null));
    	si.setSuspect_coordinate_y((!request.getParameter("suspect_coordinate_y").equals("") ? new Double(request.getParameter("suspect_coordinate_y").toString()) : null));
    	
    	si.setSuspect_behavior(request.getParameter("suspect_behavior"));
    	si.setInvestigate_detail(request.getParameter("investigate_detail"));
    	si.setRemarks(request.getParameter("remarks"));
    	si.setInvestigate_present(request.getParameter("investigate_present"));
    	si.setSuspect_map_desc(request.getParameter("suspect_map_desc"));
    }   
    
    public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
        SuspectInvestigationCmd siCmd = new SuspectInvestigationCmd();
        //bindForm(siCmd);
        String id = request.getParameter("id");
        SuspectInvestigate si = new SuspectInvestigate(db);

        String vSuspectInvestigateNo = request.getParameter("investigate_no");
        String vStaffInvestigate = request.getParameter("staff_investigate");
        String vTrackNo = request.getParameter("track_no");
        if(ChkDupSuspectInvestigateNo(uData.getOffcode(),vSuspectInvestigateNo,vStaffInvestigate, vTrackNo)==false){
        	//ถ้าไม่ซ้ำ
        	if(id != null && !id.equals("")){
        		//Update
        		si = si.findByPk(new Long(id));
        		si.setUpdate_by(update_by);
	            si.setUpdate_on(update_on);
	            setSiValue(request,response,si);
	            si = si.update();
        	}else{
        		//Insert
        		si.setSuspect_no(new Long(request.getParameter("suspect_no").toString()));
	        	si.setDoc_date(create_on);
	        	si.setOffcode(uData.getOffcode());
	        	si.setCreate_by(create_by);
	            si.setCreate_on(create_on);
	            setSiValue(request,response,si);
	            si.setTrack_no(new RunningKey(db).getRunningKey("SUSPECT_INVESTIGATE", "", "", uData.getOffcode()));
	            si = si.create();
        	}	
        	
        	if (si != null) {        	
            	updateSuspectIndictment(request,si.getId());
            	updateSuspectInvestigateTeam(request, si.getId());
            	updateSuspectVehicle(request,si.getId());
            }
            setInvestigateDetail(request,new Long(si.getSuspect_no()),new Long(si.getId()));
            request.setAttribute("altMsg", "บันทึกข้อมูลเรียบร้อย");
        }else{
        	//ถ้าข้อมูลซ้ำ
        	Suspect suspect = new Suspect(db);
        	request.setAttribute("suspect", suspect.findByPk(new Long(request.getParameter("suspect_id"))));
        	if(id != null && !id.equals("")){
        		si = si.findByPk(new Long(id));
        	}
        	setSiValue(request,response,si);
        	request.setAttribute("si", si);
        	updateSuspectInvestigateTeam(request, 0L);
        	updateSuspectIndictment(request,0L);
        	updateSuspectVehicle(request,0L);
        	request.setAttribute("altMsg", "เลขที่งานสืบสวนซ้ำ");
        }
        
        Legislation lg = new Legislation(db);
        List<Legislation> listLg = lg.findAll();
        request.setAttribute("legislations", listLg);
        
        forward("?page=/Suspect/suspect_investigate_add.jsp");
        	
//	        if(id != null && !id.equals("")){
//	            // update
//	            si = si.findByPk(new Long(id));
//	        	
//	            si.setUpdate_by(update_by);
//	            si.setUpdate_on(update_on);
//	
//	            si = si.update();
//	        } else {
//	            // create
//	        	si.setSuspect_no(new Long(request.getParameter("suspect_no").toString()));
//	        	si.setTrack_no(new RunningKey(db).getRunningKey("SUSPECT_INVESTIGATE", "", "", uData.getOffcode()));
//	        	si.setInvestigate_no(request.getParameter("investigate_no"));
//	        	si.setDoc_date(create_on);
//	        	si.setOffcode(uData.getOffcode());
//	        	si.setStaff_investigate(request.getParameter("staff_investigate"));
//	
//	        	String vStartDate = (request.getParameter("start_date") != null ? request.getParameter("start_date") : null) + (request.getParameter("start_time") != null ? " " + request.getParameter("start_time") : "");
//	        	String vEndDate = (request.getParameter("end_date") != null ? request.getParameter("end_date") : "") + (request.getParameter("end_time") != null ? " " + request.getParameter("end_time") : "");
//	        	si.setStart_date(DateUtil.getDateFromString(vStartDate));
//	        	si.setEnd_date(DateUtil.getDateFromString(vEndDate));
//	//        	
//	        	si.setStaff_command(request.getParameter("staff_command"));
//	        	si.setStaff_order_save((request.getParameter("staff_order_save")!=null ? request.getParameter("staff_order_save") : ""));
//	        	si.setStaff_report_to((request.getParameter("staff_report_to")!=null ? request.getParameter("staff_report_to") : ""));
//	        	si.setStaff_info((request.getParameter("staff_info")!=null ? request.getParameter("staff_info") : ""));
//	        	si.setStaff_info_mobile((request.getParameter("staff_info_mobile")!=null ? request.getParameter("staff_info_mobile") : ""));
//	//        	
//	        	si.setPoscode_investigate((request.getParameter("poscode_investigate")!=null ? request.getParameter("poscode_investigate") : ""));
//	        	si.setPoscode_command((request.getParameter("poscode_command")!=null ? request.getParameter("poscode_command") : ""));
//	        	si.setPoscode_order_save((request.getParameter("poscode_order_save")!=null ? request.getParameter("poscode_order_save") : ""));
//	        	si.setPoscode_report_to((request.getParameter("poscode_report_to")!=null ? request.getParameter("poscode_report_to") : ""));
//	        	si.setPoscode_info((request.getParameter("poscode_info")!=null ? request.getParameter("poscode_info") : ""));
//	//        	
//	        	si.setLegislation_id(new Long(request.getParameter("legislation_id").toString()));
//	        	si.setCase_type(request.getParameter("case_type"));
//	        	si.setCurrent_address_name(request.getParameter("current_address_name"));
//	        	si.setCurrent_address_no(request.getParameter("current_address_no"));
//	        	si.setCurrent_moo((!request.getParameter("current_moo").equals("") ? new Long(request.getParameter("current_moo").toString()) : null));
//	        	si.setCurrent_soi(request.getParameter("current_soi"));
//	        	si.setCurrent_road(request.getParameter("current_road"));
//	        	si.setCurrent_subdistrict_code(request.getParameter("current_subdistrict_code"));
//	        	si.setCurrent_district_code(request.getParameter("current_district_code"));
//	        	si.setCurrent_province_code(request.getParameter("current_province_code"));
//	        	si.setCurrent_zipcode(request.getParameter("current_zipcode"));
//	        	si.setCurrent_tel(request.getParameter("current_tel"));
//	        	si.setCurrent_coordinate_x((!request.getParameter("current_coordinate_x").equals("") ? new Double(request.getParameter("current_coordinate_x").toString()) : null));
//	        	si.setCurrent_coordinate_y((!request.getParameter("current_coordinate_y").equals("") ? new Double(request.getParameter("current_coordinate_y").toString()) : null));
//	//        	
//	        	si.setSuspect_address_name(request.getParameter("suspect_address_name"));
//	        	si.setSuspect_address_no(request.getParameter("suspect_address_no"));
//	        	si.setSuspect_moo((!request.getParameter("suspect_moo").equals("") ? new Long(request.getParameter("suspect_moo").toString()) : null));
//	        	si.setSuspect_soi(request.getParameter("suspect_soi"));
//	        	si.setSuspect_road(request.getParameter("suspect_road"));
//	        	si.setSuspect_subdistrict_code(request.getParameter("suspect_subdistrict_code"));
//	        	si.setSuspect_district_code(request.getParameter("suspect_district_code"));
//	        	si.setSuspect_province_code(request.getParameter("suspect_province_code"));
//	        	si.setSuspect_zipcode(request.getParameter("suspect_zipcode"));
//	        	si.setSuspect_tel(request.getParameter("suspect_tel"));
//	        	si.setSuspect_coordinate_x((!request.getParameter("suspect_coordinate_x").equals("") ? new Double(request.getParameter("suspect_coordinate_x").toString()) : null));
//	        	si.setSuspect_coordinate_y((!request.getParameter("suspect_coordinate_y").equals("") ? new Double(request.getParameter("suspect_coordinate_y").toString()) : null));
//	        	
//	        	si.setSuspect_behavior(request.getParameter("suspect_behavior"));
//	        	si.setInvestigate_detail(request.getParameter("investigate_detail"));
//	        	si.setRemarks(request.getParameter("remarks"));
//	        	si.setInvestigate_present(request.getParameter("investigate_present"));
//	//        	
//	            si.setCreate_by(create_by);
//	            si.setCreate_on(create_on);
//	
//	            si = si.create();
//	        }
        //}
        
        
    }

//    private void updateSuspectVehicle(SuspectInvestigationCmd siCmd, Long siId) throws Exception {
//        if (siCmd.getCar_id() == null) {
//            SuspectVehicle sv = new SuspectVehicle(db);
//            List<SuspectVehicle> listSv = sv.findByWhere(SuspectVehicle.SUSPECT_INVESTIGATE_IDCol + "=?", siId);
//            for (SuspectVehicle susV : listSv) {
//                susV.delete();
//            }
//            return;
//        }
//        SuspectVehicle sv = new SuspectVehicle(db);
//        List<SuspectVehicle> listSv = sv.findByWhere(SuspectVehicle.SUSPECT_INVESTIGATE_IDCol + "=?", siId);
//        for (int i = 0; i < siCmd.getCar_id().length; i++) {
//            Long car_id = isPkValid(siCmd.getCar_id()[i]);
//            SuspectVehicle sv1 = new SuspectVehicle(db);
//            String[] brand_code = siCmd.getCar_product_duty_type_code()[i].split(",");
//            sv1.setBrand_brand_code(brand_code[0]);
//            sv1.setBrand_duty_code(brand_code[1]);
//            sv1.setCar_cate(siCmd.getCar_cate()[i]);
//            sv1.setCar_color(siCmd.getCar_color()[i]);
//            sv1.setCar_model(siCmd.getCar_model()[i]);
//            sv1.setCar_no(siCmd.getCar_no()[i]);
//            sv1.setDescription(siCmd.getCar_description()[i]);
//            String[] type_code = siCmd.getCar_product_duty_type_code()[i].split(",");
//            sv1.setProducttype_duty_code(type_code[1]);
//            sv1.setProducttype_type_code(type_code[0]);
//            sv1.setProvince_code(siCmd.getCar_province_code()[i]);
//            sv1.setSuspect_investigate_id(siId);
//            sv1.setUpdate_by(update_by);
//            sv1.setUpdate_on(update_on);
//            if (car_id > 0) {
//                for (SuspectVehicle susV : listSv) {
//                    if (susV.getId().longValue() == car_id.longValue()) {
//                        sv1.setCreate_by(susV.getCreate_by());
//                        sv1.setCreate_on(susV.getCreate_on());
//                        sv1.update();
//                        listSv.remove(susV);
//                        break;
//                    }
//                }
//            } else {
//                sv1.setCreate_by(create_by);
//                sv1.setCreate_on(create_on);
//                sv1.create();
//            }
//        }
//        for (SuspectVehicle susV : listSv) {
//            susV.delete();
//        }
//    }

    private Long isPkValid(String pk) {
        if (pk != null) {
            try {
                return Long.valueOf(pk);
            } catch (Exception e) {

            }
        }
        return -1l;
    }


//    private void updateSuspectInvestigateTeam(SuspectInvestigationCmd siCmd, Long siId) throws Exception {
//        if (siCmd.getInvestigate_team_idcardno() == null) {
//            // means delete all.
//            SuspectInvestigateTeam sit = new SuspectInvestigateTeam(db);
//            List<SuspectInvestigateTeam> listSit = sit.findByWhere(SuspectInvestigateTeam.SUSPECT_INVESTIGATE_IDCol + "=?", siId);
//            for (SuspectInvestigateTeam siii : listSit) {
//                siii.delete();
//            }
//            return;
//        }
//        SuspectInvestigateTeam sit = new SuspectInvestigateTeam(db);
//        List<SuspectInvestigateTeam> listSit = sit.findByWhere(SuspectInvestigateTeam.SUSPECT_INVESTIGATE_IDCol + "=?", siId);
//        for (int i = 0; i < siCmd.getInvestigate_team_idcardno().length; i++) {
//            boolean isUpdate = false;
//            String iii = siCmd.getInvestigate_team_idcardno()[i];
//            for (SuspectInvestigateTeam siii : listSit) {
//                if (Long.valueOf(siii.getIdcard_no()).longValue() == Long.valueOf(iii).longValue()) {
//                    siii.setUpdate_by(update_by);
//                    siii.setUpdate_on(update_on);
//                    siii.update();
//                    listSit.remove(siii);
//                    isUpdate = true;
//                    break;
//                }
//            }
//            if (isUpdate) continue;
//            SuspectInvestigateTeam cs = new SuspectInvestigateTeam(db);
//            cs.setUpdate_by(update_by);
//            cs.setUpdate_on(update_on);
//            cs.setCreate_by(create_by);
//            cs.setCreate_on(create_on);
//            cs.setIdcard_no(iii);
//            cs.setOffcode(siCmd.getInvestigate_team_offcode()[i]);
//            cs.setPoscode(siCmd.getInvestigate_team_poscode()[i]);
//            cs.setSuspect_investigate_id(siId);
//            cs.create();
//        }
//        for (SuspectInvestigateTeam siii : listSit) {
//            siii.delete();
//        }
//    }

    private void updateSuspectVehicle(HttpServletRequest request, Long siID) throws Exception{
    	SuspectVehicle sv = new SuspectVehicle(db);
    	sv.deleteByWhere(" suspect_investigate_id = ? ", siID);
    	
    	String[] car_province_code = request.getParameterValues("car_province_code");
    	String[] car_duty_code = request.getParameterValues("car_duty_code");
    	String[] car_cate = request.getParameterValues("car_cate");
    	String[] car_no = request.getParameterValues("car_no");
    	String[] car_brand_brand_duty_code = request.getParameterValues("car_brand_brand_duty_code");
    	String[] car_model = request.getParameterValues("car_model");
    	String[] car_color = request.getParameterValues("car_color");
    	String[] car_description = request.getParameterValues("car_description");
    	
    	if(siID != 0L){
	    	if(car_no != null){
	    		for (int i=0;i<car_no.length;i++){
	    			sv.setProvince_code(car_province_code[i]);
	    			
	    			//String[] type_code = car_product_duty_type_code[i].split(",");
			        sv.setDuty_code(car_duty_code[i]);
			        //sv.setProducttype_type_code(type_code[0]);
			        
			        sv.setCar_cate(car_cate[i]);
			        sv.setCar_no(car_no[i]);
			        
	    			String[] brand_code = car_brand_brand_duty_code[i].split(",");
			        sv.setBrand_brand_code(brand_code[0]);
			        sv.setBrand_duty_code(brand_code[1]);
			        
			        sv.setCar_color(car_color[i]);
			        sv.setCar_model(car_model[i]);
			        sv.setDescription(car_description[i]);
			        sv.setSuspect_investigate_id(siID);
			        sv.setCreate_by(create_by);
			        sv.setCreate_on(create_on);
			        
			        sv = sv.create();
	    		}
	    	}
    	}else{
    		if(car_no != null){
    			List<Map<String,Object>> listSv = new ArrayList();
	    		for (int i=0;i<car_no.length;i++){
	    			Map<String, Object> data = new HashMap<String, Object>();
	    			data.put("car_province_code", car_province_code[i]);
	    			data.put("car_duty_code", car_duty_code[i]);
	    			data.put("car_cate", car_cate[i]);
	    			data.put("car_no", car_no[i]);
	    			data.put("car_brand_brand_duty_code", car_brand_brand_duty_code[i]);
	    			data.put("car_model", car_model[i]);
	    			data.put("car_color",car_color[i]);
	    			data.put("car_description",car_description[i]);
	    			
	    			Province pv = new Province(db);
	    			data.put("car_province_text",pv.findByWhere("province_code = ?", car_province_code[i]).get(0));
	    			
	    			//BrandMain bm = new BrandMain(db);
	    			//String[] brand_code = car_brand_brand_duty_code[i].split(",");
	    			//String bSql = "select nvl(brand_main_thai,brand_main_eng) brand_text from brand_main where brain_main_code = '" + brand_code[0] + "' and duty_code = '" + brand_code[1] + "'";
	    			//data.put("car_brand_text", bm.findBySql(bSql).get(0));
	    			
	    			//ProductType pt = new ProductType(db);
	    			//String[] type_code = car_duty_code[i].split(",");
	    			//String ptSql = "select type_name from product_type where duty_code = '" + type_code[1] + "' and type_code = '" + type_code[0] + "'";
	    			//data.put("car_product_type_text", pt.findBySql(ptSql).get(0));
	    			
	    			listSv.add(data);
	    		}
	    		request.setAttribute("listSv", listSv);
	    	}
    	}
    }
    
    private void updateSuspectInvestigateTeam(HttpServletRequest request, Long siID) throws Exception{
    	SuspectInvestigateTeam sit = new SuspectInvestigateTeam(db);
    	sit.deleteByWhere(" suspect_investigate_id = ? ", siID);
    	
    	String[] investigate_team_idcardno = request.getParameterValues("investigate_team_idcardno");
    	String[] investigate_team_poscode = request.getParameterValues("investigate_team_poscode");
    	String[] investigate_team_offcode = request.getParameterValues("investigate_team_offcode");
    	if(siID != 0L){
	    	if(investigate_team_idcardno != null){
	    		for(int i=0;i<investigate_team_idcardno.length;i++){
	    			sit.setCreate_by(create_by);
	    			sit.setCreate_on(create_on);
	    			sit.setIdcard_no(investigate_team_idcardno[i]);
	    			sit.setOffcode(investigate_team_offcode[i]);
	    			sit.setPoscode(investigate_team_poscode[i]);
	    			sit.setSuspect_investigate_id(siID);
	    			sit = sit.create();
	    		}
	    	}
    	}else{
    		if(investigate_team_idcardno != null){
    			List<Map<String,Object>> listSit = new ArrayList();
    			for(int i=0;i<investigate_team_idcardno.length;i++){
    				Map<String, Object> data = new HashMap<String, Object>();
    				data.put("investigate_team_idcardno", investigate_team_idcardno[i]);
    				data.put("investigate_team_poscode", investigate_team_poscode[i]);
    				data.put("investigate_team_offcode", investigate_team_offcode[i]);
    				
    				String sql = " select st.title_name || st.first_name || ' ' || st.last_name full_name,";
        			sql += " st.posname ";
        			sql += " from V_STAFF_LIST_POPUP st ";
        			//sql += " left join title ti on ti.title_code=st.title_code ";
        			//sql += " left join position ps on trim(ps.poscode)=trim(st.poscode) ";
        			sql += " where st.idcard_no = '" + investigate_team_idcardno[i] + "'";
        			Staff st = new Staff(db);
        			Map<String,Object> stList = st.findBySql(sql).get(0);
        			data.put("full_name", stList.get("full_name"));
        			data.put("posname", stList.get("posname"));
        			listSit.add(data);
    			}
    			request.setAttribute("listSit", listSit);
    		}
    	}
    }
    
    private void updateSuspectIndictment(HttpServletRequest request, Long siID) throws Exception{
    	
    	SuspectInvestigateIndictment sii = new SuspectInvestigateIndictment(db);
    	sii.deleteByWhere(" suspect_investigate_id = ?", siID);
    	
    	String[] idcID = request.getParameterValues("indictment_indictment_id");
    	if(siID != 0L){
	    	if(idcID != null){
	    		for(int i=0;i<idcID.length;i++){
		    		sii.setCreate_by(create_by);
		    		sii.setCreate_on(create_on);
		    		sii.setIndictment_id(Long.valueOf(idcID[i]));
		    		sii.setSuspect_investigate_id(siID);
		    		sii = sii.create();
	    		}
	    	}
    	}else{
    		if(idcID != null){
    			Indictment idc = new Indictment(db);
    			List<Map<String,Object>> listSii = new ArrayList();
    			for(int i=0;i<idcID.length;i++){
    				Map<String, Object> data = new HashMap<String, Object>();
    				data.put("indictment_id",idcID[i]);
    				data.put("guilt_base", idc.findByPk(new Long(idcID[i])).getGuilt_base());
    				listSii.add(data);
    			}
    			request.setAttribute("listSii", listSii);
    		}
    	}
    }
    
//    private void updateSuspectIndictment(SuspectInvestigationCmd siCmd, Long siId) throws Exception {
//        // make indictment
//    	
//        if (siCmd.getIndictment_indictment_id() == null) {
//            // means delete all
//            SuspectInvestigateIndictment sii = new SuspectInvestigateIndictment(db);
//            List<SuspectInvestigateIndictment> listSii = sii.findByWhere(SuspectInvestigateIndictment.SUSPECT_INVESTIGATE_IDCol + "=?", siId);
//            for (SuspectInvestigateIndictment siii : listSii) {
//                siii.delete();
//            }
//            return;
//        }
//        SuspectInvestigateIndictment sii = new SuspectInvestigateIndictment(db);
//        List<SuspectInvestigateIndictment> listSii = sii.findByWhere(SuspectInvestigateIndictment.SUSPECT_INVESTIGATE_IDCol + "=?", siId);
//        for (String iii : siCmd.getIndictment_indictment_id()) {
//            boolean isUpdate = false;
//            for (SuspectInvestigateIndictment siii : listSii) {
//                if (siii.getIndictment_id().longValue() == Long.valueOf(iii)) {
//                    siii.setUpdate_by(update_by);
//                    siii.setUpdate_on(update_on);
//                    siii.update();
//                    listSii.remove(siii);
//                    isUpdate = true;
//                    break;
//                }
//            }
//            if (isUpdate) continue;
//            SuspectInvestigateIndictment cs = new SuspectInvestigateIndictment(db);
//            cs.setUpdate_by(update_by);
//            cs.setUpdate_on(update_on);
//            cs.setCreate_by(create_by);
//            cs.setCreate_on(create_on);
//            cs.setIndictment_id(Long.valueOf(iii));
//            cs.setSuspect_investigate_id(siId);
//            cs.create();
//        }
//        for (SuspectInvestigateIndictment siii : listSii) {
//            siii.delete();
//        }
//    }

    public void edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Long id = ServletRequestUtils.getLongParameter(request, "id");
        String suspect_no = ServletRequestUtils.getStringParameter(request, "suspect_no");
        Long suspect_investigate_id = ServletRequestUtils.getLongParameter(request, "suspect_investigate_id");
        SuspectInvestigate si = new SuspectInvestigate(db);
        si = si.findByPk(suspect_investigate_id);
        request.setAttribute("si", si);
        String investigate_no = ServletRequestUtils.getStringParameter(request, "investigate_no");
        Suspect suspect = new Suspect(db);
        suspect = suspect.findByPk(id);
        request.setAttribute("suspect", suspect);
        String suspectType = suspect.getSuspect_type();
        if (suspectType != null) {
            if (suspectType.equals("2")) {
                suspectType = "_eng";
            } else if (suspectType.equals("3")) {
                suspectType = "_business";
            } else
                suspectType = "";
        } else
            suspectType = "";
        Legislation lg = new Legislation(db);
        List<Legislation> listLg = lg.findAll();
        request.setAttribute("legislations", listLg);
        request.setAttribute("offcode", suspect.getOffcode());
        request.setAttribute("altMsg", "");
        forward("?page=/Suspect/suspect_investigate_edit" + suspectType + ".jsp");
    }

    public void pictureAdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = ServletRequestUtils.getStringParameter(request, "id");
        String suspect_no = ServletRequestUtils.getStringParameter(request, "suspect_no");
        request.setAttribute("suspect_no", suspect_no);
        if (id != null && Long.valueOf(id) > 0) {
            SuspectPicture sp = new SuspectPicture(db);
            sp = sp.findByPk(Long.valueOf(id));
            request.setAttribute("sp", sp);
        } else {
            SuspectPicture sp = new SuspectPicture(db);
            sp.setCreate_by(create_by);
            sp.setCreate_on(create_on);
            sp.setUpdate_by(update_by);
            sp.setUpdate_on(update_on);
            sp.setSuspect_no(Long.valueOf(suspect_no));
            sp.setPicture_category_id(1l);
            String path = getRealPath("/images/pic_no_image.gif");
            FileInputStream in = new FileInputStream(path);
            byte[] byteArray = IOUtils.toByteArray(in);
            sp.setPicture(new SerialBlob(byteArray));
            sp.create();
            request.setAttribute("sp", sp);
            request.setAttribute("newFlag", true);
        }
        PictureCategory pg = new PictureCategory(db);
        List<PictureCategory> pgList = pg.findAll();
        request.setAttribute("pgs", pgList);
        forward("/Popup/suspect_picture_pop.jsp", request, response);
    }

    public void addSuspectPicture(HttpServletRequest request, HttpServletResponse response) throws Exception {
        SuspectPicture sp = new SuspectPicture(db);
        bindForm(sp);
        if (sp.getId() != null && sp.getId() > 0) {
            SuspectPicture sp1 = sp.findByPk(sp.getId());
            sp.setPicture(sp1.getPicture());
            sp.setCreate_by(sp1.getCreate_by());
            sp.setCreate_on(sp1.getCreate_on());
            sp.setUpdate_by(update_by);
            sp.setUpdate_on(update_on);
            sp.update();
        }
    }

    public void addInvestigate(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Long id = ServletRequestUtils.getLongParameter(request, "id");
        Suspect suspect = new Suspect(db);
        suspect = suspect.findByPk(id);
        request.setAttribute("suspect", suspect);
        String suspectType = suspect.getSuspect_type();
        if (suspectType != null) {
            if (suspectType.equals("2")) {
                suspectType = "_eng";
            } else if (suspectType.equals("3")) {
                suspectType = "_business";
            } else
                suspectType = "";
        } else
            suspectType = "";
        Legislation lg = new Legislation(db);
        List<Legislation> listLg = lg.findAll();
        request.setAttribute("legislations", listLg);
        //forward("?page=/Suspect/suspect_investigate_add" + suspectType + ".jsp");
        request.setAttribute("staff_investigate", uData.getIdCard());
        request.setAttribute("staff_name_investigate", uData.getFullName());
        request.setAttribute("poscode_investigate", uData.getPoscode());
        request.setAttribute("posname_investigate", uData.getPosname());
        request.setAttribute("offcode", uData.getOffcode());
        request.setAttribute("altMsg", "");
        forward("?page=/Suspect/suspect_investigate_add.jsp");
    }

    public void editInvestigate(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Long id = ServletRequestUtils.getLongParameter(request, "id");
        Long suspect_investigate_id = ServletRequestUtils.getLongParameter(request, "siId");
        setInvestigateDetail(request,id,suspect_investigate_id);
        request.setAttribute("altMsg", "");
        
        Legislation lg = new Legislation(db);
        List<Legislation> listLg = lg.findAll();
        request.setAttribute("legislations", listLg);
        
        forward("?page=/Suspect/suspect_investigate_add.jsp");
    }
    
    private void setInvestigateDetail(HttpServletRequest request, Long suspectNo, Long suspect_investigate_id) throws Exception {
    	Suspect suspect = new Suspect(db);
        suspect = suspect.findByWhere(" suspect_no = ? ", suspectNo).get(0);
        request.setAttribute("suspect", suspect);
        SuspectInvestigate si = new SuspectInvestigate(db);
        si = si.findByPk(suspect_investigate_id);
        request.setAttribute("si", si);
        
        String vSql = " select sv.id, sv.province_code, sv.duty_code, sv.car_cate,sv.car_no, ";
		vSql += " sv.brand_duty_code,sv.brand_brand_code,sv.car_model,sv.car_color,sv.description, ";
		vSql += " pv.province_name provincetext, nvl(bm.brand_main_eng,bm.brand_main_thai) brand_text, ";
		vSql += " dt.duty_name car_category_text ";
		vSql += " from suspect_vehicle sv ";
		vSql += " left join province pv on pv.province_code=sv.province_code ";
		vSql += " left join brand_main bm on substr(bm.group_id,1,2)='05' and bm.brand_main_code=sv.brand_brand_code ";
		vSql += " left join duty_table dt on dt.duty_code=sv.duty_code ";
		vSql += " where sv.suspect_investigate_id = '" + si.getId() + "'";
		vSql += " order by sv.id";
        SuspectVehicle sv = new SuspectVehicle(db);
        //List<SuspectVehicle> listSv = sv.findByWhere(SuspectVehicle.SUSPECT_INVESTIGATE_IDCol + "=?", si.getId());
        List<Map<String,Object>> listSv = sv.findBySql(vSql);
        request.setAttribute("listSv", listSv);
        
        String iSql = "select sii.indictment_id, idc.guilt_base ";
        iSql += " from suspect_investigate_indictment sii ";
        iSql += " inner join indictment idc on idc.indictment_id=sii.indictment_id ";
        iSql += " where sii.suspect_investigate_id = '" + si.getId() + "'";
        iSql += " order by sii.id ";
        SuspectInvestigateIndictment sii = new SuspectInvestigateIndictment(db);
        //List<SuspectInvestigateIndictment> listSii = sii.findByWhere(SuspectInvestigateIndictment.SUSPECT_INVESTIGATE_IDCol + "=?", si.getId());
        List<Map<String,Object>> listSii = sii.findBySql(iSql);
        request.setAttribute("listSii", listSii);
        
        String tSql = "select sit.idcard_no, sit.poscode, sit.offcode, ti.title_name || st.first_name || ' ' || st.last_name full_name, ";
		tSql += " ps.posname || ' ' || st.staff_level posname ";
		tSql += " from suspect_investigate_team sit ";
		tSql += " inner join staff st on st.idcard_no=sit.idcard_no ";
		tSql += " left join title ti on ti.title_code=st.title_code ";
		tSql += " left join position ps on ps.poscode=sit.poscode ";
		tSql += " where sit.suspect_investigate_id='" + si.getId() + "'";
		tSql += " order by sit.id ";
        SuspectInvestigateTeam sit = new SuspectInvestigateTeam(db);
        //List<SuspectInvestigateTeam> listSit = sit.findByWhere(SuspectInvestigateTeam.SUSPECT_INVESTIGATE_IDCol + "=?", si.getId());
        List<Map<String,Object>> listSit = sit.findBySql(tSql);
        request.setAttribute("listSit", listSit);
        //String suspectType = suspect.getSuspect_type();

    }
}