








 

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

import com.ko.domain.CompareCase;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseCompareCase extends BaseDomain{
	// table
	public static final String TABLE_NAME = "COMPARE_CASE";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "COMPARE_CASE.ID";

	// short name column
	public static final String CASE_NON_OFFICE_NAMECol = "CASE_NON_OFFICE_NAME";
	
	public static final String CASE_TOTAL_FINECol = "CASE_TOTAL_FINE";
	
	public static final String INV_TYPECol = "INV_TYPE";

	public static final String SUE_OFFCODECol = "SUE_OFFCODE";

	public static final String SUE_POSCODECol = "SUE_POSCODE";

	public static final String SUE_STAFF_IDCARDNOCol = "SUE_STAFF_IDCARDNO";

	public static final String CASE_FINECol = "CASE_FINE";

	public static final String CASE_STATUSCol = "CASE_STATUS";

	public static final String MANAGE_TYPECol = "MANAGE_TYPE";

	public static final String COMPARE_AUTHORITY_IDCol = "COMPARE_AUTHORITY_ID";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String REWARD_MONEYCol = "REWARD_MONEY";

	public static final String BIRBE_MONEYCol = "BIRBE_MONEY";

	public static final String TREASURY_MONEYCol = "TREASURY_MONEY";

	public static final String REWARD_MONEY_PCol = "REWARD_MONEY_P";

	public static final String BRIBE_MONEY_PCol = "BRIBE_MONEY_P";

	public static final String TREASURY_MONEY_PCol = "TREASURY_MONEY_P";

	public static final String PAY_DATECol = "PAY_DATE";

	public static final String COURT_FINE_DATECol = "COURT_FINE_DATE";

	public static final String COURT_FINECol = "COURT_FINE";

	public static final String CASE_IDCol = "CASE_ID";

	public static final String ACCUSER_TESTIMONYCol = "ACCUSER_TESTIMONY";

	public static final String INDICTMENT_IDCol = "INDICTMENT_ID";

	public static final String ACCUSER_PROVINCECol = "ACCUSER_PROVINCE";

	public static final String ACCUSER_DISTRICTCol = "ACCUSER_DISTRICT";

	public static final String ACCUSER_SUBDISTRICTCol = "ACCUSER_SUBDISTRICT";

	public static final String COMPARE_PROVINCECol = "COMPARE_PROVINCE";

	public static final String COMPARE_DISTRICTCol = "COMPARE_DISTRICT";

	public static final String COMPARE_SUBDISTRICTCol = "COMPARE_SUBDISTRICT";

	public static final String COMPARE_OFFICECol = "COMPARE_OFFICE";

	public static final String TRACK_NOCol = "TRACK_NO";

	public static final String COMPARE_CASE_DATECol = "COMPARE_CASE_DATE";

	public static final String COMPARE_CASE_NOCol = "COMPARE_CASE_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String CASE_NON_OFFICE_NAMEColumn = "COMPARE_CASE.CASE_NON_OFFICE_NAME";
	
	public static final String CASE_TOTAL_FINEColumn = "COMPARE_CASE.CASE_TOTAL_FINE";
	
	public static final String INV_TYPEColumn = "COMPARE_CASE.INV_TYPE";

	public static final String SUE_OFFCODEColumn = "COMPARE_CASE.SUE_OFFCODE";

	public static final String SUE_POSCODEColumn = "COMPARE_CASE.SUE_POSCODE";

	public static final String SUE_STAFF_IDCARDNOColumn = "COMPARE_CASE.SUE_STAFF_IDCARDNO";

	public static final String CASE_FINEColumn = "COMPARE_CASE.CASE_FINE";

	public static final String CASE_STATUSColumn = "COMPARE_CASE.CASE_STATUS";

	public static final String MANAGE_TYPEColumn = "COMPARE_CASE.MANAGE_TYPE";

	public static final String COMPARE_AUTHORITY_IDColumn = "COMPARE_CASE.COMPARE_AUTHORITY_ID";

	public static final String UPDATE_ONColumn = "COMPARE_CASE.UPDATE_ON";

	public static final String UPDATE_BYColumn = "COMPARE_CASE.UPDATE_BY";

	public static final String CREATE_ONColumn = "COMPARE_CASE.CREATE_ON";

	public static final String CREATE_BYColumn = "COMPARE_CASE.CREATE_BY";

	public static final String REWARD_MONEYColumn = "COMPARE_CASE.REWARD_MONEY";

	public static final String BIRBE_MONEYColumn = "COMPARE_CASE.BIRBE_MONEY";

	public static final String TREASURY_MONEYColumn = "COMPARE_CASE.TREASURY_MONEY";

	public static final String REWARD_MONEY_PColumn = "COMPARE_CASE.REWARD_MONEY_P";

	public static final String BRIBE_MONEY_PColumn = "COMPARE_CASE.BRIBE_MONEY_P";

	public static final String TREASURY_MONEY_PColumn = "COMPARE_CASE.TREASURY_MONEY_P";

	public static final String PAY_DATEColumn = "COMPARE_CASE.PAY_DATE";

	public static final String COURT_FINE_DATEColumn = "COMPARE_CASE.COURT_FINE_DATE";

	public static final String COURT_FINEColumn = "COMPARE_CASE.COURT_FINE";

	public static final String CASE_IDColumn = "COMPARE_CASE.CASE_ID";

	public static final String ACCUSER_TESTIMONYColumn = "COMPARE_CASE.ACCUSER_TESTIMONY";

	public static final String INDICTMENT_IDColumn = "COMPARE_CASE.INDICTMENT_ID";

	public static final String ACCUSER_PROVINCEColumn = "COMPARE_CASE.ACCUSER_PROVINCE";

	public static final String ACCUSER_DISTRICTColumn = "COMPARE_CASE.ACCUSER_DISTRICT";

	public static final String ACCUSER_SUBDISTRICTColumn = "COMPARE_CASE.ACCUSER_SUBDISTRICT";

	public static final String COMPARE_PROVINCEColumn = "COMPARE_CASE.COMPARE_PROVINCE";

	public static final String COMPARE_DISTRICTColumn = "COMPARE_CASE.COMPARE_DISTRICT";

	public static final String COMPARE_SUBDISTRICTColumn = "COMPARE_CASE.COMPARE_SUBDISTRICT";

	public static final String COMPARE_OFFICEColumn = "COMPARE_CASE.COMPARE_OFFICE";

	public static final String TRACK_NOColumn = "COMPARE_CASE.TRACK_NO";

	public static final String COMPARE_CASE_DATEColumn = "COMPARE_CASE.COMPARE_CASE_DATE";

	public static final String COMPARE_CASE_NOColumn = "COMPARE_CASE.COMPARE_CASE_NO";

	public static final String IDColumn = "COMPARE_CASE.ID";


	public static final String[] ALL_COLUMNS =
    {
		CASE_NON_OFFICE_NAMECol, CASE_TOTAL_FINECol, INV_TYPECol	, SUE_OFFCODECol	, SUE_POSCODECol	, SUE_STAFF_IDCARDNOCol	, CASE_FINECol	, CASE_STATUSCol	, MANAGE_TYPECol	, COMPARE_AUTHORITY_IDCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, REWARD_MONEYCol	, BIRBE_MONEYCol	, TREASURY_MONEYCol	, REWARD_MONEY_PCol	, BRIBE_MONEY_PCol	, TREASURY_MONEY_PCol	, PAY_DATECol	, COURT_FINE_DATECol	, COURT_FINECol	, CASE_IDCol	, ACCUSER_TESTIMONYCol	, INDICTMENT_IDCol	, ACCUSER_PROVINCECol	, ACCUSER_DISTRICTCol	, ACCUSER_SUBDISTRICTCol	, COMPARE_PROVINCECol	, COMPARE_DISTRICTCol	, COMPARE_SUBDISTRICTCol	, COMPARE_OFFICECol	, TRACK_NOCol	, COMPARE_CASE_DATECol	, COMPARE_CASE_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  CASE_NON_OFFICE_NAMECol + ","+ CASE_TOTAL_FINECol + "," + INV_TYPECol	+","+ SUE_OFFCODECol	+","+ SUE_POSCODECol	+","+ SUE_STAFF_IDCARDNOCol	+","+ CASE_FINECol	+","+ CASE_STATUSCol	+","+ MANAGE_TYPECol	+","+ COMPARE_AUTHORITY_IDCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ REWARD_MONEYCol	+","+ BIRBE_MONEYCol	+","+ TREASURY_MONEYCol	+","+ REWARD_MONEY_PCol	+","+ BRIBE_MONEY_PCol	+","+ TREASURY_MONEY_PCol	+","+ PAY_DATECol	+","+ COURT_FINE_DATECol	+","+ COURT_FINECol	+","+ CASE_IDCol	+","+ ACCUSER_TESTIMONYCol	+","+ INDICTMENT_IDCol	+","+ ACCUSER_PROVINCECol	+","+ ACCUSER_DISTRICTCol	+","+ ACCUSER_SUBDISTRICTCol	+","+ COMPARE_PROVINCECol	+","+ COMPARE_DISTRICTCol	+","+ COMPARE_SUBDISTRICTCol	+","+ COMPARE_OFFICECol	+","+ TRACK_NOCol	+","+ COMPARE_CASE_DATECol	+","+ COMPARE_CASE_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+INV_TYPECol+"=?,"+SUE_OFFCODECol+"=?,"+SUE_POSCODECol+"=?,"+SUE_STAFF_IDCARDNOCol+"=?,"+CASE_FINECol+"=?,"+CASE_STATUSCol+"=?,"+MANAGE_TYPECol+"=?,"+COMPARE_AUTHORITY_IDCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+REWARD_MONEYCol+"=?,"+BIRBE_MONEYCol+"=?,"+TREASURY_MONEYCol+"=?,"+REWARD_MONEY_PCol+"=?,"+BRIBE_MONEY_PCol+"=?,"+TREASURY_MONEY_PCol+"=?,"+PAY_DATECol+"=?,"+COURT_FINE_DATECol+"=?,"+COURT_FINECol+"=?,"+CASE_IDCol+"=?,"+ACCUSER_TESTIMONYCol+"=?,"+INDICTMENT_IDCol+"=?,"+ACCUSER_PROVINCECol+"=?,"+ACCUSER_DISTRICTCol+"=?,"+ACCUSER_SUBDISTRICTCol+"=?,"+COMPARE_PROVINCECol+"=?,"+COMPARE_DISTRICTCol+"=?,"+COMPARE_SUBDISTRICTCol+"=?,"+COMPARE_OFFICECol+"=?,"+TRACK_NOCol+"=?,"+COMPARE_CASE_DATECol+"=?,"+COMPARE_CASE_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseCompareCase(DB db){
		super(db);
	}



public synchronized CompareCase create() throws Exception{
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
					return (CompareCase)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<CompareCase> createList(List<CompareCase> objList)throws Exception{
    	DB db = this.initDB();
    	List<CompareCase> resultList = new ArrayList<CompareCase>();
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
	public CompareCase findByPk(Long id)throws Exception{
		List<CompareCase> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<CompareCase> findByPks(List<Long> ids)throws Exception{
		List<CompareCase> resultList = new ArrayList<CompareCase>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<CompareCase> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<CompareCase> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<CompareCase> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<CompareCase> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<CompareCase> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<CompareCase> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<CompareCase> resultList = new ArrayList<CompareCase>();
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
	public List<CompareCase> findByExample(CompareCase instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<CompareCase> findByExample(CompareCase instance,PageUtil pageUtil) throws Exception{
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
	public CompareCase update()throws Exception{
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
					return (CompareCase)this;
			}else// not update
				return (CompareCase)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<CompareCase> updateList(List<CompareCase> objList)throws Exception{
		DB db = this.initDB();
		List<CompareCase> resultList = new ArrayList<CompareCase>();
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
	public Integer deleteList(List<CompareCase> objList)throws Exception {
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
	public CompareCase populate(ResultSet rs)throws Exception{
		CompareCase result = new CompareCase(this.db);
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
    private String case_non_office_name;
    
    private Double case_total_fine;
    
    private String inv_type;

    private String sue_offcode;

    private String sue_poscode;

    private String sue_staff_idcardno;

    private Double case_fine;

    private String case_status;

    private String manage_type;

    private Long compare_authority_id;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private Double reward_money;

    private Double birbe_money;

    private Double treasury_money;

    private Long reward_money_p;

    private Long bribe_money_p;

    private Long treasury_money_p;

    private java.util.Date pay_date;

    private java.util.Date court_fine_date;

    private Long court_fine;

    private Long case_id;

    private String accuser_testimony;

    private Long indictment_id;

    private String accuser_province;

    private String accuser_district;

    private String accuser_subdistrict;

    private String compare_province;

    private String compare_district;

    private String compare_subdistrict;

    private String compare_office;

    private String track_no;

    private java.util.Date compare_case_date;

    private String compare_case_no;

    private Long id;

	//**** getter setter ****// 
    public String getCase_non_office_name(){
    	return case_non_office_name;
    }
    public void setCase_non_office_name(String value){
    	case_non_office_name = value;
    }
    
    public Double getCase_total_fine(){
    	return case_total_fine;
    }
    public void setCase_total_fine(Double value){
    	this.case_total_fine = value;
    }
    
	public String getInv_type()
    {
        return inv_type;
    }
    public void setInv_type(String inv_type)
    {
        this.inv_type = inv_type;
    }

	public String getSue_offcode()
    {
        return sue_offcode;
    }
    public void setSue_offcode(String sue_offcode)
    {
        this.sue_offcode = sue_offcode;
    }

	public String getSue_poscode()
    {
        return sue_poscode;
    }
    public void setSue_poscode(String sue_poscode)
    {
        this.sue_poscode = sue_poscode;
    }

	public String getSue_staff_idcardno()
    {
        return sue_staff_idcardno;
    }
    public void setSue_staff_idcardno(String sue_staff_idcardno)
    {
        this.sue_staff_idcardno = sue_staff_idcardno;
    }

	public Double getCase_fine()
    {
        return case_fine;
    }
    public void setCase_fine(Double case_fine)
    {
        this.case_fine = case_fine;
    }

	public String getCase_status()
    {
        return case_status;
    }
    public void setCase_status(String case_status)
    {
        this.case_status = case_status;
    }

	public String getManage_type()
    {
        return manage_type;
    }
    public void setManage_type(String manage_type)
    {
        this.manage_type = manage_type;
    }

	public Long getCompare_authority_id()
    {
        return compare_authority_id;
    }
    public void setCompare_authority_id(Long compare_authority_id)
    {
        this.compare_authority_id = compare_authority_id;
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

	public Double getReward_money()
    {
        return reward_money;
    }
    public void setReward_money(Double reward_money)
    {
        this.reward_money = reward_money;
    }

	public Double getBirbe_money()
    {
        return birbe_money;
    }
    public void setBirbe_money(Double birbe_money)
    {
        this.birbe_money = birbe_money;
    }

	public Double getTreasury_money()
    {
        return treasury_money;
    }
    public void setTreasury_money(Double treasury_money)
    {
        this.treasury_money = treasury_money;
    }

	public Long getReward_money_p()
    {
        return reward_money_p;
    }
    public void setReward_money_p(Long reward_money_p)
    {
        this.reward_money_p = reward_money_p;
    }

	public Long getBribe_money_p()
    {
        return bribe_money_p;
    }
    public void setBribe_money_p(Long bribe_money_p)
    {
        this.bribe_money_p = bribe_money_p;
    }

	public Long getTreasury_money_p()
    {
        return treasury_money_p;
    }
    public void setTreasury_money_p(Long treasury_money_p)
    {
        this.treasury_money_p = treasury_money_p;
    }

	public java.util.Date getPay_date()
    {
        return pay_date;
    }
    public void setPay_date(java.util.Date pay_date)
    {
        this.pay_date = pay_date;
    }

	public java.util.Date getCourt_fine_date()
    {
        return court_fine_date;
    }
    public void setCourt_fine_date(java.util.Date court_fine_date)
    {
        this.court_fine_date = court_fine_date;
    }

	public Long getCourt_fine()
    {
        return court_fine;
    }
    public void setCourt_fine(Long court_fine)
    {
        this.court_fine = court_fine;
    }

	public Long getCase_id()
    {
        return case_id;
    }
    public void setCase_id(Long case_id)
    {
        this.case_id = case_id;
    }

	public String getAccuser_testimony()
    {
        return accuser_testimony;
    }
    public void setAccuser_testimony(String accuser_testimony)
    {
        this.accuser_testimony = accuser_testimony;
    }

	public Long getIndictment_id()
    {
        return indictment_id;
    }
    public void setIndictment_id(Long indictment_id)
    {
        this.indictment_id = indictment_id;
    }

	public String getAccuser_province()
    {
        return accuser_province;
    }
    public void setAccuser_province(String accuser_province)
    {
        this.accuser_province = accuser_province;
    }

	public String getAccuser_district()
    {
        return accuser_district;
    }
    public void setAccuser_district(String accuser_district)
    {
        this.accuser_district = accuser_district;
    }

	public String getAccuser_subdistrict()
    {
        return accuser_subdistrict;
    }
    public void setAccuser_subdistrict(String accuser_subdistrict)
    {
        this.accuser_subdistrict = accuser_subdistrict;
    }

	public String getCompare_province()
    {
        return compare_province;
    }
    public void setCompare_province(String compare_province)
    {
        this.compare_province = compare_province;
    }

	public String getCompare_district()
    {
        return compare_district;
    }
    public void setCompare_district(String compare_district)
    {
        this.compare_district = compare_district;
    }

	public String getCompare_subdistrict()
    {
        return compare_subdistrict;
    }
    public void setCompare_subdistrict(String compare_subdistrict)
    {
        this.compare_subdistrict = compare_subdistrict;
    }

	public String getCompare_office()
    {
        return compare_office;
    }
    public void setCompare_office(String compare_office)
    {
        this.compare_office = compare_office;
    }

	public String getTrack_no()
    {
        return track_no;
    }
    public void setTrack_no(String track_no)
    {
        this.track_no = track_no;
    }

	public java.util.Date getCompare_case_date()
    {
        return compare_case_date;
    }
    public void setCompare_case_date(java.util.Date compare_case_date)
    {
        this.compare_case_date = compare_case_date;
    }

	public String getCompare_case_no()
    {
        return compare_case_no;
    }
    public void setCompare_case_no(String compare_case_no)
    {
        this.compare_case_no = compare_case_no;
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