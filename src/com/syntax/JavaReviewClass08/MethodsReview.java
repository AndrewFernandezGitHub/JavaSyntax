package com.syntax.JavaReviewClass08;

public class MethodsReview {
    public void printSmallerDigit(int x, int y){
        if(x<y){
            System.out.println(x+" x is smaller one");
        }else if(y<x){
            System.out.println(y+" Y is smaller one");

        }else{
            System.out.println("Both values are same");
        }
    }

    public static void main(String[] args) {
        MethodsReview obj=new MethodsReview();
        obj.printSmallerDigit(4,9);
    }
}
