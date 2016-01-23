package com.ko.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.commons.beanutils.MethodUtils;


/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class ReflectionUtil {
	public ReflectionUtil(){}
	public static Field getField(Object obj,String name){
		Field field = null;
		try {
			field = obj.getClass().getDeclaredField(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return field;
	}
	/*public static Method getMethod(Object obj,String name){
		Method method = null;
		try {
			method = obj.getClass().getMethod(obj,);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return method;
	}*/
	public static Field[] getAllFields(Object obj){
		return getAllFields(obj.getClass());
	}
	public static Field[] getAllFields(Class clz){
		Field[] fields =null;
		try {
			fields = clz.getDeclaredFields();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fields;
	}
	public static Method[] getAllMethods(Class clz){
		Method[] methods =null;
		try {
			methods = clz.getDeclaredMethods();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return methods;
	}

	/*public static void invokeMethod(Class clz,String methodName,Class... parameterTypes){
		Method method =null;
		try {
			Object obj = clz.newInstance();
			method = clz.getDeclaredMethod(methodName, parameterTypes);
			method.invoke(obj, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	public static Object invokeMethodNoArgumentInObject(Object obj,String methodName)throws Exception{
		if( isMethodInObject(obj,methodName)  )
			return MethodUtils.invokeExactMethod(obj, methodName, null);
		else
			return null;
	}
	public static Object invokeMethodWithArgument(Object obj,String methodName,Object[] args)throws Exception{
		if( isMethodInObject(obj,methodName)  )
			return MethodUtils.invokeMethod(obj, methodName, args);
		else
			return null;
	}
	public static boolean isMethodInObject(Object obj,String method){
		Method[] methods = getAllMethods(obj.getClass());
		for( int i=0;i<methods.length;i++ ){
			if( methods[i].getName().equalsIgnoreCase(method) )
				return true;
		}
		return false;
	}
	/*public static String getMethodInObject(String methodName,Object obj){
		Method[] methods = getAllMethods(obj.getClass());
		for( int i=0;i<methods.length;i++ ){
			if( methods[i].getName().equalsIgnoreCase(methodName) )
				return methods[i].getName();
		}
		return null;
	}*/
	public static Object getClassInstance(String className)throws Exception{
		Object obj = null;
		try {
			obj = Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		return obj;
	}

	///////////  Property in bean  ///////////
	public static void setProperty(Object target,String propertyName,Object value){

	}

	public static void copyAllProperty(Object source,Object target){

	}

	public static void test(){
		System.out.println("test xx");
	}
	public static void main(String[] args) throws Exception{
		//System.out.println(getAllFields(ReflectionUtil.class).length);
		//System.out.println(getAllMethods(ReflectionUtil.class).length);
		//invokeMethod(ReflectionUtil.class,"test",null);
		/*ReflectionUtil rf=new ReflectionUtil();

		try {
			//MethodUtils.invokeExactMethod(rf,"test", null);
			Field[] fs= rf.getAllFields(new User().getClass());
			for( int i=0;i<fs.length;i++)
				System.out.println(fs[i].getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*
		User user = new User();
		System.out.println(ReflectionUtil.getField(user, "user_login").getType());
		*/
	}
}
