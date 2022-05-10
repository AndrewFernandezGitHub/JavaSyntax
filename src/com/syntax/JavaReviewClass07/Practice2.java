package com.syntax.JavaReviewClass07;

public class Practice2 {
    //writing method in the class to return record
    String getRecord(){
        String department="QA";
        String empName="Andrew";
        String details="Worker "+empName+" belongs to "+department;
        System.out.println(details);
        return details;
    }

    public static void main(String[] args) {
        //creating an object of class
        Practice2 p=new Practice2();
        p.getRecord();
    }
}
