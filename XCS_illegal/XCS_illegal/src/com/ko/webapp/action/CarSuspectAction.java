/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.webapp.action;

import com.ko.domain.*;
import org.json.JSONArray;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CarSuspectAction extends BaseAction {
    @Override
    public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
        pre(request,response);
    }
    public void pre(HttpServletRequest request,HttpServletResponse response)throws Exception{
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("id",request.getParameter("id"));
        Province p = new Province(db);
        List<Province> pList = p.findByWhere(" 1=1 order by "+Province.PROVINCE_NAMECol,null);
        request.setAttribute("provinces",pList);
        ProductType pt = new ProductType(db);
        
        DutyTable dt = new DutyTable(db);
        List<DutyTable> dtList = dt.findByWhere("substr(group_id,1,2)='05' order by duty_name" , null);
        
        //List<ProductType> ptList = pt.findByWhere("substr(product_type.duty_code,1,2)='05' order by type_name",null);
        request.setAttribute("producttypes",dtList);
        BrandMain bm = new BrandMain(db);
        List<BrandMain> bmList = bm.findByWhere("substr(group_id,1,2)='05' order by brand_main_eng",null);
        request.setAttribute("brandmains",bmList);
        if(request.getParameter("row")!=null)
            request.setAttribute("row",request.getParameter("row"));
        if(request.getParameter("maxRow")!=null)
            request.setAttribute("maxRow",request.getParameter("maxRow"));
		forward("/Popup/suspect_car_form.jsp", request, response);

	}

}