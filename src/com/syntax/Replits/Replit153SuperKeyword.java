package com.syntax.Replits;

public class Replit153SuperKeyword {
}
class Parent1 {
    Parent1(){
        System.out.println("This is Parent constructor");
    }
}
class Child1 extends Parent1{
    Child1(){
        super();
    }
}
class R153Test{
    public static void main(String[] args) {
        new Child1();
    }
}