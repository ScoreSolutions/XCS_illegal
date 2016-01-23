package com.ko.service;

import java.util.Comparator;

import com.pccth.rdbservice.CountryInfo;
import com.pccth.rdbservice.DutyGroupInfo;
import com.pccth.rdbservice.EdOfficeInfo;
import com.pccth.rdbservice.ProductTypeInfo;
import com.pccth.rdbservice.ProductUnitInfo;
import com.pccth.rdbservice.TambolInfo;
import com.pccth.rdbservice.DutyTableInfo;
import com.pccth.rdbservice.DutyUnitInfo;

public class InfoComparator {
	static class TambolComparator implements Comparator<TambolInfo> {

		
		public int compare(TambolInfo arg0, TambolInfo arg1) {
			// TODO Auto-generated method stub
			String re0 = arg0.getTambol_name();
			String re1 = arg1.getTambol_name();
			return compareString(re0,re1);
		}
	}


	
	static class ProductTypeComparator implements Comparator<ProductTypeInfo> {

		
		public int compare(ProductTypeInfo arg0, ProductTypeInfo arg1) {
			String re0 = arg0.getType_name();
			String re1 = arg1.getType_name();
			return compareString(re0,re1);
		}
	}

	static class DutyGroupComparator implements Comparator<DutyGroupInfo> {

		
		public int compare(DutyGroupInfo arg0, DutyGroupInfo arg1) {
			String re0 = arg0.getGroup_name();
			String re1 = arg1.getGroup_name();
			return compareString(re0,re1);
		}
	}

	static class EdOfficeComparator implements Comparator<EdOfficeInfo> {

		public int compare(EdOfficeInfo arg0, EdOfficeInfo arg1) {
			String re0 = arg0.getOffName();
			String re1 = arg1.getOffName();
			return compareString(re0,re1);
		}
	}
	
	static class OffcodeComparator implements Comparator<EdOfficeInfo>{
		public int compare(EdOfficeInfo arg0, EdOfficeInfo arg1) {
			String re0 = arg0.getOffCode();
			String re1 = arg1.getOffCode();
			return compareString(re0,re1);
		}
	}
	
	static class DutyTableComparator implements Comparator<DutyTableInfo>{
		public int compare(DutyTableInfo arg0, DutyTableInfo arg1) {
			String re0 = arg0.getDuty_name();
			String re1 = arg1.getDuty_name();
			return compareString(re0,re1);
		}
	}
	
	static class ProductUnitComparator implements Comparator<ProductUnitInfo>{

		
		public int compare(ProductUnitInfo arg0, ProductUnitInfo arg1) {
			String re0 = arg0.getUnit_name_thai();
			String re1 = arg1.getUnit_name_thai();
			return compareString(re0,re1);
		}
	}
	
	static class CountryComparator implements Comparator<CountryInfo>{

		
		public int compare(CountryInfo arg0, CountryInfo arg1) {
			String re0 = arg0.getCountry_name();
			String re1 = arg1.getCountry_name();
			return compareString(re0,re1);
		}
	}


	static int compareString(String re0, String re1) {
		if (re0.compareTo(re1) > 0) {
			return 1;
		} else if (re0.compareTo(re1) == 0) {
			return 0;
		} else {
			return -1;
		}
	}
}
