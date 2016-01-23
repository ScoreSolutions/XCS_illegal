package com.ko.webapp.action;

import java.lang.reflect.Array;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import javax.sql.rowset.serial.SerialBlob;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.log4j.Logger;

import com.ko.Constants;
import com.ko.domain.TranLog;
import com.ko.domain.ErrorLog;
import com.ko.domain.base.BaseDomain;
import com.ko.util.ConfigUtil;
import com.ko.util.DB;
import com.ko.util.DateUtil;
import com.ko.util.NumberUtil;
import com.ko.webapp.bean.UserSession;
import com.ko.webapp.util.FormHandler;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.RequestUtil;


/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public abstract class BaseAction{
	public static Logger log = Logger.getLogger(Constants.LOG_NAME);

    public FormHandler formHandler;
	public PageUtil pageUtil;
	public Date create_on;
	public Date update_on;
	public Long create_by;
	public Long update_by;
	public String offcode;
	public String posname;
	public String poscode;
	public String offname;
	public String create_by_name;
	private HttpServletRequest request;
	private HttpServletResponse response;
	protected DB db;
	public UserSession uData = new UserSession();
	public BaseAction(){
		//System.out.println("Contruct BaseAction");
	}
	// use in future
	public void setHttpServlet(HttpServletRequest request, HttpServletResponse response,DB db)throws Exception{
		//System.out.println("Call setHttpServlet");
		this.request = request;
		this.response = response;
		this.pageUtil = new PageUtil(request);
		this.formHandler = new FormHandler(request);
		
		this.create_on = DateUtil.getCurrentDate();
		this.update_on = this.create_on;
		this.create_by = 0L;// get_from session
		this.update_by = 0L;// get_from session
		this.offcode = "";
		this.poscode = "";
		this.offname = "";
		this.posname = "";
		this.create_by_name =""; 
		
		//this.action = getClass().getSimpleName().replaceFirst("Action","");
		if( request.getSession().getAttribute(Constants.USER_SESSION) != null ){
			this.uData = (UserSession)request.getSession().getAttribute(Constants.USER_SESSION);
			this.offcode= this.uData.getOffcode();
			this.offname= this.uData.getOffname();
			this.poscode= this.uData.getPoscode();
			this.posname= this.uData.getPosname();
			this.create_by_name= this.uData.getFullName();
			this.create_by = new Long(this.uData.getIdCard());
			this.update_by = new Long(this.uData.getIdCard());
		}
		
		this.db = db;
		if( request.getMethod().equalsIgnoreCase("post") ||  request.getMethod().equalsIgnoreCase("get") )
			saveFormData();
	}
	// bind form via setter method
	public void bindForm(Object pojoForm)throws Exception{
		String propertyName = null;
		String propertyValue = null;
		Map<String,Object> keyValue = getFormData();
		final String SEP = ":";
		try {
			/*
			// Check that we have a file upload request
			if( ServletFileUpload.isMultipartContent(new ServletRequestContext(request)) ){// is file upload form
				log.debug(" Process File Upload Form ");
				//Create a factory for disk-based file items
				FileItemFactory factory = new DiskFileItemFactory();

				// Create a new file upload handler
				ServletFileUpload upload = new ServletFileUpload(factory);
				//	Set overall request size constraint
				upload.setSizeMax(Constants.MAX_FILE_SIZE);

				// Parse the request
				List items = upload.parseRequest(request);

				// Process the uploaded items
				Iterator iter = items.iterator();
				while (iter.hasNext()) {
					try {
						FileItem item = (FileItem) iter.next();
					    // 1) get Property
						if (item.isFormField()) {// Process a regular form field
					    	propertyName = item.getFieldName();
					    	propertyValue = item.getString("UTF-8");
					    	if( !keyValue.containsKey(propertyName) ){
					    		List<String> valuesList = new ArrayList<String>();
								valuesList.add(propertyValue);
					    		keyValue.put(propertyName,valuesList);
					    	}else{// is array
					    		List<String> valueList = (List<String>)keyValue.get(propertyName);
					    		valueList.add(propertyValue);
					    		keyValue.put(propertyName, valueList);
					    	}
					    } else {// file
					    	propertyName = item.getFieldName();
					    	if( !keyValue.containsKey(propertyName) ){
					    		List<Blob> valuesList = new ArrayList<Blob>();
								valuesList.add(new SerialBlob(item.get()));
					    		keyValue.put(propertyName,valuesList);
					    	}else{// is array
					    		List<Blob> valueList = (List<Blob>)keyValue.get(propertyName);
					    		valueList.add(new SerialBlob(item.get()));
					    		keyValue.put(propertyName, valueList);
					    	}
					    	//String fileName = item.getName();
					    	//String contentType = item.getContentType();
					    	//boolean isInMemory = item.isInMemory();
					    	//long sizeInBytes = item.getSize();
							
							//String uploadDir = request.getRealPath("/file_uploads/");
					    	//File uploadedFile = new File(uploadDir + Constants.FILE_SEP  + fileName);
					    	//item.write(uploadedFile);

					    	//---2 process stream
					    	// use stream to process another
					    	//InputStream uploadedStream = item.getInputStream();
					        //uploadedStream.close();

					        // Process a file upload in memory
					        //byte[] data = item.get();
					        //Blob blob = new SerialBlob(data);
					    }
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}else{// not file upload form
				log.debug(" Process Not File Upload Form ");
				Enumeration paramNames = request.getParameterNames();
				while(paramNames.hasMoreElements()){
					propertyName = (String)paramNames.nextElement();
					String propertyValues [] = request.getParameterValues(propertyName);
					for (int i = 0; i < propertyValues.length; i++) {
						if( !keyValue.containsKey(propertyName) ){
							List<String> valuesList = new ArrayList<String>();
							valuesList.add(propertyValues[i]);
				    		keyValue.put(propertyName, valuesList);
				    	}else{// is array
				    		List<String> valueList = (List<String>)keyValue.get(propertyName);
				    		valueList.add(propertyValues[i]);
				    		keyValue.put(propertyName, valueList);
				    	}
					}
				}
			}*/

			// 2) process bind value to formObject
			Object targetObj = null;
			String targetAttr = null;
			String pojoAttr = null;
			Iterator<String> keys = keyValue.keySet().iterator();
		    while( keys.hasNext() ){
		    	try{
					//String propertyValues[] = (String[])((List<String>)keyValue.get(propertyName)).toArray(new String[0]);
		    		propertyName = keys.next();
			    	log.debug("name --->"+propertyName);
			    	//System.out.println(keyValue.get(propertyName));
		    		Object propertyValues[] = ((List)keyValue.get(propertyName)).toArray();
			    	if( propertyName.indexOf(SEP)>0 )
			    		pojoAttr = propertyName.substring(0,propertyName.indexOf(SEP));
			    	else
			    		pojoAttr = propertyName;
			    	
		    		if( PropertyUtils.isReadable(pojoForm,pojoAttr) ){// isExist on pojoForm
						
		    			if( PropertyUtils.getPropertyType(pojoForm, pojoAttr).isArray() ){// array
		    				log.debug("array");
		    				targetObj = pojoForm;
							targetAttr = pojoAttr;
							/*if( propertyName.indexOf(SEP)>0 ){
								targetAttr = propertyName.substring(0,propertyName.indexOf(SEP));
								pojoAttr = propertyName.substring(0,propertyName.indexOf(SEP));
								//targetAttr = propertyName.substring(propertyName.indexOf(SEP)+1);
								Class arrayType = PropertyUtils.getPropertyType(pojoForm, pojoAttr).getComponentType();// get array type
								targetObj = PropertyUtils.getProperty(pojoForm, pojoAttr);// call by getter method
								if( targetObj == null ){ // new array instance
									targetObj = Array.newInstance(arrayType, propertyValues.length );
									PropertyUtils.setProperty(pojoForm, pojoAttr , targetObj);
								}
							}*/
							
							if( ClassUtils.getAllSuperclasses(PropertyUtils.getPropertyType(targetObj, targetAttr).getComponentType()).contains(BaseDomain.class)  ){// check isDomain
								if( PropertyUtils.getProperty(targetObj, targetAttr) == null ){// initial array object
									Class arrayType = PropertyUtils.getPropertyType(pojoForm, pojoAttr).getComponentType();// get array type
									PropertyUtils.setProperty(targetObj, targetAttr , Array.newInstance(arrayType, propertyValues.length ));
									Object[] objArray = (Object[])PropertyUtils.getProperty(targetObj, targetAttr);
									for(int i=0;i<objArray.length;i++ ){
										Object obj = ConstructorUtils.invokeConstructor(PropertyUtils.getPropertyType(pojoForm, targetAttr).getComponentType(),this.db);
										objArray[i] = obj;
									}
								}
								Object[] objArray = (Object[])PropertyUtils.getProperty(targetObj, targetAttr);
								targetAttr = propertyName.substring(propertyName.indexOf(SEP)+1);
								for(int i=0;i<objArray.length;i++ ){
									this.bindValueToObject(targetAttr , (String)propertyValues[i], objArray[i]);
								}
							}else if( PropertyUtils.getPropertyType(targetObj, targetAttr).getComponentType().equals(Blob.class) ){// check blob
								PropertyUtils.setProperty(targetObj, targetAttr, new SerialBlob[propertyValues.length]);
								Object[] objArray = (Object[])PropertyUtils.getProperty(targetObj, targetAttr);
								for (int i = 0; i < propertyValues.length; i++){
									objArray[i] = propertyValues[i];
								}
							}else{//String
								//1) initial array
								//if( propertyValue == null ){
									Class arrayType = PropertyUtils.getPropertyType(targetObj, targetAttr).getComponentType();
									PropertyUtils.setProperty(targetObj, targetAttr, Array.newInstance(arrayType, propertyValues.length ));
								//}
								Object[] objArray = (Object[])PropertyUtils.getProperty(targetObj, targetAttr);
								for (int i = 0; i < propertyValues.length; i++){
									/*if( objArray[i] == null )
										objArray[i] = arrayType.newInstance();*/
									// convert string to anyType
									//objArray[i] = arrayType.cast(propertyValues[i]);
									//this.bindValueToObject(propertyName, propertyValues[i], objArray[i]);
									objArray[i] = this.stringToObject((String)propertyValues[i], arrayType);
								}
							}
						}else{// not array
							log.debug("not array");
							//System.out.println(PropertyUtils.getPropertyType(pojoForm, propertyName));
							targetObj = pojoForm;
							targetAttr = propertyName;
							// process nested attribute
							if( propertyName.indexOf(SEP)>0 ){
								//String pojoAttr = propertyName.substring(0,propertyName.indexOf(SEP));
								targetAttr = propertyName.substring(propertyName.indexOf(SEP)+1);
								targetObj = PropertyUtils.getProperty(pojoForm, pojoAttr);// call by getter method
								
								if( targetObj == null ){ // new instance
									if( ClassUtils.getAllSuperclasses(PropertyUtils.getPropertyType(pojoForm, pojoAttr)).contains(BaseDomain.class) )
										targetObj = ConstructorUtils.invokeConstructor(PropertyUtils.getPropertyType(pojoForm, pojoAttr),this.db);
									else
										targetObj = PropertyUtils.getPropertyType(pojoForm, pojoAttr).newInstance();
									PropertyUtils.setProperty(pojoForm, pojoAttr, targetObj);
								}
							}
							if( PropertyUtils.getPropertyType(targetObj, targetAttr).equals(Blob.class) ){
								BeanUtils.setProperty(targetObj,targetAttr,propertyValues[0]);
							}else{
								//	propertyValue = PropertyUtils.getProperty(pojoForm, propertyName);
								//	new instance
								//if( propertyValue == null ){
									//Object objValue = PropertyUtils.getPropertyType(pojoForm, propertyName).newInstance();
									//PropertyUtils.setProperty(pojoForm, propertyName , objValue);
								//}
								this.bindValueToObject(targetAttr , (String)propertyValues[0], targetObj);
							}
						}
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
		    }// end while
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//throw new BindException(e.getMessage(),e);
			throw e;
		}
		log.debug("\n------bind form value------");
		log.debug(pojoForm);
		log.debug("\n------end bind form value------");
	}
	public void bindForm(Object object,String key){
		// ควร new object จากด้านใน คือ object นี้เป็น default constructor
		// <input type="text" name="user.id"  value="${user.id}"/>
		// <input type="text" name="user.name"  value="${user.name}"/>
		// bind variable
		// example
		// User user =null;
		// bindForm(user,"user");
		// user.create();
		// ---------------
		// User users[];
		// bindForm(users,"user");
		// sysout(users.length);
	}
	private void bindValueToObject(String property,String value,Object pojoForm)throws Exception{
		Class propertyType = null;
		Object objValue = null;
		try{
			if( !property.equals("action") && !property.equals("cmd") ){// filter
				// get type and check for exist
				propertyType = PropertyUtils.getPropertyType(pojoForm, property);
				if( propertyType != null ){// have property in bean
					if( value!= null ){
						objValue = this.stringToObject(value, propertyType);
						BeanUtils.setProperty(pojoForm,property,objValue);// use to call setXXX(Type xx);
						// do not user PropertyUtils.setProperty(xxx);
					}
				}
			}
		}catch (Exception e) {
			//e.printStackTrace();
		}
	}
	private Object stringToObject(String value , Class propertyType)throws Exception{
		Object objValue = null;
		if( !value.trim().equals("") ){
			if( propertyType.equals(String.class) ){// String
				objValue = (String)value;
			}else if( propertyType.equals(Long.class) ){// Long
				objValue = new Long(value.trim());
				//objValue = NumberUtil.getLongFromString(value.trim());//use in future
			}else if( propertyType.equals(Integer.class) ){// Integer
				objValue = new Integer(value.trim());
				//objValue = NumberUtil.getIntegerFromString(value.trim());//use in future
			}else if( propertyType.equals(Double.class) ){// Double
				objValue = new Double(value.trim());
				//objValue = NumberUtil.getDoubleFromString(value.trim());//use in future
			}else if( propertyType.equals(Character.class) ){// Character
				objValue = value.trim().charAt(0);
			}else if( propertyType.equals(Date.class) ){// Date
				objValue = DateUtil.getDateFromString(value.trim());
			}else if( propertyType.equals(Boolean.class) ){// Boolean
				objValue = new Boolean(value.trim());
			}/*else if( propertyType.equals(Blob.class) ){// Blob
				//byte[] b = value.getBytes();
				//System.out.println(b.length);
				//System.out.println("first:"+(char)b[0]+",last:"+(char)b[b.length-1]);
				System.out.println(value);
				Blob blob = new SerialBlob(value.getBytes());
				//objValue = new SerialBlob(value.getBytes());
				objValue = new SerialBlob(fileByte);
			}*/else
				objValue = null;
		}else{// String "" || "   ";
			if( propertyType.equals(String.class) ){// String
				objValue = (String)value;
			}else
				objValue = null;
		}
		return objValue;
	}
	
	/*public void bindAndValidate(Object pojoForm,HttpServletRequest request){
		// Spring
		public void validate(Object obj, Errors errors) {
        	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "required", "Field is required.");
        	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "required", "Field is required.");
    	}
		
		// common validator
		//ValidatorUtils.getValueAsString(new User(), property); // use to get value from object as string
		GenericValidator.isBlankOrNull(value);
		GenericValidator.isDate(value, locale);	
		GenericValidator.isEmail(value);
		GenericValidator.isInRange(value, min, max);
		GenericValidator.isUrl(value);
		GenericValidator.isCreditCard(value);
		GenericValidator.isShort(value);
	}*/

	/*public void bindAndValidate(BaseDomain pojoForm,HttpServletRequest request)throws Exception{
		// 1.1) binding to object
		Field[] fields=ReflectionUtil.getAllFields(pojoForm);
		Object value = null;
		Class fieldType=null;
		for( int i=0;i<fields.length;i++ ){
			value = request.getParameter(fields[i].getName());
			if( value !=null && !value.equals("") ){
				fieldType = fields[i].getType();
				try{
					if( fieldType.equals(Date.class) ){
						//logger.debug("binding :"+(String)value);
						value = DateUtil.convertStringToDate((String)value);
					}else if( fieldType.equals(Long.class) ){
						value = new Long((String)value);
					}else{//String,Interger,Byte
						//logger.debug("value ="+value);
						value = fields[i].getType().cast(value);
					}
					BeanUtils.setProperty(pojoForm, fields[i].getName(),value);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		// 1.2)set form data
		//this.formHandler.setFormData();

		// 2.1)validate
		//FormValidator validator = pojoForm.validate();

		// 2.2) set form error
		//this.form.setFieldErrors(fieldErrors);
	}*/
	public void forward(String url,HttpServletRequest request, HttpServletResponse response)throws Exception{
		RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
	}
	
	public void forward(String url)throws Exception{
		RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
	}
	public void redirect(String url,HttpServletRequest request,HttpServletResponse response)throws Exception{
		response.sendRedirect(url);
	}
	
	public void redirect(String url)throws Exception{
		response.sendRedirect(url);
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
	
	public String getRealPath(String path){
		return request.getSession().getServletContext().getRealPath(path);
	}
	
	public void writeTranLog(String tran_desc)throws Exception{
		DB db = new DB();
		TranLog tranLog = new TranLog(db);
		tranLog.setBrowser(RequestUtil.getBrowser(request));
		tranLog.setIp_address(RequestUtil.getIpAddress(request));
		tranLog.setTran_desc(tran_desc);
		
		//tranLog.setUserid(RequestUtil.getUserSession(request).getIdCard().toString());
		tranLog.setUserid(Long.toString(create_by));
		tranLog.setTran_date(new Date());
		tranLog.setSessionid(request.getSession().getId());
		tranLog.setLoging_his_id(uData.getLogin_his_id());
		tranLog.create();
		db.closedb();
	}
	public void SaveErrorLog(String errDesc)throws Exception{
		DB db = new DB();
		ErrorLog err= new ErrorLog(db);
		err.setUserid(uData.getUserId().toString());
		err.setError_date(new Date());
		err.setIp_address(RequestUtil.getIpAddress(request));
		err.setSessionid(request.getSession().getId());
		err.setBrowser(RequestUtil.getBrowser(request));
		err.setError_desc(errDesc);
		err.create();
		db.closedb();
	}
	
	public void clearForm(){
		formHandler.setFormData(new HashMap<String, Object>());
	}
	
	private void saveFormData()throws Exception{
		String propertyName = null;
		String propertyValue = null;
		Map<String,Object> keyValue = new HashMap<String,Object>();
		try {
			// Check that we have a file upload request
			if( ServletFileUpload.isMultipartContent(new ServletRequestContext(request)) ){// is file upload form
				log.debug(" Process File Upload Form ");
				//Create a factory for disk-based file items
				FileItemFactory factory = new DiskFileItemFactory();

				// Create a new file upload handler
				ServletFileUpload upload = new ServletFileUpload(factory);
				//	Set overall request size constraint
				//upload.setSizeMax(ConfigUtil.getImageSize(db));
                upload.setSizeMax(Integer.MAX_VALUE);

				// Parse the request
				List/* FileItem */ items = upload.parseRequest(request);

				// Process the uploaded items
				Iterator iter = items.iterator();
				while (iter.hasNext()) {
					try {
						FileItem item = (FileItem) iter.next();
					    // 1) get Property
						if (item.isFormField()) {// Process a regular form field
					    	propertyName = item.getFieldName();
					    	propertyValue = item.getString("UTF-8");
					    	if( !keyValue.containsKey(propertyName) ){
					    		List<String> valuesList = new ArrayList<String>();
								valuesList.add(propertyValue);
					    		keyValue.put(propertyName,valuesList);
					    	}else{// is array
					    		List<String> valueList = (List<String>)keyValue.get(propertyName);
					    		valueList.add(propertyValue);
					    		keyValue.put(propertyName, valueList);
					    	}
					    } else {// file
					    	propertyName = item.getFieldName();
					    	if( !keyValue.containsKey(propertyName) ){
					    		List<Blob> valuesList = new ArrayList<Blob>();
								valuesList.add(new SerialBlob(item.get()));
					    		keyValue.put(propertyName,valuesList);
					    	}else{// is array
					    		List<Blob> valueList = (List<Blob>)keyValue.get(propertyName);
					    		valueList.add(new SerialBlob(item.get()));
					    		keyValue.put(propertyName, valueList);
					    	}
					    	/*String fileName = item.getName();
					    	String contentType = item.getContentType();
					    	boolean isInMemory = item.isInMemory();
					    	long sizeInBytes = item.getSize();*/
							/*
							String uploadDir = request.getRealPath("/file_uploads/");
					    	File uploadedFile = new File(uploadDir + Constants.FILE_SEP  + fileName);
					    	item.write(uploadedFile);*/

					    	//---2 process stream
					    	// use stream to process another
					    	//InputStream uploadedStream = item.getInputStream();
					        //uploadedStream.close();

					        // Process a file upload in memory
					        /*byte[] data = item.get();
					        Blob blob = new SerialBlob(data);*/
					    }
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}else{// not file upload form
				log.debug(" Process Not File Upload Form ");
				Enumeration paramNames = request.getParameterNames();
				while(paramNames.hasMoreElements()){
					propertyName = (String)paramNames.nextElement();
					String propertyValues [] = request.getParameterValues(propertyName);
					for (int i = 0; i < propertyValues.length; i++) {
						if( !keyValue.containsKey(propertyName) ){
							List<String> valuesList = new ArrayList<String>();
							valuesList.add(propertyValues[i]);
				    		keyValue.put(propertyName, valuesList);
				    	}else{// is array
				    		List<String> valueList = (List<String>)keyValue.get(propertyName);
				    		valueList.add(propertyValues[i]);
				    		keyValue.put(propertyName, valueList);
				    	}
					}
				}
			}
		}catch (SizeLimitExceededException ex) {
		    ex.printStackTrace();
			/* The size of the HTTP request body exceeds the limit */
			//throw ex;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//throw new BindException(e.getMessage(),e);
			//throw e;
		}
		this.formHandler.setFormData(keyValue);
	}
	private Map<String, Object> getFormData(){
		return this.formHandler.getFormData();
	}
	public abstract void _default(HttpServletRequest request, HttpServletResponse response)throws Exception;
	//public abstract FormValidator validate();
}