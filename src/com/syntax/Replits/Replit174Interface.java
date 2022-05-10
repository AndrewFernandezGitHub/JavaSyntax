package com.syntax.Replits;

public interface Replit174Interface {
    void method1();
    void method2();
}
class R174Interface implements Replit174Interface{
    @Override
    public void method1() {
        System.out.println("implementation of method 1 ");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method 2");
    }

    public static void main(String[] args) {
        R174Interface obj=new R174Interface();
        obj.method1();
        obj.method2();
    }
}