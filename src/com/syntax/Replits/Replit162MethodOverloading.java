package com.syntax.Replits;

public class Replit162MethodOverloading {
static void m1(){
    System.out.println("static method without parameter");
}
static void m2(int i){
    System.out.println("static method with a parameter");
}

    public static void main(String[] args) {
        Replit162MethodOverloading obj=new Replit162MethodOverloading();
        obj.m1();//prints out static non parameterized method
        obj.m2(5);//
    }
}
