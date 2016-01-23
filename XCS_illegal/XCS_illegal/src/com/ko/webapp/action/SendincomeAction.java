
package com.ko.webapp.action;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

//import com.ko.Constants;
//import com.ko.util.ConfigUtil;
import com.ko.util.DB;
import com.ko.util.RunningKey;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.ResultSet;
import com.ko.util.DateUtil;
//import com.ko.webapp.bean.UserSession;
import com.ko.webapp.util.ParameterUtil;
import com.ko.domain.*;
//import com.ko.service.EdOfficeService;
//import com.pccth.rdbservice.*;

public class SendincomeAction  extends BaseAction {

	public void preup(HttpServletRequest request,	HttpServletResponse response)  {
		try
		{
			pre(request, response);
			ApplicationOutsideProve si = new ApplicationOutsideProve(db);
			String sql ;
			String listsql;
			
			sql = 
				" select si.id,si.offcode_area,si.send_no, si.send_date,si.send_doc_no, si.posname_lean, "+
				" to_char(si.send_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  send_date2,"+
				" si.legislation_id, lg.legislation_name, si.offcode_write, nvl(si.offname_write, edw.short_name) offname_write, "+
				" tip.title_name || stp.first_name || ' ' || stp.last_name staff_id_send_name,"+
				" ti.title_name || st.first_name || ' ' || st.last_name staff_id_approve_name,"+
				" si.staff_id_send,si.poscode_send,ps.posname || stp.staff_level posname_send,"+
				" si.staff_id_approve,si.poscode_approve,ps2.posname || st.staff_level posname_approve,"+
				" si.status "+
				" from send_income si"+
				" inner join legislation lg on lg.id=si.legislation_id"+
				" left join ed_office edw on edw.offcode=si.offcode_write"+
				"  left join staff stp on stp.idcard_no=si.staff_id_send"+
				" left join position ps on ps.poscode = si.poscode_send"+
				" left join title tip on tip.title_code=stp.title_code"+
				" left join staff st on st.idcard_no=si.staff_id_approve"+
				" left join position ps2 on ps2.poscode = si.poscode_approve"+
				" left join title ti on ti.title_code=st.title_code"+
				" where si.id = ? ";
			//log.debug(sql);
			listsql = "select sic.id, sc.compare_case_id,sc.compare_case_no,sc.compare_case_date, \n"+
					" sc.compare_case_date2,sc.product_group_id,sc.group_name,sc.legislation_id, \n"+
					" sc.legislation_name,sc.offcode,sc.offname, \n"+
					" trim(to_char(sc.fine_money,'999G999G990D99MI')) fine_money, trim(to_char(sc.treasury_money,'999G999G990D99MI')) treasury_money, \n"+
					" trim(to_char(sc.birbe_money,'999G999G990D99MI')) birbe_money, trim(to_char(sc.reward_money,'999G999G990D99MI')) reward_money , \n" +
					" sc.status_code,sc.status_name,sc.LAWBREAKER_QTY, pke_compare.getInvNo(sic.compare_case_id) inv_no, sic.ref_type  \n"+
					" from SEND_INCOME_CASE sic  \n"+
					" inner join V_COMPARE_CASE_POPUP sc on sc.compare_case_id=sic.compare_case_id and sic.ref_type='COMPARE_CASE' \n"+
					" where sic.send_income_id = '" + ParameterUtil.getLongParam("id", request) + "' \n"+
					" union all  \n"+
					" select sic.id, sic.compare_case_id,cc.compare_case_no,ccc.change_date, \n"+
					" TO_CHAR(ccc.change_date , 'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2, \n" +
					" aa.product_group_id,dg.group_name,aa.legislation_id, \n"+
					" lg.legislation_name,aa.offcode,ed.offname, \n"+
					" trim(to_char((ccc.change_money-ccc.case_fine_old)*pke_arrest.getLawBreakerQty (cc.track_no),'999G999G990D99MI')) fine_money, \n" +
					" trim(to_char((((ccc.change_money-ccc.case_fine_old)*cc.treasury_money_p)/100)*pke_arrest.getLawBreakerQty (cc.track_no),'999G999G990D99MI')) treasury_money, \n" +
					" trim(to_char((((ccc.change_money-ccc.case_fine_old)*cc.bribe_money_p)/100)*pke_arrest.getLawBreakerQty (cc.track_no),'999G999G990D99MI')) bribe_money, \n" +
					" trim(to_char((((ccc.change_money-ccc.case_fine_old)*cc.reward_money_p)/100)*pke_arrest.getLawBreakerQty (cc.track_no),'999G999G990D99MI')) reward_money, \n" +
					" pke_compare.getCompareStatus (aa.track_no, '0') status_code, \n" +
					" pke_compare.getCompareStatus (aa.track_no, '1') status_name, \n" +
					" pke_arrest.getLawBreakerQty (cc.track_no) lawbreaker_qty, \n" +
					" pke_compare.getChangeInvNo(ccc.id) inv_no,  'COMPARE_CASE_CHANGE' ref_type \n"+
					" from SEND_INCOME_CASE sic  \n"+
					" inner join COMPARE_CASE cc on cc.id=sic.compare_case_id and sic.ref_type='COMPARE_CASE_CHANGE'  \n"+
					" inner join COMPARE_CASE_CHANGE ccc on cc.id=ccc.compare_case_id  \n"+
					" inner join application_arrest aa ON aa.track_no = cc.track_no \n " +
					" inner join duty_group dg ON dg.GROUP_ID = aa.product_group_id \n"+
					" inner join legislation lg on lg.id=aa.legislation_id \n"+
					" inner join ed_office ed on ed.offcode=aa.offcode"+
					" where sic.send_income_id = '" + ParameterUtil.getLongParam("id", request) + "' \n";
			
			log.debug(listsql);
	
			Map<String, Object> simap = si.findBySql(sql,ParameterUtil.getLongParam("id", request)).get(0);
			List<Map<String, Object>> listsc = si.findBySql(listsql);
			si = si.findByPk(ParameterUtil.getLongParam("id", request));
			
			try
			{
				DB db1 = new DB();
				PreparedStatement pre1 = null;
				ResultSet rs;
				String sqlC="";
				sqlC += " select docref_no";
				sqlC += " from INCTRTMP_LAW";
				sqlC += " where docref_no='" + simap.get("send_no").toString() + "' ";
				sqlC += " and rec_status = '1' and rownum = 1";
				log.debug(sqlC);
				pre1 = db1.getParameterizedStatement(sqlC,null);
		        rs = pre1.executeQuery();
		        if(rs.next())
		        	request.setAttribute("isCancelSend", "N");
		        else
		        	request.setAttribute("isCancelSend", "Y");
		        	
				pre1.close();
				db1.closedb();
				pre1 = null;
				db1 = null;
			}catch(java.sql.SQLException ex){
				ex.printStackTrace();
			}

			request.setAttribute("staff_id_send", (simap.get("staff_id_send") != null ? simap.get("staff_id_send").toString() : ""));
			request.setAttribute("staff_id_send_name",(simap.get("staff_id_send_name") != null ? simap.get("staff_id_send_name").toString() : ""));
			request.setAttribute("poscode_send",(simap.get("poscode_send") != null ? simap.get("poscode_send").toString() : ""));
			request.setAttribute("posname_send",(simap.get("posname_send") != null ? simap.get("posname_send").toString() : ""));
			request.setAttribute("offcode_write", (simap.get("offcode_write") != null ? simap.get("offcode_write").toString() : ""));
			request.setAttribute("offname_write", (simap.get("offname_write") != null ? simap.get("offname_write").toString() : ""));
			request.setAttribute("offcode_area", (simap.get("offcode_area") != null ? simap.get("offcode_area").toString() : ""));
			
			request.setAttribute("listsc", listsc);
			request.setAttribute("db", simap);
			request.setAttribute("si", si);
			request.setAttribute("action","process?action=Sendincome&id="+ParameterUtil.getLongParam("id", request)+"&cmd=preup");
			//log.debug(request.getAttribute("SaveMSG"));
			if(request.getParameter("SaveMSG") != null)
	    		request.setAttribute("SaveMSG", "1");
			
			this.writeTranLog("แสดงรายการนำส่งเงินรายได้");
			
			//HttpSession session = request.getSession();
	        //request.setAttribute("ResponseTime", DateUtil.getResponseTime(session.getAttribute("ResponseTime") != null ? new Long(session.getAttribute("ResponseTime").toString()) : 0l));
	        //session.removeAttribute("ResponseTime");
	    	
			forward("?page=/CompareCase/send_income_edit.jsp", request,response);
		}
		catch(Exception ex){
			
		}

	}
	public void pre(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		//log.debug("Start Pre");
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by id", null);
		
		DutyGroup dg = new DutyGroup(db);
		List<Map<String,Object>> dglist = dg.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);

