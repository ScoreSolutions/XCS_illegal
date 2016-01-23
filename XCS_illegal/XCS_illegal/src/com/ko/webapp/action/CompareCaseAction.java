/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.webapp.action;

import com.ko.domain.*;
import com.ko.util.DateUtil;

import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CompareCaseAction extends BaseAction {
    @Override
    public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
    }
    
    
    // list
    public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (request.getParameter("doSearch") != null) {
            String compare_case_no =  ServletRequestUtils.getStringParameter(request, "compare_case_no");
            String start_date =  ServletRequestUtils.getStringParameter(request, "start_date");
            String end_date =  ServletRequestUtils.getStringParameter(request, "end_date");
            String legislation_id =  ServletRequestUtils.getStringParameter(request, "legislation_id");
            String compare_office =  ServletRequestUtils.getStringParameter(request, "compare_office");
            String case_fine = ServletRequestUtils.getStringParameter(request, "case_fine");
            //gen query string
            String query = "select distinct " + CompareCase.IDColumn + " from " + CompareCase.TABLE_NAME;
            StringBuffer[] condition = new StringBuffer[2];
            List<Object> listObjs = new ArrayList<Object>();
            condition[0] = new StringBuffer();
            condition[1] = new StringBuffer();
            if (compare_case_no != null && !compare_case_no.equals("")) {
                request.setAttribute("compare_case_no", compare_case_no);
                condition[1].append(" and " + CompareCase.COMPARE_CASE_NOColumn + " like ? ");
                listObjs.add(new String("%" + compare_case_no + "%"));
            }
            if (compare_case_no != null && !compare_case_no.equals("")) {
                request.setAttribute("compare_case_no", compare_case_no);
                condition[1].append(" and " + CompareCase.COMPARE_CASE_NOColumn + " like ? ");
                listObjs.add(new String("%" + compare_case_no + "%"));
            }
            if (compare_case_no != null && !compare_case_no.equals("")) {
                request.setAttribute("compare_case_no", compare_case_no);
                condition[1].append(" and " + CompareCase.COMPARE_CASE_NOColumn + " like ? ");
                listObjs.add(new String("%" + compare_case_no + "%"));
            }
            if (compare_case_no != null && !compare_case_no.equals("")) {
                request.setAttribute("compare_case_no", compare_case_no);
                condition[1].append(" and " + CompareCase.COMPARE_CASE_NOColumn + " like ? ");
                listObjs.add(new String("%" + compare_case_no + "%"));
            }
            CompareCase compareCase = new CompareCase(db);
            // pageUtil.setPageSize(15);
            Integer totalRow = compareCase.countAll();

            // set TotalRow
            pageUtil.setTotalRow(totalRow);
            List<CompareCase> compareCases = compareCase.findAll(pageUtil);

            //	for data to display
            request.setAttribute("compareCases", compareCases);
        }

        Legislation le = new Legislation(db);
        List<Legislation> les = le.findByWhere(" 1=1 order by " + Legislation.LEGISLATION_NAMECol, null);
        request.setAttribute("les", les);

        //	for screen to show
        forward("?page=/CompareCase/compare_case_change_list.jsp");
    }

    //	 create
    public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        writeTranLog("เพิ่มข้อมูลการเพิ่ม-ลดค่าปรับเปรียบเทียบ");
        if(ServletRequestUtils.getLongParameter(request,"ccid") != null){
            CompareCase compareCase = new CompareCase(db);
            compareCase = compareCase.findByPk(ServletRequestUtils.getLongParameter(request,"ccid") );
            request.setAttribute("cc",compareCase);
        }
        Legislation le = new Legislation(db);
        List<Legislation> les = le.findByWhere(" 1=1 order by " + Legislation.LEGISLATION_NAMECol, null);
        request.setAttribute("les", les);
        request.setAttribute("offcode",offcode);
        
        
        forward("?page=/CompareCase/compare_case_change_form.jsp");
    }

    public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
        CompareCase compareCase = new CompareCase(db);
        bindForm(compareCase);
        compareCase = compareCase.create();
        if (compareCase != null)
            formHandler.setFormMessage("Create Completed ,view <a href='process2?action=CompareCase&cmd=view&id=" + compareCase.getId() + "' target='_blank'>new Record</a>");
        else
            formHandler.setFormMessage("Create Not Complete");
        
        redirect("process2?action=CompareCase&cmd=add");
    }

    // view
    public void view(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        if (id != null && !id.trim().equals("")) {
            CompareCase compareCase = new CompareCase(db);
            compareCase = compareCase.findByPk(new Long(id));
            if (compareCase != null) {
                request.setAttribute("compareCase", compareCase);
            } else {
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        } else {
            formHandler.setFormMessage("Error : Please Enter id");
        }
        forward("?page=/web/compareCaseView.jsp");
    }

    // update
    public void edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        if (id != null && !id.trim().equals("")) {
            CompareCase compareCase = new CompareCase(db);
            compareCase = compareCase.findByPk(new Long(id));
            if (compareCase != null) {
                request.setAttribute("compareCase", compareCase);
            } else {
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        }
        forward("?page=/web/compareCaseEdit.jsp");
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	CompareCase compareCase = new CompareCase(db);
        bindForm(compareCase);
        compareCase = compareCase.update();
        if (compareCase != null) {
            request.setAttribute("compareCase", compareCase);
            formHandler.setFormMessage("Update Completed");
        } else {
            formHandler.setFormMessage("Update Failed");
        }
        forward("?page=/web/compareCaseEdit.jsp");
    }

    // delete
    public void delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] ids = request.getParameterValues("id");
        if (ids != null && ids.length > 0) {
            CompareCase compareCase = new CompareCase(db);
            List<Long> idList = new ArrayList<Long>();
            for (int i = 0; i < ids.length; i++)
                idList.add(new Long(ids[i]));
            int deleteRow = compareCase.deleteByPks(idList);
            formHandler.setFormMessage(" Delete " + deleteRow + " Row Completed ");
        } else {
            formHandler.setFormMessage("Plese Select At Least One For Delete");
        }
        redirect("process2?action=CompareCase&cmd=list");
    }

    public void openEdPopup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        EdOffice ed = new EdOffice(db);
        List<EdOffice> eds = ed.findAll();
        request.setAttribute("eds", eds);
        request.setAttribute("formcode", request.getParameter("compare_office"));
        request.setAttribute("formname", request.getParameter("ed_offname"));
        forward("/Popup/division_pop.jsp");
    }

    public void openCompareCasePopup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Long legislation_id = ServletRequestUtils.getLongParameter(request,"legislation_id");
        CompareCase cc = new CompareCase(db);
        List<Map<String,Object>> listCcMap = cc.findBySql("select "+CompareCase.IDColumn+" from "+CompareCase.TABLE_NAME+
                " inner join "+ ApplicationArrest.TABLE_NAME+" on "+ApplicationArrest.TRACK_NOColumn+"="+
                CompareCase.TRACK_NOColumn+" and "+ApplicationArrest.LEGISLATION_IDColumn+"=?",legislation_id);
        List<CompareCase> ccList = new ArrayList<CompareCase>();
        for(Map<String,Object> map : listCcMap){
            ccList.add(cc.findByPk(Long.parseLong(map.get("id").toString())));
        }
        if(ccList.size()>0){
            request.setAttribute("ccList",ccList);
        }
        forward("/Popup/ccc_select_pop.jsp");
    }
}