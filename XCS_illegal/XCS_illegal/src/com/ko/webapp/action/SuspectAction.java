/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.webapp.action;

import com.ko.domain.*;
import com.ko.util.ConfigUtil;
import com.ko.util.DateUtil;

import org.json.JSONArray;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.*;

public class SuspectAction extends BaseAction {
	String menuID = "1";
	long startTime = 0l;
	
    @Override
    public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
    }

    // change form by suspect type
    public void changeForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String suspect_type_text = ServletRequestUtils.getStringParameter(request, "suspect_type_text");
        if (suspect_type_text == null) suspect_type_text = "";
        String pageType = ServletRequestUtils.getStringParameter(request, "pageType");
        if (pageType == null) pageType = "suspect_list";
        request.setAttribute("suspect_type", suspect_type_text);
        forward("?page=/Suspect/" + pageType + ".jsp");
    }

    // list
    public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
    	if(uData.chkUserMenu(menuID)==true){
	    	if (request.getParameter("doSearch") != null) {
	    		String menuID = "1";
	    		String whAuth = "";  //ใช้สำหรับตรวจสอบการแสดงผลตามสิทธิ์การใช้งาน
	    		if (uData.chkUserRole(new Long(ConfigUtil.getConfig("AdminRoleID")))==false){
	            	//ผู้ที่เป็นผู้บังคับบัญชา สามารถดูข้อมูลของผู้ใต้บังคับบัญชาได้
	    			whAuth += " and (to_char(create_id) in (" + uData.getSqlSubOrdinate(uData.getIdCard(), menuID) + ") ";
	    			whAuth += " or to_char(create_id) = '" + uData.getIdCard() + "')";
	            }
	    		
	    		
	            Suspect suspect = new Suspect(db);
	            // pageUtil.setPageSize(15);
	            String suspect_id_card = ServletRequestUtils.getStringParameter(request, "suspect_id_card");
	            String other_name = ServletRequestUtils.getStringParameter(request, "other_name");
	            String partial_name = ServletRequestUtils.getStringParameter(request, "partial_name");
	            String province_code = ServletRequestUtils.getStringParameter(request, "province_code");
	            String offcode = ServletRequestUtils.getStringParameter(request, "offcode");
	            String district_code = ServletRequestUtils.getStringParameter(request, "district_code");
	            String subdistrict_code = ServletRequestUtils.getStringParameter(request, "subdistrict_code");
	            String case_type = ServletRequestUtils.getStringParameter(request, "case_type");
	            String country_name = ServletRequestUtils.getStringParameter(request, "country_name");
	            String passport = ServletRequestUtils.getStringParameter(request, "suspect_passport");
	            String suspect_type = ServletRequestUtils.getStringParameter(request, "suspect_type");
	            String corporation_code = ServletRequestUtils.getStringParameter(request, "corporation_code");
	            String license_no = ServletRequestUtils.getStringParameter(request, "license_no");
	            String excise_reg_no = ServletRequestUtils.getStringParameter(request, "excise_reg_no");
	            String company_name = ServletRequestUtils.getStringParameter(request, "company_name");
	
	            //gen query string
	            String queryField = "";
	            String whText = "";
	            //StringBuffer[] condition = new StringBuffer[2];
	            List<Object> listObjs = new ArrayList<Object>();
	            //condition[0] = new StringBuffer();
	            //condition[1] = new StringBuffer();
	            String query = "select distinct " + Suspect.IDColumn + " from " + Suspect.TABLE_NAME;
	            String countSql = "";
	            if (suspect_type.equals("1")) {
	                queryField = "select distinct s.id, s.suspect_no, nvl(t.SHORT_TITLE,'') || s.FIRST_NAME || ' ' || s.LAST_NAME full_text_name, s.SUSPECT_ID_CARD suspect_id_card,\n" +
	                        " case when s.birth_date is null then '' else to_char(s.birth_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') || '(' || (to_char(sysdate,'yyyy')-to_char(s.birth_date,'yyyy')) || ')' end birthdate_age,\n" +
	                        " pke_master.getSuspectSceneAddress(s.suspect_no) full_address, s.SUSPECT_TYPE \n" +
	                		" from suspect s left join title t on t." + Title.TITLE_CODECol + "=s." + Suspect.TITLE_CODECol + "\n" +
	                		" left join suspect_investigate si on si.suspect_no=s.suspect_no " +
	                		" where s.suspect_type='1' and s.del_flag<>'Y' ";
	               
	                log.debug(queryField);
	                
	                countSql = "select count(*) from suspect s " +
	                		" left join title t on t." + Title.TITLE_CODECol + "=s." + Suspect.TITLE_CODECol +
	                		" left join suspect_investigate si on si.suspect_no=s.suspect_no " +
	                		" where s.suspect_type='1' and s.del_flag<>'Y' ";
	            } else if (suspect_type.equals("2")) {
	                queryField = "select distinct s.id,s.suspect_no, nvl(t.SHORT_TITLE,'') || s.FIRST_NAME || ' ' || s.LAST_NAME full_text_name, s.SUSPECT_ID_CARD suspect_id_card,\n" +
	                        " case when s.birth_date is null then '' else to_char(s.birth_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') || '(' || (to_char(sysdate,'yyyy')-to_char(s.birth_date,'yyyy')) || ')' end birthdate_age,\n" +
	                        " pke_master.getSuspectSceneAddress(s.suspect_no) full_address, s.SUSPECT_TYPE, s.SUSPECT_PASSPORT , c.COUNTRY_NAME country \n" +
	                        " from suspect s left join title t on t." + Title.TITLE_CODECol + "=s." + Suspect.TITLE_CODECol +
	                        " left join " + Country.TABLE_NAME + " c on c." + Country.COUNTRY_CODECol + "=s." + Suspect.PASSPORT_COUNTRYCol +
	                        " left join suspect_investigate si on si.suspect_no=s.suspect_no " +
	                        " where s.suspect_type='2' and s.del_flag<>'Y' ";
	                
	                countSql = "select count(*) from suspect s " +
			        		" left join title t on t." + Title.TITLE_CODECol + "=s." + Suspect.TITLE_CODECol +
			        		" left join " + Country.TABLE_NAME + " c on c." + Country.COUNTRY_CODECol + "=s." + Suspect.PASSPORT_COUNTRYCol +
			        		" left join suspect_investigate si on si.suspect_no=s.suspect_no " +
			        		" where s.suspect_type='2' and s.del_flag<>'Y' ";
	            } else if (suspect_type.equals("3")) {
	                queryField = "select distinct s.id,s.suspect_no, nvl(t.SHORT_TITLE,'') || s.FIRST_NAME || ' ' || s.LAST_NAME full_text_name, s.SUSPECT_ID_CARD suspect_id_card,\n" +
	                        " case when s.birth_date is null then '' else to_char(s.birth_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') || '(' || (to_char(sysdate,'yyyy')-to_char(s.birth_date,'yyyy')) || ')' end birthdate_age,\n" +
	                        " pke_master.getSuspectSceneAddress(s.suspect_no) full_address, s.SUSPECT_TYPE ,\n" +
	                        " tcomp.TITLE_NAME comp_title_text, s.COMPANY_NAME , s.CORPORATION_CODE, s.EXCISE_REG_NO, s.LICENSE_NO, s.LICENSE_DATE_FROM, s.LICENSE_DATE_TO \n" +
	                        " from suspect s left join title t on t." + Title.TITLE_CODECol + "=s." + Suspect.TITLE_CODECol +
	                        " left join title tcomp on s." + Suspect.TITLE_CODE_COMPANYCol + "=tcomp." + Title.TITLE_CODECol +
	                        " left join suspect_investigate si on si.suspect_no=s.suspect_no " +
	                        " where s.suspect_type='3' and s.del_flag<>'Y' ";
	                
	                countSql = "select count(*) from suspect s " +
			                " left join title tcomp on s." + Suspect.TITLE_CODE_COMPANYCol + "=tcomp." + Title.TITLE_CODECol +
			                " left join suspect_investigate si on si.suspect_no=s.suspect_no " +
			                " where s.suspect_type='3' and s.del_flag<>'Y' ";
	            }
	            
	            if (suspect_id_card != null && !suspect_id_card.trim().equals("")) {
	                request.setAttribute("suspect_id_card", suspect_id_card.trim());
	                whText += " and s.suspect_id_card like '%" + suspect_id_card.trim() + "%'";
	            }
	            if (partial_name != null && !partial_name.trim().equals("")) {
	                request.setAttribute("partial_name", partial_name.trim());
	                whText += " and nvl(s.first_name,'') like '%" + partial_name.trim() + "%'";
	                whText += " or nvl(s.middle_name,'') like '%" + partial_name.trim() + "%'";
	                whText += " or nvl(s.last_name,'') like '%" + partial_name.trim() + "%'";
	            }
	            if (other_name != null && !other_name.trim().equals("")) {
	                request.setAttribute("other_name", other_name.trim());
	                whText = " and s.other_name like '%" + other_name.trim() + "%'";
	            }
	            if (province_code != null && !province_code.trim().equals("0") && !province_code.trim().equals("")) {
	                request.setAttribute("province_code", province_code.trim());
	                whText += " and s.province_code = '" + province_code.trim() + "'";
	            }
	            if (district_code != null && !district_code.trim().equals("0") && !district_code.trim().equals("")) {
	                request.setAttribute("district_code", district_code.trim());
	                whText += " and s.district_code = '" + district_code.trim() + "'";
	            }
	            if (subdistrict_code != null && !subdistrict_code.trim().equals("0") && !subdistrict_code.trim().equals("")) {
	                request.setAttribute("subdistrict_code", subdistrict_code.trim());
	                whText += " and s.subdistrict_code = '" + subdistrict_code.trim() + "'";
	            }
	            if (offcode != null && !offcode.trim().equals("0")) {
	                request.setAttribute("offcode", offcode.trim());
	                whText += " and s.offcode = '" + offcode.trim() + "'";
	            }
	            if (passport != null && !passport.trim().equals("")) {
	                request.setAttribute("suspect_passport", passport.trim());
	                whText += " and s.suspect_passport like '%" + passport.trim() + "%'";
	            }
	            if (country_name != null && !country_name.trim().equals("")) {
	                request.setAttribute("country_name", country_name.trim());
	                whText += " and c.country_name like '%" + country_name.trim() + "%'";
	            }
	            if (corporation_code != null && !corporation_code.trim().equals("")) {
	                request.setAttribute("corporation_code", corporation_code.trim());
	                whText += " and s.corporation_code like '%" + corporation_code.trim() + "%'";
	            }
	            if (excise_reg_no != null && !excise_reg_no.trim().equals("")) {
	                request.setAttribute("excise_reg_no", excise_reg_no.trim());
	                whText += " and s.excise_reg_no like '%" + excise_reg_no.trim() + "%'";
	            }
	            if (license_no != null && !license_no.trim().equals("")) {
	                request.setAttribute("license_no", license_no.trim());
	                whText += " and s.license_no like '%" + license_no.trim() + "%'";
	            }
	            if (company_name != null && !company_name.trim().equals("")) {
	                request.setAttribute("company_name", company_name.trim());
	                whText += " and s.company_name like '%" + company_name.trim() + "%'";
	            }
	            if (case_type != null && !case_type.trim().equals("0")) {
	                request.setAttribute("case_type", case_type.trim());
	                whText += " and si.case_type = '" + case_type.trim() + "'";
	            }
	            
	            whText += whAuth;
	            
	            //List<Suspect> suspects = null;
	
	            int totalCount = suspect.countBySql(countSql + whText);
	            pageUtil.setTotalRow(totalCount);
	            pageUtil.setPageSize(20);
	            
	            List<Map<String, Object>> suspects = suspect.findBySql(queryField + whText);
//	            suspects = new ArrayList<Suspect>();
//	            if (listId.size() > 0) {
//	                for (int i = 0; i < listId.size(); i++) {
//	                    long id = ((BigDecimal) listId.get(i).get("id")).longValue();
//	                    suspects.add(suspect.findByPk(id));
//	                }
//	            }
	            request.setAttribute("suspects", suspects);
	        }
	
	        EdOffice ed_office = new EdOffice(db);
	        String edSql = "select offcode, short_name from ed_office order by short_name";
	        List<Map<String,Object>> ed_offices = ed_office.findBySql(edSql);
	        request.setAttribute("ed_offices", ed_offices);
	
	        //	for data to display
	        if (ServletRequestUtils.getStringParameter(request, "suspect_type") != null)
	            request.setAttribute("suspect_type", ServletRequestUtils.getStringParameter(request, "suspect_type"));
	        else
	            request.setAttribute("suspect_type", "1");
	        
	        HttpSession session = request.getSession();
	        request.setAttribute("ResponseTime", DateUtil.getResponseTime(session.getAttribute("ResponseTime") != null ? new Long(session.getAttribute("ResponseTime").toString()) : 0l));
	        
	        forward("?page=/Suspect/suspect_list.jsp");
    	}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
  		  
    	}
    }

    private void stampTranLog(Suspect suspect) throws Exception {
        if (suspect.getSuspect_type().equals("1")) {
            writeTranLog("บันทึกประวัติผู้ต้องสงสัยคนไทย");
        } else if (suspect.getSuspect_type().equals("2")) {
            writeTranLog("บันทึกประวัติผู้ต้องสงสัยชาวต่างชาติ");
        } else {
            writeTranLog("บันทึกประวัติผู้ต้องสงสัยผู้ประกอบการ");
        }
    }

    public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Suspect suspect = new Suspect(db);
        bindForm(suspect);

        if (suspect != null && suspect.getLink_photo() != null) {

            if (suspect.getLink_photo().length() > ConfigUtil.getImageSize(db)) {
                request.setAttribute("suspect_type", suspect.getSuspect_type());
                request.setAttribute("suspect_form", suspect.getSuspect_type());
                pre(request,response);
                request.setAttribute("error", "ไฟล์รูปภาพมีขนาดใหญ่เกินกว่าที่กำหนด");
                if(suspect.getId() != null){
                    //log.debug("return edit method by suspect id not null.");
                    request.setAttribute("error", "maxSize");
                    redirect("process?action=Suspect&cmd=edit&id=" + suspect.getId());
                }else{
                    request.setAttribute("suspect",suspect);
                    forward("?page=/Suspect/suspect_edit_tmp.jsp");
                    return;
                }
            }
        }
        
        if(suspect.getRace_id() != null && suspect.getRace_id().longValue() == 0)
        	suspect.setRace_id(null);
        if(suspect.getNation_id() != null && suspect.getNation_id().longValue() == 0)
        	suspect.setNation_id(null);
        if(suspect.getReligion_id() != null && suspect.getReligion_id().longValue() == 0)
        	suspect.setReligion_id(null);
        if(suspect.getHeight() != null && suspect.getHeight().longValue() == 0)
        	suspect.setHeight(null);
        if(suspect.getMoo() != null && suspect.getMoo().longValue() == 0)
        	suspect.setMoo(null);
        if(suspect.getCoordinate_x() != null && suspect.getCoordinate_x().longValue() == 0)
        	suspect.setCoordinate_x(null);
        if(suspect.getCoordinate_y() != null & suspect.getCoordinate_y().longValue() == 0)
        	suspect.setCoordinate_y(null);
        
        
        stampTranLog(suspect);
        suspect.setCreate_date(create_on);
        suspect.setCreate_id(create_by);
        suspect.setSuspect_no(System.currentTimeMillis());
        suspect.setDel_flag("N");
        suspect.setOffcode(offcode);
        suspect = suspect.create();
        if (suspect != null) {
            suspect.setSuspect_no(suspect.getId());
            suspect.update();
            // check for suspect address.
            addSuspectAddress(suspect);
            // check for suspect relative.
            addSuspectRelative(suspect);
            request.setAttribute("completed", suspect.getId());
            request.setAttribute("suspect", suspect);
            //formHandler.setFormMessage("Create Completed ,view <a href='process?action=Suspect&cmd=edit&id=" + suspect.getId() + "' target='_blank'>new Record</a>");
        }
        //else
        //    formHandler.setFormMessage("Create Not Complete");
        String suspect_type = suspect.getSuspect_type();
        request.setAttribute("suspect_type", suspect_type);
        redirect("process?action=Suspect&completed=completed&cmd=edit&id=" + suspect.getId());
    }

    public void addSuspectRelative(Suspect suspect) {
        SuspectRelatif sr = new SuspectRelatif(db);
        try {

            List<SuspectRelatif> presentSuspectRelatifList = sr.findByWhere(SuspectRelatif.SUSPECT_NOCol + "=?", suspect.getSuspect_no());
            if (suspect.getSuspect_relative_id() != null) {
                for (int i = 0; i < suspect.getSuspect_relative_count().length; i++) {
                    if (suspect.getSuspect_relative_id() != null && suspect.getSuspect_relative_id().length > i
                            && suspect.getSuspect_relative_id()[i] != null && !suspect.getSuspect_relative_id()[i].equals("")) {
                        // get suspect relative object from database and update value.
                        // find id from presentSuspectRelatifList and remove it from list.
                        for (SuspectRelatif s : presentSuspectRelatifList) {
                            if (s.getId().longValue() == (new Long(suspect.getSuspect_relative_id()[i])).longValue()) {
                                updateSuspectRelativeFromWebForm(s, suspect, i);
                                s.update();
                                presentSuspectRelatifList.remove(s);
                                break;
                            }
                        }
                    } else {
                        // this is new suspect relative.
                        SuspectRelatif newSuspectRelative = new SuspectRelatif(db);
                        updateSuspectRelativeFromWebForm(newSuspectRelative, suspect, i);
                        newSuspectRelative.setSuspect_no(suspect.getSuspect_no());
                        newSuspectRelative.setCreate_by(create_by);
                        newSuspectRelative.setCreate_on(create_on);
                        newSuspectRelative.setUpdate_by(update_by);
                        newSuspectRelative.setUpdate_on(update_on);
                        newSuspectRelative.create();
                    }


                }
            }
            for (SuspectRelatif s : presentSuspectRelatifList) {
                s.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void addSuspectAddress(Suspect suspect) {
        SuspectAddress sa = new SuspectAddress(db);
        try {
            List<SuspectAddress> presentSuspectAddressList = sa.findByWhere(SuspectAddress.SUSPECT_NOCol + "=?", suspect.getSuspect_no());
            if (suspect.getSuspect_address_id() != null) {
                for (int i = 0; i < suspect.getSuspect_address_count().length; i++) {
                    if (suspect.getSuspect_address_id() != null && suspect.getSuspect_address_id().length > i
                            && suspect.getSuspect_address_id()[i] != null && !suspect.getSuspect_address_id()[i].equals("")) {
                        // get suspect address object from database and update value.
                        // find id from presentSuspectAddressList and remove it from list.
                        for (SuspectAddress s : presentSuspectAddressList) {
                            if (s.getId().longValue() == (new Long(suspect.getSuspect_address_id()[i])).longValue()) {
                                updateSuspectAddressFromWebForm(s, suspect, i);
                                s.update();
                                presentSuspectAddressList.remove(s);
                                break;
                            }
                        }
                    } else {
                        // this is new suspect address.
                        SuspectAddress newSuspectAddress = new SuspectAddress(db);
                        updateSuspectAddressFromWebForm(newSuspectAddress, suspect, i);
                        newSuspectAddress.create();
                    }


                }
            }
            for (SuspectAddress s : presentSuspectAddressList) {
                s.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void updateSuspectAddressFromWebForm(SuspectAddress s, Suspect form, int index) {
        s.setDescription(form.getSuspect_address_description()[index]);
        s.setAddress(form.getSuspect_address_address()[index]);
        s.setAddress_name(form.getSuspect_address_address_name()[index]);
        s.setMoo(form.getSuspect_address_moo()[index]);
        s.setSoi(form.getSuspect_address_soi()[index]);
        s.setRoad(form.getSuspect_address_road()[index]);
        s.setProvince_code(form.getSuspect_address_province_code()[index]);
        s.setDistrict_code(form.getSuspect_address_district_code()[index]);
        s.setSubdistrict_code(form.getSuspect_address_subdistrict_code()[index]);
        s.setTel_no(form.getSuspect_address_tel_no()[index]);
        s.setFax_no(form.getSuspect_address_fax_no()[index]);
        s.setCoordinate_x(form.getSuspect_address_coordinate_x()[index]);
        s.setCoordinate_y(form.getSuspect_address_coordinate_y()[index]);
        s.setZipcode(form.getSuspect_address_zipcode()[index]);
        s.setSuspect_no(form.getSuspect_no());
    }

    public void updateSuspectRelativeFromWebForm(SuspectRelatif s, Suspect form, int index) {
        s.setRelation(form.getSuspect_relative_relation()[index]);
        s.setTitle_code(form.getSuspect_relative_title_code()[index]);
        s.setIdcardno(form.getSuspect_relative_idcardno()[index]);
        s.setFirst_name(form.getSuspect_relative_first_name()[index]);
        s.setLast_name(form.getSuspect_relative_last_name()[index]);
        s.setTel(form.getSuspect_relative_tel_no()[index]);
        s.setEmail(form.getSuspect_relative_email()[index]);
        s.setCurrent_address_no(form.getSuspect_relative_current_address_no()[index]);
        s.setCurrent_moo(form.getSuspect_relative_current_moo()[index]);
        s.setCurrent_soi(form.getSuspect_relative_current_soi()[index]);
        s.setCurrent_road(form.getSuspect_relative_current_road()[index]);
        s.setCurrent_province_code(form.getSuspect_relative_current_province_code()[index]);
        s.setCurrent_district_code(form.getSuspect_relative_current_district_code()[index]);
        s.setCurrent_subdistrict_code(form.getSuspect_relative_current_subdistrict_code()[index]);
        s.setHometown_address_no(form.getSuspect_relative_hometown_address_no()[index]);
        s.setHometown_moo(form.getSuspect_relative_hometown_moo()[index]);
        s.setHometown_soi(form.getSuspect_relative_hometown_soi()[index]);
        s.setHometown_road(form.getSuspect_relative_hometown_road()[index]);
        s.setHometown_province_code(form.getSuspect_relative_hometown_province_code()[index]);
        s.setHometown_district_code(form.getSuspect_relative_hometown_district_code()[index]);
        s.setHometown_subdistrict_code(form.getSuspect_relative_hometown_subdistrict_code()[index]);
        s.setSuspect_no(form.getSuspect_no());
    }


    // view
    public void view(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        if (id != null && !id.trim().equals("")) {
            Suspect suspect = new Suspect(db);
            suspect = suspect.findByPk(new Long(id));
            if (suspect != null) {
                request.setAttribute("suspect", suspect);
            } else {
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        } else {
            formHandler.setFormMessage("Error : Please Enter id");
        }
        forward("?page=/web/suspectView.jsp");
    }
    
    private void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	Relation re = new Relation(db);
        String reSql = "select id, relation_name from relation order by relation_name";
        request.setAttribute("res", re.findBySql(reSql));

        Nationality nt = new Nationality(db);
        String ntSql = "select id, nation_name from nationality order by nation_name";
        request.setAttribute("nts", nt.findBySql(ntSql));
        
        Race r = new Race(db);
        String rSql = "select id, race_name from race order by race_name";
        request.setAttribute("rs", r.findBySql(rSql));
        
        Religion rel = new Religion(db);
        String relSql = "select id, religion_name from religion order by religion_name";
        request.setAttribute("rels", rel.findBySql(relSql));
        
        Title t = new Title(db);
        String tSql = "select title_code, short_title from title  order by title_name";
        List<Map<String,Object>> tList = t.findBySql(tSql);
        request.setAttribute("titles", tList);
        request.setAttribute("comptitles", tList);
        
        Country cc = new Country(db);
        String ccSql = "select continent, country_code, country_name from country order by country_name";
        List<Map<String,Object>> cclist = cc.findBySql(ccSql);
        request.setAttribute("ccs", cclist);
        JSONArray jsonArr = new JSONArray(cclist);
        request.setAttribute("countryJson", jsonArr.toString());
        
        //Province province = new Province(db);
        //String pSql = "select province_code, province_name from province order by province_name";
        //request.setAttribute("provinces", province.findBySql(pSql));

    }

    // update
    public void edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //log.debug("Start Edit");
    	String id = request.getParameter("id");
        String completed = request.getParameter("completed");
        if (completed != null) {
            request.setAttribute("completed", completed);
        }
        String error = request.getParameter("error");
        if (error != null && error.equals("maxSize")) {
            request.setAttribute("error", "รูปภาพมีขนาดใหญ่เกินขนาดที่กำหนด");
        }
        if (id != null && !id.trim().equals("")) {
        	//log.debug("Start Suspect");
            Suspect suspect = new Suspect(db);
            suspect = suspect.findByPk(new Long(id));
            //log.debug("Start Suspect2");
            if (suspect != null) {
                request.setAttribute("suspect_form", suspect.getSuspect_type());
                request.setAttribute("suspect", suspect);
                // get all suspect address
                SuspectAddress sa = new SuspectAddress(db);
                SuspectRelatif sr = new SuspectRelatif(db);
                List<SuspectAddress> sas = sa.findByWhere(SuspectAddress.SUSPECT_NOCol + "=?", suspect.getSuspect_no());
                List<SuspectRelatif> srs = sr.findByWhere(SuspectRelatif.SUSPECT_NOCol + "=?", suspect.getSuspect_no());
                request.setAttribute("sas", sas);
                request.setAttribute("srs", srs);
                //log.debug("Start Suspect Detail 1");
            } else {
                request.setAttribute("suspect_form", "1");
                //formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        }
        
        pre(request,response);
        forward("?page=/Suspect/suspect_edit_tmp.jsp");
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Suspect suspect = new Suspect(db);
        bindForm(suspect);
        //log.debug("image size in configure file is " + ConfigUtil.getImageSize(db));
        if (suspect != null && suspect.getLink_photo() != null) {
            log.debug("Photo length for update is " + suspect.getLink_photo().length());
            if (suspect.getLink_photo().length() > ConfigUtil.getImageSize(db)) {
                redirect("process?action=Suspect&error=maxSize&cmd=edit&id=" + suspect.getId(), request, response);
                return;
            }
        }

        if(suspect.getRace_id() != null && suspect.getRace_id().longValue() == 0)
        	suspect.setRace_id(null);
        if(suspect.getNation_id() != null && suspect.getNation_id().longValue() == 0)
        	suspect.setNation_id(null);
        if(suspect.getReligion_id() != null && suspect.getReligion_id().longValue() == 0)
        	suspect.setReligion_id(null);
        if(suspect.getHeight() != null && suspect.getHeight().longValue() == 0)
        	suspect.setHeight(null);
        if(suspect.getMoo() != null && suspect.getMoo().longValue() == 0)
        	suspect.setMoo(null);
        if(suspect.getCoordinate_x() != null && suspect.getCoordinate_x().longValue() == 0)
        	suspect.setCoordinate_x(null);
        if(suspect.getCoordinate_y() != null & suspect.getCoordinate_y().longValue() == 0)
        	suspect.setCoordinate_y(null);
        
        stampTranLog(suspect);
        suspect.setUpdate_date(update_on);
        suspect.setUpdate_id(update_by);
        Suspect suspect2 = suspect.findByPk(suspect.getId());
        suspect.setCreate_date(suspect2.getCreate_date());
        if (suspect.getLink_photo().length() == 0 && suspect2.getLink_photo() != null) {
            suspect.setLink_photo(suspect2.getLink_photo());
        }
        suspect = suspect.update();
        if (suspect != null) {
            request.setAttribute("suspect", suspect);
            request.setAttribute("completed", suspect.getId());
            addSuspectAddress(suspect);
            addSuspectRelative(suspect);
            //formHandler.setFormMessage("Update Completed");
        }
        //else {
        //    formHandler.setFormMessage("Update Failed");
        //}
        String suspect_type = suspect.getSuspect_type();
        request.setAttribute("suspect_type", suspect_type);
        redirect("process?action=Suspect&completed=completed&cmd=edit&id=" + suspect.getId());
    }

    // delete
    public void delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] ids = request.getParameterValues("id");
        if (ids != null && ids.length > 0) {
            Suspect suspect = new Suspect(db);
            List<Long> idList = new ArrayList<Long>();
            for (int i = 0; i < ids.length; i++)
                idList.add(new Long(ids[i]));
            int deleteRow = suspect.deleteByPks(idList);
            formHandler.setFormMessage(" Delete " + deleteRow + " Row Completed ");
        } else {
            formHandler.setFormMessage("Plese Select At Least One For Delete");
        }
        redirect("process?action=Suspect&cmd=list");
    }

    public void deleteSuspect(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	HttpSession session = request.getSession();
    	session.setAttribute("ResponseTime", System.currentTimeMillis());
    	
    	Long SuspectNo = ServletRequestUtils.getLongParameter(request, "suspect_no");

        Suspect sp = new Suspect(db);
        sp = sp.findByWhere("suspect_no = '" + SuspectNo.toString() + "'", null).get(0);
        String suspect_type = sp.getSuspect_type();

        SuspectPicture spt = new SuspectPicture(db);
        spt.deleteByWhere("suspect_no = '" + sp.getSuspect_no().toString() + "'", null);

        SuspectAddress sd = new SuspectAddress(db);
        sd.deleteByWhere("suspect_no = '" + sp.getSuspect_no().toString() + "'", null);

        SuspectRelatif sl = new SuspectRelatif(db);
        sl.deleteByWhere("suspect_no = '" + sp.getSuspect_no().toString() + "'", null);

        sp.deleteByPk(sp.getId());
        redirect("process?action=Suspect&cmd=list&suspect_type=" + suspect_type);
    }

    private String getStr(Object stringObj) {
        return (stringObj == null) ? "" : stringObj.toString();
    }

    // detail
    public void detail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Long id = ServletRequestUtils.getLongParameter(request, "id");
        Suspect suspect = new Suspect(db);
        suspect = suspect.findByPk(id);
        request.setAttribute("suspect", suspect);
        String suspectType = suspect.getSuspect_type();
        V_SUSPECT_ARREST vsr = new V_SUSPECT_ARREST(db);
        List<Map<String, Object>> vsrMap = vsr.findByWhere("suspect_no=?", suspect.getSuspect_no());
        List<VSRList> vsrList = new ArrayList<VSRList>();
        for (Map<String, Object> map : vsrMap) {
            VSRList vsrL = new VSRList();
            vsrL.setArrest_qty(map.get("arrest_qty").toString());
            vsrL.setGuilt_bast(map.get("guilt_bast").toString());
            vsrL.setCompare_fine(map.get("compare_fine").toString());
            vsrL.setExhibit(map.get("exhibit").toString());
            vsrL.setLegislation_name(map.get("legislation_name").toString());
            vsrList.add(vsrL);
        }
        if (vsrMap.size() > 0) {
            request.setAttribute("arrest_qty", vsrMap.get(0).get("arrest_qty"));
        } else {
            request.setAttribute("arrest_qty", 0);
        }
        request.setAttribute("vsrList", vsrList);
        // get suspect invatigate list
        V_SUSPECT_INVESTIGATE_LIST vSusList = new V_SUSPECT_INVESTIGATE_LIST(db);
        List<Map<String, Object>> vMap = vSusList.findByWhere(" create_by=? and suspect_no = ? order by legislation_name, to_date(start_date,'dd/MM/yyyy') asc", new Object[]{create_by, suspect.getSuspect_no()});
        List<SuspectInvestigateList> vlist = new ArrayList<SuspectInvestigateList>();
        for (Map<String, Object> map : vMap) {
            SuspectInvestigateList suspectInvList = new SuspectInvestigateList();
            suspectInvList.setCreate_by(((BigDecimal) map.get("create_by")).longValue());
            suspectInvList.setStart_date(getStr(map.get("start_date")));
            suspectInvList.setEnd_date(getStr(map.get("end_date")));
            suspectInvList.setLegislation_name(getStr(map.get("legislation_name")));
            suspectInvList.setTrack_no(getStr(map.get("track_no")));
            suspectInvList.setSuspect_behavior(getStr(map.get("suspect_behavior")));
            suspectInvList.setInvestigate_no(getStr(map.get("investigate_no")));
            suspectInvList.setSuspect_investigate_id(((BigDecimal) map.get("suspect_investigate_id")).longValue());
            vlist.add(suspectInvList);
        }
        request.setAttribute("vlist", vlist);
        if (suspectType != null) {
            if (suspectType.equals("2")) {
                suspectType = "_eng";
            } else if (suspectType.equals("3")) {
                suspectType = "_business";
            } else
                suspectType = "";
        } else
            suspectType = "";
        PictureCategory pg = new PictureCategory(db);
        List<PictureCategory> pgList = pg.findAll();
        request.setAttribute("pgs", pgList);
        
        String spSql = "";
        spSql += "";
        SuspectPicture sp = new SuspectPicture(db);
        List<SuspectPicture> spl = sp.findByWhere(SuspectPicture.SUSPECT_NOCol + "=? order by " + SuspectPicture.PICTURE_CATEGORY_IDCol, suspect.getSuspect_no());
        request.setAttribute("spl", spl);
        JSONArray jsonArr = new JSONArray(pgList);
        request.setAttribute("jsonPg", jsonArr.toString());
        SuspectRelatif sr = new SuspectRelatif(db);
        List<SuspectRelatif> srs = sr.findByWhere(SuspectRelatif.SUSPECT_NOCol + "=?", suspect.getSuspect_no());
        request.setAttribute("srs", srs);
        SuspectVehicle sv = new SuspectVehicle(db);
        
        String svSql = "";
        svSql += " select sv.car_no, sv.car_cate, pv.province_name, dt.duty_name, nvl(bm.brand_main_thai,bm.brand_main_eng) brand_name, ";
        svSql += " sv.car_model,sv.car_color, sv.description, si.investigate_no,sv.suspect_investigate_id ";
        svSql += " from suspect_vehicle sv ";
        svSql += " inner join suspect_investigate si on si.id=sv.suspect_investigate_id ";
        svSql += " left join province pv on pv.province_code=sv.province_code ";
        svSql += " left join duty_table dt on dt.duty_code=sv.duty_code";
        svSql += " left join brand_main bm on substr(bm.group_id,1,2)='05' and bm.brand_main_code=sv.brand_brand_code ";
        svSql += " where si.suspect_no = '" + suspect.getSuspect_no() + "'";
        
        List<Map<String,Object>> svs = sv.findBySql(svSql);
        List<Relation> rel = new ArrayList<Relation>();
        Relation re = new Relation(db);
        rel = re.findAll();
        request.setAttribute("rels", rel);
        request.setAttribute("svs", svs);
        forward("?page=/Suspect/suspect_detail.jsp&ssid=" + System.currentTimeMillis());
    }

    public void createForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String suspectType = ServletRequestUtils.getStringParameter(request, "suspectType");
        if (suspectType == null) suspectType = "1";
        if (suspectType.equals("1")) {
            writeTranLog("เพิ่มประวัติผู้ต้องสงสัยคนไทย");
        } else if (suspectType.equals("2")) {
            writeTranLog("เพิ่มประวัติผู้ต้องสงสัยชาวต่างชาติ");
        } else {
            writeTranLog("เพิ่มประวัติผู้ต้องสงสัยผู้ประกอบการ");
        }
        
        pre(request,response);
        
        String suspectTypeText = (suspectType.equals("2") ? "_eng" : suspectType.equals("3") ? "_business" : "");
        request.setAttribute("suspect_form", suspectType);
        request.setAttribute("suspect_type", suspectType);
        request.setAttribute("suspect_type_text", suspectTypeText);
        
        forward("?page=/Suspect/suspect_edit_tmp.jsp");
    }

    public void openSuspectRelatifPopup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Relation re = new Relation(db);
        SuspectRelatif sr = new SuspectRelatif(db);
        Suspect s = new Suspect(db);
        bindForm(s);
        if (s.getSuspect_relative_count() != null && s.getSuspect_relative_count().length > 0) {
            updateSuspectRelativeFromWebForm(sr, s, 0);
            sr.setFirst_name(convertChartoByte(sr.getFirst_name()));
            sr.setLast_name(convertChartoByte(sr.getLast_name()));
            sr.setHometown_soi(convertChartoByte(sr.getHometown_soi()));
            sr.setHometown_road(convertChartoByte(sr.getHometown_road()));
            sr.setCurrent_soi(convertChartoByte(sr.getCurrent_soi()));
            sr.setCurrent_road(convertChartoByte(sr.getCurrent_road()));
            request.setAttribute("sr", sr);
        }

        request.setAttribute("rels", re.findAll());
        Title t = new Title(db);
        request.setAttribute("titles", t.findByWhere(Title.TITLE_TYPECol + "=?  order by " + Title.TITLE_NAMECol, "1"));
        if (request.getParameter("rowId") != null)
            request.setAttribute("rowId", request.getParameter("rowId"));
        if (request.getParameter("maxRow") != null)
            request.setAttribute("maxRow", request.getParameter("maxRow"));
        forward("/Popup/suspect_other_relative_form.jsp", request, response);
    }

    private String convertChartoByte(String s) {
        char[] chars = s.toCharArray();
        byte[] bytes = new byte[chars.length];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) chars[i];
        }
        return new String(bytes);
    }

    public void openSuspectAddressPopup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        SuspectAddress sa = new SuspectAddress(db);
        Suspect s = new Suspect(db);
        bindForm(s);
        if (s.getSuspect_address_count() != null && s.getSuspect_address_count().length > 0) {
            updateSuspectAddressFromWebForm(sa, s, 0);
            sa.setDescription(convertChartoByte(sa.getDescription()));
            sa.setAddress(convertChartoByte(sa.getAddress()));
            sa.setAddress_name(convertChartoByte(sa.getAddress_name()));
            sa.setSoi(convertChartoByte(sa.getSoi()));
            sa.setRoad(convertChartoByte(sa.getRoad()));
            request.setAttribute("sa", sa);
        }
        if (request.getParameter("rowId") != null)
            request.setAttribute("row", request.getParameter("rowId"));
        if (request.getParameter("maxRow") != null)
            request.setAttribute("maxRow", request.getParameter("maxRow"));
//        request.setAttribute("row",request.getParameter("rowId"));
        forward("/Popup/suspect_other_address_form.jsp", request, response);
    }

    public void idcardSearchEdit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String suspect_id_card = ServletRequestUtils.getStringParameter(request, "suspect_id_card");
        Long id = ServletRequestUtils.getLongParameter(request, "id");
        String suspect_type = ServletRequestUtils.getStringParameter(request, "suspect_type");
        Suspect s = new Suspect(db);
        List<Map<String, Object>> result = s.findBySql("select id from suspect where suspect_id_card=?", suspect_id_card);
        if (result.size() > 0) {
            String suspect_id = result.get(0).get("id").toString();
            request.setAttribute("id", suspect_id);
            redirect("process?action=Suspect&cmd=edit");
        } else {
            if (id != null && id.longValue() > 0) {
                request.setAttribute("id", id);
                redirect("process?action=Suspect&cmd=edit");
            } else {
                request.setAttribute("suspectType", suspect_type);
                redirect("process?action=Suspect&cmd=createForm");
            }
        }
    }
}