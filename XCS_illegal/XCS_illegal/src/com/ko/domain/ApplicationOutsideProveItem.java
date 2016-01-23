








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationOutsideProveItem;
import com.ko.util.DB;

public class ApplicationOutsideProveItem extends BaseApplicationOutsideProveItem{
	public ApplicationOutsideProveItem(DB db){
		super(db);
		super.SEQUENCE_NAME="APPLICATION_OUTSIDEPROVITEMSEQ";
	}
	// business method go here

}