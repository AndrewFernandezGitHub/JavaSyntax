package com.syntax.Replits;
/*
Declare static variable in class level as below and assign its value:
String ss="Welcome To Syntax Technologies"
Access variable in the main method and print it using three ways you learned so far
Hint:
first way: By calling directly
Second way: By using the className
Third way: By creating the object of the class
Expected Output:
Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies
 */
public class Replit124Variables {
    static String ss="Welcome to Syntax Technologies";

    public static void main(String[] args) {
        //first way
        System.out.println(ss);
        //second way
        System.out.println(Replit124Variables.ss);
        //third way
        Replit124Variables m=new Replit124Variables();
        System.out.println(m.ss);
    }
}
