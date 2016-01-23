package com.ko.service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//import com.pccth.rdbservice.RdbserviceEd_PortType;
import com.pccth.rdbservice.Body;
import com.pccth.rdbservice.InquiryAccMastReqHeader;
import com.pccth.rdbservice.InquiryAccMastResHeader;
import com.pccth.rdbservice.InquiryProductTypeOperationResponse;
import com.pccth.rdbservice.InquiryTambolOperation;
import com.pccth.rdbservice.InquiryTambolOperationResponse;
import com.pccth.rdbservice.TambolInfo;
import com.pccth.rdbservice.RdbserviceEdStub;
import java.util.List;

import org.apache.axis2.AxisFault;

public class TambolService extends MasterService{
	
	public TambolInfo[] getInfo(String parameterSearch, String parameterValue) throws Exception{
		RdbserviceEdStub service = getService();
		InquiryAccMastReqHeader inHeader = getInquiryHeader(parameterSearch, parameterValue);
		InquiryTambolOperationResponse response = new InquiryTambolOperationResponse();

		try {
			InquiryTambolOperation req = new InquiryTambolOperation();
			req.setInquiryTambolOperation(inHeader);
			
			response = service.inquiryTambolOperation(req);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		//Body body = response.getBody();
		return response.getInquiryTambolOperationResponse().getBody().getTambolInfo();
	}
	
	public ArrayList<TambolInfo> getTambolInfo(String parameterSearch, String parameterValue) throws Exception{
		return getTambolList(parameterSearch, parameterValue);
	}
	public ArrayList<TambolInfo> getProvinceInfo(String parameterSearch, String parameterValue) throws Exception{
		return getProvinceList(parameterSearch, parameterValue);
	}
	public ArrayList<TambolInfo> getAumphurInfo(String parameterSearch, String parameterValue) throws Exception{
		return getAumphurList(parameterSearch, parameterValue);
	}
	
	public List getProvinceList() throws Exception{
		List result = new ArrayList();
		TambolInfo[] info = getInfo("","");
		// -- sort
		//Arrays.sort(info, new InfoComparator.TambolComparator());
		//ArrayList<TambolInfo> tambolInfo = new ArrayList<TambolInfo>();
		for (TambolInfo i : info) {
			String code = i.getTambol_code();
			if (code.endsWith("0000") && !code.toUpperCase().startsWith("XX")) {
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("province_code",i.getTambol_code().substring(0, 2));
				data.put("province_name", i.getTambol_name());
				result.add(data);
			}
		}

		return result;
	}
	
	public List getDistrictList(String provinceCode) throws Exception{
		List result = new ArrayList();

		TambolInfo[] info = getInfo("","");
		String reference = provinceCode.substring(0,2);
		// -- sort
		Arrays.sort(info, new InfoComparator.TambolComparator());
		for (TambolInfo i : info) {
			String code = i.getTambol_code();
			if (code.startsWith(reference) && code.endsWith("00") && !code.endsWith("0000")) {
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("district_code",i.getTambol_code().substring(0, 4));
				data.put("district_name", i.getTambol_name());
				result.add(data);
			}
		}
		return result;
	}
	
	public List getSubdistrict(String districtCode) throws Exception{
		List result = new ArrayList();
		TambolInfo[] info = getInfo("","");
		String reference = districtCode.substring(0,4);
		// -- sort
		Arrays.sort(info, new InfoComparator.TambolComparator());
		for (TambolInfo i : info) {
			String code = i.getTambol_code();
			if (code.startsWith(reference) && !code.toUpperCase().endsWith("XX") && !code.endsWith("00")) {
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("subdistrict_code",i.getTambol_code());
				data.put("subdistrict_name", i.getTambol_name());
				result.add(data);
			}
		}
		return result;
	}

	

	public ArrayList<TambolInfo> getAumphurInfo(String proviceCode) throws Exception{

		ArrayList<TambolInfo> result = new ArrayList<TambolInfo>();
		String reference = proviceCode.substring(0,2);
		ArrayList<TambolInfo> info = getAumphurInfo("","");

		for(TambolInfo i : info){
			String code = i.getTambol_code();
			if((code.startsWith(reference) && code.endsWith("00")) && !code.endsWith("0000")){
				result.add(i);
				//System.out.println(i.getTambol_name());
				//System.out.println(i.getTambol_code());
			}
		}
		return result;
	}
	
	public ArrayList<TambolInfo> getTambolInfo(String aumphurCode) throws Exception{

		ArrayList<TambolInfo> result = new ArrayList<TambolInfo>();
		String reference = aumphurCode.substring(0,4);
		ArrayList<TambolInfo> info = getTambolInfo("", "");

		for(TambolInfo i : info){
			String code = i.getTambol_code();
			if(code.startsWith(reference)){
				result.add(i);
				System.out.println(i.getTambol_name());
			}else{
				//System.out.println(code);
			}
		}
		return result;
	}
	
	public  ArrayList<TambolInfo> getTambolList(String parameterSearch, String parameterValue) throws Exception {
		TambolInfo[] info = getInfo(parameterSearch,parameterValue);
		// -- Sort
		Arrays.sort(info, new InfoComparator.TambolComparator());
		ArrayList<TambolInfo> tambolInfo = new ArrayList<TambolInfo>();
		for (TambolInfo i : info) {
			String code = i.getTambol_code();
			if (!code.endsWith("00") && !code.endsWith("0000") && !code.toLowerCase().endsWith("xx")) {
				tambolInfo.add(i);

				/*
				 * System.out.println(i.getTambol_name());
				 * System.out.println(i.getTambol_code());
				 * System.out.println("----------------");
				 */
			}
		}
		return tambolInfo;
	}

	// -- Return province list (sorted)
	public  ArrayList<TambolInfo> getProvinceList(String parameterSearch,String parameterValue) throws Exception {
		TambolInfo[] info = getInfo(parameterSearch,parameterValue);
		// -- sort
		Arrays.sort(info, new InfoComparator.TambolComparator());
		ArrayList<TambolInfo> tambolInfo = new ArrayList<TambolInfo>();
		for (TambolInfo i : info) {
			String code = i.getTambol_code();
			if (code.endsWith("0000")) {
				tambolInfo.add(i);
			}
		}
		return tambolInfo;
	}

	// -- Return aumphur list ( sorted)
	public  ArrayList<TambolInfo> getAumphurList(String parameterSearch, String parameterValue) throws Exception {

		TambolInfo[] info = getInfo(parameterSearch,parameterValue);
		// sort
		Arrays.sort(info, new InfoComparator.TambolComparator());
		ArrayList<TambolInfo> tambolInfo = new ArrayList<TambolInfo>();
		for (TambolInfo i : info) {
			String code = i.getTambol_code();
			if (code.endsWith("00") && !code.endsWith("0000")) {
				tambolInfo.add(i);
			}
		}
		return tambolInfo;
	}

	public static void main(String args[]) throws Exception{
		//TambolService service = new TambolService();

		//MasterService.printProviceInfo();

		//service.getTambolInfo("330500");
		TambolService tb = new TambolService();
		tb.getAumphurInfo("330000");
	}
}
