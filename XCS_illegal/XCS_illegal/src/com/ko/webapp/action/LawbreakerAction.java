/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.webapp.action;

import com.ko.domain.*;
import com.ko.util.ConfigUtil;
import com.ko.util.RunningKey;
import org.json.JSONArray;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LawbreakerAction extends BaseAction {
    @Override
    public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
    }

    // change form by lawbreaker type
    public void changeForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Country cc = new Country(db);
        List cclist = cc.findAll();
        request.setAttribute("ccs", cclist);
        String lawbreaker_type_text = ServletRequestUtils.getStringParameter(request, "lawbreaker_type_text");
        if (lawbreaker_type_text == null) lawbreaker_type_text = "";
        String pageType = ServletRequestUtils.getStringParameter(request, "pageType");
        if (pageType == null) pageType = "lawbreaker_list";
        request.setAttribute("lawbreaker_type", lawbreaker_type_text);
        forward("?page=/Lawbreaker/" + pageType + ".jsp");
    }

    String menuID = "27";
    // list
    public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	if(uData.chkUserMenu(menuID)==true){
	    	Lawbreaker lawbreaker = new Lawbreaker(db);
	        // pageUtil.setPageSize(15);
	        String lawbreaker_id_card = ServletRequestUtils.getStringParameter(request, "lawbreaker_id_card");
	        String other_name = ServletRequestUtils.getStringParameter(request, "other_name");
	        String partial_name = ServletRequestUtils.getStringParameter(request, "partial_name");
	        String province_code = ServletRequestUtils.getStringParameter(request, "province_code");
	        String offcode = ServletRequestUtils.getStringParameter(request, "offcode");
	        String district_code = ServletRequestUtils.getStringParameter(request, "district_code");
	        String subdistrict_code = ServletRequestUtils.getStringParameter(request, "subdistrict_code");
	        String case_type = ServletRequestUtils.getStringParameter(request, "case_type");
	        String country_name = ServletRequestUtils.getStringParameter(request, "country_name");
	        String passport = ServletRequestUtils.getStringParameter(request, "lawbreaker_passport");
	        String lawbreaker_type = ServletRequestUtils.getStringParameter(request, "lawbreaker_type");
	        String corporation_code = ServletRequestUtils.getStringParameter(request, "corporation_code");
	        String license_no = ServletRequestUtils.getStringParameter(request, "license_no");
	        String excise_reg_no = ServletRequestUtils.getStringParameter(request, "excise_reg_no");
	        String company_name = ServletRequestUtils.getStringParameter(request, "company_name");
	        //gen query string
	        String query = "select distinct " + Lawbreaker.IDColumn + " from " + Lawbreaker.TABLE_NAME;
	        StringBuffer[] condition = new StringBuffer[2];
	        List<Object> listObjs = new ArrayList<Object>();
	        condition[0] = new StringBuffer();
	        condition[1] = new StringBuffer();
	        if (lawbreaker_id_card != null && !lawbreaker_id_card.equals("")) {
	            lawbreaker_id_card = lawbreaker_id_card.trim();
	            condition[1].append(" and " + Lawbreaker.LAWBREAKER_ID_CARDCol + "=?");
	            listObjs.add(new String(lawbreaker_id_card));
	        }
	        if (partial_name != null && !partial_name.equals("")) {
	            int findChar;
	            int a;
	            String firstname = "";
	            String lastname = "";
	            partial_name = partial_name.trim();
	            if ((findChar = partial_name.indexOf(" ")) >= 0) {
	                firstname = partial_name.substring(0, findChar);
	                lastname = partial_name.substring(findChar + 1, partial_name.length());
	                //condition[1].append(" and " + " (" + Lawbreaker.FIRST_NAMEColumn + " like ? or " + Lawbreaker.LAST_NAMEColumn + " like ? or " + Lawbreaker.MIDDLE_NAMEColumn + " like ? ) ");
	                condition[1].append(" and " + " (" + Lawbreaker.FIRST_NAMEColumn + " like ? ");
	                listObjs.add(new String("%" + firstname + "%"));
	                condition[1].append("and " + Lawbreaker.LAST_NAMEColumn + " like ?)");
	                listObjs.add(new String("%" + lastname + "%"));
	                log.debug("firstname=" + firstname);
	                log.debug("lastname=" + lastname);
	                //listObjs.add(new String("%" + partial_name + "%"));
	
	            } else {
	                condition[1].append(" and " + " (" + Lawbreaker.FIRST_NAMEColumn + " like ? or " + Lawbreaker.LAST_NAMEColumn + " like ? or " + Lawbreaker.MIDDLE_NAMEColumn + " like ? ) ");
	                listObjs.add(new String("%" + partial_name + "%"));
	                listObjs.add(new String("%" + partial_name + "%"));
	                listObjs.add(new String("%" + partial_name + "%"));
	            }
	        }
	        if (other_name != null && !other_name.equals("")) {
	            other_name = other_name.trim();
	            condition[1].append(" and " + Lawbreaker.OTHER_NAMEColumn + " like ?");
	            listObjs.add(new String("%" + other_name + "%"));
	        }
	        if (province_code != null && !province_code.equals("0") && !province_code.equals("")) {
	            condition[1].append(" and " + Lawbreaker.PROVINCE_CODEColumn + "=?");
	            listObjs.add(new String(province_code));
	        }
	        if (district_code != null && !district_code.equals("0") && !district_code.equals("")) {
	            condition[1].append(" and " + Lawbreaker.DISTRICT_CODEColumn + "=?");
	            listObjs.add(new String(district_code));
	        }
	        if (subdistrict_code != null && !subdistrict_code.equals("0") && !subdistrict_code.equals("")) {
	            condition[1].append(" and " + Lawbreaker.SUBDISTRICT_CODEColumn + "=?");
	            listObjs.add(new String(subdistrict_code));
	        }
	        if (passport != null && !passport.equals("")) {
	            passport = passport.trim();
	            condition[1].append(" and " + Lawbreaker.LAWBREAKER_PASSPORTColumn + "=?");
	            listObjs.add(new String(passport));
	        }
	        if (country_name != null && !country_name.equals("")) {
	            country_name = country_name.trim();
	            condition[1].append(" and " + Lawbreaker.PASSPORT_COUNTRYColumn + " like ? ");
	            listObjs.add(new String("%" + country_name + "%"));
	        }
	        if (corporation_code != null && !corporation_code.equals("")) {
	            corporation_code = corporation_code.trim();
	            condition[1].append(" and " + Lawbreaker.CORPORATION_CODEColumn + "=?");
	            listObjs.add(new String(corporation_code));
	        }
	        if (excise_reg_no != null && !excise_reg_no.equals("")) {
	            excise_reg_no = excise_reg_no.trim();
	            condition[1].append(" and " + Lawbreaker.EXCISE_REG_NOColumn + "=?");
	            listObjs.add(new String(excise_reg_no));
	        }
	        if (license_no != null && !license_no.equals("")) {
	            license_no = license_no.trim();
	            condition[1].append(" and " + Lawbreaker.LICENSE_NOColumn + "=?");
	            listObjs.add(new String(license_no));
	        }
	        if (company_name != null && !company_name.equals("")) {
	            company_name = company_name.trim();
	            condition[1].append(" and " + Lawbreaker.COMPANY_NAMEColumn + " like ? ");
	            listObjs.add(new String("%" + company_name + "%"));
	        }
	
	        List<Lawbreaker> lawbreakers = null;
	        if (!condition[0].toString().equals("") || !condition[1].toString().equals("")) {
	            condition[0].append(" where " + Lawbreaker.LAWBREAKER_TYPEColumn + "='" + lawbreaker_type + "' and " + Lawbreaker.DEL_FLAGColumn + "='N' ");
	            condition[0].append(condition[1].toString());
	            query += condition[0].toString();
	            Object[] objs = new Object[listObjs.size()];
	            listObjs.toArray(objs);
	
	            int totalCount = lawbreaker.countBySql(query.replace(Lawbreaker.IDColumn, "count(" + Lawbreaker.IDColumn + ")"), objs);
	            pageUtil.setTotalRow(totalCount);
	            pageUtil.setPageSize(20);
	            List<Map<String, Object>> listId = lawbreaker.findBySql(query, objs, pageUtil);
	            log.debug("mu********" + query + objs);
	            log.debug(listId);
	            lawbreakers = new ArrayList<Lawbreaker>();
	            if (listId.size() > 0) {
	                for (int i = 0; i < listId.size(); i++) {
	                    long id = ((BigDecimal) listId.get(i).get("id")).longValue();
	                    lawbreakers.add(lawbreaker.findByPk(id));
	                }
	            }
	        } else {
	            int totalCount = lawbreaker.countByWhere(Lawbreaker.LAWBREAKER_TYPECol + "=? and " + Lawbreaker.DEL_FLAGCol + "='N'", lawbreaker_type);
	            pageUtil.setTotalRow(totalCount);
	            pageUtil.setPageSize(20);
	            lawbreakers = lawbreaker.findByWhere(Lawbreaker.LAWBREAKER_TYPECol + "=? and " + Lawbreaker.DEL_FLAGCol + "='N'", lawbreaker_type, pageUtil);
	        }
	        //List<Map<String,Object>> searchResult = lawbreaker.
	
	        Country cc = new Country(db);
	        List<Country> cclist = cc.findByWhere(" 1=1 order by " + Country.COUNTRY_NAMECol, null);
	        request.setAttribute("ccs", cclist);
	        //log.debug("cclist="+cclist);
	        //	for data to display
	        request.setAttribute("lawbreakers", lawbreakers);
	        request.setAttribute("lawbreaker_type", ServletRequestUtils.getStringParameter(request, "lawbreaker_type"));
	        //	for screen to show
	        //forward("?page=/web/lawbreakerList.jsp");
	        String lawbreaker_type_text = ServletRequestUtils.getStringParameter(request, "lawbreaker_type_text");
	        if (lawbreaker_type_text == null) lawbreaker_type_text = "";
	        forward("?page=/Lawbreaker/lawbreaker_list.jsp");
    	}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
    }

    private void stampTranLog(Lawbreaker lawbreaker) throws Exception {
        if (lawbreaker.getLawbreaker_type().equals("1")) {
            writeTranLog("บันทึกประวัติผู้กระทำผิดคนไทย");
        } else if (lawbreaker.getLawbreaker_type().equals("2")) {
            writeTranLog("บันทึกประวัติผู้กระทำผิดชาวต่างชาติ");
        } else {
            writeTranLog("บันทึกประวัติผู้กระทำผิดผู้ประกอบการ");
        }
    }

    public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Lawbreaker lawbreaker = new Lawbreaker(db);
        bindForm(lawbreaker);
        log.debug("image size in configure file is " + ConfigUtil.getImageSize(db));
        if (lawbreaker != null && lawbreaker.getLink_photo() != null) {
            log.debug("Photo length for update is " + lawbreaker.getLink_photo().length());
            if (lawbreaker.getLink_photo().length() > ConfigUtil.getImageSize(db)) {
                request.setAttribute("lawbreaker_type", lawbreaker.getLawbreaker_type());
                request.setAttribute("lawbreaker_form", lawbreaker.getLawbreaker_type());
                Relation re = new Relation(db);
                //re.findByWhere("1 = 1 order by "+Relation.RELATION_NAMECol,null);
                request.setAttribute("res", re.findBySql("select relation_code, relation_name from ralation order by relation_name"));
                //request.setAttribute("res", re.findAll());
                Nationality nt = new Nationality(db);
                request.setAttribute("nts", nt.findByWhere("1 = 1 order by " + Nationality.NATION_NAMECol, null));
                //request.setAttribute("nts", nt.findAll());
                Race r = new Race(db);
                //request.setAttribute("rs", r.findAll());
                request.setAttribute("rs", r.findByWhere("1=1 order by " + Race.RACE_NAMECol, null));


                Religion rel = new Religion(db);
                //request.setAttribute("rels", rel.findAll());
                request.setAttribute("rels", rel.findByWhere("1=1 order by " + Religion.RELIGION_NAMECol, null));

                Title t = new Title(db);
                request.setAttribute("titles", t.findByWhere(Title.TITLE_TYPECol + "=? order by " + Title.TITLE_NAMECol, "1"));
                request.setAttribute("comptitles", t.findByWhere(Title.TITLE_TYPECol + "=? order by " + Title.TITLE_NAMECol, "2"));
                //*
                request.setAttribute("error", "ไฟล์รูปภาพมีขนาดใหญ่เกินกว่าที่กำหนด");
                Country cc = new Country(db);
                List<Country> cclist = cc.findByWhere(" 1=1 order by " + Country.COUNTRY_NAMECol, null);
                request.setAttribute("ccs", cclist);
                JSONArray jsonArr = new JSONArray(cclist);
                request.setAttribute("countryJson", jsonArr.toString());
                Province province = new Province(db);
                List<Province> provinces = province.findByWhere(" 1=1 order by " + Province.PROVINCE_NAMECol, null);
                request.setAttribute("provinces", provinces);
                request.setAttribute("lawbreaker", lawbreaker);
                forward("?page=/Lawbreaker/lawbreaker_edit_tmp.jsp");
                return;

            }
        }
        if (lawbreaker.getReligion_id() != null && lawbreaker.getReligion_id().longValue() == 0) {
            lawbreaker.setReligion_id(null);
        }
        if (lawbreaker.getRace_id() != null && lawbreaker.getRace_id().longValue() == 0) {
            lawbreaker.setRace_id(null);
        }
        if (lawbreaker.getNation_id() != null && lawbreaker.getNation_id().longValue() == 0) {
            lawbreaker.setNation_id(null);
        }
        lawbreaker.setHeight((request.getParameter("height") != null ? request.getParameter("height").toString() : null));
        lawbreaker.setCoordinate_x((request.getParameter("coordinate_x") != null ? new Long(request.getParameter("coordinate_x").toString()) : null));
        lawbreaker.setCoordinate_y((request.getParameter("coordinate_y") != null ? new Long(request.getParameter("coordinate_y").toString()) : null));
        lawbreaker.setMoo((request.getParameter("moo") != null ? new Long(request.getParameter("moo").toString()) : null));
        stampTranLog(lawbreaker);
        lawbreaker.setCreate_date(create_on);
        //lawbreaker.setModify_date(update_on);
        lawbreaker.setCreate_id(create_by);
        lawbreaker.setLawbreaker_no(System.currentTimeMillis());
        lawbreaker.setDel_flag("N");
        lawbreaker = lawbreaker.create();
        if (lawbreaker != null) {
            lawbreaker.setLawbreaker_no(lawbreaker.getId());
            lawbreaker.update();
            // check for lawbreaker address.
            addLawbreakerAddress(lawbreaker);
            // check for lawbreaker relative.
            addLawbreakerRelative(lawbreaker);
            request.setAttribute("completed", lawbreaker.getId());
            request.setAttribute("lawbreaker", lawbreaker);
            //formHandler.setFormMessage("Create Completed ,view <a href='process?action=Lawbreaker&cmd=edit&id=" + lawbreaker.getId() + "' target='_blank'>new Record</a>");
        }
        //else
        //formHandler.setFormMessage("Create Not Complete");
        String lawbreaker_type = lawbreaker.getLawbreaker_type();
        request.setAttribute("lawbreaker_type", lawbreaker_type);
        redirect("process?action=Lawbreaker&completed=completed&cmd=edit&id=" + lawbreaker.getId());
    }

    public void addLawbreakerRelative(Lawbreaker lawbreaker) {
        LawbreakerRelatif sr = new LawbreakerRelatif(db);
        try {

            List<LawbreakerRelatif> presentLawbreakerRelatifList = sr.findByWhere(LawbreakerRelatif.LAWBREAKER_NOCol + "=?", lawbreaker.getLawbreaker_no());
            if (lawbreaker.getLawbreaker_relative_id() != null) {
                for (int i = 0; i < lawbreaker.getLawbreaker_relative_count().length; i++) {
                    if (lawbreaker.getLawbreaker_relative_id() != null && lawbreaker.getLawbreaker_relative_id().length > i
                            && lawbreaker.getLawbreaker_relative_id()[i] != null && !lawbreaker.getLawbreaker_relative_id()[i].equals("")) {
                        // get lawbreaker relative object from database and update value.
                        // find id from presentLawbreakerRelatifList and remove it from list.
                        for (LawbreakerRelatif s : presentLawbreakerRelatifList) {
                            if (s.getId().longValue() == (new Long(lawbreaker.getLawbreaker_relative_id()[i])).longValue()) {
                                updateLawbreakerRelativeFromWebForm(s, lawbreaker, i);
                                s.update();
                                presentLawbreakerRelatifList.remove(s);
                                break;
                            }
                        }
                    } else {
                        // this is new lawbreaker relative.
                        LawbreakerRelatif newLawbreakerRelative = new LawbreakerRelatif(db);
                        updateLawbreakerRelativeFromWebForm(newLawbreakerRelative, lawbreaker, i);
                        newLawbreakerRelative.setLawbreaker_no(lawbreaker.getLawbreaker_no());
                        newLawbreakerRelative.setCreate_by(create_by);
                        newLawbreakerRelative.setCreate_on(create_on);
                        newLawbreakerRelative.setUpdate_by(update_by);
                        newLawbreakerRelative.setUpdate_on(update_on);
                        newLawbreakerRelative.create();
                    }


                }
            }
            for (LawbreakerRelatif s : presentLawbreakerRelatifList) {
                s.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void addLawbreakerAddress(Lawbreaker lawbreaker) {
        LawbreakerAddress sa = new LawbreakerAddress(db);
        try {
            List<LawbreakerAddress> presentLawbreakerAddressList = sa.findByWhere(LawbreakerAddress.LAWBREAKER_NOCol + "=?", lawbreaker.getLawbreaker_no());
            if (lawbreaker.getLawbreaker_address_id() != null) {
                for (int i = 0; i < lawbreaker.getLawbreaker_address_count().length; i++) {
                    if (lawbreaker.getLawbreaker_address_id() != null && lawbreaker.getLawbreaker_address_id().length > i
                            && lawbreaker.getLawbreaker_address_id()[i] != null && !lawbreaker.getLawbreaker_address_id()[i].equals("")) {
                        // get lawbreaker address object from database and update value.
                        // find id from presentLawbreakerAddressList and remove it from list.
                        for (LawbreakerAddress s : presentLawbreakerAddressList) {
                            if (s.getId().longValue() == (new Long(lawbreaker.getLawbreaker_address_id()[i])).longValue()) {
                                updateLawbreakerAddressFromWebForm(s, lawbreaker, i);
                                s.update();
                                presentLawbreakerAddressList.remove(s);
                                break;
                            }
                        }
                    } else {
                        // this is new lawbreaker address.
                        LawbreakerAddress newLawbreakerAddress = new LawbreakerAddress(db);
                        updateLawbreakerAddressFromWebForm(newLawbreakerAddress, lawbreaker, i);
                        //newLawbreakerAddress.setAddress_no();
                        newLawbreakerAddress.create();
                    }


                }
            }
            for (LawbreakerAddress s : presentLawbreakerAddressList) {
                s.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void updateLawbreakerAddressFromWebForm(LawbreakerAddress s, Lawbreaker form, int index) {
        s.setDescription(form.getLawbreaker_address_description()[index]);
        s.setAddress(form.getLawbreaker_address_address()[index]);
        s.setAddress_name(form.getLawbreaker_address_address_name()[index]);
        s.setMoo(form.getLawbreaker_address_moo()[index]);
        s.setSoi(form.getLawbreaker_address_soi()[index]);
        s.setRoad(form.getLawbreaker_address_road()[index]);
        s.setProvince_code(form.getLawbreaker_address_province_code()[index]);
        s.setDistric_code(form.getLawbreaker_address_district_code()[index]);
        s.setSubdistric_code(form.getLawbreaker_address_subdistrict_code()[index]);
        s.setTel_no(form.getLawbreaker_address_tel_no()[index]);
        s.setFax_no(form.getLawbreaker_address_fax_no()[index]);
        s.setZipcode(form.getLawbreaker_address_zipcode()[index]);
        s.setLawbreaker_no(form.getLawbreaker_no());
        s.setCoordinate_x(form.getLawbreaker_address_coordinate_x()[index]);
        s.setCoordinate_y(form.getLawbreaker_address_coordinate_y()[index]);
    }

    public void updateLawbreakerRelativeFromWebForm(LawbreakerRelatif s, Lawbreaker form, int index) {
        s.setRelation(form.getLawbreaker_relative_relation()[index]);
        s.setTitle_code(form.getLawbreaker_relative_title_code()[index]);
        s.setIdcardno(form.getLawbreaker_relative_idcardno()[index]);
        s.setFirst_name(form.getLawbreaker_relative_first_name()[index]);
        s.setLast_name(form.getLawbreaker_relative_last_name()[index]);
        s.setTel(form.getLawbreaker_relative_tel_no()[index]);
        s.setEmail(form.getLawbreaker_relative_email()[index]);
        s.setCurrent_address_no(form.getLawbreaker_relative_current_address_no()[index]);
        s.setCurrent_moo(form.getLawbreaker_relative_current_moo()[index]);
        s.setCurrent_soi(form.getLawbreaker_relative_current_soi()[index]);
        s.setCurrent_road(form.getLawbreaker_relative_current_road()[index]);
        s.setCurrent_province_code(form.getLawbreaker_relative_current_province_code()[index]);
        s.setCurrent_district_code(form.getLawbreaker_relative_current_district_code()[index]);
        s.setCurrent_subdistrict_code(form.getLawbreaker_relative_current_subdistrict_code()[index]);
        s.setHometown_address_no(form.getLawbreaker_relative_hometown_address_no()[index]);
        s.setHometown_moo(form.getLawbreaker_relative_hometown_moo()[index]);
        s.setHometown_soi(form.getLawbreaker_relative_hometown_soi()[index]);
        s.setHometown_road(form.getLawbreaker_relative_hometown_road()[index]);
        s.setHometown_province_code(form.getLawbreaker_relative_hometown_province_code()[index]);
        s.setHometown_district_code(form.getLawbreaker_relative_hometown_district_code()[index]);
        s.setHometown_subdistrict_code(form.getLawbreaker_relative_hometown_subdistrict_code()[index]);
        s.setLawbreaker_no(form.getLawbreaker_no());
    }


    // view
    public void view(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        if (id != null && !id.trim().equals("")) {
            Lawbreaker lawbreaker = new Lawbreaker(db);
            lawbreaker = lawbreaker.findByPk(new Long(id));
            if (lawbreaker != null) {
                request.setAttribute("lawbreaker", lawbreaker);
            } else {
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        } else {
            formHandler.setFormMessage("Error : Please Enter id");
        }
        forward("?page=/web/lawbreakerView.jsp");
    }

    // update
    public void edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        String completed = request.getParameter("completed");
        if (completed != null)
            request.setAttribute("completed", "completed");
        if (id != null && !id.trim().equals("")) {
            Lawbreaker lawbreaker = new Lawbreaker(db);
            lawbreaker = lawbreaker.findByPk(new Long(id));
            if (lawbreaker != null) {
                request.setAttribute("lawbreaker_form", lawbreaker.getLawbreaker_type());
                request.setAttribute("lawbreaker", lawbreaker);
                // get all lawbreaker address
                LawbreakerAddress sa = new LawbreakerAddress(db);
                LawbreakerRelatif sr = new LawbreakerRelatif(db);
                List<LawbreakerAddress> sas = sa.findByWhere(LawbreakerAddress.LAWBREAKER_NOCol + "=?", lawbreaker.getLawbreaker_no());
                List<LawbreakerRelatif> srs = sr.findByWhere(LawbreakerRelatif.LAWBREAKER_NOCol + "=?", lawbreaker.getLawbreaker_no());
                request.setAttribute("sas", sas);
                request.setAttribute("srs", srs);
            } else {
                request.setAttribute("lawbreaker_form", "1");
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        }
        //forward("?page=/web/lawbreakerEdit.jsp");
        // get all beans
        //*
        Relation re = new Relation(db);
        //re.findByWhere("1 = 1 order by "+Relation.RELATION_NAMECol,null);
        request.setAttribute("res", re.findByWhere("1 = 1 order by " + Relation.RELATION_NAMECol, null));
        //request.setAttribute("res", re.findAll());
        Nationality nt = new Nationality(db);
        request.setAttribute("nts", nt.findByWhere("1 = 1 order by " + Nationality.NATION_NAMECol, null));
        //request.setAttribute("nts", nt.findAll());
        Race r = new Race(db);
        //request.setAttribute("rs", r.findAll());
        request.setAttribute("rs", r.findByWhere("1=1 order by " + Race.RACE_NAMECol, null));
        Religion rel = new Religion(db);
        //request.setAttribute("rels", rel.findAll());
        request.setAttribute("rels", rel.findByWhere("1=1 order by " + Religion.RELIGION_NAMECol, null));
        Title t = new Title(db);
        request.setAttribute("titles", t.findByWhere(Title.TITLE_TYPECol + "=?  order by " + Title.TITLE_NAMECol, "1"));
        request.setAttribute("comptitles", t.findByWhere(Title.TITLE_TYPECol + "=?  order by " + Title.TITLE_NAMECol, "2"));
        //*
        Country cc = new Country(db);
        List<Country> cclist = cc.findByWhere(" 1=1 order by " + Country.COUNTRY_NAMECol, null);
        request.setAttribute("ccs", cclist);
        org.json.JSONArray jsonArr = new org.json.JSONArray(cclist);
        request.setAttribute("countryJson", jsonArr.toString());
        Province province = new Province(db);
        List<Province> provinces = province.findByWhere(" 1=1 order by " + Province.PROVINCE_NAMECol, null);
        request.setAttribute("provinces", provinces);
        //forward("?page=/Lawbreaker/lawbreaker_edit"+form+".jsp");
        forward("?page=/Lawbreaker/lawbreaker_edit_tmp.jsp");
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Lawbreaker lawbreaker = new Lawbreaker(db);
        bindForm(lawbreaker);
        if (lawbreaker.getReligion_id() != null && lawbreaker.getReligion_id().longValue() == 0) {
            lawbreaker.setReligion_id(null);
        }
        if (lawbreaker.getRace_id() != null && lawbreaker.getRace_id().longValue() == 0) {
            lawbreaker.setRace_id(null);
        }
        if (lawbreaker.getNation_id() != null && lawbreaker.getNation_id().longValue() == 0) {
            lawbreaker.setNation_id(null);
        }
        stampTranLog(lawbreaker);
        //log.debug(request.getParameter("height").toString() + " FFFFFFFFFFFFFFFFFFFFFFFFF");
        
        Lawbreaker lawbreaker2 = lawbreaker.findByPk(lawbreaker.getId());
        lawbreaker.setCreate_date(lawbreaker2.getCreate_date());
        if (lawbreaker.getLink_photo().length() == 0 && lawbreaker2.getLink_photo() != null) {
            lawbreaker.setLink_photo(lawbreaker2.getLink_photo());
        }
        //lawbreaker.setHeight((request.getParameter("height") != null ? request.getParameter("height").toString() : null));
        lawbreaker.setCoordinate_x((request.getParameter("coordinate_x") != null ? new Long(request.getParameter("coordinate_x").toString()) : null));
        lawbreaker.setCoordinate_y((request.getParameter("coordinate_y") != null ? new Long(request.getParameter("coordinate_y").toString()) : null));
        lawbreaker.setMoo((request.getParameter("moo") != null ? new Long(request.getParameter("moo").toString()) : null));
        lawbreaker.setModify_date(update_on);
        lawbreaker.setModify_id(update_by);
        lawbreaker = lawbreaker.update();
        if (lawbreaker != null) {
            request.setAttribute("lawbreaker", lawbreaker);
            request.setAttribute("completed", "completed");
            addLawbreakerAddress(lawbreaker);
            addLawbreakerRelative(lawbreaker);
            //formHandler.setFormMessage("Update Completed");
        } else {
            formHandler.setFormMessage("Update Failed");
        }
        //forward("?page=/Lawbreaker/lawbreaker_edit_tmp.jsp");
        redirect("process?action=Lawbreaker&completed=completed&cmd=edit&id=" + lawbreaker.getId());
    }

    // delete
    public void delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] ids = request.getParameterValues("id");
        if (ids != null && ids.length > 0) {
            Lawbreaker lawbreaker = new Lawbreaker(db);
            List<Long> idList = new ArrayList<Long>();
            for (int i = 0; i < ids.length; i++)
                idList.add(new Long(ids[i]));
            int deleteRow = lawbreaker.deleteByPks(idList);
            formHandler.setFormMessage(" Delete " + deleteRow + " Row Completed ");
        } else {
            formHandler.setFormMessage("Plese Select At Least One For Delete");
        }
        redirect("process?action=Lawbreaker&cmd=list");
    }

    public void deleteLawbreaker(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Long id = ServletRequestUtils.getLongParameter(request, "id");
        Lawbreaker sp = new Lawbreaker(db);
        sp = sp.findByPk(id);
        sp.setDel_flag("Y");
        sp.update();
        redirect("process?action=Lawbreaker&cmd=list&lawbreaker_type=" + sp.getLawbreaker_type());
    }

    private String getStr(Object stringObj) {
        return (stringObj == null) ? "" : stringObj.toString();
    }


    public void createForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String lawbreakerType = ServletRequestUtils.getStringParameter(request, "lawbreakerType");
        if (lawbreakerType == null) lawbreakerType = "1";
        if (lawbreakerType.equals("1")) {
            writeTranLog("เพิ่มประวัติผู้กระทำผิดคนไทย");
        } else if (lawbreakerType.equals("2")) {
            writeTranLog("เพิ่มประวัติผู้กระทำผิดชาวต่างชาติ");
        } else {
            writeTranLog("เพิ่มประวัติผู้กระทำผิดผู้ประกอบการ");
        }
        Relation re = new Relation(db);
        request.setAttribute("res", re.findByWhere(" 1=1 order by " + Relation.RELATION_NAMECol, null));
        Nationality nt = new Nationality(db);
        request.setAttribute("nts", nt.findByWhere(" 1=1 order by " + Nationality.NATION_NAMECol, null));
        Race r = new Race(db);
        request.setAttribute("rs", r.findByWhere(" 1=1 order by " + Race.RACE_NAMECol, null));
        Religion rel = new Religion(db);
        request.setAttribute("rels", rel.findByWhere(" 1=1 order by " + Religion.RELIGION_NAMECol, null));
        Province province = new Province(db);
        request.setAttribute("provinces", province.findByWhere(" 1=1 order by " + Province.PROVINCE_NAMECol, null));
        Title t = new Title(db);
        request.setAttribute("titles", t.findByWhere(Title.TITLE_TYPECol + "=? order by " + Title.TITLE_NAMECol, "1"));
        request.setAttribute("comptitles", t.findByWhere(Title.TITLE_TYPECol + "=? order by " + Title.TITLE_NAMECol, "2"));
        Country cc = new Country(db);
        List<Country> cclist = cc.findByWhere(" 1=1 order by " + Country.COUNTRY_NAMECol, null);
        request.setAttribute("ccs", cclist);
        String lawbreakerTypeText = (lawbreakerType.equals("2") ? "_eng" : lawbreakerType.equals("3") ? "_business" : "");
        request.setAttribute("lawbreaker_form", lawbreakerType);
        request.setAttribute("lawbreaker_type", lawbreakerType);
        request.setAttribute("lawbreaker_type_text", lawbreakerTypeText);
        org.json.JSONArray jsonArr = new org.json.JSONArray(cclist);
        request.setAttribute("countryJson", jsonArr.toString());
        //forward("?page=/Lawbreaker/lawbreaker_form"+lawbreakerTypeText+".jsp");
        forward("?page=/Lawbreaker/lawbreaker_edit_tmp.jsp");
    }

    public void openLawbreakerRelatifPopup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Relation re = new Relation(db);
        LawbreakerRelatif sr = new LawbreakerRelatif(db);
        Lawbreaker s = new Lawbreaker(db);
        bindForm(s);
        if (s.getLawbreaker_relative_count() != null && s.getLawbreaker_relative_count().length > 0) {
            updateLawbreakerRelativeFromWebForm(sr, s, 0);
            request.setAttribute("sr", sr);
        }
        request.setAttribute("rels", re.findAll());
        Title t = new Title(db);
        request.setAttribute("titles", t.findByWhere(Title.TITLE_TYPECol + "=? order by " + Title.TITLE_NAMECol, "1"));
        if (request.getParameter("rowId") != null)
            request.setAttribute("row", request.getParameter("rowId"));
        if (request.getParameter("maxRow") != null)
            request.setAttribute("maxRow", request.getParameter("maxRow"));
        forward("/Popup/lawbreaker_other_relative_form.jsp", request, response);
        //forward("/Popup/lawbreaker_relative_form.jsp", request, response);
    }


    public void openLawbreakerAddressPopup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        LawbreakerAddress sa = new LawbreakerAddress(db);
        Lawbreaker s = new Lawbreaker(db);
        bindForm(s);
        if (s.getLawbreaker_address_count() != null && s.getLawbreaker_address_count().length > 0) {
            updateLawbreakerAddressFromWebForm(sa, s, 0);
            request.setAttribute("sa", sa);

        }
        if (request.getParameter("rowId") != null)
            request.setAttribute("row", request.getParameter("rowId"));
        if (request.getParameter("maxRow") != null)
            request.setAttribute("maxRow", request.getParameter("maxRow"));
        forward("/Popup/lawbreaker_other_address_form.jsp", request, response);
    }

    public void idcardSearchEdit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String lawbreaker_id_card = ServletRequestUtils.getStringParameter(request, "lawbreaker_id_card");
        Long id = ServletRequestUtils.getLongParameter(request, "id");
        String lawbreaker_type = ServletRequestUtils.getStringParameter(request, "lawbreaker_type");
        Lawbreaker s = new Lawbreaker(db);
        List<Map<String, Object>> result = s.findBySql("select id from lawbreaker where lawbreaker_id_card=?", lawbreaker_id_card);
        if (result.size() > 0) {
            String lawbreaker_id = result.get(0).get("id").toString();
            request.setAttribute("id", lawbreaker_id);
            redirect("process?action=Lawbreaker&cmd=edit");
        } else {
            if (id != null && id.longValue() > 0) {
                request.setAttribute("id", id);
                redirect("process?action=Lawbreaker&cmd=edit");
            } else {
                request.setAttribute("lawbreakerType", lawbreaker_type);
                redirect("process?action=Lawbreaker&cmd=createForm");
            }
        }
    }
}