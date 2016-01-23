








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain.base;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.ko.domain.Invoice2;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseInvoice2 extends BaseDomain{
	// table
	public static final String TABLE_NAME = "INVOICE2";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "INVOICE2.ID";

	// short name column
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String OFFCODE_CANCELCol = "OFFCODE_CANCEL";

	public static final String CANCEL_DATECol = "CANCEL_DATE";

	public static final String POSCODE_CANCELCol = "POSCODE_CANCEL";

	public static final String STAFF_CANCELCol = "STAFF_CANCEL";

	public static final String STATUSCol = "STATUS";

	public static final String INTERIOR_REMARKSCol = "INTERIOR_REMARKS";

	public static final String TAX_REMARKSCol = "TAX_REMARKS";

	public static final String INTERIOR_FINECol = "INTERIOR_FINE";

	public static final String TAX_FINECol = "TAX_FINE";

	public static final String OFFCODE_RECEIVECol = "OFFCODE_RECEIVE";

	public static final String POSCODE_RECEIVECol = "POSCODE_RECEIVE";

	public static final String STAFF_RECEIVECol = "STAFF_RECEIVE";

	public static final String SEND_NOCol = "SEND_NO";

	public static final String SEND_BOOKNOCol = "SEND_BOOKNO";

	public static final String COMPARE_CASE_IDCol = "COMPARE_CASE_ID";

	public static final String INV_DATECol = "INV_DATE";

	public static final String INV_NOCol = "INV_NO";

	public static final String INV_BOOKNOCol = "INV_BOOKNO";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPDATE_ONColumn = "INVOICE2.UPDATE_ON";

	public static final String UPDATE_BYColumn = "INVOICE2.UPDATE_BY";

	public static final String CREATE_ONColumn = "INVOICE2.CREATE_ON";

	public static final String CREATE_BYColumn = "INVOICE2.CREATE_BY";

	public static final String OFFCODE_CANCELColumn = "INVOICE2.OFFCODE_CANCEL";

	public static final String CANCEL_DATEColumn = "INVOICE2.CANCEL_DATE";

	public static final String POSCODE_CANCELColumn = "INVOICE2.POSCODE_CANCEL";

	public static final String STAFF_CANCELColumn = "INVOICE2.STAFF_CANCEL";

	public static final String STATUSColumn = "INVOICE2.STATUS";

	public static final String INTERIOR_REMARKSColumn = "INVOICE2.INTERIOR_REMARKS";

	public static final String TAX_REMARKSColumn = "INVOICE2.TAX_REMARKS";

	public static final String INTERIOR_FINEColumn = "INVOICE2.INTERIOR_FINE";

	public static final String TAX_FINEColumn = "INVOICE2.TAX_FINE";

	public static final String OFFCODE_RECEIVEColumn = "INVOICE2.OFFCODE_RECEIVE";

	public static final String POSCODE_RECEIVEColumn = "INVOICE2.POSCODE_RECEIVE";

	public static final String STAFF_RECEIVEColumn = "INVOICE2.STAFF_RECEIVE";

	public static final String SEND_NOColumn = "INVOICE2.SEND_NO";

	public static final String SEND_BOOKNOColumn = "INVOICE2.SEND_BOOKNO";

	public static final String COMPARE_CASE_IDColumn = "INVOICE2.COMPARE_CASE_ID";

	public static final String INV_DATEColumn = "INVOICE2.INV_DATE";

	public static final String INV_NOColumn = "INVOICE2.INV_NO";

	public static final String INV_BOOKNOColumn = "INVOICE2.INV_BOOKNO";

	public static final String IDColumn = "INVOICE2.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, OFFCODE_CANCELCol	, CANCEL_DATECol	, POSCODE_CANCELCol	, STAFF_CANCELCol	, STATUSCol	, INTERIOR_REMARKSCol	, TAX_REMARKSCol	, INTERIOR_FINECol	, TAX_FINECol	, OFFCODE_RECEIVECol	, POSCODE_RECEIVECol	, STAFF_RECEIVECol	, SEND_NOCol	, SEND_BOOKNOCol	, COMPARE_CASE_IDCol	, INV_DATECol	, INV_NOCol	, INV_BOOKNOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ OFFCODE_CANCELCol	+","+ CANCEL_DATECol	+","+ POSCODE_CANCELCol	+","+ STAFF_CANCELCol	+","+ STATUSCol	+","+ INTERIOR_REMARKSCol	+","+ TAX_REMARKSCol	+","+ INTERIOR_FINECol	+","+ TAX_FINECol	+","+ OFFCODE_RECEIVECol	+","+ POSCODE_RECEIVECol	+","+ STAFF_RECEIVECol	+","+ SEND_NOCol	+","+ SEND_BOOKNOCol	+","+ COMPARE_CASE_IDCol	+","+ INV_DATECol	+","+ INV_NOCol	+","+ INV_BOOKNOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+OFFCODE_CANCELCol+"=?,"+CANCEL_DATECol+"=?,"+POSCODE_CANCELCol+"=?,"+STAFF_CANCELCol+"=?,"+STATUSCol+"=?,"+INTERIOR_REMARKSCol+"=?,"+TAX_REMARKSCol+"=?,"+INTERIOR_FINECol+"=?,"+TAX_FINECol+"=?,"+OFFCODE_RECEIVECol+"=?,"+POSCODE_RECEIVECol+"=?,"+STAFF_RECEIVECol+"=?,"+SEND_NOCol+"=?,"+SEND_BOOKNOCol+"=?,"+COMPARE_CASE_IDCol+"=?,"+INV_DATECol+"=?,"+INV_NOCol+"=?,"+INV_BOOKNOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseInvoice2(DB db){
		super(db);
	}



