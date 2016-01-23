package com.ko.webapp.form;

public class WarrantSearchForm {
	private String request_no;
	private String court_id ;
	private String request_date_start;
	private String request_date_stop;
	private String status;
	private String owner_name;
	private String province_code ;
	private String district_code ;
	private String subdistrict_code ;
	public String getRequest_no() {
		return request_no;
	}
	public void setRequest_no(String requestNo) {
		request_no = requestNo;
	}
	public String getCourt_id() {
		return court_id;
	}
	public void setCourt_id(String courtId) {
		court_id = courtId;
	}
	public String getRequest_date_start() {
		return request_date_start;
	}
	public void setRequest_date_start(String requestDateStart) {
		request_date_start = requestDateStart;
	}
	public String getRequest_date_stop() {
		return request_date_stop;
	}
	public void setRequest_date_stop(String requestDateStop) {
		request_date_stop = requestDateStop;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String ownerName) {
		owner_name = ownerName;
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String provinceCode) {
		province_code = provinceCode;
	}
	public String getDistrict_code() {
		return district_code;
	}
	public void setDistrict_code(String districtCode) {
		district_code = districtCode;
	}
	public String getSubdistrict_code() {
		return subdistrict_code;
	}
	public void setSubdistrict_code(String subdistrictCode) {
		subdistrict_code = subdistrictCode;
	}

}
