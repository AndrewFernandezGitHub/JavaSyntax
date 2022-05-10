package com.syntax.JavaClass19;

public class Human {


    String name;
    int age;
    double weight;
    char gender;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Important Code");
        System.out.println("Important code 2");
    }
    public Human(String name, int age, double weight) {
        this(name,age);

    }
    public Human(String name, int age, double weight, char gender) {
        this(name,age,weight);

        this.gender = gender;
        System.out.println("Important Code");
        System.out.println("Important code 2");
    }
}
