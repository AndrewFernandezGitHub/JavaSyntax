package com.syntax.JavaClass16;

public class Replace {
    public static void main(String[] args) {
        System.out.println("test");
        String str="123456!@#$$@##@asdnkaASGHJDL";
        System.out.println(str.replaceAll("[0-9]",""));//can replace any numbers
        System.out.println(str.replaceAll("[a-z]","Marcela"));//not capitilized
        System.out.println(str.replaceAll("[A-Z]","Hi"));
        System.out.println(str.replaceAll("[!/]","Q"));//replaces characters
        System.out.println(str.replaceAll("[A-Za-z0-9]","poop"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","poop"));
    }
}
