








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseSuspectPicture;
import com.ko.util.DB;

import java.sql.Blob;

public class SuspectPicture extends BaseSuspectPicture{
	public SuspectPicture(DB db){
		super(db);
	}
	// business method go here
    private java.sql.Blob picture_tmp;

    public Blob getPicture_tmp() {
        return picture_tmp;
    }

    public void setPicture_tmp(Blob picture_tmp) {
        this.picture_tmp = picture_tmp;
    }
}