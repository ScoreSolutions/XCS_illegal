








 

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

import com.ko.domain.RewardDivideAlcohol;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseRewardDivideAlcohol extends BaseDomain{
	// table
	public static final String TABLE_NAME = "REWARD_DIVIDE_ALCOHOL";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "REWARD_DIVIDE_ALCOHOL.ID";

	// short name column
	public static final String IDCARD_NOCol = "IDCARD_NO";
	
	public static final String DUTY_STATUS_IDCol = "DUTY_STATUS_ID";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String DUTY_STATUS05_MONEYCol = "DUTY_STATUS05_MONEY";

	public static final String DUTY_STATUS04_MONEYCol = "DUTY_STATUS04_MONEY";

	public static final String DUTY_STATUS03_MONEYCol = "DUTY_STATUS03_MONEY";

	public static final String DUTY_STATUS02_MONEYCol = "DUTY_STATUS02_MONEY";

	public static final String DUTY_STATUS01_MONEYCol = "DUTY_STATUS01_MONEY";

	public static final String STAFF_LEVELCol = "STAFF_LEVEL";

	public static final String POSITION_NAMECol = "POSITION_NAME";

	public static final String LAST_NAMECol = "LAST_NAME";

	public static final String FIRST_NAMECol = "FIRST_NAME";

	public static final String TITLE_CODECol = "TITLE_CODE";

	public static final String ORDER_SEQCol = "ORDER_SEQ";

	public static final String REWARD_DIVIDE_IDCol = "REWARD_DIVIDE_ID";

	public static final String IDCol = "ID";

    //public static final String IDCARD_NOCol = "IDCARD_NO";


	// full column name
	public static final String IDCARD_NOColumn = "REWARD_DIVIDE_ALCOHOL.IDCARD_NO";
	
	public static final String DUTY_STATUS_IDColumn = "REWARD_DIVIDE_ALCOHOL.DUTY_STATUS_ID";

	public static final String UPDATE_ONColumn = "REWARD_DIVIDE_ALCOHOL.UPDATE_ON";

	public static final String UPDATE_BYColumn = "REWARD_DIVIDE_ALCOHOL.UPDATE_BY";

	public static final String CREATE_ONColumn = "REWARD_DIVIDE_ALCOHOL.CREATE_ON";

	public static final String CREATE_BYColumn = "REWARD_DIVIDE_ALCOHOL.CREATE_BY";

	public static final String DUTY_STATUS05_MONEYColumn = "REWARD_DIVIDE_ALCOHOL.DUTY_STATUS05_MONEY";

	public static final String DUTY_STATUS04_MONEYColumn = "REWARD_DIVIDE_ALCOHOL.DUTY_STATUS04_MONEY";

	public static final String DUTY_STATUS03_MONEYColumn = "REWARD_DIVIDE_ALCOHOL.DUTY_STATUS03_MONEY";

	public static final String DUTY_STATUS02_MONEYColumn = "REWARD_DIVIDE_ALCOHOL.DUTY_STATUS02_MONEY";

	public static final String DUTY_STATUS01_MONEYColumn = "REWARD_DIVIDE_ALCOHOL.DUTY_STATUS01_MONEY";

	public static final String STAFF_LEVELColumn = "REWARD_DIVIDE_ALCOHOL.STAFF_LEVEL";

	public static final String POSITION_NAMEColumn = "REWARD_DIVIDE_ALCOHOL.POSITION_NAME";

	public static final String LAST_NAMEColumn = "REWARD_DIVIDE_ALCOHOL.LAST_NAME";

	public static final String FIRST_NAMEColumn = "REWARD_DIVIDE_ALCOHOL.FIRST_NAME";

	public static final String TITLE_CODEColumn = "REWARD_DIVIDE_ALCOHOL.TITLE_CODE";

	public static final String ORDER_SEQColumn = "REWARD_DIVIDE_ALCOHOL.ORDER_SEQ";

	public static final String REWARD_DIVIDE_IDColumn = "REWARD_DIVIDE_ALCOHOL.REWARD_DIVIDE_ID";

    //public static final String IDCARD_NOColumn = "REWARD_DIVIDE_ALCOHOL.IDCARD_NO";

	public static final String IDColumn = "REWARD_DIVIDE_ALCOHOL.ID";


	public static final String[] ALL_COLUMNS =
    {
	 IDCARD_NOCol, DUTY_STATUS_IDCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, DUTY_STATUS05_MONEYCol	, DUTY_STATUS04_MONEYCol	, DUTY_STATUS03_MONEYCol	, DUTY_STATUS02_MONEYCol	, DUTY_STATUS01_MONEYCol	, STAFF_LEVELCol	, POSITION_NAMECol	, LAST_NAMECol	, FIRST_NAMECol	, TITLE_CODECol	, ORDER_SEQCol	, REWARD_DIVIDE_IDCol , /*IDCARD_NOCol	,*/ pkCol
    };

	public static final String ALL_COLUMN_STRING =  IDCARD_NOCol + ", " + DUTY_STATUS_IDCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ DUTY_STATUS05_MONEYCol	+","+ DUTY_STATUS04_MONEYCol	+","+ DUTY_STATUS03_MONEYCol	+","+ DUTY_STATUS02_MONEYCol	+","+ DUTY_STATUS01_MONEYCol	+","+ STAFF_LEVELCol	+","+ POSITION_NAMECol	+","+ LAST_NAMECol	+","+ FIRST_NAMECol	+","+ TITLE_CODECol	+","+ ORDER_SEQCol	+","+ REWARD_DIVIDE_IDCol+ ","+ /*IDCARD_NOCol	+","+*/ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+DUTY_STATUS_IDCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+DUTY_STATUS05_MONEYCol+"=?,"+DUTY_STATUS04_MONEYCol+"=?,"+DUTY_STATUS03_MONEYCol+"=?,"+DUTY_STATUS02_MONEYCol+"=?,"+DUTY_STATUS01_MONEYCol+"=?,"+STAFF_LEVELCol+"=?,"+POSITION_NAMECol+"=?,"+LAST_NAMECol+"=?,"+FIRST_NAMECol+"=?,"+TITLE_CODECol+"=?,"+ORDER_SEQCol+"=?,"+REWARD_DIVIDE_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseRewardDivideAlcohol(DB db){
		super(db);
	}



public synchronized RewardDivideAlcohol create() throws Exception{
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
					return (RewardDivideAlcohol)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<RewardDivideAlcohol> createList(List<RewardDivideAlcohol> objList)throws Exception{
    	DB db = this.initDB();
    	List<RewardDivideAlcohol> resultList = new ArrayList<RewardDivideAlcohol>();
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
	public RewardDivideAlcohol findByPk(Long id)throws Exception{
		List<RewardDivideAlcohol> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<RewardDivideAlcohol> findByPks(List<Long> ids)throws Exception{
		List<RewardDivideAlcohol> resultList = new ArrayList<RewardDivideAlcohol>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<RewardDivideAlcohol> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<RewardDivideAlcohol> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<RewardDivideAlcohol> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<RewardDivideAlcohol> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<RewardDivideAlcohol> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<RewardDivideAlcohol> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<RewardDivideAlcohol> resultList = new ArrayList<RewardDivideAlcohol>();
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
	public List<RewardDivideAlcohol> findByExample(RewardDivideAlcohol instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<RewardDivideAlcohol> findByExample(RewardDivideAlcohol instance,PageUtil pageUtil) throws Exception{
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
	public RewardDivideAlcohol update()throws Exception{
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
					return (RewardDivideAlcohol)this;
			}else// not update
				return (RewardDivideAlcohol)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<RewardDivideAlcohol> updateList(List<RewardDivideAlcohol> objList)throws Exception{
		DB db = this.initDB();
		List<RewardDivideAlcohol> resultList = new ArrayList<RewardDivideAlcohol>();
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
	public Integer deleteList(List<RewardDivideAlcohol> objList)throws Exception {
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
	public RewardDivideAlcohol populate(ResultSet rs)throws Exception{
		RewardDivideAlcohol result = new RewardDivideAlcohol(this.db);
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
    private String idcard_no;
    
    private Long duty_status_id;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private Double duty_status05_money;

    private Double duty_status04_money;

    private Double duty_status03_money;

    private Double duty_status02_money;

    private Double duty_status01_money;

    private String staff_level;

    private String position_name;

    private String last_name;

    private String first_name;

    private String title_code;

    private Long order_seq;

    private Long reward_divide_id;

    private Long id;

	//**** getter setter ****//
    public String getIdcard_no() {
        return idcard_no;
    }

    public void setIdcard_no(String idcard_no) {
        this.idcard_no = idcard_no;
    }
    
	public Long getDuty_status_id()
    {
        return duty_status_id;
    }
    public void setDuty_status_id(Long duty_status_id)
    {
        this.duty_status_id = duty_status_id;
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

	public Double getDuty_status05_money()
    {
        return duty_status05_money;
    }
    public void setDuty_status05_money(Double duty_status05_money)
    {
        this.duty_status05_money = duty_status05_money;
    }

	public Double getDuty_status04_money()
    {
        return duty_status04_money;
    }
    public void setDuty_status04_money(Double duty_status04_money)
    {
        this.duty_status04_money = duty_status04_money;
    }

	public Double getDuty_status03_money()
    {
        return duty_status03_money;
    }
    public void setDuty_status03_money(Double duty_status03_money)
    {
        this.duty_status03_money = duty_status03_money;
    }

	public Double getDuty_status02_money()
    {
        return duty_status02_money;
    }
    public void setDuty_status02_money(Double duty_status02_money)
    {
        this.duty_status02_money = duty_status02_money;
    }

	public Double getDuty_status01_money()
    {
        return duty_status01_money;
    }
    public void setDuty_status01_money(Double duty_status01_money)
    {
        this.duty_status01_money = duty_status01_money;
    }

	public String getStaff_level()
    {
        return staff_level;
    }
    public void setStaff_level(String staff_level)
    {
        this.staff_level = staff_level;
    }

	public String getPosition_name()
    {
        return position_name;
    }
    public void setPosition_name(String position_name)
    {
        this.position_name = position_name;
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

	public Long getOrder_seq()
    {
        return order_seq;
    }
    public void setOrder_seq(Long order_seq)
    {
        this.order_seq = order_seq;
    }

	public Long getReward_divide_id()
    {
        return reward_divide_id;
    }
    public void setReward_divide_id(Long reward_divide_id)
    {
        this.reward_divide_id = reward_divide_id;
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