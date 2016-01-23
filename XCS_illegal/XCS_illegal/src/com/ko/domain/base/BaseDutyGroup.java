








 

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

import com.ko.domain.DutyGroup;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseDutyGroup extends BaseDomain{
	// table
	public static final String TABLE_NAME = "DUTY_GROUP";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "DUTY_GROUP.ID";

	// short name column
	public static final String UPD_DATECol = "UPD_DATE";

	public static final String UPD_USERIDCol = "UPD_USERID";

	public static final String END_DATECol = "END_DATE";

	public static final String BEGIN_DATECol = "BEGIN_DATE";

	public static final String SUB_GROUP_IDCol = "SUB_GROUP_ID";

	public static final String GROUP_STATUSCol = "GROUP_STATUS";

	public static final String GROUP_NAMECol = "GROUP_NAME";

	public static final String GROUP_IDCol = "GROUP_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPD_DATEColumn = "DUTY_GROUP.UPD_DATE";

	public static final String UPD_USERIDColumn = "DUTY_GROUP.UPD_USERID";

	public static final String END_DATEColumn = "DUTY_GROUP.END_DATE";

	public static final String BEGIN_DATEColumn = "DUTY_GROUP.BEGIN_DATE";

	public static final String SUB_GROUP_IDColumn = "DUTY_GROUP.SUB_GROUP_ID";

	public static final String GROUP_STATUSColumn = "DUTY_GROUP.GROUP_STATUS";

	public static final String GROUP_NAMEColumn = "DUTY_GROUP.GROUP_NAME";

	public static final String GROUP_IDColumn = "DUTY_GROUP.GROUP_ID";

	public static final String IDColumn = "DUTY_GROUP.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPD_DATECol	, UPD_USERIDCol	, END_DATECol	, BEGIN_DATECol	, SUB_GROUP_IDCol	, GROUP_STATUSCol	, GROUP_NAMECol	, GROUP_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPD_DATECol	+","+ UPD_USERIDCol	+","+ END_DATECol	+","+ BEGIN_DATECol	+","+ SUB_GROUP_IDCol	+","+ GROUP_STATUSCol	+","+ GROUP_NAMECol	+","+ GROUP_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPD_DATECol+"=?,"+UPD_USERIDCol+"=?,"+END_DATECol+"=?,"+BEGIN_DATECol+"=?,"+SUB_GROUP_IDCol+"=?,"+GROUP_STATUSCol+"=?,"+GROUP_NAMECol+"=?,"+GROUP_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseDutyGroup(DB db){
		super(db);
	}



public synchronized DutyGroup create() throws Exception{
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
					return (DutyGroup)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<DutyGroup> createList(List<DutyGroup> objList)throws Exception{
    	DB db = this.initDB();
    	List<DutyGroup> resultList = new ArrayList<DutyGroup>();
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
	public DutyGroup findByPk(Long id)throws Exception{
		List<DutyGroup> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<DutyGroup> findByPks(List<Long> ids)throws Exception{
		List<DutyGroup> resultList = new ArrayList<DutyGroup>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<DutyGroup> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<DutyGroup> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<DutyGroup> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<DutyGroup> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<DutyGroup> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<DutyGroup> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<DutyGroup> resultList = new ArrayList<DutyGroup>();
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
	public List<DutyGroup> findByExample(DutyGroup instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<DutyGroup> findByExample(DutyGroup instance,PageUtil pageUtil) throws Exception{
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
	public DutyGroup update()throws Exception{
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
					return (DutyGroup)this;
			}else// not update
				return (DutyGroup)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<DutyGroup> updateList(List<DutyGroup> objList)throws Exception{
		DB db = this.initDB();
		List<DutyGroup> resultList = new ArrayList<DutyGroup>();
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
	public Integer deleteList(List<DutyGroup> objList)throws Exception {
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
	public DutyGroup populate(ResultSet rs)throws Exception{
		DutyGroup result = new DutyGroup(this.db);
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
    private java.util.Date upd_date;

    private String upd_userid;

    private java.util.Date end_date;

    private java.util.Date begin_date;

    private String sub_group_id;

    private String group_status;

    private String group_name;

    private String group_id;

    private Long id;

	//**** getter setter ****//
	public java.util.Date getUpd_date()
    {
        return upd_date;
    }
    public void setUpd_date(java.util.Date upd_date)
    {
        this.upd_date = upd_date;
    }

	public String getUpd_userid()
    {
        return upd_userid;
    }
    public void setUpd_userid(String upd_userid)
    {
        this.upd_userid = upd_userid;
    }

	public java.util.Date getEnd_date()
    {
        return end_date;
    }
    public void setEnd_date(java.util.Date end_date)
    {
        this.end_date = end_date;
    }

	public java.util.Date getBegin_date()
    {
        return begin_date;
    }
    public void setBegin_date(java.util.Date begin_date)
    {
        this.begin_date = begin_date;
    }

	public String getSub_group_id()
    {
        return sub_group_id;
    }
    public void setSub_group_id(String sub_group_id)
    {
        this.sub_group_id = sub_group_id;
    }

	public String getGroup_status()
    {
        return group_status;
    }
    public void setGroup_status(String group_status)
    {
        this.group_status = group_status;
    }

	public String getGroup_name()
    {
        return group_name;
    }
    public void setGroup_name(String group_name)
    {
        this.group_name = group_name;
    }

	public String getGroup_id()
    {
        return group_id;
    }
    public void setGroup_id(String group_id)
    {
        this.group_id = group_id;
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