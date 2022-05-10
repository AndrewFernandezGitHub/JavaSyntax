package com.syntax.JavaClass20;

public class Parent {
    private String name;//private doesnt participate inheritence
    int age;
    protected  double weight;
    public String color;
}
class Child extends Parent{
    void printInfo(){
        //System.out.println(name);//private class, not accessible
        System.out.println(age);//accessible
        System.out.println(weight);
        System.out.println(color);
    }
}