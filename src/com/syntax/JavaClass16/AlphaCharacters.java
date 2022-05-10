package com.syntax.JavaClass16;
//how to find alpha numeric characters present in a string
public class AlphaCharacters {
    public static void main(String[] args) {
        String s="1234!@#$ABCDE";
        System.out.println(s.replaceAll("[^A-Za-z0-9]","").length());
        System.out.println(s.length());
        System.out.println(s.replaceAll("[^A-Za-z0-9@#]","").length());//how to remove characters but leave some
    }
}