public synchronized Invoice2 create() throws Exception{
		DB db = this.initDB();
		try{
			String columns = "(";
			String parameter = "(";
			List<Object> objList = new ArrayList<Object>();
			for(int i=0;i<ALL_COLUMNS.length;i++){
				if( ALL_COLUMNS[i]!= pkCol ){
					Object value = PropertyUtils.getProperty(this, ALL_COLUMNS[i].toLowerCase());
					if( value!=null ){
						columns+=ALL_COLUMNS[i]+",";
						parameter+="?,";
						objList.add(value);
					}
				}
			}
			String sql_insert=SQL_INSERT+columns+pkCol+") values "+parameter+SEQUENCE_NAME+".nextVal)";
			//System.out.println("sql-->"+sql_insert);
			//System.out.println(objList);

			prep = db.getParameterizedStatement(sql_insert, objList.toArray());
			//logger.debug(SQL_INSERT);
			if( prep.executeUpdate() == 1 ){
				prep = db.getParameterizedStatement(db.getIdentityString(SEQUENCE_NAME), null);
				rs = prep.executeQuery();
				if( rs.next() ){
	 				this.id = new Long(rs.getString(1));
					return (Invoice2)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Invoice2> createList(List<Invoice2> objList)throws Exception{
    	DB db = this.initDB();
    	List<Invoice2> resultList = new ArrayList<Invoice2>();
    	try{
    		this.beginTx(db);
    		for( int i=0;i<objList.size();i++ )
    			resultList.add(objList.get(i).create());
    		this.commitTx(db);
    	}catch (Exception e) {
    		this.rollbackTx(db);
    		throw e;
    	}finally{
    		this.closeDB(db);
    	}
    	return resultList;
    }

	//  *** retrive ****
	public Integer countAll() throws Exception{
		return countByWhere(null,null);
	}
	public Integer countByWhere(String where,Object obj)throws Exception{
		return countByWhere(where,new Object[]{obj});
	}
	public Integer countByWhere(String where,Object[] objs)throws Exception{
		DB db = this.initDB();
		Integer result = null;
		try {
			prep = db.getParameterizedStatement( db.appendWhere(SQL_COUNT, where),objs);
			rs = prep.executeQuery();
			if( rs.next() )
				result = rs.getInt(1);
		} catch (Exception e) {
			throw e;
		}finally{
			this.closeDB(db);
		}
		return result;
	}
	public Invoice2 findByPk(Long id)throws Exception{
		List<Invoice2> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<Invoice2> findByPks(List<Long> ids)throws Exception{
		List<Invoice2> resultList = new ArrayList<Invoice2>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<Invoice2> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<Invoice2> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<Invoice2> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<Invoice2> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<Invoice2> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<Invoice2> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<Invoice2> resultList = new ArrayList<Invoice2>();
		try{
			if( pageUtil == null ){
				prep = db.getParameterizedStatement(db.appendWhere(SQL_SELECT , where), objs);
				rs = prep.executeQuery();
				while(rs.next())
					resultList.add(this.populate(rs));
			}else{
				String sql = db.appendWhere(SQL_SELECT, where);// build sql
				prep = db.getPagination(sql, objs, pageUtil.getPage(), pageUtil.getPageSize());
				rs = prep.executeQuery();
				while(rs.next())
					resultList.add(this.populate(rs));
			}
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return resultList;
	}
	public List<Invoice2> findByExample(Invoice2 instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<Invoice2> findByExample(Invoice2 instance,PageUtil pageUtil) throws Exception{
		Object value =null;
		List<Object> objList = new ArrayList<Object>();
		String where = " 1=1 ";
		String andString = " and ";
		for( int i=0;i<ALL_COLUMNS.length;i++ ){
			value = PropertyUtils.getProperty(instance, ALL_COLUMNS[i].toLowerCase());
			if( value!=null ){
				where+=andString+ALL_COLUMNS[i]+"=?";
				objList.add(value);
			}
		}
		if( objList.size()>0){
			//where = where.substring(0,where.lastIndexOf(andString));
			return this.findByWhere(where, objList.toArray(),pageUtil);
		}else
			return null;
	}
	//	**** update  ****
	public Invoice2 update()throws Exception{
		DB db = this.initDB();
		try{
			String parameter = "";
			List<Object> objList = new ArrayList<Object>();
			for(int i=0;i<ALL_COLUMNS.length;i++){
				if( ALL_COLUMNS[i]!= pkCol ){// cannot set pkCol
					Object value = PropertyUtils.getProperty(this, ALL_COLUMNS[i].toLowerCase());
					//if( value != null ){
						parameter+=ALL_COLUMNS[i]+"=?,";
						objList.add(value);
					//}
				}else
					objList.add(this.id);// pk
			}
			if( parameter.length()> 0 ){
				String sql_update = SQL_UPDATE+parameter.substring(0, parameter.lastIndexOf(","));
				//System.out.println(sql_update);
				//System.out.println("obj"+objList);
				prep = db.getParameterizedStatement(db.appendWhere(sql_update,pkCol+"=?"), objList.toArray());
				if( prep.executeUpdate() == 1 )
					return (Invoice2)this;
			}else// not update
				return (Invoice2)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Invoice2> updateList(List<Invoice2> objList)throws Exception{
		DB db = this.initDB();
		List<Invoice2> resultList = new ArrayList<Invoice2>();
		try{
			this.beginTx(db);
			for( int i=0;i<objList.size(); i++ )
				resultList.add(objList.get(i).update());
			this.commitTx(db);
		}catch(Exception e){
			this.rollbackTx(db);
			throw e;
		}finally{
			this.closeDB(db);
		}
		return resultList;
	}

	//	**** delete  ****
	public Integer delete() throws Exception {
		return this.deleteByPk(this.id);
	}
	public Integer deleteList(List<Invoice2> objList)throws Exception {
		DB db = this.initDB();
		try{
			this.beginTx(db);
			int delete =0;
			for(int i=0;i<objList.size();i++ )
				delete+=objList.get(i).delete();
			this.commitTx(db);
			return delete;
		}catch(Exception e) {
			this.rollbackTx(db);
			throw e;
		}finally{
			this.closeDB(db);
		}
	}
	public Integer deleteAll()throws Exception {
		return deleteByWhere(null,null);
	}
	public Integer deleteByPk(Long id) throws Exception {
		return this.deleteByWhere(pkCol+"=?",id);
	}
	public Integer deleteByPks(List<Long> ids)throws Exception {
		DB db = this.initDB();
		try{
			this.beginTx(db);// begin tx
			int delete =0;
			for(int i=0;i<ids.size();i++ )
				delete+=this.deleteByPk(ids.get(i));
			this.commitTx(db);// commit
			return delete;
		}catch(Exception e) {
			this.rollbackTx(db);
			throw e;
		}finally{
			this.closeDB(db);
		}
	}
	public Integer deleteByWhere(String where, Object obj) throws Exception {
		return this.deleteByWhere(where,new Object[]{obj});
	}
	public Integer deleteByWhere(String where , Object[] objs)throws Exception{
		DB db = this.initDB();
		try {
			prep = db.getParameterizedStatement(db.appendWhere(SQL_DELETE, where), objs);
			return prep.executeUpdate();
		} catch (Exception e) {
			throw e;
		}finally{
			this.closeDB(db);
		}
	}
	public Invoice2 populate(ResultSet rs)throws Exception{
		Invoice2 result = new Invoice2(this.db);
    	try {
    		for ( int i=0;i<ALL_COLUMNS.length ; i++ ){
    			String field = ALL_COLUMNS[i].toLowerCase();
    			DB.bindFieldToObject(rs, ALL_COLUMNS[i], result, field);
    			/*Object value = rs.getObject(ALL_COLUMNS[i]);
    			if( value != null ){

        			 // BeanUtil.setProperty(result,date,null); // cannot use null

	    			if ( value instanceof java.sql.Timestamp )
	    				BeanUtils.setProperty(result, field , new Date(((java.sql.Timestamp)value).getTime()));
	    			else if ( value instanceof java.sql.Blob ){// blob
	    				//java.io.InputStream is = rs.getBinaryStream("");
	    				//java.io.BufferedInputStream imgStream = new java.io.BufferedInputStream(is);
	    				// Fix it
	    				// BeanUtils.setProperty(result, field ,
	    			}else
	    				BeanUtils.setProperty(result, field , value);
    			}*/
    		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return result;
    }
	//****   validator deteail  *****//
	public FormValidator validate(){
		FormValidator validator = new FormValidator();
			
		return validator;
	}
	public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }

    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
    //****  attribute deteail  *****//
    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String offcode_cancel;

    private java.util.Date cancel_date;

    private String poscode_cancel;

    private String staff_cancel;

    private String status;

    private String interior_remarks;

    private String tax_remarks;

    private Long interior_fine;

    private Long tax_fine;

    private String offcode_receive;

    private String poscode_receive;

    private String staff_receive;

    private String send_no;

    private String send_bookno;

    private Long compare_case_id;

    private java.util.Date inv_date;

    private String inv_no;

    private String inv_bookno;

    private Long id;

	//**** getter setter ****//
	public java.util.Date getUpdate_on()
    {
        return update_on;
    }
    public void setUpdate_on(java.util.Date update_on)
    {
        this.update_on = update_on;
    }

	public Long getUpdate_by()
    {
        return update_by;
    }
    public void setUpdate_by(Long update_by)
    {
        this.update_by = update_by;
    }

	public java.util.Date getCreate_on()
    {
        return create_on;
    }
    public void setCreate_on(java.util.Date create_on)
    {
        this.create_on = create_on;
    }

	public Long getCreate_by()
    {
        return create_by;
    }
    public void setCreate_by(Long create_by)
    {
        this.create_by = create_by;
    }

	public String getOffcode_cancel()
    {
        return offcode_cancel;
    }
    public void setOffcode_cancel(String offcode_cancel)
    {
        this.offcode_cancel = offcode_cancel;
    }

	public java.util.Date getCancel_date()
    {
        return cancel_date;
    }
    public void setCancel_date(java.util.Date cancel_date)
    {
        this.cancel_date = cancel_date;
    }

	public String getPoscode_cancel()
    {
        return poscode_cancel;
    }
    public void setPoscode_cancel(String poscode_cancel)
    {
        this.poscode_cancel = poscode_cancel;
    }

	public String getStaff_cancel()
    {
        return staff_cancel;
    }
    public void setStaff_cancel(String staff_cancel)
    {
        this.staff_cancel = staff_cancel;
    }

	public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

	public String getInterior_remarks()
    {
        return interior_remarks;
    }
    public void setInterior_remarks(String interior_remarks)
    {
        this.interior_remarks = interior_remarks;
    }

	public String getTax_remarks()
    {
        return tax_remarks;
    }
    public void setTax_remarks(String tax_remarks)
    {
        this.tax_remarks = tax_remarks;
    }

	public Long getInterior_fine()
    {
        return interior_fine;
    }
    public void setInterior_fine(Long interior_fine)
    {
        this.interior_fine = interior_fine;
    }

	public Long getTax_fine()
    {
        return tax_fine;
    }
    public void setTax_fine(Long tax_fine)
    {
        this.tax_fine = tax_fine;
    }

	public String getOffcode_receive()
    {
        return offcode_receive;
    }
    public void setOffcode_receive(String offcode_receive)
    {
        this.offcode_receive = offcode_receive;
    }

	public String getPoscode_receive()
    {
        return poscode_receive;
    }
    public void setPoscode_receive(String poscode_receive)
    {
        this.poscode_receive = poscode_receive;
    }

	public String getStaff_receive()
    {
        return staff_receive;
    }
    public void setStaff_receive(String staff_receive)
    {
        this.staff_receive = staff_receive;
    }

	public String getSend_no()
    {
        return send_no;
    }
    public void setSend_no(String send_no)
    {
        this.send_no = send_no;
    }

	public String getSend_bookno()
    {
        return send_bookno;
    }
    public void setSend_bookno(String send_bookno)
    {
        this.send_bookno = send_bookno;
    }

	public Long getCompare_case_id()
    {
        return compare_case_id;
    }
    public void setCompare_case_id(Long compare_case_id)
    {
        this.compare_case_id = compare_case_id;
    }

	public java.util.Date getInv_date()
    {
        return inv_date;
    }
    public void setInv_date(java.util.Date inv_date)
    {
        this.inv_date = inv_date;
    }

	public String getInv_no()
    {
        return inv_no;
    }
    public void setInv_no(String inv_no)
    {
        this.inv_no = inv_no;
    }

	public String getInv_bookno()
    {
        return inv_bookno;
    }
    public void setInv_bookno(String inv_bookno)
    {
        this.inv_bookno = inv_bookno;
    }

	public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }

}