package com.syntax.JavaClass24;

public class ToStringDemo {
    String name;
    int age;
    ToStringDemo(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo=new ToStringDemo("Marcela",30);
        System.out.println(toStringDemo.toString());
    }


}
