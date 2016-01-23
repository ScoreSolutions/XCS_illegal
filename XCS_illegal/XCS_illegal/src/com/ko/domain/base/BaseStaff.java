








 

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

import com.ko.domain.Staff;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseStaff extends BaseDomain{
	// table
	public static final String TABLE_NAME = "STAFF";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "STAFF.ID";

	// short name column
	public static final String DEPT_NAMECol = "DEPT_NAME";

	public static final String POS_NAMECol = "POS_NAME";

	public static final String POSCODE_ADMINCol = "POSCODE_ADMIN";

	public static final String POSCODECol = "POSCODE";

	//public static final String UPDATE_ONCol = "UPDATE_ON";

	//public static final String UPDATE_BYCol = "UPDATE_BY";

	//public static final String CREATE_ONCol = "CREATE_ON";

	//public static final String CREATE_BYCol = "CREATE_BY";

	public static final String PER_ID_REFCol = "PER_ID_REF";

	public static final String OFFCODECol = "OFFCODE";

	public static final String STAFF_LEVELCol = "STAFF_LEVEL";

	public static final String BIRTHDATECol = "BIRTHDATE";

	public static final String SEXCol = "SEX";

	public static final String LAST_NAMECol = "LAST_NAME";

	public static final String FIRST_NAMECol = "FIRST_NAME";

	public static final String TITLE_CODECol = "TITLE_CODE";

	public static final String PER_TYPECol = "PER_TYPE";

	public static final String IDCARD_NOCol = "IDCARD_NO";

	public static final String EMPIDCol = "EMPID";

	public static final String IDCol = "ID";


	// full column name
	public static final String DEPT_NAMEColumn = "STAFF.DEPT_NAME";

	public static final String POS_NAMEColumn = "STAFF.POS_NAME";

	public static final String POSCODE_ADMINColumn = "STAFF.POSCODE_ADMIN";

	public static final String POSCODEColumn = "STAFF.POSCODE";

	//public static final String UPDATE_ONColumn = "STAFF.UPDATE_ON";

	//public static final String UPDATE_BYColumn = "STAFF.UPDATE_BY";

	//public static final String CREATE_ONColumn = "STAFF.CREATE_ON";

	//public static final String CREATE_BYColumn = "STAFF.CREATE_BY";

	//public static final String PER_ID_REFColumn = "STAFF.PER_ID_REF";

	public static final String OFFCODEColumn = "STAFF.OFFCODE";

	public static final String STAFF_LEVELColumn = "STAFF.STAFF_LEVEL";

	public static final String BIRTHDATEColumn = "STAFF.BIRTHDATE";

	public static final String SEXColumn = "STAFF.SEX";

	public static final String LAST_NAMEColumn = "STAFF.LAST_NAME";

	public static final String FIRST_NAMEColumn = "STAFF.FIRST_NAME";

	public static final String TITLE_CODEColumn = "STAFF.TITLE_CODE";

	public static final String PER_TYPEColumn = "STAFF.PER_TYPE";

	public static final String IDCARD_NOColumn = "STAFF.IDCARD_NO";

	public static final String EMPIDColumn = "STAFF.EMPID";

	public static final String IDColumn = "STAFF.ID";


	public static final String[] ALL_COLUMNS =
    {
	 DEPT_NAMECol	, POS_NAMECol	, POSCODE_ADMINCol	, POSCODECol	,  PER_ID_REFCol	, OFFCODECol	, STAFF_LEVELCol	, BIRTHDATECol	, SEXCol	, LAST_NAMECol	, FIRST_NAMECol	, TITLE_CODECol	, PER_TYPECol	, IDCARD_NOCol	, EMPIDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  DEPT_NAMECol	+","+ POS_NAMECol	+","+ POSCODE_ADMINCol	+","+ POSCODECol	+","+  PER_ID_REFCol	+","+ OFFCODECol	+","+ STAFF_LEVELCol	+","+ BIRTHDATECol	+","+ SEXCol	+","+ LAST_NAMECol	+","+ FIRST_NAMECol	+","+ TITLE_CODECol	+","+ PER_TYPECol	+","+ IDCARD_NOCol	+","+ EMPIDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+DEPT_NAMECol+"=?,"+POS_NAMECol+"=?,"+POSCODE_ADMINCol+"=?,"+POSCODECol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+PER_ID_REFCol+"=?,"+OFFCODECol+"=?,"+STAFF_LEVELCol+"=?,"+BIRTHDATECol+"=?,"+SEXCol+"=?,"+LAST_NAMECol+"=?,"+FIRST_NAMECol+"=?,"+TITLE_CODECol+"=?,"+PER_TYPECol+"=?,"+IDCARD_NOCol+"=?,"+EMPIDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseStaff(DB db){
		super(db);
	}



public synchronized Staff create() throws Exception{
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
					return (Staff)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Staff> createList(List<Staff> objList)throws Exception{
    	DB db = this.initDB();
    	List<Staff> resultList = new ArrayList<Staff>();
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
	public Staff findByPk(Long id)throws Exception{
		List<Staff> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<Staff> findByPks(List<Long> ids)throws Exception{
		List<Staff> resultList = new ArrayList<Staff>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<Staff> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<Staff> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<Staff> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<Staff> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<Staff> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<Staff> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<Staff> resultList = new ArrayList<Staff>();
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
	public List<Staff> findByExample(Staff instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<Staff> findByExample(Staff instance,PageUtil pageUtil) throws Exception{
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
	public Staff update()throws Exception{
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
					return (Staff)this;
			}else// not update
				return (Staff)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Staff> updateList(List<Staff> objList)throws Exception{
		DB db = this.initDB();
		List<Staff> resultList = new ArrayList<Staff>();
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
	public Integer deleteList(List<Staff> objList)throws Exception {
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
	public Staff populate(ResultSet rs)throws Exception{
		Staff result = new Staff(this.db);
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
    private String dept_name;

    private String pos_name;

    private String poscode_admin;

    private String poscode;

    private Long per_id_ref;

    private String offcode;

    private String staff_level;

    private java.util.Date birthdate;

    private String sex;

    private String last_name;

    private String first_name;

    private String title_code;

    private String per_type;

    private Long idcard_no;

    private Long empid;

    private Long id;

	//**** getter setter ****//
	public String getDept_name()
    {
        return dept_name;
    }
    public void setDept_name(String dept_name)
    {
        this.dept_name = dept_name;
    }

	public String getPos_name()
    {
        return pos_name;
    }
    public void setPos_name(String pos_name)
    {
        this.pos_name = pos_name;
    }

	public String getPoscode_admin()
    {
        return poscode_admin;
    }
    public void setPoscode_admin(String poscode_admin)
    {
        this.poscode_admin = poscode_admin;
    }

	public String getPoscode()
    {
        return poscode;
    }
    public void setPoscode(String poscode)
    {
        this.poscode = poscode;
    }

	public Long getPer_id_ref()
    {
        return per_id_ref;
    }
    public void setPer_id_ref(Long per_id_ref)
    {
        this.per_id_ref = per_id_ref;
    }

	public String getOffcode()
    {
        return offcode;
    }
    public void setOffcode(String offcode)
    {
        this.offcode = offcode;
    }

	public String getStaff_level()
    {
        return staff_level;
    }
    public void setStaff_level(String staff_level)
    {
        this.staff_level = staff_level;
    }

	public java.util.Date getBirthdate()
    {
        return birthdate;
    }
    public void setBirthdate(java.util.Date birthdate)
    {
        this.birthdate = birthdate;
    }

	public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

	public String getLast_name()
    {
        return last_name;
    }
    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }

	public String getFirst_name()
    {
        return first_name;
    }
    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }

	public String getTitle_code()
    {
        return title_code;
    }
    public void setTitle_code(String title_code)
    {
        this.title_code = title_code;
    }

	public String getPer_type()
    {
        return per_type;
    }
    public void setPer_type(String per_type)
    {
        this.per_type = per_type;
    }

	public Long getIdcard_no()
    {
        return idcard_no;
    }
    public void setIdcard_no(Long idcard_no)
    {
        this.idcard_no = idcard_no;
    }

	public Long getEmpid()
    {
        return empid;
    }
    public void setEmpid(Long empid)
    {
        this.empid = empid;
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