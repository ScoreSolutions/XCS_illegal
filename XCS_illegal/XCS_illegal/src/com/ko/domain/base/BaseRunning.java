








 

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

import com.ko.domain.Running;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseRunning extends BaseDomain{
	// table
	public static final String TABLE_NAME = "RUNNING";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "RUNNING.ID";

	// short name column
	public static final String RUNNINGFIELDCol = "RUNNINGFIELD";

	public static final String LENGTHCol = "LENGTH";

	public static final String YEARCol = "YEAR";

	public static final String MONTHCol = "MONTH";

	public static final String ISOFFCODECol = "ISOFFCODE";

	public static final String CODECol = "CODE";

	public static final String FIELDVALUECol = "FIELDVALUE";

	public static final String FIELDTYPECol = "FIELDTYPE";

	public static final String TBNAMECol = "TBNAME";

	public static final String IDCol = "ID";


	// full column name
	public static final String RUNNINGFIELDColumn = "RUNNING.RUNNINGFIELD";

	public static final String LENGTHColumn = "RUNNING.LENGTH";

	public static final String YEARColumn = "RUNNING.YEAR";

	public static final String MONTHColumn = "RUNNING.MONTH";

	public static final String ISOFFCODEColumn = "RUNNING.ISOFFCODE";

	public static final String CODEColumn = "RUNNING.CODE";

	public static final String FIELDVALUEColumn = "RUNNING.FIELDVALUE";

	public static final String FIELDTYPEColumn = "RUNNING.FIELDTYPE";

	public static final String TBNAMEColumn = "RUNNING.TBNAME";

	public static final String IDColumn = "RUNNING.ID";


	public static final String[] ALL_COLUMNS =
    {
	 RUNNINGFIELDCol	, LENGTHCol	, YEARCol	, MONTHCol	, ISOFFCODECol	, CODECol	, FIELDVALUECol	, FIELDTYPECol	, TBNAMECol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  RUNNINGFIELDCol	+","+ LENGTHCol	+","+ YEARCol	+","+ MONTHCol	+","+ ISOFFCODECol	+","+ CODECol	+","+ FIELDVALUECol	+","+ FIELDTYPECol	+","+ TBNAMECol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+RUNNINGFIELDCol+"=?,"+LENGTHCol+"=?,"+YEARCol+"=?,"+MONTHCol+"=?,"+ISOFFCODECol+"=?,"+CODECol+"=?,"+FIELDVALUECol+"=?,"+FIELDTYPECol+"=?,"+TBNAMECol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseRunning(DB db){
		super(db);
	}



public synchronized Running create() throws Exception{
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
					return (Running)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Running> createList(List<Running> objList)throws Exception{
    	DB db = this.initDB();
    	List<Running> resultList = new ArrayList<Running>();
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
	public Running findByPk(Long id)throws Exception{
		List<Running> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<Running> findByPks(List<Long> ids)throws Exception{
		List<Running> resultList = new ArrayList<Running>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<Running> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<Running> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<Running> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<Running> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<Running> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<Running> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<Running> resultList = new ArrayList<Running>();
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
	public List<Running> findByExample(Running instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<Running> findByExample(Running instance,PageUtil pageUtil) throws Exception{
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
	public Running update()throws Exception{
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
					return (Running)this;
			}else// not update
				return (Running)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Running> updateList(List<Running> objList)throws Exception{
		DB db = this.initDB();
		List<Running> resultList = new ArrayList<Running>();
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
	public Integer deleteList(List<Running> objList)throws Exception {
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
	public Running populate(ResultSet rs)throws Exception{
		Running result = new Running(this.db);
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
    private String runningfield;

    private Long length;

    private String year;

    private String month;

    private String isoffcode;

    private String code;

    private String fieldvalue;

    private String fieldtype;

    private String tbname;

    private Long id;

	//**** getter setter ****//
	public String getRunningfield()
    {
        return runningfield;
    }
    public void setRunningfield(String runningfield)
    {
        this.runningfield = runningfield;
    }

	public Long getLength()
    {
        return length;
    }
    public void setLength(Long length)
    {
        this.length = length;
    }

	public String getYear()
    {
        return year;
    }
    public void setYear(String year)
    {
        this.year = year;
    }

	public String getMonth()
    {
        return month;
    }
    public void setMonth(String month)
    {
        this.month = month;
    }

	public String getIsoffcode()
    {
        return isoffcode;
    }
    public void setIsoffcode(String isoffcode)
    {
        this.isoffcode = isoffcode;
    }

	public String getCode()
    {
        return code;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

	public String getFieldvalue()
    {
        return fieldvalue;
    }
    public void setFieldvalue(String fieldvalue)
    {
        this.fieldvalue = fieldvalue;
    }

	public String getFieldtype()
    {
        return fieldtype;
    }
    public void setFieldtype(String fieldtype)
    {
        this.fieldtype = fieldtype;
    }

	public String getTbname()
    {
        return tbname;
    }
    public void setTbname(String tbname)
    {
        this.tbname = tbname;
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