package com.syntax.JavaClass20;
//Write a Student class   that have instance variables name and address.
// Create a constructor that will initialize those variables. Print name &
// address of given  student using displayInfo method.
public class Task3 {
    String name;
    String address;
    public Task3(String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(this.name+" "+this.address);
    }
}
