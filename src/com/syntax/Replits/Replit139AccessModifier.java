package com.syntax.Replits;

public class Replit139AccessModifier {
    //test case dont change
    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software")); //"stwr"
        System.out.println(alphabetical("language"));//"lnug"
    }
    public static String alphabetical(String str) {
        String newStr = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if( str.charAt(i)> str.charAt(i + 1)){
                newStr=newStr+str.charAt(i);
            };
        }
        return newStr;
    }
}