package com.syntax.Replits;

abstract class Replit172Abstraction {
    abstract void m1();
    void m2(){
        System.out.println("Parent class providing implementation");
    }
}
class R172Main extends Replit172Abstraction{
     void m1(){
        System.out.println("Child class providing implementation");
    }

    public static void main(String[] args) {
        R172Main obj = new R172Main();
        obj.m1();
        obj.m2();
    }
}