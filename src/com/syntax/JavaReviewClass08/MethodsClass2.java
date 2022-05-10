package com.syntax.JavaReviewClass08;

public class MethodsClass2 {
    String generateUsername(String firstName, String lastName){
        return firstName+"123"+lastName+".com";
    }

    public static void main(String[] args) {
        MethodsClass2 obj=new MethodsClass2();
        System.out.println(obj.generateUsername("Andrew","Marcela"));

    }
}
