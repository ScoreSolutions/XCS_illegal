package com.ko.webapp.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.InspectorTeam;
import com.ko.domain.InspectorTeamStaff;
import com.ko.util.ConfigUtil;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

public class InspectorTeamList_MasterAction extends BaseAction{
	String menuID="38";
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			if (uData.IsAdmin()==true)
	        	request.setAttribute("IsAdmin","1");
			
			request.setAttribute("offcode_dept", uData.getOffcode());
			request.setAttribute("namecode_dept", uData.getShortName());
			this.writeTranLog("แสดงรายการคณะผู้จับกุม ผู้ตรวจ");
			forward("?page=/Master/InspectorTeamList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
		
	}

	
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		if (uData.IsAdmin()==true)
        	request.setAttribute("IsAdmin","1");
		
		InspectorTeam inspectorteam = new InspectorTeam(db);
		int i;
		String sql = "select st.id, st.appoint_no, st.job_no,st.appoint_date, "
						+"to_char(st.appoint_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  appioont_date2, "
						+"st.inspector_code, st.offcode_dept, ed.offname offname_dept, s.first_name || ' ' || s.last_name leader_name, "
						+"st.status, decode(st.status,'1','ใช้งาน','0','ยกเลิก') status_name "
						+"from inspector_team st "
						+"inner join ed_office ed on ed.offcode=st.offcode_dept "
						+"left join staff s on s.idcard_no=st.staff_idcardno_leader ";
		String order = "order by ed.offname, st.appoint_date,st.inspector_code ";
		String sqlCount = "select count(*) "
						+"from inspector_team st "
						+"inner join ed_office ed on ed.offcode=st.offcode_dept "
						+"left join staff s on s.idcard_no=st.staff_idcardno_leader ";
		StringBuffer where = new StringBuffer("where 1=1 ");
		String appoint_no = request.getParameter("appoint_no");
		String job_no = request.getParameter("job_no");
		String appoint_date_start = request.getParameter("appoint_date_start");
		String appoint_date_end = request.getParameter("appoint_date_end");
		String inspector_code = request.getParameter("inspector_code");
		String offcode_dept = request.getParameter("offcode_dept");
		String namecode_dept = request.getParameter("namecode_dept");
		String staff_idcardno_leader = request.getParameter("staff_idcardno_leader");
		String status = request.getParameter("status");
		String st=request.getParameter("staff_idcardno_leader");
		int findChar;
		int a;
		String firstname="";
		String lastname="";
		if((appoint_date_start != null && !appoint_date_start.trim().equals(""))&&(appoint_date_end != null && !appoint_date_end.trim().equals(""))){
			where.append("and add_months(to_date(st.appoint_date),6516) between to_date? ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,"('"+appoint_date_start+"','dd/mm/yyyy')");
			where.append("and to_date? ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,"('"+appoint_date_end+"','dd/mm/yyyy')");
		}
		if(!staff_idcardno_leader.trim().equals("")){
			if((findChar=staff_idcardno_leader.indexOf(" "))>= 0 ){
				firstname=staff_idcardno_leader.substring(0, findChar);
				lastname=staff_idcardno_leader.substring(findChar+1, staff_idcardno_leader.length());
				where.append("and s.first_name like ? ");
				a=where.indexOf("?");
				where.replace(a, a+1, "");
				where.insert(a, "'%"+firstname+"%'");
				where.append("and s.last_name like ? ");
				a=where.indexOf("?");
				where.replace(a, a+1, "");  
				where.insert(a, "'%"+lastname+"%'");
			}else{
				where.append("and s.first_name like ? ");
				a=where.indexOf("?");
				where.replace(a, a+1, "");
				where.insert(a, "'%"+staff_idcardno_leader+"%'");
			}
			log.debug(("ชื่อ "+firstname+" นามสกุล "+lastname));
		}
		if(!status.trim().equals("")){
			where.append("and status = ?");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i, "'"+status+"'");
		}
		if(!appoint_no.trim().equals("")){
			where.append("and appoint_no like ?");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i, "'%"+appoint_no+"%'");
		}
		if(!job_no.trim().equals("")){
			where.append("and job_no like ?");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i, "'%"+job_no+"%'");
		}
		if(!inspector_code.trim().equals("")){
			where.append("and inspector_code like ?");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i, "'%"+inspector_code+"%'");
		}
		if(!offcode_dept.trim().equals("")){
			where.append("and offcode_dept = ?");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i, "'"+offcode_dept+"'");
		}
		//if(!namecode_dept.trim().equals("")){
		//	where.append("and ed.short_name like ?");
		//	i=where.indexOf("?");
		//	where.replace(i, i+1, "");
		//	where.insert(i, "'%" + namecode_dept + "%'");
		//}
	
		
		log.debug(sql+where.toString()+order.toString());
		Integer totalRow = inspectorteam.countBySql(sqlCount+where.toString());
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		
		List listinspector = inspectorteam.findBySql(sql+where.toString()+order.toString(), null, pageUtil);
		log.debug(listinspector);
		request.setAttribute("offcode_dept", offcode_dept);
		request.setAttribute("namecode_dept", namecode_dept);
		request.setAttribute("inspec", listinspector);
		this.writeTranLog("ค้นหาคณะผู้จับกุม ผู้ตรวจ");
		forward("?page=/Master/InspectorTeamList.jsp");
	}
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		//String key =new RunningKey(db).getRunningKey("INSPECTOR_TEAM", "", "", "");
		//request.setAttribute("key", key);
		request.setAttribute("offcode_dept", uData.getOffcode());
		request.setAttribute("offname_dept", uData.getShortName());
		
		if (uData.IsAdmin()==true)
        	request.setAttribute("IsAdmin","1");
		
		this.writeTranLog("เพิ่มข้อมูลคณะผู้จับกุม ผู้ตรวจ");
		forward("?page=/Master/InspectorTeamForm.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		InspectorTeam inspec = new InspectorTeam(db);
		String cdate = request.getParameter("appoint_date");
		//SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		Date codate = DateUtil.getDateFromString(cdate);
		inspec.setAppoint_date(codate);
		inspec.setAppoint_no(request.getParameter("appoint_no"));
		inspec.setCancel_date((request.getParameter("cancel_date") != null ? DateUtil.getDateFromString(request.getParameter("cancel_date")) : null));
		inspec.setCreate_by(create_by);
		inspec.setCreate_on(create_on);
		inspec.setInspector_code(request.getParameter("inspector_code"));
		inspec.setInspector_name("");
		inspec.setJob_no(new RunningKey(db).getRunningKey("INSPECTOR_TEAM", "", "", request.getParameter("poscode_leader")));
		inspec.setOffcode_dept(request.getParameter("offcode_dept"));
		inspec.setOffcode_div(request.getParameter("offcode_div"));
		inspec.setOffcode_leader(request.getParameter("offcode_leader"));
		inspec.setPoscode_leader(request.getParameter("poscode_leader"));
		inspec.setStaff_idcardno_leader(request.getParameter("staff_idcardno_leader"));
		//inspec.setId(Long.parseLong(new RunningKey(db).getRunningKey("INSPECTOR_TEAM", "", "", request.getParameter("poscode_leader"))));
		//System.out.println("Statusfffffff " + request.getParameter("status"));
		inspec.setStatus((request.getParameter("status")==null ? "1" : "0"));
		inspec.create();
		log.debug("create InspectorTeam********************");
		String[] first_name = request.getParameterValues("first_name_team");
		String[] last_name = request.getParameterValues("last_name_team");
		String[] title_id = request.getParameterValues("title_id_team");
		//String[] inspector_team_id = request.getParameterValues("inspector_team_id");
		String[] staff_code = request.getParameterValues("staff_offcode_team");
		String[] staff_idcardno = request.getParameterValues("staff_idcardno_team");
		String[] staff_offcode = request.getParameterValues("staff_offcode_team");
		String[] staff_poscode = request.getParameterValues("staff_poscode_team");
		String[] status = request.getParameterValues("status");
		
		if(staff_idcardno != null){			
			for(int a=0; a<staff_idcardno.length ; a++){
					InspectorTeamStaff inspecstaff = new InspectorTeamStaff(db);
					inspecstaff.setCreate_by(create_by);
					inspecstaff.setCreate_on(create_on);
					inspecstaff.setFirst_name(first_name[a]);
					inspecstaff.setInspector_team_id(inspec.getId());
					inspecstaff.setLast_name(last_name[a]);
					inspecstaff.setStaff_code(staff_code[a]);
					inspecstaff.setStaff_idcardno(staff_idcardno[a]);
					inspecstaff.setStaff_offcode(staff_offcode[a]);
					inspecstaff.setStaff_poscode(staff_poscode[a]);
					inspecstaff.setStatus(status[a]);
					inspecstaff.setTitle_id(title_id[a]);
					inspecstaff.create();
					log.debug("create InspectorTeamStaff********************");
					
			}
		}
		//}else{
			//log.debug("ไม่มีข้อมูล");
			//log.debug("ขนาด"+temp.length);
		//}
		this.writeTranLog("บันทึกข้อมูลคณะผู้จับกุม ผู้ตรวจ");
		formHandler.setFormMessage("บันทึกข้อมูลเรียบร้อย");
		//request.setAttribute(arg0, arg1)
		redirect("process?action=InspectorTeamList_Master&cmd=view&id="+inspec.getId(), request, response);
		
	}
	private void viewData(HttpServletRequest request,HttpServletResponse response, String id)throws Exception {
		StringBuffer whereSql1 = new StringBuffer("where st.id = ? ");
		StringBuffer whereSql2 = new StringBuffer("where sts.inspector_team_id = ? ");
		log.debug("id="+id);
		String sql1="select st.id, st.offcode_leader, st.poscode_leader, st.staff_idcardno_leader, st.appoint_no, st.job_no,st.appoint_date,va.posname, va.offname,to_char(st.appoint_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  appioont_date2, "
			+"st.inspector_code, st.offcode_dept,st.offcode_div, ed.short_name offname_dept, ed1.short_name offname_div, s.first_name || ' ' || s.last_name leader_name ,st.status, "
			+"to_char(st.cancel_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  cancel_date2 "
			+"from inspector_team st "
			+"inner join ed_office ed on ed.offcode=st.offcode_dept "
			+"inner join ed_office ed1 on ed1.offcode=st.offcode_div "
			+"inner join V_ACCUSER_LIST_POPUP va on va.idcard_no = st.staff_idcardno_leader "
			+"left join staff s on s.idcard_no=st.staff_idcardno_leader ";
		int i,y;
		i=whereSql1.indexOf("?");  
		whereSql1.replace(i, i+1, "");
		whereSql1.insert(i, "'"+id+"'");
		y=whereSql2.indexOf("?");
		whereSql2.replace(y, y+1, "");
		whereSql2.insert(y, "'"+id+"'");
		String sql2="select sts.id, sts.inspector_team_id, sts.staff_code, sts.title_id, sts.staff_poscode, sts.staff_offcode, sts.staff_idcardno, ti.title_name, st.first_name, st.last_name ,ed.offname,ps.posname || ' ' || st.staff_level posname,sts.status  "
			+"from inspector_team_staff sts "
			+"inner join staff st on st.idcard_no = sts.staff_idcardno "
			+"left join title ti on st.title_code=ti.title_code "
			+"left join position ps on trim(ps.poscode)=trim(st.poscode) "
			+"left join ed_office ed on ed.offcode=st.offcode ";
		if(id != null){
			InspectorTeam inspector = new InspectorTeam(db);
			log.debug("sql1"+sql1+whereSql1.toString());
			List list_inspector = inspector.findBySql(sql1+whereSql1.toString(), null);
			log.debug(list_inspector);
			request.setAttribute("inspec", list_inspector.get(0));
			InspectorTeamStaff inspectorstaff = new InspectorTeamStaff(db);
			log.debug("sql2"+sql2+whereSql2.toString());
			List list_inspectstaff = inspectorstaff.findBySql(sql2+whereSql2.toString(), null);
			log.debug(list_inspectstaff);
			request.setAttribute("inspecstaff", list_inspectstaff);
		
			if (uData.IsAdmin()==true)
	        	request.setAttribute("IsAdmin","1");
			
		}else{
			log.debug("ไม่มี id");
		
		}
	}
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id = ParameterUtil.getStringParam("id", request);
		viewData(request,response,id);
		this.writeTranLog("แสดงรายละเอียดคณะผู้จับกุม ผู้ตรวจ");
		forward("?page=/Master/InspectorTeamEdit.jsp");
	}
	public void cancelCommand(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		String id = request.getParameter("id");
		InspectorTeam inspec = new InspectorTeam(db);
		inspec = inspec.findByPk(new Long(id));
		inspec.setStatus("0");
		inspec.setCancel_date(new Date());
		inspec = inspec.update();
		
		viewData(request,response,id);
		this.writeTranLog("ยกเลิกคำสั่งแต่งตั้งคณะผู้จับกุม ผู้ตรวจ");
		forward("?page=/Master/InspectorTeamEdit.jsp");
	}
	
	public void copy(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id = request.getParameter("id");
		if(id != null){
			InspectorTeam inspec = new InspectorTeam(db);
			InspectorTeamStaff inspecstaff = new InspectorTeamStaff(db);
			inspec = inspec.findByPk(new Long(id));
			if(inspec != null){
				
				inspec.setAppoint_date(inspec.getAppoint_date());
				inspec.setAppoint_no(inspec.getAppoint_no());
				inspec.setCancel_date(null);
				inspec.setCreate_by(inspec.getCreate_by());
				inspec.setCreate_on(inspec.getCreate_on());
				inspec.setInspector_code(inspec.getInspector_code());
				inspec.setInspector_name("");
				inspec.setJob_no(new RunningKey(db).getRunningKey("INSPECTOR_TEAM", "", "", inspec.getPoscode_leader()));
				inspec.setOffcode_dept(inspec.getOffcode_dept());
				inspec.setOffcode_div(inspec.getOffcode_div());
				inspec.setOffcode_leader(inspec.getOffcode_leader());
				inspec.setPoscode_leader(inspec.getPoscode_leader());
				inspec.setStaff_idcardno_leader(inspec.getStaff_idcardno_leader());
				inspec.setStatus(inspec.getStatus());
				inspec.create();
				log.debug("**********InspectorTeam***********create");
				List<InspectorTeamStaff> listinspecstaff = inspecstaff.findByWhere(InspectorTeamStaff.INSPECTOR_TEAM_IDCol +"= ?", id);
				for(int i=0; i<listinspecstaff.size(); i++){
					log.debug("getId["+i+"]="+inspec.getId());
					inspecstaff.setCreate_by(create_by);
					inspecstaff.setCreate_on(create_on);
					inspecstaff.setFirst_name(listinspecstaff.get(i).getFirst_name());
					inspecstaff.setInspector_team_id(inspec.getId());
					inspecstaff.setLast_name(listinspecstaff.get(i).getLast_name());
					inspecstaff.setStaff_code(listinspecstaff.get(i).getStaff_code());
					inspecstaff.setStaff_idcardno(listinspecstaff.get(i).getStaff_idcardno());
					inspecstaff.setStaff_offcode(listinspecstaff.get(i).getStaff_offcode());
					inspecstaff.setStaff_poscode(listinspecstaff.get(i).getStaff_poscode());
					inspecstaff.setStatus(listinspecstaff.get(i).getStatus());
					inspecstaff.setTitle_id(listinspecstaff.get(i).getTitle_id());
					inspecstaff.create();
					log.debug("*******InspectorTeamStaff*******create");
				}
				this.writeTranLog("คัดลอกข้อมูลคณะผู้จับกุม ผู้ตรวจ");
				formHandler.setFormMessage("คัดลอกข้อมูลเรียบร้อย");
				forward("?page=/Master/InspectorTeamList.jsp");
			}
		}else{
			forward("?page=/Master/InspectorTeamList.jsp");
		}
		
	}
	
	private void updateData(HttpServletRequest request,HttpServletResponse response, String id)throws Exception {
		InspectorTeam inspec = new InspectorTeam(db);
		InspectorTeamStaff inspecstaff = new InspectorTeamStaff(db);
		
		String[] id_staff = request.getParameterValues("id_inspecStaff");
		String[] first_name = request.getParameterValues("first_name_team");
		String[] last_name = request.getParameterValues("last_name_team");
		String[] title_id = request.getParameterValues("title_id_team");
		String[] staff_code = request.getParameterValues("staff_offcode_team");
		String[] staff_idcardno = request.getParameterValues("staff_idcardno_team");
		String[] staff_offcode = request.getParameterValues("staff_offcode_team");
		String[] staff_poscode = request.getParameterValues("staff_poscode_team");
		String[] status = request.getParameterValues("status");
		
		if(id != null){
			inspec = inspec.findByPk(new Long(id));
			String cdate = request.getParameter("appoint_date");
			Date codate = DateUtil.getDateFromString(cdate);
			inspec.setAppoint_date(codate);
			inspec.setAppoint_no(request.getParameter("appoint_no"));
			inspec.setCancel_date((request.getParameter("cancel_date") != null ? DateUtil.getDateFromString(request.getParameter("cancel_date")) : null));
			inspec.setUpdate_by(update_by);
			inspec.setUpdate_on(update_on);
			inspec.setInspector_code(request.getParameter("inspector_code"));
			inspec.setInspector_name("");
			inspec.setJob_no(request.getParameter("job_no"));
			inspec.setOffcode_dept(request.getParameter("offcode_dept"));
			inspec.setOffcode_div(request.getParameter("offcode_div"));
			inspec.setOffcode_leader(request.getParameter("offcode_leader"));
			inspec.setPoscode_leader(request.getParameter("poscode_leader"));
			inspec.setStaff_idcardno_leader(request.getParameter("staff_idcardno_leader"));
			//inspec.setStatus(request.getParameter("status_inspec"));
			inspec.setStatus((request.getParameter("status")==null ? "1" : "0"));
			inspec = inspec.update();
			log.debug("update InspectorTeam********************");
			if(id_staff != null){
				for(int i=0; i<id_staff.length; i++){
					if(id_staff[i].trim().equals("add")){
						log.debug(id_staff[i]);
						
						inspecstaff.setCreate_by(create_by);
						inspecstaff.setCreate_on(create_on);
						inspecstaff.setFirst_name(first_name[i]);
						inspecstaff.setInspector_team_id(inspec.getId());
						inspecstaff.setLast_name(last_name[i]);
						inspecstaff.setStaff_code(staff_code[i]);
						inspecstaff.setStaff_idcardno(staff_idcardno[i]);
						inspecstaff.setStaff_offcode(staff_offcode[i]);
						inspecstaff.setStaff_poscode(staff_poscode[i]);
						inspecstaff.setStatus(status[i]);
						inspecstaff.setTitle_id(title_id[i]);
						inspecstaff.create();
						
						log.debug("create in cmd=update InspectorTeamStaff********************");
					}else{
						log.debug(id_staff[i]);
						
						inspecstaff = inspecstaff.findByPk(new Long(id_staff[i]));
						inspecstaff.setUpdate_by(update_by);
						inspecstaff.setUpdate_on(update_on);
						inspecstaff.setFirst_name(first_name[i]);
						inspecstaff.setInspector_team_id(inspec.getId());
						inspecstaff.setLast_name(last_name[i]);
						inspecstaff.setStaff_code(staff_code[i]);
						inspecstaff.setStaff_idcardno(staff_idcardno[i]);
						inspecstaff.setStaff_offcode(staff_offcode[i]);
						inspecstaff.setStaff_poscode(staff_poscode[i]);
						inspecstaff.setStatus(status[i]);
						inspecstaff.setTitle_id(title_id[i]);
						//inspecstaff = inspecstaff.update();
						
						log.debug("update InspectorTeamStaff********************");
					}
				}
			}
			String[] idcheeckbox = request.getParameterValues("chkList");
			if(idcheeckbox != null && idcheeckbox.length > 0){
				List<Long> idcheeckboxList = new ArrayList<Long>();
				for( int m=0; m<idcheeckbox.length; m++ ){
					log.debug(idcheeckbox[m]);
					if(idcheeckbox[m] != "add"){
						idcheeckboxList.add(new Long(idcheeckbox[m]));
					}
					
				}
				if(idcheeckboxList.size() > 0){
					int deleteRow = inspecstaff.deleteByPks(idcheeckboxList);
				}
				
			}
		}
	}
	
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id = request.getParameter("id");
		updateData(request,response,id);
		
		this.writeTranLog("แก้ไขข้อมูลคณะผู้จับกุม ผู้ตรวจ");
		formHandler.setFormMessage("แก้ไขข้อมูลเรียบร้อย");
		redirect("process?action=InspectorTeamList_Master&cmd=view&id="+id, request, response);
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
	}
}
