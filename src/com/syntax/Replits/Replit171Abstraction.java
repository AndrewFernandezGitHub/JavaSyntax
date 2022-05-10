package com.syntax.Replits;

abstract class Replit171Abstraction {
    abstract void m1();
    public abstract void m1(String myString);
}
class R171Main extends Replit171Abstraction{


   public void m1() {
       System.out.println("m1 without parameters");
    }


    public void m1(String myString) {
        System.out.println(myString);
    }

    public static void main(String[] args) {
        R171Main obj=new R171Main();
        obj.m1();
        obj.m1("m1 method with parameter");
    }
}
