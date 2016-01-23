package com.ko.service;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.pccth.rdbservice.InquiryDutyGroupOperation;
import com.pccth.rdbservice.InquiryDutyGroupOperationResponse;
import com.pccth.rdbservice.RdbserviceEdStub;
import com.pccth.rdbservice.DutyGroupInfo;
import com.pccth.rdbservice.InquiryAccMastReqHeader;
import java.util.List;

import org.apache.axis2.AxisFault;

public class DutyGroupService extends MasterService {
	private DutyGroupInfo[] getInfo(String parameterSearch, String parameterValue) throws Exception{
		RdbserviceEdStub service = getService();
		InquiryAccMastReqHeader inHeader = getInquiryHeader(parameterSearch,parameterValue);
		InquiryDutyGroupOperationResponse response = new InquiryDutyGroupOperationResponse();
		try {
			InquiryDutyGroupOperation req = new InquiryDutyGroupOperation();
			req.setInquiryDutyGroupOperation(inHeader);
			response = service.inquiryDutyGroupOperation(req);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		//Body body = response.getBody();
		return  response.getInquiryDutyGroupOperationResponse().getBody().getDutyGroupInfo();
	}
	
	public ArrayList<DutyGroupInfo> getDutyGroupInfo(String parameterSearch, String parameterValue) throws Exception{
		return getDutyGroupList(parameterSearch, parameterValue);
	}
	
	public ArrayList<DutyGroupInfo> getAllDutyGroupInfo() throws Exception{
		return getDutyGroupList("", "");
	}
	
	public static void main(String args[]) throws Exception{
		DutyGroupService service = new DutyGroupService();
		ArrayList<DutyGroupInfo> infos = service.getAllDutyGroupInfo();
		
		for(int i=0;i<infos.size();i++){
			System.out.println(infos.get(i).getGroup_id() + "  " + infos.get(i).getGroup_name());
		}
	}
	
	public List getDutyGroupList() throws Exception{
		List result = new ArrayList();
		DutyGroupInfo[] info = getInfo("","");
		for (DutyGroupInfo i : info) {
			if(i.getGroup_status().equals("N")){
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("group_id",i.getGroup_id());
				data.put("group_name", i.getGroup_name());
				result.add(data);
			}
		}
		return result;
	}
	
	public  ArrayList<DutyGroupInfo> getDutyGroupList(String parameterSearch, String parameterValue) throws Exception {

		DutyGroupInfo[] info = getInfo(parameterSearch,parameterValue);
		ArrayList<DutyGroupInfo> resultInfo = new ArrayList<DutyGroupInfo>();

		for (DutyGroupInfo i : info) {
			resultInfo.add(i);
		}
		return resultInfo;
	}
}
