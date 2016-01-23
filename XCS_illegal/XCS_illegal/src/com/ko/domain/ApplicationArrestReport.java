








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import org.jfree.util.Log;

import com.ko.domain.base.BaseApplicationArrestReport;
import com.ko.util.DB;

public class ApplicationArrestReport extends BaseApplicationArrestReport{
	public ApplicationArrestReport(DB db){
		super(db);
	}
	// business method go here

	    public static void main(String args[]) throws Exception{
	    	DB db = new DB();
	    	ApplicationArrestReport ar = new ApplicationArrestReport(db);
	    	ar=ar.findByPk(2l);
	    	//Log.debug(ar.getId().toString());
	    	System.out.println(ar.getId().toString());
	    }
	
}