package com.syntax.Replits;

public class Replit163MethodOverriding {
    void method(){
        System.out.println("Parent Method");
    }
}
class Replit163Child{
    void method2(){
        System.out.println("Child method");
    }
}
class R163Tester{
    public static void main(String[] args) {
        Replit163MethodOverriding obj=new Replit163MethodOverriding();
        Replit163Child obj1=new Replit163Child();
        obj.method();
        obj1.method2();
    }
}

