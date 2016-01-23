









// ______________________________________________________
// Code by neng , contact us mr.boonchai@gmail.com
// ______________________________________________________
package com.ko.domain;

//include
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.jfree.util.Log;

import com.ko.domain.base.BaseLawbreaker;
import com.ko.util.DB;

public class Lawbreaker extends BaseLawbreaker{

	public Lawbreaker(DB db){
		super(db);
	}
	// business method go here
	private String getSql(){
		String sql =" select lb.* ,  (select ti.title_name || lr.first_name || ' ' || lr.last_name father_name " +
		" from  lawbreaker_relatives lr  left join title ti on ti.title_code=lr.title_code  " +
		"where lr.relation=1 and rownum=1  and lr.lawbreaker_no=lb.lawbreaker_no) father_name, " +
		" (select ti.title_name || lr.first_name || ' ' || lr.last_name father_name "+
		 " from  lawbreaker_relatives lr  left join title ti on ti.title_code=lr.title_code  where lr.relation=2 and rownum=1  and lr.lawbreaker_no=lb.lawbreaker_no) mother_name, "+
		  " to_char(lb.birth_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  birth_date2, "+
		 " p.province_name ,d.district_name, st.subdistrict_name,  tl.title_name, r.race_name race_id_name,n.nation_name nationality_id_name, 'LAWBREAKER' ls_type  from lawbreaker lb "+
		 " left join province p on p.province_code = lb.province_code  "+
		 " left join district d on d.district_code = lb.district_code  "+
		 " left join subdistrict st on st.subdistrict_code = lb.subdistrict_code  "+
		 " left join title tl on tl.title_code = lb.title_code " +
		 " left join race r on r.id = lb.race_id" +
		 " left join nationality n on n.id = lb.NATION_ID " ;
		
		return sql;
	}
	
	public Map<String,Object> getByIdCard(String type,String idCard)throws Exception{
		String sql = getSql();
		if (type.equals("1")){
			sql +=" where lb.LAWBREAKER_ID_CARD= ? and lb.lawbreaker_id_card is not null ";}
		if (type.equals("2")){
		    sql +=" where lb.lawbreaker_Passport= ? and lb.lawbreaker_passport is not null ";}
		if (type.equals("3")){
		    sql +=" where lb.EXCISE_REG_NO= ? and lb.excise_reg_no is not null";
		}
		//System.out.println(sql);
		//System.out.println(idCard);
		List list = findBySql(sql, idCard);

		if( list.size()>0 ){
			//System.out.println(sql);
			//System.out.println(list.get(0));
			return (Map<String,Object>)list.get(0);
		}else
			return null;
	}
	
	public Map<String,Object> getByLawbreakerID(String lID) throws Exception{
		Map<String,Object> ret = null;
		String sql = getSql();
		sql += " where lb.id = '" + lID + "'"; 
		//System.out.println(sql);
		ret = findBySql(sql).get(0);
		if (ret.size()==0){
			ret = null;
			//System.out.println("lawbreaker null");
		}
		
		return ret;
	}
	
