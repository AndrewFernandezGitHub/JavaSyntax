package com.syntax.JavaClass20;
//Write Book class that will have instance variables and 2 Constructors.
// While creating an object make sure:
        //Instance variables are being initialized
        //Both Constructors are being executed

public class Task4 {
    String bookName;
    double price;

    public Task4(){
        System.out.println("No argument constructor");
    }
    public Task4(String bookName,double price){
        this();
        this.bookName=bookName;
        this.price=price;
        //this(); has to be in first line to work
        System.out.println(("two argument constructor"));
    }
}
