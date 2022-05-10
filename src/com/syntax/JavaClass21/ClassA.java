package com.syntax.JavaClass21;


public class ClassA {
    void method(){
        System.out.println("method from ClassA");
    }
}
class ClassB extends ClassA{
    void method(){
        System.out.println("B");
    }
    void test(){
        method();//calls the same class method
        this.method();//calls the same class method
        super.method();//calls the same parent method
    }
}
class Tester{
    public static void main(String[] args) {
        ClassB classB=new ClassB();
        classB.method();
    }
}