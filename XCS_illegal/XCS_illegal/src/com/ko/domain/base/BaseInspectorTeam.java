








 

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

import com.ko.domain.InspectorTeam;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseInspectorTeam extends BaseDomain{
	// table
	public static final String TABLE_NAME = "INSPECTOR_TEAM";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "INSPECTOR_TEAM.ID";

	// short name column
	public static final String OFFCODE_DIVCol = "OFFCODE_DIV";

	public static final String OFFCODE_DEPTCol = "OFFCODE_DEPT";

	public static final String OFFCODE_LEADERCol = "OFFCODE_LEADER";

	public static final String POSCODE_LEADERCol = "POSCODE_LEADER";

	public static final String STAFF_IDCARDNO_LEADERCol = "STAFF_IDCARDNO_LEADER";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String INSPECTOR_NAMECol = "INSPECTOR_NAME";

	public static final String INSPECTOR_CODECol = "INSPECTOR_CODE";

	public static final String APPOINT_DATECol = "APPOINT_DATE";

	public static final String APPOINT_NOCol = "APPOINT_NO";

	public static final String JOB_NOCol = "JOB_NO";

	public static final String IDCol = "ID";
	
	public static final String STATUSCol = "STATUS"; 
	
	public static final String CANCEL_DATECol = "CANCEL_DATE";


	// full column name
	public static final String OFFCODE_DIVColumn = "INSPECTOR_TEAM.OFFCODE_DIV";

	public static final String OFFCODE_DEPTColumn = "INSPECTOR_TEAM.OFFCODE_DEPT";

	public static final String OFFCODE_LEADERColumn = "INSPECTOR_TEAM.OFFCODE_LEADER";

	public static final String POSCODE_LEADERColumn = "INSPECTOR_TEAM.POSCODE_LEADER";

	public static final String STAFF_IDCARDNO_LEADERColumn = "INSPECTOR_TEAM.STAFF_IDCARDNO_LEADER";

	public static final String UPDATE_ONColumn = "INSPECTOR_TEAM.UPDATE_ON";

	public static final String UPDATE_BYColumn = "INSPECTOR_TEAM.UPDATE_BY";

	public static final String CREATE_ONColumn = "INSPECTOR_TEAM.CREATE_ON";

	public static final String CREATE_BYColumn = "INSPECTOR_TEAM.CREATE_BY";

	public static final String INSPECTOR_NAMEColumn = "INSPECTOR_TEAM.INSPECTOR_NAME";

	public static final String INSPECTOR_CODEColumn = "INSPECTOR_TEAM.INSPECTOR_CODE";

	public static final String APPOINT_DATEColumn = "INSPECTOR_TEAM.APPOINT_DATE";

	public static final String APPOINT_NOColumn = "INSPECTOR_TEAM.APPOINT_NO";

	public static final String JOB_NOColumn = "INSPECTOR_TEAM.JOB_NO";

	public static final String IDColumn = "INSPECTOR_TEAM.ID";
	
	public static final String STATUSColumn ="INSPECTOR_TEAM.STATUS";
	
	public static final String CANCEL_DATEColumn = "INSPECTOR_TEAM.CANCEL_DATE";


	public static final String[] ALL_COLUMNS =
    {
		CANCEL_DATECol, STATUSCol, OFFCODE_DIVCol	, OFFCODE_DEPTCol	, OFFCODE_LEADERCol	, POSCODE_LEADERCol	, STAFF_IDCARDNO_LEADERCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, INSPECTOR_NAMECol	, INSPECTOR_CODECol	, APPOINT_DATECol	, APPOINT_NOCol	, JOB_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  CANCEL_DATECol +","+ STATUSCol +","+ OFFCODE_DIVCol	+","+ OFFCODE_DEPTCol	+","+ OFFCODE_LEADERCol	+","+ POSCODE_LEADERCol	+","+ STAFF_IDCARDNO_LEADERCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ INSPECTOR_NAMECol	+","+ INSPECTOR_CODECol	+","+ APPOINT_DATECol	+","+ APPOINT_NOCol	+","+ JOB_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+OFFCODE_DIVCol+"=?,"+OFFCODE_DEPTCol+"=?,"+OFFCODE_LEADERCol+"=?,"+POSCODE_LEADERCol+"=?,"+STAFF_IDCARDNO_LEADERCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+INSPECTOR_NAMECol+"=?,"+INSPECTOR_CODECol+"=?,"+APPOINT_DATECol+"=?,"+APPOINT_NOCol+"=?,"+JOB_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseInspectorTeam(DB db){
		super(db);
	}



public synchronized InspectorTeam create() throws Exception{
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
					return (InspectorTeam)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<InspectorTeam> createList(List<InspectorTeam> objList)throws Exception{
    	DB db = this.initDB();
    	List<InspectorTeam> resultList = new ArrayList<InspectorTeam>();
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
	public InspectorTeam findByPk(Long id)throws Exception{
		List<InspectorTeam> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<InspectorTeam> findByPks(List<Long> ids)throws Exception{
		List<InspectorTeam> resultList = new ArrayList<InspectorTeam>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<InspectorTeam> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<InspectorTeam> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<InspectorTeam> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<InspectorTeam> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<InspectorTeam> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<InspectorTeam> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<InspectorTeam> resultList = new ArrayList<InspectorTeam>();
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
	public List<InspectorTeam> findByExample(InspectorTeam instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<InspectorTeam> findByExample(InspectorTeam instance,PageUtil pageUtil) throws Exception{
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
	public InspectorTeam update()throws Exception{
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
					return (InspectorTeam)this;
			}else// not update
				return (InspectorTeam)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<InspectorTeam> updateList(List<InspectorTeam> objList)throws Exception{
		DB db = this.initDB();
		List<InspectorTeam> resultList = new ArrayList<InspectorTeam>();
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
	public Integer deleteList(List<InspectorTeam> objList)throws Exception {
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
	public InspectorTeam populate(ResultSet rs)throws Exception{
		InspectorTeam result = new InspectorTeam(this.db);
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
    private String offcode_div;

    private String offcode_dept;

    private String offcode_leader;

    private String poscode_leader;

    private String staff_idcardno_leader;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String inspector_name;

    private String inspector_code;

    private java.util.Date appoint_date;

    private String appoint_no;

    private String job_no;

    private Long id;
    
    private java.util.Date cancel_date;
    
    private String status;

	public java.util.Date getCancel_date() {
		return cancel_date;
	}



	public void setCancel_date(java.util.Date cancelDate) {
		this.cancel_date = cancelDate;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	//**** getter setter ****//
	public String getOffcode_div()
    {
        return offcode_div;
    }
    public void setOffcode_div(String offcode_div)
    {
        this.offcode_div = offcode_div;
    }

	public String getOffcode_dept()
    {
        return offcode_dept;
    }
    public void setOffcode_dept(String offcode_dept)
    {
        this.offcode_dept = offcode_dept;
    }

	public String getOffcode_leader()
    {
        return offcode_leader;
    }
    public void setOffcode_leader(String offcode_leader)
    {
        this.offcode_leader = offcode_leader;
    }

	public String getPoscode_leader()
    {
        return poscode_leader;
    }
    public void setPoscode_leader(String poscode_leader)
    {
        this.poscode_leader = poscode_leader;
    }

	public String getStaff_idcardno_leader()
    {
        return staff_idcardno_leader;
    }
    public void setStaff_idcardno_leader(String staff_idcardno_leader)
    {
        this.staff_idcardno_leader = staff_idcardno_leader;
    }

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

	public String getInspector_name()
    {
        return inspector_name;
    }
    public void setInspector_name(String inspector_name)
    {
        this.inspector_name = inspector_name;
    }

	public String getInspector_code()
    {
        return inspector_code;
    }
    public void setInspector_code(String inspector_code)
    {
        this.inspector_code = inspector_code;
    }

	public java.util.Date getAppoint_date()
    {
        return appoint_date;
    }
    public void setAppoint_date(java.util.Date appoint_date)
    {
        this.appoint_date = appoint_date;
    }

	public String getAppoint_no()
    {
        return appoint_no;
    }
    public void setAppoint_no(String appoint_no)
    {
        this.appoint_no = appoint_no;
    }

	public String getJob_no()
    {
        return job_no;
    }
    public void setJob_no(String job_no)
    {
        this.job_no = job_no;
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