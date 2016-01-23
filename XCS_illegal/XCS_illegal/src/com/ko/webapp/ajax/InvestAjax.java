package com.ko.webapp.ajax;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ko.domain.ApplicationInvest;

public class InvestAjax extends BaseAjax {
	private final Log logger = LogFactory.getLog(getClass());
	
	public String ChkDupApplicationInvest(String id, String invest_no, String offcode_invest) {
		String return_data = "";
		try {
			ApplicationInvest est = new ApplicationInvest(db);
			List<ApplicationInvest> data_list = est.findByWhere("invest_no = '" + invest_no + "' and offcode_invest = '" + offcode_invest + "' and id <> '" + id + "'",null);
			if (data_list != null && !data_list.isEmpty()) {
				return_data =  "เลขที่คดีสืบสวนซ้ำ";
			}
		} catch (Exception e) {
			logger.error("Found Error On AJAX Message:"+e.getMessage());
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return return_data;
	}
}