	/*
	 * เก็บไว้ก่อนนะ เดี๋ยวได้ใช้แน่ๆ
	 * String sql ="";
		sql += " select sp.suspect_no lawbreaker_no, sp.suspect_type lawbreaker_type, sp.suspect_id_card lawbreaker_id_card, sp.suspect_passport lawbreaker_passport, ";
		sql += " sp.title_code, sp.first_name, sp.middle_name, sp.last_name, sp.other_name, sp.height, sp.birth_date, sp.sex, sp.marital_status, sp.blood_type, ";
		sql += " sp.religion_id,sp.race_id,sp.nation_id,sp.career, sp.address_no, sp.moo,sp.soi,sp.road, sp.subdistrict_code, sp.district_code, sp.province_code, ";
		sql += " sp.post_code,sp.tel,sp.email,sp.tax_id_no,sp.excise_reg_no,sp.corporation_code,'' remarks,sp.address_name,sp.coordinate_x,sp.coordinate_y, ";
		sql += " sp.country_code, sp.passport_country, sp.visa_type, sp.date_in,sp.date_out, sp.title_code_company, sp.company_name, sp.link_photo,sp.photo_desc, ";
		sql += " sp.license_date_from,sp.license_date_to,sp.license_no,sp.mobile,sp.description, ";
		sql += " (select ti.title_name || sr.first_name || ' ' || sr.last_name from suspect_relatives sr inner join title ti on ti.title_code=sr.title_code ";
		sql += "  where sr.relation=1 and rownum=1 and sr.suspect_no=sp.suspect_no) father_name, ";
		sql += "  (select ti.title_name || sr.first_name || ' ' || sr.last_name from suspect_relatives sr inner join title ti on ti.title_code=sr.title_code ";
		sql += "  where sr.relation=2 and rownum=1 and sr.suspect_no=sp.suspect_no) mother_name, ";
		sql += "  to_char(sp.birth_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  birth_date2,  p.province_name ,d.district_name, "; 
		sql += " st.subdistrict_name,  tl.title_name, r.race_name race_id_name,n.nation_name nationality_id_name  ";
		sql += " from suspect sp ";
		sql += " left join province p on p.province_code=sp.province_code ";
		sql += " left join district d on d.district_code=sp.district_code ";
		sql += " left join subdistrict st on st.subdistrict_code=sp.subdistrict_code ";
		sql += " left join nationality n on n.id=sp.nation_id ";
		sql += " left join race r on r.id=sp.race_id ";
		sql += " left join title tl on tl.title_code=sp.title_code ";*/
	
