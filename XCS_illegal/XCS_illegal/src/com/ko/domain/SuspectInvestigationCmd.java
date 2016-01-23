package com.ko.domain;

import java.sql.Blob;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class SuspectInvestigationCmd {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String[] car_province_code;
    private String[] car_product_duty_type_code;
    private String[] car_cate;
    private String[] car_no;
    private String suspect_no;
    private String suspect_type;
    private String suspect_id;

    public String getSuspect_id() {
        return suspect_id;
    }

    public void setSuspect_id(String suspect_id) {
        this.suspect_id = suspect_id;
    }

    private String[] car_brand_brand_duty_code;
    private String[] car_model;
    private String[] car_color;
    private String[] car_description;
    private String[] car_id;
    private String[] indictment_case_law_id;
    private String[] indictment_law_id;
    private String[] indictment_guilt_base;
    private String[] indictment_exhibit_wild;
    private String[] indictment_indictment_id;
    private String[] investigate_team_idcardno;
    private String[] investigate_team_posname;
    private String[] investigate_team_poscode;
    private String[] investigate_team_offcode;
    private String[] investigate_team_offname;
    private String[] investigate_team_full_name;
    private String investigate_no;
    private String doc_date;
    private String staff_investigate;
    private String staff_order_save;
    private String staff_report_to;
    private String staff_command;
    private String staff_info;
    private String poscode_investigate;
    private String poscode_order_save;
    private String poscode_report_to;
    private String poscode_command;
    private String poscode_info;
    private String staff_info_mobile;
    private String start_date;
    private String start_time;
    private String end_date;
    private String end_time;
    private String legislation_id;
    private String case_type;
    private String suspect_behavior;
    private String remarks;
    private String investigate_present;
    private String current_coordinate_x;
    private String current_coordinate_y;
    private String current_address_no;
    private String current_moo;
    private String current_address_name;
    private String current_soi;
    private String current_road;
    private String current_province_code;
    private String current_district_code;
    private String current_subdistrict_code;
    private String current_zipcode;
    private String current_tel;
    private String suspect_coordinate_x;
    private String suspect_coordinate_y;
    private String suspect_address_no;
    private String suspect_moo;
    private String suspect_address_name;
    private String suspect_soi;
    private String suspect_road;
    private String suspect_province_code;
    private String suspect_district_code;
    private String suspect_subdistrict_code;
    private String suspect_zipcode;
    private String suspect_tel;
    private java.sql.Blob suspect_map;
    private String suspect_map_desc;
    private String track_no;

    public String getSuspect_no() {
        return suspect_no;
    }

    public void setSuspect_no(String suspect_no) {
        this.suspect_no = suspect_no;
    }

    public String getSuspect_type() {
        return suspect_type;
    }

    public void setSuspect_type(String suspect_type) {
        this.suspect_type = suspect_type;
    }

    public String[] getCar_province_code() {
        return car_province_code;
    }

    public void setCar_province_code(String[] car_province_code) {
        this.car_province_code = car_province_code;
    }

    public String[] getCar_product_duty_type_code() {
        return car_product_duty_type_code;
    }

    public void setCar_product_duty_type_code(String[] car_product_duty_type_code) {
        this.car_product_duty_type_code = car_product_duty_type_code;
    }

    public String[] getCar_cate() {
        return car_cate;
    }

    public void setCar_cate(String[] car_cate) {
        this.car_cate = car_cate;
    }

    public String[] getCar_no() {
        return car_no;
    }

    public void setCar_no(String[] car_no) {
        this.car_no = car_no;
    }

    public String[] getCar_brand_brand_duty_code() {
        return car_brand_brand_duty_code;
    }

    public void setCar_brand_brand_duty_code(String[] car_brand_brand_duty_code) {
        this.car_brand_brand_duty_code = car_brand_brand_duty_code;
    }

    public String[] getCar_id() {
        return car_id;
    }

    public void setCar_id(String[] car_id) {
        this.car_id = car_id;
    }

    public String[] getCar_model() {
        return car_model;
    }

    public void setCar_model(String[] car_model) {
        this.car_model = car_model;
    }

    public String[] getCar_color() {
        return car_color;
    }

    public void setCar_color(String[] car_color) {
        this.car_color = car_color;
    }

    public String[] getCar_description() {
        return car_description;
    }

    public void setCar_description(String[] car_description) {
        this.car_description = car_description;
    }

    public String[] getIndictment_case_law_id() {
        return indictment_case_law_id;
    }

    public void setIndictment_case_law_id(String[] indictment_case_law_id) {
        this.indictment_case_law_id = indictment_case_law_id;
    }

    public String[] getIndictment_law_id() {
        return indictment_law_id;
    }

    public void setIndictment_law_id(String[] indictment_law_id) {
        this.indictment_law_id = indictment_law_id;
    }

    public String[] getIndictment_guilt_base() {
        return indictment_guilt_base;
    }

    public void setIndictment_guilt_base(String[] indictment_guilt_base) {
        this.indictment_guilt_base = indictment_guilt_base;
    }

    public String[] getIndictment_exhibit_wild() {
        return indictment_exhibit_wild;
    }

    public void setIndictment_exhibit_wild(String[] indictment_exhibit_wild) {
        this.indictment_exhibit_wild = indictment_exhibit_wild;
    }

    public String[] getIndictment_indictment_id() {
        return indictment_indictment_id;
    }

    public void setIndictment_indictment_id(String[] indictment_indictment_id) {
        this.indictment_indictment_id = indictment_indictment_id;
    }

    public String[] getInvestigate_team_idcardno() {
        return investigate_team_idcardno;
    }

    public void setInvestigate_team_idcardno(String[] investigate_team_idcardno) {
        this.investigate_team_idcardno = investigate_team_idcardno;
    }

    public String[] getInvestigate_team_posname() {
        return investigate_team_posname;
    }

    public void setInvestigate_team_posname(String[] investigate_team_posname) {
        this.investigate_team_posname = investigate_team_posname;
    }

    public String[] getInvestigate_team_poscode() {
        return investigate_team_poscode;
    }

    public void setInvestigate_team_poscode(String[] investigate_team_poscode) {
        this.investigate_team_poscode = investigate_team_poscode;
    }

    public String[] getInvestigate_team_offcode() {
        return investigate_team_offcode;
    }

    public void setInvestigate_team_offcode(String[] investigate_team_offcode) {
        this.investigate_team_offcode = investigate_team_offcode;
    }

    public String[] getInvestigate_team_offname() {
        return investigate_team_offname;
    }

    public void setInvestigate_team_offname(String[] investigate_team_offname) {
        this.investigate_team_offname = investigate_team_offname;
    }

    public String[] getInvestigate_team_full_name() {
        return investigate_team_full_name;
    }

    public void setInvestigate_team_full_name(String[] investigate_team_full_name) {
        this.investigate_team_full_name = investigate_team_full_name;
    }

    public String getInvestigate_no() {
        return investigate_no;
    }

    public void setInvestigate_no(String investigate_no) {
        this.investigate_no = investigate_no;
    }

    public String getDoc_date() {
        return doc_date;
    }

    public void setDoc_date(String doc_date) {
        this.doc_date = doc_date;
    }

    public String getStaff_investigate() {
        return staff_investigate;
    }

    public void setStaff_investigate(String staff_investigate) {
        this.staff_investigate = staff_investigate;
    }

    public String getStaff_order_save() {
        return staff_order_save;
    }

    public void setStaff_order_save(String staff_order_save) {
        this.staff_order_save = staff_order_save;
    }

    public String getStaff_report_to() {
        return staff_report_to;
    }

    public void setStaff_report_to(String staff_report_to) {
        this.staff_report_to = staff_report_to;
    }

    public String getStaff_command() {
        return staff_command;
    }

    public void setStaff_command(String staff_command) {
        this.staff_command = staff_command;
    }

    public String getStaff_info() {
        return staff_info;
    }

    public void setStaff_info(String staff_info) {
        this.staff_info = staff_info;
    }

    public String getPoscode_investigate() {
        return poscode_investigate;
    }

    public void setPoscode_investigate(String poscode_investigate) {
        this.poscode_investigate = poscode_investigate;
    }

    public String getPoscode_order_save() {
        return poscode_order_save;
    }

    public void setPoscode_order_save(String poscode_order_save) {
        this.poscode_order_save = poscode_order_save;
    }

    public String getPoscode_report_to() {
        return poscode_report_to;
    }

    public void setPoscode_report_to(String poscode_report_to) {
        this.poscode_report_to = poscode_report_to;
    }

    public String getPoscode_command() {
        return poscode_command;
    }

    public void setPoscode_command(String poscode_command) {
        this.poscode_command = poscode_command;
    }

    public String getPoscode_info() {
        return poscode_info;
    }

    public void setPoscode_info(String poscode_info) {
        this.poscode_info = poscode_info;
    }

    public String getStaff_info_mobile() {
        return staff_info_mobile;
    }

    public void setStaff_info_mobile(String staff_info_mobile) {
        this.staff_info_mobile = staff_info_mobile;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getLegislation_id() {
        return legislation_id;
    }

    public void setLegislation_id(String legislation_id) {
        this.legislation_id = legislation_id;
    }

    public String getCase_type() {
        return case_type;
    }

    public void setCase_type(String case_type) {
        this.case_type = case_type;
    }

    public String getSuspect_behavior() {
        return suspect_behavior;
    }

    public void setSuspect_behavior(String suspect_behavior) {
        this.suspect_behavior = suspect_behavior;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getInvestigate_present() {
        return investigate_present;
    }

    public void setInvestigate_present(String investigate_present) {
        this.investigate_present = investigate_present;
    }

    public String getCurrent_coordinate_x() {
        return current_coordinate_x;
    }

    public void setCurrent_coordinate_x(String current_coordinate_x) {
        this.current_coordinate_x = current_coordinate_x;
    }

    public String getCurrent_coordinate_y() {
        return current_coordinate_y;
    }

    public void setCurrent_coordinate_y(String current_coordinate_y) {
        this.current_coordinate_y = current_coordinate_y;
    }

    public String getCurrent_address_no() {
        return current_address_no;
    }

    public void setCurrent_address_no(String current_address_no) {
        this.current_address_no = current_address_no;
    }

    public String getCurrent_moo() {
        return current_moo;
    }

    public void setCurrent_moo(String current_moo) {
        this.current_moo = current_moo;
    }

    public String getCurrent_address_name() {
        return current_address_name;
    }

    public void setCurrent_address_name(String current_address_name) {
        this.current_address_name = current_address_name;
    }

    public String getCurrent_soi() {
        return current_soi;
    }

    public void setCurrent_soi(String current_soi) {
        this.current_soi = current_soi;
    }

    public String getCurrent_road() {
        return current_road;
    }

    public void setCurrent_road(String current_road) {
        this.current_road = current_road;
    }

    public String getCurrent_province_code() {
        return current_province_code;
    }

    public void setCurrent_province_code(String current_province_code) {
        this.current_province_code = current_province_code;
    }

    public String getCurrent_district_code() {
        return current_district_code;
    }

    public void setCurrent_district_code(String current_district_code) {
        this.current_district_code = current_district_code;
    }

    public String getCurrent_subdistrict_code() {
        return current_subdistrict_code;
    }

    public void setCurrent_subdistrict_code(String current_subdistrict_code) {
        this.current_subdistrict_code = current_subdistrict_code;
    }

    public String getCurrent_zipcode() {
        return current_zipcode;
    }

    public void setCurrent_zipcode(String current_zipcode) {
        this.current_zipcode = current_zipcode;
    }

    public String getCurrent_tel() {
        return current_tel;
    }

    public void setCurrent_tel(String current_tel) {
        this.current_tel = current_tel;
    }

    public String getSuspect_coordinate_x() {
        return suspect_coordinate_x;
    }

    public void setSuspect_coordinate_x(String suspect_coordinate_x) {
        this.suspect_coordinate_x = suspect_coordinate_x;
    }

    public String getSuspect_coordinate_y() {
        return suspect_coordinate_y;
    }

    public void setSuspect_coordinate_y(String suspect_coordinate_y) {
        this.suspect_coordinate_y = suspect_coordinate_y;
    }

    public String getSuspect_address_no() {
        return suspect_address_no;
    }

    public void setSuspect_address_no(String suspect_address_no) {
        this.suspect_address_no = suspect_address_no;
    }

    public String getSuspect_moo() {
        return suspect_moo;
    }

    public void setSuspect_moo(String suspect_moo) {
        this.suspect_moo = suspect_moo;
    }

    public String getSuspect_address_name() {
        return suspect_address_name;
    }

    public void setSuspect_address_name(String suspect_address_name) {
        this.suspect_address_name = suspect_address_name;
    }

    public String getSuspect_soi() {
        return suspect_soi;
    }

    public void setSuspect_soi(String suspect_soi) {
        this.suspect_soi = suspect_soi;
    }

    public String getSuspect_road() {
        return suspect_road;
    }

    public void setSuspect_road(String suspect_road) {
        this.suspect_road = suspect_road;
    }

    public String getSuspect_province_code() {
        return suspect_province_code;
    }

    public void setSuspect_province_code(String suspect_province_code) {
        this.suspect_province_code = suspect_province_code;
    }

    public String getSuspect_district_code() {
        return suspect_district_code;
    }

    public void setSuspect_district_code(String suspect_district_code) {
        this.suspect_district_code = suspect_district_code;
    }

    public String getSuspect_subdistrict_code() {
        return suspect_subdistrict_code;
    }

    public void setSuspect_subdistrict_code(String suspect_subdistrict_code) {
        this.suspect_subdistrict_code = suspect_subdistrict_code;
    }

    public String getSuspect_zipcode() {
        return suspect_zipcode;
    }

    public void setSuspect_zipcode(String suspect_zipcode) {
        this.suspect_zipcode = suspect_zipcode;
    }

    public String getSuspect_tel() {
        return suspect_tel;
    }

    public void setSuspect_tel(String suspect_tel) {
        this.suspect_tel = suspect_tel;
    }

    public Blob getSuspect_map() {
        return suspect_map;
    }

    public void setSuspect_map(Blob suspect_map) {
        this.suspect_map = suspect_map;
    }

    public String getSuspect_map_desc() {
        return suspect_map_desc;
    }

    public void setSuspect_map_desc(String suspect_map_desc) {
        this.suspect_map_desc = suspect_map_desc;
    }

    public String getTrack_no() {
        return track_no;
    }

    public void setTrack_no(String track_no) {
        this.track_no = track_no;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public Long getLong(String value){
        try{
            return Long.valueOf(value);
        }catch (Exception e){
            return 0l;
        }
    }

    public java.util.Date getDateAndTime(String date,String time){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault());
            return sdf.parse(date+" "+time);
        }catch (Exception e){
            return new java.util.Date();
        }
    }

    public java.util.Date getDate(String date){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            return sdf.parse(date);
        }catch (Exception e){
            return new java.util.Date();
        }
    }
}
