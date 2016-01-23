










/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.webapp.action;

import com.ko.domain.Relation;
import com.ko.domain.Suspect;
import com.ko.domain.SuspectRelatif;
import com.ko.domain.Title;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class SuspectRelatifAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRelatif suspectRelatif =new SuspectRelatif(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suspectRelatif.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SuspectRelatif> suspectRelatifs = suspectRelatif.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suspectRelatifs", suspectRelatifs);

		//	for screen to show
		forward("?page=/web/suspectRelatifList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suspectRelatifCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRelatif suspectRelatif = new SuspectRelatif(db);
		bindForm(suspectRelatif);
		suspectRelatif = suspectRelatif.create();
		if( suspectRelatif!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SuspectRelatif&cmd=view&id="+suspectRelatif.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SuspectRelatif&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectRelatif suspectRelatif = new SuspectRelatif(db);
			suspectRelatif = suspectRelatif.findByPk(new Long(id));
			if( suspectRelatif!=null ){
				request.setAttribute("suspectRelatif", suspectRelatif);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suspectRelatifView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectRelatif suspectRelatif =new SuspectRelatif(db);
			suspectRelatif = suspectRelatif.findByPk(new Long(id));
			if( suspectRelatif!=null ){
				request.setAttribute("suspectRelatif", suspectRelatif);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suspectRelatifEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRelatif suspectRelatif = new SuspectRelatif(db);
		bindForm(suspectRelatif);
		suspectRelatif = suspectRelatif.update();
		if( suspectRelatif!=null ){
			request.setAttribute("suspectRelatif", suspectRelatif);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suspectRelatifEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SuspectRelatif suspectRelatif = new SuspectRelatif(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suspectRelatif.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SuspectRelatif&cmd=list");
	}
    public void openPopup(HttpServletRequest request,HttpServletResponse response)throws Exception {
        Long id = ServletRequestUtils.getLongParameter(request,"id");
        if(id != null && id>0){
        SuspectRelatif sr = new SuspectRelatif(db);
        sr = sr.findByPk(id);
        request.setAttribute("sr",sr);
        }
        Long suspect_no = ServletRequestUtils.getLongParameter(request,"suspect_no");
        request.setAttribute("suspect_no",suspect_no);
        Relation re = new Relation(db);
        request.setAttribute("rels",re.findAll());
        Title t = new Title(db);
        request.setAttribute("titles",t.findByWhere(Title.TITLE_TYPECol+"=?","1"));
        forward("/Popup/suspect_other_relative_form_ajax.jsp",request,response);
    }
    public void ajaxInsert(HttpServletRequest request,HttpServletResponse response)throws Exception {
        SuspectRelatif sr = new SuspectRelatif(db);
        bindForm(sr);
        if(sr.getId() != null){
            SuspectRelatif sr1 = sr.findByPk(sr.getId());
            sr.setCreate_by(sr1.getCreate_by());
            sr.setCreate_on(sr1.getCreate_on());
            sr.setUpdate_by(update_by);
            sr.setUpdate_on(update_on);
            sr.update();
        }else{
            sr.setCreate_by(create_by);
            sr.setCreate_on(create_on);
            sr.setUpdate_by(update_by);
            sr.setUpdate_on(update_on);
            sr.create();
        }
        if(sr == null){
            response.getWriter().println("error");
        }else{
            response.getWriter().println(sr.getId());
        }
    }
}