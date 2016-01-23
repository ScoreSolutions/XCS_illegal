package com.ko.util;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import com.ko.domain.base.BaseApplicationArrestExhibit;

/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class CodeGen {
	public static void main(String args[]){
		 try {
			System.out.println("----method list-----");

			String objectSetName = "aae";
			String objectGetName = "beans[i]";

			//File  file = File();

			Class cls = BaseApplicationArrestExhibit.class;

			Method[] methods=cls.getDeclaredMethods();
			String className=cls.getSimpleName().toLowerCase();
			if( !objectGetName.equals("") )
				className = objectGetName;
			// getter list
			System.out.println("----------getter list------");
			String methodName=null;
			String attr=null;
			String firstChar=null;

			TreeMap methodList = new TreeMap();

			//for( Method method: methods ){
			Method method=null;
			for( int i=0;i<methods.length;i++ ){
				method=methods[i];
				methodName=method.getName();
				if( methodName.startsWith("get") ||  methodName.startsWith("is")){
					if( methodName.startsWith("get"))
						attr=methodName.replaceFirst("get", "");
					if( methodName.startsWith("is"))
						attr=methodName.replaceFirst("is", "");
					firstChar = attr.substring(0, 1).toLowerCase();
					attr= firstChar.concat(attr.substring(1));
					methodList.put(attr, method.getReturnType().getSimpleName()+ " "+attr+" = "+className+"."+methodName+"("+");");
					//System.out.println(method.getReturnType().getSimpleName()+ " "+attr+" = "+className+"."+methodName+"("+");");
				}
			}
			//
			Iterator keys=methodList.keySet().iterator();
			while( keys.hasNext() ){
				System.out.println(methodList.get(keys.next()));
			}
			System.out.println("//----------setter list------");
			// setter list
			String value=null;
			String type=null;
			if( !objectSetName.equals("") )
				className = objectSetName;
			methodList = new TreeMap();
			for( int i=0;i<methods.length;i++ ){
				method=methods[i];
				if( method.getName().startsWith("set") ){
					methodName=method.getName();
					attr=methodName.replaceFirst("set", "");
					//cls.getField();
					firstChar = attr.substring(0, 1).toLowerCase();
					attr= firstChar.concat(attr.substring(1));
					type = cls.getDeclaredField(attr).getType().getSimpleName();
					if( type.equalsIgnoreCase("string") )
						value="\"xxx\"";
					else if( type.equalsIgnoreCase("Integer") )
						value="new Integer(1)";
					else if( type.equalsIgnoreCase("boolean") )
						value="true";
					else
						value=type;
					value= "";
					//value="aae_"+method.getName().substring(3).toLowerCase()+"[i]";
					methodList.put(attr,className+"."+method.getName()+"("+value+");" );
					//System.out.println(className+"."+method.getName()+"("+value+");");
				}
			}
			//
			keys=methodList.keySet().iterator();
			while( keys.hasNext() ){
				System.out.println(methodList.get(keys.next()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
