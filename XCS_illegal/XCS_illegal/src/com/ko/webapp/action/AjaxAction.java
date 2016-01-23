package com.ko.webapp.action;

import com.ko.domain.*;
import com.ko.util.ConfigUtil;
import com.ko.webapp.form.FileUploadForm;
import com.ko.webapp.util.ParameterUtil;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.directwebremoting.json.types.JsonArray;
import org.directwebremoting.json.types.JsonValue;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.util.Log;
import org.json.JSONArray;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class AjaxAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
    public void getCompareCaseApplicationRewardReq(HttpServletRequest request,HttpServletResponse response)throws Exception {
        Long ccid = ServletRequestUtils.getLongParameter(request,"ccid");
        String sql = "select cc.id, cc.compare_case_no,to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') as compare_case_date, \n" +
                "    aa.accuser_idcardno, pke_arrest.getArrestLawbreaker(aa.track_no) as lawbreaker_name,dg.group_name, pd.PRODUCT_NAME,\n" +
                "    nvl(b.BRAND_MAIN_THAI,b.BRAND_MAIN_ENG) as brand_name,  nvl(u.THNAME,u.ENNAME) as uname,\n" +
                "    tia.title_name || sta.first_name || ' ' || sta.last_name as accuser_name, nvl(sta.posname,posa.posname || ' ' || sta.staff_level) as posaname,\n" +
                "    sta.IDCARD_NO as aa_idcard_no, sta.OFFCODE as aa_offcode, posa.POSCODE as aa_poscode, nvl(sta.offname,ed.OFFNAME) as aa_offname,\n" +
                "    tis.title_name || sts.first_name || ' ' || sts.last_name as sue_name, poss.posname || ' ' || sts.staff_level as possname,\n" +
                "    tip.title_name || stp.first_name || ' ' || stp.last_name as prove_name, posp.posname || ' ' || stp.staff_level as pospname,\n" +
                "    idc.guilt_base , idc.case_law_id , idc.penalty_case_law_id , pke_arrest.getSceneAddress(cc.track_no) as scene_addr,\n" +
                "    aal.fine_case , cc.birbe_money as bribe_money, cc.reward_money, aa.track_no, \n" +
                "    to_char(aa.occurrence_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date, \n" +
                " ana.notice_no,ana.inform_name, tin.title_name || stn.first_name || ' ' || stn.last_name staff_name_receive, \n" +
                " ana.staff_id_receive, ana.poscode_receive, psn.posname || stn.staff_level staff_posname_receive, \n " +
                " to_char(ana.notice_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') receive_date, to_char(ana.notice_date,'hh24:mi') receive_time \n" +
                " from compare_case cc \n" +
                " inner join application_arrest aa on cc.track_no = aa.track_no\n" +
                " left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id \n" +
                " left join staff stn on stn.idcard_no = ana.staff_id_receive \n" +
                " left join title tin on tin.title_code = stn.title_code \n " +
                " left join position psn on psn.poscode=ana.poscode_receive \n" +
                " left join v_accuser_list_popup sta on sta.idcard_no = aa.accuser_idcardno\n" +
                " left join title tia on sta.title_code = tia.title_code  \n" +
                " left join indictment idc on cc.indictment_id = idc.indictment_id\n" +
                " left join staff sts on sts.idcard_no = cc.sue_staff_idcardno\n" +
                " left join title tis on sts.title_code = tis.title_code\n" +
                " left join application_arrest_prove aap on aap.track_no = aa.track_no\n" +
                " left join staff stp on stp.idcard_no = aap.staff_idcardno_prove\n" +
                " left join title tip on tip.title_code = stp.title_code\n" +
                " left join position posp on posp.poscode = aap.staff_prove_poscode\n" +
                " left join position poss on poss.poscode = cc.sue_poscode\n" +
                " left join position posa on posa.poscode = aa.accuser_poscode\n" +
                " left join ed_office ed on ed.offcode = aa.accuser_offcode \n" +
                " left join ( \n" +
                "    select sum(aal1.fine) as fine_case, aal1.track_no as aal_track_no\n" +
                "    from application_arrest_lawbreaker aal1\n" +
                "    group by aal1.track_no\n" +
                " ) aal on aal.aal_track_no = aa.track_no\n" +
                " left join duty_group dg on dg.group_id = aa.PRODUCT_GROUP_ID\n" +
                " left join application_arrest_exhibit aae on aae.TRACK_NO = aa.track_no\n" +
                " left join product pd on aae.PRODUCT_CODE = pd.PRODUCT_CODE \n" +
                " left join brand_main b on b.BRAND_MAIN_CODE = aae.BRAND_CODE\n" +
                " left join unit u on u.UNIT_CODE = aae.QTY_UNIT_CODE\n" +
                " where cc.id = "+ccid;

        log.debug(sql);
        CompareCase cc = new CompareCase(db);
        List<Map<String,Object>> result = cc.findBySql(sql);
        JSONArray jsonArr = new JSONArray(result);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(jsonArr.toString());
    }

    public void getApplicationArrestExhibitItems(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String track_no = ServletRequestUtils.getStringParameter(request,"track_no");
        String sql = "select dt.duty_code, dt.duty_name, pd.PRODUCT_NAME,nvl(b.BRAND_MAIN_THAI,b.BRAND_MAIN_ENG) as brand_name,  nvl(u.THNAME,u.ENNAME) as uname, aae.QTY \n" +
                " from application_arrest_exhibit aae \n" +
                " left join product pd on aae.PRODUCT_CODE = pd.PRODUCT_CODE \n" +
                " left join brand_main b on b.BRAND_MAIN_CODE = aae.BRAND_CODE\n" +
                " left join unit u on u.UNIT_CODE = aae.QTY_UNIT_CODE\n" +
                " inner join duty_table dt on dt.duty_code=aae.duty_code \n" +
                " where aae.track_no = '"+track_no+"'";
        //log.debug(sql);
        CompareCase cc = new CompareCase(db);
        List<Map<String,Object>> result = cc.findBySql(sql);
        JSONArray jsonArr = new JSONArray(result);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(jsonArr.toString());
    }
    public void getStaffTeamByCompareCase(HttpServletRequest request,HttpServletResponse response)throws Exception {
        Long ccid = ServletRequestUtils.getLongParameter(request,"ccid");
        Long duty_status_id = ServletRequestUtils.getLongParameter(request,"duty_status_id");
        String sql = "select staff_idcardno idcard_no, staff_poscode poscode, staff_offcode offcode, nvl(st.staff_level,' ') staff_level,tt.title_name tn, st.first_name fn, \n" +
                "    st.last_name ln,tt.title_name || st.first_name || ' ' || st.last_name full_name , nvl(st.posname,pos.posname) posname \n" +
        		"from APPLICATION_ARREST_TEAM aat \n" +
                "left join V_ACCUSER_LIST_POPUP st on aat.staff_idcardno = st.idcard_no \n" +
                "left join title tt on st.title_code = tt.title_code \n" +
                "left join position pos on staff_poscode = pos.poscode\n" +
                "left join compare_case cc on cc.track_no = aat.track_no \n" +
                "where cc.id = ? and aat.duty_status_id = ?";
        log.debug(sql + "ccid=" + ccid + ":duty_status_id=" + duty_status_id);
        
        ApplicationArrestTeam aat = new ApplicationArrestTeam(db);
        List<Map<String,Object>> result = aat.findBySql(sql,new Object[]{ccid,duty_status_id});
        JSONArray jsonArr = new JSONArray(result);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(jsonArr.toString());
    }
    public void getPictureByCategoryAndSuspectNo(HttpServletRequest request,HttpServletResponse response)throws Exception {
        Long id = ServletRequestUtils.getLongParameter(request,"id");
        List<SuspectPicture> spl = new ArrayList<SuspectPicture>();
        String suspect_no = ServletRequestUtils.getStringParameter(request,"suspect_no");
        SuspectPicture sp = new SuspectPicture(db);
        if(id.longValue()==0){
           spl = sp.findByWhere(SuspectPicture.SUSPECT_NOCol+"=? order by "+SuspectPicture.PICTURE_CATEGORY_IDCol,suspect_no);
        }else{
           spl = sp.findByWhere(SuspectPicture.SUSPECT_NOCol+"=? and "+SuspectPicture.PICTURE_CATEGORY_IDCol+
                   "=? order by "+SuspectPicture.PICTURE_CATEGORY_IDCol,new Object[]{suspect_no,id});
        }
        for(int i=0;i<spl.size();i++){
            spl.get(i).setPicture(null);
        }
        JSONArray jsonArr = new JSONArray(spl);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(jsonArr.toString());
    }

    public void searchSuspectByKey(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String key = ServletRequestUtils.getStringParameter(request,"id");
        String column =  ServletRequestUtils.getStringParameter(request,"column");
        Suspect s = new Suspect(db);
        List<Map<String,Object>> result = s.findBySql("select id from suspect where "+column+"=?",key);
        String id = "-1";
        if(result.size()>0){
            id = result.get(0).get("id").toString();
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(id);
    }
    public void searchSuspectByIDCard(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String idcard_no = ServletRequestUtils.getStringParameter(request,"idcard_no");
        Suspect s = new Suspect(db);
        List<Map<String,Object>> result = s.findBySql("select id from suspect where "+Suspect.SUSPECT_ID_CARDCol+"=?",idcard_no);
        String id = "-1";
        if(result.size()>0){
            id = result.get(0).get("id").toString();
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(id);
    }

    public void searchSuspectByTaxID(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String tax_id_no = ServletRequestUtils.getStringParameter(request,"tax_id_no");
        Suspect s = new Suspect(db);
        List<Map<String,Object>> result = s.findBySql("select id from suspect where "+Suspect.TAX_ID_NOCol+"=?",tax_id_no);
        String id = "-1";
        if(result.size()>0){
            id = result.get(0).get("id").toString();
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(id);
    }

    public void searchSuspectByPassport(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String passport = ServletRequestUtils.getStringParameter(request,"passport");
        Suspect s = new Suspect(db);
        List<Map<String,Object>> result = s.findBySql("select id from suspect where "+Suspect.SUSPECT_PASSPORTCol+"=?",passport);
        String id = "-1";
        if(result.size()>0){
            id = result.get(0).get("id").toString();
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(id);
    }
    
    public void searchLawbreakerByKey(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String key = ServletRequestUtils.getStringParameter(request,"id");
        String column =  ServletRequestUtils.getStringParameter(request,"column");
        Lawbreaker s = new Lawbreaker(db);
        List<Map<String,Object>> result = s.findBySql("select id from lawbreaker where "+column+"=?",key);
        String id = "-1";
        if(result.size()>0){
            id = result.get(0).get("id").toString();
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(id);
    }
    public void searchLawbreakerByIDCard(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String idcard_no = ServletRequestUtils.getStringParameter(request,"idcard_no");
        Lawbreaker s = new Lawbreaker(db);
        List<Map<String,Object>> result = s.findBySql("select id from lawbreaker where "+Lawbreaker.LAWBREAKER_ID_CARDCol+"=?",idcard_no);
        String id = "-1";
        if(result.size()>0){
            id = result.get(0).get("id").toString();
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(id);
    }

    public void searchLawbreakerByTaxID(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String tax_id_no = ServletRequestUtils.getStringParameter(request,"tax_id_no");
        Lawbreaker s = new Lawbreaker(db);
        List<Map<String,Object>> result = s.findBySql("select id from lawbreaker where "+Lawbreaker.TAX_ID_NOCol+"=?",tax_id_no);
        String id = "-1";
        if(result.size()>0){
            id = result.get(0).get("id").toString();
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(id);
    }

    public void searchLawbreakerByPassport(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String passport = ServletRequestUtils.getStringParameter(request,"passport");
        Lawbreaker s = new Lawbreaker(db);
        List<Map<String,Object>> result = s.findBySql("select id from lawbreaker where "+Lawbreaker.LAWBREAKER_PASSPORTCol+"=?",passport);
        String id = "-1";
        if(result.size()>0){
            id = result.get(0).get("id").toString();
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(id);
    }
    
    public void uploadPreview(HttpServletRequest request,HttpServletResponse response)throws Exception {
    	//String tempdir = System.getProperty("java.io.tmpdir");
    	response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        FileUploadForm pojoForm = new FileUploadForm();
        PrintWriter pw = response.getWriter();
        pw.println("<script>");
        try{
	    	bindForm(pojoForm);
	    	String table = request.getParameter("table");
	    	Blob b = null;
	    	if( table.equalsIgnoreCase("APPLICATION_INVEST") ){
	    		b = pojoForm.getMap_picture();
	    	}else if( table.equalsIgnoreCase("SUSPECT_PICTURE")){
	    		b = pojoForm.getPicture();
	    	}else if( table.equalsIgnoreCase("LAWBREAKER") ){
	    		b = pojoForm.getLink_photo();
	    	}else if( table.equalsIgnoreCase("SUSPECT") ){
	    		b = pojoForm.getLink_photo();
	    	}else if( table.equalsIgnoreCase("SUSPECT_INVESTIGATE")){
	    		b = pojoForm.getSuspect_map();
	    	}
	    	if( b.length()>0 ){
		    	// the directory to upload to
		        String uploadDir = request.getSession().getServletContext().getRealPath("/tmp") + "/";
		        // Create the directory if it doesn't exist
		        File dirPath = new File(uploadDir);
		        if (!dirPath.exists()) {
		            dirPath.mkdirs();
		        }
		        File f = new File(uploadDir+new Date().getTime());
		        //Blob b = pojoForm.getFile();
		        BufferedOutputStream os;
		
		        os = new BufferedOutputStream(new FileOutputStream(f));
		        os.write(b.getBytes(1, (int) b.length()), 0, (int) b.length());
		        os.flush();
		        os.close();
		        String out = "parent.document.getElementById('"+request.getParameter("preview_id")+"').src = '"+request.getContextPath()+"/tmp/"+f.getName()+"';"; 
		        pw.println(out);
		        //pw.println(request.getContextPath()+"/tmp/"+f.getName());
	    	}
        }catch (Exception e) {
        	//e.printStackTrace();
        	String out = "alert('ไฟล์ มีขนาดเกิน "+(ConfigUtil.getImageSize(db)/1024)+"KB. กรุณาเลือกไฟล์ใหม่ ');";
        	out+=" parent.document.getElementById('"+request.getParameter("preview_id")+"').src = '';";
        	out+=" parent.clearInputFile(parent.document.getElementById('fileImg'));";
        	pw.println(out);
		}
        pw.println("</script>");
	}
    public void upload(HttpServletRequest request,HttpServletResponse response)throws Exception {
    	response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
    	FileUploadForm pojoForm = new FileUploadForm();
        PrintWriter pw = response.getWriter();
        pw.println("<script>");
        try{
	    	bindForm(pojoForm);
	    	String table = request.getParameter("table");
	    	Long id = ParameterUtil.getLongParam("id", request);
	    	
	    	Blob b = null;
	    	if( table.equalsIgnoreCase("APPLICATION_INVEST") ){
	    		b = pojoForm.getMap_picture();
	    		ApplicationInvest ai = new ApplicationInvest(db);
				ai = ai.findByPk(id);
				if( ai != null ){
					ai.setMap_picture(b);
					ai.update();
				}
	    	}else if( table.equalsIgnoreCase("SUSPECT_PICTURE")){
	    		b = pojoForm.getPicture();
	    		SuspectPicture sp = new SuspectPicture(db);
				sp = sp.findByPk(id);
				if( sp!=null ){
					sp.setPicture(b);
					sp.update();
				}
	    	}else if( table.equalsIgnoreCase("LAWBREAKER") ){
	    		b = pojoForm.getLink_photo();
	    		Lawbreaker lb = new Lawbreaker(db);
				lb = lb.findByPk(id);
				if( lb != null ){
					lb.setLink_photo(b);
					lb.update();
				}
	    	}else if( table.equalsIgnoreCase("SUSPECT") ){
	    		b = pojoForm.getLink_photo();
	    		Suspect suspect = new Suspect(db);
				suspect = suspect.findByPk(id);
				if( suspect!=null ){
					suspect.setLink_photo(b);
					suspect.update();
				}
	    	}else if( table.equalsIgnoreCase("SUSPECT_INVESTIGATE")){
	    		b = pojoForm.getSuspect_map();
	    		SuspectInvestigate sp = new SuspectInvestigate(db);
				sp = sp.findByPk(id);
				if( sp!=null ){
					sp.setSuspect_map(b);
					sp.update();
				}
	    	}
	    	if( b.length()>0 ){
		        String out = "parent.document.getElementById('"+request.getParameter("preview_id")+"').src = '"+request.getContextPath()+"/process?action=GetImage&table="+table+"&id="+id+"&rnd="+System.currentTimeMillis()+"';";
		        pw.println(out);
	    	}
        }catch (Exception e) {
        	//e.printStackTrace();
        	String out = "alert('ไฟล์ มีขนาดเกิน "+(ConfigUtil.getImageSize(db)/1024)+"KB. กรุณาเลือกไฟล์ใหม่ ');";
        	out+=" parent.document.getElementById('"+request.getParameter("preview_id")+"').src = '';";
        	out+=" parent.clearInputFile(parent.document.getElementById('fileImg2'));";
        	pw.println(out);
		}
        pw.println("</script>");
    }
}