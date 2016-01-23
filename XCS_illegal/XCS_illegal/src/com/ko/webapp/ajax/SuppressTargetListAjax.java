package com.ko.webapp.ajax;

import java.util.ArrayList;
import java.util.List;

import com.ko.domain.SuppressTarget;
import com.ko.domain.SuppressTargetItem;

public class SuppressTargetListAjax extends BaseAjax{
	public List getSuppressTargetItem_sql1(String budget_year, String voffcode,String vqty,String vlegislation,String vProductGroupID){
		List suppressTargetItemList = new ArrayList();
		String sql="select  sti.target_type,  "
				+"sum(sti.qty_10) qty10, sum(sti.qty_11) qty11, sum(sti.qty_12) qty12, sum(sti.qty_01) qty01, sum(sti.qty_02) qty02, sum(sti.qty_03) qty03, "
				+"sum(sti.qty_04) qty04, sum(sti.qty_05) qty05, sum(sti.qty_06) qty06, sum(sti.qty_07) qty07, sum(sti.qty_08) qty08, sum(sti.qty_09) qty09, "
				+"sum(sti.fine_10) fine10, sum(sti.fine_11) fine11, sum(sti.fine_12) fine12, sum(sti.fine_01) fine01, sum(sti.fine_02) fine02, sum(sti.fine_03) fine03, "
				+"sum(sti.fine_04) fine04, sum(sti.fine_05) fine05, sum(sti.fine_06) fine06, sum(sti.fine_07) fine07, sum(sti.fine_08) fine08, sum(sti.fine_09) fine09 "
				+"from suppress_target st "
				+"inner join suppress_target_item sti on sti.suppress_target_id=st.id ";
		StringBuffer where = new StringBuffer("where 1=1 ");
		String group = "group by  sti.target_type order by sti.target_type ";
		int i;
		if(!budget_year.trim().equals("")){
			where.append("and st.budget_year = '?' ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,budget_year);
		}
		if(!voffcode.trim().equals("")){
			where.append("and substr(st.offcode,1,2)||'0000'=substr( '?' ,1,2)||'0000' ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,voffcode);
		}
		if(!vqty.trim().equals("")){
			where.append("and st.qty= '?' ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,vqty);
		}
		if(!vlegislation.trim().equals("")){
			where.append("and st.legislation_id = '?' ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,vlegislation);
		}
		if(!vProductGroupID.trim().equals("")){
			where.append("and nvl(st.product_group_id,'#')=nvl('?','#') ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,vProductGroupID);
		}
				
		try{
			log.debug("getSuppressTargetItem");
			log.debug(sql+where.toString()+group);
			SuppressTarget suppressTarget = new SuppressTarget(db);
			List listsuppress = suppressTarget.findBySql(sql+where.toString()+group,null);
			//SuppressTargetItem suppressTargetItem = new SuppressTargetItem(db);
			//List<SuppressTarget> suppresstargetList = suppressTarget.findByWhere(SuppressTarget.JOB_NOCol +"= ?", job_no);
			//log.debug(suppresstargetList);
			//suppressTargetItemList = suppressTargetItem.findBySql(sql, suppresstargetList.get(0).getId());
			//log.debug(suppressTargetItemList);
			return listsuppress;
		}
		catch (Exception e){
			return null;
		}
		finally{
			closeDB();
		}
	}
	public List getSuppressTargetItem_sql2(String budget_year, String voffcode,String vqty,String vlegislation,String vProductGroupID){
		String sql="select  sti.target_type, "
			+"sum(sti.qty_10) qty10, sum(sti.qty_11) qty11, sum(sti.qty_12) qty12, sum(sti.qty_01) qty01, sum(sti.qty_02) qty02, sum(sti.qty_03) qty03, "
			+"sum(sti.qty_04) qty04, sum(sti.qty_05) qty05, sum(sti.qty_06) qty06, sum(sti.qty_07) qty07, sum(sti.qty_08) qty08, sum(sti.qty_09) qty09, "
			+"sum(sti.fine_10) fine10, sum(sti.fine_11) fine11, sum(sti.fine_12) fine12, sum(sti.fine_01) fine01, sum(sti.fine_02) fine02, sum(sti.fine_03) fine03, "
			+"sum(sti.fine_04) fine04, sum(sti.fine_05) fine05, sum(sti.fine_06) fine06, sum(sti.fine_07) fine07, sum(sti.fine_08) fine08, sum(sti.fine_09) fine09 "
			+"from suppress_target st "
			+"inner join suppress_target_item sti on sti.suppress_target_id=st.id ";
		StringBuffer where = new StringBuffer("where 1=1 ");
		String group = "group by  sti.target_type order by sti.target_type";
		int i;
		if(!budget_year.trim().equals("")){
			where.append("and st.budget_year = '?' ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,budget_year);
		}
		if(!voffcode.trim().equals("")){
			where.append("and substr(st.offcode,1,4)||'00'=substr('?',1,4)||'00' ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,voffcode);
		}
		if(!vqty.trim().equals("")){
			where.append("and st.qty= '?' ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,vqty);
		}
		if(!vlegislation.trim().equals("")){
			where.append("and st.legislation_id = '?' ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,vlegislation);
		}
		if(!vProductGroupID.trim().equals("")){
			where.append("and nvl(st.product_group_id,'#')=nvl('?','#') ");
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,vProductGroupID);
		}
		try{
			SuppressTarget suppressTarget = new SuppressTarget(db);
			log.debug(sql+where.toString()+group);
			List listsuppress = suppressTarget.findBySql(sql+where.toString()+group,null);
			return listsuppress;
		}
		catch (Exception e){
			return null;
		}
		finally{
			closeDB();
		}
	}
}
