package com.syntax.Replits;

public class Replit170FinalKeyword {
    final void Display(boolean myBoolean){
        System.out.println("Final method with boolean parameter");
    }
    final void Display(String myString){
        System.out.println(myString);
    }
    public static void main(String[] args){
        Replit170FinalKeyword replit170FinalKeyword=new Replit170FinalKeyword();
        replit170FinalKeyword.Display(true);
        replit170FinalKeyword.Display("Final method with String parameter");
    }
}
