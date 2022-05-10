package com.syntax.Util;
//method to see if things have numbers in it, will return true if numbers are present and strings dont match
public class StringUtil {
    public static boolean contains(String str, String regex){
        String newStr=str.replaceAll(regex,"");
        return !newStr.equals(str);
    }
}
