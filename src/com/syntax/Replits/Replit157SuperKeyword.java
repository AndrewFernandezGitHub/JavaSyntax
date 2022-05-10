package com.syntax.Replits;

public class Replit157SuperKeyword {
}
class R157Super{
    public static void main(String[] args) {
        Child157 obj=new Child157();
        obj.m2();
    }
}
class Parent157 {
    void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child157 extends Parent157{
    void m1(){
        System.out.println("m1 method in child class");
    }
    void m2(){
        this.m1();
        super.m1();
    }
}
