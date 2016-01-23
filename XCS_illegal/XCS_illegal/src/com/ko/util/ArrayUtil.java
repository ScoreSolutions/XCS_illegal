package com.ko.util;
/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class ArrayUtil {
	public static Object[] Merger(Object[] pa, Object[] pb) {
		int aLength = (pa!=null)?pa.length:0;
		int bLength = (pb!=null)?pb.length:0;
		Object [] arr = new Object[aLength + bLength];
		for (int x=0; x < aLength; x++) {
			arr[x] = pa[x];
		}
		for (int x=0; x < bLength; x++) {
			arr[x+aLength] = pb[x];
		}
		return arr;
	}
	public static boolean contains(String[] array, String value) {
        boolean isIncluded = false;

        if (array == null || value == null) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
                isIncluded = true;
                break;
            }
        }
        return isIncluded;
    }
	public static Object[] buildArray(Object value,int size){
		Object[] objs = new Object[size];
		for( int i=0;i<size;i++ )
			objs[i] = value;
		return objs;
	}
	public static void printArray(Object[] arrays){
		if( arrays!=null ){
			for( int i=0;i<arrays.length;i++ ){
				if( arrays[i]!=null )
					System.out.println(arrays[i].toString());
				else
					System.out.println(arrays[i]);
			}
		}
	}
	public static Object[] objectToArray(Object obj){
		return ( obj !=null )?new Object[]{obj}:null;
	}
	public static String toString(Object[] arrays){
		String str="[";
		if( arrays!=null ){
			for( int i=0;i<arrays.length;i++ ){
				if( arrays[i]!=null ){
					if( i != arrays.length-1 )
						str+=arrays[i].toString()+",";
					else
						str+=arrays[i].toString();
				}
			}
		}
		return str+"]";
	}
	public static String toString(int arrays[]){
		Object []objs = new Object[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			objs[i] = arrays[i];
		}
		return toString(objs);
	}
	public static String toString(long arrays[]){
		Object []objs = new Object[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			objs[i] = arrays[i];
		}
		return toString(objs);
	}
	public static String toString(double arrays[]){
		Object []objs = new Object[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			objs[i] = arrays[i];
		}
		return toString(objs);
	}
	public static String[] toStringArray(Object[] objs){
		if( objs!=null ){
			String[] result = new String[objs.length];
			for (int i = 0; i < objs.length; i++) {
				result[i] = String.valueOf(objs[i]);
			}
			return result;
		}else
			return new String[0];
	}
	public static void main(String[] args) {
		//String a= null;
		System.out.println(toString(new int[]{1,2,3}));
	}
}
