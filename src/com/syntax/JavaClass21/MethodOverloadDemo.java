package com.syntax.JavaClass21;

public class MethodOverloadDemo {
    static void add(int num1, int num2) {
        System.out.println("Method1");
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2) {
        System.out.println("Method2");
        System.out.println(num1 + num2);
    }
    static void add(String num1, String num2){
        System.out.println("Method 3");
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        add(10,10);
        add("10","15");
        add(12.09,13.08);

    }
}