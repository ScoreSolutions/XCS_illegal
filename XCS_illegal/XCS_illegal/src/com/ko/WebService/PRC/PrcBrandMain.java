package com.ko.WebService.PRC;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;

import com.pccth.prcservice.PrcserviceEd_PortType;
import com.ko.WebService.PRC.PrcComapre;
import com.pccth.prcservice.types.Body;
import com.pccth.prcservice.types.BrandMainInfo;
import com.pccth.prcservice.types.InquiryPrcReqHeader;
import com.pccth.prcservice.types.InquiryPrcResHeader;

public class PrcBrandMain extends PrcServiceMaster {

	public ArrayList<BrandMainInfo> getBrandMainList(String parameterSearch, String parameterValue){
		ArrayList<BrandMainInfo> brandmain = new ArrayList<BrandMainInfo>();
		BrandMainInfo[] info = getBrandMainInfo(parameterSearch, parameterValue);
		Arrays.sort(info, new PrcComapre.BrandMainComparator());
		if(info != null){
			for(BrandMainInfo i : info){
				brandmain.add(i);
			}
		}
		
		return brandmain;
	}
	
	public  BrandMainInfo[] getBrandMainInfo(String parameterSearch, String parameterValue){
		PrcserviceEd_PortType service = getService();
		InquiryPrcReqHeader inHeader = getInquiryHeader(serviceIDBrandMain ,parameterSearch,parameterValue);
		InquiryPrcResHeader response = new InquiryPrcResHeader();
		BrandMainInfo[] info;
		try{
			response=service.inquiryBrandMainOperation(inHeader);
			Body body = response.getBody();
			info = body.getBrandMainInfo();
			err_desc = body.getReturnCode();
		}catch(RemoteException e){
			err_desc = e.getMessage();
			info = null;
			e.printStackTrace();
		}
		return info;
	}
	
	public static void main(String args[]) {
		BrandMainInfo[] bm;
		PrcBrandMain prc = new PrcBrandMain();
		bm = prc.getBrandMainInfo("GROUP_ID","7002");
		//System.out.println("FFFFFFFFFFFFFFFFF  "+prc.getErr_desc());
		for(int i=0;i<bm.length;i++){
			if(bm[i].getBegin_date() != null && bm[i].getBegin_date().length()==8){
				String tmp = (bm[i].getBegin_date() != null ? bm[i].getBegin_date().toString() + "  $$$$$ " + (new Long(bm[i].getBegin_date().substring(0,4))+543) + " $$$$ " + bm[i].getBegin_date().substring(3) : "");
					tmp += " " + (bm[i].getBrand_main_eng() != null ? bm[i].getBrand_main_eng().toString() : "") + "\n";
				System.out.println(tmp);
			}
		}
		//if(prc.chkServiceConnection()==true)
		//	System.out.println("aaaaaaaaaaaaaa");
	}

}
