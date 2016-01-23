package com.ko.WebService.PRC;

import java.util.Comparator;
import com.pccth.prcservice.types.*;
import com.pccth.rdbservice.TambolInfo;

public class PrcComapre {
	static class BrandMainComparator implements Comparator<BrandMainInfo> {

		public int compare(BrandMainInfo arg0, BrandMainInfo arg1) {
			// TODO Auto-generated method stub
			String re0 = arg0.getBrand_main_thai();
			String re1 = arg1.getBrand_main_thai();
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
