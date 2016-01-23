package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.lang.Exception;

import com.domain.BaseDomain;
import data.*;

public class AllCaseByOffcodeService extends BaseService {

    String _err="";

    

    public ResponseHeader getResponse(RequestHeader reqHeader) throws Exception{
        ResponseHeader ret = null;

        if(validateHeader(reqHeader)==true){
            String rtType = "";
            if(reqHeader.getOffcode().endsWith("0000")){ // หน่วยงานภาค
                reqHeader.setRtType("2");
                System.out.println("SECTOR");
                CaseBySector cbs = new CaseBySector();
                ret = cbs.getResponse(reqHeader);
            }else if(!reqHeader.getOffcode().startsWith("00") && reqHeader.getOffcode().endsWith("00")){ //รหัสพื้นที่
                reqHeader.setRtType("1");
                System.out.println("AREA");
                CaseByArea cbs = new CaseByArea();
                ret = cbs.getResponse(reqHeader);
            }else if(!reqHeader.getOffcode().startsWith("00") && !reqHeader.getOffcode().endsWith("00")){ //พื้นที่สาขา
                reqHeader.setRtType("0");
                System.out.println("BRANCH");
                CaseByBranch cbs = new CaseByBranch();
                ret = cbs.getResponse(reqHeader);
            }
//
//
//            if (getIsValidData(reqHeader)==true){
//                ret.setIsValidData(true);
//                ret.setMessage("");
//                ret.setResponseBody(setAllCaseByOffcode(reqHeader));
//                //System.out.println("Success");
//            }else{
//                ret.setIsValidData(false);
//                ret.setMessage("ไม่พบข้อมูลที่ต้องการ");
//                ret.setResponseBody(null);
//                //System.out.println("No Data Found");
//            }
        }else{
            ret = new ResponseHeader();
            ret.setIsValidData(false);
            ret.setMessage(_err);
            ret.setResponseBody(null);
        }

        return ret;
    }

    private boolean validateHeader(RequestHeader reqHeader) throws Exception {
        boolean ret = true;

        if(reqHeader.getAppID() == null || reqHeader.getAppID().trim().equals("")){
            _err = "กรุณาระบุ Application ID";
            ret = false;
        }else if(reqHeader.getIP_address() == null || reqHeader.getIP_address().trim().equals("")){
            _err = "กรุณาระบุหมายเลข IP";
            ret = false;
        }else if(reqHeader.getMonth_year() == null || reqHeader.getMonth_year().trim().equals("")){
            _err = "กรุณาระบุเดือนปีที่ต้องการค้นหาข้อมูล";
            ret = false;
        }else if(reqHeader.getOffcode() == null || reqHeader.getOffcode().trim().equals("")){
            _err = "กรุณาระบุรหัสหน่วยงาน";
            ret = false;
        }else if(reqHeader.getOffcode().length() != 6){
            _err = "รหัสหน่วยงานไม่ถูกต้อง";
            ret = false;
        }else if(reqHeader.getIdcard_no() == null || reqHeader.getIdcard_no().trim().equals("")){
            _err = "กรุณาระบุเลขบัตรประชาชนของเจ้าหน้าที่";
            ret = false;
        }else if (chkIDCardno(reqHeader.getIdcard_no())==false){
            ret = false;
        }

        return ret;
    }

    private boolean chkIDCardno(String idcard_no) throws Exception{
        boolean ret = false;
        try{
                String sql = "select id from staff where idcard_no='" + idcard_no + "'";
                System.out.println(sql);
                BaseDomain aa = new BaseDomain(db);
                List<Map<String,Object>> sList = aa.findBySql(sql);

            if(sList != null && sList.size()>0)
                ret = true;
            else
                _err = "ไม่พบข้อมูลเจ้าหน้าที่";
                
        }catch(Exception e){
            ret = false;
            _err = e.getMessage();
        }
        return ret;
    }


    

    
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String args[]) throws Exception {
//		AllCaseByOffcodeService kList = new AllCaseByOffcodeService();
//                RequestHeader aaa = new RequestHeader();
//
//                aaa.setMonth_year("102010");
//                aaa.setOffcode("100000");
//                aaa.setRtType("2");
//		List<AllCaseByOffcode> data = kList.AllCaseByOffcode(aaa);
//
//		for(int i=0;i<data.size();i++){
//			System.out.println(data.get(i).getOffcode());
//                      System.out.println(data.get(i).getOffname());
//                      System.out.println(data.get(i).getShort_name());
//			System.out.println(data.get(i).getLegislation_code());
//			System.out.println(data.get(i).getLegislation_name());
//			System.out.println(data.get(i).getCase_qty());
//			System.out.println(data.get(i).getCourt_qty());
//			System.out.println(data.get(i).getNoculprit_qty());
//			System.out.println(data.get(i).getCase_fine());
//			System.out.println(data.get(i).getCourt_fine());
//			System.out.println(data.get(i).getNoculprit_fine());
//		}
//
//            //RequestHeader aaa = new RequestHeader();
//            //AllCaseByOffcodeService acs = new AllCaseByOffcodeService();
//            //aaa.setMonth_year("102010");
//            //aaa.setOffcode("010200");
//            //aaa.setRtType("2");
//
//            //System.out.println(" ##### " +acs.setAllCaseByOffcode(aaa));
//	}
}
