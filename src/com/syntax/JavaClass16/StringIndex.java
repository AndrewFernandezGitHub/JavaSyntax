package com.syntax.JavaClass16;

public class StringIndex {

    public static void main(String[] args) {
        System.out.println("Hello Intellij");
        String str = "Andrew hello #590494904";

        System.out.println(str.charAt(0));//charAt can find the index
        System.out.println(str.charAt(3));//charAt index will track a space also if there
        System.out.println(str.length());//index always starts at 0
        System.out.println(str.charAt(str.length() - 1));//how to get the last value in the string
        System.out.println(str.indexOf('A'));//case sensitive
        System.out.println(str.indexOf('a'));//-1 means not found in string
        System.out.println(str.lastIndexOf('r'));
        System.out.println(str.indexOf("#"));
        System.out.println(str.substring(str.indexOf("#") + 1));
        System.out.println(str.substring(str.indexOf("#") + 1, str.indexOf("#") + 1 + 9));
        System.out.println(str.substring(12, 14));
        System.out.println(str.substring(str.indexOf("#") + 1, str.indexOf("#") + 1 + 9));

    }
}