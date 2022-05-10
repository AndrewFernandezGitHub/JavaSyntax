package com.syntax.Replits;

public class Replit152SuperKeyword {
}


    class Parent {
        Parent() {
            System.out.println("Parent Constructor");
        }

        Parent(String city) {
            System.out.println(city);
        }
    }

    class Child extends Parent {
        Child(String city) {
            super(city);
        }
    }
    class R152test{
        public static void main(String[] args) {
            Child obj=new Child("Vienna");
        }
    }
