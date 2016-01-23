/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseSuspect;
import com.ko.util.DB;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

public class Suspect extends BaseSuspect{
	public Suspect(DB db){
		super(db);
	}
	// business method go here
	
	private String getSql(){
		String sql ="";
		sql += " select sp.suspect_no lawbreaker_no, sp.suspect_type lawbreaker_type, sp.suspect_id_card lawbreaker_id_card, sp.suspect_passport lawbreaker_passport, ";
		sql += " sp.title_code, sp.first_name, sp.middle_name, sp.last_name, sp.other_name, sp.height, sp.birth_date, sp.sex, sp.marital_status, sp.blood_type, ";
		sql += " sp.religion_id,sp.race_id,sp.nation_id,sp.career, sp.address_no, sp.moo, sp.soi,sp.road, sp.subdistrict_code, sp.district_code, sp.province_code, ";
		sql += " sp.post_code,sp.tel,sp.email,sp.tax_id_no,sp.excise_reg_no,sp.corporation_code,'' remarks,sp.address_name,sp.coordinate_x,sp.coordinate_y, ";
		sql += " sp.country_code, sp.passport_country, sp.visa_type, sp.date_in,sp.date_out, sp.title_code_company, sp.company_name, sp.link_photo,sp.photo_desc, ";
		sql += " sp.license_date_from,sp.license_date_to,sp.license_no,sp.mobile,sp.description, ";
		sql += " (select ti.title_name || sr.first_name || ' ' || sr.last_name from suspect_relatives sr inner join title ti on ti.title_code=sr.title_code ";
		sql += "  where sr.relation=1 and rownum=1 and sr.suspect_no=sp.suspect_no) father_name, ";
		sql += "  (select ti.title_name || sr.first_name || ' ' || sr.last_name from suspect_relatives sr inner join title ti on ti.title_code=sr.title_code ";
		sql += "  where sr.relation=2 and rownum=1 and sr.suspect_no=sp.suspect_no) mother_name, ";
		sql += "  to_char(sp.birth_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  birth_date2,  p.province_name ,d.district_name, "; 
		sql += " st.subdistrict_name,  tl.title_name, sp.race_id, r.race_name race_id_name, sp.nation_id,n.nation_name nationality_id_name, 'SUSPECT' ls_type  ";
		sql += " from suspect sp ";
		sql += " left join province p on p.province_code=sp.province_code ";
		sql += " left join district d on d.district_code=sp.district_code ";
		sql += " left join subdistrict st on st.subdistrict_code=sp.subdistrict_code ";
		sql += " left join nationality n on n.id=sp.nation_id ";
		sql += " left join race r on r.id=sp.race_id ";
		sql += " left join title tl on tl.title_code=sp.title_code ";
		
		 return sql;
	}
	public Map<String,Object> getByIdCard(String type,String idCard)throws Exception{
		String sql = getSql();
		if (type.equals("1")){
			sql +=" where sp.suspect_id_card= ? and sp.suspect_id_card is not null ";}
		if (type.equals("2")){
		    sql +=" where sp.suspect_Passport= ? and sp.suspect_passport is not null ";}
		if (type.equals("3")){
		    sql +=" where sp.EXCISE_REG_NO= ? and sp.excise_reg_no is not null ";}

		List list = findBySql(sql, idCard);

		if( list.size()>0 ){
			//System.out.println(sql);
			//System.out.println(list.get(0));
			return (Map<String,Object>)list.get(0);
		}else
			return null;
	}

