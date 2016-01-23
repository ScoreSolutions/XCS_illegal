package com.ko.util;

/*
 * thaicut.java
 *
 * Created on August 12, 2007, 12:22 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



import java.text.BreakIterator;
import java.util.Locale;

/**
 *
 * @author aaa
 */
public class Thaicut {
    
    static final char[] ch = {'ุ','ู','ึ','ั','ํ','ี','๊','้','็','่','๋','ิ','ฺ',
    'ื','์'};
    
	static char newLine13 = 13;
	static char newLine10 = 10;
	
    public static String wordwrap(String target, int maxLength) {
        
        BreakIterator boundary = BreakIterator.getLineInstance(new Locale("th"));
        boundary.setText(target);
        int start = boundary.first();
        int end = boundary.next();
        int lineLength = 0;
        StringBuffer txt = new StringBuffer("");
        while (end != BreakIterator.DONE) {
        	
            String word = target.substring(start,end);
            lineLength = lineLength + wordlen(word);
            if(word.indexOf(Character.toString(newLine13)+Character.toString(newLine10))>0){
            	//ถ้ามีการเคาะ Enter ในข้อความที่ส่งเข้ามา ให้นับคำเพื่อเริ่มบรรทัดใหม่
            	lineLength = 0;
            }
            if (lineLength >= maxLength) {
                txt.append("\n");
                lineLength = wordlen(word);
            }
            txt.append(word);
            start = end;
            end = boundary.next();
        }
        return txt.toString();
    }
    
    public static int wordlen(String str) {
        int len = str.length();
        for (int j = 0; j < str.length(); j++) {
            for (int i = 0; i < ch.length; i++) {
                if(str.charAt(j) == ch[i]){
                    len--;
                    break;
                }
            }
        }
        return len;
    }
}