	/*public static void main(String[] args) throws Exception{
		new Lawbreaker().getByIdCard("3333333");
	}*/
    private String full_address;
    private String title_text;
    private String birthdate_age;
    private String age;
    private String national_text;
    private String race_text;
    private String re_text;
    private String full_text_name;
	//**** getter setter ****//
    public String getContinent(){
        Country c = new Country(db);
        try {
            List<Map<String,Object>> result = c.findBySql("select continent from country where country_code=?",getCountry_code());
            if(result.size()>0){
                return result.get(0).get("continent").toString();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "A";
    }
    public String getFull_text_name(){
        return getTitle_text()+((getFirst_name()==null||getFirst_name().equals(""))?"":getFirst_name()+" ")+
                ((getMiddle_name()==null||getMiddle_name().equals(""))?"":getMiddle_name()+" ")+
                ((getLast_name()==null||getLast_name().equals(""))?"":getLast_name());
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
    public String getRe_text(){
        if(getReligion_id()==null)return "-";
        Religion nt = new Religion(db);
        try {
            nt = nt.findByPk(getReligion_id());
            return nt.getReligion_name();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "-";
    }
    public String getRace_text(){
        if(getRace_id() == null)return "-";
        Race nt = new Race(db);
        try {
            nt = nt.findByPk(getRace_id());
            return nt.getRace_name();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "-";
    }
    public String getNational_text(){
        if(getNation_id() == null)return "-";
        Nationality nt = new Nationality(db);
        try {
            nt = nt.findByPk(getNation_id());
            return nt.getNation_name();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "-";
    }
    public String getBirthdate_age() {
        if(getBirth_date() == null)return "";
        java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",new Locale("TH","th"));
        java.util.Date currentDate = new java.util.Date();
        return sdf.format(getBirth_date())+" ("+getAge()+")";
    }
    public String getAge(){
        if(getBirth_date() == null)return "-";
        java.util.Date currentDate = new java.util.Date();
        int age = currentDate.getYear() - getBirth_date().getYear();
        if(currentDate.getMonth()>getBirth_date().getMonth())
            age = age - 1;
        else if(currentDate.getMonth() == getBirth_date().getMonth()){
            if(currentDate.getDate()>getBirth_date().getDate())
                age = age - 1;
        }
        if(age < 0 )age = 0;
        return ""+age;
    }
    public String getTitle_text() {
        if(getTitle_code() == null)return "";
        Title t = new Title(db);
        t.setTitle_code(getTitle_code());
        try {
            List<Title> tList = t.findByExample(t);
            if(tList.size()>0)
                return tList.get(0).getTitle_name();
            else return "";
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getComp_title_text(){
        if(getTitle_code_company() == null)return "";
        Title t = new Title(db);
        t.setTitle_code(getTitle_code_company());
        try {
            List<Title> tList = t.findByExample(t);
            if(tList.size()>0)
                return tList.get(0).getTitle_name();
            else return "";
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getFull_address() {
        return ((getAddress_no()!=null)?"เลขที่ "+getAddress_no()+" ":"")+
               ((getAddress_name()!=null)?getAddress_name()+" ":"")+
               ((getMoo()!=null && getMoo()!=0)?"หมู่ที่ "+getMoo().toString()+" ":"")+
               ((getSoi()!=null)?"ซอย "+getSoi()+" ":"")+
               ((getRoad()!=null)?"ถนน "+getRoad()+" ":"")+
               ((getSubdistrict_code()!=null)?getSubDistrictText()+" ":"")+
               ((getDistrict_code()!=null)?getDistrictText()+" ":"")+
               ((getProvince_code()!=null)?getProvinceText()+" ":"")+
               ((getPost_code()!=null)?"รหัสไปรษณีย์ "+getPost_code()+" ":"");
    }

    // add more attributes for support lawbreaker addresses and lawbreaker relatives
    // for lawbreaker address
//****  attribute deteail  *****//
    private Double[] lawbreaker_address_coordinate_y;

    private Double[] lawbreaker_address_coordinate_x;

    private String[] lawbreaker_address_description;

    private String[] lawbreaker_address_fax_no;

    private String[] lawbreaker_address_tel_no;

    private String[] lawbreaker_address_zipcode;

    private String[] lawbreaker_address_province_code;

    private String[] lawbreaker_address_district_code;

    private String[] lawbreaker_address_subdistrict_code;

    private Long[] lawbreaker_address_moo;

    private String[] lawbreaker_address_road;

    private String[] lawbreaker_address_soi;

    private String[] lawbreaker_address_address_name;

    private String[] lawbreaker_address_address;

    private Long[] lawbreaker_address_lawbreaker_no;

    private String[] lawbreaker_address_id;

    private Integer[] lawbreaker_address_count;
	//**** getter setter ****//

    public Double[] getLawbreaker_address_coordinate_y() {
        return lawbreaker_address_coordinate_y;
    }

    public void setLawbreaker_address_coordinate_y(Double[] lawbreaker_address_coordinate_y) {
        this.lawbreaker_address_coordinate_y = lawbreaker_address_coordinate_y;
    }

    public Double[] getLawbreaker_address_coordinate_x() {
        return lawbreaker_address_coordinate_x;
    }

    public void setLawbreaker_address_coordinate_x(Double[] lawbreaker_address_coordinate_x) {
        this.lawbreaker_address_coordinate_x = lawbreaker_address_coordinate_x;
    }

    public String[] getLawbreaker_address_description() {
        return lawbreaker_address_description;
    }

    public void setLawbreaker_address_description(String[] lawbreaker_address_description) {
        this.lawbreaker_address_description = lawbreaker_address_description;
    }

    public String[] getLawbreaker_address_fax_no() {
        return lawbreaker_address_fax_no;
    }

    public void setLawbreaker_address_fax_no(String[] lawbreaker_address_fax_no) {
        this.lawbreaker_address_fax_no = lawbreaker_address_fax_no;
    }

    public String[] getLawbreaker_address_tel_no() {
        return lawbreaker_address_tel_no;
    }

    public void setLawbreaker_address_tel_no(String[] lawbreaker_address_tel_no) {
        this.lawbreaker_address_tel_no = lawbreaker_address_tel_no;
    }

    public String[] getLawbreaker_address_zipcode() {
        return lawbreaker_address_zipcode;
    }

    public void setLawbreaker_address_zipcode(String[] lawbreaker_address_zipcode) {
        this.lawbreaker_address_zipcode = lawbreaker_address_zipcode;
    }

    public String[] getLawbreaker_address_province_code() {
        return lawbreaker_address_province_code;
    }

    public void setLawbreaker_address_province_code(String[] lawbreaker_address_province_code) {
        this.lawbreaker_address_province_code = lawbreaker_address_province_code;
    }

    public String[] getLawbreaker_address_district_code() {
        return lawbreaker_address_district_code;
    }

    public void setLawbreaker_address_district_code(String[] lawbreaker_address_district_code) {
        this.lawbreaker_address_district_code = lawbreaker_address_district_code;
    }

    public String[] getLawbreaker_address_subdistrict_code() {
        return lawbreaker_address_subdistrict_code;
    }

    public void setLawbreaker_address_subdistrict_code(String[] lawbreaker_address_subdistrict_code) {
        this.lawbreaker_address_subdistrict_code = lawbreaker_address_subdistrict_code;
    }

    public Long[] getLawbreaker_address_moo() {
        return lawbreaker_address_moo;
    }

    public void setLawbreaker_address_moo(Long[] lawbreaker_address_moo) {
        this.lawbreaker_address_moo = lawbreaker_address_moo;
    }

    public String[] getLawbreaker_address_road() {
        return lawbreaker_address_road;
    }

    public void setLawbreaker_address_road(String[] lawbreaker_address_road) {
        this.lawbreaker_address_road = lawbreaker_address_road;
    }

    public String[] getLawbreaker_address_soi() {
        return lawbreaker_address_soi;
    }

    public void setLawbreaker_address_soi(String[] lawbreaker_address_soi) {
        this.lawbreaker_address_soi = lawbreaker_address_soi;
    }

    public String[] getLawbreaker_address_address_name() {
        return lawbreaker_address_address_name;
    }

    public void setLawbreaker_address_address_name(String[] lawbreaker_address_address_name) {
        this.lawbreaker_address_address_name = lawbreaker_address_address_name;
    }

    public String[] getLawbreaker_address_address() {
        return lawbreaker_address_address;
    }

    public void setLawbreaker_address_address(String[] lawbreaker_address_address) {
        this.lawbreaker_address_address = lawbreaker_address_address;
    }

    public Long[] getLawbreaker_address_lawbreaker_no() {
        return lawbreaker_address_lawbreaker_no;
    }

    public void setLawbreaker_address_lawbreaker_no(Long[] lawbreaker_address_lawbreaker_no) {
        this.lawbreaker_address_lawbreaker_no = lawbreaker_address_lawbreaker_no;
    }

    public String[] getLawbreaker_address_id() {
        return lawbreaker_address_id;
    }

    public void setLawbreaker_address_id(String[] lawbreaker_address_id) {
        this.lawbreaker_address_id = lawbreaker_address_id;
    }

    public Integer[] getLawbreaker_address_count() {
        return lawbreaker_address_count;
    }

    public void setLawbreaker_address_count(Integer[] lawbreaker_address_count) {
        this.lawbreaker_address_count = lawbreaker_address_count;
    }


    // attributes for relative form
    public Long[] lawbreaker_relative_relation;
    public String[] lawbreaker_relative_relation_text;
	public String[] lawbreaker_relative_title_code;
    public String[] lawbreaker_relative_title_text;
	public String[] lawbreaker_relative_first_name;
 	public String[] lawbreaker_relative_last_name;
	public String[] lawbreaker_relative_tel_no;
	public String[] lawbreaker_relative_email;
	public String[] lawbreaker_relative_current_address_no;
	public Long[] lawbreaker_relative_current_moo;
	public String[] lawbreaker_relative_current_soi;
	public String[] lawbreaker_relative_current_road;
	public String[] lawbreaker_relative_current_address_name;
    public String[] lawbreaker_relative_current_province_code;
	public String[] lawbreaker_relative_current_district_code;
	public String[] lawbreaker_relative_current_subdistrict_code;
	public String[] lawbreaker_relative_current_province_text;
	public String[] lawbreaker_relative_current_district_text;
	public String[] lawbreaker_relative_current_subdistrict_text;
	public String[] lawbreaker_relative_hometown_address_no;
	public Long[] lawbreaker_relative_hometown_moo;
	public String[] lawbreaker_relative_hometown_soi;
	public String[] lawbreaker_relative_hometown_road;
    public String[] lawbreaker_relative_hometown_province_code;
	public String[] lawbreaker_relative_hometown_district_code;
	public String[] lawbreaker_relative_hometown_subdistrict_code;
	public String[] lawbreaker_relative_hometown_province_text;
	public String[] lawbreaker_relative_hometown_district_text;
	public String[] lawbreaker_relative_hometown_subdistrict_text;
    public String[] lawbreaker_relative_id;
    public String[] lawbreaker_relative_lawbreaker_no;
    public String[] lawbreaker_relative_count;
    public String[] lawbreaker_relative_idcardno;

    public String[] getLawbreaker_relative_idcardno() {
        return lawbreaker_relative_idcardno;
    }

    public void setLawbreaker_relative_idcardno(String[] lawbreaker_relative_idcardno) {
        this.lawbreaker_relative_idcardno = lawbreaker_relative_idcardno;
    }

    public String[] getLawbreaker_relative_id() {
        return lawbreaker_relative_id;
    }

    public void setLawbreaker_relative_id(String[] lawbreaker_relative_id) {
        this.lawbreaker_relative_id = lawbreaker_relative_id;
    }

    public String[] getLawbreaker_relative_lawbreaker_no() {
        return lawbreaker_relative_lawbreaker_no;
    }

    public void setLawbreaker_relative_lawbreaker_no(String[] lawbreaker_relative_lawbreaker_no) {
        this.lawbreaker_relative_lawbreaker_no = lawbreaker_relative_lawbreaker_no;
    }

    public String[] getLawbreaker_relative_count() {
        return lawbreaker_relative_count;
    }

    public void setLawbreaker_relative_count(String[] lawbreaker_relative_count) {
        this.lawbreaker_relative_count = lawbreaker_relative_count;
    }

    public Long[] getLawbreaker_relative_relation() {
        return lawbreaker_relative_relation;
    }

    public void setLawbreaker_relative_relation(Long[] lawbreaker_relative_relation) {
        this.lawbreaker_relative_relation = lawbreaker_relative_relation;
    }

    public String[] getLawbreaker_relative_relation_text() {
        return lawbreaker_relative_relation_text;
    }

    public void setLawbreaker_relative_relation_text(String[] lawbreaker_relative_relation_text) {
        this.lawbreaker_relative_relation_text = lawbreaker_relative_relation_text;
    }

    public String[] getLawbreaker_relative_title_code() {
        return lawbreaker_relative_title_code;
    }

    public void setLawbreaker_relative_title_code(String[] lawbreaker_relative_title_code) {
        this.lawbreaker_relative_title_code = lawbreaker_relative_title_code;
    }

    public String[] getLawbreaker_relative_title_text() {
        return lawbreaker_relative_title_text;
    }

    public void setLawbreaker_relative_title_text(String[] lawbreaker_relative_title_text) {
        this.lawbreaker_relative_title_text = lawbreaker_relative_title_text;
    }

    public String[] getLawbreaker_relative_first_name() {
        return lawbreaker_relative_first_name;
    }

    public void setLawbreaker_relative_first_name(String[] lawbreaker_relative_first_name) {
        this.lawbreaker_relative_first_name = lawbreaker_relative_first_name;
    }

    public String[] getLawbreaker_relative_last_name() {
        return lawbreaker_relative_last_name;
    }

    public void setLawbreaker_relative_last_name(String[] lawbreaker_relative_last_name) {
        this.lawbreaker_relative_last_name = lawbreaker_relative_last_name;
    }

    public String[] getLawbreaker_relative_tel_no() {
        return lawbreaker_relative_tel_no;
    }

    public void setLawbreaker_relative_tel_no(String[] lawbreaker_relative_tel_no) {
        this.lawbreaker_relative_tel_no = lawbreaker_relative_tel_no;
    }

    public String[] getLawbreaker_relative_email() {
        return lawbreaker_relative_email;
    }

    public void setLawbreaker_relative_email(String[] lawbreaker_relative_email) {
        this.lawbreaker_relative_email = lawbreaker_relative_email;
    }

    public String[] getLawbreaker_relative_current_address_no() {
        return lawbreaker_relative_current_address_no;
    }

    public void setLawbreaker_relative_current_address_no(String[] lawbreaker_relative_current_address_no) {
        this.lawbreaker_relative_current_address_no = lawbreaker_relative_current_address_no;
    }

    public Long[] getLawbreaker_relative_current_moo() {
        return lawbreaker_relative_current_moo;
    }

    public void setLawbreaker_relative_current_moo(Long[] lawbreaker_relative_current_moo) {
        this.lawbreaker_relative_current_moo = lawbreaker_relative_current_moo;
    }

    public String[] getLawbreaker_relative_current_soi() {
        return lawbreaker_relative_current_soi;
    }

    public void setLawbreaker_relative_current_soi(String[] lawbreaker_relative_current_soi) {
        this.lawbreaker_relative_current_soi = lawbreaker_relative_current_soi;
    }

    public String[] getLawbreaker_relative_current_road() {
        return lawbreaker_relative_current_road;
    }

    public void setLawbreaker_relative_current_road(String[] lawbreaker_relative_current_road) {
        this.lawbreaker_relative_current_road = lawbreaker_relative_current_road;
    }

    public String[] getLawbreaker_relative_current_address_name() {
        return lawbreaker_relative_current_address_name;
    }

    public void setLawbreaker_relative_current_address_name(String[] lawbreaker_relative_current_address_name) {
        this.lawbreaker_relative_current_address_name = lawbreaker_relative_current_address_name;
    }

    public String[] getLawbreaker_relative_current_province_code() {
        return lawbreaker_relative_current_province_code;
    }

    public void setLawbreaker_relative_current_province_code(String[] lawbreaker_relative_current_province_code) {
        this.lawbreaker_relative_current_province_code = lawbreaker_relative_current_province_code;
    }

    public String[] getLawbreaker_relative_current_district_code() {
        return lawbreaker_relative_current_district_code;
    }

    public void setLawbreaker_relative_current_district_code(String[] lawbreaker_relative_current_district_code) {
        this.lawbreaker_relative_current_district_code = lawbreaker_relative_current_district_code;
    }

    public String[] getLawbreaker_relative_current_subdistrict_code() {
        return lawbreaker_relative_current_subdistrict_code;
    }

    public void setLawbreaker_relative_current_subdistrict_code(String[] lawbreaker_relative_current_subdistrict_code) {
        this.lawbreaker_relative_current_subdistrict_code = lawbreaker_relative_current_subdistrict_code;
    }

    public String[] getLawbreaker_relative_current_province_text() {
        return lawbreaker_relative_current_province_text;
    }

    public void setLawbreaker_relative_current_province_text(String[] lawbreaker_relative_current_province_text) {
        this.lawbreaker_relative_current_province_text = lawbreaker_relative_current_province_text;
    }

    public String[] getLawbreaker_relative_current_district_text() {
        return lawbreaker_relative_current_district_text;
    }

    public void setLawbreaker_relative_current_district_text(String[] lawbreaker_relative_current_district_text) {
        this.lawbreaker_relative_current_district_text = lawbreaker_relative_current_district_text;
    }

    public String[] getLawbreaker_relative_current_subdistrict_text() {
        return lawbreaker_relative_current_subdistrict_text;
    }

    public void setLawbreaker_relative_current_subdistrict_text(String[] lawbreaker_relative_current_subdistrict_text) {
        this.lawbreaker_relative_current_subdistrict_text = lawbreaker_relative_current_subdistrict_text;
    }

    public String[] getLawbreaker_relative_hometown_address_no() {
        return lawbreaker_relative_hometown_address_no;
    }

    public void setLawbreaker_relative_hometown_address_no(String[] lawbreaker_relative_hometown_address_no) {
        this.lawbreaker_relative_hometown_address_no = lawbreaker_relative_hometown_address_no;
    }

    public Long[] getLawbreaker_relative_hometown_moo() {
        return lawbreaker_relative_hometown_moo;
    }

    public void setLawbreaker_relative_hometown_moo(Long[] lawbreaker_relative_hometown_moo) {
        this.lawbreaker_relative_hometown_moo = lawbreaker_relative_hometown_moo;
    }

    public String[] getLawbreaker_relative_hometown_soi() {
        return lawbreaker_relative_hometown_soi;
    }

    public void setLawbreaker_relative_hometown_soi(String[] lawbreaker_relative_hometown_soi) {
        this.lawbreaker_relative_hometown_soi = lawbreaker_relative_hometown_soi;
    }

    public String[] getLawbreaker_relative_hometown_road() {
        return lawbreaker_relative_hometown_road;
    }

    public void setLawbreaker_relative_hometown_road(String[] lawbreaker_relative_hometown_road) {
        this.lawbreaker_relative_hometown_road = lawbreaker_relative_hometown_road;
    }

    public String[] getLawbreaker_relative_hometown_province_code() {
        return lawbreaker_relative_hometown_province_code;
    }

    public void setLawbreaker_relative_hometown_province_code(String[] lawbreaker_relative_hometown_province_code) {
        this.lawbreaker_relative_hometown_province_code = lawbreaker_relative_hometown_province_code;
    }

    public String[] getLawbreaker_relative_hometown_district_code() {
        return lawbreaker_relative_hometown_district_code;
    }

    public void setLawbreaker_relative_hometown_district_code(String[] lawbreaker_relative_hometown_district_code) {
        this.lawbreaker_relative_hometown_district_code = lawbreaker_relative_hometown_district_code;
    }

    public String[] getLawbreaker_relative_hometown_subdistrict_code() {
        return lawbreaker_relative_hometown_subdistrict_code;
    }

    public void setLawbreaker_relative_hometown_subdistrict_code(String[] lawbreaker_relative_hometown_subdistrict_code) {
        this.lawbreaker_relative_hometown_subdistrict_code = lawbreaker_relative_hometown_subdistrict_code;
    }

    public String[] getLawbreaker_relative_hometown_province_text() {
        return lawbreaker_relative_hometown_province_text;
    }

    public void setLawbreaker_relative_hometown_province_text(String[] lawbreaker_relative_hometown_province_text) {
        this.lawbreaker_relative_hometown_province_text = lawbreaker_relative_hometown_province_text;
    }

    public String[] getLawbreaker_relative_hometown_district_text() {
        return lawbreaker_relative_hometown_district_text;
    }

    public void setLawbreaker_relative_hometown_district_text(String[] lawbreaker_relative_hometown_district_text) {
        this.lawbreaker_relative_hometown_district_text = lawbreaker_relative_hometown_district_text;
    }

    public String[] getLawbreaker_relative_hometown_subdistrict_text() {
        return lawbreaker_relative_hometown_subdistrict_text;
    }

    public void setLawbreaker_relative_hometown_subdistrict_text(String[] lawbreaker_relative_hometown_subdistrict_text) {
        this.lawbreaker_relative_hometown_subdistrict_text = lawbreaker_relative_hometown_subdistrict_text;
    }
}