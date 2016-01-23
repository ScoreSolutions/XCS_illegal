








 

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

import com.ko.domain.ApplicationOutsideProve;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationOutsideProve extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_OUTSIDE_PROVE";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_OUTSIDE_PROVE.ID";

	// short name column
	public static final String REPLACE_POSITIONCol = "REPLACE_POSITION";

	public static final String DEPT_TYPECol = "DEPT_TYPE";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String PROVE_DATECol = "PROVE_DATE";

	public static final String PROVE_RESULTCol = "PROVE_RESULT";

	public static final String ISRETURNCol = "ISRETURN";

	public static final String PROVE_OBJECTIVECol = "PROVE_OBJECTIVE";

	public static final String OFFCODE_PROVECol = "OFFCODE_PROVE";

	public static final String POSCODE_PROVECol = "POSCODE_PROVE";

	public static final String STAFF_ID_PROVECol = "STAFF_ID_PROVE";

	public static final String PROVE_NOCol = "PROVE_NO";

	public static final String OFFCODECol = "OFFCODE";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String DOC_DEPT_NAMECol = "DOC_DEPT_NAME";

	public static final String REF_DOC_DATECol = "REF_DOC_DATE";

	public static final String REF_DOC_NOCol = "REF_DOC_NO";

	public static final String JOB_DATECol = "JOB_DATE";

	public static final String JOB_NOCol = "JOB_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String REPLACE_POSITIONColumn = "APPLICATION_OUTSIDE_PROVE.REPLACE_POSITION";

	public static final String DEPT_TYPEColumn = "APPLICATION_OUTSIDE_PROVE.DEPT_TYPE";

	public static final String UPDATE_ONColumn = "APPLICATION_OUTSIDE_PROVE.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_OUTSIDE_PROVE.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_OUTSIDE_PROVE.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_OUTSIDE_PROVE.CREATE_BY";

	public static final String PROVE_DATEColumn = "APPLICATION_OUTSIDE_PROVE.PROVE_DATE";

	public static final String PROVE_RESULTColumn = "APPLICATION_OUTSIDE_PROVE.PROVE_RESULT";

	public static final String ISRETURNColumn = "APPLICATION_OUTSIDE_PROVE.ISRETURN";

	public static final String PROVE_OBJECTIVEColumn = "APPLICATION_OUTSIDE_PROVE.PROVE_OBJECTIVE";

	public static final String OFFCODE_PROVEColumn = "APPLICATION_OUTSIDE_PROVE.OFFCODE_PROVE";

	public static final String POSCODE_PROVEColumn = "APPLICATION_OUTSIDE_PROVE.POSCODE_PROVE";

	public static final String STAFF_ID_PROVEColumn = "APPLICATION_OUTSIDE_PROVE.STAFF_ID_PROVE";

	public static final String PROVE_NOColumn = "APPLICATION_OUTSIDE_PROVE.PROVE_NO";

	public static final String OFFCODEColumn = "APPLICATION_OUTSIDE_PROVE.OFFCODE";

	public static final String LEGISLATION_IDColumn = "APPLICATION_OUTSIDE_PROVE.LEGISLATION_ID";

	public static final String DOC_DEPT_NAMEColumn = "APPLICATION_OUTSIDE_PROVE.DOC_DEPT_NAME";

	public static final String REF_DOC_DATEColumn = "APPLICATION_OUTSIDE_PROVE.REF_DOC_DATE";

	public static final String REF_DOC_NOColumn = "APPLICATION_OUTSIDE_PROVE.REF_DOC_NO";

	public static final String JOB_DATEColumn = "APPLICATION_OUTSIDE_PROVE.JOB_DATE";

	public static final String JOB_NOColumn = "APPLICATION_OUTSIDE_PROVE.JOB_NO";

	public static final String IDColumn = "APPLICATION_OUTSIDE_PROVE.ID";


	public static final String[] ALL_COLUMNS =
    {
	 REPLACE_POSITIONCol	, DEPT_TYPECol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, PROVE_DATECol	, PROVE_RESULTCol	, ISRETURNCol	, PROVE_OBJECTIVECol	, OFFCODE_PROVECol	, POSCODE_PROVECol	, STAFF_ID_PROVECol	, PROVE_NOCol	, OFFCODECol	, LEGISLATION_IDCol	, DOC_DEPT_NAMECol	, REF_DOC_DATECol	, REF_DOC_NOCol	, JOB_DATECol	, JOB_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  REPLACE_POSITIONCol	+","+ DEPT_TYPECol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ PROVE_DATECol	+","+ PROVE_RESULTCol	+","+ ISRETURNCol	+","+ PROVE_OBJECTIVECol	+","+ OFFCODE_PROVECol	+","+ POSCODE_PROVECol	+","+ STAFF_ID_PROVECol	+","+ PROVE_NOCol	+","+ OFFCODECol	+","+ LEGISLATION_IDCol	+","+ DOC_DEPT_NAMECol	+","+ REF_DOC_DATECol	+","+ REF_DOC_NOCol	+","+ JOB_DATECol	+","+ JOB_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+REPLACE_POSITIONCol+"=?,"+DEPT_TYPECol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+PROVE_DATECol+"=?,"+PROVE_RESULTCol+"=?,"+ISRETURNCol+"=?,"+PROVE_OBJECTIVECol+"=?,"+OFFCODE_PROVECol+"=?,"+POSCODE_PROVECol+"=?,"+STAFF_ID_PROVECol+"=?,"+PROVE_NOCol+"=?,"+OFFCODECol+"=?,"+LEGISLATION_IDCol+"=?,"+DOC_DEPT_NAMECol+"=?,"+REF_DOC_DATECol+"=?,"+REF_DOC_NOCol+"=?,"+JOB_DATECol+"=?,"+JOB_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationOutsideProve(DB db){
		super(db);
	}



public synchronized ApplicationOutsideProve create() throws Exception{
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
					return (ApplicationOutsideProve)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationOutsideProve> createList(List<ApplicationOutsideProve> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationOutsideProve> resultList = new ArrayList<ApplicationOutsideProve>();
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
	public ApplicationOutsideProve findByPk(Long id)throws Exception{
		List<ApplicationOutsideProve> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationOutsideProve> findByPks(List<Long> ids)throws Exception{
		List<ApplicationOutsideProve> resultList = new ArrayList<ApplicationOutsideProve>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationOutsideProve> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationOutsideProve> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationOutsideProve> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationOutsideProve> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationOutsideProve> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationOutsideProve> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationOutsideProve> resultList = new ArrayList<ApplicationOutsideProve>();
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
	public List<ApplicationOutsideProve> findByExample(ApplicationOutsideProve instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationOutsideProve> findByExample(ApplicationOutsideProve instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationOutsideProve update()throws Exception{
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
					return (ApplicationOutsideProve)this;
			}else// not update
				return (ApplicationOutsideProve)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationOutsideProve> updateList(List<ApplicationOutsideProve> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationOutsideProve> resultList = new ArrayList<ApplicationOutsideProve>();
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
	public Integer deleteList(List<ApplicationOutsideProve> objList)throws Exception {
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
	public ApplicationOutsideProve populate(ResultSet rs)throws Exception{
		ApplicationOutsideProve result = new ApplicationOutsideProve(this.db);
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
    private String replace_position;

    private String dept_type;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private java.util.Date prove_date;

    private String prove_result;

    private String isreturn;

    private String prove_objective;

    private String offcode_prove;

    private String poscode_prove;

    private String staff_id_prove;

    private String prove_no;

    private String offcode;

    private Long legislation_id;

    private String doc_dept_name;

    private java.util.Date ref_doc_date;

    private String ref_doc_no;

    private java.util.Date job_date;

    private String job_no;

    private Long id;

	//**** getter setter ****//
	public String getReplace_position()
    {
        return replace_position;
    }
    public void setReplace_position(String replace_position)
    {
        this.replace_position = replace_position;
    }

	public String getDept_type()
    {
        return dept_type;
    }
    public void setDept_type(String dept_type)
    {
        this.dept_type = dept_type;
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

	public java.util.Date getProve_date()
    {
        return prove_date;
    }
    public void setProve_date(java.util.Date prove_date)
    {
        this.prove_date = prove_date;
    }

	public String getProve_result()
    {
        return prove_result;
    }
    public void setProve_result(String prove_result)
    {
        this.prove_result = prove_result;
    }

	public String getIsreturn()
    {
        return isreturn;
    }
    public void setIsreturn(String isreturn)
    {
        this.isreturn = isreturn;
    }

	public String getProve_objective()
    {
        return prove_objective;
    }
    public void setProve_objective(String prove_objective)
    {
        this.prove_objective = prove_objective;
    }

	public String getOffcode_prove()
    {
        return offcode_prove;
    }
    public void setOffcode_prove(String offcode_prove)
    {
        this.offcode_prove = offcode_prove;
    }

	public String getPoscode_prove()
    {
        return poscode_prove;
    }
    public void setPoscode_prove(String poscode_prove)
    {
        this.poscode_prove = poscode_prove;
    }

	public String getStaff_id_prove()
    {
        return staff_id_prove;
    }
    public void setStaff_id_prove(String staff_id_prove)
    {
        this.staff_id_prove = staff_id_prove;
    }

	public String getProve_no()
    {
        return prove_no;
    }
    public void setProve_no(String prove_no)
    {
        this.prove_no = prove_no;
    }

	public String getOffcode()
    {
        return offcode;
    }
    public void setOffcode(String offcode)
    {
        this.offcode = offcode;
    }

	public Long getLegislation_id()
    {
        return legislation_id;
    }
    public void setLegislation_id(Long legislation_id)
    {
        this.legislation_id = legislation_id;
    }

	public String getDoc_dept_name()
    {
        return doc_dept_name;
    }
    public void setDoc_dept_name(String doc_dept_name)
    {
        this.doc_dept_name = doc_dept_name;
    }

	public java.util.Date getRef_doc_date()
    {
        return ref_doc_date;
    }
    public void setRef_doc_date(java.util.Date ref_doc_date)
    {
        this.ref_doc_date = ref_doc_date;
    }

	public String getRef_doc_no()
    {
        return ref_doc_no;
    }
    public void setRef_doc_no(String ref_doc_no)
    {
        this.ref_doc_no = ref_doc_no;
    }

	public java.util.Date getJob_date()
    {
        return job_date;
    }
    public void setJob_date(java.util.Date job_date)
    {
        this.job_date = job_date;
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