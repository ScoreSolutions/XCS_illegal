








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationSincereIndictment;
import com.ko.util.DB;

public class ApplicationSincereIndictment extends BaseApplicationSincereIndictment{
	public ApplicationSincereIndictment(DB db){
		super(db);
		super.SEQUENCE_NAME = "APPLICATION_SINCERE_INDICTSEQ";
	}
	// business method go here

}