package com.ko.webapp.action;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.sql.Blob;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.*;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.ServletRequestUtils;

public class GetImageAction extends BaseAction{

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Long id=null;
		if (request.getParameter("id") != null)
			id = ServletRequestUtils.getLongParameter(request,"id");
		
		String table = ServletRequestUtils.getStringParameter(request, "table");
		if( id!=null && !id.equals("") && !id.equals("0") && table!=null && !table.equals("")){
			Blob blob = null;
			String mimeType = "image/jpeg";
			if( table.equalsIgnoreCase("USERS") ){
				User user = new User(db);
				user = user.findByPk(id);
				if( user != null ){
					blob = user.getPhoto();
					mimeType = user.getMime_type();
					System.out.println(mimeType);
					
				}
			}else if( table.equalsIgnoreCase("APPLICATION_INVEST") ){
				ApplicationInvest ai = new ApplicationInvest(db);
				ai = ai.findByPk(id);
				if( ai != null )
					blob = ai.getMap_picture();
			}else if( table.equalsIgnoreCase("SUSPECT_PICTURE") ){
				SuspectPicture si = new SuspectPicture(db);
				si = si.findByPk(id);
				if( si != null )
					blob = si.getPicture();
			}else if( table.equalsIgnoreCase("LAWBREAKER") ){
				Lawbreaker lb = new Lawbreaker(db);
				lb = lb.findByPk(id);
				if( lb != null )
					blob = lb.getLink_photo();
			}else if( table.equalsIgnoreCase("SUSPECT") ){
				Suspect s = new Suspect(db);
				s = s.findByPk(id);
				if( s != null )
					blob = s.getLink_photo();
			}else if( table.equalsIgnoreCase("SUSPECT_INVESTIGATE") ){
				SuspectInvestigate s = new SuspectInvestigate(db);
				s = s.findByPk(id);
				if( s != null )
					blob = s.getSuspect_map();
            }
			
			// display blob
			if( blob!=null ){
				byte[] imgData = blob.getBytes(1,(int)blob.length());
				//response.setContentType("image/jpeg");
				response.setContentType(mimeType);
				OutputStream o = response.getOutputStream();
				o.write(imgData);
				o.flush();
				o.close();
			}else{
				showImgNotFound(request,  response);
			}
		}else{
			showImgNotFound(request,  response);
		}
	}
	private void showImgNotFound(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*if (flag.equals("COMPANY")) {
			path = getServletContext().getRealPath(
					"/img_suspect/553548995.jpg");
		}else if(flag.equals("DEFAULT")){

		}else if(flag.equals("LIST")){
			//
		}*/

		String path = getRealPath("/images/pic_no_image.gif");
		FileInputStream in = new FileInputStream(path);
		byte[] byteArray = IOUtils.toByteArray(in);
		response.setContentType("image/gif");
		OutputStream output = response.getOutputStream();
		output.write(byteArray);
		output.flush();
		in.close();
	}
}
