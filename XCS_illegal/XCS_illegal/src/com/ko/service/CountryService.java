package com.ko.service;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;

//import org.apache.axis2.AxisFault;

import com.pccth.rdbservice.InquiryCountryOperation;
import com.pccth.rdbservice.InquiryCountryOperationResponse;
import com.pccth.rdbservice.RdbserviceEdStub;
import com.pccth.rdbservice.CountryInfo;
import com.pccth.rdbservice.InquiryAccMastReqHeader;

public class CountryService extends MasterService {
	public ArrayList<CountryInfo> getCountryInfo(String parameterSearch, String parameterValue) throws Exception{
		return getCountryList(parameterSearch, parameterValue);
	}
	public ArrayList<CountryInfo> getAllCountryInfo() throws Exception{
		return getCountryList("", "");
	}
	
	public  ArrayList<CountryInfo> getCountryList(String parameterSearch, String parameterValue) throws Exception {

		RdbserviceEdStub service = getService();
		InquiryAccMastReqHeader inHeader = getInquiryHeader(parameterSearch, parameterValue);
		InquiryCountryOperationResponse response = new InquiryCountryOperationResponse();

		try {
			InquiryCountryOperation req = new InquiryCountryOperation();
			req.setInquiryCountryOperation(inHeader);
			response = service.inquiryCountryOperation(req);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		//Body body = response.getBody();
		CountryInfo[] info = response.getInquiryCountryOperationResponse().getBody().getCountryInfo();
		
		Arrays.sort(info, new InfoComparator.CountryComparator());
		ArrayList<CountryInfo> resultInfo = new ArrayList<CountryInfo>();

		for (CountryInfo i : info) {
			resultInfo.add(i);
			//System.out.println(i.getCountry_name());
		}
		return resultInfo;
	}
}
