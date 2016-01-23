package com.ko.webapp.form;

import java.sql.Blob;

import com.ko.webapp.util.FormValidator;

public class FileUploadForm extends BaseForm{

	private Blob map_picture;
	private Blob picture;
	private Blob link_photo;
	private Blob suspect_map;
	
	public Blob getMap_picture() {
		return map_picture;
	}

	public void setMap_picture(Blob mapPicture) {
		map_picture = mapPicture;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	public Blob getLink_photo() {
		return link_photo;
	}

	public void setLink_photo(Blob linkPhoto) {
		link_photo = linkPhoto;
	}

	public Blob getSuspect_map() {
		return suspect_map;
	}

	public void setSuspect_map(Blob suspectMap) {
		suspect_map = suspectMap;
	}

	@Override
	public FormValidator validate() {
		// TODO Auto-generated method stub
		return null;
	}
}
