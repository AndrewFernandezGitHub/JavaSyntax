package com.syntax.JavaClass21;

public class MethodOverload2 {
    static void printInfo(String name, int age, double weight) {
        System.out.println("Method1");
        System.out.println(name + " " + age + " " + weight);
    }

    static void printInfo(int age, String name,double weight) {
        System.out.println("Method2");
        System.out.println(name + " " + age + " " + weight);
    }

    static void printInfo( int age, double weight, String name) {
        System.out.println("Method3");
        System.out.println(name + " " + age + " " + weight);
    }

    static void printInfo(double weight, int age, String name) {
        System.out.println("Method4");
        System.out.println(name + " " + age + " " + weight);
    }

    public static void main(String[] args) {
        MethodOverload2 methodOverloaDemo=new MethodOverload2();
        methodOverloaDemo.printInfo(12,"andrew",16);
        methodOverloaDemo.printInfo("Marcela",12,30.09);
        methodOverloaDemo.printInfo(14.09,16,"Matt");
        methodOverloaDemo.printInfo(12,90.09,"Marcela2");
    }
}