package com.ko.service;

import groovyjarjarantlr.collections.List;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.pccth.rdbservice.InquiryEdOfficeOperation;
import com.pccth.rdbservice.InquiryEdOfficeOperationResponse;
import com.pccth.rdbservice.RdbserviceEdStub;
import com.pccth.rdbservice.Body;
import com.pccth.rdbservice.EdOfficeInfo;
import com.pccth.rdbservice.InquiryAccMastReqHeader;
import com.pccth.rdbservice.InquiryAccMastResHeader;

public class EdOfficeService extends MasterService {
	
	public EdOfficeInfo[] getInfo(String parameterSearch, String parameterValue) throws Exception{
		EdOfficeInfo[] ret = null;
		RdbserviceEdStub service = getService();
		InquiryAccMastReqHeader inHeader = getInquiryHeader(parameterSearch, parameterValue);
		InquiryEdOfficeOperationResponse response = new InquiryEdOfficeOperationResponse();

		try {
			InquiryEdOfficeOperation req = new InquiryEdOfficeOperation();
			req.setInquiryEdOfficeOperation(inHeader);
			response = service.inquiryEdOfficeOperation(req);
			
			ret = response.getInquiryEdOfficeOperationResponse().getBody().getEdOfficeInfo();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return ret;
	}
	
	public ArrayList<EdOfficeInfo> getEdOfficeInfo(String parameterSearch, String parameterValue) throws Exception{
		return getEdOfficeList(parameterSearch, parameterValue);
	}
	
	public ArrayList<EdOfficeInfo> getAllEdOfficeInfo() throws Exception{
		return getEdOfficeList("", "");
	}
	
	public  ArrayList<EdOfficeInfo> getEdOfficeList(String parameterSearch, String parameterValue) throws Exception {
		EdOfficeInfo[] info = getInfo(parameterSearch,parameterValue);
		Arrays.sort(info, new InfoComparator.EdOfficeComparator());
		ArrayList<EdOfficeInfo> edOfficeInfo = new ArrayList<EdOfficeInfo>();
		for (EdOfficeInfo i : info) {
			edOfficeInfo.add(i);
			// System.out.println(i.getOffName());
		}
		return edOfficeInfo;
	}
	
	//public EdOfficeInfo[] getEdoff
	
	public java.util.List getEdOfficeList() throws Exception{
		java.util.List result = new ArrayList();
		EdOfficeInfo[] info = getInfo("","");
		Arrays.sort(info, new InfoComparator.EdOfficeComparator());
		
		for (EdOfficeInfo i : info) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("offcode",i.getOffCode());
			data.put("offname", i.getOffName());
			data.put("short_name", i.getShort_name());
			result.add(data);
		}
		return result;
	}
	
	public java.util.List getSectorList() throws Exception{
		java.util.List result = new ArrayList();
		EdOfficeInfo[] info = getInfo("","");
		Arrays.sort(info, new InfoComparator.OffcodeComparator());
		
		for (EdOfficeInfo i : info) {
			if(i.getOffCode().substring(2).equals("0000")){
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("offcode",i.getOffCode());
				data.put("offname", i.getOffName());
				data.put("short_name", i.getShort_name());
				result.add(data);
			}
		}
		return result;
	}
	

	public java.util.List getAllArearList() throws Exception{
		java.util.List result = new ArrayList();
		EdOfficeInfo[] info = getInfo("","");
		Arrays.sort(info, new InfoComparator.EdOfficeComparator());
		
		for (EdOfficeInfo i : info) {
			//System.out.println(i.getOffCode() + " #### " + i.getOffCode().substring(0,4) + " #### " + i.getOffCode().substring(4));
			if(!i.getOffCode().substring(0,2).equals("00") && !i.getOffCode().substring(2,4).equals("00") && i.getOffCode().substring(4).equals("00")){
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("offcode",i.getOffCode());
				data.put("offname", i.getOffName());
				data.put("short_name", i.getShort_name());
				result.add(data);
			}
		}
		return result;
	}
}
