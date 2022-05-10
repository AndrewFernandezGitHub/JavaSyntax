package com.syntax.JavaClass16;
//create a string that will hold a sentence.write program to get a new string
//without any spaces
public class StringSentence {
    public static void main(String[] args) {
        String s="This is a sentence";
        String newStr=s.replace(" ","");
        System.out.println(newStr);
    }
}
