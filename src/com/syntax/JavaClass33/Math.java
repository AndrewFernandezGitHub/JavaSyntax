package com.syntax.JavaClass33;

public class Math {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void divide(int a, int b) {
      /*  if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("You are trying to divide by zero");
        }

       */
        try{
            System.out.println(a / b);
        }catch (ArithmeticException are){
            System.out.println("You are trying to divide by zero");
        }catch (NullPointerException npe){
            System.out.println("Please initiliaze the object to avoid this error");
        }
    }
}
