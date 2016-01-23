package com.ko.service;
import java.util.ArrayList;

import com.pccth.rdbservice.ProductTypeInfo;

public class ProductTypeService extends MasterService {
	public ArrayList<ProductTypeInfo> getProductTypeInfo(String parameterSearch, String parameterValue)  throws Exception {
		return getProductTypeList(parameterSearch, parameterValue);
	}
	
	public ArrayList<ProductTypeInfo> getAllProductTypeInfo()  throws Exception{
		return getProductTypeList("", "");
	}
}
