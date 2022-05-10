package com.syntax.Replits;
//create an instance final method that will reverse a string and return that new string
public class Replit168FinalKeyword {
    String myString="hello";
    public final String reverseMyString(){
        return new StringBuilder(myString).reverse().toString();
    }

    public static void main(String[] args) {
        Replit168FinalKeyword replit168FinalKeyword=new Replit168FinalKeyword();
        System.out.println(replit168FinalKeyword.reverseMyString());
    }
}
