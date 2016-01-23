package com.ko.webapp.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.DutyGroup;
import com.ko.domain.Legislation;
import com.ko.domain.SuppressTarget;
import com.ko.domain.SuppressTargetItem;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ExportUtil;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.ParameterUtil;

public class SuppressTargetList_MasterAction extends BaseAction{
	String menuID="37";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			Legislation le = new Legislation(db);
			DutyGroup dg = new DutyGroup(db);
			List le_list =le.findAll();
			List dg_list = dg.findAll();
			request.setAttribute("listLegis", le_list);
			request.setAttribute("listDuty", dg_list);
			forward("?page=/Master/SuppressTargetList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String sql="select distinct st.id, st.budget_year, st.qty, st.offcode , st.job_no, ed.offname, "
					+"st.job_date,to_char(st.job_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') job_date2, "
					+"lg.legislation_name ,st.status "
					+"from suppress_target st "
					+"inner join ed_office ed on ed.offcode=st.offcode "
					+"left join ed_office sed on substr(sed.offcode,1,4)=substr(ed.offcode,1,4) "
					+"inner join legislation lg on lg.id=st.legislation_id "
					+"left join duty_group dg on dg.group_id=st.product_group_id ";
		String sqlcount="select count(distinct st.id) "
					+"from suppress_target st "
					+"inner join ed_office ed on ed.offcode=st.offcode "
					+"left join ed_office sed on substr(sed.offcode,1,4)=substr(ed.offcode,1,4) "
					+"inner join legislation lg on lg.id=st.legislation_id "
					+"left join duty_group dg on dg.group_id=st.product_group_id ";
		String order="order by ed.offname, st.budget_year desc";
		StringBuffer where = new StringBuffer("where 1=1 ");
		SuppressTarget suppressTarget = new SuppressTarget(db);
		Legislation le = new Legislation(db);
		DutyGroup dg = new DutyGroup(db);
		List le_list =le.findAll();
		List dg_list = dg.findAll();
		String budget_year = ParameterUtil.getStringParam("budget_year", request);
		String job_no = ParameterUtil.getStringParam("job_no", request);
		String legislation_id = ParameterUtil.getStringParam("cmbLegislation", request);
		String offcode1 = ParameterUtil.getStringParam("offcodeSuppress", request);
		String offcode2 = ParameterUtil.getStringParam("divisioncode", request);
		String product_group_id = ParameterUtil.getStringParam("cmbProductGroup", request);
		String status = ParameterUtil.getStringParam("cmbStatus", request);
		String theDate1 = ParameterUtil.getStringParam("theDate1", request);
		String theDate2 = ParameterUtil.getStringParam("theDate2", request);
		int a;
		if((theDate1 != null && !theDate1.trim().equals(""))&&(theDate2 != null && !theDate2.trim().equals(""))){
			where.append("and add_months(to_date(st.job_date),6516) between to_date? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a,"('"+theDate1+"','dd/mm/yyyy')");
			where.append("and to_date? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a,"('"+theDate2+"','dd/mm/yyyy')");
		}
		if(!budget_year.trim().equals("")){
			where.append(" and budget_year like ?");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'%"+budget_year+"%'");
			System.out.println("where = "+where);
		}
		if(!job_no.trim().equals("")){
			where.append(" and job_no like ?");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'%"+job_no+"%'");
			System.out.println("where = "+where);
		}
		if(!legislation_id.trim().equals("")){
			where.append(" and legislation_id = ?");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+legislation_id+"'");
			System.out.println("where = "+where);
		}
		if(!offcode1.trim().equals("")){
			where.append(" and ed.offcode = ?");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+offcode1+"'");
			System.out.println("where = "+where);
		}
		if(!offcode2.trim().equals("")){
			where.append(" and sed.offcode = ?");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+offcode2+"'");
			System.out.println("where = "+where);
		}
		if(!product_group_id.trim().equals("")){
			where.append(" and group_id = ?");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+product_group_id+"'");
			System.out.println("where = "+where);
		}
		if(!status.trim().equals("")){
			where.append(" and status = ?");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+status+"'");
			System.out.println("where = "+where);
		}
		Integer totalRow = suppressTarget.countBySql(sqlcount+where.toString(), null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		List suppressTargetList =suppressTarget.findBySql(sql+where.toString()+order.toString(), null, pageUtil);
		System.out.println(sql+where.toString()+order.toString());
		log.debug(suppressTargetList);
		request.setAttribute("suppresslist", suppressTargetList);
		request.setAttribute("listLegis", le_list);
		request.setAttribute("listDuty", dg_list);
		forward("?page=/Master/SuppressTargetList.jsp");
	}
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Legislation le = new Legislation(db);
		DutyGroup dg = new DutyGroup(db);
		List le_list =le.findAll();
		List dg_list = dg.findAll();
		request.setAttribute("listLegis", le_list);
		request.setAttribute("listDuty", dg_list);
		forward("?page=/Master/SuppressTargetForm.jsp");
	}
	
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Long id=ParameterUtil.getLongParam("id", request);
		System.out.println("Long id ="+id);
		Legislation le = new Legislation(db);
		DutyGroup dg = new DutyGroup(db);
		SuppressTarget suppressTarget = new SuppressTarget(db);
		SuppressTargetItem suppressTargetItem = new SuppressTargetItem(db);
		//suppressTarget = suppressTarget.findByPk(new Long(id));
		//List suppressTargetList = suppressTarget.findBySql("select st.id, st.offcode, to_char(st.job_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') job_date2, st.job_no, st.budget_year, st.qty, st.legislation_id, st.product_group_id, st.status from suppress_target st where st.id = ? ", id);
		request.setAttribute("suppresstarget",suppressTarget.findByPk(id));
		//request.setAttribute("suppresstargetitem", suppressTargetItem.findByPk(id));
		List le_list =le.findAll();
		List dg_list = dg.findAll();
		log.debug(suppressTarget);
		
		
		request.setAttribute("listLegis", le_list);
		request.setAttribute("listDuty", dg_list);
		forward("?page=/Master/SuppressTargetEdit.jsp");
	}
	
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuppressTarget suppressTarget = new SuppressTarget(db);
		SuppressTargetItem suppressTargetItem = new SuppressTargetItem(db);
		String OffCode = ParameterUtil.getStringParam("offcode", request);
		System.out.println("Offcode="+OffCode);
		String key =new RunningKey(db).getRunningKey("SUPPRESS_TARGET", "", "", OffCode);
		System.out.println("key="+key);
		bindForm(suppressTarget);
		suppressTarget.setCreate_by(create_by);
		suppressTarget.setCreate_on(create_on);
		//suppressTarget.setStatus("0");
		//suppressTarget.setUpdate_by(update_by);
		//suppressTarget.setUpdate_on(update_on);
		suppressTarget.setJob_no(key);
		suppressTarget = suppressTarget.create();
		
		for(int i=1; i<=3; i++){
			suppressTargetItem.setSuppress_target_id(suppressTarget.getId());
			suppressTargetItem.setTarget_type(Integer.toString(i));
			suppressTargetItem.setFine_01(ParameterUtil.getDoubleParam("fine_01"+i, request));
			suppressTargetItem.setFine_02(ParameterUtil.getDoubleParam("fine_02"+i, request));
			suppressTargetItem.setFine_03(ParameterUtil.getDoubleParam("fine_03"+i, request));
			suppressTargetItem.setFine_04(ParameterUtil.getDoubleParam("fine_04"+i, request));
			suppressTargetItem.setFine_05(ParameterUtil.getDoubleParam("fine_05"+i, request));
			suppressTargetItem.setFine_06(ParameterUtil.getDoubleParam("fine_06"+i, request));
			suppressTargetItem.setFine_07(ParameterUtil.getDoubleParam("fine_07"+i, request));
			suppressTargetItem.setFine_08(ParameterUtil.getDoubleParam("fine_08"+i, request));
			suppressTargetItem.setFine_09(ParameterUtil.getDoubleParam("fine_09"+i, request));
			suppressTargetItem.setFine_10(ParameterUtil.getDoubleParam("fine_10"+i, request));
			suppressTargetItem.setFine_11(ParameterUtil.getDoubleParam("fine_11"+i, request));
			suppressTargetItem.setFine_12(ParameterUtil.getDoubleParam("fine_12"+i, request));
			suppressTargetItem.setQty_01(ParameterUtil.getDoubleParam("qty_01"+i, request));
			suppressTargetItem.setQty_02(ParameterUtil.getDoubleParam("qty_02"+i, request));
			suppressTargetItem.setQty_03(ParameterUtil.getDoubleParam("qty_03"+i, request));
			suppressTargetItem.setQty_04(ParameterUtil.getDoubleParam("qty_04"+i, request));
			suppressTargetItem.setQty_05(ParameterUtil.getDoubleParam("qty_05"+i, request));
			suppressTargetItem.setQty_06(ParameterUtil.getDoubleParam("qty_06"+i, request));
			suppressTargetItem.setQty_07(ParameterUtil.getDoubleParam("qty_07"+i, request));
			suppressTargetItem.setQty_08(ParameterUtil.getDoubleParam("qty_08"+i, request));
			suppressTargetItem.setQty_09(ParameterUtil.getDoubleParam("qty_09"+i, request));
			suppressTargetItem.setQty_10(ParameterUtil.getDoubleParam("qty_10"+i, request));
			suppressTargetItem.setQty_11(ParameterUtil.getDoubleParam("qty_11"+i, request));
			suppressTargetItem.setQty_12(ParameterUtil.getDoubleParam("qty_12"+i, request));
			suppressTargetItem.setCreate_by(create_by);
			suppressTargetItem.setCreate_on(create_on);
			//suppressTargetItem.setUpdate_by(update_by);
			//suppressTargetItem.setUpdate_on(update_on);
			suppressTargetItem.create();
			
		}
		redirect("process?action=SuppressTargetList_Master&cmd=edit&id="+suppressTarget.getId());
	}
	public void ExportExcel(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Long id=ParameterUtil.getLongParam("id", request);
		System.out.println("Long id ="+id);
		Legislation le = new Legislation(db);
		DutyGroup dg = new DutyGroup(db);
		
		SuppressTarget suppressTarget = new SuppressTarget(db);
		SuppressTarget suppressTargetItem = new SuppressTarget(db);
		
		
		String sql="select  (aa.qty_10+aa.qty_11+aa.qty_12+aa.qty_01+aa.qty_02+aa.qty_03+aa.qty_04+aa.qty_05+aa.qty_06+aa.qty_07+aa.qty_08+aa.qty_09) as total_qty,"
			      +" (aa.fine_10+aa.fine_11+aa.fine_12+aa.fine_01+aa.fine_02+aa.fine_03+aa.fine_04+aa.fine_05+aa.fine_06+aa.fine_07+aa.fine_08+aa.fine_09) as total_fine, aa.* "
			      +"from (  "
			      +"select  sum(sti.qty_10) as qty_10, sum(sti.fine_10) as fine_10, "
			      +" sum(sti.qty_11) as qty_11, sum(sti.fine_11) as fine_11, "
			      +" sum(sti.qty_12) as qty_12, sum(fine_12) as fine_12, "
			      +" sum(sti.qty_01) as qty_01, sum(fine_01) as fine_01, "
		          +" sum(sti.qty_02) as qty_02, sum(fine_02) as fine_02, "
		          +" sum(sti.qty_03) as qty_03, sum(fine_03) as fine_03, "
		          +" sum(sti.qty_04) as qty_04, sum(fine_04) as fine_04, "
		          +" sum(sti.qty_05) as qty_05, sum(fine_05) as fine_05, "
		          +" sum(sti.qty_06) as qty_06, sum(fine_06) as fine_06, "
		          +" sum(sti.qty_07) as qty_07, sum(fine_07) as fine_07, "
		          +" sum(sti.qty_08) as qty_08, sum(fine_08) as fine_08, "
		          +" sum(sti.qty_09) as qty_09, sum(fine_09) as fine_09  "
		          +" from suppress_target_item sti "
		          +"where sti.suppress_target_id = "+ id +" ) aa ";
		
		request.setAttribute("suppresstarget",suppressTarget.findByPk(id));
		request.setAttribute("suppressTargetItemSum",suppressTargetItem.findBySql(sql));
		
		//List le_list =le.findAll();
		//List dg_list = dg.findAll();
		//request.setAttribute("listLegis", le_list);
		//request.setAttribute("listDuty", dg_list);
		
		
		SuppressTarget suppressTargetHeader = new SuppressTarget(db);
		
		String sqlhd ="select nvl(l.legislation_name,'') as legislation_name ,nvl(dg.group_name,'') as group_name " 
				      +"from suppress_target st "
					  +" left join legislation l on st.legislation_id = l.id "
					  +" left join duty_group dg on st.product_group_id = dg.group_id "
					  +" where st.id = "+ id ;
		
		List<Map<String,Object>> hdList = suppressTargetHeader.findBySql(sqlhd);
		
		request.setAttribute("suppressTargetItemHeader",hdList.get(0));	
		forward("/Master/SuppressTargetToExcel.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Long id=ParameterUtil.getLongParam("id", request);
		SuppressTarget suppresstarget = new SuppressTarget(db);
		SuppressTargetItem suppressTargetItem = new SuppressTargetItem(db);
		suppresstarget = suppresstarget.findByPk(id);
		bindForm(suppresstarget);
		
		suppresstarget.setUpdate_by(update_by);
		suppresstarget.setUpdate_on(update_on);
		suppresstarget = suppresstarget.update();
		//String[] idItem = request.getParameterValues("");
		for(int i=1; i<=3; i++){
			suppressTargetItem = suppressTargetItem.findByPk(new Long(request.getParameter("id_item"+i)));
			suppressTargetItem.setSuppress_target_id(suppresstarget.getId());
			suppressTargetItem.setTarget_type(Integer.toString(i));
			suppressTargetItem.setFine_01(ParameterUtil.getDoubleParam("fine_01"+i, request));
			suppressTargetItem.setFine_02(ParameterUtil.getDoubleParam("fine_02"+i, request));
			suppressTargetItem.setFine_03(ParameterUtil.getDoubleParam("fine_03"+i, request));
			suppressTargetItem.setFine_04(ParameterUtil.getDoubleParam("fine_04"+i, request));
			suppressTargetItem.setFine_05(ParameterUtil.getDoubleParam("fine_05"+i, request));
			suppressTargetItem.setFine_06(ParameterUtil.getDoubleParam("fine_06"+i, request));
			suppressTargetItem.setFine_07(ParameterUtil.getDoubleParam("fine_07"+i, request));
			suppressTargetItem.setFine_08(ParameterUtil.getDoubleParam("fine_08"+i, request));
			suppressTargetItem.setFine_09(ParameterUtil.getDoubleParam("fine_09"+i, request));
			suppressTargetItem.setFine_10(ParameterUtil.getDoubleParam("fine_10"+i, request));
			suppressTargetItem.setFine_11(ParameterUtil.getDoubleParam("fine_11"+i, request));
			suppressTargetItem.setFine_12(ParameterUtil.getDoubleParam("fine_12"+i, request));
			suppressTargetItem.setQty_01(ParameterUtil.getDoubleParam("qty_01"+i, request));
			suppressTargetItem.setQty_02(ParameterUtil.getDoubleParam("qty_02"+i, request));
			suppressTargetItem.setQty_03(ParameterUtil.getDoubleParam("qty_03"+i, request));
			suppressTargetItem.setQty_04(ParameterUtil.getDoubleParam("qty_04"+i, request));
			suppressTargetItem.setQty_05(ParameterUtil.getDoubleParam("qty_05"+i, request));
			suppressTargetItem.setQty_06(ParameterUtil.getDoubleParam("qty_06"+i, request));
			suppressTargetItem.setQty_07(ParameterUtil.getDoubleParam("qty_07"+i, request));
			suppressTargetItem.setQty_08(ParameterUtil.getDoubleParam("qty_08"+i, request));
			suppressTargetItem.setQty_09(ParameterUtil.getDoubleParam("qty_09"+i, request));
			suppressTargetItem.setQty_10(ParameterUtil.getDoubleParam("qty_10"+i, request));
			suppressTargetItem.setQty_11(ParameterUtil.getDoubleParam("qty_11"+i, request));
			suppressTargetItem.setQty_12(ParameterUtil.getDoubleParam("qty_12"+i, request));
			//suppressTargetItem.setCreate_by(create_by);
			//suppressTargetItem.setCreate_on(create_on);
			suppressTargetItem.setUpdate_by(update_by);
			suppressTargetItem.setUpdate_on(update_on);
			suppressTargetItem = suppressTargetItem.update();
			
		}
		redirect("process?action=SuppressTargetList_Master&cmd=edit&id="+suppresstarget.getId());
	}
	public void copy(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Long id = ParameterUtil.getLongParam("id", request);
		SuppressTarget suppressTarget = new SuppressTarget(db);
		if(id != null){
			
			suppressTarget = suppressTarget.findByPk(id);
			//log.debug("Budget_year"+suppressTarget.getBudget_year());
			suppressTarget.setBudget_year(suppressTarget.getBudget_year());
			suppressTarget.setJob_date(suppressTarget.getJob_date());
			suppressTarget.setJob_no(new RunningKey(db).getRunningKey("SUPPRESS_TARGET", "", "", suppressTarget.getOffcode()));
			suppressTarget.setLegislation_id(suppressTarget.getLegislation_id());
			suppressTarget.setOffcode(suppressTarget.getOffcode());
			suppressTarget.setProduct_group_id(suppressTarget.getProduct_group_id());
			suppressTarget.setQty(suppressTarget.getQty());
			suppressTarget.setStatus(suppressTarget.getStatus());
			suppressTarget.setCreate_by(create_by);
			suppressTarget.setCreate_on(create_on);
			suppressTarget.create();
			log.debug("*****copy suppressTarget");
			SuppressTargetItem suppressTargetItem = new SuppressTargetItem(db);
			List<SuppressTargetItem> listsuppressTargetItem = suppressTargetItem.findByWhere(SuppressTargetItem.SUPPRESS_TARGET_IDCol +"= ?", id);
			for(int i=0; i<listsuppressTargetItem.size(); i++){
				suppressTargetItem.setTarget_type(listsuppressTargetItem.get(i).getTarget_type());
				suppressTargetItem.setSuppress_target_id(suppressTarget.getId());
				suppressTargetItem.setCreate_by(create_by);
				suppressTargetItem.setCreate_on(create_on);
				suppressTargetItem.setFine_01(listsuppressTargetItem.get(i).getFine_01());
				suppressTargetItem.setFine_02(listsuppressTargetItem.get(i).getFine_02());
				suppressTargetItem.setFine_03(listsuppressTargetItem.get(i).getFine_03());
				suppressTargetItem.setFine_04(listsuppressTargetItem.get(i).getFine_04());
				suppressTargetItem.setFine_05(listsuppressTargetItem.get(i).getFine_05());
				suppressTargetItem.setFine_06(listsuppressTargetItem.get(i).getFine_06());
				suppressTargetItem.setFine_07(listsuppressTargetItem.get(i).getFine_07());
				suppressTargetItem.setFine_08(listsuppressTargetItem.get(i).getFine_08());
				suppressTargetItem.setFine_09(listsuppressTargetItem.get(i).getFine_09());
				suppressTargetItem.setFine_10(listsuppressTargetItem.get(i).getFine_10());
				suppressTargetItem.setFine_11(listsuppressTargetItem.get(i).getFine_11());
				suppressTargetItem.setFine_12(listsuppressTargetItem.get(i).getFine_12());
				suppressTargetItem.setQty_01(listsuppressTargetItem.get(i).getQty_01());
				suppressTargetItem.setQty_02(listsuppressTargetItem.get(i).getQty_02());
				suppressTargetItem.setQty_03(listsuppressTargetItem.get(i).getQty_03());
				suppressTargetItem.setQty_04(listsuppressTargetItem.get(i).getQty_04());
				suppressTargetItem.setQty_05(listsuppressTargetItem.get(i).getQty_05());
				suppressTargetItem.setQty_06(listsuppressTargetItem.get(i).getQty_06());
				suppressTargetItem.setQty_07(listsuppressTargetItem.get(i).getQty_07());
				suppressTargetItem.setQty_08(listsuppressTargetItem.get(i).getQty_08());
				suppressTargetItem.setQty_09(listsuppressTargetItem.get(i).getQty_09());
				suppressTargetItem.setQty_10(listsuppressTargetItem.get(i).getQty_10());
				suppressTargetItem.setQty_11(listsuppressTargetItem.get(i).getQty_11());
				suppressTargetItem.setQty_12(listsuppressTargetItem.get(i).getQty_12());
				suppressTargetItem.create();
				
			}
		}
		redirect("process?action=SuppressTargetList_Master&cmd=list&cmbLegislation="+suppressTarget.getLegislation_id());
	}
}
