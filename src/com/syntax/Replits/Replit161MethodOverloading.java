package com.syntax.Replits;


public class Replit161MethodOverloading {
    private void m1(){
        System.out.println("Private method 1 statement");
    }
    private void m1(int i){
        System.out.println("Private method 1 with single parameter");
    }

    public static void main(String[] args) {
       Replit161MethodOverloading obj=new Replit161MethodOverloading();
       obj.m1();//prints non parameter method
       obj.m1(1);//prints parameter method
    }
}
