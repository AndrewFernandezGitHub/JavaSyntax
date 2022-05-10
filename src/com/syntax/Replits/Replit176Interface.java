package com.syntax.Replits;

public interface Replit176Interface {
}
interface ParentInterface176{
    void parentMethod();
}
interface  ChildInterface176 extends ParentInterface176{
    void childMethod();
}
class R176Interface implements ChildInterface176{

    @Override
    public void parentMethod() {
        System.out.println("Parent Method-Welcome to java!!");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-Hello child!!");
    }

    public static void main(String[] args) {
        R176Interface obj=new R176Interface();
        obj.childMethod();
        obj.parentMethod();
    }
}