	public Map<String,Object> getBySuspectID(String sID) throws Exception{
		Map<String,Object> ret = null;
		String sql = getSql();
		sql += " where sp.id = '" + sID + "'"; 
		
		ret = findBySql(sql).get(0);
		if (ret.size()==0)
			ret = null;
		
		return ret;
	}
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
        System.out.println("religion id = "+getReligion_id());
        Religion nt = new Religion(db);
        try {
            nt = nt.findByPk(getReligion_id());
            if(nt == null) return "-";
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
            if(nt == null) return "-";
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
            if(nt == null)return "-";
            return nt.getNation_name();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "-";
    }
    public String getBirthdate_age() {
        if(getBirth_date() == null)return "";
        java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date currentDate = new java.util.Date();
        return sdf.format(getBirth_date())+" ("+getAge()+")";
    }
    public String getAge(){
        if(getBirth_date() == null)return "-";
        java.util.Date currentDate = new java.util.Date();
        int age = currentDate.getYear() - getBirth_date().getYear();
//        if(currentDate.getMonth()>getBirth_date().getMonth())
//            age = age - 1;
//        else if(currentDate.getMonth() == getBirth_date().getMonth()){
//            if(currentDate.getDate()>getBirth_date().getDate())
//                age = age - 1;
//        }
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
               ((getMoo()!=null)?"หมู่ที่ "+getMoo().toString()+" ":"")+
               ((getSoi()!=null)?"ซอย "+getSoi()+" ":"")+
               ((getRoad()!=null)?"ถนน "+getRoad()+" ":"")+
               ((getSubdistrict_code()!=null)?getSubDistrictText()+" ":"")+
               ((getDistrict_code()!=null)?getDistrictText()+" ":"")+
               ((getProvince_code()!=null)?getProvinceText()+" ":"")+
               ((getPost_code()!=null)?"รหัสไปรษณีย์ "+getPost_code()+" ":"");
    }
    public String getCountry(){
        Country c = new Country(db);
        try {
            List<Country> clist = c.findByWhere(Country.COUNTRY_CODECol+"=?",getPassport_country());
            if(clist.size()>0)
                return clist.get(0).getCountry_name();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }


    // add more attributes for support suspect addresses and suspect relatives
    // for suspect address
//****  attribute deteail  *****//
    private Double[] suspect_address_coordinate_y;

    private Double[] suspect_address_coordinate_x;

    private String[] suspect_address_description;

    private String[] suspect_address_fax_no;

    private String[] suspect_address_tel_no;

    private String[] suspect_address_zipcode;

    private String[] suspect_address_province_code;

    private String[] suspect_address_district_code;

    private String[] suspect_address_subdistrict_code;

    private Long[] suspect_address_moo;

    private String[] suspect_address_road;

    private String[] suspect_address_soi;

    private String[] suspect_address_address_name;

    private String[] suspect_address_address;

    private Long[] suspect_address_suspect_no;

    private String[] suspect_address_id;

    private Integer[] suspect_address_count;
	//**** getter setter ****//

    public Double[] getSuspect_address_coordinate_y() {
        return suspect_address_coordinate_y;
    }

    public void setSuspect_address_coordinate_y(Double[] suspect_address_coordinate_y) {
        this.suspect_address_coordinate_y = suspect_address_coordinate_y;
    }

    public Double[] getSuspect_address_coordinate_x() {
        return suspect_address_coordinate_x;
    }

    public void setSuspect_address_coordinate_x(Double[] suspect_address_coordinate_x) {
        this.suspect_address_coordinate_x = suspect_address_coordinate_x;
    }

    public String[] getSuspect_address_description() {
        return suspect_address_description;
    }

    public void setSuspect_address_description(String[] suspect_address_description) {
        this.suspect_address_description = suspect_address_description;
    }

    public String[] getSuspect_address_fax_no() {
        return suspect_address_fax_no;
    }

    public void setSuspect_address_fax_no(String[] suspect_address_fax_no) {
        this.suspect_address_fax_no = suspect_address_fax_no;
    }

    public String[] getSuspect_address_tel_no() {
        return suspect_address_tel_no;
    }

    public void setSuspect_address_tel_no(String[] suspect_address_tel_no) {
        this.suspect_address_tel_no = suspect_address_tel_no;
    }

    public String[] getSuspect_address_zipcode() {
        return suspect_address_zipcode;
    }

    public void setSuspect_address_zipcode(String[] suspect_address_zipcode) {
        this.suspect_address_zipcode = suspect_address_zipcode;
    }

    public String[] getSuspect_address_province_code() {
        return suspect_address_province_code;
    }

    public void setSuspect_address_province_code(String[] suspect_address_province_code) {
        this.suspect_address_province_code = suspect_address_province_code;
    }

    public String[] getSuspect_address_district_code() {
        return suspect_address_district_code;
    }

    public void setSuspect_address_district_code(String[] suspect_address_district_code) {
        this.suspect_address_district_code = suspect_address_district_code;
    }

    public String[] getSuspect_address_subdistrict_code() {
        return suspect_address_subdistrict_code;
    }

    public void setSuspect_address_subdistrict_code(String[] suspect_address_subdistrict_code) {
        this.suspect_address_subdistrict_code = suspect_address_subdistrict_code;
    }

    public Long[] getSuspect_address_moo() {
        return suspect_address_moo;
    }

    public void setSuspect_address_moo(Long[] suspect_address_moo) {
        this.suspect_address_moo = suspect_address_moo;
    }

    public String[] getSuspect_address_road() {
        return suspect_address_road;
    }

    public void setSuspect_address_road(String[] suspect_address_road) {
        this.suspect_address_road = suspect_address_road;
    }

    public String[] getSuspect_address_soi() {
        return suspect_address_soi;
    }

    public void setSuspect_address_soi(String[] suspect_address_soi) {
        this.suspect_address_soi = suspect_address_soi;
    }

    public String[] getSuspect_address_address_name() {
        return suspect_address_address_name;
    }

    public void setSuspect_address_address_name(String[] suspect_address_address_name) {
        this.suspect_address_address_name = suspect_address_address_name;
    }

    public String[] getSuspect_address_address() {
        return suspect_address_address;
    }

    public void setSuspect_address_address(String[] suspect_address_address) {
        this.suspect_address_address = suspect_address_address;
    }

    public Long[] getSuspect_address_suspect_no() {
        return suspect_address_suspect_no;
    }

    public void setSuspect_address_suspect_no(Long[] suspect_address_suspect_no) {
        this.suspect_address_suspect_no = suspect_address_suspect_no;
    }

    public String[] getSuspect_address_id() {
        return suspect_address_id;
    }

    public void setSuspect_address_id(String[] suspect_address_id) {
        this.suspect_address_id = suspect_address_id;
    }

    public Integer[] getSuspect_address_count() {
        return suspect_address_count;
    }

    public void setSuspect_address_count(Integer[] suspect_address_count) {
        this.suspect_address_count = suspect_address_count;
    }


    // attributes for relative form
    public Long[] suspect_relative_relation;
    public String[] suspect_relative_relation_text;
	public String[] suspect_relative_title_code;
    public String[] suspect_relative_title_text;
	public String[] suspect_relative_first_name;
 	public String[] suspect_relative_last_name;
	public String[] suspect_relative_tel_no;
	public String[] suspect_relative_email;
	public String[] suspect_relative_current_address_no;
	public Long[] suspect_relative_current_moo;
	public String[] suspect_relative_current_soi;
	public String[] suspect_relative_current_road;
	public String[] suspect_relative_current_address_name;
    public String[] suspect_relative_current_province_code;
	public String[] suspect_relative_current_district_code;
	public String[] suspect_relative_current_subdistrict_code;
	public String[] suspect_relative_current_province_text;
	public String[] suspect_relative_current_district_text;
	public String[] suspect_relative_current_subdistrict_text;
	public String[] suspect_relative_hometown_address_no;
	public Long[] suspect_relative_hometown_moo;
	public String[] suspect_relative_hometown_soi;
	public String[] suspect_relative_hometown_road;
    public String[] suspect_relative_hometown_province_code;
	public String[] suspect_relative_hometown_district_code;
	public String[] suspect_relative_hometown_subdistrict_code;
	public String[] suspect_relative_hometown_province_text;
	public String[] suspect_relative_hometown_district_text;
	public String[] suspect_relative_hometown_subdistrict_text;
    public String[] suspect_relative_id;
    public String[] suspect_relative_suspect_no;
    public String[] suspect_relative_count;
    public String[] suspect_relative_idcardno;

    public String[] getSuspect_relative_idcardno() {
        return suspect_relative_idcardno;
    }

    public void setSuspect_relative_idcardno(String[] suspect_relative_idcardno) {
        this.suspect_relative_idcardno = suspect_relative_idcardno;
    }

    public String[] getSuspect_relative_id() {
        return suspect_relative_id;
    }

    public void setSuspect_relative_id(String[] suspect_relative_id) {
        this.suspect_relative_id = suspect_relative_id;
    }

    public String[] getSuspect_relative_suspect_no() {
        return suspect_relative_suspect_no;
    }

    public void setSuspect_relative_suspect_no(String[] suspect_relative_suspect_no) {
        this.suspect_relative_suspect_no = suspect_relative_suspect_no;
    }

    public String[] getSuspect_relative_count() {
        return suspect_relative_count;
    }

    public void setSuspect_relative_count(String[] suspect_relative_count) {
        this.suspect_relative_count = suspect_relative_count;
    }

    public Long[] getSuspect_relative_relation() {
        return suspect_relative_relation;
    }

    public void setSuspect_relative_relation(Long[] suspect_relative_relation) {
        this.suspect_relative_relation = suspect_relative_relation;
    }

    public String[] getSuspect_relative_relation_text() {
        return suspect_relative_relation_text;
    }

    public void setSuspect_relative_relation_text(String[] suspect_relative_relation_text) {
        this.suspect_relative_relation_text = suspect_relative_relation_text;
    }

    public String[] getSuspect_relative_title_code() {
        return suspect_relative_title_code;
    }

    public void setSuspect_relative_title_code(String[] suspect_relative_title_code) {
        this.suspect_relative_title_code = suspect_relative_title_code;
    }

    public String[] getSuspect_relative_title_text() {
        return suspect_relative_title_text;
    }

    public void setSuspect_relative_title_text(String[] suspect_relative_title_text) {
        this.suspect_relative_title_text = suspect_relative_title_text;
    }

    public String[] getSuspect_relative_first_name() {
        return suspect_relative_first_name;
    }

    public void setSuspect_relative_first_name(String[] suspect_relative_first_name) {
        this.suspect_relative_first_name = suspect_relative_first_name;
    }

    public String[] getSuspect_relative_last_name() {
        return suspect_relative_last_name;
    }

    public void setSuspect_relative_last_name(String[] suspect_relative_last_name) {
        this.suspect_relative_last_name = suspect_relative_last_name;
    }

    public String[] getSuspect_relative_tel_no() {
        return suspect_relative_tel_no;
    }

    public void setSuspect_relative_tel_no(String[] suspect_relative_tel_no) {
        this.suspect_relative_tel_no = suspect_relative_tel_no;
    }

    public String[] getSuspect_relative_email() {
        return suspect_relative_email;
    }

    public void setSuspect_relative_email(String[] suspect_relative_email) {
        this.suspect_relative_email = suspect_relative_email;
    }

    public String[] getSuspect_relative_current_address_no() {
        return suspect_relative_current_address_no;
    }

    public void setSuspect_relative_current_address_no(String[] suspect_relative_current_address_no) {
        this.suspect_relative_current_address_no = suspect_relative_current_address_no;
    }

    public Long[] getSuspect_relative_current_moo() {
        return suspect_relative_current_moo;
    }

    public void setSuspect_relative_current_moo(Long[] suspect_relative_current_moo) {
        this.suspect_relative_current_moo = suspect_relative_current_moo;
    }

    public String[] getSuspect_relative_current_soi() {
        return suspect_relative_current_soi;
    }

    public void setSuspect_relative_current_soi(String[] suspect_relative_current_soi) {
        this.suspect_relative_current_soi = suspect_relative_current_soi;
    }

    public String[] getSuspect_relative_current_road() {
        return suspect_relative_current_road;
    }

    public void setSuspect_relative_current_road(String[] suspect_relative_current_road) {
        this.suspect_relative_current_road = suspect_relative_current_road;
    }

    public String[] getSuspect_relative_current_address_name() {
        return suspect_relative_current_address_name;
    }

    public void setSuspect_relative_current_address_name(String[] suspect_relative_current_address_name) {
        this.suspect_relative_current_address_name = suspect_relative_current_address_name;
    }

    public String[] getSuspect_relative_current_province_code() {
        return suspect_relative_current_province_code;
    }

    public void setSuspect_relative_current_province_code(String[] suspect_relative_current_province_code) {
        this.suspect_relative_current_province_code = suspect_relative_current_province_code;
    }

    public String[] getSuspect_relative_current_district_code() {
        return suspect_relative_current_district_code;
    }

    public void setSuspect_relative_current_district_code(String[] suspect_relative_current_district_code) {
        this.suspect_relative_current_district_code = suspect_relative_current_district_code;
    }

    public String[] getSuspect_relative_current_subdistrict_code() {
        return suspect_relative_current_subdistrict_code;
    }

    public void setSuspect_relative_current_subdistrict_code(String[] suspect_relative_current_subdistrict_code) {
        this.suspect_relative_current_subdistrict_code = suspect_relative_current_subdistrict_code;
    }

    public String[] getSuspect_relative_current_province_text() {
        return suspect_relative_current_province_text;
    }

    public void setSuspect_relative_current_province_text(String[] suspect_relative_current_province_text) {
        this.suspect_relative_current_province_text = suspect_relative_current_province_text;
    }

    public String[] getSuspect_relative_current_district_text() {
        return suspect_relative_current_district_text;
    }

    public void setSuspect_relative_current_district_text(String[] suspect_relative_current_district_text) {
        this.suspect_relative_current_district_text = suspect_relative_current_district_text;
    }

    public String[] getSuspect_relative_current_subdistrict_text() {
        return suspect_relative_current_subdistrict_text;
    }

    public void setSuspect_relative_current_subdistrict_text(String[] suspect_relative_current_subdistrict_text) {
        this.suspect_relative_current_subdistrict_text = suspect_relative_current_subdistrict_text;
    }

    public String[] getSuspect_relative_hometown_address_no() {
        return suspect_relative_hometown_address_no;
    }

    public void setSuspect_relative_hometown_address_no(String[] suspect_relative_hometown_address_no) {
        this.suspect_relative_hometown_address_no = suspect_relative_hometown_address_no;
    }

    public Long[] getSuspect_relative_hometown_moo() {
        return suspect_relative_hometown_moo;
    }

    public void setSuspect_relative_hometown_moo(Long[] suspect_relative_hometown_moo) {
        this.suspect_relative_hometown_moo = suspect_relative_hometown_moo;
    }

    public String[] getSuspect_relative_hometown_soi() {
        return suspect_relative_hometown_soi;
    }

    public void setSuspect_relative_hometown_soi(String[] suspect_relative_hometown_soi) {
        this.suspect_relative_hometown_soi = suspect_relative_hometown_soi;
    }

    public String[] getSuspect_relative_hometown_road() {
        return suspect_relative_hometown_road;
    }

    public void setSuspect_relative_hometown_road(String[] suspect_relative_hometown_road) {
        this.suspect_relative_hometown_road = suspect_relative_hometown_road;
    }

    public String[] getSuspect_relative_hometown_province_code() {
        return suspect_relative_hometown_province_code;
    }

    public void setSuspect_relative_hometown_province_code(String[] suspect_relative_hometown_province_code) {
        this.suspect_relative_hometown_province_code = suspect_relative_hometown_province_code;
    }

    public String[] getSuspect_relative_hometown_district_code() {
        return suspect_relative_hometown_district_code;
    }

    public void setSuspect_relative_hometown_district_code(String[] suspect_relative_hometown_district_code) {
        this.suspect_relative_hometown_district_code = suspect_relative_hometown_district_code;
    }

    public String[] getSuspect_relative_hometown_subdistrict_code() {
        return suspect_relative_hometown_subdistrict_code;
    }

    public void setSuspect_relative_hometown_subdistrict_code(String[] suspect_relative_hometown_subdistrict_code) {
        this.suspect_relative_hometown_subdistrict_code = suspect_relative_hometown_subdistrict_code;
    }

    public String[] getSuspect_relative_hometown_province_text() {
        return suspect_relative_hometown_province_text;
    }

    public void setSuspect_relative_hometown_province_text(String[] suspect_relative_hometown_province_text) {
        this.suspect_relative_hometown_province_text = suspect_relative_hometown_province_text;
    }

    public String[] getSuspect_relative_hometown_district_text() {
        return suspect_relative_hometown_district_text;
    }

    public void setSuspect_relative_hometown_district_text(String[] suspect_relative_hometown_district_text) {
        this.suspect_relative_hometown_district_text = suspect_relative_hometown_district_text;
    }

    public String[] getSuspect_relative_hometown_subdistrict_text() {
        return suspect_relative_hometown_subdistrict_text;
    }

    public void setSuspect_relative_hometown_subdistrict_text(String[] suspect_relative_hometown_subdistrict_text) {
        this.suspect_relative_hometown_subdistrict_text = suspect_relative_hometown_subdistrict_text;
    }

    public String getSexText(){
        if(getSex() != null)
        if(getSex().equals("0")){
            return "ชาย";
        }else{
            return "หญิง";
        }

        return "ไม่ระบุ";
    }

    public String getBloodText(){
        if(getBlood_type() != null)
        if(getBlood_type().equals("O")){
            return "โอ";
        }else if(getBlood_type().equals("A")){
            return "เอ";
        }else if(getBlood_type().equals("AB")){
            return "เอบี";
        }else if(getBlood_type().equals("B")){
            return "บี";
        }else{
            return "ไม่ระบุ";
        }

        return "ไม่ระบุ";
    }

    public String getMaritalText(){
        if(getMarital_status() != null)
         if(getMarital_status().equals("1")){
            return "โสด";
        }else if(getMarital_status().equals("2")){
            return "สมรส";
        }else if(getMarital_status().equals("3")){
            return "หม้าย";
        }else{
            return "หย่าร้าง";
        }

        return "ไม่ระบุ";
    }
}