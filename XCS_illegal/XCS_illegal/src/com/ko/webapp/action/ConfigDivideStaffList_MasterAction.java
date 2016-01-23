package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.ConfigDivideStaff;
import com.ko.domain.ConfigShareMoneyPercent;
import com.ko.webapp.util.ParameterUtil;

public class ConfigDivideStaffList_MasterAction extends BaseAction{
	String menuID="35";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			forward("?page=/Master/ConfigDivideStaffList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String sql="select ed.short_name, cd.id, st.idcard_no,  ti.title_name, st.first_name, st.last_name, st.staff_level , ps.poscode, nvl(cd.staff_posname, ps.posname) posname, ed.offcode, ed.offname, cd.share2 "
					+"from staff st "
					+"left join config_divide_staff cd on st.idcard_no=cd.staff_idcardno "
					+"left join title ti on ti.title_code=st.title_code "
					+"left join position ps on trim(st.poscode)=ps.poscode "
					+"inner join ed_office ed on ed.offcode=st.offcode "
					+"where 1=1 " ;
		StringBuffer where = new StringBuffer(""); 
		String offCode=ParameterUtil.getStringParam("offcode", request);	
		System.out.println(offCode);
		String order="order by st.staff_level, st.first_name, st.last_name";
		ConfigDivideStaff configDivideStaff = new ConfigDivideStaff(db);
		int i;
		if(!offCode.trim().equals("")){
			where.append(" and ed.offcode = ? ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i, "'"+offCode+"'");
		}
		System.out.println(sql+where.toString()+order.toString());
		List listconfigDivideStaff = configDivideStaff.findBySql(sql+where.toString()+order.toString(), null);
		log.debug(listconfigDivideStaff);
		request.setAttribute("ListconfigDS", listconfigDivideStaff); 
		forward("?page=/Master/ConfigDivideStaffList.jsp");
	}
	public void create(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String[] idcard_no = request.getParameterValues("staff_idcardno");
		String[] pos = request.getParameterValues("staff_poscode");
		String[] posname = request.getParameterValues("staff_posname");
		String[] off = request.getParameterValues("staff_offcode");
		String[] level = request.getParameterValues("staff_level");
		String[] share = request.getParameterValues("share2");
		String offcode = request.getParameter("offcode");
		String[] id = request.getParameterValues("configID");
		
		//log.debug("idcard_no= "+idcard_no.length);
		for(int i=0; i < idcard_no.length; i++){
			ConfigDivideStaff configDivideStaff = new ConfigDivideStaff(db);
			if(configDivideStaff.findByWhere(ConfigDivideStaff.STAFF_IDCARDNOCol + "=?", idcard_no[i]).size() == 0){
				configDivideStaff.setStaff_idcardno(idcard_no[i]);
			}else{
				configDivideStaff = configDivideStaff.findByPk(new Long(id[i]));
			}
			
			if(!share[i].trim().equals("")){
				configDivideStaff.setShare2(new Long(share[i]));
			}else{
				configDivideStaff.setShare2(new Long(0));
			}
			if(!pos[i].trim().equals("")){
				configDivideStaff.setStaff_poscode(pos[i]);
			}else{
				configDivideStaff.setStaff_poscode(null);
			}
			if(!level[i].trim().equals("")){
				configDivideStaff.setStaff_level(level[i]);
			}else{
				configDivideStaff.setStaff_level(null);
			}
			if(!posname[i].trim().equals("")){
				configDivideStaff.setStaff_posname(posname[i].trim());
			}else{
				configDivideStaff.setStaff_posname(null);
			}
			configDivideStaff.setStaff_offcode(off[i]);
			
			if(configDivideStaff.findByWhere(ConfigDivideStaff.STAFF_IDCARDNOCol + "=?", idcard_no[i]).size() == 0){
				configDivideStaff.setCreate_by(create_by);
				configDivideStaff.setCreate_on(create_on);
				configDivideStaff = configDivideStaff.create();
			}else{
				configDivideStaff.setUpdate_by(update_by);
				configDivideStaff.setUpdate_on(update_on);
				configDivideStaff = configDivideStaff.update();
			}
		}
		//formHandler.setFormMessage("บันทึกข้อมูลเรียบร้อย");
		redirect("process?action=ConfigDivideStaffList_Master&cmd=view&offcode="+offcode);
	}
	public void view(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ConfigDivideStaff configDivideStaff = new ConfigDivideStaff(db);
		String sql="select ed.short_name, cd.id, st.idcard_no,  ti.title_name, st.first_name, st.last_name, st.staff_level , ps.poscode,ps.posname, ed.offcode, ed.offname, cd.share2 "
			+"from staff st "
			+"left join config_divide_staff cd on st.idcard_no=cd.staff_idcardno "
			+"left join title ti on ti.title_code=st.title_code "
			+"left join position ps on trim(st.poscode)=ps.poscode "
			+"inner join ed_office ed on ed.offcode=st.offcode "
			+"where 1=1 and ed.offcode = ? " ;
		String order="order by st.staff_level, st.first_name, st.last_name";
		List listconfigDivideStaff = configDivideStaff.findBySql(sql+order, request.getParameter("offcode"));
		log.debug("viwe="+listconfigDivideStaff);
		request.setAttribute("ListconfigDS", listconfigDivideStaff);
		request.setAttribute("off_code", request.getParameter("offcode"));
		request.setAttribute("off_name",listconfigDivideStaff.get(0) );
		formHandler.setFormMessage("บันทึกข้อมูลเรียบร้อย");
		forward("?page=/Master/ConfigDivideStaffEdit.jsp");
	}
	public void edit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String[] idcard_no = request.getParameterValues("staff_idcardno");
		String[] pos = request.getParameterValues("staff_poscode");
		String[] off = request.getParameterValues("staff_offcode");
		String[] level = request.getParameterValues("staff_level");
		String[] share = request.getParameterValues("share2");
		String[] id = request.getParameterValues("configID");
		
		log.debug("idcard_no= "+idcard_no.length);
		for(int i=0; i < idcard_no.length; i++){
			ConfigDivideStaff configDivideStaff = new ConfigDivideStaff(db);
			
			if(configDivideStaff.findByWhere(ConfigDivideStaff.STAFF_IDCARDNOCol + "=?", idcard_no[i]).size() == 0){
				log.debug("CREATE*****");
				configDivideStaff.setStaff_idcardno(idcard_no[i]);
				if(!share[i].trim().equals("")){
					configDivideStaff.setShare2(new Long(share[i]));
				}else{
					configDivideStaff.setShare2(new Long(0));
				}
				if(!pos[i].trim().equals("")){
					configDivideStaff.setStaff_poscode(pos[i]);
				}else{
					configDivideStaff.setStaff_poscode(" ");
				}
				if(!level[i].trim().equals("")){
					configDivideStaff.setStaff_level(level[i]);
				}else{
					configDivideStaff.setStaff_level(" ");
				}
				
				configDivideStaff.setStaff_offcode(off[i]);
				
				configDivideStaff.setCreate_by(create_by);
				configDivideStaff.setCreate_on(create_on);
				configDivideStaff = configDivideStaff.create();
			}else{
				log.debug("UPDATE****");
				log.debug("id=="+id[i]);
				configDivideStaff = configDivideStaff.findByPk(new Long(id[i]));
				configDivideStaff.setShare2(new Long(share[i]));
				configDivideStaff.setUpdate_by(update_by);
				configDivideStaff.setUpdate_on(update_on);
				configDivideStaff = configDivideStaff.update();
			}
		}
		formHandler.setFormMessage("แก้ไขข้อมูลเรียบร้อย");
		redirect("process?action=ConfigDivideStaffList_Master&cmd=view&offcode="+request.getParameter("offcode"));	
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("chkList");
		log.debug("delete นะท่าน");
		if( ids!=null && ids.length>0 ){
			ConfigDivideStaff configDivideStaff = new ConfigDivideStaff(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ ){
				log.debug("add list" + ids[i]);
				idList.add((ids[i] != null ? new Long(ids[i]) : 0));
			}
			int deleteRow = configDivideStaff.deleteByPks(idList);
		}
		formHandler.setFormMessage("ลบข้อมูลเรียบร้อย");
		redirect("process?action=ConfigDivideStaffList_Master&cmd=view&offcode="+request.getParameter("offcode"));
	}
}