		EdOffice ed = new EdOffice(db);
		List<Map<String,Object>> edlist =  ed.findBySql(" select offcode, short_name from ed_office order by short_name", null);

	    if (uData.IsAdmin()==true)
		   request.setAttribute("IsAdmin","1");
	    
	    request.setAttribute("userOffcode", uData.getOffcode().toString());
		request.setAttribute("ltlist", ltlist);
		request.setAttribute("edlist", edlist);
		request.setAttribute("dglist", dglist);
		//log.debug("End Pre");
	}
	String menuID = "15";
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		if(uData.chkUserMenu(menuID)==true){
           pre(request,response);
           
           forward("?page=/CompareCase/send_income_search.jsp", request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}

	public void findArrest(HttpServletRequest request,HttpServletResponse response)throws Exception{

		forward("process?action=Arrest", request, response);
	}
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception{
		log.debug("Start Add");
		 pre(request, response);
		 this.writeTranLog("เพิ่มข้อมูลการนำส่งเงินรายได้");
		 
		 //UserSession uData = new UserSession();
		 //uData = (UserSession)request.getSession().getAttribute(Constants.USER_SESSION);
		
		 request.setAttribute("staff_id_send", uData.getIdCard());
		 request.setAttribute("staff_id_send_name",uData.getFullName());
		 request.setAttribute("poscode_send",uData.getPoscode());
		 request.setAttribute("posname_send", uData.getPosname());
		 request.setAttribute("offcode_write", uData.getOffcode());
		 request.setAttribute("offname_write", uData.getOffname());
		 request.setAttribute("offcode_area", uData.getOffcode());
		
		 request.setAttribute("action","process?action=Sendincome&cmd=add");
      //  pke_arrest(aal.id);
		 log.debug("End Add");
		forward("?page=/CompareCase/send_income_form.jsp", request, response);

	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();
    	session.setAttribute("ResponseTime", System.currentTimeMillis());
    	
		SendIncome si =new SendIncome(db);
		String vConfirm="";
		
	    si= si.findByPk(ParameterUtil.getLongParam("id", request));
	    if(ParameterUtil.getStringParam("confirm", request)!=null && !ParameterUtil.getStringParam("confirm", request).equals("")){
	    	vConfirm = ParameterUtil.getStringParam("confirm", request);
	    	si.setStatus(vConfirm);
	    }
	    si.setSend_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("send_date", request)));
        si.setSend_doc_no(ParameterUtil.getStringParam("send_doc_no", request));
        si.setOffcode_write(ParameterUtil.getStringParam("offcode_write", request));
        si.setOffname_write(ParameterUtil.getStringParam("offname_write", request));
        si.setLegislation_id(ParameterUtil.getLongParam("legislation_id", request));
        si.setStaff_id_send(ParameterUtil.getStringParam("staff_id_send", request));
        si.setPoscode_send(ParameterUtil.getStringParam("poscode_send", request));
        si.setOffcode_area(ParameterUtil.getStringParam("offcode_area", request));
        si.setStaff_id_approve(ParameterUtil.getStringParam("staff_id_approve", request));
        si.setPoscode_approve(ParameterUtil.getStringParam("poscode_approve", request));
        si.setPosname_lean(ParameterUtil.getStringParam("posname_lean", request));
        si.setUpdate_by(update_by);
        si.setUpdate_on(update_on);
        si = si.update();
        uplist(request, response, si);
        //request.setAttribute("SaveMSG", "1");
        if (vConfirm.equals("1")){
        	SendIncome(ParameterUtil.getLongParam("id", request), request);
        }else{
        	this.writeTranLog("บันทึกข้อมูลการนำส่งเงินรายได้");
        }
        
        redirect("process?action=Sendincome&id="+si.getId()+"&SaveMSG=1&cmd=preup", request, response);
	}
	public void cancelSendIncome(HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();
    	session.setAttribute("ResponseTime", System.currentTimeMillis());
		
		String id = request.getParameter("id").toString();
		
		//System.out.println("ยกเลิกใบนำส่งเงิน");
		SendIncome si =new SendIncome(db);
	    si= si.findByPk(ParameterUtil.getLongParam("id", request));
	    si.setStatus("2");
	    si = si.update();
	    
	    SendIncomeCase sc = new SendIncomeCase(db);
	    List<SendIncomeCase> scList = sc.findByWhere("send_income_id = '" + si.getId() + "'" , null);
	    if(scList != null){
	    	for(int i=0;i<scList.size();i++){
	    		CompareCase cc = new CompareCase(db);
	    		cc = cc.findByPk(scList.get(i).getCompare_case_id());
	    		cc.setCase_status("2"); //ชำระเงินค่าปรับเรียบร้อย
	    		cc = cc.update();
	    	}
	    }
	    
	    
	    
	    
	    DB db1 = new DB();
		PreparedStatement pre1 = null;
		//คืนสถานะการปรับเพิ่ม จาก 2 เป็น 1
		pre1 = db1.getParameterizedStatement("update compare_case_change set send_income_status='1' where compare_case_id in (select compare_case_id from send_income_case where send_income_id='" + si.getId() + "') ", null);
		pre1.execute();
		
		//System.out.println("//ยกเลิกการนำส่งเงินแล้ว ก็ตัองลบข้อมูลใน Temp ในระบบงานรายได้");
		pre1 = db1.getParameterizedStatement("delete from INCTRTMP_LAW where docref_no = '" + si.getSend_no() + "'", null);
		pre1.execute();
		
		pre1.close();
		db1.closedb();
		pre1 = null;
		db1 = null;
	    
	    redirect("process?action=Sendincome&id="+id+"&cmd=preup", request, response);
	}
	private void SendIncome(Long vID, HttpServletRequest request) throws Exception{
		
		String sql= " SELECT SYS_FROM, DOCREF_NO, SEQ_NO, ";
		sql += " OFFCODE_WRITE, OFFCODE_OWN, to_char(REF_DATE,'yyyy-MM-dd') REF_DATE, ";
		sql += " GROUP_ID, sum(TAX_AMT) TAX_AMT, SUM(BRIBE_AMT) BRIBE_AMT, ";
		sql += " SUM(REWARD_AMT) REWARD_AMT ,SUM(NETTAX_AMT) NETTAX_AMT, ";
		sql += " SUM(PAID_AMT) PAID_AMT , SUM(CNT_NUM) CNT_NUM, REC_STATUS, INCIMP_FLAG, FORM_CODE";
		sql += " FROM V_SEND_INCOME_DESC ";
		sql += " WHERE SEND_INCOME_ID=" + vID;
		sql += " GROUP BY SYS_FROM, DOCREF_NO, SEQ_NO,";
		sql += " OFFCODE_WRITE, OFFCODE_OWN, to_char(REF_DATE,'yyyy-MM-dd'),GROUP_ID,";
		sql += " REC_STATUS, INCIMP_FLAG, FORM_CODE";
		
		SendIncomeCase sc = new SendIncomeCase(db);
	    List<Map<String,Object>> scList = sc.findBySql(sql);
		if (scList.size()>0){
			DB db1 = new DB();
			PreparedStatement pre1 = null;
			for(int i=0;i<scList.size();i++){
				log.debug(scList.size() + " #### " + i);
				
				String SysFrom = scList.get(i).get("sys_from").toString();
				String DocRefNo = scList.get(i).get("docref_no").toString();
				String SeqNo = scList.get(i).get("seq_no").toString();
				String vOffcode = scList.get(i).get("offcode_write").toString();
				String OffcodeOwn = scList.get(i).get("offcode_own").toString();
				String RefDate = scList.get(i).get("ref_date").toString();
				String GroupID = scList.get(i).get("group_id").toString();
				String TaxAmt = scList.get(i).get("tax_amt").toString();
				String BirbeAmt = scList.get(i).get("bribe_amt").toString();
				String RewardAmt = scList.get(i).get("reward_amt").toString();
				String NettaxAmt = scList.get(i).get("nettax_amt").toString();
				String PaidAmt = scList.get(i).get("paid_amt").toString();
				String CntNum = scList.get(i).get("cnt_num").toString();
				String RecStatus = scList.get(i).get("rec_status").toString();
				String IncimpFlag = scList.get(i).get("incimp_flag").toString();
				String FormCode = scList.get(i).get("form_code").toString();
				
				try
				{
					String sqlSend = "";
					sqlSend += " INSERT INTO INCTRTMP_LAW (SYS_FROM, DOCREF_NO, SEQ_NO, ";
			        sqlSend += " OFFCODE, OFFCODE_OWN, REF_DATE, ";
			        sqlSend += " GROUP_ID, TAX_AMT, BRIBE_AMT, ";
			        sqlSend += " REWARD_AMT, NETTAX_AMT, PAID_AMT,  CNT_NUM, REC_STATUS, INCIMP_FLAG, ";
			        sqlSend += " UPD_USERID, UPD_DATE, FORM_CODE) ";
			        sqlSend += " VALUES('" + SysFrom + "','" + DocRefNo + "','" + SeqNo + "',";
			        sqlSend += " '" + vOffcode + "','" + OffcodeOwn + "',to_date('" + RefDate + "','yyyy-mm-dd'),";
			        sqlSend += " '" + GroupID + "','" + TaxAmt + "','" + BirbeAmt + "',";
			        sqlSend += " '" + RewardAmt + "','" + NettaxAmt + "','" + PaidAmt + "','" + CntNum + "','" + RecStatus + "','" + IncimpFlag + "',";
			        sqlSend += " '" + uData.getUserId().toString() + "',sysdate,'" + FormCode + "'";
			        sqlSend += " )";
			        log.debug(sqlSend);
			        	
			        pre1 = db1.getParameterizedStatement(sqlSend,null);
			        pre1.execute();
				}catch(Exception ex){
					this.SaveErrorLog("Send income Error \n"+ ex.getMessage());
					ex.printStackTrace();
					break;
				}
	    	}
			
			//นำส่งเงินแล้วก็ต้อง Update สถาะนของคดีเปรียบเทียบปรับเป็น 3 (นำส่งเงินเรียบร้อย)
	        String sqlU = "";
	        sqlU = " update compare_case ";
	        sqlU += " set case_status='3' ";
	        sqlU += " where id in (select compare_case_id from send_income_case where send_income_id = '" + vID + "' and ref_type='COMPARE_CASE')";
	        pre1 = db1.getParameterizedStatement(sqlU, null);
	        pre1.execute();
	        
	        //ถ้ามีรายการปรับเพิ่ม ที่นำส่งเงิน ก็ให้ Update สถานะของการปรับเพิ่มเป็น 2 (นำส่งเงินรายได้แล้ว)
			sqlU = " update compare_case_change ";
			sqlU += " set send_income_status='2'";
			sqlU += " where compare_case_id in (select compare_case_id from send_income_case where send_income_id = '" + vID + "' and ref_type='COMPARE_CASE_CHANGE')";
			pre1 = db1.getParameterizedStatement(sqlU, null);
	        pre1.execute();
	        
	        pre1.close();
			db1.closedb();
			pre1 = null;
			db1 = null;
			
			this.writeTranLog("นำส่งเงินรายได้");
		}
	}
	
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception{
		log.debug("Start Create");
		HttpSession session = request.getSession();
    	session.setAttribute("ResponseTime", System.currentTimeMillis());
    	
        SendIncome si =new SendIncome(db);      
        if(ParameterUtil.getStringParam("confirm", request)!=null && !ParameterUtil.getStringParam("confirm", request).equals("")){
	       si.setStatus(ParameterUtil.getStringParam("confirm", request));
	      }
        si.setSend_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("send_date", request)));
        si.setSend_doc_no(ParameterUtil.getStringParam("send_doc_no", request));
        si.setOffcode_write(ParameterUtil.getStringParam("offcode_write", request).trim());
        si.setOffname_write(ParameterUtil.getStringParam("offname_write", request).trim());
        si.setLegislation_id(ParameterUtil.getLongParam("legislation_id", request));
        si.setStaff_id_send(ParameterUtil.getStringParam("staff_id_send", request));
        si.setPoscode_send(ParameterUtil.getStringParam("poscode_send", request));
        si.setOffcode_area(ParameterUtil.getStringParam("offcode_area", request).trim());
        si.setStaff_id_approve(ParameterUtil.getStringParam("staff_id_approve", request));
        si.setPoscode_approve(ParameterUtil.getStringParam("poscode_approve", request));
        si.setPosname_lean(ParameterUtil.getStringParam("posname_lean", request));
        si.setSend_no(new RunningKey(db).getRunningKey("SEND_INCOME", "", "",offcode));
        si.setCreate_by(create_by);
        si.setCreate_on(create_on);
        si = si.create();
        uplist(request, response, si);
        this.writeTranLog("บันทึกข้อมูลการนำส่งเงินรายได้");

        log.debug("End Create");
		redirect("process?action=Sendincome&id="+si.getId()+"&SaveMSG=1&cmd=preup", request, response);
		
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception{
		pre(request, response);
		
		
		String whText = " where 1 = 1 ";
		if(!request.getParameter("send_no").trim().equals(""))
			whText += " and si.send_no like '" + request.getParameter("send_no").trim() + "' \n";
		if(!request.getParameter("send_date1").trim().equals(""))
			whText += " and to_char(si.send_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("send_date1").trim()) + "' \n";
		if(!request.getParameter("send_date2").trim().equals(""))
			whText += " and to_char(si.send_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("send_date2").trim()) + "' \n";
		if(!request.getParameter("legislation_id").trim().equals(""))
			whText += " and si.legislation_id = '" + request.getParameter("legislation_id").trim() + "' \n";
		if(!request.getParameter("compare_case_no").trim().equals(""))
			whText += " and cc.compare_case_no = '" + request.getParameter("compare_case_no").trim() + "' \n";
		
		if(uData.IsAdmin()==true){
			if(!request.getParameter("offcode_write").trim().equals("")){
				whText += " and si.offcode_write = '" + request.getParameter("offcode_write").trim() + "' \n";
				request.setAttribute("userOffcode", request.getParameter("offcode_write").trim());
			}
		}else{
			whText += " and si.offcode_write = '" + uData.getOffcode() + "' \n";
			request.setAttribute("userOffcode", uData.getOffcode().toString());
		}
		if(!request.getParameter("province").trim().equals(""))
			whText += " and pv.province_code = '" + request.getParameter("province").trim() + "' \n";
		if(!request.getParameter("status").trim().equals(""))
			whText += " and si.status='" + request.getParameter("status").trim() + "' \n";
		
		
		DeliveryExhibit de = new DeliveryExhibit(db);
		String slsql;
		String countsql;

		slsql = 
			" select si.id,si.send_no, si.send_date, \n"+
			" to_char(si.send_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  send_date2, \n"+
			" si.legislation_id, lg.legislation_name, si.offcode_write, nvl(edw.offname, si.offname_write) offname_write, \n"+ 
			" si.status, decode(si.status,'0','รอนำส่งเงิน','1','นำส่งเงินแล้ว','2','ยกเลิกการนำส่งเงิน') status_name, \n"+
			" trim(to_char(sum(nvl(cc.case_total_fine,0)),'999G999G990D99MI')) sumfine, trim(to_char(sum(nvl(cc.treasury_money,0)),'999G999G990D99MI')) treasury_money, \n"+
			" trim(to_char(sum(nvl(cc.birbe_money,0)),'999G999G990D99MI')) birbe_money, trim(to_char(sum(nvl(cc.reward_money,0)),'999G999G990D99MI')) reward_money,  \n"+
			" count(sic.id) case_qty, (select rec_status from inctrtmp_law where trim(docref_no) = si.send_no and rownum=1) income_status \n " +
			" from send_income si \n"+
			" inner join legislation lg on lg.id=si.legislation_id \n"+
			" left join ed_office edw on edw.offcode=si.offcode_write \n"+
			" left join send_income_case sic on sic.send_income_id=si.id  \n"+
			" inner join  \n"+
			" 		(select cc.track_no, cc.id, cc.compare_case_date, cc.birbe_money, cc.reward_money,cc.treasury_money, \n"+
			"		cc.birbe_money+cc.reward_money+cc.treasury_money case_total_fine,cc.compare_case_no, 'COMPARE_CASE' ref_type \n" +
			" 		from compare_case cc \n"+
			" 		union all \n"+
			" 		select cc.track_no, cc.id, ccc.change_date,  \n"+
			" 		((ccc.change_money-ccc.case_fine_old)*cc.bribe_money_p)/100*pke_arrest.getLawBreakerQty (cc.track_no) birbe_money, \n"+
			" 		((ccc.change_money-ccc.case_fine_old)*cc.reward_money_p)/100*pke_arrest.getLawBreakerQty (cc.track_no) reward_money, \n"+
			" 		((ccc.change_money-ccc.case_fine_old)*cc.treasury_money_p)/100*pke_arrest.getLawBreakerQty (cc.track_no) treasury_money, \n"+
			
			" 		((ccc.change_money-ccc.case_fine_old)*cc.bribe_money_p)/100*pke_arrest.getLawBreakerQty (cc.track_no) + \n"+
			" 		((ccc.change_money-ccc.case_fine_old)*cc.reward_money_p)/100*pke_arrest.getLawBreakerQty (cc.track_no) + \n"+
			" 		((ccc.change_money-ccc.case_fine_old)*cc.treasury_money_p)/100*pke_arrest.getLawBreakerQty (cc.track_no) case_total_fine,cc.compare_case_no, 'COMPARE_CASE_CHANGE' ref_type \n"+
			" 		from compare_case_change ccc \n"+
			" 		inner join compare_case cc on cc.id=ccc.compare_case_id \n"+
			" 		where ccc.change_type='1' \n"+
			" 		)  \n"+
			" cc on cc.id=sic.compare_case_id and cc.ref_type=sic.ref_type \n"+
			" left join application_arrest aa on aa.track_no=cc.track_no \n" +
			" left join province pv on pv.province_code=aa.scene_province \n";
		slsql += whText;
		slsql += " group by si.send_no, si.send_date, \n" +
		" to_char(si.send_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI'),  \n" +
		" si.legislation_id, lg.legislation_name,si.id, si.offcode_write, nvl(edw.offname, si.offname_write), \n"+ 
		" si.status, decode(si.status,'0','รอนำส่งเงิน','1','นำส่งเงินแล้ว','2','ยกเลิกการนำส่งเงิน') \n";
		slsql += " order by si.send_date desc ";
		
		log.debug(slsql);
		
		countsql = "select count(distinct id) from (" + slsql + ")";
		log.debug(countsql);
		Integer totalRow = de.countBySql(countsql, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);

		
		List<Map<String, Object>> dblist = de.findBySql(slsql, null,pageUtil);

		request.setAttribute("dblist", dblist);
		request.setAttribute("IsSearch", "Y");
		this.writeTranLog("ค้นหาข้อมูลการนำส่งเงินรายได้");
		forward("?page=/CompareCase/send_income_search.jsp", request, response);
		
		
	}
	

	public void del(HttpServletRequest request,HttpServletResponse response)throws Exception{
		log.debug("delete"+request.getParameter("id"));
		Long id = new Long(request.getParameter("id"));
		ApplicationArrest aa = new ApplicationArrest(db);
		aa = aa.findByPk(id);
		aa.setDel_flag("Y");
		aa.update();
		aa.setId(id);
		log.debug(aa);
		this.writeTranLog("ลบรายการคดีที่เปรียบเทียบปรับ");
		log.debug("delete"+request.getParameter("id"));
		forward("?page=/Protect/arrest_search.jsp", request, response);

	}
	
	
	   public boolean isNumeric(String s) {
		   try{
			   return s.matches("[-+]?\\d*\\.?\\d+");
		   }catch (Exception e) {
			   return false ;
		   }
		}
	   
		public void uplist(HttpServletRequest request, HttpServletResponse response,SendIncome si)throws Exception {
			log.debug("Start uplist");
			   SendIncomeCase  csc = new SendIncomeCase (db);
			    List<SendIncomeCase> csclist = csc.findByWhere(" SEND_INCOME_ID = ?",si.getId());
				String[] sc_id = request.getParameterValues("sc_id");
				String[] sc_compare_case_id = request.getParameterValues("sc_compare_case_id");
				String[] ref_type = request.getParameterValues("ref_type");
				
				if(sc_id == null){
					 for(int j = 0 ; j<csclist.size() ;j++){
						 csclist.get(j).delete();   	
					 }
				}

			    if(sc_id != null){
				    if(request.getParameter("sc_id") != null){
				    	boolean chkdel=true;
				    	//log.debug("chkdet = true");
					    for(int j = 0 ; j<csclist.size() ;j++){
					    	chkdel= true;
					    	for(int k = 0; k<sc_id.length ;k++){
					    		//log.debug(csclist.get(j).getId()+"เทียบกับ"+sc_id[k]);
						    	if(sc_id[k].equals("")==false){
						    		if(Long.parseLong(sc_id[k])==csclist.get(j).getId()){
						    		chkdel = false;
						    		//log.debug("chkdet = false");
						    		}
						    	}
					    	}
	
					    	if(chkdel== true){
					    		csclist.get(j).delete();
					    	}
					    }
						    
				    	for(int i = 0; i < sc_id.length;i++ ){
				    		boolean chkup = false ;
				    		SendIncomeCase  sc  = new SendIncomeCase (db);
				    		if(!sc_id[i].equals("")){
					    		chkup = true ;
					    		sc = sc.findByPk(Long.parseLong(sc_id[i]));
					    	}
	
				    		sc.setCompare_case_id(new Long(sc_compare_case_id[i]));
				    		sc.setSend_income_id(si.getId());
				    		sc.setRef_type(ref_type[i]);
				    		
						     if(chkup == false){
						    	 sc.setCreate_by(create_by);
						    	 sc.setCreate_on(create_on);
						    	 sc.create();
						     }else{
						    	 sc.setUpdate_by(update_by);
						    	 sc.setUpdate_on(new Date());
						    	 sc.update();
						     }
				    	}
				    }
			    }
			    log.debug("End uplist");
			}
}
