package com.ko.webapp.ajax;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialBlob;

import com.ko.domain.ApplicationInvest;
import com.ko.domain.Lawbreaker;
import com.ko.domain.SuspectInvestigate;
import com.ko.domain.SuspectPicture;
import com.ko.domain.User;

import org.directwebremoting.io.FileTransfer;
import org.springframework.web.bind.ServletRequestUtils;

import com.ko.domain.Suspect;
import com.ko.util.ConfigUtil;
import com.ko.util.StringUtil;

public class FileUploaderAjax extends BaseAjax{
	public boolean checkUploadSize(FileTransfer file){
		
		try{
			return file.getSize()<= ConfigUtil.getImageSize(db);
		}catch (Exception e) {
			log.debug(StringUtil.getStackTrace(e));
		}finally{
			closeDB();
		}
		return false;
	}
	
	public void saveSuspectMap(FileTransfer file, Long id){
		try{
			if (file != null){
				InputStream in = file.getInputStream();
				byte[] bytes = new byte[in.available()];
				in.read(bytes);// read to byte array
				Blob blob = new SerialBlob(bytes);
				
				SuspectInvestigate si = new SuspectInvestigate(db);
				si = si.findByPk(id);
				SuspectPicture sp = new SuspectPicture(db);
				sp.setSuspect_no(si.getSuspect_no());
				sp.setPicture_category_id(3L);
				sp.setPicture(blob);
				sp.setCreate_by(si.getCreate_by());
				sp.setCreate_on(new Date());
				sp.create();

			}
		}catch(Exception e){
			log.debug(StringUtil.getStackTrace(e));
		}finally{
			closeDB();
		}
	}
	
	public void uploadFile(FileTransfer file,String table,Long id){
		try{
			if( file!=null ){
				InputStream in = file.getInputStream();
				byte[] bytes = new byte[in.available()];
				in.read(bytes);// read to byte array
				Blob blob = new SerialBlob(bytes);
				if( table.equalsIgnoreCase("USERS") ){
					User user = new User(db);
					user = user.findByPk(id);
					if( user != null ){
						user.setPhoto(blob);
						user.update();
					}
				}else if( table.equalsIgnoreCase("APPLICATION_INVEST") ){
					ApplicationInvest ai = new ApplicationInvest(db);
					ai = ai.findByPk(id);
					if( ai != null ){
						ai.setMap_picture(blob);
						ai.update();
					}
				}else if( table.equalsIgnoreCase("SUSPECT_PICTURE")){
                    SuspectPicture sp = new SuspectPicture(db);
					sp = sp.findByPk(id);
					if( sp!=null ){
						sp.setPicture(blob);
						sp.update();
					}
				}else if( table.equalsIgnoreCase("LAWBREAKER") ){
					Lawbreaker lb = new Lawbreaker(db);
					lb = lb.findByPk(id);
					if( lb != null ){
						lb.setLink_photo(blob);
						lb.update();
					}
				}else if( table.equalsIgnoreCase("SUSPECT") ){
					Suspect suspect = new Suspect(db);
					suspect = suspect.findByPk(id);
					if( suspect!=null ){
						suspect.setLink_photo(blob);
						suspect.update();
					}
				}else if( table.equalsIgnoreCase("SUSPECT_INVESTIGATE")){
                    SuspectInvestigate sp = new SuspectInvestigate(db);
					sp = sp.findByPk(id);
					if( sp!=null ){
						sp.setSuspect_map(blob);
						sp.update();
					}
				}
			}
		}catch (Exception e) {
			log.debug(StringUtil.getStackTrace(e));
		}finally{
			closeDB();
		}
	}
	public BufferedImage uploadPreview(BufferedImage uploadImage){
		return uploadImage;
	}
	
	public void uploadDocFile(FileTransfer file,String table,Long id){
		try{
			if( file!=null ){
				InputStream in = file.getInputStream();
				byte[] bytes = new byte[in.available()];
				in.read(bytes);// read to byte array
				Blob blob = new SerialBlob(bytes);
				if( table.equalsIgnoreCase("USERS") ){
					//System.out.println("USERRRRRRRRRRRRRRSSSSS");
					User user = new User(db);
					if(id != null){
						user = user.findByPk(id);
						if( user != null ){
							user.setPhoto(blob);
							user.setMime_type(file.getMimeType());
							user.update();
							System.out.println("Update File");
						}
					}else{
						
						System.out.println("Insert File " + file.getMimeType() + " FileName=" + file.getFilename());
						user.setMime_type(file.getMimeType());
						user.setPhoto(blob);
						user.create();
					}
				}
			}
		}catch (Exception e) {
			log.debug(StringUtil.getStackTrace(e));
		}finally{
			closeDB();
		}
	}
	
	public void showDocument(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Long id=null;
		if (request.getParameter("id") != null)
			id = ServletRequestUtils.getLongParameter(request,"id");
		
		String table = ServletRequestUtils.getStringParameter(request, "table");
		if( id!=null && !id.equals("") && table!=null && !table.equals("")){
			Blob blob = null;
			if( table.equalsIgnoreCase("USERS") ){
				User user = new User(db);
				user = user.findByPk(id);
				if( user != null )
					blob = user.getPhoto();
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
				response.setContentType("image/jpeg");
				OutputStream o = response.getOutputStream();
				o.write(imgData);
				o.flush();
				o.close();
			}
		}
	}
}
