package com.ko.domain;

import com.ko.domain.base.BaseView;
import com.ko.util.DB;

public class V_STOCKOUT_ITEM extends BaseView{
	public V_STOCKOUT_ITEM(DB db){
		super(db);
		super.viewName = "V_STOCKOUT_ITEM";
	}

}
