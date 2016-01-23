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

import com.ko.domain.StaffOther;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseStaffOther extends BaseDomain{
	
	// table
	public static final String TABLE_NAME = "STAFF_OTHER";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "STAFF_OTHER.ID";
	
	// short name column
	public static final String ACTIVECol = "ACTIVE";
	
	public static final String END_DATECol = "END_DATE";
	
	public static final String START_DATECol = "START_DATE";
	
	public static final String DEPT_NAMECol = "DEPT_NAME";

	public static final String POS_NAMECol = "POS_NAME";
	
	public static final String LAST_NAMECol = "LAST_NAME";
	
	public static final String FIRST_NAMECol = "FIRST_NAME";
	
	public static final String TITLE_CODECol = "TITLE_CODE";
	
	public static final String STAFF_NOCol = "STAFF_NO";
	
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";
	
	public static final String IDCol = "ID";
	
	//  full column name
	public static final String ACTIVEColumn = "STAFF_OTHER.ACTIVE";
	
	public static final String END_DATEColumn = "STAFF_OTHER.END_DATE";
	
	public static final String START_DATEColumn = "STAFF_OTHER.START_DATE";
	
	public static final String DEPT_NAMEColunn = "STAFF_OTHER.DEPT_NAME";

	public static final String POS_NAMEColumn = "STAFF_OTHER.POS_NAME";
	
	public static final String LAST_NAMEColumn = "STAFF_OTHER.LAST_NAME";
	
	public static final String FIRST_NAMEColumn = "STAFF_OTHER.FIRST_NAME";
	
	public static final String TITLE_CODEColumn = "STAFF_OTHER.TITLE_CODE";
	
	public static final String STAFF_NOColumn = "STAFF_OTHER.STAFF_NO";
	
	public static final String UPDATE_ONColumn = "STAFF_OTHER.UPDATE_ON";

	public static final String UPDATE_BYColumn = "STAFF_OTHER.UPDATE_BY";

	public static final String CREATE_ONColumn = "STAFF_OTHER.CREATE_ON";

	public static final String CREATE_BYColumn = "STAFF_OTHER.CREATE_BY";
	
	public static final String IDColumn = "STAFF_OTHER.ID";
	
	public static final String[] ALL_COLUMNS =
    {
	 ACTIVECol, END_DATECol, START_DATECol, DEPT_NAMECol	, POS_NAMECol	, LAST_NAMECol	, FIRST_NAMECol	, TITLE_CODECol, STAFF_NOCol, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	,  pkCol
    };
	
	public static final String ALL_COLUMN_STRING =  ACTIVECol+ ", " + END_DATECol+ ", " + START_DATECol + ", " + DEPT_NAMECol	+","+ POS_NAMECol	+","+ LAST_NAMECol	+","+ FIRST_NAMECol	+"," + TITLE_CODECol + "," + STAFF_NOCol + ", " + UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ pkCol	;
	
	public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+DEPT_NAMECol+"=?,"+POS_NAMECol+"=?,"+POSCODE_ADMINCol+"=?,"+POSCODECol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+PER_ID_REFCol+"=?,"+OFFCODECol+"=?,"+STAFF_LEVELCol+"=?,"+BIRTHDATECol+"=?,"+SEXCol+"=?,"+LAST_NAMECol+"=?,"+FIRST_NAMECol+"=?,"+TITLE_CODECol+"=?,"+PER_TYPECol+"=?,"+IDCARD_NOCol+"=?,"+EMPIDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseStaffOther(DB db){
		super(db);
	}

	public synchronized StaffOther create() throws Exception{
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
					return (StaffOther)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<StaffOther> createList(List<StaffOther> objList)throws Exception{
    	DB db = this.initDB();
    	List<StaffOther> resultList = new ArrayList<StaffOther>();
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
	public StaffOther findByPk(Long id)throws Exception{
		List<StaffOther> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<StaffOther> findByPks(List<Long> ids)throws Exception{
		List<StaffOther> resultList = new ArrayList<StaffOther>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<StaffOther> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<StaffOther> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<StaffOther> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<StaffOther> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<StaffOther> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<StaffOther> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<StaffOther> resultList = new ArrayList<StaffOther>();
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
	public List<StaffOther> findByExample(StaffOther instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<StaffOther> findByExample(StaffOther instance,PageUtil pageUtil) throws Exception{
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
	public StaffOther update()throws Exception{
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
					return (StaffOther)this;
			}else// not update
				return (StaffOther)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<StaffOther> updateList(List<StaffOther> objList)throws Exception{
		DB db = this.initDB();
		List<StaffOther> resultList = new ArrayList<StaffOther>();
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
	public Integer deleteList(List<StaffOther> objList)throws Exception {
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
	public StaffOther populate(ResultSet rs)throws Exception{
		StaffOther result = new StaffOther(this.db);
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
    private String active;
    
    private java.util.Date end_date;
    
    private java.util.Date start_date;
    
    private String dept_name;

    private String pos_name;
    
    private String last_name;
    
    private String first_name;
    
    private String title_code;
    
    private String staff_no;
    
    private java.util.Date update_on;
    
    private String update_by;
    
    private java.util.Date create_on;
    
    private String create_by;
    
    private Long id;
    
  //**** getter setter ****//
    public String getActive(){
    	return active;
    }
    public void setActive(String active){
    	this.active = active;
    }
    
    public java.util.Date getEnd_date(){
    	return end_date;
    }
    public void setEnd_date(java.util.Date end_date){
    	this.end_date = end_date;
    }
    
    public java.util.Date getStart_date(){
    	return start_date;
    }
    public void setStart_date(java.util.Date start_date){
    	this.start_date = start_date;
    }
    
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
    
    public java.util.Date getUpdate_on()
    {
        return update_on;
    }
    public void setUpdate_on(java.util.Date update_on)
    {
        this.update_on = update_on;
    }

	public String getUpdate_by()
    {
        return update_by;
    }
    public void setUpdate_by(String update_by)
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

	public String getCreate_by()
    {
        return create_by;
    }
    public void setCreate_by(String create_by)
    {
        this.create_by = create_by;
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
    
    public String getTitle_code(){
    	return title_code;
    }
    public void setTitle_code(String title_code){
    	this.title_code = title_code;
    }
    
    public String getStaff_no(){
    	return staff_no;
    }
    public void setStaff_no(String staff_no){
    	this.staff_no = staff_no;
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
