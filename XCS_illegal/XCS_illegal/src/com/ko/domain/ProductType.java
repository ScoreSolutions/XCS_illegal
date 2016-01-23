








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import java.util.List;

import com.ko.domain.base.BaseProductType;
import com.ko.util.DB;

public class ProductType extends BaseProductType{
	public ProductType(DB db){
		super(db);
	}
	// business method go here
	public List getProductID(String idproduct_id)throws Exception{
		String sql="select to_char(pt.id) id , pt.type_name name "
			+"from product_type pt "
			+"where pt.duty_code = ? ";
		List list = findBySql(sql, idproduct_id);
		return list;
	}
}