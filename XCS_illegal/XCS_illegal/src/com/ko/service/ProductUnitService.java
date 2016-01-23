package com.ko.service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;


import com.pccth.rdbservice.InquiryDutyUnitOperation;
import com.pccth.rdbservice.InquiryDutyUnitOperationResponse;
import com.pccth.rdbservice.InquiryProductUnitOperation;
import com.pccth.rdbservice.InquiryProductUnitOperationResponse;
import com.pccth.rdbservice.RdbserviceEdStub;

import com.pccth.rdbservice.InquiryAccMastReqHeader;
import com.pccth.rdbservice.ProductUnitInfo;
import com.pccth.rdbservice.DutyUnitInfo;

public class ProductUnitService extends MasterService {
	
	public ProductUnitInfo[] getProductUnitInfo(String parameterSearch, String parameterValue)  throws Exception{
		RdbserviceEdStub service = getService();
		InquiryAccMastReqHeader inHeader = getInquiryHeader(parameterSearch, parameterValue);
		InquiryProductUnitOperationResponse response = new InquiryProductUnitOperationResponse();

		try {
			InquiryProductUnitOperation req = new InquiryProductUnitOperation();
			req.setInquiryProductUnitOperation(inHeader);
			response = service.inquiryProductUnitOperation(req);		
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		//Body body = response.getBody();
		return response.getInquiryProductUnitOperationResponse().getBody().getProductUnitInfo();
	}
	
	
	public DutyUnitInfo[] getDutyUnitInfo(String parameterSearch, String parameterValue)  throws Exception{
		RdbserviceEdStub service = getService();
		InquiryAccMastReqHeader inHeader = getInquiryHeader(parameterSearch, parameterValue);
		InquiryDutyUnitOperationResponse response = new InquiryDutyUnitOperationResponse();
		try {
			InquiryDutyUnitOperation req = new InquiryDutyUnitOperation();
			req.setInquiryDutyUnitOperation(inHeader);
			response = service.inquiryDutyUnitOperation(req);
		} catch (RemoteException e) {
			System.out.println(e.getMessage());
			
		}

		//Body body = response.getBody();
		return response.getInquiryDutyUnitOperationResponse().getBody().getDutyUnitInfo();
	}
	
	public  ArrayList<ProductUnitInfo> getProductUnitList(String parameterSearch, String parameterValue) throws Exception {
		ProductUnitInfo[] info = getProductUnitInfo(parameterSearch,parameterValue);
		ArrayList<ProductUnitInfo> resultInfo = new ArrayList<ProductUnitInfo>();
		for (ProductUnitInfo i : info) {
			resultInfo.add(i);
			//System.out.println(i.getUnit_name_thai());
		}
		return resultInfo;
	}
	
	//public ArrayList<ProductUnitInfo> getProductTypeInfo(String parameterSearch, String parameterValue){
	//	return getProductUnitList(parameterSearch, parameterValue);
	//}
	
	//public ArrayList<ProductUnitInfo> getAllProductTypeInfo(){
	//	return getProductUnitList("", "");
	//}
	public  DutyUnitInfo[] getUnitByDutyCode(String dutyCode) throws Exception{
		return  getDutyUnitInfo("duty_code",dutyCode);
	}
	public  List getUnitByDutyCode(String dutyCode, String useFor) throws Exception{
		List ret = new ArrayList();
		DutyUnitInfo[] info = getDutyUnitInfo("duty_code",dutyCode);
		for (DutyUnitInfo i : info){
			ret.add(i);
		}
		return ret;
	}
	
	
	public static void main(String args[]) throws Exception {
		//ProductUnitInfo [] info = getUnitByDutyCode("0804");
		ProductUnitService service = new ProductUnitService();
		DutyUnitInfo dt[] = service.getUnitByDutyCode("0804");
		for (DutyUnitInfo info : dt) {
			String unitName = service.getProductUnitList("unit_code", info.getUnit_code()).get(0).getUnit_name_thai();
			System.out.println("DutyCode = " + info.getDuty_code()  + "    UnitCode = " + info.getUnit_code() + "    UnitName = " + unitName + "    UseFor = " + info.getUsed_for());
			//info.
			
		}
		//for(DutyUnitInfo info : )
	}
}
