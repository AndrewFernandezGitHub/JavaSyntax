package com.syntax.Replits;

public class Replit154SuperKeyword {

    }
    class Parent2 {
        Parent2() {
            System.out.println("Parent Constructor without argument");
        }

        Parent2(int number) {
            System.out.println(number);
        }
    }

    class Child2 extends Parent2 {
        Child2() {
            System.out.println("Child Constructor without argument");
        }

        Child2(int num) {
            super(num);
        }
    }
    class r154Test{
        public static void main(String[] args) {
            new Child2();
            new Child2(10);
        }
    }
